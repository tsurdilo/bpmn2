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
import java.util.List;

import org.eclipse.emf.common.util.URI;

/**
 * Helper class for tests.
 * @author Henning Heitkoetter
 *
 */
public class TestHelper {

    /**
     * Cleans the test directory by moving all files from the list to another directory.
     * @param fileUris List of URIs of the files.
     * @throws IOException
     */
    public static void moveFiles(List<URI> fileUris) throws IOException {
        File destFolder = new File("lastResult");
        if (!destFolder.exists())
            if (!destFolder.mkdir())
                System.out.println("Folder 'lastResult' does not exist and could not be created.");

        for (URI cur : fileUris)
            moveFile(cur, destFolder);
    }

    /**
     * Cleans the test directory by moving the specified file to another directory.
     * @param fileURI URI of the file.
     * @param destFolder The target directory.
     * @throws IOException
     */
    public static void moveFile(URI fileURI, File destFolder) throws IOException {
        File f = new File(fileURI.toString());
        if (f.exists()) {

            File dest = new File(destFolder, f.getName()/*String.format("result/%tQ/", new Date())*/);
            if (!dest.exists() || dest.delete()) {
                if (f.renameTo(dest))
                    return;
            }
            if (f.delete())
                System.out
                        .println("Test output could not be moved to folder 'lastResult' and has been deleted: "
                                + f.getName());
            else
                System.out.println("Test output could not be cleaned from folder 'tmp': "
                        + f.getName());
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
