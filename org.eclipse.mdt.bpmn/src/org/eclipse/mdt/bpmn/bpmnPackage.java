/**
 *  Copyright (c) 2000-2009, Intalio Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *     Intalio Inc. - initial API and implementation
 *
 */
package org.eclipse.mdt.bpmn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mdt.bpmn.BpmnFactory
 * @model kind="package"
 * @generated
 */
public interface BpmnPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "bpmn"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://schema.omg.org/spec/BPMN/2.0"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "bpmn"; //$NON-NLS-1$

    /**
     * The package content type ID.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eCONTENT_TYPE = "org.eclipse.mdt.bpmn.content-type"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    BpmnPackage eINSTANCE = org.eclipse.mdt.bpmn.impl.BpmnPackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DocumentRootImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ACTIVITY = 3;

    /**
     * The feature id for the '<em><b>Activity Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ACTIVITY_RESOURCE = 4;

    /**
     * The feature id for the '<em><b>Ad Hoc Sub Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__AD_HOC_SUB_PROCESS = 5;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FLOW_ELEMENT = 6;

    /**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ARTIFACT = 7;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ASSIGNMENT = 8;

    /**
     * The feature id for the '<em><b>Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ASSOCIATION = 9;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__AUDITING = 10;

    /**
     * The feature id for the '<em><b>Base Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BASE_ELEMENT = 11;

    /**
     * The feature id for the '<em><b>Base Element With Mixed Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT = 12;

    /**
     * The feature id for the '<em><b>Boundary Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BOUNDARY_EVENT = 13;

    /**
     * The feature id for the '<em><b>Business Rule Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BUSINESS_RULE_TASK = 14;

    /**
     * The feature id for the '<em><b>Callable Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CALLABLE_ELEMENT = 15;

    /**
     * The feature id for the '<em><b>Call Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CALL_ACTIVITY = 16;

    /**
     * The feature id for the '<em><b>Call Choreography Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CALL_CHOREOGRAPHY_ACTIVITY = 17;

    /**
     * The feature id for the '<em><b>Call Conversation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CALL_CONVERSATION = 18;

    /**
     * The feature id for the '<em><b>Conversation Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONVERSATION_NODE = 19;

    /**
     * The feature id for the '<em><b>Cancel Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION = 20;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_DEFINITION = 21;

    /**
     * The feature id for the '<em><b>Root Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ROOT_ELEMENT = 22;

    /**
     * The feature id for the '<em><b>Catch Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CATCH_EVENT = 23;

    /**
     * The feature id for the '<em><b>Category</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CATEGORY = 24;

    /**
     * The feature id for the '<em><b>Category Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CATEGORY_VALUE = 25;

    /**
     * The feature id for the '<em><b>Choreography</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOREOGRAPHY = 26;

    /**
     * The feature id for the '<em><b>Choreography Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY = 27;

    /**
     * The feature id for the '<em><b>Choreography Sub Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOREOGRAPHY_SUB_PROCESS = 28;

    /**
     * The feature id for the '<em><b>Choreography Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOREOGRAPHY_TASK = 29;

    /**
     * The feature id for the '<em><b>Collaboration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COLLABORATION = 30;

    /**
     * The feature id for the '<em><b>Communication</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMMUNICATION = 31;

    /**
     * The feature id for the '<em><b>Compensate Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION = 32;

    /**
     * The feature id for the '<em><b>Complex Behavior Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION = 33;

    /**
     * The feature id for the '<em><b>Complex Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMPLEX_GATEWAY = 34;

    /**
     * The feature id for the '<em><b>Conditional Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION = 35;

    /**
     * The feature id for the '<em><b>Conversation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONVERSATION = 36;

    /**
     * The feature id for the '<em><b>Conversation Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONVERSATION_ASSOCIATION = 37;

    /**
     * The feature id for the '<em><b>Correlation Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CORRELATION_KEY = 38;

    /**
     * The feature id for the '<em><b>Correlation Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CORRELATION_PROPERTY = 39;

    /**
     * The feature id for the '<em><b>Correlation Property Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING = 40;

    /**
     * The feature id for the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = 41;

    /**
     * The feature id for the '<em><b>Correlation Subscription</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION = 42;

    /**
     * The feature id for the '<em><b>Data Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_ASSOCIATION = 43;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_INPUT = 44;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION = 45;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_OBJECT = 46;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_OUTPUT = 47;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION = 48;

    /**
     * The feature id for the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_STATE = 49;

    /**
     * The feature id for the '<em><b>Data Store</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_STORE = 50;

    /**
     * The feature id for the '<em><b>Data Store Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_STORE_REFERENCE = 51;

    /**
     * The feature id for the '<em><b>Definitions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DEFINITIONS = 52;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DOCUMENTATION = 53;

    /**
     * The feature id for the '<em><b>End Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__END_EVENT = 54;

    /**
     * The feature id for the '<em><b>End Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__END_POINT = 55;

    /**
     * The feature id for the '<em><b>Error</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ERROR = 56;

    /**
     * The feature id for the '<em><b>Error Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ERROR_EVENT_DEFINITION = 57;

    /**
     * The feature id for the '<em><b>Escalation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ESCALATION = 58;

    /**
     * The feature id for the '<em><b>Escalation Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION = 59;

    /**
     * The feature id for the '<em><b>Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT = 60;

    /**
     * The feature id for the '<em><b>Event Based Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_BASED_GATEWAY = 61;

    /**
     * The feature id for the '<em><b>Exclusive Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXCLUSIVE_GATEWAY = 62;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXPRESSION = 63;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXTENSION = 64;

    /**
     * The feature id for the '<em><b>Flow Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FLOW_NODE = 65;

    /**
     * The feature id for the '<em><b>Formal Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FORMAL_EXPRESSION = 66;

    /**
     * The feature id for the '<em><b>Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GATEWAY = 67;

    /**
     * The feature id for the '<em><b>Global Business Rule Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK = 68;

    /**
     * The feature id for the '<em><b>Global Choreography Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK = 69;

    /**
     * The feature id for the '<em><b>Global Communication</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_COMMUNICATION = 70;

    /**
     * The feature id for the '<em><b>Global Manual Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_MANUAL_TASK = 71;

    /**
     * The feature id for the '<em><b>Global Script Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK = 72;

    /**
     * The feature id for the '<em><b>Global Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_TASK = 73;

    /**
     * The feature id for the '<em><b>Global User Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_USER_TASK = 74;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GROUP = 75;

    /**
     * The feature id for the '<em><b>Human Performer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HUMAN_PERFORMER = 76;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PERFORMER = 77;

    /**
     * The feature id for the '<em><b>Implicit Throw Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IMPLICIT_THROW_EVENT = 78;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IMPORT = 79;

    /**
     * The feature id for the '<em><b>Inclusive Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INCLUSIVE_GATEWAY = 80;

    /**
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INPUT_SET = 81;

    /**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INTERFACE = 82;

    /**
     * The feature id for the '<em><b>Intermediate Catch Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT = 83;

    /**
     * The feature id for the '<em><b>Intermediate Throw Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT = 84;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IO_BINDING = 85;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IO_SPECIFICATION = 86;

    /**
     * The feature id for the '<em><b>Item Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ITEM_DEFINITION = 87;

    /**
     * The feature id for the '<em><b>Lane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LANE = 88;

    /**
     * The feature id for the '<em><b>Lane Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LANE_SET = 89;

    /**
     * The feature id for the '<em><b>Link Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LINK_EVENT_DEFINITION = 90;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LOOP_CHARACTERISTICS = 91;

    /**
     * The feature id for the '<em><b>Manual Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MANUAL_TASK = 92;

    /**
     * The feature id for the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MESSAGE = 93;

    /**
     * The feature id for the '<em><b>Message Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION = 94;

    /**
     * The feature id for the '<em><b>Message Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MESSAGE_FLOW = 95;

    /**
     * The feature id for the '<em><b>Message Flow Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION = 96;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MONITORING = 97;

    /**
     * The feature id for the '<em><b>Multi Instance Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS = 98;

    /**
     * The feature id for the '<em><b>Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPERATION = 99;

    /**
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OUTPUT_SET = 100;

    /**
     * The feature id for the '<em><b>Parallel Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARALLEL_GATEWAY = 101;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARTICIPANT = 102;

    /**
     * The feature id for the '<em><b>Participant Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION = 103;

    /**
     * The feature id for the '<em><b>Participant Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY = 104;

    /**
     * The feature id for the '<em><b>Partner Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARTNER_ENTITY = 105;

    /**
     * The feature id for the '<em><b>Partner Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARTNER_ROLE = 106;

    /**
     * The feature id for the '<em><b>Potential Owner</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__POTENTIAL_OWNER = 107;

    /**
     * The feature id for the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESS = 108;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROPERTY = 109;

    /**
     * The feature id for the '<em><b>Receive Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RECEIVE_TASK = 110;

    /**
     * The feature id for the '<em><b>Relationship</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RELATIONSHIP = 111;

    /**
     * The feature id for the '<em><b>Rendering</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RENDERING = 112;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESOURCE = 113;

    /**
     * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION = 114;

    /**
     * The feature id for the '<em><b>Resource Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESOURCE_PARAMETER = 115;

    /**
     * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING = 116;

    /**
     * The feature id for the '<em><b>Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCRIPT = 117;

    /**
     * The feature id for the '<em><b>Script Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCRIPT_TASK = 118;

    /**
     * The feature id for the '<em><b>Send Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEND_TASK = 119;

    /**
     * The feature id for the '<em><b>Sequence Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEQUENCE_FLOW = 120;

    /**
     * The feature id for the '<em><b>Service Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SERVICE_TASK = 121;

    /**
     * The feature id for the '<em><b>Signal</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SIGNAL = 122;

    /**
     * The feature id for the '<em><b>Signal Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION = 123;

    /**
     * The feature id for the '<em><b>Standard Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS = 124;

    /**
     * The feature id for the '<em><b>Start Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__START_EVENT = 125;

    /**
     * The feature id for the '<em><b>Sub Conversation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SUB_CONVERSATION = 126;

    /**
     * The feature id for the '<em><b>Sub Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SUB_PROCESS = 127;

    /**
     * The feature id for the '<em><b>Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TASK = 128;

    /**
     * The feature id for the '<em><b>Terminate Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION = 129;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TEXT = 130;

    /**
     * The feature id for the '<em><b>Text Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TEXT_ANNOTATION = 131;

    /**
     * The feature id for the '<em><b>Throw Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__THROW_EVENT = 132;

    /**
     * The feature id for the '<em><b>Timer Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TIMER_EVENT_DEFINITION = 133;

    /**
     * The feature id for the '<em><b>Transaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSACTION = 134;

    /**
     * The feature id for the '<em><b>User Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__USER_TASK = 135;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 136;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.BaseElementImpl <em>Base Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.BaseElementImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getBaseElement()
     * @generated
     */
    int BASE_ELEMENT = 8;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__DOCUMENTATION = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__ANY = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__ID = 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__ANY_ATTRIBUTE = 3;

    /**
     * The number of structural features of the '<em>Base Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.FlowElementImpl <em>Flow Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.FlowElementImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getFlowElement()
     * @generated
     */
    int FLOW_ELEMENT = 61;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__AUDITING = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__MONITORING = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__CATEGORY_VALUE_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Flow Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.FlowNodeImpl <em>Flow Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.FlowNodeImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getFlowNode()
     * @generated
     */
    int FLOW_NODE = 62;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__ANY = FLOW_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__ID = FLOW_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__AUDITING = FLOW_ELEMENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__MONITORING = FLOW_ELEMENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__NAME = FLOW_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__INCOMING = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__OUTGOING = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Flow Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ActivityImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getActivity()
     * @generated
     */
    int ACTIVITY = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ANY = FLOW_NODE__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ID = FLOW_NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__AUDITING = FLOW_NODE__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__MONITORING = FLOW_NODE__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__NAME = FLOW_NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__IO_SPECIFICATION = FLOW_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__PROPERTIES = FLOW_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DATA_INPUT_ASSOCIATIONS = FLOW_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DATA_OUTPUT_ASSOCIATIONS = FLOW_NODE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ACTIVITY_RESOURCE_GROUPS = FLOW_NODE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ACTIVITY_RESOURCES = FLOW_NODE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__LOOP_CHARACTERISTICS_GROUP = FLOW_NODE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__LOOP_CHARACTERISTICS = FLOW_NODE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__COMPLETION_QUANTITY = FLOW_NODE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DEFAULT = FLOW_NODE_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__IS_FOR_COMPENSATION = FLOW_NODE_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__START_QUANTITY = FLOW_NODE_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 12;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ActivityResourceImpl <em>Activity Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ActivityResourceImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getActivityResource()
     * @generated
     */
    int ACTIVITY_RESOURCE = 2;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_RESOURCE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_RESOURCE__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_RESOURCE__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_RESOURCE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_RESOURCE__RESOURCE_PARAMETER_BINDING = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Resource Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_RESOURCE__RESOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Activity Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_RESOURCE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.SubProcessImpl <em>Sub Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.SubProcessImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getSubProcess()
     * @generated
     */
    int SUB_PROCESS = 125;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__ANY = ACTIVITY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__ID = ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__AUDITING = ACTIVITY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__MONITORING = ACTIVITY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__NAME = ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__INCOMING = ACTIVITY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__OUTGOING = ACTIVITY__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__PROPERTIES = ACTIVITY__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__ACTIVITY_RESOURCE_GROUPS = ACTIVITY__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__ACTIVITY_RESOURCES = ACTIVITY__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__LOOP_CHARACTERISTICS_GROUP = ACTIVITY__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__DEFAULT = ACTIVITY__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__START_QUANTITY = ACTIVITY__START_QUANTITY;

    /**
     * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__FLOW_ELEMENT_GROUP = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__FLOW_ELEMENTS = ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__ARTIFACT_GROUP = ACTIVITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__ARTIFACTS = ACTIVITY_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__TRIGGERED_BY_EVENT = ACTIVITY_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Sub Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.AdHocSubProcessImpl <em>Ad Hoc Sub Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.AdHocSubProcessImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getAdHocSubProcess()
     * @generated
     */
    int AD_HOC_SUB_PROCESS = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__DOCUMENTATION = SUB_PROCESS__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__ANY = SUB_PROCESS__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__ID = SUB_PROCESS__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__ANY_ATTRIBUTE = SUB_PROCESS__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__AUDITING = SUB_PROCESS__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__MONITORING = SUB_PROCESS__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__CATEGORY_VALUE_REF = SUB_PROCESS__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__NAME = SUB_PROCESS__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__INCOMING = SUB_PROCESS__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__OUTGOING = SUB_PROCESS__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__IO_SPECIFICATION = SUB_PROCESS__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__PROPERTIES = SUB_PROCESS__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__DATA_INPUT_ASSOCIATIONS = SUB_PROCESS__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS = SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__ACTIVITY_RESOURCE_GROUPS = SUB_PROCESS__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__ACTIVITY_RESOURCES = SUB_PROCESS__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__LOOP_CHARACTERISTICS_GROUP = SUB_PROCESS__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__LOOP_CHARACTERISTICS = SUB_PROCESS__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__COMPLETION_QUANTITY = SUB_PROCESS__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__DEFAULT = SUB_PROCESS__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__IS_FOR_COMPENSATION = SUB_PROCESS__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__START_QUANTITY = SUB_PROCESS__START_QUANTITY;

    /**
     * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__FLOW_ELEMENT_GROUP = SUB_PROCESS__FLOW_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__FLOW_ELEMENTS = SUB_PROCESS__FLOW_ELEMENTS;

    /**
     * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__ARTIFACT_GROUP = SUB_PROCESS__ARTIFACT_GROUP;

    /**
     * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__ARTIFACTS = SUB_PROCESS__ARTIFACTS;

    /**
     * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__TRIGGERED_BY_EVENT = SUB_PROCESS__TRIGGERED_BY_EVENT;

    /**
     * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__COMPLETION_CONDITION = SUB_PROCESS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cancel Remaining Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES = SUB_PROCESS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__ORDERING = SUB_PROCESS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Ad Hoc Sub Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS_FEATURE_COUNT = SUB_PROCESS_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ArtifactImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getArtifact()
     * @generated
     */
    int ARTIFACT = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTIFACT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTIFACT__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTIFACT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTIFACT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Artifact</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTIFACT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.AssignmentImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 5;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>From</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__FROM = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>To</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__TO = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__LANGUAGE = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.AssociationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getAssociation()
     * @generated
     */
    int ASSOCIATION = 6;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__DOCUMENTATION = ARTIFACT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ANY = ARTIFACT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ID = ARTIFACT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ANY_ATTRIBUTE = ARTIFACT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Association Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ASSOCIATION_DIRECTION = ARTIFACT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__SOURCE_REF = ARTIFACT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__TARGET_REF = ARTIFACT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.AuditingImpl <em>Auditing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.AuditingImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getAuditing()
     * @generated
     */
    int AUDITING = 7;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDITING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDITING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDITING__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDITING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Auditing</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUDITING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.BaseElementWithMixedContentImpl <em>Base Element With Mixed Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.BaseElementWithMixedContentImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getBaseElementWithMixedContent()
     * @generated
     */
    int BASE_ELEMENT_WITH_MIXED_CONTENT = 9;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_WITH_MIXED_CONTENT__MIXED = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION = 1;

    /**
     * The feature id for the '<em><b>Category</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_WITH_MIXED_CONTENT__CATEGORY = 2;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_WITH_MIXED_CONTENT__ANY = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_WITH_MIXED_CONTENT__ID = 4;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE = 5;

    /**
     * The number of structural features of the '<em>Base Element With Mixed Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.EventImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getEvent()
     * @generated
     */
    int EVENT = 55;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__ANY = FLOW_NODE__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__ID = FLOW_NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__AUDITING = FLOW_NODE__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__MONITORING = FLOW_NODE__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__NAME = FLOW_NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__INCOMING = FLOW_NODE__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__OUTGOING = FLOW_NODE__OUTGOING;

    /**
     * The number of structural features of the '<em>Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CatchEventImpl <em>Catch Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CatchEventImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCatchEvent()
     * @generated
     */
    int CATCH_EVENT = 17;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__DOCUMENTATION = EVENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__ANY = EVENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__ID = EVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__ANY_ATTRIBUTE = EVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__AUDITING = EVENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__MONITORING = EVENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__CATEGORY_VALUE_REF = EVENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__NAME = EVENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__INCOMING = EVENT__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__OUTGOING = EVENT__OUTGOING;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__DATA_OUTPUT = EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = EVENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__OUTPUT_SET = EVENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__EVENT_DEFINITION_GROUP = EVENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__EVENT_DEFINITION = EVENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__EVENT_DEFINITION_REF = EVENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__PARALLEL_MULTIPLE = EVENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Catch Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.BoundaryEventImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getBoundaryEvent()
     * @generated
     */
    int BOUNDARY_EVENT = 10;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__DOCUMENTATION = CATCH_EVENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__ANY = CATCH_EVENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__ID = CATCH_EVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__ANY_ATTRIBUTE = CATCH_EVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__AUDITING = CATCH_EVENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__MONITORING = CATCH_EVENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__CATEGORY_VALUE_REF = CATCH_EVENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__NAME = CATCH_EVENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__INCOMING = CATCH_EVENT__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__DATA_OUTPUT = CATCH_EVENT__DATA_OUTPUT;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

    /**
     * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__EVENT_DEFINITION_GROUP = CATCH_EVENT__EVENT_DEFINITION_GROUP;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__EVENT_DEFINITION = CATCH_EVENT__EVENT_DEFINITION;

    /**
     * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__EVENT_DEFINITION_REF = CATCH_EVENT__EVENT_DEFINITION_REF;

    /**
     * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

    /**
     * The feature id for the '<em><b>Attached To Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__ATTACHED_TO_REF = CATCH_EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cancel Activity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__CANCEL_ACTIVITY = CATCH_EVENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Boundary Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.TaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getTask()
     * @generated
     */
    int TASK = 126;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ANY = ACTIVITY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ID = ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__AUDITING = ACTIVITY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__MONITORING = ACTIVITY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__NAME = ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__INCOMING = ACTIVITY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__OUTGOING = ACTIVITY__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__PROPERTIES = ACTIVITY__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ACTIVITY_RESOURCE_GROUPS = ACTIVITY__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ACTIVITY_RESOURCES = ACTIVITY__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__LOOP_CHARACTERISTICS_GROUP = ACTIVITY__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DEFAULT = ACTIVITY__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__START_QUANTITY = ACTIVITY__START_QUANTITY;

    /**
     * The number of structural features of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.BusinessRuleTaskImpl <em>Business Rule Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.BusinessRuleTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getBusinessRuleTask()
     * @generated
     */
    int BUSINESS_RULE_TASK = 11;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__ANY = TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__AUDITING = TASK__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__MONITORING = TASK__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__PROPERTIES = TASK__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__ACTIVITY_RESOURCE_GROUPS = TASK__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__ACTIVITY_RESOURCES = TASK__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__LOOP_CHARACTERISTICS_GROUP = TASK__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__START_QUANTITY = TASK__START_QUANTITY;

    /**
     * The number of structural features of the '<em>Business Rule Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.RootElementImpl <em>Root Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.RootElementImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getRootElement()
     * @generated
     */
    int ROOT_ELEMENT = 114;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_ELEMENT__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_ELEMENT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_ELEMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Root Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CallableElementImpl <em>Callable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CallableElementImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCallableElement()
     * @generated
     */
    int CALLABLE_ELEMENT = 12;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__IO_SPECIFICATION = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__IO_BINDING = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__NAME = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Callable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CallActivityImpl <em>Call Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CallActivityImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCallActivity()
     * @generated
     */
    int CALL_ACTIVITY = 13;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__ANY = ACTIVITY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__ID = ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__AUDITING = ACTIVITY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__MONITORING = ACTIVITY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__NAME = ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__INCOMING = ACTIVITY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__OUTGOING = ACTIVITY__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__PROPERTIES = ACTIVITY__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__ACTIVITY_RESOURCE_GROUPS = ACTIVITY__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__ACTIVITY_RESOURCES = ACTIVITY__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__LOOP_CHARACTERISTICS_GROUP = ACTIVITY__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__DEFAULT = ACTIVITY__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__START_QUANTITY = ACTIVITY__START_QUANTITY;

    /**
     * The feature id for the '<em><b>Called Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__CALLED_ELEMENT = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Call Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ChoreographyActivityImpl <em>Choreography Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ChoreographyActivityImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getChoreographyActivity()
     * @generated
     */
    int CHOREOGRAPHY_ACTIVITY = 21;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__ANY = FLOW_NODE__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__ID = FLOW_NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__AUDITING = FLOW_NODE__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__MONITORING = FLOW_NODE__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__NAME = FLOW_NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF = FLOW_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF = FLOW_NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Choreography Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CallChoreographyActivityImpl <em>Call Choreography Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CallChoreographyActivityImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCallChoreographyActivity()
     * @generated
     */
    int CALL_CHOREOGRAPHY_ACTIVITY = 14;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__DOCUMENTATION = CHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__ANY = CHOREOGRAPHY_ACTIVITY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__ID = CHOREOGRAPHY_ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE = CHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__AUDITING = CHOREOGRAPHY_ACTIVITY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__MONITORING = CHOREOGRAPHY_ACTIVITY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__NAME = CHOREOGRAPHY_ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__INCOMING = CHOREOGRAPHY_ACTIVITY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__OUTGOING = CHOREOGRAPHY_ACTIVITY__OUTGOING;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF;

    /**
     * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

    /**
     * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__PARTICIPANT_ASSOCIATION = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Called Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__CALLED_ELEMENT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Call Choreography Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ConversationNodeImpl <em>Conversation Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ConversationNodeImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getConversationNode()
     * @generated
     */
    int CONVERSATION_NODE = 32;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_NODE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_NODE__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_NODE__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_NODE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_NODE__PARTICIPANT_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_NODE__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Conversation Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_NODE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CallConversationImpl <em>Call Conversation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CallConversationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCallConversation()
     * @generated
     */
    int CALL_CONVERSATION = 15;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CONVERSATION__DOCUMENTATION = CONVERSATION_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CONVERSATION__ANY = CONVERSATION_NODE__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CONVERSATION__ID = CONVERSATION_NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CONVERSATION__ANY_ATTRIBUTE = CONVERSATION_NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CONVERSATION__PARTICIPANT_REF = CONVERSATION_NODE__PARTICIPANT_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CONVERSATION__NAME = CONVERSATION_NODE__NAME;

    /**
     * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CONVERSATION__PARTICIPANT_ASSOCIATION = CONVERSATION_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Called Element Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CONVERSATION__CALLED_ELEMENT_REF = CONVERSATION_NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Call Conversation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CONVERSATION_FEATURE_COUNT = CONVERSATION_NODE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.EventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getEventDefinition()
     * @generated
     */
    int EVENT_DEFINITION = 57;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DEFINITION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DEFINITION__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DEFINITION__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DEFINITION__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_DEFINITION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CancelEventDefinitionImpl <em>Cancel Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CancelEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCancelEventDefinition()
     * @generated
     */
    int CANCEL_EVENT_DEFINITION = 16;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANCEL_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANCEL_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANCEL_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANCEL_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Cancel Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANCEL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CategoryImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCategory()
     * @generated
     */
    int CATEGORY = 18;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY__CATEGORY_VALUE = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CategoryValueImpl <em>Category Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CategoryValueImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCategoryValue()
     * @generated
     */
    int CATEGORY_VALUE = 19;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_VALUE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_VALUE__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_VALUE__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_VALUE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_VALUE__VALUE = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Category Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_VALUE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ChoreographyImpl <em>Choreography</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ChoreographyImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getChoreography()
     * @generated
     */
    int CHOREOGRAPHY = 20;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__ANY = CALLABLE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__ID = CALLABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__ANY_ATTRIBUTE = CALLABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__SUPPORTED_INTERFACE_REF = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__NAME = CALLABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__FLOW_ELEMENT_GROUP = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__FLOW_ELEMENT = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__ARTIFACT_GROUP = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__ARTIFACT = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__MESSAGE_FLOW = CALLABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__PARTICIPANT = CALLABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Conversation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__CONVERSATION = CALLABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Conversation Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__CONVERSATION_ASSOCIATION = CALLABLE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Message Flow Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATION = CALLABLE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__PARTICIPANT_ASSOCIATION = CALLABLE_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Is Closed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__IS_CLOSED = CALLABLE_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Choreography</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 11;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ChoreographySubProcessImpl <em>Choreography Sub Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ChoreographySubProcessImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getChoreographySubProcess()
     * @generated
     */
    int CHOREOGRAPHY_SUB_PROCESS = 22;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__DOCUMENTATION = CHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__ANY = CHOREOGRAPHY_ACTIVITY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__ID = CHOREOGRAPHY_ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__ANY_ATTRIBUTE = CHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__AUDITING = CHOREOGRAPHY_ACTIVITY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__MONITORING = CHOREOGRAPHY_ACTIVITY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__CATEGORY_VALUE_REF = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__NAME = CHOREOGRAPHY_ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__INCOMING = CHOREOGRAPHY_ACTIVITY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__OUTGOING = CHOREOGRAPHY_ACTIVITY__OUTGOING;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF;

    /**
     * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

    /**
     * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__ARTIFACT_GROUP = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__ARTIFACT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Choreography Sub Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ChoreographyTaskImpl <em>Choreography Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ChoreographyTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getChoreographyTask()
     * @generated
     */
    int CHOREOGRAPHY_TASK = 23;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__DOCUMENTATION = CHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__ANY = CHOREOGRAPHY_ACTIVITY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__ID = CHOREOGRAPHY_ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__ANY_ATTRIBUTE = CHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__AUDITING = CHOREOGRAPHY_ACTIVITY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__MONITORING = CHOREOGRAPHY_ACTIVITY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__CATEGORY_VALUE_REF = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__NAME = CHOREOGRAPHY_ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__INCOMING = CHOREOGRAPHY_ACTIVITY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__OUTGOING = CHOREOGRAPHY_ACTIVITY__OUTGOING;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF;

    /**
     * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

    /**
     * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Choreography Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl <em>Collaboration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CollaborationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCollaboration()
     * @generated
     */
    int COLLABORATION = 24;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__PARTICIPANT = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__MESSAGE_FLOW = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ARTIFACT_GROUP = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ARTIFACT = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Conversation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__CONVERSATION = ROOT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Conversation Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__CONVERSATION_ASSOCIATION = ROOT_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__PARTICIPANT_ASSOCIATION = ROOT_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Message Flow Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__MESSAGE_FLOW_ASSOCIATION = ROOT_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Choreography Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__CHOREOGRAPHY_REF = ROOT_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Is Closed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__IS_CLOSED = ROOT_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__NAME = ROOT_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Collaboration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 11;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CommunicationImpl <em>Communication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CommunicationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCommunication()
     * @generated
     */
    int COMMUNICATION = 25;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__DOCUMENTATION = CONVERSATION_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__ANY = CONVERSATION_NODE__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__ID = CONVERSATION_NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__ANY_ATTRIBUTE = CONVERSATION_NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__PARTICIPANT_REF = CONVERSATION_NODE__PARTICIPANT_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__NAME = CONVERSATION_NODE__NAME;

    /**
     * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__MESSAGE_FLOW_REF = CONVERSATION_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Correlation Key Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__CORRELATION_KEY_REF = CONVERSATION_NODE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Communication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_FEATURE_COUNT = CONVERSATION_NODE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CompensateEventDefinitionImpl <em>Compensate Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CompensateEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCompensateEventDefinition()
     * @generated
     */
    int COMPENSATE_EVENT_DEFINITION = 26;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPENSATE_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPENSATE_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPENSATE_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPENSATE_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Activity Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Wait For Completion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION = EVENT_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Compensate Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPENSATE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ComplexBehaviorDefinitionImpl <em>Complex Behavior Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ComplexBehaviorDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getComplexBehaviorDefinition()
     * @generated
     */
    int COMPLEX_BEHAVIOR_DEFINITION = 27;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_BEHAVIOR_DEFINITION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_BEHAVIOR_DEFINITION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_BEHAVIOR_DEFINITION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_BEHAVIOR_DEFINITION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_BEHAVIOR_DEFINITION__CONDITION = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_BEHAVIOR_DEFINITION__EVENT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Complex Behavior Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_BEHAVIOR_DEFINITION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.GatewayImpl <em>Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.GatewayImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGateway()
     * @generated
     */
    int GATEWAY = 64;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__ANY = FLOW_NODE__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__ID = FLOW_NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__AUDITING = FLOW_NODE__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__MONITORING = FLOW_NODE__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__NAME = FLOW_NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__INCOMING = FLOW_NODE__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__OUTGOING = FLOW_NODE__OUTGOING;

    /**
     * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__GATEWAY_DIRECTION = FLOW_NODE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Gateway</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ComplexGatewayImpl <em>Complex Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ComplexGatewayImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getComplexGateway()
     * @generated
     */
    int COMPLEX_GATEWAY = 28;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__ANY = GATEWAY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__ID = GATEWAY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__AUDITING = GATEWAY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__MONITORING = GATEWAY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__NAME = GATEWAY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__INCOMING = GATEWAY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

    /**
     * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

    /**
     * The feature id for the '<em><b>Activation Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__ACTIVATION_CONDITION = GATEWAY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__DEFAULT = GATEWAY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Complex Gateway</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ConditionalEventDefinitionImpl <em>Conditional Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ConditionalEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getConditionalEventDefinition()
     * @generated
     */
    int CONDITIONAL_EVENT_DEFINITION = 29;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EVENT_DEFINITION__CONDITION = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Conditional Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ConversationImpl <em>Conversation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ConversationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getConversation()
     * @generated
     */
    int CONVERSATION = 30;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__ANY = CALLABLE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__ID = CALLABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__ANY_ATTRIBUTE = CALLABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__SUPPORTED_INTERFACE_REF = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__NAME = CALLABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Conversation Node Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__CONVERSATION_NODE_GROUP = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Conversation Node</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__CONVERSATION_NODE = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__PARTICIPANT = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__ARTIFACT_GROUP = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__ARTIFACT = CALLABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__MESSAGE_FLOW = CALLABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__MESSAGE_FLOW_REF = CALLABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__CORRELATION_KEY = CALLABLE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Conversation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ConversationAssociationImpl <em>Conversation Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ConversationAssociationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getConversationAssociation()
     * @generated
     */
    int CONVERSATION_ASSOCIATION = 31;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_ASSOCIATION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_ASSOCIATION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_ASSOCIATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_ASSOCIATION__MESSAGE_FLOW_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Conversation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_ASSOCIATION__CONVERSATION_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Correlation Key Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_ASSOCIATION__CORRELATION_KEY_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Conversation Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CorrelationKeyImpl <em>Correlation Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CorrelationKeyImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCorrelationKey()
     * @generated
     */
    int CORRELATION_KEY = 33;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Correlation Property Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__CORRELATION_PROPERTY_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Correlation Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CorrelationPropertyImpl <em>Correlation Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CorrelationPropertyImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCorrelationProperty()
     * @generated
     */
    int CORRELATION_PROPERTY = 34;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Correlation Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CorrelationPropertyBindingImpl <em>Correlation Property Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CorrelationPropertyBindingImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCorrelationPropertyBinding()
     * @generated
     */
    int CORRELATION_PROPERTY_BINDING = 35;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_BINDING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_BINDING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_BINDING__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_BINDING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Data Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_BINDING__DATA_PATH = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Correlation Property Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Correlation Property Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_BINDING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CorrelationPropertyRetrievalExpressionImpl <em>Correlation Property Retrieval Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CorrelationPropertyRetrievalExpressionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCorrelationPropertyRetrievalExpression()
     * @generated
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = 36;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Message Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Correlation Property Retrieval Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.CorrelationSubscriptionImpl <em>Correlation Subscription</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.CorrelationSubscriptionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getCorrelationSubscription()
     * @generated
     */
    int CORRELATION_SUBSCRIPTION = 37;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SUBSCRIPTION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SUBSCRIPTION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SUBSCRIPTION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SUBSCRIPTION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Correlation Property Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Correlation Key Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Process</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SUBSCRIPTION__PROCESS = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Correlation Subscription</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SUBSCRIPTION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DataAssociationImpl <em>Data Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DataAssociationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDataAssociation()
     * @generated
     */
    int DATA_ASSOCIATION = 38;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSOCIATION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSOCIATION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSOCIATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Transformation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSOCIATION__TRANSFORMATION = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSOCIATION__ASSIGNMENT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Data Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DataInputImpl <em>Data Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DataInputImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDataInput()
     * @generated
     */
    int DATA_INPUT = 39;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__DATA_STATE = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Collection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__IS_COLLECTION = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__ITEM_SUBJECT_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Data Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DataInputAssociationImpl <em>Data Input Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DataInputAssociationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDataInputAssociation()
     * @generated
     */
    int DATA_INPUT_ASSOCIATION = 40;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_ASSOCIATION__DOCUMENTATION = DATA_ASSOCIATION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_ASSOCIATION__ANY = DATA_ASSOCIATION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_ASSOCIATION__ID = DATA_ASSOCIATION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_ASSOCIATION__ANY_ATTRIBUTE = DATA_ASSOCIATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Transformation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_ASSOCIATION__TRANSFORMATION = DATA_ASSOCIATION__TRANSFORMATION;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_ASSOCIATION__ASSIGNMENT = DATA_ASSOCIATION__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_ASSOCIATION__SOURCE_REF = DATA_ASSOCIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_ASSOCIATION__TARGET_REF = DATA_ASSOCIATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Data Input Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_ASSOCIATION_FEATURE_COUNT = DATA_ASSOCIATION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DataObjectImpl <em>Data Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DataObjectImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDataObject()
     * @generated
     */
    int DATA_OBJECT = 41;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__ANY = FLOW_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__ID = FLOW_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__AUDITING = FLOW_ELEMENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__MONITORING = FLOW_ELEMENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__NAME = FLOW_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__DATA_STATE = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Collection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__IS_COLLECTION = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__ITEM_SUBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DataOutputImpl <em>Data Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DataOutputImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDataOutput()
     * @generated
     */
    int DATA_OUTPUT = 42;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__DATA_STATE = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Collection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__IS_COLLECTION = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__ITEM_SUBJECT_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Data Output</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DataOutputAssociationImpl <em>Data Output Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DataOutputAssociationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDataOutputAssociation()
     * @generated
     */
    int DATA_OUTPUT_ASSOCIATION = 43;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_ASSOCIATION__DOCUMENTATION = DATA_ASSOCIATION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_ASSOCIATION__ANY = DATA_ASSOCIATION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_ASSOCIATION__ID = DATA_ASSOCIATION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_ASSOCIATION__ANY_ATTRIBUTE = DATA_ASSOCIATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Transformation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_ASSOCIATION__TRANSFORMATION = DATA_ASSOCIATION__TRANSFORMATION;

    /**
     * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_ASSOCIATION__ASSIGNMENT = DATA_ASSOCIATION__ASSIGNMENT;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_ASSOCIATION__SOURCE_REF = DATA_ASSOCIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_ASSOCIATION__TARGET_REF = DATA_ASSOCIATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Data Output Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_ASSOCIATION_FEATURE_COUNT = DATA_ASSOCIATION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DataStateImpl <em>Data State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DataStateImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDataState()
     * @generated
     */
    int DATA_STATE = 44;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STATE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STATE__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STATE__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STATE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STATE__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STATE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DataStoreImpl <em>Data Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DataStoreImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDataStore()
     * @generated
     */
    int DATA_STORE = 45;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE__DATA_STATE = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE__CAPACITY = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Unlimited</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE__IS_UNLIMITED = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE__ITEM_SUBJECT_REF = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Data Store</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DataStoreReferenceImpl <em>Data Store Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DataStoreReferenceImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDataStoreReference()
     * @generated
     */
    int DATA_STORE_REFERENCE = 46;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__ANY = FLOW_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__ID = FLOW_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__AUDITING = FLOW_ELEMENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__MONITORING = FLOW_ELEMENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__NAME = FLOW_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__DATA_STATE = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Store Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__DATA_STORE_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE__ITEM_SUBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Data Store Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_STORE_REFERENCE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DefinitionsImpl <em>Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DefinitionsImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDefinitions()
     * @generated
     */
    int DEFINITIONS = 47;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__IMPORT = 0;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__EXTENSION = 1;

    /**
     * The feature id for the '<em><b>Root Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ROOT_ELEMENT_GROUP = 2;

    /**
     * The feature id for the '<em><b>Root Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ROOT_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__DIAGRAM = 4;

    /**
     * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__RELATIONSHIP = 5;

    /**
     * The feature id for the '<em><b>Expression Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__EXPRESSION_LANGUAGE = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ID = 7;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__TARGET_NAMESPACE = 8;

    /**
     * The feature id for the '<em><b>Type Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__TYPE_LANGUAGE = 9;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ANY_ATTRIBUTE = 10;

    /**
     * The number of structural features of the '<em>Definitions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS_FEATURE_COUNT = 11;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.DocumentationImpl <em>Documentation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.DocumentationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getDocumentation()
     * @generated
     */
    int DOCUMENTATION = 48;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__MIXED = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__ANY = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__ID = 2;

    /**
     * The number of structural features of the '<em>Documentation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ThrowEventImpl <em>Throw Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ThrowEventImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getThrowEvent()
     * @generated
     */
    int THROW_EVENT = 130;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__DOCUMENTATION = EVENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__ANY = EVENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__ID = EVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__ANY_ATTRIBUTE = EVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__AUDITING = EVENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__MONITORING = EVENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__CATEGORY_VALUE_REF = EVENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__NAME = EVENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__INCOMING = EVENT__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__OUTGOING = EVENT__OUTGOING;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__DATA_INPUT = EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__DATA_INPUT_ASSOCIATION = EVENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__INPUT_SET = EVENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__EVENT_DEFINITION_GROUP = EVENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__EVENT_DEFINITION = EVENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__EVENT_DEFINITION_REF = EVENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Throw Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.EndEventImpl <em>End Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.EndEventImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getEndEvent()
     * @generated
     */
    int END_EVENT = 49;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__DOCUMENTATION = THROW_EVENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__ANY = THROW_EVENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__ID = THROW_EVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__ANY_ATTRIBUTE = THROW_EVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__AUDITING = THROW_EVENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__MONITORING = THROW_EVENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__CATEGORY_VALUE_REF = THROW_EVENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__NAME = THROW_EVENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__INCOMING = THROW_EVENT__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__DATA_INPUT = THROW_EVENT__DATA_INPUT;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

    /**
     * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__EVENT_DEFINITION_GROUP = THROW_EVENT__EVENT_DEFINITION_GROUP;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__EVENT_DEFINITION = THROW_EVENT__EVENT_DEFINITION;

    /**
     * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__EVENT_DEFINITION_REF = THROW_EVENT__EVENT_DEFINITION_REF;

    /**
     * The number of structural features of the '<em>End Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.EndPointImpl <em>End Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.EndPointImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getEndPoint()
     * @generated
     */
    int END_POINT = 50;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_POINT__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_POINT__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_POINT__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_POINT__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>End Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_POINT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ErrorImpl <em>Error</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ErrorImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getError()
     * @generated
     */
    int ERROR = 51;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Error</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ErrorEventDefinitionImpl <em>Error Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ErrorEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getErrorEventDefinition()
     * @generated
     */
    int ERROR_EVENT_DEFINITION = 52;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Error Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_EVENT_DEFINITION__ERROR_CODE = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Error Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_EVENT_DEFINITION__ERROR_REF = EVENT_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Error Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.EscalationImpl <em>Escalation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.EscalationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getEscalation()
     * @generated
     */
    int ESCALATION = 53;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Escalation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.EscalationEventDefinitionImpl <em>Escalation Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.EscalationEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getEscalationEventDefinition()
     * @generated
     */
    int ESCALATION_EVENT_DEFINITION = 54;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Escalation Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION_EVENT_DEFINITION__ESCALATION_CODE = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Escalation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION_EVENT_DEFINITION__ESCALATION_REF = EVENT_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Escalation Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESCALATION_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.EventBasedGatewayImpl <em>Event Based Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.EventBasedGatewayImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getEventBasedGateway()
     * @generated
     */
    int EVENT_BASED_GATEWAY = 56;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__ANY = GATEWAY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__ID = GATEWAY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__AUDITING = GATEWAY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__MONITORING = GATEWAY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__NAME = GATEWAY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__INCOMING = GATEWAY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

    /**
     * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

    /**
     * The feature id for the '<em><b>Event Gateway Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE = GATEWAY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__INSTANTIATE = GATEWAY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Event Based Gateway</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ExclusiveGatewayImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getExclusiveGateway()
     * @generated
     */
    int EXCLUSIVE_GATEWAY = 58;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__ANY = GATEWAY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__ID = GATEWAY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__AUDITING = GATEWAY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__MONITORING = GATEWAY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__INCOMING = GATEWAY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

    /**
     * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__DEFAULT = GATEWAY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Exclusive Gateway</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ExpressionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 59;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__MIXED = BASE_ELEMENT_WITH_MIXED_CONTENT__MIXED;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__DOCUMENTATION = BASE_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Category</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__CATEGORY = BASE_ELEMENT_WITH_MIXED_CONTENT__CATEGORY;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__ANY = BASE_ELEMENT_WITH_MIXED_CONTENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__ID = BASE_ELEMENT_WITH_MIXED_CONTENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION__ANY_ATTRIBUTE = BASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPRESSION_FEATURE_COUNT = BASE_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ExtensionImpl <em>Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ExtensionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getExtension()
     * @generated
     */
    int EXTENSION = 60;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__DOCUMENTATION = 0;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__DEFINITION = 1;

    /**
     * The feature id for the '<em><b>Must Understand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__MUST_UNDERSTAND = 2;

    /**
     * The number of structural features of the '<em>Extension</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.FormalExpressionImpl <em>Formal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.FormalExpressionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getFormalExpression()
     * @generated
     */
    int FORMAL_EXPRESSION = 63;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_EXPRESSION__MIXED = EXPRESSION__MIXED;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_EXPRESSION__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Category</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_EXPRESSION__CATEGORY = EXPRESSION__CATEGORY;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_EXPRESSION__ANY = EXPRESSION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_EXPRESSION__ID = EXPRESSION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_EXPRESSION__ANY_ATTRIBUTE = EXPRESSION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Evaluates To Type Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF = EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_EXPRESSION__LANGUAGE = EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Formal Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FORMAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.GlobalTaskImpl <em>Global Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.GlobalTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGlobalTask()
     * @generated
     */
    int GLOBAL_TASK = 70;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__ANY = CALLABLE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__ID = CALLABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__ANY_ATTRIBUTE = CALLABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__SUPPORTED_INTERFACE_REF = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__NAME = CALLABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__PERFORMER_GROUP = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__PERFORMER = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Global Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.GlobalBusinessRuleTaskImpl <em>Global Business Rule Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.GlobalBusinessRuleTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGlobalBusinessRuleTask()
     * @generated
     */
    int GLOBAL_BUSINESS_RULE_TASK = 65;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__ANY = GLOBAL_TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__ID = GLOBAL_TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__ANY_ATTRIBUTE = GLOBAL_TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__SUPPORTED_INTERFACE_REF = GLOBAL_TASK__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__NAME = GLOBAL_TASK__NAME;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__PERFORMER_GROUP = GLOBAL_TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__PERFORMER = GLOBAL_TASK__PERFORMER;

    /**
     * The number of structural features of the '<em>Global Business Rule Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.GlobalChoreographyTaskImpl <em>Global Choreography Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.GlobalChoreographyTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGlobalChoreographyTask()
     * @generated
     */
    int GLOBAL_CHOREOGRAPHY_TASK = 66;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__ANY = CALLABLE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__ID = CALLABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__ANY_ATTRIBUTE = CALLABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__SUPPORTED_INTERFACE_REF = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__NAME = CALLABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Global Choreography Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.GlobalCommunicationImpl <em>Global Communication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.GlobalCommunicationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGlobalCommunication()
     * @generated
     */
    int GLOBAL_COMMUNICATION = 67;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__ANY = CALLABLE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__ID = CALLABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__ANY_ATTRIBUTE = CALLABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__SUPPORTED_INTERFACE_REF = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__NAME = CALLABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__PARTICIPANT = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__MESSAGE_FLOW = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION__CORRELATION_KEY = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Global Communication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_COMMUNICATION_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.GlobalManualTaskImpl <em>Global Manual Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.GlobalManualTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGlobalManualTask()
     * @generated
     */
    int GLOBAL_MANUAL_TASK = 68;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__ANY = GLOBAL_TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__ID = GLOBAL_TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__ANY_ATTRIBUTE = GLOBAL_TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__SUPPORTED_INTERFACE_REF = GLOBAL_TASK__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__NAME = GLOBAL_TASK__NAME;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__PERFORMER_GROUP = GLOBAL_TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__PERFORMER = GLOBAL_TASK__PERFORMER;

    /**
     * The number of structural features of the '<em>Global Manual Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.GlobalScriptTaskImpl <em>Global Script Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.GlobalScriptTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGlobalScriptTask()
     * @generated
     */
    int GLOBAL_SCRIPT_TASK = 69;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__ANY = GLOBAL_TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__ID = GLOBAL_TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__ANY_ATTRIBUTE = GLOBAL_TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__SUPPORTED_INTERFACE_REF = GLOBAL_TASK__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__NAME = GLOBAL_TASK__NAME;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__PERFORMER_GROUP = GLOBAL_TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__PERFORMER = GLOBAL_TASK__PERFORMER;

    /**
     * The feature id for the '<em><b>Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__SCRIPT = GLOBAL_TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Script Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE = GLOBAL_TASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Global Script Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.GlobalUserTaskImpl <em>Global User Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.GlobalUserTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGlobalUserTask()
     * @generated
     */
    int GLOBAL_USER_TASK = 71;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__ANY = GLOBAL_TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__ID = GLOBAL_TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__ANY_ATTRIBUTE = GLOBAL_TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__SUPPORTED_INTERFACE_REF = GLOBAL_TASK__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__NAME = GLOBAL_TASK__NAME;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__PERFORMER_GROUP = GLOBAL_TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__PERFORMER = GLOBAL_TASK__PERFORMER;

    /**
     * The feature id for the '<em><b>Rendering</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__RENDERING = GLOBAL_TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__IMPLEMENTATION = GLOBAL_TASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Global User Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.GroupImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGroup()
     * @generated
     */
    int GROUP = 72;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__DOCUMENTATION = ARTIFACT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__ANY = ARTIFACT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__ID = ARTIFACT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__ANY_ATTRIBUTE = ARTIFACT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Category Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP__CATEGORY_REF = ARTIFACT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.PerformerImpl <em>Performer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.PerformerImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getPerformer()
     * @generated
     */
    int PERFORMER = 103;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__DOCUMENTATION = ACTIVITY_RESOURCE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ANY = ACTIVITY_RESOURCE__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ID = ACTIVITY_RESOURCE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ANY_ATTRIBUTE = ACTIVITY_RESOURCE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION = ACTIVITY_RESOURCE__RESOURCE_ASSIGNMENT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__RESOURCE_PARAMETER_BINDING = ACTIVITY_RESOURCE__RESOURCE_PARAMETER_BINDING;

    /**
     * The feature id for the '<em><b>Resource Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__RESOURCE_REF = ACTIVITY_RESOURCE__RESOURCE_REF;

    /**
     * The number of structural features of the '<em>Performer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER_FEATURE_COUNT = ACTIVITY_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.HumanPerformerImpl <em>Human Performer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.HumanPerformerImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getHumanPerformer()
     * @generated
     */
    int HUMAN_PERFORMER = 73;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__DOCUMENTATION = PERFORMER__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__ANY = PERFORMER__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__ID = PERFORMER__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__ANY_ATTRIBUTE = PERFORMER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION = PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__RESOURCE_PARAMETER_BINDING = PERFORMER__RESOURCE_PARAMETER_BINDING;

    /**
     * The feature id for the '<em><b>Resource Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__RESOURCE_REF = PERFORMER__RESOURCE_REF;

    /**
     * The number of structural features of the '<em>Human Performer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER_FEATURE_COUNT = PERFORMER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ImplicitThrowEventImpl <em>Implicit Throw Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ImplicitThrowEventImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getImplicitThrowEvent()
     * @generated
     */
    int IMPLICIT_THROW_EVENT = 74;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__DOCUMENTATION = THROW_EVENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__ANY = THROW_EVENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__ID = THROW_EVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__ANY_ATTRIBUTE = THROW_EVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__AUDITING = THROW_EVENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__MONITORING = THROW_EVENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__CATEGORY_VALUE_REF = THROW_EVENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__NAME = THROW_EVENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__INCOMING = THROW_EVENT__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__DATA_INPUT = THROW_EVENT__DATA_INPUT;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

    /**
     * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__EVENT_DEFINITION_GROUP = THROW_EVENT__EVENT_DEFINITION_GROUP;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__EVENT_DEFINITION = THROW_EVENT__EVENT_DEFINITION;

    /**
     * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT__EVENT_DEFINITION_REF = THROW_EVENT__EVENT_DEFINITION_REF;

    /**
     * The number of structural features of the '<em>Implicit Throw Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICIT_THROW_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ImportImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getImport()
     * @generated
     */
    int IMPORT = 75;

    /**
     * The feature id for the '<em><b>Import Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT__IMPORT_TYPE = 0;

    /**
     * The feature id for the '<em><b>Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT__LOCATION = 1;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT__NAMESPACE = 2;

    /**
     * The number of structural features of the '<em>Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORT_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.InclusiveGatewayImpl <em>Inclusive Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.InclusiveGatewayImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getInclusiveGateway()
     * @generated
     */
    int INCLUSIVE_GATEWAY = 76;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__ANY = GATEWAY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__ID = GATEWAY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__AUDITING = GATEWAY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__MONITORING = GATEWAY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__INCOMING = GATEWAY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

    /**
     * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__DEFAULT = GATEWAY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Inclusive Gateway</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.InputOutputBindingImpl <em>Input Output Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.InputOutputBindingImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getInputOutputBinding()
     * @generated
     */
    int INPUT_OUTPUT_BINDING = 77;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_BINDING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_BINDING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_BINDING__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_BINDING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Input Data Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_BINDING__INPUT_DATA_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_BINDING__OPERATION_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Output Data Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Input Output Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_BINDING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.InputOutputSpecificationImpl <em>Input Output Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.InputOutputSpecificationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getInputOutputSpecification()
     * @generated
     */
    int INPUT_OUTPUT_SPECIFICATION = 78;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_SPECIFICATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_SPECIFICATION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_SPECIFICATION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_SPECIFICATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_SPECIFICATION__DATA_INPUT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Input Set</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_SPECIFICATION__INPUT_SET = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Output Set</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_SPECIFICATION__OUTPUT_SET = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Input Output Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_SPECIFICATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.InputSetImpl <em>Input Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.InputSetImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getInputSet()
     * @generated
     */
    int INPUT_SET = 79;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Data Input Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__DATA_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Optional Input Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__OPTIONAL_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>While Executing Input Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__WHILE_EXECUTING_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Output Set Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__OUTPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Input Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.InterfaceImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getInterface()
     * @generated
     */
    int INTERFACE = 80;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Operation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__OPERATION = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.IntermediateCatchEventImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getIntermediateCatchEvent()
     * @generated
     */
    int INTERMEDIATE_CATCH_EVENT = 81;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__DOCUMENTATION = CATCH_EVENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__ANY = CATCH_EVENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__ID = CATCH_EVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__ANY_ATTRIBUTE = CATCH_EVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__AUDITING = CATCH_EVENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__MONITORING = CATCH_EVENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__CATEGORY_VALUE_REF = CATCH_EVENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__NAME = CATCH_EVENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__INCOMING = CATCH_EVENT__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__DATA_OUTPUT = CATCH_EVENT__DATA_OUTPUT;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

    /**
     * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__EVENT_DEFINITION_GROUP = CATCH_EVENT__EVENT_DEFINITION_GROUP;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__EVENT_DEFINITION = CATCH_EVENT__EVENT_DEFINITION;

    /**
     * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__EVENT_DEFINITION_REF = CATCH_EVENT__EVENT_DEFINITION_REF;

    /**
     * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

    /**
     * The number of structural features of the '<em>Intermediate Catch Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.IntermediateThrowEventImpl <em>Intermediate Throw Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.IntermediateThrowEventImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getIntermediateThrowEvent()
     * @generated
     */
    int INTERMEDIATE_THROW_EVENT = 82;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__DOCUMENTATION = THROW_EVENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__ANY = THROW_EVENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__ID = THROW_EVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__ANY_ATTRIBUTE = THROW_EVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__AUDITING = THROW_EVENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__MONITORING = THROW_EVENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__CATEGORY_VALUE_REF = THROW_EVENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__NAME = THROW_EVENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__INCOMING = THROW_EVENT__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__DATA_INPUT = THROW_EVENT__DATA_INPUT;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

    /**
     * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__EVENT_DEFINITION_GROUP = THROW_EVENT__EVENT_DEFINITION_GROUP;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__EVENT_DEFINITION = THROW_EVENT__EVENT_DEFINITION;

    /**
     * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__EVENT_DEFINITION_REF = THROW_EVENT__EVENT_DEFINITION_REF;

    /**
     * The number of structural features of the '<em>Intermediate Throw Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ItemDefinitionImpl <em>Item Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ItemDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getItemDefinition()
     * @generated
     */
    int ITEM_DEFINITION = 83;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_DEFINITION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_DEFINITION__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_DEFINITION__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_DEFINITION__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Is Collection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_DEFINITION__IS_COLLECTION = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Item Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_DEFINITION__ITEM_KIND = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_DEFINITION__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Item Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ITEM_DEFINITION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.LaneImpl <em>Lane</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.LaneImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getLane()
     * @generated
     */
    int LANE = 84;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Partition Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE__PARTITION_ELEMENT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Flow Element Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE__FLOW_ELEMENT_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Child Lane Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE__CHILD_LANE_SET = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Partition Element Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE__PARTITION_ELEMENT_REF = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Lane</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.LaneSetImpl <em>Lane Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.LaneSetImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getLaneSet()
     * @generated
     */
    int LANE_SET = 85;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE_SET__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE_SET__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE_SET__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Lane</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE_SET__LANE = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Lane Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LANE_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.LinkEventDefinitionImpl <em>Link Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.LinkEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getLinkEventDefinition()
     * @generated
     */
    int LINK_EVENT_DEFINITION = 86;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_EVENT_DEFINITION__NAME = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Link Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.LoopCharacteristicsImpl <em>Loop Characteristics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.LoopCharacteristicsImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getLoopCharacteristics()
     * @generated
     */
    int LOOP_CHARACTERISTICS = 87;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP_CHARACTERISTICS__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP_CHARACTERISTICS__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP_CHARACTERISTICS__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP_CHARACTERISTICS__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Loop Characteristics</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP_CHARACTERISTICS_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ManualTaskImpl <em>Manual Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ManualTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getManualTask()
     * @generated
     */
    int MANUAL_TASK = 88;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__ANY = TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__AUDITING = TASK__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__MONITORING = TASK__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__PROPERTIES = TASK__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__ACTIVITY_RESOURCE_GROUPS = TASK__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__ACTIVITY_RESOURCES = TASK__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__LOOP_CHARACTERISTICS_GROUP = TASK__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__START_QUANTITY = TASK__START_QUANTITY;

    /**
     * The number of structural features of the '<em>Manual Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.MessageImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getMessage()
     * @generated
     */
    int MESSAGE = 89;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Message</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.MessageEventDefinitionImpl <em>Message Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.MessageEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getMessageEventDefinition()
     * @generated
     */
    int MESSAGE_EVENT_DEFINITION = 90;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION__OPERATION_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION__MESSAGE_REF = EVENT_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Message Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.MessageFlowImpl <em>Message Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.MessageFlowImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getMessageFlow()
     * @generated
     */
    int MESSAGE_FLOW = 91;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__SOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__TARGET_REF = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Message Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.MessageFlowAssociationImpl <em>Message Flow Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.MessageFlowAssociationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getMessageFlowAssociation()
     * @generated
     */
    int MESSAGE_FLOW_ASSOCIATION = 92;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW_ASSOCIATION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW_ASSOCIATION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW_ASSOCIATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Inner Message Flow Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outer Message Flow Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Message Flow Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.MonitoringImpl <em>Monitoring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.MonitoringImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getMonitoring()
     * @generated
     */
    int MONITORING = 93;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITORING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITORING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITORING__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITORING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Monitoring</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONITORING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.MultiInstanceLoopCharacteristicsImpl <em>Multi Instance Loop Characteristics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.MultiInstanceLoopCharacteristicsImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getMultiInstanceLoopCharacteristics()
     * @generated
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS = 94;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__DOCUMENTATION = LOOP_CHARACTERISTICS__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__ANY = LOOP_CHARACTERISTICS__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__ID = LOOP_CHARACTERISTICS__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__ANY_ATTRIBUTE = LOOP_CHARACTERISTICS__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Loop Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY = LOOP_CHARACTERISTICS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Loop Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Loop Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Input Data Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Output Data Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Complex Behavior Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR = LOOP_CHARACTERISTICS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Is Sequential</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL = LOOP_CHARACTERISTICS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>None Behavior Event Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>One Behavior Event Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Multi Instance Loop Characteristics</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS_FEATURE_COUNT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 11;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.OperationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getOperation()
     * @generated
     */
    int OPERATION = 95;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>In Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__IN_MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Out Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__OUT_MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Error Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__ERROR_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.OutputSetImpl <em>Output Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.OutputSetImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getOutputSet()
     * @generated
     */
    int OUTPUT_SET = 96;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Data Output Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__DATA_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Optional Output Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__OPTIONAL_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>While Executing Output Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Input Set Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__INPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Output Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ParallelGatewayImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getParallelGateway()
     * @generated
     */
    int PARALLEL_GATEWAY = 97;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__ANY = GATEWAY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__ID = GATEWAY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__ANY_ATTRIBUTE = GATEWAY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__AUDITING = GATEWAY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__MONITORING = GATEWAY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__NAME = GATEWAY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__INCOMING = GATEWAY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

    /**
     * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

    /**
     * The number of structural features of the '<em>Parallel Gateway</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ParticipantImpl <em>Participant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ParticipantImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getParticipant()
     * @generated
     */
    int PARTICIPANT = 98;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__INTERFACE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>End Point Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__END_POINT_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Participant Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__PARTICIPANT_MULTIPLICITY = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Partner Entity Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__PARTNER_ENTITY_REF = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Partner Role Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__PARTNER_ROLE_REF = BASE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Process Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__PROCESS_REF = BASE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Participant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ParticipantAssociationImpl <em>Participant Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ParticipantAssociationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getParticipantAssociation()
     * @generated
     */
    int PARTICIPANT_ASSOCIATION = 99;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_ASSOCIATION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_ASSOCIATION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_ASSOCIATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Inner Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outer Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Participant Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ParticipantMultiplicityImpl <em>Participant Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ParticipantMultiplicityImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getParticipantMultiplicity()
     * @generated
     */
    int PARTICIPANT_MULTIPLICITY = 100;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_MULTIPLICITY__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_MULTIPLICITY__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_MULTIPLICITY__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_MULTIPLICITY__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Maximum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_MULTIPLICITY__MAXIMUM = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Minimum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_MULTIPLICITY__MINIMUM = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Participant Multiplicity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_MULTIPLICITY_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.PartnerEntityImpl <em>Partner Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.PartnerEntityImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getPartnerEntity()
     * @generated
     */
    int PARTNER_ENTITY = 101;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ENTITY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ENTITY__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ENTITY__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ENTITY__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ENTITY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Partner Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ENTITY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.PartnerRoleImpl <em>Partner Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.PartnerRoleImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getPartnerRole()
     * @generated
     */
    int PARTNER_ROLE = 102;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ROLE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ROLE__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ROLE__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ROLE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ROLE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Partner Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTNER_ROLE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.PotentialOwnerImpl <em>Potential Owner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.PotentialOwnerImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getPotentialOwner()
     * @generated
     */
    int POTENTIAL_OWNER = 104;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__DOCUMENTATION = HUMAN_PERFORMER__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__ANY = HUMAN_PERFORMER__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__ID = HUMAN_PERFORMER__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__ANY_ATTRIBUTE = HUMAN_PERFORMER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__RESOURCE_ASSIGNMENT_EXPRESSION = HUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__RESOURCE_PARAMETER_BINDING = HUMAN_PERFORMER__RESOURCE_PARAMETER_BINDING;

    /**
     * The feature id for the '<em><b>Resource Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__RESOURCE_REF = HUMAN_PERFORMER__RESOURCE_REF;

    /**
     * The number of structural features of the '<em>Potential Owner</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER_FEATURE_COUNT = HUMAN_PERFORMER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ProcessImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 105;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ANY = CALLABLE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ID = CALLABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ANY_ATTRIBUTE = CALLABLE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__SUPPORTED_INTERFACE_REF = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__NAME = CALLABLE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__AUDITING = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__MONITORING = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PROPERTY = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Lane Set</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__LANE_SET = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__FLOW_ELEMENT_GROUP = CALLABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__FLOW_ELEMENT = CALLABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ARTIFACT_GROUP = CALLABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ARTIFACT = CALLABLE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Supports</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__SUPPORTS = CALLABLE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Definitional Collaboration Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__DEFINITIONAL_COLLABORATION_REF = CALLABLE_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Is Closed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__IS_CLOSED = CALLABLE_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Process Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PROCESS_TYPE = CALLABLE_ELEMENT_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 12;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.PropertyImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 106;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DATA_STATE = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__ITEM_SUBJECT_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ReceiveTaskImpl <em>Receive Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ReceiveTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getReceiveTask()
     * @generated
     */
    int RECEIVE_TASK = 107;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__ANY = TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__AUDITING = TASK__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__MONITORING = TASK__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__PROPERTIES = TASK__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__ACTIVITY_RESOURCE_GROUPS = TASK__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__ACTIVITY_RESOURCES = TASK__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__LOOP_CHARACTERISTICS_GROUP = TASK__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__START_QUANTITY = TASK__START_QUANTITY;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__INSTANTIATE = TASK_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__MESSAGE_REF = TASK_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Receive Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.RelationshipImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getRelationship()
     * @generated
     */
    int RELATIONSHIP = 108;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__SOURCE = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__TARGET = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__DIRECTION = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__TYPE = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.RenderingImpl <em>Rendering</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.RenderingImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getRendering()
     * @generated
     */
    int RENDERING = 109;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENDERING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENDERING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENDERING__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENDERING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Rendering</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENDERING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ResourceImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getResource()
     * @generated
     */
    int RESOURCE = 110;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Resource Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__RESOURCE_PARAMETER = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ResourceAssignmentExpressionImpl <em>Resource Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ResourceAssignmentExpressionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getResourceAssignmentExpression()
     * @generated
     */
    int RESOURCE_ASSIGNMENT_EXPRESSION = 111;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ASSIGNMENT_EXPRESSION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ASSIGNMENT_EXPRESSION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ASSIGNMENT_EXPRESSION__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ASSIGNMENT_EXPRESSION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION_GROUP = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Resource Assignment Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ResourceParameterImpl <em>Resource Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ResourceParameterImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getResourceParameter()
     * @generated
     */
    int RESOURCE_PARAMETER = 112;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Is Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER__IS_REQUIRED = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER__TYPE = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Resource Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ResourceParameterBindingImpl <em>Resource Parameter Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ResourceParameterBindingImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getResourceParameterBinding()
     * @generated
     */
    int RESOURCE_PARAMETER_BINDING = 113;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER_BINDING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER_BINDING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER_BINDING__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER_BINDING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER_BINDING__EXPRESSION_GROUP = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER_BINDING__EXPRESSION = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER_BINDING__PARAMETER_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Resource Parameter Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_PARAMETER_BINDING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ScriptImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getScript()
     * @generated
     */
    int SCRIPT = 115;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__MIXED = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__ANY = 1;

    /**
     * The number of structural features of the '<em>Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ScriptTaskImpl <em>Script Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ScriptTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getScriptTask()
     * @generated
     */
    int SCRIPT_TASK = 116;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__ANY = TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__AUDITING = TASK__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__MONITORING = TASK__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__PROPERTIES = TASK__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__ACTIVITY_RESOURCE_GROUPS = TASK__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__ACTIVITY_RESOURCES = TASK__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__LOOP_CHARACTERISTICS_GROUP = TASK__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__START_QUANTITY = TASK__START_QUANTITY;

    /**
     * The feature id for the '<em><b>Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__SCRIPT = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Script Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__SCRIPT_LANGUAGE = TASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Script Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.SendTaskImpl <em>Send Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.SendTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getSendTask()
     * @generated
     */
    int SEND_TASK = 117;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__ANY = TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__AUDITING = TASK__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__MONITORING = TASK__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__PROPERTIES = TASK__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__ACTIVITY_RESOURCE_GROUPS = TASK__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__ACTIVITY_RESOURCES = TASK__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__LOOP_CHARACTERISTICS_GROUP = TASK__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__START_QUANTITY = TASK__START_QUANTITY;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__MESSAGE_REF = TASK_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Send Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.SequenceFlowImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getSequenceFlow()
     * @generated
     */
    int SEQUENCE_FLOW = 118;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__ANY = FLOW_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__ID = FLOW_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__ANY_ATTRIBUTE = FLOW_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__AUDITING = FLOW_ELEMENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__MONITORING = FLOW_ELEMENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__NAME = FLOW_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__CONDITION_EXPRESSION = FLOW_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__IS_IMMEDIATE = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__SOURCE_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__TARGET_REF = FLOW_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Sequence Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.ServiceTaskImpl <em>Service Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.ServiceTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getServiceTask()
     * @generated
     */
    int SERVICE_TASK = 119;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__ANY = TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__AUDITING = TASK__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__MONITORING = TASK__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__PROPERTIES = TASK__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__ACTIVITY_RESOURCE_GROUPS = TASK__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__ACTIVITY_RESOURCES = TASK__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__LOOP_CHARACTERISTICS_GROUP = TASK__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__START_QUANTITY = TASK__START_QUANTITY;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.SignalImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getSignal()
     * @generated
     */
    int SIGNAL = 120;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Signal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.SignalEventDefinitionImpl <em>Signal Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.SignalEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getSignalEventDefinition()
     * @generated
     */
    int SIGNAL_EVENT_DEFINITION = 121;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Signal Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_EVENT_DEFINITION__SIGNAL_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Signal Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.StandardLoopCharacteristicsImpl <em>Standard Loop Characteristics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.StandardLoopCharacteristicsImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getStandardLoopCharacteristics()
     * @generated
     */
    int STANDARD_LOOP_CHARACTERISTICS = 122;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDARD_LOOP_CHARACTERISTICS__DOCUMENTATION = LOOP_CHARACTERISTICS__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDARD_LOOP_CHARACTERISTICS__ANY = LOOP_CHARACTERISTICS__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDARD_LOOP_CHARACTERISTICS__ID = LOOP_CHARACTERISTICS__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDARD_LOOP_CHARACTERISTICS__ANY_ATTRIBUTE = LOOP_CHARACTERISTICS__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Loop Maximum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Test Before</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE = LOOP_CHARACTERISTICS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Standard Loop Characteristics</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDARD_LOOP_CHARACTERISTICS_FEATURE_COUNT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.StartEventImpl <em>Start Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.StartEventImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getStartEvent()
     * @generated
     */
    int START_EVENT = 123;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__DOCUMENTATION = CATCH_EVENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__ANY = CATCH_EVENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__ID = CATCH_EVENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__ANY_ATTRIBUTE = CATCH_EVENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__AUDITING = CATCH_EVENT__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__MONITORING = CATCH_EVENT__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__CATEGORY_VALUE_REF = CATCH_EVENT__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__NAME = CATCH_EVENT__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__INCOMING = CATCH_EVENT__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__DATA_OUTPUT = CATCH_EVENT__DATA_OUTPUT;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

    /**
     * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__EVENT_DEFINITION_GROUP = CATCH_EVENT__EVENT_DEFINITION_GROUP;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__EVENT_DEFINITION = CATCH_EVENT__EVENT_DEFINITION;

    /**
     * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__EVENT_DEFINITION_REF = CATCH_EVENT__EVENT_DEFINITION_REF;

    /**
     * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

    /**
     * The feature id for the '<em><b>Is Interrupting</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__IS_INTERRUPTING = CATCH_EVENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Start Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.SubConversationImpl <em>Sub Conversation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.SubConversationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getSubConversation()
     * @generated
     */
    int SUB_CONVERSATION = 124;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__DOCUMENTATION = CONVERSATION_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__ANY = CONVERSATION_NODE__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__ID = CONVERSATION_NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__ANY_ATTRIBUTE = CONVERSATION_NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__PARTICIPANT_REF = CONVERSATION_NODE__PARTICIPANT_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__NAME = CONVERSATION_NODE__NAME;

    /**
     * The feature id for the '<em><b>Conversation Node Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__CONVERSATION_NODE_GROUP = CONVERSATION_NODE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Conversation Node</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__CONVERSATION_NODE = CONVERSATION_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__ARTIFACT_GROUP = CONVERSATION_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__ARTIFACT = CONVERSATION_NODE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Correlation Key Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION__CORRELATION_KEY_REF = CONVERSATION_NODE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Sub Conversation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CONVERSATION_FEATURE_COUNT = CONVERSATION_NODE_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.TerminateEventDefinitionImpl <em>Terminate Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.TerminateEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getTerminateEventDefinition()
     * @generated
     */
    int TERMINATE_EVENT_DEFINITION = 127;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINATE_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINATE_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINATE_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINATE_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Terminate Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINATE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.TextImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getText()
     * @generated
     */
    int TEXT = 128;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__MIXED = 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__ANY = 1;

    /**
     * The number of structural features of the '<em>Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.TextAnnotationImpl <em>Text Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.TextAnnotationImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getTextAnnotation()
     * @generated
     */
    int TEXT_ANNOTATION = 129;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ANNOTATION__DOCUMENTATION = ARTIFACT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ANNOTATION__ANY = ARTIFACT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ANNOTATION__ID = ARTIFACT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ANNOTATION__ANY_ATTRIBUTE = ARTIFACT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ANNOTATION__TEXT = ARTIFACT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Text Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_ANNOTATION_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.TimerEventDefinitionImpl <em>Timer Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.TimerEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getTimerEventDefinition()
     * @generated
     */
    int TIMER_EVENT_DEFINITION = 131;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_EVENT_DEFINITION__ANY = EVENT_DEFINITION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_EVENT_DEFINITION__ANY_ATTRIBUTE = EVENT_DEFINITION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Time Date</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_EVENT_DEFINITION__TIME_DATE = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Time Cycle</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_EVENT_DEFINITION__TIME_CYCLE = EVENT_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Timer Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.TransactionImpl <em>Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.TransactionImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getTransaction()
     * @generated
     */
    int TRANSACTION = 132;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__ANY = ACTIVITY__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__ID = ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__ANY_ATTRIBUTE = ACTIVITY__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__AUDITING = ACTIVITY__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__MONITORING = ACTIVITY__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__NAME = ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__INCOMING = ACTIVITY__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__OUTGOING = ACTIVITY__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__PROPERTIES = ACTIVITY__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__ACTIVITY_RESOURCE_GROUPS = ACTIVITY__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__ACTIVITY_RESOURCES = ACTIVITY__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__LOOP_CHARACTERISTICS_GROUP = ACTIVITY__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__DEFAULT = ACTIVITY__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__START_QUANTITY = ACTIVITY__START_QUANTITY;

    /**
     * The feature id for the '<em><b>Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__METHOD = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Transaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.impl.UserTaskImpl <em>User Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.impl.UserTaskImpl
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getUserTask()
     * @generated
     */
    int USER_TASK = 133;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__ANY = TASK__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__ID = TASK__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__ANY_ATTRIBUTE = TASK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__AUDITING = TASK__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__MONITORING = TASK__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__NAME = TASK__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__INCOMING = TASK__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__OUTGOING = TASK__OUTGOING;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__PROPERTIES = TASK__PROPERTIES;

    /**
     * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

    /**
     * The feature id for the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__ACTIVITY_RESOURCE_GROUPS = TASK__ACTIVITY_RESOURCE_GROUPS;

    /**
     * The feature id for the '<em><b>Activity Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__ACTIVITY_RESOURCES = TASK__ACTIVITY_RESOURCES;

    /**
     * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__LOOP_CHARACTERISTICS_GROUP = TASK__LOOP_CHARACTERISTICS_GROUP;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

    /**
     * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

    /**
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__DEFAULT = TASK__DEFAULT;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

    /**
     * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__START_QUANTITY = TASK__START_QUANTITY;

    /**
     * The feature id for the '<em><b>Rendering</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__RENDERING = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>User Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.AdHocOrdering <em>Ad Hoc Ordering</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.AdHocOrdering
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getAdHocOrdering()
     * @generated
     */
    int AD_HOC_ORDERING = 134;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.AssociationDirection <em>Association Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.AssociationDirection
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getAssociationDirection()
     * @generated
     */
    int ASSOCIATION_DIRECTION = 135;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.EventBasedGatewayType <em>Event Based Gateway Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.EventBasedGatewayType
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getEventBasedGatewayType()
     * @generated
     */
    int EVENT_BASED_GATEWAY_TYPE = 136;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.GatewayDirection <em>Gateway Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.GatewayDirection
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGatewayDirection()
     * @generated
     */
    int GATEWAY_DIRECTION = 137;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.ItemKind <em>Item Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.ItemKind
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getItemKind()
     * @generated
     */
    int ITEM_KIND = 138;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.MultiInstanceFlowCondition <em>Multi Instance Flow Condition</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.MultiInstanceFlowCondition
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getMultiInstanceFlowCondition()
     * @generated
     */
    int MULTI_INSTANCE_FLOW_CONDITION = 139;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.ProcessType <em>Process Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.ProcessType
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getProcessType()
     * @generated
     */
    int PROCESS_TYPE = 140;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.RelationshipDirection <em>Relationship Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.RelationshipDirection
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getRelationshipDirection()
     * @generated
     */
    int RELATIONSHIP_DIRECTION = 141;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.ServiceImplementation <em>Service Implementation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.ServiceImplementation
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getServiceImplementation()
     * @generated
     */
    int SERVICE_IMPLEMENTATION = 142;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.TransactionMethod <em>Transaction Method</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.TransactionMethod
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getTransactionMethod()
     * @generated
     */
    int TRANSACTION_METHOD = 143;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.UserTaskImplementation <em>User Task Implementation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.UserTaskImplementation
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getUserTaskImplementation()
     * @generated
     */
    int USER_TASK_IMPLEMENTATION = 144;

    /**
     * The meta object id for the '<em>Ad Hoc Ordering Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.AdHocOrdering
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getAdHocOrderingObject()
     * @generated
     */
    int AD_HOC_ORDERING_OBJECT = 145;

    /**
     * The meta object id for the '<em>Association Direction Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.AssociationDirection
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getAssociationDirectionObject()
     * @generated
     */
    int ASSOCIATION_DIRECTION_OBJECT = 146;

    /**
     * The meta object id for the '<em>Event Based Gateway Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.EventBasedGatewayType
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getEventBasedGatewayTypeObject()
     * @generated
     */
    int EVENT_BASED_GATEWAY_TYPE_OBJECT = 147;

    /**
     * The meta object id for the '<em>Gateway Direction Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.GatewayDirection
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getGatewayDirectionObject()
     * @generated
     */
    int GATEWAY_DIRECTION_OBJECT = 148;

    /**
     * The meta object id for the '<em>Item Kind Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.ItemKind
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getItemKindObject()
     * @generated
     */
    int ITEM_KIND_OBJECT = 149;

    /**
     * The meta object id for the '<em>Multi Instance Flow Condition Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.MultiInstanceFlowCondition
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getMultiInstanceFlowConditionObject()
     * @generated
     */
    int MULTI_INSTANCE_FLOW_CONDITION_OBJECT = 150;

    /**
     * The meta object id for the '<em>Process Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.ProcessType
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getProcessTypeObject()
     * @generated
     */
    int PROCESS_TYPE_OBJECT = 151;

    /**
     * The meta object id for the '<em>Relationship Direction Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.RelationshipDirection
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getRelationshipDirectionObject()
     * @generated
     */
    int RELATIONSHIP_DIRECTION_OBJECT = 152;

    /**
     * The meta object id for the '<em>Service Implementation Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.ServiceImplementation
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getServiceImplementationObject()
     * @generated
     */
    int SERVICE_IMPLEMENTATION_OBJECT = 153;

    /**
     * The meta object id for the '<em>Transaction Method Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.TransactionMethod
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getTransactionMethodObject()
     * @generated
     */
    int TRANSACTION_METHOD_OBJECT = 154;

    /**
     * The meta object id for the '<em>User Task Implementation Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.UserTaskImplementation
     * @see org.eclipse.mdt.bpmn.impl.BpmnPackageImpl#getUserTaskImplementationObject()
     * @generated
     */
    int USER_TASK_IMPLEMENTATION_OBJECT = 155;

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.eclipse.mdt.bpmn.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.eclipse.mdt.bpmn.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getActivity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activity</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Activity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getActivityResource <em>Activity Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activity Resource</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getActivityResource()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ActivityResource();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Ad Hoc Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getAdHocSubProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_AdHocSubProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getFlowElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FlowElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getArtifact()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Artifact();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Assignment</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getAssignment()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Assignment();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Association</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Association();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getAuditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Auditing</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getAuditing()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Auditing();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getBaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Base Element</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getBaseElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BaseElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Base Element With Mixed Content</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getBaseElementWithMixedContent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BaseElementWithMixedContent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getBoundaryEvent <em>Boundary Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Boundary Event</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getBoundaryEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BoundaryEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getBusinessRuleTask <em>Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Business Rule Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getBusinessRuleTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BusinessRuleTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Callable Element</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCallableElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CallableElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallActivity <em>Call Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Call Activity</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCallActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CallActivity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallChoreographyActivity <em>Call Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Call Choreography Activity</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCallChoreographyActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CallChoreographyActivity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallConversation <em>Call Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Call Conversation</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCallConversation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CallConversation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getConversationNode <em>Conversation Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conversation Node</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getConversationNode()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ConversationNode();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCancelEventDefinition <em>Cancel Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cancel Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCancelEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CancelEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getRootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root Element</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getRootElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_RootElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCatchEvent <em>Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Catch Event</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCatchEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CatchEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Category</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCategory()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Category();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Category Value</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCategoryValue()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CategoryValue();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreography <em>Choreography</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choreography</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getChoreography()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Choreography();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreographyActivity <em>Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choreography Activity</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getChoreographyActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ChoreographyActivity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreographySubProcess <em>Choreography Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choreography Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getChoreographySubProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ChoreographySubProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreographyTask <em>Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choreography Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getChoreographyTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ChoreographyTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCollaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Collaboration</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCollaboration()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Collaboration();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCommunication <em>Communication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Communication</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCommunication()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Communication();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCompensateEventDefinition <em>Compensate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Compensate Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCompensateEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CompensateEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Complex Behavior Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getComplexBehaviorDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ComplexBehaviorDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getComplexGateway <em>Complex Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Complex Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getComplexGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ComplexGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getConditionalEventDefinition <em>Conditional Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conditional Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getConditionalEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ConditionalEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getConversation <em>Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conversation</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getConversation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Conversation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getConversationAssociation <em>Conversation Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conversation Association</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getConversationAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ConversationAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationKey <em>Correlation Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Key</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationKey()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CorrelationKey();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationProperty <em>Correlation Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Property</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationProperty()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CorrelationProperty();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Property Binding</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationPropertyBinding()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CorrelationPropertyBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Property Retrieval Expression</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationPropertyRetrievalExpression()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CorrelationPropertyRetrievalExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationSubscription <em>Correlation Subscription</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Subscription</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationSubscription()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CorrelationSubscription();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataAssociation <em>Data Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Association</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDataAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Input</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDataInput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataInput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Input Association</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDataInputAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataInputAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Object</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDataObject()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataObject();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Output</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDataOutput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataOutput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Output Association</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDataOutputAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataOutputAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDataState()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataState();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataStore <em>Data Store</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Store</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDataStore()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataStore();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataStoreReference <em>Data Store Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Store Reference</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDataStoreReference()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataStoreReference();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDefinitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Definitions</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDefinitions()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Definitions();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getDocumentation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEndEvent <em>End Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>End Event</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getEndEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EndEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEndPoint <em>End Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>End Point</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getEndPoint()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EndPoint();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getError <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Error</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getError()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Error();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getErrorEventDefinition <em>Error Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Error Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getErrorEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ErrorEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEscalation <em>Escalation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Escalation</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getEscalation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Escalation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEscalationEventDefinition <em>Escalation Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Escalation Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getEscalationEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EscalationEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEvent <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Event();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEventBasedGateway <em>Event Based Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Based Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getEventBasedGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventBasedGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getExclusiveGateway <em>Exclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Exclusive Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getExclusiveGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ExclusiveGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getExpression()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Expression();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extension</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getExtension()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Extension();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getFlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Flow Node</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getFlowNode()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FlowNode();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getFormalExpression <em>Formal Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Formal Expression</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getFormalExpression()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FormalExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGateway <em>Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Gateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Business Rule Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getGlobalBusinessRuleTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalBusinessRuleTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalChoreographyTask <em>Global Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Choreography Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getGlobalChoreographyTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalChoreographyTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalCommunication <em>Global Communication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Communication</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getGlobalCommunication()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalCommunication();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalManualTask <em>Global Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Manual Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getGlobalManualTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalManualTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalScriptTask <em>Global Script Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Script Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getGlobalScriptTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalScriptTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalTask <em>Global Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getGlobalTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalUserTask <em>Global User Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global User Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getGlobalUserTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalUserTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Group</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getGroup()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Group();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getHumanPerformer <em>Human Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Human Performer</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getHumanPerformer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_HumanPerformer();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getPerformer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Performer</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getPerformer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Performer();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getImplicitThrowEvent <em>Implicit Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implicit Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getImplicitThrowEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ImplicitThrowEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getImport()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Import();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getInclusiveGateway <em>Inclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inclusive Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getInclusiveGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_InclusiveGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getInputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Set</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getInputSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_InputSet();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getInterface()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Interface();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Intermediate Catch Event</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getIntermediateCatchEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IntermediateCatchEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Intermediate Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getIntermediateThrowEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IntermediateThrowEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getIoBinding <em>Io Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Io Binding</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getIoBinding()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IoBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getIoSpecification <em>Io Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Io Specification</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getIoSpecification()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IoSpecification();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getItemDefinition <em>Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Item Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getItemDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ItemDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getLane <em>Lane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Lane</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getLane()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Lane();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getLaneSet <em>Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Lane Set</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getLaneSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LaneSet();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getLinkEventDefinition <em>Link Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Link Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getLinkEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LinkEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getLoopCharacteristics <em>Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getLoopCharacteristics()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getManualTask <em>Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manual Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getManualTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ManualTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessage <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getMessage()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Message();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessageEventDefinition <em>Message Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getMessageEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MessageEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getMessageFlow()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MessageFlow();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessageFlowAssociation <em>Message Flow Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Flow Association</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getMessageFlowAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MessageFlowAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMonitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Monitoring</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getMonitoring()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Monitoring();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Multi Instance Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getMultiInstanceLoopCharacteristics()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MultiInstanceLoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getOperation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Operation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getOutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Set</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getOutputSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OutputSet();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getParallelGateway <em>Parallel Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parallel Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getParallelGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ParallelGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getParticipant()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Participant();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getParticipantAssociation <em>Participant Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Participant Association</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getParticipantAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ParticipantAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getParticipantMultiplicity <em>Participant Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Participant Multiplicity</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getParticipantMultiplicity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ParticipantMultiplicity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getPartnerEntity <em>Partner Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Partner Entity</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getPartnerEntity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PartnerEntity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getPartnerRole <em>Partner Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Partner Role</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getPartnerRole()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PartnerRole();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getPotentialOwner <em>Potential Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Potential Owner</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getPotentialOwner()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PotentialOwner();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Process</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Process();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Property</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getProperty()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Property();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getReceiveTask <em>Receive Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Receive Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getReceiveTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ReceiveTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getRelationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Relationship</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getRelationship()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Relationship();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getRendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rendering</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getRendering()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Rendering();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getResource()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Resource();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Assignment Expression</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getResourceAssignmentExpression()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ResourceAssignmentExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getResourceParameter <em>Resource Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Parameter</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getResourceParameter()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ResourceParameter();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getResourceParameterBinding <em>Resource Parameter Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Parameter Binding</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getResourceParameterBinding()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ResourceParameterBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Script</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getScript()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Script();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getScriptTask <em>Script Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Script Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getScriptTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ScriptTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSendTask <em>Send Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Send Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getSendTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SendTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence Flow</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getSequenceFlow()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SequenceFlow();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getServiceTask <em>Service Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getServiceTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ServiceTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Signal</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getSignal()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Signal();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSignalEventDefinition <em>Signal Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Signal Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getSignalEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SignalEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Standard Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getStandardLoopCharacteristics()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_StandardLoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getStartEvent <em>Start Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Start Event</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getStartEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_StartEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSubConversation <em>Sub Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sub Conversation</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getSubConversation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SubConversation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSubProcess <em>Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getSubProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SubProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Task();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTerminateEventDefinition <em>Terminate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Terminate Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getTerminateEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TerminateEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getText()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Text();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTextAnnotation <em>Text Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text Annotation</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getTextAnnotation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TextAnnotation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getThrowEvent <em>Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getThrowEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ThrowEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTimerEventDefinition <em>Timer Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timer Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getTimerEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TimerEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTransaction <em>Transaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transaction</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getTransaction()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Transaction();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DocumentRoot#getUserTask <em>User Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>User Task</em>'.
     * @see org.eclipse.mdt.bpmn.DocumentRoot#getUserTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_UserTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity</em>'.
     * @see org.eclipse.mdt.bpmn.Activity
     * @generated
     */
    EClass getActivity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Activity#getIoSpecification <em>Io Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Io Specification</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getIoSpecification()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_IoSpecification();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Activity#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getProperties()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_Properties();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Activity#getDataInputAssociations <em>Data Input Associations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Input Associations</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getDataInputAssociations()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_DataInputAssociations();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Activity#getDataOutputAssociations <em>Data Output Associations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Output Associations</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getDataOutputAssociations()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_DataOutputAssociations();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Activity#getActivityResourceGroups <em>Activity Resource Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Activity Resource Groups</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getActivityResourceGroups()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_ActivityResourceGroups();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Activity#getActivityResources <em>Activity Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Activity Resources</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getActivityResources()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_ActivityResources();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Activity#getLoopCharacteristicsGroup <em>Loop Characteristics Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Loop Characteristics Group</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getLoopCharacteristicsGroup()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_LoopCharacteristicsGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getLoopCharacteristics()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_LoopCharacteristics();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Activity#getCompletionQuantity <em>Completion Quantity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Completion Quantity</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getCompletionQuantity()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_CompletionQuantity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Activity#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getDefault()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_Default();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Activity#isIsForCompensation <em>Is For Compensation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is For Compensation</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#isIsForCompensation()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_IsForCompensation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Activity#getStartQuantity <em>Start Quantity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Quantity</em>'.
     * @see org.eclipse.mdt.bpmn.Activity#getStartQuantity()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_StartQuantity();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ActivityResource <em>Activity Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Resource</em>'.
     * @see org.eclipse.mdt.bpmn.ActivityResource
     * @generated
     */
    EClass getActivityResource();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.ActivityResource#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Resource Assignment Expression</em>'.
     * @see org.eclipse.mdt.bpmn.ActivityResource#getResourceAssignmentExpression()
     * @see #getActivityResource()
     * @generated
     */
    EReference getActivityResource_ResourceAssignmentExpression();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.ActivityResource#getResourceParameterBinding <em>Resource Parameter Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resource Parameter Binding</em>'.
     * @see org.eclipse.mdt.bpmn.ActivityResource#getResourceParameterBinding()
     * @see #getActivityResource()
     * @generated
     */
    EReference getActivityResource_ResourceParameterBinding();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ActivityResource#getResourceRef <em>Resource Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ActivityResource#getResourceRef()
     * @see #getActivityResource()
     * @generated
     */
    EAttribute getActivityResource_ResourceRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ad Hoc Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn.AdHocSubProcess
     * @generated
     */
    EClass getAdHocSubProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Completion Condition</em>'.
     * @see org.eclipse.mdt.bpmn.AdHocSubProcess#getCompletionCondition()
     * @see #getAdHocSubProcess()
     * @generated
     */
    EReference getAdHocSubProcess_CompletionCondition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cancel Remaining Instances</em>'.
     * @see org.eclipse.mdt.bpmn.AdHocSubProcess#isCancelRemainingInstances()
     * @see #getAdHocSubProcess()
     * @generated
     */
    EAttribute getAdHocSubProcess_CancelRemainingInstances();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#getOrdering <em>Ordering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ordering</em>'.
     * @see org.eclipse.mdt.bpmn.AdHocSubProcess#getOrdering()
     * @see #getAdHocSubProcess()
     * @generated
     */
    EAttribute getAdHocSubProcess_Ordering();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Artifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn.Artifact
     * @generated
     */
    EClass getArtifact();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see org.eclipse.mdt.bpmn.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Assignment#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>From</em>'.
     * @see org.eclipse.mdt.bpmn.Assignment#getFrom()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_From();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Assignment#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>To</em>'.
     * @see org.eclipse.mdt.bpmn.Assignment#getTo()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_To();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Assignment#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see org.eclipse.mdt.bpmn.Assignment#getLanguage()
     * @see #getAssignment()
     * @generated
     */
    EAttribute getAssignment_Language();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association</em>'.
     * @see org.eclipse.mdt.bpmn.Association
     * @generated
     */
    EClass getAssociation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Association#getAssociationDirection <em>Association Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Association Direction</em>'.
     * @see org.eclipse.mdt.bpmn.Association#getAssociationDirection()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_AssociationDirection();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Association#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Association#getSourceRef()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Association#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Association#getTargetRef()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Auditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Auditing</em>'.
     * @see org.eclipse.mdt.bpmn.Auditing
     * @generated
     */
    EClass getAuditing();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Element</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElement
     * @generated
     */
    EClass getBaseElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.BaseElement#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElement#getDocumentation()
     * @see #getBaseElement()
     * @generated
     */
    EReference getBaseElement_Documentation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.BaseElement#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElement#getAny()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_Any();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.BaseElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElement#getId()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_Id();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.BaseElement#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElement#getAnyAttribute()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.BaseElementWithMixedContent <em>Base Element With Mixed Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Element With Mixed Content</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElementWithMixedContent
     * @generated
     */
    EClass getBaseElementWithMixedContent();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getMixed()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EAttribute getBaseElementWithMixedContent_Mixed();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getDocumentation()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EReference getBaseElementWithMixedContent_Documentation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Category</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getCategory()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EReference getBaseElementWithMixedContent_Category();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getAny()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EAttribute getBaseElementWithMixedContent_Any();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getId()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EAttribute getBaseElementWithMixedContent_Id();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.mdt.bpmn.BaseElementWithMixedContent#getAnyAttribute()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EAttribute getBaseElementWithMixedContent_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.BoundaryEvent <em>Boundary Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boundary Event</em>'.
     * @see org.eclipse.mdt.bpmn.BoundaryEvent
     * @generated
     */
    EClass getBoundaryEvent();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attached To Ref</em>'.
     * @see org.eclipse.mdt.bpmn.BoundaryEvent#getAttachedToRef()
     * @see #getBoundaryEvent()
     * @generated
     */
    EAttribute getBoundaryEvent_AttachedToRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cancel Activity</em>'.
     * @see org.eclipse.mdt.bpmn.BoundaryEvent#isCancelActivity()
     * @see #getBoundaryEvent()
     * @generated
     */
    EAttribute getBoundaryEvent_CancelActivity();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.BusinessRuleTask <em>Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Rule Task</em>'.
     * @see org.eclipse.mdt.bpmn.BusinessRuleTask
     * @generated
     */
    EClass getBusinessRuleTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Callable Element</em>'.
     * @see org.eclipse.mdt.bpmn.CallableElement
     * @generated
     */
    EClass getCallableElement();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.CallableElement#getSupportedInterfaceRef <em>Supported Interface Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Supported Interface Ref</em>'.
     * @see org.eclipse.mdt.bpmn.CallableElement#getSupportedInterfaceRef()
     * @see #getCallableElement()
     * @generated
     */
    EAttribute getCallableElement_SupportedInterfaceRef();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.CallableElement#getIoSpecification <em>Io Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Io Specification</em>'.
     * @see org.eclipse.mdt.bpmn.CallableElement#getIoSpecification()
     * @see #getCallableElement()
     * @generated
     */
    EReference getCallableElement_IoSpecification();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.CallableElement#getIoBinding <em>Io Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Io Binding</em>'.
     * @see org.eclipse.mdt.bpmn.CallableElement#getIoBinding()
     * @see #getCallableElement()
     * @generated
     */
    EReference getCallableElement_IoBinding();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CallableElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.CallableElement#getName()
     * @see #getCallableElement()
     * @generated
     */
    EAttribute getCallableElement_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CallActivity <em>Call Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Call Activity</em>'.
     * @see org.eclipse.mdt.bpmn.CallActivity
     * @generated
     */
    EClass getCallActivity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CallActivity#getCalledElement <em>Called Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Called Element</em>'.
     * @see org.eclipse.mdt.bpmn.CallActivity#getCalledElement()
     * @see #getCallActivity()
     * @generated
     */
    EAttribute getCallActivity_CalledElement();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CallChoreographyActivity <em>Call Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Call Choreography Activity</em>'.
     * @see org.eclipse.mdt.bpmn.CallChoreographyActivity
     * @generated
     */
    EClass getCallChoreographyActivity();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.CallChoreographyActivity#getParticipantAssociation <em>Participant Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant Association</em>'.
     * @see org.eclipse.mdt.bpmn.CallChoreographyActivity#getParticipantAssociation()
     * @see #getCallChoreographyActivity()
     * @generated
     */
    EReference getCallChoreographyActivity_ParticipantAssociation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CallChoreographyActivity#getCalledElement <em>Called Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Called Element</em>'.
     * @see org.eclipse.mdt.bpmn.CallChoreographyActivity#getCalledElement()
     * @see #getCallChoreographyActivity()
     * @generated
     */
    EAttribute getCallChoreographyActivity_CalledElement();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CallConversation <em>Call Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Call Conversation</em>'.
     * @see org.eclipse.mdt.bpmn.CallConversation
     * @generated
     */
    EClass getCallConversation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.CallConversation#getParticipantAssociation <em>Participant Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant Association</em>'.
     * @see org.eclipse.mdt.bpmn.CallConversation#getParticipantAssociation()
     * @see #getCallConversation()
     * @generated
     */
    EReference getCallConversation_ParticipantAssociation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CallConversation#getCalledElementRef <em>Called Element Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Called Element Ref</em>'.
     * @see org.eclipse.mdt.bpmn.CallConversation#getCalledElementRef()
     * @see #getCallConversation()
     * @generated
     */
    EAttribute getCallConversation_CalledElementRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CancelEventDefinition <em>Cancel Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cancel Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.CancelEventDefinition
     * @generated
     */
    EClass getCancelEventDefinition();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CatchEvent <em>Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Catch Event</em>'.
     * @see org.eclipse.mdt.bpmn.CatchEvent
     * @generated
     */
    EClass getCatchEvent();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.CatchEvent#getDataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Output</em>'.
     * @see org.eclipse.mdt.bpmn.CatchEvent#getDataOutput()
     * @see #getCatchEvent()
     * @generated
     */
    EReference getCatchEvent_DataOutput();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.CatchEvent#getDataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Output Association</em>'.
     * @see org.eclipse.mdt.bpmn.CatchEvent#getDataOutputAssociation()
     * @see #getCatchEvent()
     * @generated
     */
    EReference getCatchEvent_DataOutputAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.CatchEvent#getOutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Set</em>'.
     * @see org.eclipse.mdt.bpmn.CatchEvent#getOutputSet()
     * @see #getCatchEvent()
     * @generated
     */
    EReference getCatchEvent_OutputSet();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.CatchEvent#getEventDefinitionGroup <em>Event Definition Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Event Definition Group</em>'.
     * @see org.eclipse.mdt.bpmn.CatchEvent#getEventDefinitionGroup()
     * @see #getCatchEvent()
     * @generated
     */
    EAttribute getCatchEvent_EventDefinitionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.CatchEvent#getEventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.CatchEvent#getEventDefinition()
     * @see #getCatchEvent()
     * @generated
     */
    EReference getCatchEvent_EventDefinition();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.CatchEvent#getEventDefinitionRef <em>Event Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Event Definition Ref</em>'.
     * @see org.eclipse.mdt.bpmn.CatchEvent#getEventDefinitionRef()
     * @see #getCatchEvent()
     * @generated
     */
    EAttribute getCatchEvent_EventDefinitionRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parallel Multiple</em>'.
     * @see org.eclipse.mdt.bpmn.CatchEvent#isParallelMultiple()
     * @see #getCatchEvent()
     * @generated
     */
    EAttribute getCatchEvent_ParallelMultiple();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Category <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Category</em>'.
     * @see org.eclipse.mdt.bpmn.Category
     * @generated
     */
    EClass getCategory();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Category#getCategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Category Value</em>'.
     * @see org.eclipse.mdt.bpmn.Category#getCategoryValue()
     * @see #getCategory()
     * @generated
     */
    EReference getCategory_CategoryValue();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Category Value</em>'.
     * @see org.eclipse.mdt.bpmn.CategoryValue
     * @generated
     */
    EClass getCategoryValue();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CategoryValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.eclipse.mdt.bpmn.CategoryValue#getValue()
     * @see #getCategoryValue()
     * @generated
     */
    EAttribute getCategoryValue_Value();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Choreography <em>Choreography</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Choreography</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography
     * @generated
     */
    EClass getChoreography();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Choreography#getFlowElementGroup <em>Flow Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getFlowElementGroup()
     * @see #getChoreography()
     * @generated
     */
    EAttribute getChoreography_FlowElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Choreography#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getFlowElement()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_FlowElement();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Choreography#getArtifactGroup <em>Artifact Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Artifact Group</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getArtifactGroup()
     * @see #getChoreography()
     * @generated
     */
    EAttribute getChoreography_ArtifactGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Choreography#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getArtifact()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_Artifact();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Choreography#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getMessageFlow()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_MessageFlow();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Choreography#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getParticipant()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_Participant();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Choreography#getConversation <em>Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conversation</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getConversation()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_Conversation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Choreography#getConversationAssociation <em>Conversation Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conversation Association</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getConversationAssociation()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_ConversationAssociation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Choreography#getMessageFlowAssociation <em>Message Flow Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow Association</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getMessageFlowAssociation()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_MessageFlowAssociation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Choreography#getParticipantAssociation <em>Participant Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant Association</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#getParticipantAssociation()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_ParticipantAssociation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Choreography#isIsClosed <em>Is Closed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Closed</em>'.
     * @see org.eclipse.mdt.bpmn.Choreography#isIsClosed()
     * @see #getChoreography()
     * @generated
     */
    EAttribute getChoreography_IsClosed();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ChoreographyActivity <em>Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Choreography Activity</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographyActivity
     * @generated
     */
    EClass getChoreographyActivity();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ChoreographyActivity#getParticipantRef <em>Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographyActivity#getParticipantRef()
     * @see #getChoreographyActivity()
     * @generated
     */
    EAttribute getChoreographyActivity_ParticipantRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initiating Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographyActivity#getInitiatingParticipantRef()
     * @see #getChoreographyActivity()
     * @generated
     */
    EAttribute getChoreographyActivity_InitiatingParticipantRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ChoreographySubProcess <em>Choreography Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Choreography Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographySubProcess
     * @generated
     */
    EClass getChoreographySubProcess();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ChoreographySubProcess#getFlowElementGroup <em>Flow Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographySubProcess#getFlowElementGroup()
     * @see #getChoreographySubProcess()
     * @generated
     */
    EAttribute getChoreographySubProcess_FlowElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.ChoreographySubProcess#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographySubProcess#getFlowElement()
     * @see #getChoreographySubProcess()
     * @generated
     */
    EReference getChoreographySubProcess_FlowElement();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ChoreographySubProcess#getArtifactGroup <em>Artifact Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Artifact Group</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographySubProcess#getArtifactGroup()
     * @see #getChoreographySubProcess()
     * @generated
     */
    EAttribute getChoreographySubProcess_ArtifactGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.ChoreographySubProcess#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographySubProcess#getArtifact()
     * @see #getChoreographySubProcess()
     * @generated
     */
    EReference getChoreographySubProcess_Artifact();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ChoreographyTask <em>Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Choreography Task</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographyTask
     * @generated
     */
    EClass getChoreographyTask();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ChoreographyTask#getMessageFlowRef <em>Message Flow Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Message Flow Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ChoreographyTask#getMessageFlowRef()
     * @see #getChoreographyTask()
     * @generated
     */
    EAttribute getChoreographyTask_MessageFlowRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Collaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Collaboration</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration
     * @generated
     */
    EClass getCollaboration();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Collaboration#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getParticipant()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_Participant();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Collaboration#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getMessageFlow()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_MessageFlow();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Collaboration#getArtifactGroup <em>Artifact Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Artifact Group</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getArtifactGroup()
     * @see #getCollaboration()
     * @generated
     */
    EAttribute getCollaboration_ArtifactGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Collaboration#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getArtifact()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_Artifact();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Collaboration#getConversation <em>Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conversation</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getConversation()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_Conversation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Collaboration#getConversationAssociation <em>Conversation Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conversation Association</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getConversationAssociation()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_ConversationAssociation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Collaboration#getParticipantAssociation <em>Participant Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant Association</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getParticipantAssociation()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_ParticipantAssociation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Collaboration#getMessageFlowAssociation <em>Message Flow Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow Association</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getMessageFlowAssociation()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_MessageFlowAssociation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Collaboration#getChoreographyRef <em>Choreography Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Choreography Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getChoreographyRef()
     * @see #getCollaboration()
     * @generated
     */
    EAttribute getCollaboration_ChoreographyRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Collaboration#isIsClosed <em>Is Closed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Closed</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#isIsClosed()
     * @see #getCollaboration()
     * @generated
     */
    EAttribute getCollaboration_IsClosed();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Collaboration#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.Collaboration#getName()
     * @see #getCollaboration()
     * @generated
     */
    EAttribute getCollaboration_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Communication <em>Communication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Communication</em>'.
     * @see org.eclipse.mdt.bpmn.Communication
     * @generated
     */
    EClass getCommunication();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Communication#getMessageFlowRef <em>Message Flow Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Message Flow Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Communication#getMessageFlowRef()
     * @see #getCommunication()
     * @generated
     */
    EAttribute getCommunication_MessageFlowRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Communication#getCorrelationKeyRef <em>Correlation Key Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Correlation Key Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Communication#getCorrelationKeyRef()
     * @see #getCommunication()
     * @generated
     */
    EAttribute getCommunication_CorrelationKeyRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Compensate Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.CompensateEventDefinition
     * @generated
     */
    EClass getCompensateEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Activity Ref</em>'.
     * @see org.eclipse.mdt.bpmn.CompensateEventDefinition#getActivityRef()
     * @see #getCompensateEventDefinition()
     * @generated
     */
    EAttribute getCompensateEventDefinition_ActivityRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wait For Completion</em>'.
     * @see org.eclipse.mdt.bpmn.CompensateEventDefinition#isWaitForCompletion()
     * @see #getCompensateEventDefinition()
     * @generated
     */
    EAttribute getCompensateEventDefinition_WaitForCompletion();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Behavior Definition</em>'.
     * @see org.eclipse.mdt.bpmn.ComplexBehaviorDefinition
     * @generated
     */
    EClass getComplexBehaviorDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.ComplexBehaviorDefinition#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.eclipse.mdt.bpmn.ComplexBehaviorDefinition#getCondition()
     * @see #getComplexBehaviorDefinition()
     * @generated
     */
    EReference getComplexBehaviorDefinition_Condition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.ComplexBehaviorDefinition#getEvent <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event</em>'.
     * @see org.eclipse.mdt.bpmn.ComplexBehaviorDefinition#getEvent()
     * @see #getComplexBehaviorDefinition()
     * @generated
     */
    EReference getComplexBehaviorDefinition_Event();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ComplexGateway <em>Complex Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.ComplexGateway
     * @generated
     */
    EClass getComplexGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.ComplexGateway#getActivationCondition <em>Activation Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activation Condition</em>'.
     * @see org.eclipse.mdt.bpmn.ComplexGateway#getActivationCondition()
     * @see #getComplexGateway()
     * @generated
     */
    EReference getComplexGateway_ActivationCondition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ComplexGateway#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.eclipse.mdt.bpmn.ComplexGateway#getDefault()
     * @see #getComplexGateway()
     * @generated
     */
    EAttribute getComplexGateway_Default();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.ConditionalEventDefinition
     * @generated
     */
    EClass getConditionalEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.ConditionalEventDefinition#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.eclipse.mdt.bpmn.ConditionalEventDefinition#getCondition()
     * @see #getConditionalEventDefinition()
     * @generated
     */
    EReference getConditionalEventDefinition_Condition();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Conversation <em>Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conversation</em>'.
     * @see org.eclipse.mdt.bpmn.Conversation
     * @generated
     */
    EClass getConversation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Conversation#getConversationNodeGroup <em>Conversation Node Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Conversation Node Group</em>'.
     * @see org.eclipse.mdt.bpmn.Conversation#getConversationNodeGroup()
     * @see #getConversation()
     * @generated
     */
    EAttribute getConversation_ConversationNodeGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Conversation#getConversationNode <em>Conversation Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conversation Node</em>'.
     * @see org.eclipse.mdt.bpmn.Conversation#getConversationNode()
     * @see #getConversation()
     * @generated
     */
    EReference getConversation_ConversationNode();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Conversation#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn.Conversation#getParticipant()
     * @see #getConversation()
     * @generated
     */
    EReference getConversation_Participant();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Conversation#getArtifactGroup <em>Artifact Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Artifact Group</em>'.
     * @see org.eclipse.mdt.bpmn.Conversation#getArtifactGroup()
     * @see #getConversation()
     * @generated
     */
    EAttribute getConversation_ArtifactGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Conversation#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn.Conversation#getArtifact()
     * @see #getConversation()
     * @generated
     */
    EReference getConversation_Artifact();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Conversation#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn.Conversation#getMessageFlow()
     * @see #getConversation()
     * @generated
     */
    EReference getConversation_MessageFlow();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Conversation#getMessageFlowRef <em>Message Flow Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Message Flow Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Conversation#getMessageFlowRef()
     * @see #getConversation()
     * @generated
     */
    EAttribute getConversation_MessageFlowRef();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Conversation#getCorrelationKey <em>Correlation Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Correlation Key</em>'.
     * @see org.eclipse.mdt.bpmn.Conversation#getCorrelationKey()
     * @see #getConversation()
     * @generated
     */
    EReference getConversation_CorrelationKey();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ConversationAssociation <em>Conversation Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conversation Association</em>'.
     * @see org.eclipse.mdt.bpmn.ConversationAssociation
     * @generated
     */
    EClass getConversationAssociation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ConversationAssociation#getMessageFlowRef <em>Message Flow Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Message Flow Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ConversationAssociation#getMessageFlowRef()
     * @see #getConversationAssociation()
     * @generated
     */
    EAttribute getConversationAssociation_MessageFlowRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ConversationAssociation#getConversationRef <em>Conversation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Conversation Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ConversationAssociation#getConversationRef()
     * @see #getConversationAssociation()
     * @generated
     */
    EAttribute getConversationAssociation_ConversationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ConversationAssociation#getCorrelationKeyRef <em>Correlation Key Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Correlation Key Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ConversationAssociation#getCorrelationKeyRef()
     * @see #getConversationAssociation()
     * @generated
     */
    EAttribute getConversationAssociation_CorrelationKeyRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ConversationNode <em>Conversation Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conversation Node</em>'.
     * @see org.eclipse.mdt.bpmn.ConversationNode
     * @generated
     */
    EClass getConversationNode();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ConversationNode#getParticipantRef <em>Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ConversationNode#getParticipantRef()
     * @see #getConversationNode()
     * @generated
     */
    EAttribute getConversationNode_ParticipantRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ConversationNode#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.ConversationNode#getName()
     * @see #getConversationNode()
     * @generated
     */
    EAttribute getConversationNode_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CorrelationKey <em>Correlation Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Correlation Key</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationKey
     * @generated
     */
    EClass getCorrelationKey();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.CorrelationKey#getCorrelationPropertyRef <em>Correlation Property Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Correlation Property Ref</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationKey#getCorrelationPropertyRef()
     * @see #getCorrelationKey()
     * @generated
     */
    EAttribute getCorrelationKey_CorrelationPropertyRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CorrelationProperty <em>Correlation Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Correlation Property</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationProperty
     * @generated
     */
    EClass getCorrelationProperty();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.CorrelationProperty#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Correlation Property Retrieval Expression</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationProperty#getCorrelationPropertyRetrievalExpression()
     * @see #getCorrelationProperty()
     * @generated
     */
    EReference getCorrelationProperty_CorrelationPropertyRetrievalExpression();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Correlation Property Binding</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationPropertyBinding
     * @generated
     */
    EClass getCorrelationPropertyBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Path</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationPropertyBinding#getDataPath()
     * @see #getCorrelationPropertyBinding()
     * @generated
     */
    EReference getCorrelationPropertyBinding_DataPath();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Correlation Property Ref</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationPropertyBinding#getCorrelationPropertyRef()
     * @see #getCorrelationPropertyBinding()
     * @generated
     */
    EAttribute getCorrelationPropertyBinding_CorrelationPropertyRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Correlation Property Retrieval Expression</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression
     * @generated
     */
    EClass getCorrelationPropertyRetrievalExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Path</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression#getMessagePath()
     * @see #getCorrelationPropertyRetrievalExpression()
     * @generated
     */
    EReference getCorrelationPropertyRetrievalExpression_MessagePath();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression#getMessageRef()
     * @see #getCorrelationPropertyRetrievalExpression()
     * @generated
     */
    EAttribute getCorrelationPropertyRetrievalExpression_MessageRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.CorrelationSubscription <em>Correlation Subscription</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Correlation Subscription</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationSubscription
     * @generated
     */
    EClass getCorrelationSubscription();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.CorrelationSubscription#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Correlation Property Binding</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationSubscription#getCorrelationPropertyBinding()
     * @see #getCorrelationSubscription()
     * @generated
     */
    EReference getCorrelationSubscription_CorrelationPropertyBinding();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Correlation Key Ref</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationSubscription#getCorrelationKeyRef()
     * @see #getCorrelationSubscription()
     * @generated
     */
    EAttribute getCorrelationSubscription_CorrelationKeyRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.CorrelationSubscription#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process</em>'.
     * @see org.eclipse.mdt.bpmn.CorrelationSubscription#getProcess()
     * @see #getCorrelationSubscription()
     * @generated
     */
    EAttribute getCorrelationSubscription_Process();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DataAssociation <em>Data Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Association</em>'.
     * @see org.eclipse.mdt.bpmn.DataAssociation
     * @generated
     */
    EClass getDataAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DataAssociation#getTransformation <em>Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transformation</em>'.
     * @see org.eclipse.mdt.bpmn.DataAssociation#getTransformation()
     * @see #getDataAssociation()
     * @generated
     */
    EReference getDataAssociation_Transformation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.DataAssociation#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assignment</em>'.
     * @see org.eclipse.mdt.bpmn.DataAssociation#getAssignment()
     * @see #getDataAssociation()
     * @generated
     */
    EReference getDataAssociation_Assignment();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Input</em>'.
     * @see org.eclipse.mdt.bpmn.DataInput
     * @generated
     */
    EClass getDataInput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DataInput#getDataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn.DataInput#getDataState()
     * @see #getDataInput()
     * @generated
     */
    EReference getDataInput_DataState();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataInput#isIsCollection <em>Is Collection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Collection</em>'.
     * @see org.eclipse.mdt.bpmn.DataInput#isIsCollection()
     * @see #getDataInput()
     * @generated
     */
    EAttribute getDataInput_IsCollection();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataInput#getItemSubjectRef <em>Item Subject Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataInput#getItemSubjectRef()
     * @see #getDataInput()
     * @generated
     */
    EAttribute getDataInput_ItemSubjectRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataInput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.DataInput#getName()
     * @see #getDataInput()
     * @generated
     */
    EAttribute getDataInput_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Input Association</em>'.
     * @see org.eclipse.mdt.bpmn.DataInputAssociation
     * @generated
     */
    EClass getDataInputAssociation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.DataInputAssociation#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataInputAssociation#getSourceRef()
     * @see #getDataInputAssociation()
     * @generated
     */
    EAttribute getDataInputAssociation_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataInputAssociation#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataInputAssociation#getTargetRef()
     * @see #getDataInputAssociation()
     * @generated
     */
    EAttribute getDataInputAssociation_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Object</em>'.
     * @see org.eclipse.mdt.bpmn.DataObject
     * @generated
     */
    EClass getDataObject();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DataObject#getDataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn.DataObject#getDataState()
     * @see #getDataObject()
     * @generated
     */
    EReference getDataObject_DataState();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataObject#isIsCollection <em>Is Collection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Collection</em>'.
     * @see org.eclipse.mdt.bpmn.DataObject#isIsCollection()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_IsCollection();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataObject#getItemSubjectRef <em>Item Subject Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataObject#getItemSubjectRef()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_ItemSubjectRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Output</em>'.
     * @see org.eclipse.mdt.bpmn.DataOutput
     * @generated
     */
    EClass getDataOutput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DataOutput#getDataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn.DataOutput#getDataState()
     * @see #getDataOutput()
     * @generated
     */
    EReference getDataOutput_DataState();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataOutput#isIsCollection <em>Is Collection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Collection</em>'.
     * @see org.eclipse.mdt.bpmn.DataOutput#isIsCollection()
     * @see #getDataOutput()
     * @generated
     */
    EAttribute getDataOutput_IsCollection();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataOutput#getItemSubjectRef <em>Item Subject Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataOutput#getItemSubjectRef()
     * @see #getDataOutput()
     * @generated
     */
    EAttribute getDataOutput_ItemSubjectRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataOutput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.DataOutput#getName()
     * @see #getDataOutput()
     * @generated
     */
    EAttribute getDataOutput_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Output Association</em>'.
     * @see org.eclipse.mdt.bpmn.DataOutputAssociation
     * @generated
     */
    EClass getDataOutputAssociation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.DataOutputAssociation#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataOutputAssociation#getSourceRef()
     * @see #getDataOutputAssociation()
     * @generated
     */
    EAttribute getDataOutputAssociation_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataOutputAssociation#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataOutputAssociation#getTargetRef()
     * @see #getDataOutputAssociation()
     * @generated
     */
    EAttribute getDataOutputAssociation_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn.DataState
     * @generated
     */
    EClass getDataState();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataState#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.DataState#getName()
     * @see #getDataState()
     * @generated
     */
    EAttribute getDataState_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DataStore <em>Data Store</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Store</em>'.
     * @see org.eclipse.mdt.bpmn.DataStore
     * @generated
     */
    EClass getDataStore();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DataStore#getDataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn.DataStore#getDataState()
     * @see #getDataStore()
     * @generated
     */
    EReference getDataStore_DataState();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataStore#getCapacity <em>Capacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Capacity</em>'.
     * @see org.eclipse.mdt.bpmn.DataStore#getCapacity()
     * @see #getDataStore()
     * @generated
     */
    EAttribute getDataStore_Capacity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataStore#isIsUnlimited <em>Is Unlimited</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Unlimited</em>'.
     * @see org.eclipse.mdt.bpmn.DataStore#isIsUnlimited()
     * @see #getDataStore()
     * @generated
     */
    EAttribute getDataStore_IsUnlimited();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataStore#getItemSubjectRef <em>Item Subject Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataStore#getItemSubjectRef()
     * @see #getDataStore()
     * @generated
     */
    EAttribute getDataStore_ItemSubjectRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataStore#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.DataStore#getName()
     * @see #getDataStore()
     * @generated
     */
    EAttribute getDataStore_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.DataStoreReference <em>Data Store Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Store Reference</em>'.
     * @see org.eclipse.mdt.bpmn.DataStoreReference
     * @generated
     */
    EClass getDataStoreReference();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.DataStoreReference#getDataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn.DataStoreReference#getDataState()
     * @see #getDataStoreReference()
     * @generated
     */
    EReference getDataStoreReference_DataState();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Store Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataStoreReference#getDataStoreRef()
     * @see #getDataStoreReference()
     * @generated
     */
    EAttribute getDataStoreReference_DataStoreRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.DataStoreReference#getItemSubjectRef <em>Item Subject Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
     * @see org.eclipse.mdt.bpmn.DataStoreReference#getItemSubjectRef()
     * @see #getDataStoreReference()
     * @generated
     */
    EAttribute getDataStoreReference_ItemSubjectRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Definitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Definitions</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions
     * @generated
     */
    EClass getDefinitions();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Definitions#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Import</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getImport()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_Import();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Definitions#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Extension</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getExtension()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_Extension();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Definitions#getRootElementGroup <em>Root Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Root Element Group</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getRootElementGroup()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_RootElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Definitions#getRootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Root Element</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getRootElement()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_RootElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Definitions#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Diagram</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getDiagram()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_Diagram();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Definitions#getRelationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relationship</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getRelationship()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_Relationship();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Definitions#getExpressionLanguage <em>Expression Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression Language</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getExpressionLanguage()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_ExpressionLanguage();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Definitions#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getId()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_Id();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Definitions#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getTargetNamespace()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_TargetNamespace();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Definitions#getTypeLanguage <em>Type Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Language</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getTypeLanguage()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_TypeLanguage();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Definitions#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.mdt.bpmn.Definitions#getAnyAttribute()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn.Documentation
     * @generated
     */
    EClass getDocumentation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Documentation#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn.Documentation#getMixed()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Documentation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn.Documentation#getAny()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Any();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Documentation#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.mdt.bpmn.Documentation#getId()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Id();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.EndEvent <em>End Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>End Event</em>'.
     * @see org.eclipse.mdt.bpmn.EndEvent
     * @generated
     */
    EClass getEndEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.EndPoint <em>End Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>End Point</em>'.
     * @see org.eclipse.mdt.bpmn.EndPoint
     * @generated
     */
    EClass getEndPoint();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Error <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Error</em>'.
     * @see org.eclipse.mdt.bpmn.Error
     * @generated
     */
    EClass getError();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Error#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Error#getStructureRef()
     * @see #getError()
     * @generated
     */
    EAttribute getError_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ErrorEventDefinition <em>Error Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Error Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.ErrorEventDefinition
     * @generated
     */
    EClass getErrorEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ErrorEventDefinition#getErrorCode <em>Error Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Error Code</em>'.
     * @see org.eclipse.mdt.bpmn.ErrorEventDefinition#getErrorCode()
     * @see #getErrorEventDefinition()
     * @generated
     */
    EAttribute getErrorEventDefinition_ErrorCode();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Error Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ErrorEventDefinition#getErrorRef()
     * @see #getErrorEventDefinition()
     * @generated
     */
    EAttribute getErrorEventDefinition_ErrorRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Escalation <em>Escalation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Escalation</em>'.
     * @see org.eclipse.mdt.bpmn.Escalation
     * @generated
     */
    EClass getEscalation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Escalation#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Escalation#getStructureRef()
     * @see #getEscalation()
     * @generated
     */
    EAttribute getEscalation_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Escalation Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.EscalationEventDefinition
     * @generated
     */
    EClass getEscalationEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.EscalationEventDefinition#getEscalationCode <em>Escalation Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Escalation Code</em>'.
     * @see org.eclipse.mdt.bpmn.EscalationEventDefinition#getEscalationCode()
     * @see #getEscalationEventDefinition()
     * @generated
     */
    EAttribute getEscalationEventDefinition_EscalationCode();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.EscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Escalation Ref</em>'.
     * @see org.eclipse.mdt.bpmn.EscalationEventDefinition#getEscalationRef()
     * @see #getEscalationEventDefinition()
     * @generated
     */
    EAttribute getEscalationEventDefinition_EscalationRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event</em>'.
     * @see org.eclipse.mdt.bpmn.Event
     * @generated
     */
    EClass getEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.EventBasedGateway <em>Event Based Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Based Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.EventBasedGateway
     * @generated
     */
    EClass getEventBasedGateway();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Event Gateway Type</em>'.
     * @see org.eclipse.mdt.bpmn.EventBasedGateway#getEventGatewayType()
     * @see #getEventBasedGateway()
     * @generated
     */
    EAttribute getEventBasedGateway_EventGatewayType();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.EventBasedGateway#isInstantiate <em>Instantiate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instantiate</em>'.
     * @see org.eclipse.mdt.bpmn.EventBasedGateway#isInstantiate()
     * @see #getEventBasedGateway()
     * @generated
     */
    EAttribute getEventBasedGateway_Instantiate();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.EventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.EventDefinition
     * @generated
     */
    EClass getEventDefinition();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ExclusiveGateway <em>Exclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exclusive Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.ExclusiveGateway
     * @generated
     */
    EClass getExclusiveGateway();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ExclusiveGateway#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.eclipse.mdt.bpmn.ExclusiveGateway#getDefault()
     * @see #getExclusiveGateway()
     * @generated
     */
    EAttribute getExclusiveGateway_Default();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see org.eclipse.mdt.bpmn.Expression
     * @generated
     */
    EClass getExpression();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Extension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extension</em>'.
     * @see org.eclipse.mdt.bpmn.Extension
     * @generated
     */
    EClass getExtension();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Extension#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn.Extension#getDocumentation()
     * @see #getExtension()
     * @generated
     */
    EReference getExtension_Documentation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Extension#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Definition</em>'.
     * @see org.eclipse.mdt.bpmn.Extension#getDefinition()
     * @see #getExtension()
     * @generated
     */
    EAttribute getExtension_Definition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Extension#isMustUnderstand <em>Must Understand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Must Understand</em>'.
     * @see org.eclipse.mdt.bpmn.Extension#isMustUnderstand()
     * @see #getExtension()
     * @generated
     */
    EAttribute getExtension_MustUnderstand();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.FlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn.FlowElement
     * @generated
     */
    EClass getFlowElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.FlowElement#getAuditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Auditing</em>'.
     * @see org.eclipse.mdt.bpmn.FlowElement#getAuditing()
     * @see #getFlowElement()
     * @generated
     */
    EReference getFlowElement_Auditing();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.FlowElement#getMonitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Monitoring</em>'.
     * @see org.eclipse.mdt.bpmn.FlowElement#getMonitoring()
     * @see #getFlowElement()
     * @generated
     */
    EReference getFlowElement_Monitoring();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Category Value Ref</em>'.
     * @see org.eclipse.mdt.bpmn.FlowElement#getCategoryValueRef()
     * @see #getFlowElement()
     * @generated
     */
    EAttribute getFlowElement_CategoryValueRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.FlowElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.FlowElement#getName()
     * @see #getFlowElement()
     * @generated
     */
    EAttribute getFlowElement_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.FlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Node</em>'.
     * @see org.eclipse.mdt.bpmn.FlowNode
     * @generated
     */
    EClass getFlowNode();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.FlowNode#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Incoming</em>'.
     * @see org.eclipse.mdt.bpmn.FlowNode#getIncoming()
     * @see #getFlowNode()
     * @generated
     */
    EAttribute getFlowNode_Incoming();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.FlowNode#getOutgoing <em>Outgoing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Outgoing</em>'.
     * @see org.eclipse.mdt.bpmn.FlowNode#getOutgoing()
     * @see #getFlowNode()
     * @generated
     */
    EAttribute getFlowNode_Outgoing();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.FormalExpression <em>Formal Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formal Expression</em>'.
     * @see org.eclipse.mdt.bpmn.FormalExpression
     * @generated
     */
    EClass getFormalExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Evaluates To Type Ref</em>'.
     * @see org.eclipse.mdt.bpmn.FormalExpression#getEvaluatesToTypeRef()
     * @see #getFormalExpression()
     * @generated
     */
    EAttribute getFormalExpression_EvaluatesToTypeRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.FormalExpression#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see org.eclipse.mdt.bpmn.FormalExpression#getLanguage()
     * @see #getFormalExpression()
     * @generated
     */
    EAttribute getFormalExpression_Language();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Gateway <em>Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.Gateway
     * @generated
     */
    EClass getGateway();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Gateway#getGatewayDirection <em>Gateway Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gateway Direction</em>'.
     * @see org.eclipse.mdt.bpmn.Gateway#getGatewayDirection()
     * @see #getGateway()
     * @generated
     */
    EAttribute getGateway_GatewayDirection();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Business Rule Task</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalBusinessRuleTask
     * @generated
     */
    EClass getGlobalBusinessRuleTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Choreography Task</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalChoreographyTask
     * @generated
     */
    EClass getGlobalChoreographyTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.GlobalChoreographyTask#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalChoreographyTask#getParticipant()
     * @see #getGlobalChoreographyTask()
     * @generated
     */
    EReference getGlobalChoreographyTask_Participant();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.GlobalChoreographyTask#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalChoreographyTask#getMessageFlow()
     * @see #getGlobalChoreographyTask()
     * @generated
     */
    EReference getGlobalChoreographyTask_MessageFlow();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initiating Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalChoreographyTask#getInitiatingParticipantRef()
     * @see #getGlobalChoreographyTask()
     * @generated
     */
    EAttribute getGlobalChoreographyTask_InitiatingParticipantRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.GlobalCommunication <em>Global Communication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Communication</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalCommunication
     * @generated
     */
    EClass getGlobalCommunication();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.GlobalCommunication#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalCommunication#getParticipant()
     * @see #getGlobalCommunication()
     * @generated
     */
    EReference getGlobalCommunication_Participant();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.GlobalCommunication#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalCommunication#getMessageFlow()
     * @see #getGlobalCommunication()
     * @generated
     */
    EReference getGlobalCommunication_MessageFlow();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.GlobalCommunication#getCorrelationKey <em>Correlation Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Correlation Key</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalCommunication#getCorrelationKey()
     * @see #getGlobalCommunication()
     * @generated
     */
    EReference getGlobalCommunication_CorrelationKey();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.GlobalManualTask <em>Global Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Manual Task</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalManualTask
     * @generated
     */
    EClass getGlobalManualTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.GlobalScriptTask <em>Global Script Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Script Task</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalScriptTask
     * @generated
     */
    EClass getGlobalScriptTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.GlobalScriptTask#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Script</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalScriptTask#getScript()
     * @see #getGlobalScriptTask()
     * @generated
     */
    EReference getGlobalScriptTask_Script();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script Language</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalScriptTask#getScriptLanguage()
     * @see #getGlobalScriptTask()
     * @generated
     */
    EAttribute getGlobalScriptTask_ScriptLanguage();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.GlobalTask <em>Global Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Task</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalTask
     * @generated
     */
    EClass getGlobalTask();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.GlobalTask#getPerformerGroup <em>Performer Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Performer Group</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalTask#getPerformerGroup()
     * @see #getGlobalTask()
     * @generated
     */
    EAttribute getGlobalTask_PerformerGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.GlobalTask#getPerformer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Performer</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalTask#getPerformer()
     * @see #getGlobalTask()
     * @generated
     */
    EReference getGlobalTask_Performer();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.GlobalUserTask <em>Global User Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global User Task</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalUserTask
     * @generated
     */
    EClass getGlobalUserTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.GlobalUserTask#getRendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rendering</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalUserTask#getRendering()
     * @see #getGlobalUserTask()
     * @generated
     */
    EReference getGlobalUserTask_Rendering();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.GlobalUserTask#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.eclipse.mdt.bpmn.GlobalUserTask#getImplementation()
     * @see #getGlobalUserTask()
     * @generated
     */
    EAttribute getGlobalUserTask_Implementation();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Group <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Group</em>'.
     * @see org.eclipse.mdt.bpmn.Group
     * @generated
     */
    EClass getGroup();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Group#getCategoryRef <em>Category Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Category Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Group#getCategoryRef()
     * @see #getGroup()
     * @generated
     */
    EAttribute getGroup_CategoryRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.HumanPerformer <em>Human Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Human Performer</em>'.
     * @see org.eclipse.mdt.bpmn.HumanPerformer
     * @generated
     */
    EClass getHumanPerformer();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ImplicitThrowEvent <em>Implicit Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implicit Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn.ImplicitThrowEvent
     * @generated
     */
    EClass getImplicitThrowEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Import <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import</em>'.
     * @see org.eclipse.mdt.bpmn.Import
     * @generated
     */
    EClass getImport();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Import#getImportType <em>Import Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Import Type</em>'.
     * @see org.eclipse.mdt.bpmn.Import#getImportType()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_ImportType();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Import#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.eclipse.mdt.bpmn.Import#getLocation()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_Location();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Import#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.eclipse.mdt.bpmn.Import#getNamespace()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_Namespace();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.InclusiveGateway <em>Inclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inclusive Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.InclusiveGateway
     * @generated
     */
    EClass getInclusiveGateway();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.InclusiveGateway#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.eclipse.mdt.bpmn.InclusiveGateway#getDefault()
     * @see #getInclusiveGateway()
     * @generated
     */
    EAttribute getInclusiveGateway_Default();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.InputOutputBinding <em>Input Output Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Output Binding</em>'.
     * @see org.eclipse.mdt.bpmn.InputOutputBinding
     * @generated
     */
    EClass getInputOutputBinding();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.InputOutputBinding#getInputDataRef <em>Input Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Data Ref</em>'.
     * @see org.eclipse.mdt.bpmn.InputOutputBinding#getInputDataRef()
     * @see #getInputOutputBinding()
     * @generated
     */
    EAttribute getInputOutputBinding_InputDataRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.InputOutputBinding#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn.InputOutputBinding#getOperationRef()
     * @see #getInputOutputBinding()
     * @generated
     */
    EAttribute getInputOutputBinding_OperationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.InputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Data Ref</em>'.
     * @see org.eclipse.mdt.bpmn.InputOutputBinding#getOutputDataRef()
     * @see #getInputOutputBinding()
     * @generated
     */
    EAttribute getInputOutputBinding_OutputDataRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.InputOutputSpecification <em>Input Output Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Output Specification</em>'.
     * @see org.eclipse.mdt.bpmn.InputOutputSpecification
     * @generated
     */
    EClass getInputOutputSpecification();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.InputOutputSpecification#getDataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Input</em>'.
     * @see org.eclipse.mdt.bpmn.InputOutputSpecification#getDataInput()
     * @see #getInputOutputSpecification()
     * @generated
     */
    EReference getInputOutputSpecification_DataInput();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.InputOutputSpecification#getDataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Output</em>'.
     * @see org.eclipse.mdt.bpmn.InputOutputSpecification#getDataOutput()
     * @see #getInputOutputSpecification()
     * @generated
     */
    EReference getInputOutputSpecification_DataOutput();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.InputOutputSpecification#getInputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input Set</em>'.
     * @see org.eclipse.mdt.bpmn.InputOutputSpecification#getInputSet()
     * @see #getInputOutputSpecification()
     * @generated
     */
    EReference getInputOutputSpecification_InputSet();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.InputOutputSpecification#getOutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output Set</em>'.
     * @see org.eclipse.mdt.bpmn.InputOutputSpecification#getOutputSet()
     * @see #getInputOutputSpecification()
     * @generated
     */
    EReference getInputOutputSpecification_OutputSet();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.InputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Set</em>'.
     * @see org.eclipse.mdt.bpmn.InputSet
     * @generated
     */
    EClass getInputSet();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Data Input Refs</em>'.
     * @see org.eclipse.mdt.bpmn.InputSet#getDataInputRefs()
     * @see #getInputSet()
     * @generated
     */
    EAttribute getInputSet_DataInputRefs();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.InputSet#getOptionalInputRefs <em>Optional Input Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Optional Input Refs</em>'.
     * @see org.eclipse.mdt.bpmn.InputSet#getOptionalInputRefs()
     * @see #getInputSet()
     * @generated
     */
    EAttribute getInputSet_OptionalInputRefs();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.InputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>While Executing Input Refs</em>'.
     * @see org.eclipse.mdt.bpmn.InputSet#getWhileExecutingInputRefs()
     * @see #getInputSet()
     * @generated
     */
    EAttribute getInputSet_WhileExecutingInputRefs();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Output Set Refs</em>'.
     * @see org.eclipse.mdt.bpmn.InputSet#getOutputSetRefs()
     * @see #getInputSet()
     * @generated
     */
    EAttribute getInputSet_OutputSetRefs();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.InputSet#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.InputSet#getName()
     * @see #getInputSet()
     * @generated
     */
    EAttribute getInputSet_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface</em>'.
     * @see org.eclipse.mdt.bpmn.Interface
     * @generated
     */
    EClass getInterface();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Interface#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operation</em>'.
     * @see org.eclipse.mdt.bpmn.Interface#getOperation()
     * @see #getInterface()
     * @generated
     */
    EReference getInterface_Operation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Interface#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.Interface#getName()
     * @see #getInterface()
     * @generated
     */
    EAttribute getInterface_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intermediate Catch Event</em>'.
     * @see org.eclipse.mdt.bpmn.IntermediateCatchEvent
     * @generated
     */
    EClass getIntermediateCatchEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intermediate Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn.IntermediateThrowEvent
     * @generated
     */
    EClass getIntermediateThrowEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ItemDefinition <em>Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Definition</em>'.
     * @see org.eclipse.mdt.bpmn.ItemDefinition
     * @generated
     */
    EClass getItemDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ItemDefinition#isIsCollection <em>Is Collection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Collection</em>'.
     * @see org.eclipse.mdt.bpmn.ItemDefinition#isIsCollection()
     * @see #getItemDefinition()
     * @generated
     */
    EAttribute getItemDefinition_IsCollection();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ItemDefinition#getItemKind <em>Item Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Item Kind</em>'.
     * @see org.eclipse.mdt.bpmn.ItemDefinition#getItemKind()
     * @see #getItemDefinition()
     * @generated
     */
    EAttribute getItemDefinition_ItemKind();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ItemDefinition#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ItemDefinition#getStructureRef()
     * @see #getItemDefinition()
     * @generated
     */
    EAttribute getItemDefinition_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Lane <em>Lane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lane</em>'.
     * @see org.eclipse.mdt.bpmn.Lane
     * @generated
     */
    EClass getLane();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Lane#getPartitionElement <em>Partition Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Partition Element</em>'.
     * @see org.eclipse.mdt.bpmn.Lane#getPartitionElement()
     * @see #getLane()
     * @generated
     */
    EReference getLane_PartitionElement();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Lane#getFlowElementRef <em>Flow Element Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Lane#getFlowElementRef()
     * @see #getLane()
     * @generated
     */
    EAttribute getLane_FlowElementRef();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Lane#getChildLaneSet <em>Child Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child Lane Set</em>'.
     * @see org.eclipse.mdt.bpmn.Lane#getChildLaneSet()
     * @see #getLane()
     * @generated
     */
    EReference getLane_ChildLaneSet();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Lane#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.Lane#getName()
     * @see #getLane()
     * @generated
     */
    EAttribute getLane_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Lane#getPartitionElementRef <em>Partition Element Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Partition Element Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Lane#getPartitionElementRef()
     * @see #getLane()
     * @generated
     */
    EAttribute getLane_PartitionElementRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.LaneSet <em>Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lane Set</em>'.
     * @see org.eclipse.mdt.bpmn.LaneSet
     * @generated
     */
    EClass getLaneSet();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.LaneSet#getLane <em>Lane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lane</em>'.
     * @see org.eclipse.mdt.bpmn.LaneSet#getLane()
     * @see #getLaneSet()
     * @generated
     */
    EReference getLaneSet_Lane();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.LinkEventDefinition <em>Link Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.LinkEventDefinition
     * @generated
     */
    EClass getLinkEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.LinkEventDefinition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.LinkEventDefinition#getName()
     * @see #getLinkEventDefinition()
     * @generated
     */
    EAttribute getLinkEventDefinition_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.LoopCharacteristics <em>Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn.LoopCharacteristics
     * @generated
     */
    EClass getLoopCharacteristics();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ManualTask <em>Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Manual Task</em>'.
     * @see org.eclipse.mdt.bpmn.ManualTask
     * @generated
     */
    EClass getManualTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Message <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message</em>'.
     * @see org.eclipse.mdt.bpmn.Message
     * @generated
     */
    EClass getMessage();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Message#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.Message#getName()
     * @see #getMessage()
     * @generated
     */
    EAttribute getMessage_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Message#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Message#getStructureRef()
     * @see #getMessage()
     * @generated
     */
    EAttribute getMessage_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.MessageEventDefinition <em>Message Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.MessageEventDefinition
     * @generated
     */
    EClass getMessageEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MessageEventDefinition#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn.MessageEventDefinition#getOperationRef()
     * @see #getMessageEventDefinition()
     * @generated
     */
    EAttribute getMessageEventDefinition_OperationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MessageEventDefinition#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn.MessageEventDefinition#getMessageRef()
     * @see #getMessageEventDefinition()
     * @generated
     */
    EAttribute getMessageEventDefinition_MessageRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.MessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn.MessageFlow
     * @generated
     */
    EClass getMessageFlow();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MessageFlow#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn.MessageFlow#getMessageRef()
     * @see #getMessageFlow()
     * @generated
     */
    EAttribute getMessageFlow_MessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MessageFlow#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.MessageFlow#getName()
     * @see #getMessageFlow()
     * @generated
     */
    EAttribute getMessageFlow_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MessageFlow#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn.MessageFlow#getSourceRef()
     * @see #getMessageFlow()
     * @generated
     */
    EAttribute getMessageFlow_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MessageFlow#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn.MessageFlow#getTargetRef()
     * @see #getMessageFlow()
     * @generated
     */
    EAttribute getMessageFlow_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.MessageFlowAssociation <em>Message Flow Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message Flow Association</em>'.
     * @see org.eclipse.mdt.bpmn.MessageFlowAssociation
     * @generated
     */
    EClass getMessageFlowAssociation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inner Message Flow Ref</em>'.
     * @see org.eclipse.mdt.bpmn.MessageFlowAssociation#getInnerMessageFlowRef()
     * @see #getMessageFlowAssociation()
     * @generated
     */
    EAttribute getMessageFlowAssociation_InnerMessageFlowRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Outer Message Flow Ref</em>'.
     * @see org.eclipse.mdt.bpmn.MessageFlowAssociation#getOuterMessageFlowRef()
     * @see #getMessageFlowAssociation()
     * @generated
     */
    EAttribute getMessageFlowAssociation_OuterMessageFlowRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Monitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Monitoring</em>'.
     * @see org.eclipse.mdt.bpmn.Monitoring
     * @generated
     */
    EClass getMonitoring();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multi Instance Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics
     * @generated
     */
    EClass getMultiInstanceLoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getLoopCardinality <em>Loop Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Cardinality</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getLoopCardinality()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_LoopCardinality();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getLoopDataInput <em>Loop Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Data Input</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getLoopDataInput()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_LoopDataInput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getLoopDataOutput <em>Loop Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Data Output</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getLoopDataOutput()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_LoopDataOutput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getInputDataItem <em>Input Data Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Data Item</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getInputDataItem()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_InputDataItem();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getOutputDataItem <em>Output Data Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Data Item</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getOutputDataItem()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_OutputDataItem();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Complex Behavior Definition</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getComplexBehaviorDefinition()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getCompletionCondition <em>Completion Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Completion Condition</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getCompletionCondition()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_CompletionCondition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Behavior</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getBehavior()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EAttribute getMultiInstanceLoopCharacteristics_Behavior();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Sequential</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#isIsSequential()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EAttribute getMultiInstanceLoopCharacteristics_IsSequential();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>None Behavior Event Ref</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getNoneBehaviorEventRef()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EAttribute getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>One Behavior Event Ref</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics#getOneBehaviorEventRef()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EAttribute getMultiInstanceLoopCharacteristics_OneBehaviorEventRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation</em>'.
     * @see org.eclipse.mdt.bpmn.Operation
     * @generated
     */
    EClass getOperation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Operation#getInMessageRef <em>In Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Operation#getInMessageRef()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_InMessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Operation#getOutMessageRef <em>Out Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Operation#getOutMessageRef()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_OutMessageRef();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Operation#getErrorRef <em>Error Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Error Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Operation#getErrorRef()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_ErrorRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Operation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.Operation#getName()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.OutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Set</em>'.
     * @see org.eclipse.mdt.bpmn.OutputSet
     * @generated
     */
    EClass getOutputSet();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Data Output Refs</em>'.
     * @see org.eclipse.mdt.bpmn.OutputSet#getDataOutputRefs()
     * @see #getOutputSet()
     * @generated
     */
    EAttribute getOutputSet_DataOutputRefs();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.OutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Optional Output Refs</em>'.
     * @see org.eclipse.mdt.bpmn.OutputSet#getOptionalOutputRefs()
     * @see #getOutputSet()
     * @generated
     */
    EAttribute getOutputSet_OptionalOutputRefs();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.OutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>While Executing Output Refs</em>'.
     * @see org.eclipse.mdt.bpmn.OutputSet#getWhileExecutingOutputRefs()
     * @see #getOutputSet()
     * @generated
     */
    EAttribute getOutputSet_WhileExecutingOutputRefs();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.OutputSet#getInputSetRefs <em>Input Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Input Set Refs</em>'.
     * @see org.eclipse.mdt.bpmn.OutputSet#getInputSetRefs()
     * @see #getOutputSet()
     * @generated
     */
    EAttribute getOutputSet_InputSetRefs();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.OutputSet#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.OutputSet#getName()
     * @see #getOutputSet()
     * @generated
     */
    EAttribute getOutputSet_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ParallelGateway <em>Parallel Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parallel Gateway</em>'.
     * @see org.eclipse.mdt.bpmn.ParallelGateway
     * @generated
     */
    EClass getParallelGateway();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Participant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn.Participant
     * @generated
     */
    EClass getParticipant();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Participant#getInterfaceRef <em>Interface Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Interface Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Participant#getInterfaceRef()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_InterfaceRef();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Participant#getEndPointRef <em>End Point Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>End Point Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Participant#getEndPointRef()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_EndPointRef();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Participant Multiplicity</em>'.
     * @see org.eclipse.mdt.bpmn.Participant#getParticipantMultiplicity()
     * @see #getParticipant()
     * @generated
     */
    EReference getParticipant_ParticipantMultiplicity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Participant#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.Participant#getName()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Participant#getPartnerEntityRef <em>Partner Entity Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Partner Entity Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Participant#getPartnerEntityRef()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_PartnerEntityRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Participant#getPartnerRoleRef <em>Partner Role Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Partner Role Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Participant#getPartnerRoleRef()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_PartnerRoleRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Participant#getProcessRef <em>Process Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Participant#getProcessRef()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_ProcessRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ParticipantAssociation <em>Participant Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Participant Association</em>'.
     * @see org.eclipse.mdt.bpmn.ParticipantAssociation
     * @generated
     */
    EClass getParticipantAssociation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inner Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ParticipantAssociation#getInnerParticipantRef()
     * @see #getParticipantAssociation()
     * @generated
     */
    EAttribute getParticipantAssociation_InnerParticipantRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Outer Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ParticipantAssociation#getOuterParticipantRef()
     * @see #getParticipantAssociation()
     * @generated
     */
    EAttribute getParticipantAssociation_OuterParticipantRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Participant Multiplicity</em>'.
     * @see org.eclipse.mdt.bpmn.ParticipantMultiplicity
     * @generated
     */
    EClass getParticipantMultiplicity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ParticipantMultiplicity#getMaximum <em>Maximum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum</em>'.
     * @see org.eclipse.mdt.bpmn.ParticipantMultiplicity#getMaximum()
     * @see #getParticipantMultiplicity()
     * @generated
     */
    EAttribute getParticipantMultiplicity_Maximum();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ParticipantMultiplicity#getMinimum <em>Minimum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Minimum</em>'.
     * @see org.eclipse.mdt.bpmn.ParticipantMultiplicity#getMinimum()
     * @see #getParticipantMultiplicity()
     * @generated
     */
    EAttribute getParticipantMultiplicity_Minimum();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.PartnerEntity <em>Partner Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Partner Entity</em>'.
     * @see org.eclipse.mdt.bpmn.PartnerEntity
     * @generated
     */
    EClass getPartnerEntity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.PartnerEntity#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.PartnerEntity#getName()
     * @see #getPartnerEntity()
     * @generated
     */
    EAttribute getPartnerEntity_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.PartnerRole <em>Partner Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Partner Role</em>'.
     * @see org.eclipse.mdt.bpmn.PartnerRole
     * @generated
     */
    EClass getPartnerRole();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.PartnerRole#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.PartnerRole#getName()
     * @see #getPartnerRole()
     * @generated
     */
    EAttribute getPartnerRole_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Performer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Performer</em>'.
     * @see org.eclipse.mdt.bpmn.Performer
     * @generated
     */
    EClass getPerformer();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.PotentialOwner <em>Potential Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Potential Owner</em>'.
     * @see org.eclipse.mdt.bpmn.PotentialOwner
     * @generated
     */
    EClass getPotentialOwner();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.eclipse.mdt.bpmn.Process
     * @generated
     */
    EClass getProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Process#getAuditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Auditing</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getAuditing()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Auditing();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Process#getMonitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Monitoring</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getMonitoring()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Monitoring();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Process#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getProperty()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Property();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Process#getLaneSet <em>Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lane Set</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getLaneSet()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_LaneSet();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Process#getFlowElementGroup <em>Flow Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getFlowElementGroup()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_FlowElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Process#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getFlowElement()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_FlowElement();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Process#getArtifactGroup <em>Artifact Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Artifact Group</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getArtifactGroup()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_ArtifactGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Process#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getArtifact()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Artifact();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Process#getSupports <em>Supports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Supports</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getSupports()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_Supports();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Definitional Collaboration Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getDefinitionalCollaborationRef()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_DefinitionalCollaborationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Process#isIsClosed <em>Is Closed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Closed</em>'.
     * @see org.eclipse.mdt.bpmn.Process#isIsClosed()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_IsClosed();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Process#getProcessType <em>Process Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Type</em>'.
     * @see org.eclipse.mdt.bpmn.Process#getProcessType()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_ProcessType();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see org.eclipse.mdt.bpmn.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.Property#getDataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn.Property#getDataState()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_DataState();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Property#getItemSubjectRef <em>Item Subject Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Property#getItemSubjectRef()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_ItemSubjectRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Property#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.Property#getName()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ReceiveTask <em>Receive Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Receive Task</em>'.
     * @see org.eclipse.mdt.bpmn.ReceiveTask
     * @generated
     */
    EClass getReceiveTask();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ReceiveTask#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.eclipse.mdt.bpmn.ReceiveTask#getImplementation()
     * @see #getReceiveTask()
     * @generated
     */
    EAttribute getReceiveTask_Implementation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ReceiveTask#isInstantiate <em>Instantiate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instantiate</em>'.
     * @see org.eclipse.mdt.bpmn.ReceiveTask#isInstantiate()
     * @see #getReceiveTask()
     * @generated
     */
    EAttribute getReceiveTask_Instantiate();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ReceiveTask#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ReceiveTask#getMessageRef()
     * @see #getReceiveTask()
     * @generated
     */
    EAttribute getReceiveTask_MessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ReceiveTask#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ReceiveTask#getOperationRef()
     * @see #getReceiveTask()
     * @generated
     */
    EAttribute getReceiveTask_OperationRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relationship</em>'.
     * @see org.eclipse.mdt.bpmn.Relationship
     * @generated
     */
    EClass getRelationship();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Relationship#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Source</em>'.
     * @see org.eclipse.mdt.bpmn.Relationship#getSource()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Source();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Relationship#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Target</em>'.
     * @see org.eclipse.mdt.bpmn.Relationship#getTarget()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Target();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Relationship#getDirection <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direction</em>'.
     * @see org.eclipse.mdt.bpmn.Relationship#getDirection()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Direction();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Relationship#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.mdt.bpmn.Relationship#getType()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Type();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Rendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rendering</em>'.
     * @see org.eclipse.mdt.bpmn.Rendering
     * @generated
     */
    EClass getRendering();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource</em>'.
     * @see org.eclipse.mdt.bpmn.Resource
     * @generated
     */
    EClass getResource();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.Resource#getResourceParameter <em>Resource Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resource Parameter</em>'.
     * @see org.eclipse.mdt.bpmn.Resource#getResourceParameter()
     * @see #getResource()
     * @generated
     */
    EReference getResource_ResourceParameter();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Resource#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.Resource#getName()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Assignment Expression</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceAssignmentExpression
     * @generated
     */
    EClass getResourceAssignmentExpression();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ResourceAssignmentExpression#getExpressionGroup <em>Expression Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Expression Group</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceAssignmentExpression#getExpressionGroup()
     * @see #getResourceAssignmentExpression()
     * @generated
     */
    EAttribute getResourceAssignmentExpression_ExpressionGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.ResourceAssignmentExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceAssignmentExpression#getExpression()
     * @see #getResourceAssignmentExpression()
     * @generated
     */
    EReference getResourceAssignmentExpression_Expression();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ResourceParameter <em>Resource Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Parameter</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceParameter
     * @generated
     */
    EClass getResourceParameter();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ResourceParameter#isIsRequired <em>Is Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Required</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceParameter#isIsRequired()
     * @see #getResourceParameter()
     * @generated
     */
    EAttribute getResourceParameter_IsRequired();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ResourceParameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceParameter#getName()
     * @see #getResourceParameter()
     * @generated
     */
    EAttribute getResourceParameter_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ResourceParameter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceParameter#getType()
     * @see #getResourceParameter()
     * @generated
     */
    EAttribute getResourceParameter_Type();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ResourceParameterBinding <em>Resource Parameter Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Parameter Binding</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceParameterBinding
     * @generated
     */
    EClass getResourceParameterBinding();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ResourceParameterBinding#getExpressionGroup <em>Expression Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Expression Group</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceParameterBinding#getExpressionGroup()
     * @see #getResourceParameterBinding()
     * @generated
     */
    EAttribute getResourceParameterBinding_ExpressionGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.ResourceParameterBinding#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceParameterBinding#getExpression()
     * @see #getResourceParameterBinding()
     * @generated
     */
    EReference getResourceParameterBinding_Expression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parameter Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ResourceParameterBinding#getParameterRef()
     * @see #getResourceParameterBinding()
     * @generated
     */
    EAttribute getResourceParameterBinding_ParameterRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.RootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Root Element</em>'.
     * @see org.eclipse.mdt.bpmn.RootElement
     * @generated
     */
    EClass getRootElement();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Script <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script</em>'.
     * @see org.eclipse.mdt.bpmn.Script
     * @generated
     */
    EClass getScript();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Script#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn.Script#getMixed()
     * @see #getScript()
     * @generated
     */
    EAttribute getScript_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Script#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn.Script#getAny()
     * @see #getScript()
     * @generated
     */
    EAttribute getScript_Any();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ScriptTask <em>Script Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Task</em>'.
     * @see org.eclipse.mdt.bpmn.ScriptTask
     * @generated
     */
    EClass getScriptTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.ScriptTask#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Script</em>'.
     * @see org.eclipse.mdt.bpmn.ScriptTask#getScript()
     * @see #getScriptTask()
     * @generated
     */
    EReference getScriptTask_Script();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ScriptTask#getScriptLanguage <em>Script Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script Language</em>'.
     * @see org.eclipse.mdt.bpmn.ScriptTask#getScriptLanguage()
     * @see #getScriptTask()
     * @generated
     */
    EAttribute getScriptTask_ScriptLanguage();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.SendTask <em>Send Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Send Task</em>'.
     * @see org.eclipse.mdt.bpmn.SendTask
     * @generated
     */
    EClass getSendTask();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.SendTask#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.eclipse.mdt.bpmn.SendTask#getImplementation()
     * @see #getSendTask()
     * @generated
     */
    EAttribute getSendTask_Implementation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.SendTask#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn.SendTask#getMessageRef()
     * @see #getSendTask()
     * @generated
     */
    EAttribute getSendTask_MessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.SendTask#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn.SendTask#getOperationRef()
     * @see #getSendTask()
     * @generated
     */
    EAttribute getSendTask_OperationRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.SequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sequence Flow</em>'.
     * @see org.eclipse.mdt.bpmn.SequenceFlow
     * @generated
     */
    EClass getSequenceFlow();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.SequenceFlow#getConditionExpression <em>Condition Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition Expression</em>'.
     * @see org.eclipse.mdt.bpmn.SequenceFlow#getConditionExpression()
     * @see #getSequenceFlow()
     * @generated
     */
    EReference getSequenceFlow_ConditionExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.SequenceFlow#isIsImmediate <em>Is Immediate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Immediate</em>'.
     * @see org.eclipse.mdt.bpmn.SequenceFlow#isIsImmediate()
     * @see #getSequenceFlow()
     * @generated
     */
    EAttribute getSequenceFlow_IsImmediate();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn.SequenceFlow#getSourceRef()
     * @see #getSequenceFlow()
     * @generated
     */
    EAttribute getSequenceFlow_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn.SequenceFlow#getTargetRef()
     * @see #getSequenceFlow()
     * @generated
     */
    EAttribute getSequenceFlow_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ServiceTask <em>Service Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Task</em>'.
     * @see org.eclipse.mdt.bpmn.ServiceTask
     * @generated
     */
    EClass getServiceTask();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ServiceTask#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.eclipse.mdt.bpmn.ServiceTask#getImplementation()
     * @see #getServiceTask()
     * @generated
     */
    EAttribute getServiceTask_Implementation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.ServiceTask#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ServiceTask#getOperationRef()
     * @see #getServiceTask()
     * @generated
     */
    EAttribute getServiceTask_OperationRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal</em>'.
     * @see org.eclipse.mdt.bpmn.Signal
     * @generated
     */
    EClass getSignal();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Signal#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.Signal#getName()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Signal#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn.Signal#getStructureRef()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.SignalEventDefinition <em>Signal Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.SignalEventDefinition
     * @generated
     */
    EClass getSignalEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Signal Ref</em>'.
     * @see org.eclipse.mdt.bpmn.SignalEventDefinition#getSignalRef()
     * @see #getSignalEventDefinition()
     * @generated
     */
    EAttribute getSignalEventDefinition_SignalRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Standard Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn.StandardLoopCharacteristics
     * @generated
     */
    EClass getStandardLoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.StandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Condition</em>'.
     * @see org.eclipse.mdt.bpmn.StandardLoopCharacteristics#getLoopCondition()
     * @see #getStandardLoopCharacteristics()
     * @generated
     */
    EReference getStandardLoopCharacteristics_LoopCondition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.StandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Loop Maximum</em>'.
     * @see org.eclipse.mdt.bpmn.StandardLoopCharacteristics#getLoopMaximum()
     * @see #getStandardLoopCharacteristics()
     * @generated
     */
    EAttribute getStandardLoopCharacteristics_LoopMaximum();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.StandardLoopCharacteristics#isTestBefore <em>Test Before</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Test Before</em>'.
     * @see org.eclipse.mdt.bpmn.StandardLoopCharacteristics#isTestBefore()
     * @see #getStandardLoopCharacteristics()
     * @generated
     */
    EAttribute getStandardLoopCharacteristics_TestBefore();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.StartEvent <em>Start Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Start Event</em>'.
     * @see org.eclipse.mdt.bpmn.StartEvent
     * @generated
     */
    EClass getStartEvent();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.StartEvent#isIsInterrupting <em>Is Interrupting</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Interrupting</em>'.
     * @see org.eclipse.mdt.bpmn.StartEvent#isIsInterrupting()
     * @see #getStartEvent()
     * @generated
     */
    EAttribute getStartEvent_IsInterrupting();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.SubConversation <em>Sub Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Conversation</em>'.
     * @see org.eclipse.mdt.bpmn.SubConversation
     * @generated
     */
    EClass getSubConversation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.SubConversation#getConversationNodeGroup <em>Conversation Node Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Conversation Node Group</em>'.
     * @see org.eclipse.mdt.bpmn.SubConversation#getConversationNodeGroup()
     * @see #getSubConversation()
     * @generated
     */
    EAttribute getSubConversation_ConversationNodeGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.SubConversation#getConversationNode <em>Conversation Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conversation Node</em>'.
     * @see org.eclipse.mdt.bpmn.SubConversation#getConversationNode()
     * @see #getSubConversation()
     * @generated
     */
    EReference getSubConversation_ConversationNode();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.SubConversation#getArtifactGroup <em>Artifact Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Artifact Group</em>'.
     * @see org.eclipse.mdt.bpmn.SubConversation#getArtifactGroup()
     * @see #getSubConversation()
     * @generated
     */
    EAttribute getSubConversation_ArtifactGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.SubConversation#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn.SubConversation#getArtifact()
     * @see #getSubConversation()
     * @generated
     */
    EReference getSubConversation_Artifact();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.SubConversation#getCorrelationKeyRef <em>Correlation Key Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Correlation Key Ref</em>'.
     * @see org.eclipse.mdt.bpmn.SubConversation#getCorrelationKeyRef()
     * @see #getSubConversation()
     * @generated
     */
    EAttribute getSubConversation_CorrelationKeyRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.SubProcess <em>Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn.SubProcess
     * @generated
     */
    EClass getSubProcess();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.SubProcess#getFlowElementGroup <em>Flow Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
     * @see org.eclipse.mdt.bpmn.SubProcess#getFlowElementGroup()
     * @see #getSubProcess()
     * @generated
     */
    EAttribute getSubProcess_FlowElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.SubProcess#getFlowElements <em>Flow Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
     * @see org.eclipse.mdt.bpmn.SubProcess#getFlowElements()
     * @see #getSubProcess()
     * @generated
     */
    EReference getSubProcess_FlowElements();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.SubProcess#getArtifactGroup <em>Artifact Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Artifact Group</em>'.
     * @see org.eclipse.mdt.bpmn.SubProcess#getArtifactGroup()
     * @see #getSubProcess()
     * @generated
     */
    EAttribute getSubProcess_ArtifactGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.SubProcess#getArtifacts <em>Artifacts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Artifacts</em>'.
     * @see org.eclipse.mdt.bpmn.SubProcess#getArtifacts()
     * @see #getSubProcess()
     * @generated
     */
    EReference getSubProcess_Artifacts();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Triggered By Event</em>'.
     * @see org.eclipse.mdt.bpmn.SubProcess#isTriggeredByEvent()
     * @see #getSubProcess()
     * @generated
     */
    EAttribute getSubProcess_TriggeredByEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task</em>'.
     * @see org.eclipse.mdt.bpmn.Task
     * @generated
     */
    EClass getTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Terminate Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.TerminateEventDefinition
     * @generated
     */
    EClass getTerminateEventDefinition();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Text <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text</em>'.
     * @see org.eclipse.mdt.bpmn.Text
     * @generated
     */
    EClass getText();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Text#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn.Text#getMixed()
     * @see #getText()
     * @generated
     */
    EAttribute getText_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.Text#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn.Text#getAny()
     * @see #getText()
     * @generated
     */
    EAttribute getText_Any();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.TextAnnotation <em>Text Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Annotation</em>'.
     * @see org.eclipse.mdt.bpmn.TextAnnotation
     * @generated
     */
    EClass getTextAnnotation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.TextAnnotation#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text</em>'.
     * @see org.eclipse.mdt.bpmn.TextAnnotation#getText()
     * @see #getTextAnnotation()
     * @generated
     */
    EReference getTextAnnotation_Text();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.ThrowEvent <em>Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn.ThrowEvent
     * @generated
     */
    EClass getThrowEvent();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.ThrowEvent#getDataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Input</em>'.
     * @see org.eclipse.mdt.bpmn.ThrowEvent#getDataInput()
     * @see #getThrowEvent()
     * @generated
     */
    EReference getThrowEvent_DataInput();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.ThrowEvent#getDataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Input Association</em>'.
     * @see org.eclipse.mdt.bpmn.ThrowEvent#getDataInputAssociation()
     * @see #getThrowEvent()
     * @generated
     */
    EReference getThrowEvent_DataInputAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.ThrowEvent#getInputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Set</em>'.
     * @see org.eclipse.mdt.bpmn.ThrowEvent#getInputSet()
     * @see #getThrowEvent()
     * @generated
     */
    EReference getThrowEvent_InputSet();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ThrowEvent#getEventDefinitionGroup <em>Event Definition Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Event Definition Group</em>'.
     * @see org.eclipse.mdt.bpmn.ThrowEvent#getEventDefinitionGroup()
     * @see #getThrowEvent()
     * @generated
     */
    EAttribute getThrowEvent_EventDefinitionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.ThrowEvent#getEventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.ThrowEvent#getEventDefinition()
     * @see #getThrowEvent()
     * @generated
     */
    EReference getThrowEvent_EventDefinition();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.ThrowEvent#getEventDefinitionRef <em>Event Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Event Definition Ref</em>'.
     * @see org.eclipse.mdt.bpmn.ThrowEvent#getEventDefinitionRef()
     * @see #getThrowEvent()
     * @generated
     */
    EAttribute getThrowEvent_EventDefinitionRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.TimerEventDefinition <em>Timer Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Timer Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn.TimerEventDefinition
     * @generated
     */
    EClass getTimerEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.TimerEventDefinition#getTimeDate <em>Time Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Time Date</em>'.
     * @see org.eclipse.mdt.bpmn.TimerEventDefinition#getTimeDate()
     * @see #getTimerEventDefinition()
     * @generated
     */
    EReference getTimerEventDefinition_TimeDate();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Time Cycle</em>'.
     * @see org.eclipse.mdt.bpmn.TimerEventDefinition#getTimeCycle()
     * @see #getTimerEventDefinition()
     * @generated
     */
    EReference getTimerEventDefinition_TimeCycle();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.Transaction <em>Transaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transaction</em>'.
     * @see org.eclipse.mdt.bpmn.Transaction
     * @generated
     */
    EClass getTransaction();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.Transaction#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Method</em>'.
     * @see org.eclipse.mdt.bpmn.Transaction#getMethod()
     * @see #getTransaction()
     * @generated
     */
    EAttribute getTransaction_Method();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.UserTask <em>User Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>User Task</em>'.
     * @see org.eclipse.mdt.bpmn.UserTask
     * @generated
     */
    EClass getUserTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.UserTask#getRendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rendering</em>'.
     * @see org.eclipse.mdt.bpmn.UserTask#getRendering()
     * @see #getUserTask()
     * @generated
     */
    EReference getUserTask_Rendering();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.UserTask#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.eclipse.mdt.bpmn.UserTask#getImplementation()
     * @see #getUserTask()
     * @generated
     */
    EAttribute getUserTask_Implementation();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.AdHocOrdering <em>Ad Hoc Ordering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Ad Hoc Ordering</em>'.
     * @see org.eclipse.mdt.bpmn.AdHocOrdering
     * @generated
     */
    EEnum getAdHocOrdering();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.AssociationDirection <em>Association Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Association Direction</em>'.
     * @see org.eclipse.mdt.bpmn.AssociationDirection
     * @generated
     */
    EEnum getAssociationDirection();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.EventBasedGatewayType <em>Event Based Gateway Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Event Based Gateway Type</em>'.
     * @see org.eclipse.mdt.bpmn.EventBasedGatewayType
     * @generated
     */
    EEnum getEventBasedGatewayType();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.GatewayDirection <em>Gateway Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Gateway Direction</em>'.
     * @see org.eclipse.mdt.bpmn.GatewayDirection
     * @generated
     */
    EEnum getGatewayDirection();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.ItemKind <em>Item Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Item Kind</em>'.
     * @see org.eclipse.mdt.bpmn.ItemKind
     * @generated
     */
    EEnum getItemKind();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.MultiInstanceFlowCondition <em>Multi Instance Flow Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Multi Instance Flow Condition</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceFlowCondition
     * @generated
     */
    EEnum getMultiInstanceFlowCondition();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.ProcessType <em>Process Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Process Type</em>'.
     * @see org.eclipse.mdt.bpmn.ProcessType
     * @generated
     */
    EEnum getProcessType();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.RelationshipDirection <em>Relationship Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Relationship Direction</em>'.
     * @see org.eclipse.mdt.bpmn.RelationshipDirection
     * @generated
     */
    EEnum getRelationshipDirection();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.ServiceImplementation <em>Service Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Service Implementation</em>'.
     * @see org.eclipse.mdt.bpmn.ServiceImplementation
     * @generated
     */
    EEnum getServiceImplementation();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.TransactionMethod <em>Transaction Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Transaction Method</em>'.
     * @see org.eclipse.mdt.bpmn.TransactionMethod
     * @generated
     */
    EEnum getTransactionMethod();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn.UserTaskImplementation <em>User Task Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>User Task Implementation</em>'.
     * @see org.eclipse.mdt.bpmn.UserTaskImplementation
     * @generated
     */
    EEnum getUserTaskImplementation();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.AdHocOrdering <em>Ad Hoc Ordering Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Ad Hoc Ordering Object</em>'.
     * @see org.eclipse.mdt.bpmn.AdHocOrdering
     * @model instanceClass="org.eclipse.mdt.bpmn.AdHocOrdering"
     *        extendedMetaData="name='tAdHocOrdering:Object' baseType='tAdHocOrdering'"
     * @generated
     */
    EDataType getAdHocOrderingObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.AssociationDirection <em>Association Direction Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Association Direction Object</em>'.
     * @see org.eclipse.mdt.bpmn.AssociationDirection
     * @model instanceClass="org.eclipse.mdt.bpmn.AssociationDirection"
     *        extendedMetaData="name='tAssociationDirection:Object' baseType='tAssociationDirection'"
     * @generated
     */
    EDataType getAssociationDirectionObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.EventBasedGatewayType <em>Event Based Gateway Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Event Based Gateway Type Object</em>'.
     * @see org.eclipse.mdt.bpmn.EventBasedGatewayType
     * @model instanceClass="org.eclipse.mdt.bpmn.EventBasedGatewayType"
     *        extendedMetaData="name='tEventBasedGatewayType:Object' baseType='tEventBasedGatewayType'"
     * @generated
     */
    EDataType getEventBasedGatewayTypeObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.GatewayDirection <em>Gateway Direction Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Gateway Direction Object</em>'.
     * @see org.eclipse.mdt.bpmn.GatewayDirection
     * @model instanceClass="org.eclipse.mdt.bpmn.GatewayDirection"
     *        extendedMetaData="name='tGatewayDirection:Object' baseType='tGatewayDirection'"
     * @generated
     */
    EDataType getGatewayDirectionObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.ItemKind <em>Item Kind Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Item Kind Object</em>'.
     * @see org.eclipse.mdt.bpmn.ItemKind
     * @model instanceClass="org.eclipse.mdt.bpmn.ItemKind"
     *        extendedMetaData="name='tItemKind:Object' baseType='tItemKind'"
     * @generated
     */
    EDataType getItemKindObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.MultiInstanceFlowCondition <em>Multi Instance Flow Condition Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Multi Instance Flow Condition Object</em>'.
     * @see org.eclipse.mdt.bpmn.MultiInstanceFlowCondition
     * @model instanceClass="org.eclipse.mdt.bpmn.MultiInstanceFlowCondition"
     *        extendedMetaData="name='tMultiInstanceFlowCondition:Object' baseType='tMultiInstanceFlowCondition'"
     * @generated
     */
    EDataType getMultiInstanceFlowConditionObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.ProcessType <em>Process Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Process Type Object</em>'.
     * @see org.eclipse.mdt.bpmn.ProcessType
     * @model instanceClass="org.eclipse.mdt.bpmn.ProcessType"
     *        extendedMetaData="name='tProcessType:Object' baseType='tProcessType'"
     * @generated
     */
    EDataType getProcessTypeObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.RelationshipDirection <em>Relationship Direction Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Relationship Direction Object</em>'.
     * @see org.eclipse.mdt.bpmn.RelationshipDirection
     * @model instanceClass="org.eclipse.mdt.bpmn.RelationshipDirection"
     *        extendedMetaData="name='tRelationshipDirection:Object' baseType='tRelationshipDirection'"
     * @generated
     */
    EDataType getRelationshipDirectionObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.ServiceImplementation <em>Service Implementation Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Service Implementation Object</em>'.
     * @see org.eclipse.mdt.bpmn.ServiceImplementation
     * @model instanceClass="org.eclipse.mdt.bpmn.ServiceImplementation"
     *        extendedMetaData="name='tServiceImplementation:Object' baseType='tServiceImplementation'"
     * @generated
     */
    EDataType getServiceImplementationObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.TransactionMethod <em>Transaction Method Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Transaction Method Object</em>'.
     * @see org.eclipse.mdt.bpmn.TransactionMethod
     * @model instanceClass="org.eclipse.mdt.bpmn.TransactionMethod"
     *        extendedMetaData="name='tTransactionMethod:Object' baseType='tTransactionMethod'"
     * @generated
     */
    EDataType getTransactionMethodObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn.UserTaskImplementation <em>User Task Implementation Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>User Task Implementation Object</em>'.
     * @see org.eclipse.mdt.bpmn.UserTaskImplementation
     * @model instanceClass="org.eclipse.mdt.bpmn.UserTaskImplementation"
     *        extendedMetaData="name='tUserTaskImplementation:Object' baseType='tUserTaskImplementation'"
     * @generated
     */
    EDataType getUserTaskImplementationObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    BpmnFactory getBpmnFactory();

} //BpmnPackage
