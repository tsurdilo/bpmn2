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

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.eclipse.bpmn2.impl.Bpmn2FactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.After;
import org.junit.Before;

/**
 * Abstract base class for testing serialization.
 * @author Henning Heitkoetter
 *
 */
public abstract class BasicSerializationTest {

    public BasicSerializationTest() {
        super();
    }

    /**
     * Return the URI of the file that is to be created.
     * @return File URI.
     */
    protected abstract URI getFileURI();

    /**
     * Create and initialize the ResourceSet.
     * @return
     */
    protected abstract ResourceSet createResourceSet();

    /**
     * Creates a BPMN resource via the {@link #createResourceSet() resource set}
     * and saves it under the {@link #getFileURI() specified URI}. The BPMN model
     * consists of a single Definitions object with no attributes set.
     * 
     * The BPMN package is initialized during creation.
     * @throws IOException
     */
    @Before
    public void createFile() throws IOException {
        ResourceSet rs = createResourceSet();
        Resource res = rs.createResource(getFileURI());

        res.getContents().add(Bpmn2FactoryImpl.eINSTANCE.createDefinitions());

        res.save(null);
    }

    /**
     * Cleans the test directory by moving the results to another directory.
     * @throws IOException
     */
    @After
    public void moveFile() throws IOException {
        File f = new File(getFileURI().toString());
        if (f.exists()) {
            File dest = new File("lastResult/" + f.getName()/*String.format("result/%tQ/", new Date())*/);
            dest.delete();
            f.renameTo(dest);
        }
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

}