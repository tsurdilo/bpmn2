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
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Collaboration;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.Import;
import org.eclipse.bpmn2.LinkEventDefinition;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.StartEvent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.ClassNotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * Tests our QName (de)resolution mechanism both for intra- and inter-model references.
 * 
 * This test uses XML serialization (no QNames in XMI).
 * @author Henning Heitkoetter
 *
 */
public class QNameReferenceTest extends Bpmn2SerializationTest {
    protected Definitions A_model, B_model;
    protected Collaboration A_collab, B_collab;
    protected Process A_process, B_process;
    protected Resource A_resource, B_resource;

    @Before
    public void setUpModels() {
        A_model = TestHelper.initBasicModel("urn:modelA");
        B_model = TestHelper.initBasicModel("urn:modelB");
        A_collab = Bpmn2Factory.eINSTANCE.createCollaboration();
        A_model.getRootElements().add(A_collab);
        A_process = Bpmn2Factory.eINSTANCE.createProcess();
        A_model.getRootElements().add(A_process);
        B_collab = Bpmn2Factory.eINSTANCE.createCollaboration();
        B_model.getRootElements().add(B_collab);
        B_process = Bpmn2Factory.eINSTANCE.createProcess();
        B_model.getRootElements().add(B_process);
    }

    @Override
    protected String getFileExtension() {
        return EXTENSION_BPMN2_XML;
    }

    /**
     * Saves both models (A and B). Creates a import element in A pointing to B.
     * Loads the created resources into {@link #A_resource} and {@link #B_resource}, respectively.
     *  
     * @param name Part of the file name that is used to identify different tests.
     * @throws IOException
     */
    protected void saveAndLoadModels(String name) throws IOException {
        Map<URI, EObject> uriToContentMap = new LinkedHashMap<URI, EObject>();
        URI A_fileUri = URI.createFileURI("tmp/qname_" + name + "_A." + getFileExtension());
        URI B_fileUri = URI.createFileURI("tmp/qname_" + name + "_B." + getFileExtension());
        uriToContentMap.put(A_fileUri, A_model);
        uriToContentMap.put(B_fileUri, B_model);

        Import importBintoA = Bpmn2Factory.eINSTANCE.createImport();
        importBintoA.setImportType("http://www.omg.org/spec/BPMN/20100524/MODEL");
        importBintoA.setLocation(B_fileUri.toString());
        importBintoA.setNamespace("urn:modelB");
        A_model.getImports().add(importBintoA);

        TestHelper.createResourcesWithContent(uriToContentMap);
        createdFiles.add(A_fileUri);
        createdFiles.add(B_fileUri);

        A_resource = TestHelper.getResource(A_fileUri);
        B_resource = TestHelper.getResource(B_fileUri);
    }

    /**
     * Asserts that obj can be resolved and resolves to expected.
     * @param message Message if obj is a proxy (not resolved).  
     * @param obj The obj to check.
     * @param expected obj is expected to be equivalent to this parameter, as
     * determined by their {@linkplain BaseElement#getId() ID}.
     */
    protected static void assertResolvesTo(String message, BaseElement obj, BaseElement expected) {
        assertFalse(message, obj.eIsProxy());
        assertEquals(expected.getId(), obj.getId());
    }

    @Test
    public void testIntraModelReferencesRelative() throws Exception {
        testIntraModelReferences(false);
    }

    @Test
    public void testIntraModelReferencesAbsolute() throws Exception {
        testIntraModelReferences(true);
    }

