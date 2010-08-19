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

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.util.Bpmn2XMIResourceFactoryImpl;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * Tests serialization as XMI.
 * 
 * Runs the same tests as {@link XMLSerializationTest}, but saves them in XMI format. The test methods
 * are inherited and, where necessary, adapted.
 * @author Henning Heitkoetter
 *
 */
public class XMISerializationTest extends XMLSerializationTest {
    private static final String EXTENSION_XMI = "bpmn2xmi";

    /**
     * Overrides the superclass method, instead registering the default XMI resource factory. 
     */
    @Override
    public void setUpResourceFactoryRegistry() {
        if (!EMFPlugin.IS_ECLIPSE_RUNNING)
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(EXTENSION_XMI,
                    new Bpmn2XMIResourceFactoryImpl());
    }

    /**
     * @return {@code xmi}
     */
    @Override
    protected String getFileExtension() {
        return EXTENSION_XMI;
    }

    @Override
    protected void checkBasicSerialization(Resource res) {
        assertTrue("Resource is not XMI", res instanceof XMIResource);
        assertTrue("Resource loaded with errors", res.getErrors().isEmpty());
        assertTrue("Root element is not Definitions",
                res.getContents().get(0) instanceof Definitions);
        String NS_URI_EXPECTED = Bpmn2Package.eNS_URI.endsWith("-XMI") ? Bpmn2Package.eNS_URI
                : Bpmn2Package.eNS_URI.concat("-XMI");
        try {
            assertTrue(String.format("Namespace uri (%s) not found in result", NS_URI_EXPECTED),
                    TestHelper.search(res.getURI(), NS_URI_EXPECTED));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void testIdSerialization() throws Exception {
        // Success (no IDs needed in XMI)
    }

    /**
     * Checks the XMI serialization of the Documentation element.
     * 
     * It should not contain text or CDATA content, as this is already handled
     * through the text attribute.
     */
    @Override
    protected void checkSerializationDocText(Resource res) throws SAXException, IOException,
            ParserConfigurationException {
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        Document xml = fact.newDocumentBuilder().parse(new File(res.getURI().toFileString()));
        Node docNode = xml.getElementsByTagName("documentation").item(0);

        for (int i = 0; i < docNode.getChildNodes().getLength(); i++) {
            short nodeType = docNode.getChildNodes().item(i).getNodeType();
            assertFalse("Documentation has text content (not valid in XMI)",
                    Node.TEXT_NODE == nodeType);
            assertFalse("Documentation has CDATA content (not valid in XMI)",
                    Node.CDATA_SECTION_NODE == nodeType);
        }
    }
}
