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
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.Category;
import org.eclipse.bpmn2.CategoryValue;
import org.eclipse.bpmn2.Collaboration;
import org.eclipse.bpmn2.ConditionalEventDefinition;
import org.eclipse.bpmn2.ConversationLink;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.bpmn2.Documentation;
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.Import;
import org.eclipse.bpmn2.ItemDefinition;
import org.eclipse.bpmn2.Lane;
import org.eclipse.bpmn2.LaneSet;
import org.eclipse.bpmn2.Participant;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.RootElement;
import org.eclipse.bpmn2.ScriptTask;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.util.NamespaceHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.ClassNotFoundException;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xml.type.SimpleAnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Tests serialization as XML.
 * @author Henning Heitkoetter
 *
 */
public class XMLSerializationTest extends Bpmn2SerializationTest {
    protected Definitions model;

    /**
     * Prepares a test run by initializing all fields.
     * 
     * A basic BPMN2 model is created in {@link #model}, thereby initializing the BPMN2 package.
     */
    @Before
    public void setUpModel() {
        model = TestHelper.initBasicModel("urn:tns1");
    }

    /**
     * The extension for all files that are created.
     * @return File extension, i.e. {@code "bpmn2"}.
     */
    @Override
    protected String getFileExtension() {
        return EXTENSION_BPMN2_XML;
    }

    @Override
    protected String getSubDirectory() {
        return "xml";
    }

    /**
     * Checks if serialization works at all.
     * @throws Exception
     */
    @Test
    public void testBasicSerialization() throws Exception {
        Resource res = saveAndLoadModel("basic", model);

        assertTrue("Resource loaded with errors", res.getErrors().isEmpty());

        checkBasicSerialization(res);
    }

    /**
     * Performs the actual checks if the basic serialization succeeded.
     * 
     * Can be overriden by subclasses.
     * @param res
     */
    protected void checkBasicSerialization(Resource res) {
        EObject root = res.getContents().get(0);
        if (root instanceof DocumentRoot) {
            DocumentRoot docRoot = (DocumentRoot) root;
            assertTrue("Namespace prefix bpmn2 not present", docRoot.getXMLNSPrefixMap()
                    .containsKey(Bpmn2Package.eNS_PREFIX));
            String NS_URI_EXPECTED = Bpmn2Package.eNS_URI.endsWith("-XMI") ? NamespaceHelper
                    .xmiToXsdNamespaceUri(Bpmn2Package.eNS_URI) : Bpmn2Package.eNS_URI;
            assertEquals("Namespace URI of prefix bpmn2", NS_URI_EXPECTED, docRoot
                    .getXMLNSPrefixMap().get(Bpmn2Package.eNS_PREFIX));
            assertNotNull("No definitions object in doc root", docRoot.getDefinitions());
        } else
            fail("Root element is not DocumentRoot");
    }

    /**
     * Tests if an ID is generated upon save if necessary.
     * @throws Exception
     */
    @Test
    public void testIdSerialization() throws Exception {
        Collaboration c = Bpmn2Factory.eINSTANCE.createCollaboration();
        c.setName("collab1");
        Process p = Bpmn2Factory.eINSTANCE.createProcess();
        p.setDefinitionalCollaborationRef(c);
        model.getRootElements().add(c);
        model.getRootElements().add(p);
        Resource res = saveAndLoadModel("idOK", model);

        Definitions d = TestHelper.getRootDefinitionElement(res);
        // Technically, only collab1 needs to have an ID, because it is referenced by another element
        for (RootElement cur : d.getRootElements())
            if (cur instanceof Collaboration && ((Collaboration) cur).getName().equals("collab1")) {
                assertNotNull(
                        "No id generated for element \"collab1\", although it is referenced by another element",
                        cur.getId());
                break;
            }
    }