    /**
     * Test proxy-resolving references (i.e. potentially cross-file references) when
     * they point to objects within the same file.
     * @param absolute Determines if the model is saved and loaded with an absolute or relative URI.
     * @throws IOException
     */
    public void testIntraModelReferences(boolean absolute) throws IOException {
        // single @ XML attribute
        A_process.setDefinitionalCollaborationRef(A_collab);

        // many @ XML attribute - no cross-file reference available

        // single @ XML element
        LinkEventDefinition A_led1, A_led2;
        A_led1 = Bpmn2Factory.eINSTANCE.createLinkEventDefinition();
        A_model.getRootElements().add(A_led1);
        A_led2 = Bpmn2Factory.eINSTANCE.createLinkEventDefinition();
        A_model.getRootElements().add(A_led2);
        A_led1.setTarget(A_led2);

        // many @ XML element
        Process A_process2 = Bpmn2Factory.eINSTANCE.createProcess();
        A_model.getRootElements().add(A_process2);
        A_process.getSupports().add(A_process2);

        Resource res = saveAndLoadModel("qname_intra", A_model, absolute);

        Process A_processNew = (Process) res.getEObject(A_process.getId());
        LinkEventDefinition A_led1New = (LinkEventDefinition) res.getEObject(A_led1.getId());

        assertResolvesTo("Proxy could not be resolved (single attr)",
                A_processNew.getDefinitionalCollaborationRef(), A_collab);

        assertResolvesTo("Proxy could not be resolved (single elem)", A_led1New.getTarget(), A_led2);

        assertResolvesTo("Proxy could not be resolved (many elem)",
                A_processNew.getSupports().get(0), A_process2);
    }

