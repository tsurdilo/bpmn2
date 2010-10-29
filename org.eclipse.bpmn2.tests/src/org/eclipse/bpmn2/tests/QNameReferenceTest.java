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

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Collaboration;
import org.eclipse.bpmn2.Definitions;
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
     * Test proxy-resolving references (i.e. potentially cross-file references) when
     * they point to objects within the same file.
     * @throws IOException
     */
    @Test
    public void testIntraModelReferences() throws IOException {
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

        Resource res = saveAndLoadModel("qname_intra", A_model);

        Process A_processNew = (Process) res.getEObject(A_process.getId());
        LinkEventDefinition A_led1New = (LinkEventDefinition) res.getEObject(A_led1.getId());

        assertFalse("Proxy could not be resolved (single attr)", A_processNew
                .getDefinitionalCollaborationRef().eIsProxy());
        assertEquals(A_collab.getId(), A_processNew.getDefinitionalCollaborationRef().getId());

        assertFalse("Proxy could not be resolved (single elem)", A_led1New.getTarget().eIsProxy());
        assertEquals(A_led2.getId(), A_led1New.getTarget().getId());

        assertFalse("Proxy could not be resolved (many elem)", A_processNew.getSupports().get(0)
                .eIsProxy());
        assertEquals(A_process2.getId(), A_processNew.getSupports().get(0).getId());
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
            assertFalse("Proxy could not be resolved (abstract)", A_eventNew
                    .getEventDefinitionRefs().get(0).eIsProxy());
            assertEquals(A_eventDef.getId(), A_eventNew.getEventDefinitionRefs().get(0).getId());
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

        assertFalse("Proxy could not be resolved (single attr)", A_processNew
                .getDefinitionalCollaborationRef().eIsProxy());
        assertEquals(B_collab.getId(), A_processNew.getDefinitionalCollaborationRef().getId());

        assertFalse("Proxy could not be resolved (single elem)", A_ledNew.getTarget().eIsProxy());
        assertEquals(B_led.getId(), A_ledNew.getTarget().getId());

        assertFalse("Proxy could not be resolved (many elem)", A_processNew.getSupports().get(0)
                .eIsProxy());
        assertEquals(B_process.getId(), A_processNew.getSupports().get(0).getId());
    }
}
