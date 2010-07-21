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
import org.eclipse.bpmn2.Definitions;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

/**
 * Tests serialization as XMI.
 * @author Henning Heitkoetter
 *
 */
public class BasicXMISerializationTest extends BasicSerializationTest {

    /**
     * Expected namespace URI ({@code .../MODEL-XMI}).
     */
    protected final String NS_URI_EXPECTED = Bpmn2Package.eNS_URI.endsWith("-XMI") ? Bpmn2Package.eNS_URI
            : Bpmn2Package.eNS_URI.concat("-XMI");

    private final URI fileURI = URI.createFileURI("tmp/TestXMI.xmi");

    @Override
    protected URI getFileURI() {
        return fileURI;
    }

    @Override
    protected ResourceSet createResourceSet() {
        ResourceSet result = new ResourceSetImpl();
        if (!EMFPlugin.IS_ECLIPSE_RUNNING)
            result.getResourceFactoryRegistry().getExtensionToFactoryMap()
                    .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
        return result;
    }

    /**
     * Tries to load the BPMN XMI file.
     * @throws Exception
     */
    @Test
    public void testLoadXMI() throws Exception {
        ResourceSet rs = createResourceSet();
        Resource res = rs.getResource(getFileURI(), true);

        assertTrue("Resource is not XMI", res instanceof XMIResource);
        assertTrue("Resource loaded with errors", res.getErrors().isEmpty());
        assertTrue("Root element is not Definitions",
                res.getContents().get(0) instanceof Definitions);
        assertTrue(String.format("Namespace uri (%s) not found in result", NS_URI_EXPECTED),
                TestHelper.search(getFileURI(), NS_URI_EXPECTED));
    }
}