    /**
     * Asserts that no ID is generated for elements that don't have a corresponding feature.
     * @throws IOException 
     */
    @Test
    public void testNoIDForImport() throws IOException {
        model.getImports().add(Bpmn2Factory.eINSTANCE.createImport());
        try {
            saveAndLoadModel("noIDForImport", model);
        } catch (WrappedException e) {
            if (e.exception() instanceof FeatureNotFoundException) {
                FeatureNotFoundException fnfe = ((FeatureNotFoundException) e.exception());
                if (fnfe.getName().equals("id")) {
                    fail("ID was generated for an import element (Import does not have an ID feature)");
                }
            } else
                throw e;
        }
    }

    @Test
    public void testIDAlreadySet() throws Exception {
        model.setId("id1");
        Resource res = null;
        try {
            res = saveAndLoadModel("idAlreadySet", model);
        } catch (WrappedException e) {
            if (e.exception() instanceof SAXParseException)
                fail("Duplicate attribute 'id'.");
            else
                throw e;
        }
        assertEquals("id1", TestHelper.getRootDefinitionElement(res).getId());
    }

    @Test
    public void testDocumentationText() throws Exception {
        final String docId = "doc1";
        final String docText = "Documentation text";

        Process p = Bpmn2Factory.eINSTANCE.createProcess();
        p.setName("Name");
        Documentation doc = Bpmn2Factory.eINSTANCE.createDocumentation();
        doc.setText(docText);
        doc.setId(docId);
        p.getDocumentation().add(doc);
        model.getRootElements().add(p);
        Resource res = saveAndLoadModel("documentationText", model);

        EObject docLoaded = res.getEObject(docId);
        assertTrue(docLoaded instanceof Documentation);
        assertEquals(docText, ((Documentation) docLoaded).getText());

        checkSerializationDocText(res);
    }

    protected void checkSerializationDocText(Resource res) throws SAXException, IOException,
            ParserConfigurationException {
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        Document xml = fact.newDocumentBuilder().parse(new File(res.getURI().toFileString()));
        Node docNode = xml.getElementsByTagName("bpmn2:documentation").item(0);
        assertNull("Documentation has an attribute 'text' (invalid acc. to XML schema)", docNode
                .getAttributes().getNamedItem("text"));
    }

    @Test
    public void testScript() throws Exception {
        final String scriptId = "st1";
        final String scriptContent = "Script content";

        Process p = Bpmn2Factory.eINSTANCE.createProcess();
        p.setName("Name");
        ScriptTask st = Bpmn2Factory.eINSTANCE.createScriptTask();
        st.setId(scriptId);
        st.setName("Name");
        st.setScript(scriptContent);
        st.setScriptFormat("Script format");
        p.getFlowElements().add(st);
        model.getRootElements().add(p);

        Resource res = saveAndLoadModel("scriptContent", model);
        EObject stLoaded = res.getEObject(scriptId);
        assertTrue(stLoaded instanceof ScriptTask);
        assertEquals(scriptContent, ((ScriptTask) stLoaded).getScript());

        checkSerializationScriptContent(res);
    }

    protected void checkSerializationScriptContent(Resource res) throws SAXException, IOException,
            ParserConfigurationException {
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        Document xml = fact.newDocumentBuilder().parse(new File(res.getURI().toFileString()));
        Node scriptNode = xml.getElementsByTagName("bpmn2:scriptTask").item(0);
        assertNull("ScriptTask has an attribute 'script' (invalid acc. to XML schema)", scriptNode
                .getAttributes().getNamedItem("script"));
    }

    @Test
    public void testFormalExpressionBody() throws Exception {
        final String feId = "fe1";
        final String feBody = "${script}";

        ConditionalEventDefinition ced = Bpmn2Factory.eINSTANCE.createConditionalEventDefinition();
        FormalExpression fe = Bpmn2Factory.eINSTANCE.createFormalExpression();
        fe.setBody(feBody);
        fe.setId(feId);
        ced.setCondition(fe);
        model.getRootElements().add(ced);
        Resource res = saveAndLoadModel("formalExpBody", model);

        EObject docLoaded = res.getEObject(feId);
        assertTrue(docLoaded instanceof FormalExpression);
        assertEquals(feBody, ((FormalExpression) docLoaded).getBody());

        checkSerializationFormalExpBody(res);
    }