    /**
     * Test a proxy-resolving intra-file reference with an abstract type.
     * @throws Exception
     */
    @Test
    public void testReferenceToAbstractType() throws Exception {
        EventDefinition A_eventDef = Bpmn2Factory.eINSTANCE.createSignalEventDefinition();
        A_model.getRootElements().add(A_eventDef);

        StartEvent A_event = Bpmn2Factory.eINSTANCE.createStartEvent();
        A_event.getEventDefinitionRefs().add(A_eventDef);
        A_process.getFlowElements().add(A_event);

        try {
            Resource res = saveAndLoadModel("qname_toAbstract", A_model);
            StartEvent A_eventNew = (StartEvent) res.getEObject(A_event.getId());
            assertResolvesTo("Proxy could not be resolved (abstract)", A_eventNew
                    .getEventDefinitionRefs().get(0), A_eventDef);
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

    /**
     * Test cross-file references.
     * @throws IOException
     */
    @Test
    public void testInterModelReferences() throws IOException {
        // single @ XML attribute
        A_process.setDefinitionalCollaborationRef(B_collab);

        // many @ XML attribute - no cross-file reference available

        // single @ XML element
        LinkEventDefinition A_led, B_led;
        A_led = Bpmn2Factory.eINSTANCE.createLinkEventDefinition();
        A_model.getRootElements().add(A_led);
        B_led = Bpmn2Factory.eINSTANCE.createLinkEventDefinition();
        B_model.getRootElements().add(B_led);
        A_led.setTarget(B_led);

        // many @ XML element
        A_process.getSupports().add(B_process);

        saveAndLoadModels("inter");

        Process A_processNew = (Process) A_resource.getEObject(A_process.getId());
        LinkEventDefinition A_ledNew = (LinkEventDefinition) A_resource.getEObject(A_led.getId());

        assertResolvesTo("Proxy could not be resolved (single attr)",
                A_processNew.getDefinitionalCollaborationRef(), B_collab);

        assertResolvesTo("Proxy could not be resolved (single elem)", A_ledNew.getTarget(), B_led);

        assertResolvesTo("Proxy could not be resolved (many elem)",
                A_processNew.getSupports().get(0), B_process);
    }

    @Test
    public void testQNameSerialization() throws Exception {
        A_process.setId("A_process_id");
        A_process.setDefinitionalCollaborationRef(A_collab);
        A_process.getSupports().add(B_process);

        saveAndLoadModels("serialization");

        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        Document xml = fact.newDocumentBuilder()
                .parse(new File(A_resource.getURI().toFileString()));
        Node pNode = xml.getElementsByTagName("bpmn2:process").item(0);

        String ref = pNode.getAttributes().getNamedItem("definitionalCollaborationRef")
                .getNodeValue();
        String prefixLocal = ref.indexOf(":") == -1 ? "" : ref.split(":")[0];
        assertEquals("The prefix for local references is not mapped to the target namespace.",
                A_model.getTargetNamespace(), ((DocumentRoot) A_resource.getContents().get(0))
                        .getXMLNSPrefixMap().get(prefixLocal));

        ref = pNode.getChildNodes().item(1).getTextContent();
        String prefixModelB = ref.indexOf(":") == -1 ? "" : ref.split(":")[0];
        assertEquals("The prefix for references to model b is not mapped to its target namespace.",
                B_model.getTargetNamespace(), ((DocumentRoot) A_resource.getContents().get(0))
                        .getXMLNSPrefixMap().get(prefixModelB));
    }

    /**
     * Tests the standard case for the mapping of prefixes to namespaces:
     * - the default namespace is set to the target namespace and local references do not use a prefix
     * - cross-file references use a prefix associated with an imported namespace
     */
    @Test
    public void testPrefixNamespaceMapping() {
        testQNameResolve("normal", true);
    }

    /**
     * Tests the inverse case for the mapping of prefixes to namespaces:
     * - an explicit prefix is associated with the target namespace and used in local references
     * - the default namespace point to an imported namespace and cross-file reference do not use a prefix
     */
    @Test
    public void testPrefixNamespaceMappingInverse() {
        testQNameResolve("inverse", true);
    }

    /**
     * Tests the special case for the mapping of prefixes to namespaces:
     * - neither a default namespace nor a target namespace are defined, unprefixed QNames thus point to local elements 
     */
    @Test
    public void testPrefixNamespaceMappingNoNs() {
        testQNameResolve("noNs", false);
    }

    /**
     * Tests the special case for the mapping of prefixes to namespaces:
     * - no default namespace but a target namespace is defined, unprefixed QNames are invalid (strict interpretation)
     * - chosen fallback behavior: unprefixed QNames should be interpreted as references to local elements
     */
    @Test
    public void testPrefixNamespaceMappingNoDefaultButTarget() {
        testQNameResolve("noDefaultButTarget", false);
    }

    /**
     * Tests the special case for the mapping of prefixes to namespaces:
     * - the default namespace is neither the target namespace nor mapped by an import element
     * - strict interpretation: unprefixed QNames can not be resolved
     * - chosen fallback behavior (?): unprefixed QNames should be interpreted as references to local elements
     * -- guideline: treat unprefixed QNames as local (guess), unless default namespace is mapped by import element
     */
    @Test
    public void testPrefixNamespaceMappingDefaultNotResolvable() {
        testQNameResolve("defaultNotResolvable", true);
    }

    /**
     * Tests if QNames are correctly resolved in the specified test case.
     * @param testCase Identifier of the test case, pointing to a BPMN2 file 
     * under 'res/qname_prefixNs_<i>testCase</i>.bpmn2' (with defined content).
     * @param crossFile <code>true</code>, if this test case features a cross-file reference
     * to be checked (Process.supports).
     */
    protected void testQNameResolve(String testCase, boolean crossFile) {
        Resource res = TestHelper.getResource(URI.createFileURI("res/qname_prefixNs_" + testCase
                + ".bpmn2"));
        Process p = (Process) res.getEObject("proc1Id");
        assertFalse("Resolution of local reference failed, test case: " + testCase, p
                .getDefinitionalCollaborationRef().eIsProxy());
        if (crossFile)
            assertFalse("Resolution of cross-file reference failed, test case: " + testCase, p
                    .getSupports().get(0).eIsProxy());
    }

    /**
     * Tests the automated generation of prefixes in case multiple imports would use the same prefix (as 
     * automatically generated from the namespace).
     * @throws Exception
     */
    @Test
    public void testPrefixClash() throws Exception {
        Definitions C_model = TestHelper.initBasicModel("urn:path:modelB"); // same ns ending as B_model
        Process C_process = Bpmn2Factory.eINSTANCE.createProcess();
        C_model.getRootElements().add(C_process);
        Resource C_resource = saveAndLoadModel("qname_prefixClash_C", C_model);

        Import importCintoA = Bpmn2Factory.eINSTANCE.createImport();
        importCintoA.setImportType("http://www.omg.org/spec/BPMN/20100524/MODEL");
        importCintoA.setLocation(C_resource.getURI().toString());
        importCintoA.setNamespace(C_model.getTargetNamespace());
        A_model.getImports().add(importCintoA);

        A_process.getSupports().add(B_process);
        A_process.getSupports().add(C_process);
        saveAndLoadModels("prefixClash");

        Process A_processNew = (Process) A_resource.getEObject(A_process.getId());
        assertResolvesTo("Reference to element of model B could not be resolved", A_processNew
                .getSupports().get(0), B_process);

        assertResolvesTo("Reference to element of model C could not be resolved", A_processNew
                .getSupports().get(1), C_process);
    }
}
