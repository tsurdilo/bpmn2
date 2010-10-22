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
package org.eclipse.bpmn2.tests.isolated;

import static org.junit.Assert.fail;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.junit.Test;

/**
 * Tests if models serialized as XML or XMI can be loaded within Eclipse
 * even if the package has not been accessed before. This ensures that all
 * packages are correctly registered through plugin.xml.
 * 
 * These tests are only meaningful as plugin tests. Standalone the packages
 * have to be registered manually anyway and are accessed during registration.
 * 
 * The test has to be run in isolation, as the initialization of a package can
 * not be undone.
 * 
 * @author Henning Heitkoetter
 *
 */
public class LoadXMLPluginTest {

    @Test
    public void testLoad() throws Exception {
        if (!EMFPlugin.IS_ECLIPSE_RUNNING)
            return;

        try {
            new ResourceSetImpl().getResource(URI.createFileURI(getFilename()), true);
        } catch (WrappedException e) {
            if (e.exception() instanceof PackageNotFoundException)
                fail("Package not found during load.");
            throw e;
        }
    }

    /**
     * @return
     */
    protected String getFilename() {
        return "res/basic.bpmn2";
    }
}