    protected void checkSerializationFormalExpBody(Resource res) throws SAXException, IOException,
            ParserConfigurationException {
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        Document xml = fact.newDocumentBuilder().parse(new File(res.getURI().toFileString()));
        Node docNode = xml.getElementsByTagName("bpmn2:condition").item(0);
        assertNull("FormalExpression has an attribute 'body' (invalid acc. to XML schema)", docNode
                .getAttributes().getNamedItem("body"));
    }

    @Test
    public void testItemDefinitionXSD() throws Exception {
        /*
         * TODO: This test FAILS currently (XSD&XMI).
         * XSD-EMF does not support lookup by ID - wrong element (whole schema) resolved.
         * We need to handle this to not lose the original reference.
         */
        testItemDefinition("res/DataDefinitions.xsd", "http://www.example.org/Messages",
                "reqForQuot", "xsd");
    }

    @Test
    public void testItemDefinitionBPMN() throws Exception {
        // should resolve to Definitions element
        testItemDefinition("res/basic.bpmn2", "urn:basic", "_DqjcgKCwEd-AVfJ3FSSMwg", "bpmn");
    }

    @Test
    public void testItemDefinitionElement() throws Exception {
        // does not exist, should be handled gracefully
        testItemDefinition("test.abc", "urn:test", "id", "element");
    }

    /**
     * Tests the structureRef feature of ItemDefinition.
     * 
     * @param location Location of the file in which the structure element is located.
     * @param namespace Namespace for the import element pointing to the file.
     * @param id ID of the structure.
     * @param name Name of the test, used in the filename of the resource.
     * @throws Exception
     */
    public void testItemDefinition(String location, String namespace, String id, String name)
            throws Exception {
        Import xsdImport = Bpmn2Factory.eINSTANCE.createImport();
        xsdImport.setNamespace(namespace);
        xsdImport.setLocation("../../" + location); // Relative to resource during test run.
        model.getImports().add(xsdImport);

        ItemDefinition xsdItem = Bpmn2Factory.eINSTANCE.createItemDefinition();
        final String xsdItemId = "xsdItemID";
        xsdItem.setId(xsdItemId);
        InternalEObject value = new DynamicEObjectImpl();
        final URI uri = URI.createURI(location + "#" + id);
        value.eSetProxyURI(uri);
        xsdItem.setStructureRef(value);
        model.getRootElements().add(xsdItem);

        Resource res = saveAndLoadModel("itemDef_" + name, model);

        ItemDefinition xsdItemNew = (ItemDefinition) res.getEObject(xsdItemId);
        checkStructureRef(uri, xsdItemNew);
    }

    /**
     * Checks if the structureRef feature of itemDef points (after resolution) to the given URI.
     * @param uriExpected The expected URI.
     * @param itemDef The Item Definition.
     */
    protected void checkStructureRef(final URI uriExpected, ItemDefinition itemDef) {
        final InternalEObject xsdStructure = (InternalEObject) itemDef.getStructureRef();
        assertNotNull(xsdStructure);
        if (xsdStructure.eIsProxy())
            assertTrue(String.format("Proxy and expected URI differ (expected: %s, actual: %s)",
                    uriExpected, xsdStructure.eProxyURI()), xsdStructure.eProxyURI().toString()
                    .endsWith(uriExpected.toString()));
        else {
            final Resource res = xsdStructure.eResource();
            URI actual = res.getURI().appendFragment(res.getURIFragment(xsdStructure));
            assertTrue(String.format("Actual and expected URI differ (expected: %s, actual: %s)",
                    uriExpected, actual), actual.toString().endsWith(uriExpected.toString()));
        }
    }

