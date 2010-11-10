/**
 * Copyright (c) 2010 Henning Heitkoetter.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Henning Heitkoetter - initial API and implementation
 */
package org.eclipse.bpmn2.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;

/**
 * Helper class for tests.
 * @author Henning Heitkoetter
 *
 */
public class TestHelper {

    private static final String DEST_FOLDER_NAME = "lastResults";
    private static final String DATE_AND_TIME = String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS",
            new Date());

    /**
     * Cleans the test directory by moving all files from the list to another directory.
     * @param fileUris List of URIs of the files.
     * @throws IOException
     */
    public static void moveFiles(List<URI> fileUris) throws IOException {
        for (URI cur : fileUris)
            moveFile(cur);
    }

    /**
     * Cleans the test directory by moving the specified file to another directory.
     * @param fileURI URI of the file.
     * @param destFolder The target directory.
     * @throws IOException
     */
    public static void moveFile(URI fileURI) throws IOException {
        File f = new File(fileURI.toFileString());
        if (f.exists()) {
            File dest = calculateDestination(f);
            if (!dest.exists() || dest.delete()) {
                File parentDir = dest.getParentFile();
                if (parentDir.exists() || parentDir.mkdirs())
                    if (f.renameTo(dest))
                        return;
            }
            if (f.delete())
                System.out
                        .println("Test output could not be moved to folder 'lastResults' and has been deleted: "
                                + f.getName());
            else
                System.out.println("Test output could not be cleaned from folder 'tmp': "
                        + f.getName());
        } else
            System.out.println("Test output was not found:" + f.getName());
    }

    /**
     * Calculates the location the given file should be moved to during test clean up.
     * This replaces the first element of the relative path of file
     * with the archive folder name and a date-and-time-identifier.
     * 
     * Example: <...>tmp/qname/file.bpmn2 => <...>lastResults/201011101100/qname/file.bpmn2
     * @param file The file to move.
     * @return The location (path+filename) to which <code>file</code> should be moved.
     * @throws IOException
     */
    protected static File calculateDestination(File file) throws IOException {
        String[] relPath = URI.createFileURI(file.getCanonicalPath())
                .deresolve(URI.createFileURI(new File(DEST_FOLDER_NAME).getCanonicalPath()))
                .segments();
        String[] destPath = new String[relPath.length + 1];
        // Replace tmp by "lastResults", <Date and Time>
        System.arraycopy(relPath, 1, destPath, 2, relPath.length - 1);
        destPath[0] = DEST_FOLDER_NAME;
        destPath[1] = DATE_AND_TIME;
        return new File(URI.createHierarchicalURI(destPath, null, null).toFileString());
    }

    /**
     * Searches for the specified String within the specified file.
     * @param fileURI URI of the file.
     * @param toFind String to find.
     * @return {@code true}, if the contents of the file include {@code toFind}.
     * @throws IOException
     */
    public static boolean search(URI fileURI, String toFind) throws IOException {
        File file = new File(fileURI.toString());
        byte[] buffer = new byte[(int) file.length()];
        BufferedInputStream f = new BufferedInputStream(new FileInputStream(file));
        f.read(buffer);
        f.close();
        return new String(buffer).indexOf(toFind) != -1;
    }

    /**
     * Loads the resource from the specified URI.
     * @param fileUri The URI of the file.
     * @return The resource.
     */
    protected static Resource getResource(URI fileUri) {
        try {
            return new ResourceSetImpl().getResource(fileUri, true);
        } catch (WrappedException e) {
            if (e.exception() instanceof PackageNotFoundException)
                fail(String.format("Package %s not registered",
                        ((PackageNotFoundException) e.exception()).uri()));
            else
                throw e;
        }
        return null; // never reached.
    }

    /**
     * Creates a resource with the specified name, sets its content and saves it.
     * 
     * @param fileUri Filename, without folder and extension.
     * @param content Designated content of the resource.
     * @throws IOException
     */
    protected static void createResourceWithContent(URI fileUri, EObject content)
            throws IOException {
        Resource res = new ResourceSetImpl().createResource(fileUri);
        assertNotNull("No resource factory registered for " + fileUri, res);
        res.getContents().add(content);
        res.save(null);
    }

    /**
     * Creates a resource for each URI-content combination in the map, sets its respective content
     * and saves it.
     * 
     * @param uriToContentMap A list of pairs of URI and EObject to save under that URI.
     * @throws IOException
     */
    protected static void createResourcesWithContent(Map<URI, EObject> uriToContentMap)
            throws IOException {
        ResourceSet resSet = new ResourceSetImpl();
        Resource curRes;

        for (Entry<URI, EObject> curEntry : uriToContentMap.entrySet()) {
            curRes = resSet.createResource(curEntry.getKey());
            assertNotNull("No resource factory registered for " + curEntry.getKey(), curRes);
            curRes.getContents().add(curEntry.getValue());
        }

        for (Resource cur : resSet.getResources())
            cur.save(null);
    }

    /**
     * Retrieves the root definition element from a resource.
     * @param res A BPMN2 resource.
     * @return The root definition element representing the model contained in the resource.
     */
    protected static Definitions getRootDefinitionElement(Resource res) {
        EObject root = res.getContents().get(0);
        if (root instanceof DocumentRoot)
            return ((DocumentRoot) root).getDefinitions();
        return (Definitions) root;
    }

    /**
     * Creates and initializes a basic model consisting of a Definitions element with the specified
     * target namespace and the following attributes set: name, exporter, exporter version. 
     * @param targetNamespace The namespace to use as target namespace.
     * @return A Definitions object representing a basic BPMN2 model.
     */
    protected static Definitions initBasicModel(String targetNamespace) {
        Definitions result = Bpmn2Factory.eINSTANCE.createDefinitions();
        result.setExporter("org.eclipse.bpmn2");
        result.setExporterVersion("0.7.0");
        result.setName("Model name");
        result.setTargetNamespace(targetNamespace);
        return result;
    }

}
