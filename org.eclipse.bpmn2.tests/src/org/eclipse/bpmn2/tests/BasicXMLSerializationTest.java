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

import static org.junit.Assert.*;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl;
import org.eclipse.bpmn2.util.NamespaceHelper;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.junit.Test;

/**
 * Tests serialization conforming to the BPMN XML schema.
 * @author Henning Heitkoetter
 *
 */
public class BasicXMLSerializationTest extends BasicSerializationTest {

    /**
     * Expected namespace URI ({@code .../MODEL}).
     */
    protected final String NS_URI_EXPECTED = Bpmn2Package.eNS_URI.endsWith("-XMI") ? NamespaceHelper
            .xmiToXsdNamespaceUri(Bpmn2Package.eNS_URI) : Bpmn2Package.eNS_URI;

    private final URI fileURI = URI.createFileURI("tmp/TestXML.bpmn2");

    @Override
    protected URI getFileURI() {
        return fileURI;
    }

    @Override
    protected ResourceSet createResourceSet() {
        ResourceSet rs = new ResourceSetImpl();
        if (!EMFPlugin.IS_ECLIPSE_RUNNING)
            rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
                    .put("bpmn2", new Bpmn2ResourceFactoryImpl());
        return rs;
    }

    /**
     * Tries to load the BPMN XML file.
     * @throws Exception
     */
    @Test
    public void testLoadXML() throws Exception {
        ResourceSet rs = createResourceSet();
        Resource res = null;
        try {
            res = rs.getResource(getFileURI(), true);
        } catch (WrappedException e) {
            if (e.exception() instanceof PackageNotFoundException)
                fail(String.format("Package %s not registered",
                        ((PackageNotFoundException) e.exception()).uri()));
            else
                throw e;
        }
        assertTrue("Resource loaded with errors", res.getErrors().isEmpty());

        EObject root = res.getContents().get(0);
        if (root instanceof DocumentRoot) {
            DocumentRoot docRoot = (DocumentRoot) root;
            assertTrue("Namespace prefix bpmn2 not present", docRoot.getXMLNSPrefixMap()
                    .containsKey(Bpmn2Package.eNS_PREFIX));
            assertEquals("Namespace URI of prefix bpmn2", NS_URI_EXPECTED, docRoot
                    .getXMLNSPrefixMap().get(Bpmn2Package.eNS_PREFIX));
            assertNotNull("No definitions object in doc root", docRoot.getDefinitions());
        } else
            fail("Root element is not DocumentRoot");
    }
}