    @Test
    public void testOppositeReferenceCategoryValue() throws Exception {
        Category cat = Bpmn2Factory.eINSTANCE.createCategory();
        CategoryValue catValue = Bpmn2Factory.eINSTANCE.createCategoryValue();
        cat.getCategoryValue().add(catValue);
        model.getRootElements().add(cat);

        Process proc = Bpmn2Factory.eINSTANCE.createProcess();
        Task task = Bpmn2Factory.eINSTANCE.createTask();
        proc.getFlowElements().add(task);
        model.getRootElements().add(proc);

        task.getCategoryValueRef().add(catValue);
        saveAndLoadModel("oppositeRefCategoryValue", model);

        List<FlowElement> result = null;
        try {
            result = catValue.getCategorizedFlowElements();
        } catch (UnsupportedOperationException e) {
            fail("getCategorizedFlowElements not implemented");
        }
        assertTrue("Task not found in list", result.contains(task));
    }

    @Test
    public void testOppositeReferenceInteractionNode() throws Exception {
        Collaboration collab = Bpmn2Factory.eINSTANCE.createCollaboration();
        Participant part1 = Bpmn2Factory.eINSTANCE.createParticipant();
        collab.getParticipants().add(part1);
        Participant part2 = Bpmn2Factory.eINSTANCE.createParticipant();
        collab.getParticipants().add(part2);
        model.getRootElements().add(collab);

        ConversationLink link1 = Bpmn2Factory.eINSTANCE.createConversationLink();
        link1.setSourceRef(part1);
        link1.setTargetRef(part2);
        collab.getConversationLinks().add(link1);

        ConversationLink link2 = Bpmn2Factory.eINSTANCE.createConversationLink();
        link2.setTargetRef(part1);
        link2.setSourceRef(part2);
        collab.getConversationLinks().add(link2);

        saveAndLoadModel("oppositeRefInteractionNode", model);

        try {
            List<ConversationLink> tmp = part1.getIncomingConversationLinks();
            assertTrue(tmp.size() == 1 && tmp.contains(link2));
            tmp = part1.getOutgoingConversationLinks();
            assertTrue(tmp.size() == 1 && tmp.contains(link1));

            tmp = part2.getIncomingConversationLinks();
            assertTrue(tmp.size() == 1 && tmp.contains(link1));
            tmp = part2.getOutgoingConversationLinks();
            assertTrue(tmp.size() == 1 && tmp.contains(link2));
        } catch (UnsupportedOperationException e) {
            fail("getIncoming/OutgoingConversationLinks not implemented");
        }
    }

    @Test
    public void testIDReferenceToAbstractType() throws Exception {
        Process p = Bpmn2Factory.eINSTANCE.createProcess();
        model.getRootElements().add(p);
        Task t = Bpmn2Factory.eINSTANCE.createTask();
        p.getFlowElements().add(t);
        LaneSet ls = Bpmn2Factory.eINSTANCE.createLaneSet();
        p.getLaneSets().add(ls);
        Lane l = Bpmn2Factory.eINSTANCE.createLane();
        String laneId = "laneId";
        l.setId(laneId);
        ls.getLanes().add(l);

        l.getFlowNodeRefs().add(t);

        try {
            Resource res = saveAndLoadModel("idRefToAbstract", model);
            Lane lNew = (Lane) res.getEObject(laneId);
            assertTrue(lNew.getFlowNodeRefs().size() > 0);
            assertFalse(lNew.getFlowNodeRefs().get(0).eIsProxy());
            assertEquals(t.getId(), lNew.getFlowNodeRefs().get(0).getId());
        } catch (WrappedException e) {
            if (e.exception() instanceof ClassNotFoundException)
                fail("Class EventDefinition was recognized as abstract.");
            else
                throw e;
        } catch (IllegalArgumentException e) {
            // different error in Eclipse 3.4
            if (e.getMessage().endsWith("not a valid classifier"))
                fail("Class EventDefinition was recognized as abstract.");
            else
                throw e;
        }
    }
}
