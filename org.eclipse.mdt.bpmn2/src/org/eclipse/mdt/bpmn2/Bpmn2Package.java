/**
 * Copyright (c) 2009, Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Intalio Inc. - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.mdt.bpmn2;

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
 * @see org.eclipse.mdt.bpmn2.Bpmn2Factory
 * @model kind="package"
 * @generated
 */
public interface Bpmn2Package extends EPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "bpmn2";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/bpmn20";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "bpmn";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Bpmn2Package eINSTANCE = org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DocumentRootImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDocumentRoot()
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
     * The feature id for the '<em><b>Ad Hoc Sub Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__AD_HOC_SUB_PROCESS = 4;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FLOW_ELEMENT = 5;

    /**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ARTIFACT = 6;

    /**
     * The feature id for the '<em><b>Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ASSOCIATION = 7;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__AUDITING = 8;

    /**
     * The feature id for the '<em><b>Base Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BASE_ELEMENT = 9;

    /**
     * The feature id for the '<em><b>Base Element With Mixed Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT = 10;

    /**
     * The feature id for the '<em><b>Boundary Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BOUNDARY_EVENT = 11;

    /**
     * The feature id for the '<em><b>Business Rule Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BUSINESS_RULE_TASK = 12;

    /**
     * The feature id for the '<em><b>Callable Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CALLABLE_ELEMENT = 13;

    /**
     * The feature id for the '<em><b>Call Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CALL_ACTIVITY = 14;

    /**
     * The feature id for the '<em><b>Call Choreography Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CALL_CHOREOGRAPHY_ACTIVITY = 15;

    /**
     * The feature id for the '<em><b>Cancel Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION = 16;

    /**
     * The feature id for the '<em><b>Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_DEFINITION = 17;

    /**
     * The feature id for the '<em><b>Root Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ROOT_ELEMENT = 18;

    /**
     * The feature id for the '<em><b>Catch Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CATCH_EVENT = 19;

    /**
     * The feature id for the '<em><b>Category</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CATEGORY = 20;

    /**
     * The feature id for the '<em><b>Category Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CATEGORY_VALUE = 21;

    /**
     * The feature id for the '<em><b>Choreography</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOREOGRAPHY = 22;

    /**
     * The feature id for the '<em><b>Choreography Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY = 23;

    /**
     * The feature id for the '<em><b>Choreography Sub Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOREOGRAPHY_SUB_PROCESS = 24;

    /**
     * The feature id for the '<em><b>Choreography Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHOREOGRAPHY_TASK = 25;

    /**
     * The feature id for the '<em><b>Collaboration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COLLABORATION = 26;

    /**
     * The feature id for the '<em><b>Compensate Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION = 27;

    /**
     * The feature id for the '<em><b>Complex Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__COMPLEX_GATEWAY = 28;

    /**
     * The feature id for the '<em><b>Conditional Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION = 29;

    /**
     * The feature id for the '<em><b>Conversation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONVERSATION = 30;

    /**
     * The feature id for the '<em><b>Conversation Link</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONVERSATION_LINK = 31;

    /**
     * The feature id for the '<em><b>Conversation View</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONVERSATION_VIEW = 32;

    /**
     * The feature id for the '<em><b>Correlation Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CORRELATION_KEY = 33;

    /**
     * The feature id for the '<em><b>Correlation Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CORRELATION_PROPERTY = 34;

    /**
     * The feature id for the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = 35;

    /**
     * The feature id for the '<em><b>Correlation Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CORRELATION_SET = 36;

    /**
     * The feature id for the '<em><b>Data Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_ASSOCIATION = 37;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_INPUT = 38;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION = 39;

    /**
     * The feature id for the '<em><b>Data Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_OBJECT = 40;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_OUTPUT = 41;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION = 42;

    /**
     * The feature id for the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DATA_STATE = 43;

    /**
     * The feature id for the '<em><b>Definitions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DEFINITIONS = 44;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DOCUMENTATION = 45;

    /**
     * The feature id for the '<em><b>End Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__END_EVENT = 46;

    /**
     * The feature id for the '<em><b>End Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__END_POINT = 47;

    /**
     * The feature id for the '<em><b>Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ENTITY = 48;

    /**
     * The feature id for the '<em><b>Error</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ERROR = 49;

    /**
     * The feature id for the '<em><b>Error Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ERROR_EVENT_DEFINITION = 50;

    /**
     * The feature id for the '<em><b>Escalation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ESCALATION = 51;

    /**
     * The feature id for the '<em><b>Escalation Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION = 52;

    /**
     * The feature id for the '<em><b>Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT = 53;

    /**
     * The feature id for the '<em><b>Event Based Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EVENT_BASED_GATEWAY = 54;

    /**
     * The feature id for the '<em><b>Exclusive Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXCLUSIVE_GATEWAY = 55;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXPRESSION = 56;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EXTENSION = 57;

    /**
     * The feature id for the '<em><b>Flow Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FLOW_NODE = 58;

    /**
     * The feature id for the '<em><b>Formal Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FORMAL_EXPRESSION = 59;

    /**
     * The feature id for the '<em><b>Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GATEWAY = 60;

    /**
     * The feature id for the '<em><b>Global Business Rule Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK = 61;

    /**
     * The feature id for the '<em><b>Global Choreography Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK = 62;

    /**
     * The feature id for the '<em><b>Global Manual Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_MANUAL_TASK = 63;

    /**
     * The feature id for the '<em><b>Global Script Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK = 64;

    /**
     * The feature id for the '<em><b>Global Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_TASK = 65;

    /**
     * The feature id for the '<em><b>Global User Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GLOBAL_USER_TASK = 66;

    /**
     * The feature id for the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__GROUP = 67;

    /**
     * The feature id for the '<em><b>Handler</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HANDLER = 68;

    /**
     * The feature id for the '<em><b>Human Performer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HUMAN_PERFORMER = 69;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PERFORMER = 70;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IMPORT = 71;

    /**
     * The feature id for the '<em><b>Inclusive Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INCLUSIVE_GATEWAY = 72;

    /**
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INPUT_SET = 73;

    /**
     * The feature id for the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INTERFACE = 74;

    /**
     * The feature id for the '<em><b>Intermediate Catch Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT = 75;

    /**
     * The feature id for the '<em><b>Intermediate Throw Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT = 76;

    /**
     * The feature id for the '<em><b>Io Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IO_BINDING = 77;

    /**
     * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IO_SPECIFICATION = 78;

    /**
     * The feature id for the '<em><b>Lane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LANE = 79;

    /**
     * The feature id for the '<em><b>Lane Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LANE_SET = 80;

    /**
     * The feature id for the '<em><b>Link Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LINK_EVENT_DEFINITION = 81;

    /**
     * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__LOOP_CHARACTERISTICS = 82;

    /**
     * The feature id for the '<em><b>Manual Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MANUAL_TASK = 83;

    /**
     * The feature id for the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MESSAGE = 84;

    /**
     * The feature id for the '<em><b>Message Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION = 85;

    /**
     * The feature id for the '<em><b>Message Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MESSAGE_FLOW = 86;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MONITORING = 87;

    /**
     * The feature id for the '<em><b>Multi Instance Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS = 88;

    /**
     * The feature id for the '<em><b>Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OPERATION = 89;

    /**
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__OUTPUT_SET = 90;

    /**
     * The feature id for the '<em><b>Parallel Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARALLEL_GATEWAY = 91;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARAMETER = 92;

    /**
     * The feature id for the '<em><b>Parameter Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARAMETER_BINDING = 93;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARTICIPANT = 94;

    /**
     * The feature id for the '<em><b>Participant Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY = 95;

    /**
     * The feature id for the '<em><b>People Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PEOPLE_ASSIGNMENT = 96;

    /**
     * The feature id for the '<em><b>People Assignment Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PEOPLE_ASSIGNMENT_EXPRESSION = 97;

    /**
     * The feature id for the '<em><b>People Assignment Literal</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PEOPLE_ASSIGNMENT_LITERAL = 98;

    /**
     * The feature id for the '<em><b>People Assignment People Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PEOPLE_ASSIGNMENT_PEOPLE_GROUP = 99;

    /**
     * The feature id for the '<em><b>People Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PEOPLE_GROUP = 100;

    /**
     * The feature id for the '<em><b>Potential Owner</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__POTENTIAL_OWNER = 101;

    /**
     * The feature id for the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESS = 102;

    /**
     * The feature id for the '<em><b>Process Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCESS_ROLE = 103;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROPERTY = 104;

    /**
     * The feature id for the '<em><b>Receive Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RECEIVE_TASK = 105;

    /**
     * The feature id for the '<em><b>Relationship</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RELATIONSHIP = 106;

    /**
     * The feature id for the '<em><b>Rendering</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__RENDERING = 107;

    /**
     * The feature id for the '<em><b>Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ROLE = 108;

    /**
     * The feature id for the '<em><b>Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCRIPT = 109;

    /**
     * The feature id for the '<em><b>Script Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCRIPT_TASK = 110;

    /**
     * The feature id for the '<em><b>Send Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEND_TASK = 111;

    /**
     * The feature id for the '<em><b>Sequence Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SEQUENCE_FLOW = 112;

    /**
     * The feature id for the '<em><b>Service Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SERVICE_REFERENCE = 113;

    /**
     * The feature id for the '<em><b>Service Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SERVICE_TASK = 114;

    /**
     * The feature id for the '<em><b>Signal</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SIGNAL = 115;

    /**
     * The feature id for the '<em><b>Signal Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION = 116;

    /**
     * The feature id for the '<em><b>Standard Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS = 117;

    /**
     * The feature id for the '<em><b>Start Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__START_EVENT = 118;

    /**
     * The feature id for the '<em><b>Structure Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__STRUCTURE_DEFINITION = 119;

    /**
     * The feature id for the '<em><b>Sub Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SUB_PROCESS = 120;

    /**
     * The feature id for the '<em><b>Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TASK = 121;

    /**
     * The feature id for the '<em><b>Terminate Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION = 122;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TEXT = 123;

    /**
     * The feature id for the '<em><b>Text Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TEXT_ANNOTATION = 124;

    /**
     * The feature id for the '<em><b>Throw Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__THROW_EVENT = 125;

    /**
     * The feature id for the '<em><b>Timer Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TIMER_EVENT_DEFINITION = 126;

    /**
     * The feature id for the '<em><b>Transaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TRANSACTION = 127;

    /**
     * The feature id for the '<em><b>User Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__USER_TASK = 128;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 129;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.BaseElementImpl <em>Base Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.BaseElementImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getBaseElement()
     * @generated
     */
    int BASE_ELEMENT = 7;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.FlowElementImpl <em>Flow Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.FlowElementImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getFlowElement()
     * @generated
     */
    int FLOW_ELEMENT = 55;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_ELEMENT__CATEGORY_VALUE = BASE_ELEMENT_FEATURE_COUNT + 2;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.FlowNodeImpl <em>Flow Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.FlowNodeImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getFlowNode()
     * @generated
     */
    int FLOW_NODE = 56;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_NODE__CATEGORY_VALUE = FLOW_ELEMENT__CATEGORY_VALUE;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ActivityImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getActivity()
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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__CATEGORY_VALUE = FLOW_NODE__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__PROPERTY = FLOW_NODE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DATA_INPUT_ASSOCIATION = FLOW_NODE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DATA_OUTPUT_ASSOCIATION = FLOW_NODE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__PERFORMER_GROUP = FLOW_NODE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__PERFORMER = FLOW_NODE_FEATURE_COUNT + 5;

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
     * The feature id for the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DEFAULT = FLOW_NODE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__IS_FOR_COMPENSATION = FLOW_NODE_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 10;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.SubProcessImpl <em>Sub Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.SubProcessImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getSubProcess()
     * @generated
     */
    int SUB_PROCESS = 119;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__CATEGORY_VALUE = ACTIVITY__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__PROPERTY = ACTIVITY__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__DATA_INPUT_ASSOCIATION = ACTIVITY__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__DATA_OUTPUT_ASSOCIATION = ACTIVITY__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__PERFORMER_GROUP = ACTIVITY__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__PERFORMER = ACTIVITY__PERFORMER;

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
     * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__FLOW_ELEMENT_GROUP = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__FLOW_ELEMENT = ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS__TRIGGERED_BY_EVENT = ACTIVITY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sub Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_PROCESS_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.AdHocSubProcessImpl <em>Ad Hoc Sub Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.AdHocSubProcessImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getAdHocSubProcess()
     * @generated
     */
    int AD_HOC_SUB_PROCESS = 2;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__CATEGORY_VALUE = SUB_PROCESS__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__PROPERTY = SUB_PROCESS__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__DATA_INPUT_ASSOCIATION = SUB_PROCESS__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__DATA_OUTPUT_ASSOCIATION = SUB_PROCESS__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__PERFORMER_GROUP = SUB_PROCESS__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__PERFORMER = SUB_PROCESS__PERFORMER;

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
     * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__FLOW_ELEMENT_GROUP = SUB_PROCESS__FLOW_ELEMENT_GROUP;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AD_HOC_SUB_PROCESS__FLOW_ELEMENT = SUB_PROCESS__FLOW_ELEMENT;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ArtifactImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getArtifact()
     * @generated
     */
    int ARTIFACT = 3;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.AssignmentImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 4;

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
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.AssociationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getAssociation()
     * @generated
     */
    int ASSOCIATION = 5;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.AuditingImpl <em>Auditing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.AuditingImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getAuditing()
     * @generated
     */
    int AUDITING = 6;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.BaseElementWithMixedContentImpl <em>Base Element With Mixed Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.BaseElementWithMixedContentImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getBaseElementWithMixedContent()
     * @generated
     */
    int BASE_ELEMENT_WITH_MIXED_CONTENT = 8;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.EventImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getEvent()
     * @generated
     */
    int EVENT = 49;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__CATEGORY_VALUE = FLOW_NODE__CATEGORY_VALUE;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CatchEventImpl <em>Catch Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CatchEventImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCatchEvent()
     * @generated
     */
    int CATCH_EVENT = 15;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__CATEGORY_VALUE = EVENT__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__OUTPUT_SET = EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__DATA_OUTPUT = EVENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = EVENT_FEATURE_COUNT + 2;

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
     * The number of structural features of the '<em>Catch Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATCH_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.BoundaryEventImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getBoundaryEvent()
     * @generated
     */
    int BOUNDARY_EVENT = 9;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__CATEGORY_VALUE = CATCH_EVENT__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__DATA_OUTPUT = CATCH_EVENT__DATA_OUTPUT;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDARY_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.TaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getTask()
     * @generated
     */
    int TASK = 120;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__CATEGORY_VALUE = ACTIVITY__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__PROPERTY = ACTIVITY__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DATA_INPUT_ASSOCIATION = ACTIVITY__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__DATA_OUTPUT_ASSOCIATION = ACTIVITY__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__PERFORMER_GROUP = ACTIVITY__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__PERFORMER = ACTIVITY__PERFORMER;

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
     * The number of structural features of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.BusinessRuleTaskImpl <em>Business Rule Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.BusinessRuleTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getBusinessRuleTask()
     * @generated
     */
    int BUSINESS_RULE_TASK = 10;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__CATEGORY_VALUE = TASK__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__PROPERTY = TASK__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__DATA_INPUT_ASSOCIATION = TASK__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__DATA_OUTPUT_ASSOCIATION = TASK__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__PERFORMER_GROUP = TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__PERFORMER = TASK__PERFORMER;

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
     * The feature id for the '<em><b>Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK__RULE = TASK_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Business Rule Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_RULE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.RootElementImpl <em>Root Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.RootElementImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getRootElement()
     * @generated
     */
    int ROOT_ELEMENT = 107;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CallableElementImpl <em>Callable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CallableElementImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCallableElement()
     * @generated
     */
    int CALLABLE_ELEMENT = 11;

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
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALLABLE_ELEMENT__INTERFACE_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CallActivityImpl <em>Call Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CallActivityImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCallActivity()
     * @generated
     */
    int CALL_ACTIVITY = 12;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__CATEGORY_VALUE = ACTIVITY__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__PROPERTY = ACTIVITY__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__DATA_INPUT_ASSOCIATION = ACTIVITY__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__DATA_OUTPUT_ASSOCIATION = ACTIVITY__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__PERFORMER_GROUP = ACTIVITY__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__PERFORMER = ACTIVITY__PERFORMER;

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
     * The feature id for the '<em><b>Called Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__CALLED_ELEMENT = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY__OPERATION = ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Call Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ChoreographyActivityImpl <em>Choreography Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ChoreographyActivityImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getChoreographyActivity()
     * @generated
     */
    int CHOREOGRAPHY_ACTIVITY = 19;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE = FLOW_NODE__CATEGORY_VALUE;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CallChoreographyActivityImpl <em>Call Choreography Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CallChoreographyActivityImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCallChoreographyActivity()
     * @generated
     */
    int CALL_CHOREOGRAPHY_ACTIVITY = 13;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Called Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY__CALLED_ELEMENT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Call Choreography Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CALL_CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.EventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getEventDefinition()
     * @generated
     */
    int EVENT_DEFINITION = 51;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CancelEventDefinitionImpl <em>Cancel Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CancelEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCancelEventDefinition()
     * @generated
     */
    int CANCEL_EVENT_DEFINITION = 14;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CategoryImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCategory()
     * @generated
     */
    int CATEGORY = 16;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CategoryValueImpl <em>Category Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CategoryValueImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCategoryValue()
     * @generated
     */
    int CATEGORY_VALUE = 17;

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
     * The feature id for the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_VALUE__REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_VALUE__VALUE = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Category Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CATEGORY_VALUE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ChoreographyImpl <em>Choreography</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ChoreographyImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getChoreography()
     * @generated
     */
    int CHOREOGRAPHY = 18;

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
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__INTERFACE_REF = CALLABLE_ELEMENT__INTERFACE_REF;

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
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__PARTICIPANT = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__FLOW_ELEMENT_GROUP = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY__FLOW_ELEMENT = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Choreography</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ChoreographySubProcessImpl <em>Choreography Sub Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ChoreographySubProcessImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getChoreographySubProcess()
     * @generated
     */
    int CHOREOGRAPHY_SUB_PROCESS = 20;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS__CATEGORY_VALUE = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE;

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
     * The number of structural features of the '<em>Choreography Sub Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_SUB_PROCESS_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ChoreographyTaskImpl <em>Choreography Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ChoreographyTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getChoreographyTask()
     * @generated
     */
    int CHOREOGRAPHY_TASK = 21;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__CATEGORY_VALUE = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK__MESSAGE_FLOW = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Choreography Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHOREOGRAPHY_TASK_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CollaborationImpl <em>Collaboration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CollaborationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCollaboration()
     * @generated
     */
    int COLLABORATION = 22;

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
     * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__ARTIFACT = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Choreography Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__CHOREOGRAPHY_REF = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION__NAME = ROOT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Collaboration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLABORATION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CompensateEventDefinitionImpl <em>Compensate Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CompensateEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCompensateEventDefinition()
     * @generated
     */
    int COMPENSATE_EVENT_DEFINITION = 23;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.GatewayImpl <em>Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.GatewayImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGateway()
     * @generated
     */
    int GATEWAY = 58;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GATEWAY__CATEGORY_VALUE = FLOW_NODE__CATEGORY_VALUE;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ComplexGatewayImpl <em>Complex Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ComplexGatewayImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getComplexGateway()
     * @generated
     */
    int COMPLEX_GATEWAY = 24;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__CATEGORY_VALUE = GATEWAY__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Reset Sequence Flow</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY__RESET_SEQUENCE_FLOW = GATEWAY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Complex Gateway</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ConditionalEventDefinitionImpl <em>Conditional Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ConditionalEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getConditionalEventDefinition()
     * @generated
     */
    int CONDITIONAL_EVENT_DEFINITION = 25;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ConversationImpl <em>Conversation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ConversationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getConversation()
     * @generated
     */
    int CONVERSATION = 26;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Child Conversation Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__CHILD_CONVERSATION_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__PARTICIPANT_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__MESSAGE_FLOW_REF = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Correlation Key Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION__CORRELATION_KEY_REF = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Conversation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ConversationLinkImpl <em>Conversation Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ConversationLinkImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getConversationLink()
     * @generated
     */
    int CONVERSATION_LINK = 27;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Conversation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__CONVERSATION_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK__PARTICIPANT_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Conversation Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_LINK_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ConversationViewImpl <em>Conversation View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ConversationViewImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getConversationView()
     * @generated
     */
    int CONVERSATION_VIEW = 28;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__DOCUMENTATION = COLLABORATION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__ANY = COLLABORATION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__ID = COLLABORATION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__ANY_ATTRIBUTE = COLLABORATION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Participant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__PARTICIPANT = COLLABORATION__PARTICIPANT;

    /**
     * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__MESSAGE_FLOW = COLLABORATION__MESSAGE_FLOW;

    /**
     * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__ARTIFACT = COLLABORATION__ARTIFACT;

    /**
     * The feature id for the '<em><b>Choreography Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__CHOREOGRAPHY_REF = COLLABORATION__CHOREOGRAPHY_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__NAME = COLLABORATION__NAME;

    /**
     * The feature id for the '<em><b>Conversation Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__CONVERSATION_REF = COLLABORATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Conversation Link</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW__CONVERSATION_LINK = COLLABORATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Conversation View</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONVERSATION_VIEW_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CorrelationKeyImpl <em>Correlation Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CorrelationKeyImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCorrelationKey()
     * @generated
     */
    int CORRELATION_KEY = 29;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Correlation Property Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__CORRELATION_PROPERTY_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Correlation Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_KEY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CorrelationPropertyImpl <em>Correlation Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CorrelationPropertyImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCorrelationProperty()
     * @generated
     */
    int CORRELATION_PROPERTY = 30;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Correlation Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ExpressionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getExpression()
     * @generated
     */
    int EXPRESSION = 53;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.FormalExpressionImpl <em>Formal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.FormalExpressionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getFormalExpression()
     * @generated
     */
    int FORMAL_EXPRESSION = 57;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl <em>Correlation Property Retrieval Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCorrelationPropertyRetrievalExpression()
     * @generated
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = 31;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MIXED = FORMAL_EXPRESSION__MIXED;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__DOCUMENTATION = FORMAL_EXPRESSION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Category</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__CATEGORY = FORMAL_EXPRESSION__CATEGORY;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ANY = FORMAL_EXPRESSION__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ID = FORMAL_EXPRESSION__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ANY_ATTRIBUTE = FORMAL_EXPRESSION__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Evaluates To Type Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__EVALUATES_TO_TYPE_REF = FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__LANGUAGE = FORMAL_EXPRESSION__LANGUAGE;

    /**
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF = FORMAL_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Correlation Property Retrieval Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION_FEATURE_COUNT = FORMAL_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.CorrelationSetImpl <em>Correlation Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.CorrelationSetImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getCorrelationSet()
     * @generated
     */
    int CORRELATION_SET = 32;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SET__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SET__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SET__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Formal Expression</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SET__FORMAL_EXPRESSION = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Correlation Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORRELATION_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DataAssociationImpl <em>Data Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DataAssociationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDataAssociation()
     * @generated
     */
    int DATA_ASSOCIATION = 33;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DataInputImpl <em>Data Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DataInputImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDataInput()
     * @generated
     */
    int DATA_INPUT = 34;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Optional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__OPTIONAL = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Structure Definition Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__STRUCTURE_DEFINITION_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>While Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT__WHILE_EXECUTING = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Data Input</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INPUT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DataInputAssociationImpl <em>Data Input Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DataInputAssociationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDataInputAssociation()
     * @generated
     */
    int DATA_INPUT_ASSOCIATION = 35;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DataObjectImpl <em>Data Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DataObjectImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDataObject()
     * @generated
     */
    int DATA_OBJECT = 36;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__CATEGORY_VALUE = FLOW_ELEMENT__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Structure Definition Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT__STRUCTURE_DEFINITION_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DataObjectStateImpl <em>Data Object State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DataObjectStateImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDataObjectState()
     * @generated
     */
    int DATA_OBJECT_STATE = 37;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_STATE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_STATE__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_STATE__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_STATE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>Data Object State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_STATE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DataOutputImpl <em>Data Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DataOutputImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDataOutput()
     * @generated
     */
    int DATA_OUTPUT = 38;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Structure Definition Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT__STRUCTURE_DEFINITION_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Data Output</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OUTPUT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DataOutputAssociationImpl <em>Data Output Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DataOutputAssociationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDataOutputAssociation()
     * @generated
     */
    int DATA_OUTPUT_ASSOCIATION = 39;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DefinitionsImpl <em>Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DefinitionsImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDefinitions()
     * @generated
     */
    int DEFINITIONS = 40;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Import</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__IMPORT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__EXTENSION = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Root Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ROOT_ELEMENT_GROUP = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Root Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__ROOT_ELEMENT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__RELATIONSHIP = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Expression Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__EXPRESSION_LANGUAGE = BASE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__TARGET_NAMESPACE = BASE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Type Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS__TYPE_LANGUAGE = BASE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Definitions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFINITIONS_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.DocumentationImpl <em>Documentation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.DocumentationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getDocumentation()
     * @generated
     */
    int DOCUMENTATION = 41;

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
     * The number of structural features of the '<em>Documentation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ThrowEventImpl <em>Throw Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ThrowEventImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getThrowEvent()
     * @generated
     */
    int THROW_EVENT = 124;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__CATEGORY_VALUE = EVENT__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__INPUT_SET = EVENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__DATA_INPUT = EVENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THROW_EVENT__DATA_INPUT_ASSOCIATION = EVENT_FEATURE_COUNT + 2;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.EndEventImpl <em>End Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.EndEventImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getEndEvent()
     * @generated
     */
    int END_EVENT = 42;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__CATEGORY_VALUE = THROW_EVENT__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__DATA_INPUT = THROW_EVENT__DATA_INPUT;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int END_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.EndPointImpl <em>End Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.EndPointImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getEndPoint()
     * @generated
     */
    int END_POINT = 43;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.EntityImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getEntity()
     * @generated
     */
    int ENTITY = 44;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ErrorImpl <em>Error</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ErrorImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getError()
     * @generated
     */
    int ERROR = 45;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ErrorEventDefinitionImpl <em>Error Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ErrorEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getErrorEventDefinition()
     * @generated
     */
    int ERROR_EVENT_DEFINITION = 46;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.EscalationImpl <em>Escalation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.EscalationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getEscalation()
     * @generated
     */
    int ESCALATION = 47;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.EscalationEventDefinitionImpl <em>Escalation Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.EscalationEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getEscalationEventDefinition()
     * @generated
     */
    int ESCALATION_EVENT_DEFINITION = 48;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.EventBasedGatewayImpl <em>Event Based Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.EventBasedGatewayImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getEventBasedGateway()
     * @generated
     */
    int EVENT_BASED_GATEWAY = 50;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__CATEGORY_VALUE = GATEWAY__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Instantiate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY__INSTANTIATE = GATEWAY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Event Based Gateway</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_BASED_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ExclusiveGatewayImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getExclusiveGateway()
     * @generated
     */
    int EXCLUSIVE_GATEWAY = 52;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXCLUSIVE_GATEWAY__CATEGORY_VALUE = GATEWAY__CATEGORY_VALUE;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ExtensionImpl <em>Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ExtensionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getExtension()
     * @generated
     */
    int EXTENSION = 54;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.GlobalTaskImpl <em>Global Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.GlobalTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGlobalTask()
     * @generated
     */
    int GLOBAL_TASK = 63;

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
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_TASK__INTERFACE_REF = CALLABLE_ELEMENT__INTERFACE_REF;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.GlobalBusinessRuleTaskImpl <em>Global Business Rule Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.GlobalBusinessRuleTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGlobalBusinessRuleTask()
     * @generated
     */
    int GLOBAL_BUSINESS_RULE_TASK = 59;

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
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__INTERFACE_REF = GLOBAL_TASK__INTERFACE_REF;

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
     * The feature id for the '<em><b>Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK__RULE = GLOBAL_TASK_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Global Business Rule Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_BUSINESS_RULE_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.GlobalChoreographyTaskImpl <em>Global Choreography Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.GlobalChoreographyTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGlobalChoreographyTask()
     * @generated
     */
    int GLOBAL_CHOREOGRAPHY_TASK = 60;

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
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__INTERFACE_REF = CALLABLE_ELEMENT__INTERFACE_REF;

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
     * The feature id for the '<em><b>Initiating Participant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Global Choreography Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_CHOREOGRAPHY_TASK_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.GlobalManualTaskImpl <em>Global Manual Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.GlobalManualTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGlobalManualTask()
     * @generated
     */
    int GLOBAL_MANUAL_TASK = 61;

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
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_MANUAL_TASK__INTERFACE_REF = GLOBAL_TASK__INTERFACE_REF;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.GlobalScriptTaskImpl <em>Global Script Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.GlobalScriptTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGlobalScriptTask()
     * @generated
     */
    int GLOBAL_SCRIPT_TASK = 62;

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
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_SCRIPT_TASK__INTERFACE_REF = GLOBAL_TASK__INTERFACE_REF;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.GlobalUserTaskImpl <em>Global User Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.GlobalUserTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGlobalUserTask()
     * @generated
     */
    int GLOBAL_USER_TASK = 64;

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
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__INTERFACE_REF = GLOBAL_TASK__INTERFACE_REF;

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
     * The feature id for the '<em><b>In Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__IN_MESSAGE_REF = GLOBAL_TASK_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Out Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK__OUT_MESSAGE_REF = GLOBAL_TASK_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Global User Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GLOBAL_USER_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.GroupImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGroup()
     * @generated
     */
    int GROUP = 65;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.HandlerImpl <em>Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.HandlerImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getHandler()
     * @generated
     */
    int HANDLER = 66;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__ANY = FLOW_NODE__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__ID = FLOW_NODE__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__ANY_ATTRIBUTE = FLOW_NODE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__AUDITING = FLOW_NODE__AUDITING;

    /**
     * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__MONITORING = FLOW_NODE__MONITORING;

    /**
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__CATEGORY_VALUE = FLOW_NODE__CATEGORY_VALUE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__NAME = FLOW_NODE__NAME;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__INCOMING = FLOW_NODE__INCOMING;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER__OUTGOING = FLOW_NODE__OUTGOING;

    /**
     * The number of structural features of the '<em>Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HANDLER_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.PerformerImpl <em>Performer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.PerformerImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getPerformer()
     * @generated
     */
    int PERFORMER = 98;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Performer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERFORMER_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.HumanPerformerImpl <em>Human Performer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.HumanPerformerImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getHumanPerformer()
     * @generated
     */
    int HUMAN_PERFORMER = 67;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__NAME = PERFORMER__NAME;

    /**
     * The feature id for the '<em><b>People Assignment Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__PEOPLE_ASSIGNMENT_GROUP = PERFORMER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>People Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER__PEOPLE_ASSIGNMENT = PERFORMER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Human Performer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_PERFORMER_FEATURE_COUNT = PERFORMER_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ImportImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getImport()
     * @generated
     */
    int IMPORT = 68;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.InclusiveGatewayImpl <em>Inclusive Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.InclusiveGatewayImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getInclusiveGateway()
     * @generated
     */
    int INCLUSIVE_GATEWAY = 69;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCLUSIVE_GATEWAY__CATEGORY_VALUE = GATEWAY__CATEGORY_VALUE;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.InputOutputBindingImpl <em>Input Output Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.InputOutputBindingImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getInputOutputBinding()
     * @generated
     */
    int INPUT_OUTPUT_BINDING = 70;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.InputOutputSpecificationImpl <em>Input Output Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.InputOutputSpecificationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getInputOutputSpecification()
     * @generated
     */
    int INPUT_OUTPUT_SPECIFICATION = 71;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.InputSetImpl <em>Input Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.InputSetImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getInputSet()
     * @generated
     */
    int INPUT_SET = 72;

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
     * The feature id for the '<em><b>Output Set Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__OUTPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Input Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.InterfaceImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getInterface()
     * @generated
     */
    int INTERFACE = 73;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.IntermediateCatchEventImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getIntermediateCatchEvent()
     * @generated
     */
    int INTERMEDIATE_CATCH_EVENT = 74;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__CATEGORY_VALUE = CATCH_EVENT__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__DATA_OUTPUT = CATCH_EVENT__DATA_OUTPUT;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

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
     * The number of structural features of the '<em>Intermediate Catch Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_CATCH_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.IntermediateThrowEventImpl <em>Intermediate Throw Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.IntermediateThrowEventImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getIntermediateThrowEvent()
     * @generated
     */
    int INTERMEDIATE_THROW_EVENT = 75;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__CATEGORY_VALUE = THROW_EVENT__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

    /**
     * The feature id for the '<em><b>Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__DATA_INPUT = THROW_EVENT__DATA_INPUT;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERMEDIATE_THROW_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.LaneImpl <em>Lane</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.LaneImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getLane()
     * @generated
     */
    int LANE = 76;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.LaneSetImpl <em>Lane Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.LaneSetImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getLaneSet()
     * @generated
     */
    int LANE_SET = 77;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.LinkEventDefinitionImpl <em>Link Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.LinkEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getLinkEventDefinition()
     * @generated
     */
    int LINK_EVENT_DEFINITION = 78;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.LoopCharacteristicsImpl <em>Loop Characteristics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.LoopCharacteristicsImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getLoopCharacteristics()
     * @generated
     */
    int LOOP_CHARACTERISTICS = 79;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ManualTaskImpl <em>Manual Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ManualTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getManualTask()
     * @generated
     */
    int MANUAL_TASK = 80;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__CATEGORY_VALUE = TASK__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__PROPERTY = TASK__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__DATA_INPUT_ASSOCIATION = TASK__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__DATA_OUTPUT_ASSOCIATION = TASK__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__PERFORMER_GROUP = TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK__PERFORMER = TASK__PERFORMER;

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
     * The number of structural features of the '<em>Manual Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.MessageImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getMessage()
     * @generated
     */
    int MESSAGE = 81;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.MessageEventDefinitionImpl <em>Message Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.MessageEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getMessageEventDefinition()
     * @generated
     */
    int MESSAGE_EVENT_DEFINITION = 82;

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
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION__MESSAGE_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION__OPERATION_REF = EVENT_DEFINITION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Service Reference Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION__SERVICE_REFERENCE_REF = EVENT_DEFINITION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Message Event Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.MessageFlowImpl <em>Message Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.MessageFlowImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getMessageFlow()
     * @generated
     */
    int MESSAGE_FLOW = 83;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__MESSAGE_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__SOURCE_REF = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW__TARGET_REF = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Message Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MESSAGE_FLOW_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.MonitoringImpl <em>Monitoring</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.MonitoringImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getMonitoring()
     * @generated
     */
    int MONITORING = 84;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl <em>Multi Instance Loop Characteristics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getMultiInstanceLoopCharacteristics()
     * @generated
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS = 85;

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
     * The feature id for the '<em><b>Complex Flow Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Loop Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Loop Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Input Data Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Output Data Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR = LOOP_CHARACTERISTICS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Cancel Remaining Instances</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__CANCEL_REMAINING_INSTANCES = LOOP_CHARACTERISTICS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Is Sequential</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL = LOOP_CHARACTERISTICS_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Multi Instance Loop Characteristics</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_INSTANCE_LOOP_CHARACTERISTICS_FEATURE_COUNT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.OperationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getOperation()
     * @generated
     */
    int OPERATION = 86;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.OutputSetImpl <em>Output Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.OutputSetImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getOutputSet()
     * @generated
     */
    int OUTPUT_SET = 87;

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
     * The feature id for the '<em><b>Input Set Refs</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__INPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Output Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ParallelGatewayImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getParallelGateway()
     * @generated
     */
    int PARALLEL_GATEWAY = 88;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_GATEWAY__CATEGORY_VALUE = GATEWAY__CATEGORY_VALUE;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ParameterImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 89;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Is Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__IS_REQUIRED = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__TYPE = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ParameterBindingImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getParameterBinding()
     * @generated
     */
    int PARAMETER_BINDING = 90;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_BINDING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_BINDING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_BINDING__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_BINDING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_BINDING__EXPRESSION_GROUP = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_BINDING__EXPRESSION = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_BINDING__PARAMETER = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Parameter Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_BINDING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ParticipantImpl <em>Participant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ParticipantImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getParticipant()
     * @generated
     */
    int PARTICIPANT = 91;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__INTERFACE_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Participant Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__PARTICIPANT_MULTIPLICITY = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Entity Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ENTITY_REF = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__NAME = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Process Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__PROCESS_REF = ROOT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Role Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT__ROLE_REF = ROOT_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Participant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTICIPANT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ParticipantMultiplicityImpl <em>Participant Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ParticipantMultiplicityImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getParticipantMultiplicity()
     * @generated
     */
    int PARTICIPANT_MULTIPLICITY = 92;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.PeopleAssignmentImpl <em>People Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.PeopleAssignmentImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getPeopleAssignment()
     * @generated
     */
    int PEOPLE_ASSIGNMENT = 93;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The number of structural features of the '<em>People Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.PeopleAssignmentExpressionImpl <em>People Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.PeopleAssignmentExpressionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getPeopleAssignmentExpression()
     * @generated
     */
    int PEOPLE_ASSIGNMENT_EXPRESSION = 94;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_EXPRESSION__DOCUMENTATION = PEOPLE_ASSIGNMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_EXPRESSION__ANY = PEOPLE_ASSIGNMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_EXPRESSION__ID = PEOPLE_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_EXPRESSION__ANY_ATTRIBUTE = PEOPLE_ASSIGNMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_EXPRESSION__EXPRESSION_GROUP = PEOPLE_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_EXPRESSION__EXPRESSION = PEOPLE_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>People Assignment Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = PEOPLE_ASSIGNMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.PeopleAssignmentLiteralImpl <em>People Assignment Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.PeopleAssignmentLiteralImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getPeopleAssignmentLiteral()
     * @generated
     */
    int PEOPLE_ASSIGNMENT_LITERAL = 95;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_LITERAL__DOCUMENTATION = PEOPLE_ASSIGNMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_LITERAL__ANY = PEOPLE_ASSIGNMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_LITERAL__ID = PEOPLE_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_LITERAL__ANY_ATTRIBUTE = PEOPLE_ASSIGNMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>User</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_LITERAL__USER = PEOPLE_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>People Assignment Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_LITERAL_FEATURE_COUNT = PEOPLE_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.PeopleAssignmentPeopleGroupImpl <em>People Assignment People Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.PeopleAssignmentPeopleGroupImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getPeopleAssignmentPeopleGroup()
     * @generated
     */
    int PEOPLE_ASSIGNMENT_PEOPLE_GROUP = 96;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_PEOPLE_GROUP__DOCUMENTATION = PEOPLE_ASSIGNMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_PEOPLE_GROUP__ANY = PEOPLE_ASSIGNMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_PEOPLE_GROUP__ID = PEOPLE_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_PEOPLE_GROUP__ANY_ATTRIBUTE = PEOPLE_ASSIGNMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_PEOPLE_GROUP__PARAMETER = PEOPLE_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_PEOPLE_GROUP__DEFINITION = PEOPLE_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>People Assignment People Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_ASSIGNMENT_PEOPLE_GROUP_FEATURE_COUNT = PEOPLE_ASSIGNMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.PeopleGroupImpl <em>People Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.PeopleGroupImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getPeopleGroup()
     * @generated
     */
    int PEOPLE_GROUP = 97;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_GROUP__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_GROUP__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_GROUP__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_GROUP__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_GROUP__PARAMETER = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_GROUP__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>People Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PEOPLE_GROUP_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.PotentialOwnerImpl <em>Potential Owner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.PotentialOwnerImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getPotentialOwner()
     * @generated
     */
    int POTENTIAL_OWNER = 99;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__NAME = HUMAN_PERFORMER__NAME;

    /**
     * The feature id for the '<em><b>People Assignment Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__PEOPLE_ASSIGNMENT_GROUP = HUMAN_PERFORMER__PEOPLE_ASSIGNMENT_GROUP;

    /**
     * The feature id for the '<em><b>People Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER__PEOPLE_ASSIGNMENT = HUMAN_PERFORMER__PEOPLE_ASSIGNMENT;

    /**
     * The number of structural features of the '<em>Potential Owner</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POTENTIAL_OWNER_FEATURE_COUNT = HUMAN_PERFORMER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ProcessImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 100;

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
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__INTERFACE_REF = CALLABLE_ELEMENT__INTERFACE_REF;

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
     * The feature id for the '<em><b>Process Role</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PROCESS_ROLE = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PROPERTY = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Lane Set</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__LANE_SET = CALLABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__FLOW_ELEMENT_GROUP = CALLABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__FLOW_ELEMENT = CALLABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Process Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PROCESS_TYPE = CALLABLE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ProcessRoleImpl <em>Process Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ProcessRoleImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getProcessRole()
     * @generated
     */
    int PROCESS_ROLE = 101;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ROLE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ROLE__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ROLE__ID = BASE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ROLE__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ROLE__PARAMETER = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ROLE__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Process Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ROLE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.PropertyImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 102;

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
     * The feature id for the '<em><b>Structure Definition Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__STRUCTURE_DEFINITION_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ReceiveTaskImpl <em>Receive Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ReceiveTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getReceiveTask()
     * @generated
     */
    int RECEIVE_TASK = 103;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__CATEGORY_VALUE = TASK__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__PROPERTY = TASK__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__DATA_INPUT_ASSOCIATION = TASK__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__DATA_OUTPUT_ASSOCIATION = TASK__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__PERFORMER_GROUP = TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__PERFORMER = TASK__PERFORMER;

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
     * The feature id for the '<em><b>Instantiate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__INSTANTIATE = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__MESSAGE_REF = TASK_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Service Reference Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK__SERVICE_REFERENCE_REF = TASK_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Receive Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RECEIVE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.RelationshipImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getRelationship()
     * @generated
     */
    int RELATIONSHIP = 104;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.RenderingImpl <em>Rendering</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.RenderingImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getRendering()
     * @generated
     */
    int RENDERING = 105;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.RoleImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getRole()
     * @generated
     */
    int ROLE = 106;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ScriptImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getScript()
     * @generated
     */
    int SCRIPT = 108;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ScriptTaskImpl <em>Script Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ScriptTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getScriptTask()
     * @generated
     */
    int SCRIPT_TASK = 109;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__CATEGORY_VALUE = TASK__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__PROPERTY = TASK__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__DATA_INPUT_ASSOCIATION = TASK__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__DATA_OUTPUT_ASSOCIATION = TASK__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__PERFORMER_GROUP = TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_TASK__PERFORMER = TASK__PERFORMER;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.SendTaskImpl <em>Send Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.SendTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getSendTask()
     * @generated
     */
    int SEND_TASK = 110;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__CATEGORY_VALUE = TASK__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__PROPERTY = TASK__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__DATA_INPUT_ASSOCIATION = TASK__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__DATA_OUTPUT_ASSOCIATION = TASK__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__PERFORMER_GROUP = TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__PERFORMER = TASK__PERFORMER;

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
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__MESSAGE_REF = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Service Reference Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK__SERVICE_REFERENCE_REF = TASK_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Send Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEND_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.SequenceFlowImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getSequenceFlow()
     * @generated
     */
    int SEQUENCE_FLOW = 111;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__CATEGORY_VALUE = FLOW_ELEMENT__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__SOURCE_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW__TARGET_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sequence Flow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ServiceReferenceImpl <em>Service Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ServiceReferenceImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getServiceReference()
     * @generated
     */
    int SERVICE_REFERENCE = 112;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_REFERENCE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_REFERENCE__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_REFERENCE__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_REFERENCE__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Interface Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_REFERENCE__INTERFACE_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>End Point Ref</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_REFERENCE__END_POINT_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Implementation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_REFERENCE__IMPLEMENTATION = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_REFERENCE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Service Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_REFERENCE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.ServiceTaskImpl <em>Service Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.ServiceTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getServiceTask()
     * @generated
     */
    int SERVICE_TASK = 113;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__CATEGORY_VALUE = TASK__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__PROPERTY = TASK__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__DATA_INPUT_ASSOCIATION = TASK__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__DATA_OUTPUT_ASSOCIATION = TASK__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__PERFORMER_GROUP = TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__PERFORMER = TASK__PERFORMER;

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
     * The feature id for the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__MESSAGE_REF = TASK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Service Reference Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK__SERVICE_REFERENCE_REF = TASK_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Service Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.SignalImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getSignal()
     * @generated
     */
    int SIGNAL = 114;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.SignalEventDefinitionImpl <em>Signal Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.SignalEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getSignalEventDefinition()
     * @generated
     */
    int SIGNAL_EVENT_DEFINITION = 115;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.StandardLoopCharacteristicsImpl <em>Standard Loop Characteristics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.StandardLoopCharacteristicsImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getStandardLoopCharacteristics()
     * @generated
     */
    int STANDARD_LOOP_CHARACTERISTICS = 116;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.StartEventImpl <em>Start Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.StartEventImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getStartEvent()
     * @generated
     */
    int START_EVENT = 117;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__CATEGORY_VALUE = CATCH_EVENT__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

    /**
     * The feature id for the '<em><b>Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__DATA_OUTPUT = CATCH_EVENT__DATA_OUTPUT;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.StructureDefinitionImpl <em>Structure Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.StructureDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getStructureDefinition()
     * @generated
     */
    int STRUCTURE_DEFINITION = 118;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_DEFINITION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_DEFINITION__ANY = ROOT_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_DEFINITION__ID = ROOT_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_DEFINITION__ANY_ATTRIBUTE = ROOT_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Is Collection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_DEFINITION__IS_COLLECTION = ROOT_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Structure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_DEFINITION__STRUCTURE = ROOT_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Structure Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_DEFINITION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.TerminateEventDefinitionImpl <em>Terminate Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.TerminateEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getTerminateEventDefinition()
     * @generated
     */
    int TERMINATE_EVENT_DEFINITION = 121;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.TextImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getText()
     * @generated
     */
    int TEXT = 122;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.TextAnnotationImpl <em>Text Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.TextAnnotationImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getTextAnnotation()
     * @generated
     */
    int TEXT_ANNOTATION = 123;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.TimerEventDefinitionImpl <em>Timer Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.TimerEventDefinitionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getTimerEventDefinition()
     * @generated
     */
    int TIMER_EVENT_DEFINITION = 125;

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
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.TransactionImpl <em>Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.TransactionImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getTransaction()
     * @generated
     */
    int TRANSACTION = 126;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__CATEGORY_VALUE = ACTIVITY__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__PROPERTY = ACTIVITY__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__DATA_INPUT_ASSOCIATION = ACTIVITY__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__DATA_OUTPUT_ASSOCIATION = ACTIVITY__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__PERFORMER_GROUP = ACTIVITY__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION__PERFORMER = ACTIVITY__PERFORMER;

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
     * The number of structural features of the '<em>Transaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSACTION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.impl.UserTaskImpl <em>User Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.impl.UserTaskImpl
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getUserTask()
     * @generated
     */
    int USER_TASK = 127;

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
     * The feature id for the '<em><b>Category Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__CATEGORY_VALUE = TASK__CATEGORY_VALUE;

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
     * The feature id for the '<em><b>Property</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__PROPERTY = TASK__PROPERTY;

    /**
     * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__DATA_INPUT_ASSOCIATION = TASK__DATA_INPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__DATA_OUTPUT_ASSOCIATION = TASK__DATA_OUTPUT_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Performer Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__PERFORMER_GROUP = TASK__PERFORMER_GROUP;

    /**
     * The feature id for the '<em><b>Performer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__PERFORMER = TASK__PERFORMER;

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
     * The feature id for the '<em><b>In Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__IN_MESSAGE_REF = TASK_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Out Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK__OUT_MESSAGE_REF = TASK_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>User Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.AdHocOrdering <em>Ad Hoc Ordering</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.AdHocOrdering
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getAdHocOrdering()
     * @generated
     */
    int AD_HOC_ORDERING = 128;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.AssociationDirection <em>Association Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.AssociationDirection
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getAssociationDirection()
     * @generated
     */
    int ASSOCIATION_DIRECTION = 129;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.GatewayDirection <em>Gateway Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.GatewayDirection
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGatewayDirection()
     * @generated
     */
    int GATEWAY_DIRECTION = 130;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition <em>Multi Instance Flow Condition</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getMultiInstanceFlowCondition()
     * @generated
     */
    int MULTI_INSTANCE_FLOW_CONDITION = 131;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.ProcessType <em>Process Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.ProcessType
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getProcessType()
     * @generated
     */
    int PROCESS_TYPE = 132;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.RelationshipDirection <em>Relationship Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.RelationshipDirection
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getRelationshipDirection()
     * @generated
     */
    int RELATIONSHIP_DIRECTION = 133;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.ServiceImplementation <em>Service Implementation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.ServiceImplementation
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getServiceImplementation()
     * @generated
     */
    int SERVICE_IMPLEMENTATION = 134;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.TransactionMethod <em>Transaction Method</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.TransactionMethod
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getTransactionMethod()
     * @generated
     */
    int TRANSACTION_METHOD = 135;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn2.UserTaskImplementation <em>User Task Implementation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.UserTaskImplementation
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getUserTaskImplementation()
     * @generated
     */
    int USER_TASK_IMPLEMENTATION = 136;

    /**
     * The meta object id for the '<em>Ad Hoc Ordering Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.AdHocOrdering
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getAdHocOrderingObject()
     * @generated
     */
    int AD_HOC_ORDERING_OBJECT = 137;

    /**
     * The meta object id for the '<em>Association Direction Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.AssociationDirection
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getAssociationDirectionObject()
     * @generated
     */
    int ASSOCIATION_DIRECTION_OBJECT = 138;

    /**
     * The meta object id for the '<em>Gateway Direction Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.GatewayDirection
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getGatewayDirectionObject()
     * @generated
     */
    int GATEWAY_DIRECTION_OBJECT = 139;

    /**
     * The meta object id for the '<em>Multi Instance Flow Condition Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getMultiInstanceFlowConditionObject()
     * @generated
     */
    int MULTI_INSTANCE_FLOW_CONDITION_OBJECT = 140;

    /**
     * The meta object id for the '<em>Process Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.ProcessType
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getProcessTypeObject()
     * @generated
     */
    int PROCESS_TYPE_OBJECT = 141;

    /**
     * The meta object id for the '<em>Relationship Direction Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.RelationshipDirection
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getRelationshipDirectionObject()
     * @generated
     */
    int RELATIONSHIP_DIRECTION_OBJECT = 142;

    /**
     * The meta object id for the '<em>Service Implementation Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.ServiceImplementation
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getServiceImplementationObject()
     * @generated
     */
    int SERVICE_IMPLEMENTATION_OBJECT = 143;

    /**
     * The meta object id for the '<em>Transaction Method Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.TransactionMethod
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getTransactionMethodObject()
     * @generated
     */
    int TRANSACTION_METHOD_OBJECT = 144;

    /**
     * The meta object id for the '<em>User Task Implementation Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn2.UserTaskImplementation
     * @see org.eclipse.mdt.bpmn2.impl.Bpmn2PackageImpl#getUserTaskImplementationObject()
     * @generated
     */
    int USER_TASK_IMPLEMENTATION_OBJECT = 145;

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getActivity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activity</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Activity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Ad Hoc Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getAdHocSubProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_AdHocSubProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getFlowElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FlowElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getArtifact()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Artifact();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Association</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Association();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getAuditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Auditing</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getAuditing()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Auditing();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getBaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Base Element</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getBaseElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BaseElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Base Element With Mixed Content</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getBaseElementWithMixedContent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BaseElementWithMixedContent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getBoundaryEvent <em>Boundary Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Boundary Event</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getBoundaryEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BoundaryEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getBusinessRuleTask <em>Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Business Rule Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getBusinessRuleTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BusinessRuleTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Callable Element</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCallableElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CallableElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCallActivity <em>Call Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Call Activity</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCallActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CallActivity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCallChoreographyActivity <em>Call Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Call Choreography Activity</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCallChoreographyActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CallChoreographyActivity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCancelEventDefinition <em>Cancel Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cancel Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCancelEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CancelEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getEventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getRootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root Element</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getRootElement()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_RootElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCatchEvent <em>Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Catch Event</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCatchEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CatchEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Category</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCategory()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Category();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Category Value</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCategoryValue()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CategoryValue();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getChoreography <em>Choreography</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choreography</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getChoreography()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Choreography();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getChoreographyActivity <em>Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choreography Activity</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getChoreographyActivity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ChoreographyActivity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getChoreographySubProcess <em>Choreography Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choreography Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getChoreographySubProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ChoreographySubProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getChoreographyTask <em>Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Choreography Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getChoreographyTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ChoreographyTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCollaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Collaboration</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCollaboration()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Collaboration();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCompensateEventDefinition <em>Compensate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Compensate Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCompensateEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CompensateEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getComplexGateway <em>Complex Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Complex Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getComplexGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ComplexGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getConditionalEventDefinition <em>Conditional Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conditional Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getConditionalEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ConditionalEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getConversation <em>Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conversation</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getConversation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Conversation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getConversationLink <em>Conversation Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conversation Link</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getConversationLink()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ConversationLink();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getConversationView <em>Conversation View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conversation View</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getConversationView()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ConversationView();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCorrelationKey <em>Correlation Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Key</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCorrelationKey()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CorrelationKey();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCorrelationProperty <em>Correlation Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Property</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCorrelationProperty()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CorrelationProperty();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Property Retrieval Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCorrelationPropertyRetrievalExpression()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CorrelationPropertyRetrievalExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getCorrelationSet <em>Correlation Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Correlation Set</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getCorrelationSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_CorrelationSet();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getDataAssociation <em>Data Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Association</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getDataAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getDataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Input</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getDataInput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataInput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getDataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Input Association</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getDataInputAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataInputAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getDataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Object</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getDataObject()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataObject();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getDataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Output</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getDataOutput()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataOutput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getDataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Output Association</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getDataOutputAssociation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataOutputAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getDataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getDataState()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_DataState();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getDefinitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Definitions</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getDefinitions()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Definitions();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getDocumentation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getEndEvent <em>End Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>End Event</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getEndEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EndEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getEndPoint <em>End Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>End Point</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getEndPoint()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EndPoint();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getEntity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Entity</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getEntity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Entity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getError <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Error</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getError()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Error();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getErrorEventDefinition <em>Error Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Error Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getErrorEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ErrorEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getEscalation <em>Escalation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Escalation</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getEscalation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Escalation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getEscalationEventDefinition <em>Escalation Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Escalation Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getEscalationEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EscalationEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getEvent <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Event();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getEventBasedGateway <em>Event Based Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Based Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getEventBasedGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_EventBasedGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getExclusiveGateway <em>Exclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Exclusive Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getExclusiveGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ExclusiveGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getExpression()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Expression();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extension</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getExtension()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Extension();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getFlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Flow Node</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getFlowNode()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FlowNode();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getFormalExpression <em>Formal Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Formal Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getFormalExpression()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_FormalExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getGateway <em>Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Gateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Business Rule Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalBusinessRuleTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalBusinessRuleTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalChoreographyTask <em>Global Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Choreography Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalChoreographyTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalChoreographyTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalManualTask <em>Global Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Manual Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalManualTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalManualTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalScriptTask <em>Global Script Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Script Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalScriptTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalScriptTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalTask <em>Global Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalUserTask <em>Global User Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Global User Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getGlobalUserTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_GlobalUserTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Group</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getGroup()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Group();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getHandler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Handler</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getHandler()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Handler();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getHumanPerformer <em>Human Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Human Performer</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getHumanPerformer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_HumanPerformer();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getPerformer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Performer</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getPerformer()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Performer();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Import</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getImport()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Import();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getInclusiveGateway <em>Inclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inclusive Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getInclusiveGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_InclusiveGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getInputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Set</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getInputSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_InputSet();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interface</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getInterface()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Interface();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Intermediate Catch Event</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getIntermediateCatchEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IntermediateCatchEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Intermediate Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getIntermediateThrowEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IntermediateThrowEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getIoBinding <em>Io Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Io Binding</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getIoBinding()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IoBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getIoSpecification <em>Io Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Io Specification</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getIoSpecification()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IoSpecification();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getLane <em>Lane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Lane</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getLane()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Lane();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getLaneSet <em>Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Lane Set</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getLaneSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LaneSet();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getLinkEventDefinition <em>Link Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Link Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getLinkEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LinkEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getLoopCharacteristics <em>Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getLoopCharacteristics()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_LoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getManualTask <em>Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manual Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getManualTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ManualTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getMessage <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getMessage()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Message();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getMessageEventDefinition <em>Message Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getMessageEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MessageEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getMessageFlow()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MessageFlow();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getMonitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Monitoring</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getMonitoring()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Monitoring();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Multi Instance Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getMultiInstanceLoopCharacteristics()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_MultiInstanceLoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operation</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getOperation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Operation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getOutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Set</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getOutputSet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OutputSet();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getParallelGateway <em>Parallel Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parallel Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getParallelGateway()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ParallelGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameter</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getParameter()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Parameter();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getParameterBinding <em>Parameter Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameter Binding</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getParameterBinding()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ParameterBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getParticipant()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Participant();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getParticipantMultiplicity <em>Participant Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Participant Multiplicity</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getParticipantMultiplicity()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ParticipantMultiplicity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleAssignment <em>People Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>People Assignment</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleAssignment()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PeopleAssignment();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleAssignmentExpression <em>People Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>People Assignment Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleAssignmentExpression()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PeopleAssignmentExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleAssignmentLiteral <em>People Assignment Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>People Assignment Literal</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleAssignmentLiteral()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PeopleAssignmentLiteral();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleAssignmentPeopleGroup <em>People Assignment People Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>People Assignment People Group</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleAssignmentPeopleGroup()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PeopleAssignmentPeopleGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleGroup <em>People Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>People Group</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getPeopleGroup()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PeopleGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getPotentialOwner <em>Potential Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Potential Owner</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getPotentialOwner()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_PotentialOwner();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Process</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Process();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getProcessRole <em>Process Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Process Role</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getProcessRole()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ProcessRole();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Property</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getProperty()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Property();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getReceiveTask <em>Receive Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Receive Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getReceiveTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ReceiveTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getRelationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Relationship</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getRelationship()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Relationship();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getRendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rendering</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getRendering()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Rendering();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Role</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getRole()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Role();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Script</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getScript()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Script();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getScriptTask <em>Script Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Script Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getScriptTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ScriptTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getSendTask <em>Send Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Send Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getSendTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SendTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sequence Flow</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getSequenceFlow()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SequenceFlow();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getServiceReference <em>Service Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Reference</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getServiceReference()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ServiceReference();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getServiceTask <em>Service Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getServiceTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ServiceTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Signal</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getSignal()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Signal();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getSignalEventDefinition <em>Signal Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Signal Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getSignalEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SignalEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Standard Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getStandardLoopCharacteristics()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_StandardLoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getStartEvent <em>Start Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Start Event</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getStartEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_StartEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getStructureDefinition <em>Structure Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Structure Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getStructureDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_StructureDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getSubProcess <em>Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getSubProcess()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_SubProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Task();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getTerminateEventDefinition <em>Terminate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Terminate Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getTerminateEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TerminateEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getText()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Text();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getTextAnnotation <em>Text Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text Annotation</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getTextAnnotation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TextAnnotation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getThrowEvent <em>Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getThrowEvent()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ThrowEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getTimerEventDefinition <em>Timer Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timer Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getTimerEventDefinition()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_TimerEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getTransaction <em>Transaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transaction</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getTransaction()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Transaction();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DocumentRoot#getUserTask <em>User Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>User Task</em>'.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot#getUserTask()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_UserTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity
     * @generated
     */
    EClass getActivity();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.Activity#getIoSpecification <em>Io Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Io Specification</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#getIoSpecification()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_IoSpecification();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Activity#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#getProperty()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_Property();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Activity#getDataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Input Association</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#getDataInputAssociation()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_DataInputAssociation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Activity#getDataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Output Association</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#getDataOutputAssociation()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_DataOutputAssociation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Activity#getPerformerGroup <em>Performer Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Performer Group</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#getPerformerGroup()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_PerformerGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Activity#getPerformer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Performer</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#getPerformer()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_Performer();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Activity#getLoopCharacteristicsGroup <em>Loop Characteristics Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Loop Characteristics Group</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#getLoopCharacteristicsGroup()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_LoopCharacteristicsGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#getLoopCharacteristics()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_LoopCharacteristics();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Activity#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#getDefault()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_Default();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Activity#isIsForCompensation <em>Is For Compensation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is For Compensation</em>'.
     * @see org.eclipse.mdt.bpmn2.Activity#isIsForCompensation()
     * @see #getActivity()
     * @generated
     */
    EAttribute getActivity_IsForCompensation();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ad Hoc Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn2.AdHocSubProcess
     * @generated
     */
    EClass getAdHocSubProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Completion Condition</em>'.
     * @see org.eclipse.mdt.bpmn2.AdHocSubProcess#getCompletionCondition()
     * @see #getAdHocSubProcess()
     * @generated
     */
    EReference getAdHocSubProcess_CompletionCondition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cancel Remaining Instances</em>'.
     * @see org.eclipse.mdt.bpmn2.AdHocSubProcess#isCancelRemainingInstances()
     * @see #getAdHocSubProcess()
     * @generated
     */
    EAttribute getAdHocSubProcess_CancelRemainingInstances();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.AdHocSubProcess#getOrdering <em>Ordering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ordering</em>'.
     * @see org.eclipse.mdt.bpmn2.AdHocSubProcess#getOrdering()
     * @see #getAdHocSubProcess()
     * @generated
     */
    EAttribute getAdHocSubProcess_Ordering();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Artifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn2.Artifact
     * @generated
     */
    EClass getArtifact();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see org.eclipse.mdt.bpmn2.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.Assignment#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>From</em>'.
     * @see org.eclipse.mdt.bpmn2.Assignment#getFrom()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_From();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.Assignment#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>To</em>'.
     * @see org.eclipse.mdt.bpmn2.Assignment#getTo()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_To();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association</em>'.
     * @see org.eclipse.mdt.bpmn2.Association
     * @generated
     */
    EClass getAssociation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Association#getAssociationDirection <em>Association Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Association Direction</em>'.
     * @see org.eclipse.mdt.bpmn2.Association#getAssociationDirection()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_AssociationDirection();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Association#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Association#getSourceRef()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Association#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Association#getTargetRef()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Auditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Auditing</em>'.
     * @see org.eclipse.mdt.bpmn2.Auditing
     * @generated
     */
    EClass getAuditing();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Element</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElement
     * @generated
     */
    EClass getBaseElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.BaseElement#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElement#getDocumentation()
     * @see #getBaseElement()
     * @generated
     */
    EReference getBaseElement_Documentation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.BaseElement#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElement#getAny()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_Any();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.BaseElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElement#getId()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_Id();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.BaseElement#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElement#getAnyAttribute()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.BaseElementWithMixedContent <em>Base Element With Mixed Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Element With Mixed Content</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElementWithMixedContent
     * @generated
     */
    EClass getBaseElementWithMixedContent();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getMixed()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EAttribute getBaseElementWithMixedContent_Mixed();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getDocumentation()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EReference getBaseElementWithMixedContent_Documentation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Category</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getCategory()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EReference getBaseElementWithMixedContent_Category();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getAny()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EAttribute getBaseElementWithMixedContent_Any();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getId()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EAttribute getBaseElementWithMixedContent_Id();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see org.eclipse.mdt.bpmn2.BaseElementWithMixedContent#getAnyAttribute()
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    EAttribute getBaseElementWithMixedContent_AnyAttribute();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.BoundaryEvent <em>Boundary Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boundary Event</em>'.
     * @see org.eclipse.mdt.bpmn2.BoundaryEvent
     * @generated
     */
    EClass getBoundaryEvent();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attached To Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.BoundaryEvent#getAttachedToRef()
     * @see #getBoundaryEvent()
     * @generated
     */
    EAttribute getBoundaryEvent_AttachedToRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cancel Activity</em>'.
     * @see org.eclipse.mdt.bpmn2.BoundaryEvent#isCancelActivity()
     * @see #getBoundaryEvent()
     * @generated
     */
    EAttribute getBoundaryEvent_CancelActivity();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.BusinessRuleTask <em>Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Business Rule Task</em>'.
     * @see org.eclipse.mdt.bpmn2.BusinessRuleTask
     * @generated
     */
    EClass getBusinessRuleTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.BusinessRuleTask#getRule <em>Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rule</em>'.
     * @see org.eclipse.mdt.bpmn2.BusinessRuleTask#getRule()
     * @see #getBusinessRuleTask()
     * @generated
     */
    EReference getBusinessRuleTask_Rule();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Callable Element</em>'.
     * @see org.eclipse.mdt.bpmn2.CallableElement
     * @generated
     */
    EClass getCallableElement();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.CallableElement#getInterfaceRef <em>Interface Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Interface Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.CallableElement#getInterfaceRef()
     * @see #getCallableElement()
     * @generated
     */
    EAttribute getCallableElement_InterfaceRef();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.CallableElement#getIoSpecification <em>Io Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Io Specification</em>'.
     * @see org.eclipse.mdt.bpmn2.CallableElement#getIoSpecification()
     * @see #getCallableElement()
     * @generated
     */
    EReference getCallableElement_IoSpecification();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.CallableElement#getIoBinding <em>Io Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Io Binding</em>'.
     * @see org.eclipse.mdt.bpmn2.CallableElement#getIoBinding()
     * @see #getCallableElement()
     * @generated
     */
    EReference getCallableElement_IoBinding();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CallableElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.CallableElement#getName()
     * @see #getCallableElement()
     * @generated
     */
    EAttribute getCallableElement_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CallActivity <em>Call Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Call Activity</em>'.
     * @see org.eclipse.mdt.bpmn2.CallActivity
     * @generated
     */
    EClass getCallActivity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CallActivity#getCalledElement <em>Called Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Called Element</em>'.
     * @see org.eclipse.mdt.bpmn2.CallActivity#getCalledElement()
     * @see #getCallActivity()
     * @generated
     */
    EAttribute getCallActivity_CalledElement();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CallActivity#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation</em>'.
     * @see org.eclipse.mdt.bpmn2.CallActivity#getOperation()
     * @see #getCallActivity()
     * @generated
     */
    EAttribute getCallActivity_Operation();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CallChoreographyActivity <em>Call Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Call Choreography Activity</em>'.
     * @see org.eclipse.mdt.bpmn2.CallChoreographyActivity
     * @generated
     */
    EClass getCallChoreographyActivity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CallChoreographyActivity#getCalledElement <em>Called Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Called Element</em>'.
     * @see org.eclipse.mdt.bpmn2.CallChoreographyActivity#getCalledElement()
     * @see #getCallChoreographyActivity()
     * @generated
     */
    EAttribute getCallChoreographyActivity_CalledElement();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CancelEventDefinition <em>Cancel Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cancel Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.CancelEventDefinition
     * @generated
     */
    EClass getCancelEventDefinition();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CatchEvent <em>Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Catch Event</em>'.
     * @see org.eclipse.mdt.bpmn2.CatchEvent
     * @generated
     */
    EClass getCatchEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.CatchEvent#getOutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Set</em>'.
     * @see org.eclipse.mdt.bpmn2.CatchEvent#getOutputSet()
     * @see #getCatchEvent()
     * @generated
     */
    EReference getCatchEvent_OutputSet();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.CatchEvent#getDataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Output</em>'.
     * @see org.eclipse.mdt.bpmn2.CatchEvent#getDataOutput()
     * @see #getCatchEvent()
     * @generated
     */
    EReference getCatchEvent_DataOutput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.CatchEvent#getDataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Output Association</em>'.
     * @see org.eclipse.mdt.bpmn2.CatchEvent#getDataOutputAssociation()
     * @see #getCatchEvent()
     * @generated
     */
    EReference getCatchEvent_DataOutputAssociation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.CatchEvent#getEventDefinitionGroup <em>Event Definition Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Event Definition Group</em>'.
     * @see org.eclipse.mdt.bpmn2.CatchEvent#getEventDefinitionGroup()
     * @see #getCatchEvent()
     * @generated
     */
    EAttribute getCatchEvent_EventDefinitionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.CatchEvent#getEventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.CatchEvent#getEventDefinition()
     * @see #getCatchEvent()
     * @generated
     */
    EReference getCatchEvent_EventDefinition();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.CatchEvent#getEventDefinitionRef <em>Event Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Event Definition Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.CatchEvent#getEventDefinitionRef()
     * @see #getCatchEvent()
     * @generated
     */
    EAttribute getCatchEvent_EventDefinitionRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Category <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Category</em>'.
     * @see org.eclipse.mdt.bpmn2.Category
     * @generated
     */
    EClass getCategory();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Category#getCategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Category Value</em>'.
     * @see org.eclipse.mdt.bpmn2.Category#getCategoryValue()
     * @see #getCategory()
     * @generated
     */
    EReference getCategory_CategoryValue();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Category Value</em>'.
     * @see org.eclipse.mdt.bpmn2.CategoryValue
     * @generated
     */
    EClass getCategoryValue();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CategoryValue#getRef <em>Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.CategoryValue#getRef()
     * @see #getCategoryValue()
     * @generated
     */
    EAttribute getCategoryValue_Ref();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CategoryValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.eclipse.mdt.bpmn2.CategoryValue#getValue()
     * @see #getCategoryValue()
     * @generated
     */
    EAttribute getCategoryValue_Value();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Choreography <em>Choreography</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Choreography</em>'.
     * @see org.eclipse.mdt.bpmn2.Choreography
     * @generated
     */
    EClass getChoreography();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Choreography#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn2.Choreography#getParticipant()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_Participant();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Choreography#getFlowElementGroup <em>Flow Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
     * @see org.eclipse.mdt.bpmn2.Choreography#getFlowElementGroup()
     * @see #getChoreography()
     * @generated
     */
    EAttribute getChoreography_FlowElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Choreography#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn2.Choreography#getFlowElement()
     * @see #getChoreography()
     * @generated
     */
    EReference getChoreography_FlowElement();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ChoreographyActivity <em>Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Choreography Activity</em>'.
     * @see org.eclipse.mdt.bpmn2.ChoreographyActivity
     * @generated
     */
    EClass getChoreographyActivity();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.ChoreographyActivity#getParticipantRef <em>Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ChoreographyActivity#getParticipantRef()
     * @see #getChoreographyActivity()
     * @generated
     */
    EAttribute getChoreographyActivity_ParticipantRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initiating Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ChoreographyActivity#getInitiatingParticipantRef()
     * @see #getChoreographyActivity()
     * @generated
     */
    EAttribute getChoreographyActivity_InitiatingParticipantRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ChoreographySubProcess <em>Choreography Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Choreography Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn2.ChoreographySubProcess
     * @generated
     */
    EClass getChoreographySubProcess();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.ChoreographySubProcess#getFlowElementGroup <em>Flow Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
     * @see org.eclipse.mdt.bpmn2.ChoreographySubProcess#getFlowElementGroup()
     * @see #getChoreographySubProcess()
     * @generated
     */
    EAttribute getChoreographySubProcess_FlowElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.ChoreographySubProcess#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn2.ChoreographySubProcess#getFlowElement()
     * @see #getChoreographySubProcess()
     * @generated
     */
    EReference getChoreographySubProcess_FlowElement();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ChoreographyTask <em>Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Choreography Task</em>'.
     * @see org.eclipse.mdt.bpmn2.ChoreographyTask
     * @generated
     */
    EClass getChoreographyTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.ChoreographyTask#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn2.ChoreographyTask#getMessageFlow()
     * @see #getChoreographyTask()
     * @generated
     */
    EReference getChoreographyTask_MessageFlow();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Collaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Collaboration</em>'.
     * @see org.eclipse.mdt.bpmn2.Collaboration
     * @generated
     */
    EClass getCollaboration();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Collaboration#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn2.Collaboration#getParticipant()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_Participant();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Collaboration#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn2.Collaboration#getMessageFlow()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_MessageFlow();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Collaboration#getArtifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Artifact</em>'.
     * @see org.eclipse.mdt.bpmn2.Collaboration#getArtifact()
     * @see #getCollaboration()
     * @generated
     */
    EReference getCollaboration_Artifact();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Collaboration#getChoreographyRef <em>Choreography Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Choreography Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Collaboration#getChoreographyRef()
     * @see #getCollaboration()
     * @generated
     */
    EAttribute getCollaboration_ChoreographyRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Collaboration#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Collaboration#getName()
     * @see #getCollaboration()
     * @generated
     */
    EAttribute getCollaboration_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Compensate Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.CompensateEventDefinition
     * @generated
     */
    EClass getCompensateEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Activity Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.CompensateEventDefinition#getActivityRef()
     * @see #getCompensateEventDefinition()
     * @generated
     */
    EAttribute getCompensateEventDefinition_ActivityRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Wait For Completion</em>'.
     * @see org.eclipse.mdt.bpmn2.CompensateEventDefinition#isWaitForCompletion()
     * @see #getCompensateEventDefinition()
     * @generated
     */
    EAttribute getCompensateEventDefinition_WaitForCompletion();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ComplexGateway <em>Complex Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.ComplexGateway
     * @generated
     */
    EClass getComplexGateway();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.ComplexGateway#getActivationCondition <em>Activation Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Activation Condition</em>'.
     * @see org.eclipse.mdt.bpmn2.ComplexGateway#getActivationCondition()
     * @see #getComplexGateway()
     * @generated
     */
    EReference getComplexGateway_ActivationCondition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ComplexGateway#getResetSequenceFlow <em>Reset Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reset Sequence Flow</em>'.
     * @see org.eclipse.mdt.bpmn2.ComplexGateway#getResetSequenceFlow()
     * @see #getComplexGateway()
     * @generated
     */
    EAttribute getComplexGateway_ResetSequenceFlow();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.ConditionalEventDefinition
     * @generated
     */
    EClass getConditionalEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.ConditionalEventDefinition#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.eclipse.mdt.bpmn2.ConditionalEventDefinition#getCondition()
     * @see #getConditionalEventDefinition()
     * @generated
     */
    EReference getConditionalEventDefinition_Condition();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Conversation <em>Conversation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conversation</em>'.
     * @see org.eclipse.mdt.bpmn2.Conversation
     * @generated
     */
    EClass getConversation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Conversation#getChildConversationRef <em>Child Conversation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Child Conversation Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Conversation#getChildConversationRef()
     * @see #getConversation()
     * @generated
     */
    EAttribute getConversation_ChildConversationRef();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Conversation#getParticipantRef <em>Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Conversation#getParticipantRef()
     * @see #getConversation()
     * @generated
     */
    EAttribute getConversation_ParticipantRef();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Conversation#getMessageFlowRef <em>Message Flow Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Message Flow Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Conversation#getMessageFlowRef()
     * @see #getConversation()
     * @generated
     */
    EAttribute getConversation_MessageFlowRef();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Conversation#getCorrelationKeyRef <em>Correlation Key Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Correlation Key Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Conversation#getCorrelationKeyRef()
     * @see #getConversation()
     * @generated
     */
    EAttribute getConversation_CorrelationKeyRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ConversationLink <em>Conversation Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conversation Link</em>'.
     * @see org.eclipse.mdt.bpmn2.ConversationLink
     * @generated
     */
    EClass getConversationLink();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ConversationLink#getConversationRef <em>Conversation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Conversation Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ConversationLink#getConversationRef()
     * @see #getConversationLink()
     * @generated
     */
    EAttribute getConversationLink_ConversationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ConversationLink#getParticipantRef <em>Participant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Participant Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ConversationLink#getParticipantRef()
     * @see #getConversationLink()
     * @generated
     */
    EAttribute getConversationLink_ParticipantRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ConversationView <em>Conversation View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conversation View</em>'.
     * @see org.eclipse.mdt.bpmn2.ConversationView
     * @generated
     */
    EClass getConversationView();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.ConversationView#getConversationRef <em>Conversation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Conversation Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ConversationView#getConversationRef()
     * @see #getConversationView()
     * @generated
     */
    EAttribute getConversationView_ConversationRef();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.ConversationView#getConversationLink <em>Conversation Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conversation Link</em>'.
     * @see org.eclipse.mdt.bpmn2.ConversationView#getConversationLink()
     * @see #getConversationView()
     * @generated
     */
    EReference getConversationView_ConversationLink();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CorrelationKey <em>Correlation Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Correlation Key</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationKey
     * @generated
     */
    EClass getCorrelationKey();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.CorrelationKey#getCorrelationPropertyRef <em>Correlation Property Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Correlation Property Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationKey#getCorrelationPropertyRef()
     * @see #getCorrelationKey()
     * @generated
     */
    EAttribute getCorrelationKey_CorrelationPropertyRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CorrelationKey#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationKey#getName()
     * @see #getCorrelationKey()
     * @generated
     */
    EAttribute getCorrelationKey_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CorrelationProperty <em>Correlation Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Correlation Property</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationProperty
     * @generated
     */
    EClass getCorrelationProperty();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.CorrelationProperty#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Correlation Property Retrieval Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationProperty#getCorrelationPropertyRetrievalExpression()
     * @see #getCorrelationProperty()
     * @generated
     */
    EReference getCorrelationProperty_CorrelationPropertyRetrievalExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CorrelationProperty#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationProperty#getName()
     * @see #getCorrelationProperty()
     * @generated
     */
    EAttribute getCorrelationProperty_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CorrelationProperty#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationProperty#getStructureRef()
     * @see #getCorrelationProperty()
     * @generated
     */
    EAttribute getCorrelationProperty_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Correlation Property Retrieval Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationPropertyRetrievalExpression
     * @generated
     */
    EClass getCorrelationPropertyRetrievalExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef()
     * @see #getCorrelationPropertyRetrievalExpression()
     * @generated
     */
    EAttribute getCorrelationPropertyRetrievalExpression_MessageRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.CorrelationSet <em>Correlation Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Correlation Set</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationSet
     * @generated
     */
    EClass getCorrelationSet();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.CorrelationSet#getFormalExpression <em>Formal Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Formal Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.CorrelationSet#getFormalExpression()
     * @see #getCorrelationSet()
     * @generated
     */
    EReference getCorrelationSet_FormalExpression();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.DataAssociation <em>Data Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Association</em>'.
     * @see org.eclipse.mdt.bpmn2.DataAssociation
     * @generated
     */
    EClass getDataAssociation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DataAssociation#getTransformation <em>Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Transformation</em>'.
     * @see org.eclipse.mdt.bpmn2.DataAssociation#getTransformation()
     * @see #getDataAssociation()
     * @generated
     */
    EReference getDataAssociation_Transformation();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.DataAssociation#getAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assignment</em>'.
     * @see org.eclipse.mdt.bpmn2.DataAssociation#getAssignment()
     * @see #getDataAssociation()
     * @generated
     */
    EReference getDataAssociation_Assignment();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.DataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Input</em>'.
     * @see org.eclipse.mdt.bpmn2.DataInput
     * @generated
     */
    EClass getDataInput();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataInput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.DataInput#getName()
     * @see #getDataInput()
     * @generated
     */
    EAttribute getDataInput_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataInput#isOptional <em>Optional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Optional</em>'.
     * @see org.eclipse.mdt.bpmn2.DataInput#isOptional()
     * @see #getDataInput()
     * @generated
     */
    EAttribute getDataInput_Optional();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataInput#getStructureDefinitionRef <em>Structure Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Definition Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.DataInput#getStructureDefinitionRef()
     * @see #getDataInput()
     * @generated
     */
    EAttribute getDataInput_StructureDefinitionRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataInput#isWhileExecuting <em>While Executing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>While Executing</em>'.
     * @see org.eclipse.mdt.bpmn2.DataInput#isWhileExecuting()
     * @see #getDataInput()
     * @generated
     */
    EAttribute getDataInput_WhileExecuting();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.DataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Input Association</em>'.
     * @see org.eclipse.mdt.bpmn2.DataInputAssociation
     * @generated
     */
    EClass getDataInputAssociation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.DataInputAssociation#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.DataInputAssociation#getSourceRef()
     * @see #getDataInputAssociation()
     * @generated
     */
    EAttribute getDataInputAssociation_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataInputAssociation#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.DataInputAssociation#getTargetRef()
     * @see #getDataInputAssociation()
     * @generated
     */
    EAttribute getDataInputAssociation_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.DataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Object</em>'.
     * @see org.eclipse.mdt.bpmn2.DataObject
     * @generated
     */
    EClass getDataObject();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.DataObject#getDataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data State</em>'.
     * @see org.eclipse.mdt.bpmn2.DataObject#getDataState()
     * @see #getDataObject()
     * @generated
     */
    EReference getDataObject_DataState();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataObject#isIsCollection <em>Is Collection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Collection</em>'.
     * @see org.eclipse.mdt.bpmn2.DataObject#isIsCollection()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_IsCollection();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataObject#getStructureDefinitionRef <em>Structure Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Definition Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.DataObject#getStructureDefinitionRef()
     * @see #getDataObject()
     * @generated
     */
    EAttribute getDataObject_StructureDefinitionRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.DataObjectState <em>Data Object State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Object State</em>'.
     * @see org.eclipse.mdt.bpmn2.DataObjectState
     * @generated
     */
    EClass getDataObjectState();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.DataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Output</em>'.
     * @see org.eclipse.mdt.bpmn2.DataOutput
     * @generated
     */
    EClass getDataOutput();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataOutput#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.DataOutput#getName()
     * @see #getDataOutput()
     * @generated
     */
    EAttribute getDataOutput_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataOutput#getStructureDefinitionRef <em>Structure Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Definition Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.DataOutput#getStructureDefinitionRef()
     * @see #getDataOutput()
     * @generated
     */
    EAttribute getDataOutput_StructureDefinitionRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.DataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Output Association</em>'.
     * @see org.eclipse.mdt.bpmn2.DataOutputAssociation
     * @generated
     */
    EClass getDataOutputAssociation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.DataOutputAssociation#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.DataOutputAssociation#getSourceRef()
     * @see #getDataOutputAssociation()
     * @generated
     */
    EAttribute getDataOutputAssociation_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.DataOutputAssociation#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.DataOutputAssociation#getTargetRef()
     * @see #getDataOutputAssociation()
     * @generated
     */
    EAttribute getDataOutputAssociation_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Definitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Definitions</em>'.
     * @see org.eclipse.mdt.bpmn2.Definitions
     * @generated
     */
    EClass getDefinitions();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Definitions#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Import</em>'.
     * @see org.eclipse.mdt.bpmn2.Definitions#getImport()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_Import();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Definitions#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Extension</em>'.
     * @see org.eclipse.mdt.bpmn2.Definitions#getExtension()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_Extension();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Definitions#getRootElementGroup <em>Root Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Root Element Group</em>'.
     * @see org.eclipse.mdt.bpmn2.Definitions#getRootElementGroup()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_RootElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Definitions#getRootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Root Element</em>'.
     * @see org.eclipse.mdt.bpmn2.Definitions#getRootElement()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_RootElement();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Definitions#getRelationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relationship</em>'.
     * @see org.eclipse.mdt.bpmn2.Definitions#getRelationship()
     * @see #getDefinitions()
     * @generated
     */
    EReference getDefinitions_Relationship();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Definitions#getExpressionLanguage <em>Expression Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression Language</em>'.
     * @see org.eclipse.mdt.bpmn2.Definitions#getExpressionLanguage()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_ExpressionLanguage();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Definitions#getTargetNamespace <em>Target Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Namespace</em>'.
     * @see org.eclipse.mdt.bpmn2.Definitions#getTargetNamespace()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_TargetNamespace();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Definitions#getTypeLanguage <em>Type Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type Language</em>'.
     * @see org.eclipse.mdt.bpmn2.Definitions#getTypeLanguage()
     * @see #getDefinitions()
     * @generated
     */
    EAttribute getDefinitions_TypeLanguage();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn2.Documentation
     * @generated
     */
    EClass getDocumentation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Documentation#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn2.Documentation#getMixed()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Documentation#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn2.Documentation#getAny()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Any();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.EndEvent <em>End Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>End Event</em>'.
     * @see org.eclipse.mdt.bpmn2.EndEvent
     * @generated
     */
    EClass getEndEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.EndPoint <em>End Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>End Point</em>'.
     * @see org.eclipse.mdt.bpmn2.EndPoint
     * @generated
     */
    EClass getEndPoint();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Entity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity</em>'.
     * @see org.eclipse.mdt.bpmn2.Entity
     * @generated
     */
    EClass getEntity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Entity#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Entity#getName()
     * @see #getEntity()
     * @generated
     */
    EAttribute getEntity_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Error <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Error</em>'.
     * @see org.eclipse.mdt.bpmn2.Error
     * @generated
     */
    EClass getError();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Error#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Error#getStructureRef()
     * @see #getError()
     * @generated
     */
    EAttribute getError_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ErrorEventDefinition <em>Error Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Error Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.ErrorEventDefinition
     * @generated
     */
    EClass getErrorEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ErrorEventDefinition#getErrorCode <em>Error Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Error Code</em>'.
     * @see org.eclipse.mdt.bpmn2.ErrorEventDefinition#getErrorCode()
     * @see #getErrorEventDefinition()
     * @generated
     */
    EAttribute getErrorEventDefinition_ErrorCode();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Error Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ErrorEventDefinition#getErrorRef()
     * @see #getErrorEventDefinition()
     * @generated
     */
    EAttribute getErrorEventDefinition_ErrorRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Escalation <em>Escalation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Escalation</em>'.
     * @see org.eclipse.mdt.bpmn2.Escalation
     * @generated
     */
    EClass getEscalation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Escalation#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Escalation#getStructureRef()
     * @see #getEscalation()
     * @generated
     */
    EAttribute getEscalation_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Escalation Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.EscalationEventDefinition
     * @generated
     */
    EClass getEscalationEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.EscalationEventDefinition#getEscalationCode <em>Escalation Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Escalation Code</em>'.
     * @see org.eclipse.mdt.bpmn2.EscalationEventDefinition#getEscalationCode()
     * @see #getEscalationEventDefinition()
     * @generated
     */
    EAttribute getEscalationEventDefinition_EscalationCode();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.EscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Escalation Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.EscalationEventDefinition#getEscalationRef()
     * @see #getEscalationEventDefinition()
     * @generated
     */
    EAttribute getEscalationEventDefinition_EscalationRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event</em>'.
     * @see org.eclipse.mdt.bpmn2.Event
     * @generated
     */
    EClass getEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.EventBasedGateway <em>Event Based Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Based Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.EventBasedGateway
     * @generated
     */
    EClass getEventBasedGateway();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.EventBasedGateway#isInstantiate <em>Instantiate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instantiate</em>'.
     * @see org.eclipse.mdt.bpmn2.EventBasedGateway#isInstantiate()
     * @see #getEventBasedGateway()
     * @generated
     */
    EAttribute getEventBasedGateway_Instantiate();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.EventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.EventDefinition
     * @generated
     */
    EClass getEventDefinition();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ExclusiveGateway <em>Exclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exclusive Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.ExclusiveGateway
     * @generated
     */
    EClass getExclusiveGateway();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ExclusiveGateway#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.eclipse.mdt.bpmn2.ExclusiveGateway#getDefault()
     * @see #getExclusiveGateway()
     * @generated
     */
    EAttribute getExclusiveGateway_Default();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.Expression
     * @generated
     */
    EClass getExpression();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Extension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extension</em>'.
     * @see org.eclipse.mdt.bpmn2.Extension
     * @generated
     */
    EClass getExtension();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Extension#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Documentation</em>'.
     * @see org.eclipse.mdt.bpmn2.Extension#getDocumentation()
     * @see #getExtension()
     * @generated
     */
    EReference getExtension_Documentation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Extension#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.Extension#getDefinition()
     * @see #getExtension()
     * @generated
     */
    EAttribute getExtension_Definition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Extension#isMustUnderstand <em>Must Understand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Must Understand</em>'.
     * @see org.eclipse.mdt.bpmn2.Extension#isMustUnderstand()
     * @see #getExtension()
     * @generated
     */
    EAttribute getExtension_MustUnderstand();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.FlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn2.FlowElement
     * @generated
     */
    EClass getFlowElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.FlowElement#getAuditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Auditing</em>'.
     * @see org.eclipse.mdt.bpmn2.FlowElement#getAuditing()
     * @see #getFlowElement()
     * @generated
     */
    EReference getFlowElement_Auditing();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.FlowElement#getMonitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Monitoring</em>'.
     * @see org.eclipse.mdt.bpmn2.FlowElement#getMonitoring()
     * @see #getFlowElement()
     * @generated
     */
    EReference getFlowElement_Monitoring();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.FlowElement#getCategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Category Value</em>'.
     * @see org.eclipse.mdt.bpmn2.FlowElement#getCategoryValue()
     * @see #getFlowElement()
     * @generated
     */
    EAttribute getFlowElement_CategoryValue();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.FlowElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.FlowElement#getName()
     * @see #getFlowElement()
     * @generated
     */
    EAttribute getFlowElement_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.FlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Node</em>'.
     * @see org.eclipse.mdt.bpmn2.FlowNode
     * @generated
     */
    EClass getFlowNode();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.FlowNode#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Incoming</em>'.
     * @see org.eclipse.mdt.bpmn2.FlowNode#getIncoming()
     * @see #getFlowNode()
     * @generated
     */
    EAttribute getFlowNode_Incoming();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.FlowNode#getOutgoing <em>Outgoing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Outgoing</em>'.
     * @see org.eclipse.mdt.bpmn2.FlowNode#getOutgoing()
     * @see #getFlowNode()
     * @generated
     */
    EAttribute getFlowNode_Outgoing();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.FormalExpression <em>Formal Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Formal Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.FormalExpression
     * @generated
     */
    EClass getFormalExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Evaluates To Type Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.FormalExpression#getEvaluatesToTypeRef()
     * @see #getFormalExpression()
     * @generated
     */
    EAttribute getFormalExpression_EvaluatesToTypeRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.FormalExpression#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see org.eclipse.mdt.bpmn2.FormalExpression#getLanguage()
     * @see #getFormalExpression()
     * @generated
     */
    EAttribute getFormalExpression_Language();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Gateway <em>Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.Gateway
     * @generated
     */
    EClass getGateway();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Gateway#getGatewayDirection <em>Gateway Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gateway Direction</em>'.
     * @see org.eclipse.mdt.bpmn2.Gateway#getGatewayDirection()
     * @see #getGateway()
     * @generated
     */
    EAttribute getGateway_GatewayDirection();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Business Rule Task</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalBusinessRuleTask
     * @generated
     */
    EClass getGlobalBusinessRuleTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.GlobalBusinessRuleTask#getRule <em>Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rule</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalBusinessRuleTask#getRule()
     * @see #getGlobalBusinessRuleTask()
     * @generated
     */
    EReference getGlobalBusinessRuleTask_Rule();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Choreography Task</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalChoreographyTask
     * @generated
     */
    EClass getGlobalChoreographyTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.GlobalChoreographyTask#getParticipant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalChoreographyTask#getParticipant()
     * @see #getGlobalChoreographyTask()
     * @generated
     */
    EReference getGlobalChoreographyTask_Participant();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.GlobalChoreographyTask#getMessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalChoreographyTask#getMessageFlow()
     * @see #getGlobalChoreographyTask()
     * @generated
     */
    EReference getGlobalChoreographyTask_MessageFlow();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.GlobalChoreographyTask#getInitiatingParticipant <em>Initiating Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Initiating Participant</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalChoreographyTask#getInitiatingParticipant()
     * @see #getGlobalChoreographyTask()
     * @generated
     */
    EAttribute getGlobalChoreographyTask_InitiatingParticipant();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.GlobalManualTask <em>Global Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Manual Task</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalManualTask
     * @generated
     */
    EClass getGlobalManualTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.GlobalScriptTask <em>Global Script Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Script Task</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalScriptTask
     * @generated
     */
    EClass getGlobalScriptTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.GlobalScriptTask#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Script</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalScriptTask#getScript()
     * @see #getGlobalScriptTask()
     * @generated
     */
    EReference getGlobalScriptTask_Script();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script Language</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalScriptTask#getScriptLanguage()
     * @see #getGlobalScriptTask()
     * @generated
     */
    EAttribute getGlobalScriptTask_ScriptLanguage();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.GlobalTask <em>Global Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global Task</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalTask
     * @generated
     */
    EClass getGlobalTask();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.GlobalTask#getPerformerGroup <em>Performer Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Performer Group</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalTask#getPerformerGroup()
     * @see #getGlobalTask()
     * @generated
     */
    EAttribute getGlobalTask_PerformerGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.GlobalTask#getPerformer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Performer</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalTask#getPerformer()
     * @see #getGlobalTask()
     * @generated
     */
    EReference getGlobalTask_Performer();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.GlobalUserTask <em>Global User Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Global User Task</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalUserTask
     * @generated
     */
    EClass getGlobalUserTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.GlobalUserTask#getRendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rendering</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalUserTask#getRendering()
     * @see #getGlobalUserTask()
     * @generated
     */
    EReference getGlobalUserTask_Rendering();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.GlobalUserTask#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalUserTask#getImplementation()
     * @see #getGlobalUserTask()
     * @generated
     */
    EAttribute getGlobalUserTask_Implementation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.GlobalUserTask#getInMessageRef <em>In Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalUserTask#getInMessageRef()
     * @see #getGlobalUserTask()
     * @generated
     */
    EAttribute getGlobalUserTask_InMessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.GlobalUserTask#getOutMessageRef <em>Out Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.GlobalUserTask#getOutMessageRef()
     * @see #getGlobalUserTask()
     * @generated
     */
    EAttribute getGlobalUserTask_OutMessageRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Group <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Group</em>'.
     * @see org.eclipse.mdt.bpmn2.Group
     * @generated
     */
    EClass getGroup();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Group#getCategoryRef <em>Category Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Category Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Group#getCategoryRef()
     * @see #getGroup()
     * @generated
     */
    EAttribute getGroup_CategoryRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Handler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Handler</em>'.
     * @see org.eclipse.mdt.bpmn2.Handler
     * @generated
     */
    EClass getHandler();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.HumanPerformer <em>Human Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Human Performer</em>'.
     * @see org.eclipse.mdt.bpmn2.HumanPerformer
     * @generated
     */
    EClass getHumanPerformer();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.HumanPerformer#getPeopleAssignmentGroup <em>People Assignment Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>People Assignment Group</em>'.
     * @see org.eclipse.mdt.bpmn2.HumanPerformer#getPeopleAssignmentGroup()
     * @see #getHumanPerformer()
     * @generated
     */
    EAttribute getHumanPerformer_PeopleAssignmentGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.HumanPerformer#getPeopleAssignment <em>People Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>People Assignment</em>'.
     * @see org.eclipse.mdt.bpmn2.HumanPerformer#getPeopleAssignment()
     * @see #getHumanPerformer()
     * @generated
     */
    EReference getHumanPerformer_PeopleAssignment();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Import <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Import</em>'.
     * @see org.eclipse.mdt.bpmn2.Import
     * @generated
     */
    EClass getImport();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Import#getImportType <em>Import Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Import Type</em>'.
     * @see org.eclipse.mdt.bpmn2.Import#getImportType()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_ImportType();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Import#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Location</em>'.
     * @see org.eclipse.mdt.bpmn2.Import#getLocation()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_Location();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Import#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.eclipse.mdt.bpmn2.Import#getNamespace()
     * @see #getImport()
     * @generated
     */
    EAttribute getImport_Namespace();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.InclusiveGateway <em>Inclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inclusive Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.InclusiveGateway
     * @generated
     */
    EClass getInclusiveGateway();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.InclusiveGateway#getDefault <em>Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default</em>'.
     * @see org.eclipse.mdt.bpmn2.InclusiveGateway#getDefault()
     * @see #getInclusiveGateway()
     * @generated
     */
    EAttribute getInclusiveGateway_Default();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.InputOutputBinding <em>Input Output Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Output Binding</em>'.
     * @see org.eclipse.mdt.bpmn2.InputOutputBinding
     * @generated
     */
    EClass getInputOutputBinding();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.InputOutputBinding#getInputDataRef <em>Input Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Data Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.InputOutputBinding#getInputDataRef()
     * @see #getInputOutputBinding()
     * @generated
     */
    EAttribute getInputOutputBinding_InputDataRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.InputOutputBinding#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.InputOutputBinding#getOperationRef()
     * @see #getInputOutputBinding()
     * @generated
     */
    EAttribute getInputOutputBinding_OperationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.InputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Data Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.InputOutputBinding#getOutputDataRef()
     * @see #getInputOutputBinding()
     * @generated
     */
    EAttribute getInputOutputBinding_OutputDataRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.InputOutputSpecification <em>Input Output Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Output Specification</em>'.
     * @see org.eclipse.mdt.bpmn2.InputOutputSpecification
     * @generated
     */
    EClass getInputOutputSpecification();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.InputOutputSpecification#getDataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Input</em>'.
     * @see org.eclipse.mdt.bpmn2.InputOutputSpecification#getDataInput()
     * @see #getInputOutputSpecification()
     * @generated
     */
    EReference getInputOutputSpecification_DataInput();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.InputOutputSpecification#getDataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Output</em>'.
     * @see org.eclipse.mdt.bpmn2.InputOutputSpecification#getDataOutput()
     * @see #getInputOutputSpecification()
     * @generated
     */
    EReference getInputOutputSpecification_DataOutput();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.InputOutputSpecification#getInputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input Set</em>'.
     * @see org.eclipse.mdt.bpmn2.InputOutputSpecification#getInputSet()
     * @see #getInputOutputSpecification()
     * @generated
     */
    EReference getInputOutputSpecification_InputSet();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.InputOutputSpecification#getOutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output Set</em>'.
     * @see org.eclipse.mdt.bpmn2.InputOutputSpecification#getOutputSet()
     * @see #getInputOutputSpecification()
     * @generated
     */
    EReference getInputOutputSpecification_OutputSet();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.InputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Set</em>'.
     * @see org.eclipse.mdt.bpmn2.InputSet
     * @generated
     */
    EClass getInputSet();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Data Input Refs</em>'.
     * @see org.eclipse.mdt.bpmn2.InputSet#getDataInputRefs()
     * @see #getInputSet()
     * @generated
     */
    EAttribute getInputSet_DataInputRefs();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Output Set Refs</em>'.
     * @see org.eclipse.mdt.bpmn2.InputSet#getOutputSetRefs()
     * @see #getInputSet()
     * @generated
     */
    EAttribute getInputSet_OutputSetRefs();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.InputSet#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.InputSet#getName()
     * @see #getInputSet()
     * @generated
     */
    EAttribute getInputSet_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface</em>'.
     * @see org.eclipse.mdt.bpmn2.Interface
     * @generated
     */
    EClass getInterface();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Interface#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operation</em>'.
     * @see org.eclipse.mdt.bpmn2.Interface#getOperation()
     * @see #getInterface()
     * @generated
     */
    EReference getInterface_Operation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Interface#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Interface#getName()
     * @see #getInterface()
     * @generated
     */
    EAttribute getInterface_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intermediate Catch Event</em>'.
     * @see org.eclipse.mdt.bpmn2.IntermediateCatchEvent
     * @generated
     */
    EClass getIntermediateCatchEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intermediate Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn2.IntermediateThrowEvent
     * @generated
     */
    EClass getIntermediateThrowEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Lane <em>Lane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lane</em>'.
     * @see org.eclipse.mdt.bpmn2.Lane
     * @generated
     */
    EClass getLane();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.Lane#getPartitionElement <em>Partition Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Partition Element</em>'.
     * @see org.eclipse.mdt.bpmn2.Lane#getPartitionElement()
     * @see #getLane()
     * @generated
     */
    EReference getLane_PartitionElement();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Lane#getFlowElementRef <em>Flow Element Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Lane#getFlowElementRef()
     * @see #getLane()
     * @generated
     */
    EAttribute getLane_FlowElementRef();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.Lane#getChildLaneSet <em>Child Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child Lane Set</em>'.
     * @see org.eclipse.mdt.bpmn2.Lane#getChildLaneSet()
     * @see #getLane()
     * @generated
     */
    EReference getLane_ChildLaneSet();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Lane#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Lane#getName()
     * @see #getLane()
     * @generated
     */
    EAttribute getLane_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Lane#getPartitionElementRef <em>Partition Element Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Partition Element Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Lane#getPartitionElementRef()
     * @see #getLane()
     * @generated
     */
    EAttribute getLane_PartitionElementRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.LaneSet <em>Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lane Set</em>'.
     * @see org.eclipse.mdt.bpmn2.LaneSet
     * @generated
     */
    EClass getLaneSet();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.LaneSet#getLane <em>Lane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lane</em>'.
     * @see org.eclipse.mdt.bpmn2.LaneSet#getLane()
     * @see #getLaneSet()
     * @generated
     */
    EReference getLaneSet_Lane();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.LinkEventDefinition <em>Link Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.LinkEventDefinition
     * @generated
     */
    EClass getLinkEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.LinkEventDefinition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.LinkEventDefinition#getName()
     * @see #getLinkEventDefinition()
     * @generated
     */
    EAttribute getLinkEventDefinition_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.LoopCharacteristics <em>Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn2.LoopCharacteristics
     * @generated
     */
    EClass getLoopCharacteristics();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ManualTask <em>Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Manual Task</em>'.
     * @see org.eclipse.mdt.bpmn2.ManualTask
     * @generated
     */
    EClass getManualTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Message <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message</em>'.
     * @see org.eclipse.mdt.bpmn2.Message
     * @generated
     */
    EClass getMessage();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Message#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Message#getName()
     * @see #getMessage()
     * @generated
     */
    EAttribute getMessage_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Message#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Message#getStructureRef()
     * @see #getMessage()
     * @generated
     */
    EAttribute getMessage_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.MessageEventDefinition <em>Message Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.MessageEventDefinition
     * @generated
     */
    EClass getMessageEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MessageEventDefinition#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.MessageEventDefinition#getMessageRef()
     * @see #getMessageEventDefinition()
     * @generated
     */
    EAttribute getMessageEventDefinition_MessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MessageEventDefinition#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.MessageEventDefinition#getOperationRef()
     * @see #getMessageEventDefinition()
     * @generated
     */
    EAttribute getMessageEventDefinition_OperationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MessageEventDefinition#getServiceReferenceRef <em>Service Reference Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Reference Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.MessageEventDefinition#getServiceReferenceRef()
     * @see #getMessageEventDefinition()
     * @generated
     */
    EAttribute getMessageEventDefinition_ServiceReferenceRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.MessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Message Flow</em>'.
     * @see org.eclipse.mdt.bpmn2.MessageFlow
     * @generated
     */
    EClass getMessageFlow();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MessageFlow#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.MessageFlow#getMessageRef()
     * @see #getMessageFlow()
     * @generated
     */
    EAttribute getMessageFlow_MessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MessageFlow#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.MessageFlow#getName()
     * @see #getMessageFlow()
     * @generated
     */
    EAttribute getMessageFlow_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MessageFlow#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.MessageFlow#getSourceRef()
     * @see #getMessageFlow()
     * @generated
     */
    EAttribute getMessageFlow_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MessageFlow#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.MessageFlow#getTargetRef()
     * @see #getMessageFlow()
     * @generated
     */
    EAttribute getMessageFlow_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Monitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Monitoring</em>'.
     * @see org.eclipse.mdt.bpmn2.Monitoring
     * @generated
     */
    EClass getMonitoring();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multi Instance Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics
     * @generated
     */
    EClass getMultiInstanceLoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopCardinality <em>Loop Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Cardinality</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopCardinality()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_LoopCardinality();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getComplexFlowCondition <em>Complex Flow Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Complex Flow Condition</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getComplexFlowCondition()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_ComplexFlowCondition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataInput <em>Loop Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Data Input</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataInput()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_LoopDataInput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataOutput <em>Loop Data Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Data Output</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataOutput()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_LoopDataOutput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getInputDataItem <em>Input Data Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Data Item</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getInputDataItem()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_InputDataItem();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getOutputDataItem <em>Output Data Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Data Item</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getOutputDataItem()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EReference getMultiInstanceLoopCharacteristics_OutputDataItem();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Behavior</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getBehavior()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EAttribute getMultiInstanceLoopCharacteristics_Behavior();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cancel Remaining Instances</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isCancelRemainingInstances()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EAttribute getMultiInstanceLoopCharacteristics_CancelRemainingInstances();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Sequential</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential()
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    EAttribute getMultiInstanceLoopCharacteristics_IsSequential();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation</em>'.
     * @see org.eclipse.mdt.bpmn2.Operation
     * @generated
     */
    EClass getOperation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Operation#getInMessageRef <em>In Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Operation#getInMessageRef()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_InMessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Operation#getOutMessageRef <em>Out Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Operation#getOutMessageRef()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_OutMessageRef();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Operation#getErrorRef <em>Error Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Error Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Operation#getErrorRef()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_ErrorRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Operation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Operation#getName()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.OutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Set</em>'.
     * @see org.eclipse.mdt.bpmn2.OutputSet
     * @generated
     */
    EClass getOutputSet();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Data Output Refs</em>'.
     * @see org.eclipse.mdt.bpmn2.OutputSet#getDataOutputRefs()
     * @see #getOutputSet()
     * @generated
     */
    EAttribute getOutputSet_DataOutputRefs();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.OutputSet#getInputSetRefs <em>Input Set Refs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Input Set Refs</em>'.
     * @see org.eclipse.mdt.bpmn2.OutputSet#getInputSetRefs()
     * @see #getOutputSet()
     * @generated
     */
    EAttribute getOutputSet_InputSetRefs();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.OutputSet#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.OutputSet#getName()
     * @see #getOutputSet()
     * @generated
     */
    EAttribute getOutputSet_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ParallelGateway <em>Parallel Gateway</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parallel Gateway</em>'.
     * @see org.eclipse.mdt.bpmn2.ParallelGateway
     * @generated
     */
    EClass getParallelGateway();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see org.eclipse.mdt.bpmn2.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Parameter#isIsRequired <em>Is Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Required</em>'.
     * @see org.eclipse.mdt.bpmn2.Parameter#isIsRequired()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_IsRequired();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Parameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Parameter#getName()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Parameter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.mdt.bpmn2.Parameter#getType()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Type();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ParameterBinding <em>Parameter Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Binding</em>'.
     * @see org.eclipse.mdt.bpmn2.ParameterBinding
     * @generated
     */
    EClass getParameterBinding();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.ParameterBinding#getExpressionGroup <em>Expression Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Expression Group</em>'.
     * @see org.eclipse.mdt.bpmn2.ParameterBinding#getExpressionGroup()
     * @see #getParameterBinding()
     * @generated
     */
    EAttribute getParameterBinding_ExpressionGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.ParameterBinding#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.ParameterBinding#getExpression()
     * @see #getParameterBinding()
     * @generated
     */
    EReference getParameterBinding_Expression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ParameterBinding#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parameter</em>'.
     * @see org.eclipse.mdt.bpmn2.ParameterBinding#getParameter()
     * @see #getParameterBinding()
     * @generated
     */
    EAttribute getParameterBinding_Parameter();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Participant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Participant</em>'.
     * @see org.eclipse.mdt.bpmn2.Participant
     * @generated
     */
    EClass getParticipant();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Participant#getInterfaceRef <em>Interface Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Interface Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Participant#getInterfaceRef()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_InterfaceRef();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Participant Multiplicity</em>'.
     * @see org.eclipse.mdt.bpmn2.Participant#getParticipantMultiplicity()
     * @see #getParticipant()
     * @generated
     */
    EReference getParticipant_ParticipantMultiplicity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Participant#getEntityRef <em>Entity Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entity Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Participant#getEntityRef()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_EntityRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Participant#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Participant#getName()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Participant#getProcessRef <em>Process Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Participant#getProcessRef()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_ProcessRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Participant#getRoleRef <em>Role Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Role Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Participant#getRoleRef()
     * @see #getParticipant()
     * @generated
     */
    EAttribute getParticipant_RoleRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Participant Multiplicity</em>'.
     * @see org.eclipse.mdt.bpmn2.ParticipantMultiplicity
     * @generated
     */
    EClass getParticipantMultiplicity();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMaximum <em>Maximum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum</em>'.
     * @see org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMaximum()
     * @see #getParticipantMultiplicity()
     * @generated
     */
    EAttribute getParticipantMultiplicity_Maximum();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMinimum <em>Minimum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Minimum</em>'.
     * @see org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMinimum()
     * @see #getParticipantMultiplicity()
     * @generated
     */
    EAttribute getParticipantMultiplicity_Minimum();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.PeopleAssignment <em>People Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>People Assignment</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignment
     * @generated
     */
    EClass getPeopleAssignment();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentExpression <em>People Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>People Assignment Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentExpression
     * @generated
     */
    EClass getPeopleAssignmentExpression();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentExpression#getExpressionGroup <em>Expression Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Expression Group</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentExpression#getExpressionGroup()
     * @see #getPeopleAssignmentExpression()
     * @generated
     */
    EAttribute getPeopleAssignmentExpression_ExpressionGroup();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentExpression#getExpression()
     * @see #getPeopleAssignmentExpression()
     * @generated
     */
    EReference getPeopleAssignmentExpression_Expression();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentLiteral <em>People Assignment Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>People Assignment Literal</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentLiteral
     * @generated
     */
    EClass getPeopleAssignmentLiteral();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentLiteral#getUser <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>User</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentLiteral#getUser()
     * @see #getPeopleAssignmentLiteral()
     * @generated
     */
    EAttribute getPeopleAssignmentLiteral_User();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup <em>People Assignment People Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>People Assignment People Group</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup
     * @generated
     */
    EClass getPeopleAssignmentPeopleGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup#getParameter()
     * @see #getPeopleAssignmentPeopleGroup()
     * @generated
     */
    EReference getPeopleAssignmentPeopleGroup_Parameter();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup#getDefinition()
     * @see #getPeopleAssignmentPeopleGroup()
     * @generated
     */
    EAttribute getPeopleAssignmentPeopleGroup_Definition();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.PeopleGroup <em>People Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>People Group</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleGroup
     * @generated
     */
    EClass getPeopleGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.PeopleGroup#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleGroup#getParameter()
     * @see #getPeopleGroup()
     * @generated
     */
    EReference getPeopleGroup_Parameter();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.PeopleGroup#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.PeopleGroup#getName()
     * @see #getPeopleGroup()
     * @generated
     */
    EAttribute getPeopleGroup_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Performer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Performer</em>'.
     * @see org.eclipse.mdt.bpmn2.Performer
     * @generated
     */
    EClass getPerformer();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Performer#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Performer#getName()
     * @see #getPerformer()
     * @generated
     */
    EAttribute getPerformer_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.PotentialOwner <em>Potential Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Potential Owner</em>'.
     * @see org.eclipse.mdt.bpmn2.PotentialOwner
     * @generated
     */
    EClass getPotentialOwner();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.eclipse.mdt.bpmn2.Process
     * @generated
     */
    EClass getProcess();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.Process#getAuditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Auditing</em>'.
     * @see org.eclipse.mdt.bpmn2.Process#getAuditing()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Auditing();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.Process#getMonitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Monitoring</em>'.
     * @see org.eclipse.mdt.bpmn2.Process#getMonitoring()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Monitoring();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Process#getProcessRole <em>Process Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Process Role</em>'.
     * @see org.eclipse.mdt.bpmn2.Process#getProcessRole()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_ProcessRole();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Process#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Property</em>'.
     * @see org.eclipse.mdt.bpmn2.Process#getProperty()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Property();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Process#getLaneSet <em>Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lane Set</em>'.
     * @see org.eclipse.mdt.bpmn2.Process#getLaneSet()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_LaneSet();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Process#getFlowElementGroup <em>Flow Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
     * @see org.eclipse.mdt.bpmn2.Process#getFlowElementGroup()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_FlowElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.Process#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn2.Process#getFlowElement()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_FlowElement();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Process#getProcessType <em>Process Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Type</em>'.
     * @see org.eclipse.mdt.bpmn2.Process#getProcessType()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_ProcessType();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ProcessRole <em>Process Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Role</em>'.
     * @see org.eclipse.mdt.bpmn2.ProcessRole
     * @generated
     */
    EClass getProcessRole();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.ProcessRole#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see org.eclipse.mdt.bpmn2.ProcessRole#getParameter()
     * @see #getProcessRole()
     * @generated
     */
    EReference getProcessRole_Parameter();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ProcessRole#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.ProcessRole#getName()
     * @see #getProcessRole()
     * @generated
     */
    EAttribute getProcessRole_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see org.eclipse.mdt.bpmn2.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Property#getStructureDefinitionRef <em>Structure Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Definition Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Property#getStructureDefinitionRef()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_StructureDefinitionRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ReceiveTask <em>Receive Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Receive Task</em>'.
     * @see org.eclipse.mdt.bpmn2.ReceiveTask
     * @generated
     */
    EClass getReceiveTask();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ReceiveTask#isInstantiate <em>Instantiate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instantiate</em>'.
     * @see org.eclipse.mdt.bpmn2.ReceiveTask#isInstantiate()
     * @see #getReceiveTask()
     * @generated
     */
    EAttribute getReceiveTask_Instantiate();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ReceiveTask#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ReceiveTask#getMessageRef()
     * @see #getReceiveTask()
     * @generated
     */
    EAttribute getReceiveTask_MessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ReceiveTask#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ReceiveTask#getOperationRef()
     * @see #getReceiveTask()
     * @generated
     */
    EAttribute getReceiveTask_OperationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ReceiveTask#getServiceReferenceRef <em>Service Reference Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Reference Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ReceiveTask#getServiceReferenceRef()
     * @see #getReceiveTask()
     * @generated
     */
    EAttribute getReceiveTask_ServiceReferenceRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relationship</em>'.
     * @see org.eclipse.mdt.bpmn2.Relationship
     * @generated
     */
    EClass getRelationship();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Relationship#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Source</em>'.
     * @see org.eclipse.mdt.bpmn2.Relationship#getSource()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Source();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Relationship#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Target</em>'.
     * @see org.eclipse.mdt.bpmn2.Relationship#getTarget()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Target();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Relationship#getDirection <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direction</em>'.
     * @see org.eclipse.mdt.bpmn2.Relationship#getDirection()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Direction();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Relationship#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.eclipse.mdt.bpmn2.Relationship#getType()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Type();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Rendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rendering</em>'.
     * @see org.eclipse.mdt.bpmn2.Rendering
     * @generated
     */
    EClass getRendering();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Role <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Role</em>'.
     * @see org.eclipse.mdt.bpmn2.Role
     * @generated
     */
    EClass getRole();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Role#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Role#getName()
     * @see #getRole()
     * @generated
     */
    EAttribute getRole_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.RootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Root Element</em>'.
     * @see org.eclipse.mdt.bpmn2.RootElement
     * @generated
     */
    EClass getRootElement();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Script <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script</em>'.
     * @see org.eclipse.mdt.bpmn2.Script
     * @generated
     */
    EClass getScript();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Script#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn2.Script#getMixed()
     * @see #getScript()
     * @generated
     */
    EAttribute getScript_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Script#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn2.Script#getAny()
     * @see #getScript()
     * @generated
     */
    EAttribute getScript_Any();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ScriptTask <em>Script Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script Task</em>'.
     * @see org.eclipse.mdt.bpmn2.ScriptTask
     * @generated
     */
    EClass getScriptTask();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.ScriptTask#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Script</em>'.
     * @see org.eclipse.mdt.bpmn2.ScriptTask#getScript()
     * @see #getScriptTask()
     * @generated
     */
    EReference getScriptTask_Script();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ScriptTask#getScriptLanguage <em>Script Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Script Language</em>'.
     * @see org.eclipse.mdt.bpmn2.ScriptTask#getScriptLanguage()
     * @see #getScriptTask()
     * @generated
     */
    EAttribute getScriptTask_ScriptLanguage();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.SendTask <em>Send Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Send Task</em>'.
     * @see org.eclipse.mdt.bpmn2.SendTask
     * @generated
     */
    EClass getSendTask();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.SendTask#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.SendTask#getMessageRef()
     * @see #getSendTask()
     * @generated
     */
    EAttribute getSendTask_MessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.SendTask#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.SendTask#getOperationRef()
     * @see #getSendTask()
     * @generated
     */
    EAttribute getSendTask_OperationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.SendTask#getServiceReferenceRef <em>Service Reference Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Reference Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.SendTask#getServiceReferenceRef()
     * @see #getSendTask()
     * @generated
     */
    EAttribute getSendTask_ServiceReferenceRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.SequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sequence Flow</em>'.
     * @see org.eclipse.mdt.bpmn2.SequenceFlow
     * @generated
     */
    EClass getSequenceFlow();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.SequenceFlow#getConditionExpression <em>Condition Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition Expression</em>'.
     * @see org.eclipse.mdt.bpmn2.SequenceFlow#getConditionExpression()
     * @see #getSequenceFlow()
     * @generated
     */
    EReference getSequenceFlow_ConditionExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.SequenceFlow#getSourceRef()
     * @see #getSequenceFlow()
     * @generated
     */
    EAttribute getSequenceFlow_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.SequenceFlow#getTargetRef()
     * @see #getSequenceFlow()
     * @generated
     */
    EAttribute getSequenceFlow_TargetRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ServiceReference <em>Service Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Reference</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceReference
     * @generated
     */
    EClass getServiceReference();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ServiceReference#getInterfaceRef <em>Interface Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Interface Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceReference#getInterfaceRef()
     * @see #getServiceReference()
     * @generated
     */
    EAttribute getServiceReference_InterfaceRef();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.ServiceReference#getEndPointRef <em>End Point Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>End Point Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceReference#getEndPointRef()
     * @see #getServiceReference()
     * @generated
     */
    EAttribute getServiceReference_EndPointRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ServiceReference#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceReference#getImplementation()
     * @see #getServiceReference()
     * @generated
     */
    EAttribute getServiceReference_Implementation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ServiceReference#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceReference#getName()
     * @see #getServiceReference()
     * @generated
     */
    EAttribute getServiceReference_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ServiceTask <em>Service Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Task</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceTask
     * @generated
     */
    EClass getServiceTask();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ServiceTask#getMessageRef <em>Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceTask#getMessageRef()
     * @see #getServiceTask()
     * @generated
     */
    EAttribute getServiceTask_MessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ServiceTask#getOperationRef <em>Operation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceTask#getOperationRef()
     * @see #getServiceTask()
     * @generated
     */
    EAttribute getServiceTask_OperationRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.ServiceTask#getServiceReferenceRef <em>Service Reference Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Reference Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceTask#getServiceReferenceRef()
     * @see #getServiceTask()
     * @generated
     */
    EAttribute getServiceTask_ServiceReferenceRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal</em>'.
     * @see org.eclipse.mdt.bpmn2.Signal
     * @generated
     */
    EClass getSignal();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Signal#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn2.Signal#getName()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.Signal#getStructureRef <em>Structure Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.Signal#getStructureRef()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_StructureRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.SignalEventDefinition <em>Signal Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.SignalEventDefinition
     * @generated
     */
    EClass getSignalEventDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Signal Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.SignalEventDefinition#getSignalRef()
     * @see #getSignalEventDefinition()
     * @generated
     */
    EAttribute getSignalEventDefinition_SignalRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Standard Loop Characteristics</em>'.
     * @see org.eclipse.mdt.bpmn2.StandardLoopCharacteristics
     * @generated
     */
    EClass getStandardLoopCharacteristics();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.StandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loop Condition</em>'.
     * @see org.eclipse.mdt.bpmn2.StandardLoopCharacteristics#getLoopCondition()
     * @see #getStandardLoopCharacteristics()
     * @generated
     */
    EReference getStandardLoopCharacteristics_LoopCondition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.StandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Loop Maximum</em>'.
     * @see org.eclipse.mdt.bpmn2.StandardLoopCharacteristics#getLoopMaximum()
     * @see #getStandardLoopCharacteristics()
     * @generated
     */
    EAttribute getStandardLoopCharacteristics_LoopMaximum();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.StandardLoopCharacteristics#isTestBefore <em>Test Before</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Test Before</em>'.
     * @see org.eclipse.mdt.bpmn2.StandardLoopCharacteristics#isTestBefore()
     * @see #getStandardLoopCharacteristics()
     * @generated
     */
    EAttribute getStandardLoopCharacteristics_TestBefore();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.StartEvent <em>Start Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Start Event</em>'.
     * @see org.eclipse.mdt.bpmn2.StartEvent
     * @generated
     */
    EClass getStartEvent();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.StartEvent#isIsInterrupting <em>Is Interrupting</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Interrupting</em>'.
     * @see org.eclipse.mdt.bpmn2.StartEvent#isIsInterrupting()
     * @see #getStartEvent()
     * @generated
     */
    EAttribute getStartEvent_IsInterrupting();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.StructureDefinition <em>Structure Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structure Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.StructureDefinition
     * @generated
     */
    EClass getStructureDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.StructureDefinition#isIsCollection <em>Is Collection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Collection</em>'.
     * @see org.eclipse.mdt.bpmn2.StructureDefinition#isIsCollection()
     * @see #getStructureDefinition()
     * @generated
     */
    EAttribute getStructureDefinition_IsCollection();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.StructureDefinition#getStructure <em>Structure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure</em>'.
     * @see org.eclipse.mdt.bpmn2.StructureDefinition#getStructure()
     * @see #getStructureDefinition()
     * @generated
     */
    EAttribute getStructureDefinition_Structure();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.SubProcess <em>Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Process</em>'.
     * @see org.eclipse.mdt.bpmn2.SubProcess
     * @generated
     */
    EClass getSubProcess();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.SubProcess#getFlowElementGroup <em>Flow Element Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
     * @see org.eclipse.mdt.bpmn2.SubProcess#getFlowElementGroup()
     * @see #getSubProcess()
     * @generated
     */
    EAttribute getSubProcess_FlowElementGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.SubProcess#getFlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Element</em>'.
     * @see org.eclipse.mdt.bpmn2.SubProcess#getFlowElement()
     * @see #getSubProcess()
     * @generated
     */
    EReference getSubProcess_FlowElement();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Triggered By Event</em>'.
     * @see org.eclipse.mdt.bpmn2.SubProcess#isTriggeredByEvent()
     * @see #getSubProcess()
     * @generated
     */
    EAttribute getSubProcess_TriggeredByEvent();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task</em>'.
     * @see org.eclipse.mdt.bpmn2.Task
     * @generated
     */
    EClass getTask();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Terminate Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.TerminateEventDefinition
     * @generated
     */
    EClass getTerminateEventDefinition();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Text <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text</em>'.
     * @see org.eclipse.mdt.bpmn2.Text
     * @generated
     */
    EClass getText();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Text#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn2.Text#getMixed()
     * @see #getText()
     * @generated
     */
    EAttribute getText_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.Text#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see org.eclipse.mdt.bpmn2.Text#getAny()
     * @see #getText()
     * @generated
     */
    EAttribute getText_Any();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.TextAnnotation <em>Text Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Annotation</em>'.
     * @see org.eclipse.mdt.bpmn2.TextAnnotation
     * @generated
     */
    EClass getTextAnnotation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.TextAnnotation#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text</em>'.
     * @see org.eclipse.mdt.bpmn2.TextAnnotation#getText()
     * @see #getTextAnnotation()
     * @generated
     */
    EReference getTextAnnotation_Text();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.ThrowEvent <em>Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Throw Event</em>'.
     * @see org.eclipse.mdt.bpmn2.ThrowEvent
     * @generated
     */
    EClass getThrowEvent();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.ThrowEvent#getInputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Set</em>'.
     * @see org.eclipse.mdt.bpmn2.ThrowEvent#getInputSet()
     * @see #getThrowEvent()
     * @generated
     */
    EReference getThrowEvent_InputSet();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.ThrowEvent#getDataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Input</em>'.
     * @see org.eclipse.mdt.bpmn2.ThrowEvent#getDataInput()
     * @see #getThrowEvent()
     * @generated
     */
    EReference getThrowEvent_DataInput();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.ThrowEvent#getDataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Input Association</em>'.
     * @see org.eclipse.mdt.bpmn2.ThrowEvent#getDataInputAssociation()
     * @see #getThrowEvent()
     * @generated
     */
    EReference getThrowEvent_DataInputAssociation();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.ThrowEvent#getEventDefinitionGroup <em>Event Definition Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Event Definition Group</em>'.
     * @see org.eclipse.mdt.bpmn2.ThrowEvent#getEventDefinitionGroup()
     * @see #getThrowEvent()
     * @generated
     */
    EAttribute getThrowEvent_EventDefinitionGroup();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.ThrowEvent#getEventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.ThrowEvent#getEventDefinition()
     * @see #getThrowEvent()
     * @generated
     */
    EReference getThrowEvent_EventDefinition();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn2.ThrowEvent#getEventDefinitionRef <em>Event Definition Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Event Definition Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.ThrowEvent#getEventDefinitionRef()
     * @see #getThrowEvent()
     * @generated
     */
    EAttribute getThrowEvent_EventDefinitionRef();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.TimerEventDefinition <em>Timer Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Timer Event Definition</em>'.
     * @see org.eclipse.mdt.bpmn2.TimerEventDefinition
     * @generated
     */
    EClass getTimerEventDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.TimerEventDefinition#getTimeDate <em>Time Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Time Date</em>'.
     * @see org.eclipse.mdt.bpmn2.TimerEventDefinition#getTimeDate()
     * @see #getTimerEventDefinition()
     * @generated
     */
    EReference getTimerEventDefinition_TimeDate();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn2.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Time Cycle</em>'.
     * @see org.eclipse.mdt.bpmn2.TimerEventDefinition#getTimeCycle()
     * @see #getTimerEventDefinition()
     * @generated
     */
    EReference getTimerEventDefinition_TimeCycle();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.Transaction <em>Transaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transaction</em>'.
     * @see org.eclipse.mdt.bpmn2.Transaction
     * @generated
     */
    EClass getTransaction();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn2.UserTask <em>User Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>User Task</em>'.
     * @see org.eclipse.mdt.bpmn2.UserTask
     * @generated
     */
    EClass getUserTask();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn2.UserTask#getRendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rendering</em>'.
     * @see org.eclipse.mdt.bpmn2.UserTask#getRendering()
     * @see #getUserTask()
     * @generated
     */
    EReference getUserTask_Rendering();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.UserTask#getImplementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Implementation</em>'.
     * @see org.eclipse.mdt.bpmn2.UserTask#getImplementation()
     * @see #getUserTask()
     * @generated
     */
    EAttribute getUserTask_Implementation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.UserTask#getInMessageRef <em>In Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.UserTask#getInMessageRef()
     * @see #getUserTask()
     * @generated
     */
    EAttribute getUserTask_InMessageRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn2.UserTask#getOutMessageRef <em>Out Message Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out Message Ref</em>'.
     * @see org.eclipse.mdt.bpmn2.UserTask#getOutMessageRef()
     * @see #getUserTask()
     * @generated
     */
    EAttribute getUserTask_OutMessageRef();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn2.AdHocOrdering <em>Ad Hoc Ordering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Ad Hoc Ordering</em>'.
     * @see org.eclipse.mdt.bpmn2.AdHocOrdering
     * @generated
     */
    EEnum getAdHocOrdering();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn2.AssociationDirection <em>Association Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Association Direction</em>'.
     * @see org.eclipse.mdt.bpmn2.AssociationDirection
     * @generated
     */
    EEnum getAssociationDirection();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn2.GatewayDirection <em>Gateway Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Gateway Direction</em>'.
     * @see org.eclipse.mdt.bpmn2.GatewayDirection
     * @generated
     */
    EEnum getGatewayDirection();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition <em>Multi Instance Flow Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Multi Instance Flow Condition</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition
     * @generated
     */
    EEnum getMultiInstanceFlowCondition();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn2.ProcessType <em>Process Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Process Type</em>'.
     * @see org.eclipse.mdt.bpmn2.ProcessType
     * @generated
     */
    EEnum getProcessType();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn2.RelationshipDirection <em>Relationship Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Relationship Direction</em>'.
     * @see org.eclipse.mdt.bpmn2.RelationshipDirection
     * @generated
     */
    EEnum getRelationshipDirection();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn2.ServiceImplementation <em>Service Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Service Implementation</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceImplementation
     * @generated
     */
    EEnum getServiceImplementation();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn2.TransactionMethod <em>Transaction Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Transaction Method</em>'.
     * @see org.eclipse.mdt.bpmn2.TransactionMethod
     * @generated
     */
    EEnum getTransactionMethod();

    /**
     * Returns the meta object for enum '{@link org.eclipse.mdt.bpmn2.UserTaskImplementation <em>User Task Implementation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>User Task Implementation</em>'.
     * @see org.eclipse.mdt.bpmn2.UserTaskImplementation
     * @generated
     */
    EEnum getUserTaskImplementation();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn2.AdHocOrdering <em>Ad Hoc Ordering Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Ad Hoc Ordering Object</em>'.
     * @see org.eclipse.mdt.bpmn2.AdHocOrdering
     * @model instanceClass="org.eclipse.mdt.bpmn2.AdHocOrdering"
     *        extendedMetaData="name='tAdHocOrdering:Object' baseType='tAdHocOrdering'"
     * @generated
     */
    EDataType getAdHocOrderingObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn2.AssociationDirection <em>Association Direction Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Association Direction Object</em>'.
     * @see org.eclipse.mdt.bpmn2.AssociationDirection
     * @model instanceClass="org.eclipse.mdt.bpmn2.AssociationDirection"
     *        extendedMetaData="name='tAssociationDirection:Object' baseType='tAssociationDirection'"
     * @generated
     */
    EDataType getAssociationDirectionObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn2.GatewayDirection <em>Gateway Direction Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Gateway Direction Object</em>'.
     * @see org.eclipse.mdt.bpmn2.GatewayDirection
     * @model instanceClass="org.eclipse.mdt.bpmn2.GatewayDirection"
     *        extendedMetaData="name='tGatewayDirection:Object' baseType='tGatewayDirection'"
     * @generated
     */
    EDataType getGatewayDirectionObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition <em>Multi Instance Flow Condition Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Multi Instance Flow Condition Object</em>'.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition
     * @model instanceClass="org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition"
     *        extendedMetaData="name='tMultiInstanceFlowCondition:Object' baseType='tMultiInstanceFlowCondition'"
     * @generated
     */
    EDataType getMultiInstanceFlowConditionObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn2.ProcessType <em>Process Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Process Type Object</em>'.
     * @see org.eclipse.mdt.bpmn2.ProcessType
     * @model instanceClass="org.eclipse.mdt.bpmn2.ProcessType"
     *        extendedMetaData="name='tProcessType:Object' baseType='tProcessType'"
     * @generated
     */
    EDataType getProcessTypeObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn2.RelationshipDirection <em>Relationship Direction Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Relationship Direction Object</em>'.
     * @see org.eclipse.mdt.bpmn2.RelationshipDirection
     * @model instanceClass="org.eclipse.mdt.bpmn2.RelationshipDirection"
     *        extendedMetaData="name='tRelationshipDirection:Object' baseType='tRelationshipDirection'"
     * @generated
     */
    EDataType getRelationshipDirectionObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn2.ServiceImplementation <em>Service Implementation Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Service Implementation Object</em>'.
     * @see org.eclipse.mdt.bpmn2.ServiceImplementation
     * @model instanceClass="org.eclipse.mdt.bpmn2.ServiceImplementation"
     *        extendedMetaData="name='tServiceImplementation:Object' baseType='tServiceImplementation'"
     * @generated
     */
    EDataType getServiceImplementationObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn2.TransactionMethod <em>Transaction Method Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Transaction Method Object</em>'.
     * @see org.eclipse.mdt.bpmn2.TransactionMethod
     * @model instanceClass="org.eclipse.mdt.bpmn2.TransactionMethod"
     *        extendedMetaData="name='tTransactionMethod:Object' baseType='tTransactionMethod'"
     * @generated
     */
    EDataType getTransactionMethodObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.mdt.bpmn2.UserTaskImplementation <em>User Task Implementation Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>User Task Implementation Object</em>'.
     * @see org.eclipse.mdt.bpmn2.UserTaskImplementation
     * @model instanceClass="org.eclipse.mdt.bpmn2.UserTaskImplementation"
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
    Bpmn2Factory getBpmn2Factory();

} //Bpmn2Package
