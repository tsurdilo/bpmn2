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
 * $Id$
 */
package org.eclipse.mdt.bpmn;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getActivityResource <em>Activity Resource</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getBaseElement <em>Base Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getBoundaryEvent <em>Boundary Event</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getBusinessRuleTask <em>Business Rule Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallableElement <em>Callable Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallActivity <em>Call Activity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallChoreographyActivity <em>Call Choreography Activity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallConversation <em>Call Conversation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCancelEventDefinition <em>Cancel Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCatchEvent <em>Catch Event</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCategoryValue <em>Category Value</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreographyActivity <em>Choreography Activity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreographySubProcess <em>Choreography Sub Process</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreographyTask <em>Choreography Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCompensateEventDefinition <em>Compensate Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getComplexGateway <em>Complex Gateway</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getConditionalEventDefinition <em>Conditional Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getConversation <em>Conversation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationKey <em>Correlation Key</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationProperty <em>Correlation Property</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationSubscription <em>Correlation Subscription</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataAssociation <em>Data Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataStore <em>Data Store</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataStoreReference <em>Data Store Reference</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getEndEvent <em>End Event</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getErrorEventDefinition <em>Error Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getEscalation <em>Escalation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getEscalationEventDefinition <em>Escalation Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getEventBasedGateway <em>Event Based Gateway</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getExclusiveGateway <em>Exclusive Gateway</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getFormalExpression <em>Formal Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalChoreographyTask <em>Global Choreography Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalCommunication <em>Global Communication</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalManualTask <em>Global Manual Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalScriptTask <em>Global Script Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalTask <em>Global Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalUserTask <em>Global User Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getHumanPerformer <em>Human Performer</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getImplicitThrowEvent <em>Implicit Throw Event</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getInclusiveGateway <em>Inclusive Gateway</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getLane <em>Lane</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getLaneSet <em>Lane Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getLinkEventDefinition <em>Link Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getManualTask <em>Manual Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessageEventDefinition <em>Message Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getParallelGateway <em>Parallel Gateway</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getPartnerEntity <em>Partner Entity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getPartnerRole <em>Partner Role</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getPotentialOwner <em>Potential Owner</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getReceiveTask <em>Receive Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getResourceParameter <em>Resource Parameter</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getResourceParameterBinding <em>Resource Parameter Binding</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getScriptTask <em>Script Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getSendTask <em>Send Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getServiceTask <em>Service Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getSignalEventDefinition <em>Signal Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getSubConversation <em>Sub Conversation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getSubProcess <em>Sub Process</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getTask <em>Task</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getTerminateEventDefinition <em>Terminate Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getTextAnnotation <em>Text Annotation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getThrowEvent <em>Throw Event</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getTimerEventDefinition <em>Timer Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DocumentRoot#getUserTask <em>User Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap<String, String> getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity</em>' containment reference.
     * @see #setActivity(Activity)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Activity()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
     * @generated
     */
    Activity getActivity();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getActivity <em>Activity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity</em>' containment reference.
     * @see #getActivity()
     * @generated
     */
    void setActivity(Activity value);

    /**
     * Returns the value of the '<em><b>Activity Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Resource</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Resource</em>' containment reference.
     * @see #setActivityResource(ActivityResource)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ActivityResource()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='activityResource' namespace='##targetNamespace'"
     * @generated
     */
    ActivityResource getActivityResource();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getActivityResource <em>Activity Resource</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity Resource</em>' containment reference.
     * @see #getActivityResource()
     * @generated
     */
    void setActivityResource(ActivityResource value);

    /**
     * Returns the value of the '<em><b>Ad Hoc Sub Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ad Hoc Sub Process</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ad Hoc Sub Process</em>' containment reference.
     * @see #setAdHocSubProcess(AdHocSubProcess)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_AdHocSubProcess()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='adHocSubProcess' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    AdHocSubProcess getAdHocSubProcess();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ad Hoc Sub Process</em>' containment reference.
     * @see #getAdHocSubProcess()
     * @generated
     */
    void setAdHocSubProcess(AdHocSubProcess value);

    /**
     * Returns the value of the '<em><b>Flow Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element</em>' containment reference.
     * @see #setFlowElement(FlowElement)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_FlowElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flowElement' namespace='##targetNamespace'"
     * @generated
     */
    FlowElement getFlowElement();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getFlowElement <em>Flow Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flow Element</em>' containment reference.
     * @see #getFlowElement()
     * @generated
     */
    void setFlowElement(FlowElement value);

    /**
     * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact</em>' containment reference.
     * @see #setArtifact(Artifact)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Artifact()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace'"
     * @generated
     */
    Artifact getArtifact();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getArtifact <em>Artifact</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Artifact</em>' containment reference.
     * @see #getArtifact()
     * @generated
     */
    void setArtifact(Artifact value);

    /**
     * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' containment reference.
     * @see #setAssignment(Assignment)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Assignment()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='assignment' namespace='##targetNamespace'"
     * @generated
     */
    Assignment getAssignment();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getAssignment <em>Assignment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Assignment</em>' containment reference.
     * @see #getAssignment()
     * @generated
     */
    void setAssignment(Assignment value);

    /**
     * Returns the value of the '<em><b>Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Association</em>' containment reference.
     * @see #setAssociation(Association)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Association()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='association' namespace='##targetNamespace' affiliation='artifact'"
     * @generated
     */
    Association getAssociation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getAssociation <em>Association</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Association</em>' containment reference.
     * @see #getAssociation()
     * @generated
     */
    void setAssociation(Association value);

    /**
     * Returns the value of the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auditing</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auditing</em>' containment reference.
     * @see #setAuditing(Auditing)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Auditing()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='auditing' namespace='##targetNamespace'"
     * @generated
     */
    Auditing getAuditing();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getAuditing <em>Auditing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auditing</em>' containment reference.
     * @see #getAuditing()
     * @generated
     */
    void setAuditing(Auditing value);

    /**
     * Returns the value of the '<em><b>Base Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Element</em>' containment reference.
     * @see #setBaseElement(BaseElement)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_BaseElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='baseElement' namespace='##targetNamespace'"
     * @generated
     */
    BaseElement getBaseElement();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getBaseElement <em>Base Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Element</em>' containment reference.
     * @see #getBaseElement()
     * @generated
     */
    void setBaseElement(BaseElement value);

    /**
     * Returns the value of the '<em><b>Base Element With Mixed Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Element With Mixed Content</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Element With Mixed Content</em>' containment reference.
     * @see #setBaseElementWithMixedContent(BaseElementWithMixedContent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_BaseElementWithMixedContent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='baseElementWithMixedContent' namespace='##targetNamespace'"
     * @generated
     */
    BaseElementWithMixedContent getBaseElementWithMixedContent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Element With Mixed Content</em>' containment reference.
     * @see #getBaseElementWithMixedContent()
     * @generated
     */
    void setBaseElementWithMixedContent(BaseElementWithMixedContent value);

    /**
     * Returns the value of the '<em><b>Boundary Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Boundary Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Boundary Event</em>' containment reference.
     * @see #setBoundaryEvent(BoundaryEvent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_BoundaryEvent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='boundaryEvent' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    BoundaryEvent getBoundaryEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getBoundaryEvent <em>Boundary Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Boundary Event</em>' containment reference.
     * @see #getBoundaryEvent()
     * @generated
     */
    void setBoundaryEvent(BoundaryEvent value);

    /**
     * Returns the value of the '<em><b>Business Rule Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Rule Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Rule Task</em>' containment reference.
     * @see #setBusinessRuleTask(BusinessRuleTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_BusinessRuleTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='businessRuleTask' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    BusinessRuleTask getBusinessRuleTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getBusinessRuleTask <em>Business Rule Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Business Rule Task</em>' containment reference.
     * @see #getBusinessRuleTask()
     * @generated
     */
    void setBusinessRuleTask(BusinessRuleTask value);

    /**
     * Returns the value of the '<em><b>Callable Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Callable Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Callable Element</em>' containment reference.
     * @see #setCallableElement(CallableElement)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CallableElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='callableElement' namespace='##targetNamespace'"
     * @generated
     */
    CallableElement getCallableElement();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallableElement <em>Callable Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Callable Element</em>' containment reference.
     * @see #getCallableElement()
     * @generated
     */
    void setCallableElement(CallableElement value);

    /**
     * Returns the value of the '<em><b>Call Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Call Activity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Call Activity</em>' containment reference.
     * @see #setCallActivity(CallActivity)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CallActivity()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='callActivity' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    CallActivity getCallActivity();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallActivity <em>Call Activity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Call Activity</em>' containment reference.
     * @see #getCallActivity()
     * @generated
     */
    void setCallActivity(CallActivity value);

    /**
     * Returns the value of the '<em><b>Call Choreography Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Call Choreography Activity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Call Choreography Activity</em>' containment reference.
     * @see #setCallChoreographyActivity(CallChoreographyActivity)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CallChoreographyActivity()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='callChoreographyActivity' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    CallChoreographyActivity getCallChoreographyActivity();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallChoreographyActivity <em>Call Choreography Activity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Call Choreography Activity</em>' containment reference.
     * @see #getCallChoreographyActivity()
     * @generated
     */
    void setCallChoreographyActivity(CallChoreographyActivity value);

    /**
     * Returns the value of the '<em><b>Call Conversation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Call Conversation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Call Conversation</em>' containment reference.
     * @see #setCallConversation(CallConversation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CallConversation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='callConversation' namespace='##targetNamespace' affiliation='conversationNode'"
     * @generated
     */
    CallConversation getCallConversation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCallConversation <em>Call Conversation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Call Conversation</em>' containment reference.
     * @see #getCallConversation()
     * @generated
     */
    void setCallConversation(CallConversation value);

    /**
     * Returns the value of the '<em><b>Conversation Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Node</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Node</em>' containment reference.
     * @see #setConversationNode(ConversationNode)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ConversationNode()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='conversationNode' namespace='##targetNamespace'"
     * @generated
     */
    ConversationNode getConversationNode();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getConversationNode <em>Conversation Node</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conversation Node</em>' containment reference.
     * @see #getConversationNode()
     * @generated
     */
    void setConversationNode(ConversationNode value);

    /**
     * Returns the value of the '<em><b>Cancel Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cancel Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cancel Event Definition</em>' containment reference.
     * @see #setCancelEventDefinition(CancelEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CancelEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='cancelEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    CancelEventDefinition getCancelEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCancelEventDefinition <em>Cancel Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancel Event Definition</em>' containment reference.
     * @see #getCancelEventDefinition()
     * @generated
     */
    void setCancelEventDefinition(CancelEventDefinition value);

    /**
     * Returns the value of the '<em><b>Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Definition</em>' containment reference.
     * @see #setEventDefinition(EventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_EventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventDefinition' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    EventDefinition getEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEventDefinition <em>Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Definition</em>' containment reference.
     * @see #getEventDefinition()
     * @generated
     */
    void setEventDefinition(EventDefinition value);

    /**
     * Returns the value of the '<em><b>Root Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Element</em>' containment reference.
     * @see #setRootElement(RootElement)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_RootElement()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='rootElement' namespace='##targetNamespace'"
     * @generated
     */
    RootElement getRootElement();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getRootElement <em>Root Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Element</em>' containment reference.
     * @see #getRootElement()
     * @generated
     */
    void setRootElement(RootElement value);

    /**
     * Returns the value of the '<em><b>Catch Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Catch Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Catch Event</em>' containment reference.
     * @see #setCatchEvent(CatchEvent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CatchEvent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='catchEvent' namespace='##targetNamespace'"
     * @generated
     */
    CatchEvent getCatchEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCatchEvent <em>Catch Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Catch Event</em>' containment reference.
     * @see #getCatchEvent()
     * @generated
     */
    void setCatchEvent(CatchEvent value);

    /**
     * Returns the value of the '<em><b>Category</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category</em>' containment reference.
     * @see #setCategory(Category)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Category()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    Category getCategory();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCategory <em>Category</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Category</em>' containment reference.
     * @see #getCategory()
     * @generated
     */
    void setCategory(Category value);

    /**
     * Returns the value of the '<em><b>Category Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Value</em>' containment reference.
     * @see #setCategoryValue(CategoryValue)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CategoryValue()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='categoryValue' namespace='##targetNamespace'"
     * @generated
     */
    CategoryValue getCategoryValue();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCategoryValue <em>Category Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Category Value</em>' containment reference.
     * @see #getCategoryValue()
     * @generated
     */
    void setCategoryValue(CategoryValue value);

    /**
     * Returns the value of the '<em><b>Choreography</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Choreography</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Choreography</em>' containment reference.
     * @see #setChoreography(Choreography)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Choreography()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choreography' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    Choreography getChoreography();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreography <em>Choreography</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choreography</em>' containment reference.
     * @see #getChoreography()
     * @generated
     */
    void setChoreography(Choreography value);

    /**
     * Returns the value of the '<em><b>Choreography Activity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Choreography Activity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Choreography Activity</em>' containment reference.
     * @see #setChoreographyActivity(ChoreographyActivity)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ChoreographyActivity()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choreographyActivity' namespace='##targetNamespace'"
     * @generated
     */
    ChoreographyActivity getChoreographyActivity();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreographyActivity <em>Choreography Activity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choreography Activity</em>' containment reference.
     * @see #getChoreographyActivity()
     * @generated
     */
    void setChoreographyActivity(ChoreographyActivity value);

    /**
     * Returns the value of the '<em><b>Choreography Sub Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Choreography Sub Process</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Choreography Sub Process</em>' containment reference.
     * @see #setChoreographySubProcess(ChoreographySubProcess)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ChoreographySubProcess()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choreographySubProcess' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ChoreographySubProcess getChoreographySubProcess();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreographySubProcess <em>Choreography Sub Process</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choreography Sub Process</em>' containment reference.
     * @see #getChoreographySubProcess()
     * @generated
     */
    void setChoreographySubProcess(ChoreographySubProcess value);

    /**
     * Returns the value of the '<em><b>Choreography Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Choreography Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Choreography Task</em>' containment reference.
     * @see #setChoreographyTask(ChoreographyTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ChoreographyTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choreographyTask' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ChoreographyTask getChoreographyTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getChoreographyTask <em>Choreography Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choreography Task</em>' containment reference.
     * @see #getChoreographyTask()
     * @generated
     */
    void setChoreographyTask(ChoreographyTask value);

    /**
     * Returns the value of the '<em><b>Collaboration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collaboration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collaboration</em>' containment reference.
     * @see #setCollaboration(Collaboration)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Collaboration()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='collaboration' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    Collaboration getCollaboration();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCollaboration <em>Collaboration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collaboration</em>' containment reference.
     * @see #getCollaboration()
     * @generated
     */
    void setCollaboration(Collaboration value);

    /**
     * Returns the value of the '<em><b>Communication</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Communication</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Communication</em>' containment reference.
     * @see #setCommunication(Communication)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Communication()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='communication' namespace='##targetNamespace' affiliation='conversationNode'"
     * @generated
     */
    Communication getCommunication();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCommunication <em>Communication</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Communication</em>' containment reference.
     * @see #getCommunication()
     * @generated
     */
    void setCommunication(Communication value);

    /**
     * Returns the value of the '<em><b>Compensate Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Compensate Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Compensate Event Definition</em>' containment reference.
     * @see #setCompensateEventDefinition(CompensateEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CompensateEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='compensateEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    CompensateEventDefinition getCompensateEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCompensateEventDefinition <em>Compensate Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Compensate Event Definition</em>' containment reference.
     * @see #getCompensateEventDefinition()
     * @generated
     */
    void setCompensateEventDefinition(CompensateEventDefinition value);

    /**
     * Returns the value of the '<em><b>Complex Behavior Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Complex Behavior Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Complex Behavior Definition</em>' containment reference.
     * @see #setComplexBehaviorDefinition(ComplexBehaviorDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ComplexBehaviorDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='complexBehaviorDefinition' namespace='##targetNamespace'"
     * @generated
     */
    ComplexBehaviorDefinition getComplexBehaviorDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Complex Behavior Definition</em>' containment reference.
     * @see #getComplexBehaviorDefinition()
     * @generated
     */
    void setComplexBehaviorDefinition(ComplexBehaviorDefinition value);

    /**
     * Returns the value of the '<em><b>Complex Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Complex Gateway</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Complex Gateway</em>' containment reference.
     * @see #setComplexGateway(ComplexGateway)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ComplexGateway()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='complexGateway' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ComplexGateway getComplexGateway();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getComplexGateway <em>Complex Gateway</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Complex Gateway</em>' containment reference.
     * @see #getComplexGateway()
     * @generated
     */
    void setComplexGateway(ComplexGateway value);

    /**
     * Returns the value of the '<em><b>Conditional Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conditional Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conditional Event Definition</em>' containment reference.
     * @see #setConditionalEventDefinition(ConditionalEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ConditionalEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='conditionalEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    ConditionalEventDefinition getConditionalEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getConditionalEventDefinition <em>Conditional Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conditional Event Definition</em>' containment reference.
     * @see #getConditionalEventDefinition()
     * @generated
     */
    void setConditionalEventDefinition(ConditionalEventDefinition value);

    /**
     * Returns the value of the '<em><b>Conversation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation</em>' containment reference.
     * @see #setConversation(Conversation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Conversation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='conversation' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    Conversation getConversation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getConversation <em>Conversation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conversation</em>' containment reference.
     * @see #getConversation()
     * @generated
     */
    void setConversation(Conversation value);

    /**
     * Returns the value of the '<em><b>Conversation Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Association</em>' containment reference.
     * @see #setConversationAssociation(ConversationAssociation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ConversationAssociation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='conversationAssociation' namespace='##targetNamespace'"
     * @generated
     */
    ConversationAssociation getConversationAssociation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getConversationAssociation <em>Conversation Association</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conversation Association</em>' containment reference.
     * @see #getConversationAssociation()
     * @generated
     */
    void setConversationAssociation(ConversationAssociation value);

    /**
     * Returns the value of the '<em><b>Correlation Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Key</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Key</em>' containment reference.
     * @see #setCorrelationKey(CorrelationKey)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CorrelationKey()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='correlationKey' namespace='##targetNamespace'"
     * @generated
     */
    CorrelationKey getCorrelationKey();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationKey <em>Correlation Key</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Key</em>' containment reference.
     * @see #getCorrelationKey()
     * @generated
     */
    void setCorrelationKey(CorrelationKey value);

    /**
     * Returns the value of the '<em><b>Correlation Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Property</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Property</em>' containment reference.
     * @see #setCorrelationProperty(CorrelationProperty)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CorrelationProperty()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='correlationProperty' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    CorrelationProperty getCorrelationProperty();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationProperty <em>Correlation Property</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Property</em>' containment reference.
     * @see #getCorrelationProperty()
     * @generated
     */
    void setCorrelationProperty(CorrelationProperty value);

    /**
     * Returns the value of the '<em><b>Correlation Property Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Property Binding</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Property Binding</em>' containment reference.
     * @see #setCorrelationPropertyBinding(CorrelationPropertyBinding)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CorrelationPropertyBinding()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='correlationPropertyBinding' namespace='##targetNamespace'"
     * @generated
     */
    CorrelationPropertyBinding getCorrelationPropertyBinding();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Property Binding</em>' containment reference.
     * @see #getCorrelationPropertyBinding()
     * @generated
     */
    void setCorrelationPropertyBinding(CorrelationPropertyBinding value);

    /**
     * Returns the value of the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Property Retrieval Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Property Retrieval Expression</em>' containment reference.
     * @see #setCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CorrelationPropertyRetrievalExpression()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='correlationPropertyRetrievalExpression' namespace='##targetNamespace'"
     * @generated
     */
    CorrelationPropertyRetrievalExpression getCorrelationPropertyRetrievalExpression();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Property Retrieval Expression</em>' containment reference.
     * @see #getCorrelationPropertyRetrievalExpression()
     * @generated
     */
    void setCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression value);

    /**
     * Returns the value of the '<em><b>Correlation Subscription</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Subscription</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Subscription</em>' containment reference.
     * @see #setCorrelationSubscription(CorrelationSubscription)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_CorrelationSubscription()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='correlationSubscription' namespace='##targetNamespace'"
     * @generated
     */
    CorrelationSubscription getCorrelationSubscription();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getCorrelationSubscription <em>Correlation Subscription</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Subscription</em>' containment reference.
     * @see #getCorrelationSubscription()
     * @generated
     */
    void setCorrelationSubscription(CorrelationSubscription value);

    /**
     * Returns the value of the '<em><b>Data Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Association</em>' containment reference.
     * @see #setDataAssociation(DataAssociation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_DataAssociation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataAssociation' namespace='##targetNamespace'"
     * @generated
     */
    DataAssociation getDataAssociation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataAssociation <em>Data Association</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Association</em>' containment reference.
     * @see #getDataAssociation()
     * @generated
     */
    void setDataAssociation(DataAssociation value);

    /**
     * Returns the value of the '<em><b>Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Input</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Input</em>' containment reference.
     * @see #setDataInput(DataInput)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_DataInput()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataInput' namespace='##targetNamespace'"
     * @generated
     */
    DataInput getDataInput();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataInput <em>Data Input</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Input</em>' containment reference.
     * @see #getDataInput()
     * @generated
     */
    void setDataInput(DataInput value);

    /**
     * Returns the value of the '<em><b>Data Input Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Input Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Input Association</em>' containment reference.
     * @see #setDataInputAssociation(DataInputAssociation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_DataInputAssociation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataInputAssociation' namespace='##targetNamespace'"
     * @generated
     */
    DataInputAssociation getDataInputAssociation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataInputAssociation <em>Data Input Association</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Input Association</em>' containment reference.
     * @see #getDataInputAssociation()
     * @generated
     */
    void setDataInputAssociation(DataInputAssociation value);

    /**
     * Returns the value of the '<em><b>Data Object</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Object</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Object</em>' containment reference.
     * @see #setDataObject(DataObject)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_DataObject()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataObject' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    DataObject getDataObject();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataObject <em>Data Object</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Object</em>' containment reference.
     * @see #getDataObject()
     * @generated
     */
    void setDataObject(DataObject value);

    /**
     * Returns the value of the '<em><b>Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output</em>' containment reference.
     * @see #setDataOutput(DataOutput)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_DataOutput()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataOutput' namespace='##targetNamespace'"
     * @generated
     */
    DataOutput getDataOutput();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataOutput <em>Data Output</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Output</em>' containment reference.
     * @see #getDataOutput()
     * @generated
     */
    void setDataOutput(DataOutput value);

    /**
     * Returns the value of the '<em><b>Data Output Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output Association</em>' containment reference.
     * @see #setDataOutputAssociation(DataOutputAssociation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_DataOutputAssociation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataOutputAssociation' namespace='##targetNamespace'"
     * @generated
     */
    DataOutputAssociation getDataOutputAssociation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataOutputAssociation <em>Data Output Association</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Output Association</em>' containment reference.
     * @see #getDataOutputAssociation()
     * @generated
     */
    void setDataOutputAssociation(DataOutputAssociation value);

    /**
     * Returns the value of the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data State</em>' containment reference.
     * @see #setDataState(DataState)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_DataState()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataState' namespace='##targetNamespace'"
     * @generated
     */
    DataState getDataState();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataState <em>Data State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data State</em>' containment reference.
     * @see #getDataState()
     * @generated
     */
    void setDataState(DataState value);

    /**
     * Returns the value of the '<em><b>Data Store</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Store</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Store</em>' containment reference.
     * @see #setDataStore(DataStore)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_DataStore()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataStore' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    DataStore getDataStore();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataStore <em>Data Store</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Store</em>' containment reference.
     * @see #getDataStore()
     * @generated
     */
    void setDataStore(DataStore value);

    /**
     * Returns the value of the '<em><b>Data Store Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Store Reference</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Store Reference</em>' containment reference.
     * @see #setDataStoreReference(DataStoreReference)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_DataStoreReference()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dataStoreReference' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    DataStoreReference getDataStoreReference();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDataStoreReference <em>Data Store Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Store Reference</em>' containment reference.
     * @see #getDataStoreReference()
     * @generated
     */
    void setDataStoreReference(DataStoreReference value);

    /**
     * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definitions</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Definitions</em>' containment reference.
     * @see #setDefinitions(Definitions)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Definitions()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='definitions' namespace='##targetNamespace'"
     * @generated
     */
    Definitions getDefinitions();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDefinitions <em>Definitions</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definitions</em>' containment reference.
     * @see #getDefinitions()
     * @generated
     */
    void setDefinitions(Definitions value);

    /**
     * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' containment reference.
     * @see #setDocumentation(Documentation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Documentation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
     * @generated
     */
    Documentation getDocumentation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(Documentation value);

    /**
     * Returns the value of the '<em><b>End Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Event</em>' containment reference.
     * @see #setEndEvent(EndEvent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_EndEvent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='endEvent' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    EndEvent getEndEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEndEvent <em>End Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Event</em>' containment reference.
     * @see #getEndEvent()
     * @generated
     */
    void setEndEvent(EndEvent value);

    /**
     * Returns the value of the '<em><b>End Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Point</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Point</em>' containment reference.
     * @see #setEndPoint(EndPoint)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_EndPoint()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='endPoint' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    EndPoint getEndPoint();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEndPoint <em>End Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Point</em>' containment reference.
     * @see #getEndPoint()
     * @generated
     */
    void setEndPoint(EndPoint value);

    /**
     * Returns the value of the '<em><b>Error</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error</em>' containment reference.
     * @see #setError(org.eclipse.mdt.bpmn.Error)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Error()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    org.eclipse.mdt.bpmn.Error getError();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getError <em>Error</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error</em>' containment reference.
     * @see #getError()
     * @generated
     */
    void setError(org.eclipse.mdt.bpmn.Error value);

    /**
     * Returns the value of the '<em><b>Error Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Event Definition</em>' containment reference.
     * @see #setErrorEventDefinition(ErrorEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ErrorEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='errorEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    ErrorEventDefinition getErrorEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getErrorEventDefinition <em>Error Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Event Definition</em>' containment reference.
     * @see #getErrorEventDefinition()
     * @generated
     */
    void setErrorEventDefinition(ErrorEventDefinition value);

    /**
     * Returns the value of the '<em><b>Escalation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Escalation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Escalation</em>' containment reference.
     * @see #setEscalation(Escalation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Escalation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='escalation' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    Escalation getEscalation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEscalation <em>Escalation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Escalation</em>' containment reference.
     * @see #getEscalation()
     * @generated
     */
    void setEscalation(Escalation value);

    /**
     * Returns the value of the '<em><b>Escalation Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Escalation Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Escalation Event Definition</em>' containment reference.
     * @see #setEscalationEventDefinition(EscalationEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_EscalationEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='escalationEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    EscalationEventDefinition getEscalationEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEscalationEventDefinition <em>Escalation Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Escalation Event Definition</em>' containment reference.
     * @see #getEscalationEventDefinition()
     * @generated
     */
    void setEscalationEventDefinition(EscalationEventDefinition value);

    /**
     * Returns the value of the '<em><b>Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event</em>' containment reference.
     * @see #setEvent(Event)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Event()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    Event getEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEvent <em>Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event</em>' containment reference.
     * @see #getEvent()
     * @generated
     */
    void setEvent(Event value);

    /**
     * Returns the value of the '<em><b>Event Based Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Based Gateway</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Based Gateway</em>' containment reference.
     * @see #setEventBasedGateway(EventBasedGateway)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_EventBasedGateway()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventBasedGateway' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    EventBasedGateway getEventBasedGateway();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getEventBasedGateway <em>Event Based Gateway</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Based Gateway</em>' containment reference.
     * @see #getEventBasedGateway()
     * @generated
     */
    void setEventBasedGateway(EventBasedGateway value);

    /**
     * Returns the value of the '<em><b>Exclusive Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exclusive Gateway</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exclusive Gateway</em>' containment reference.
     * @see #setExclusiveGateway(ExclusiveGateway)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ExclusiveGateway()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='exclusiveGateway' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ExclusiveGateway getExclusiveGateway();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getExclusiveGateway <em>Exclusive Gateway</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exclusive Gateway</em>' containment reference.
     * @see #getExclusiveGateway()
     * @generated
     */
    void setExclusiveGateway(ExclusiveGateway value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(Expression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Expression()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

    /**
     * Returns the value of the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension</em>' containment reference.
     * @see #setExtension(Extension)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Extension()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
     * @generated
     */
    Extension getExtension();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getExtension <em>Extension</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extension</em>' containment reference.
     * @see #getExtension()
     * @generated
     */
    void setExtension(Extension value);

    /**
     * Returns the value of the '<em><b>Flow Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Node</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Node</em>' containment reference.
     * @see #setFlowNode(FlowNode)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_FlowNode()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flowNode' namespace='##targetNamespace'"
     * @generated
     */
    FlowNode getFlowNode();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getFlowNode <em>Flow Node</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flow Node</em>' containment reference.
     * @see #getFlowNode()
     * @generated
     */
    void setFlowNode(FlowNode value);

    /**
     * Returns the value of the '<em><b>Formal Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formal Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Formal Expression</em>' containment reference.
     * @see #setFormalExpression(FormalExpression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_FormalExpression()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='formalExpression' namespace='##targetNamespace' affiliation='expression'"
     * @generated
     */
    FormalExpression getFormalExpression();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getFormalExpression <em>Formal Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Formal Expression</em>' containment reference.
     * @see #getFormalExpression()
     * @generated
     */
    void setFormalExpression(FormalExpression value);

    /**
     * Returns the value of the '<em><b>Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gateway</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gateway</em>' containment reference.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Gateway()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='gateway' namespace='##targetNamespace'"
     * @generated
     */
    Gateway getGateway();

    /**
     * Returns the value of the '<em><b>Global Business Rule Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Business Rule Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Business Rule Task</em>' containment reference.
     * @see #setGlobalBusinessRuleTask(GlobalBusinessRuleTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_GlobalBusinessRuleTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='globalBusinessRuleTask' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    GlobalBusinessRuleTask getGlobalBusinessRuleTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global Business Rule Task</em>' containment reference.
     * @see #getGlobalBusinessRuleTask()
     * @generated
     */
    void setGlobalBusinessRuleTask(GlobalBusinessRuleTask value);

    /**
     * Returns the value of the '<em><b>Global Choreography Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Choreography Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Choreography Task</em>' containment reference.
     * @see #setGlobalChoreographyTask(GlobalChoreographyTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_GlobalChoreographyTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='globalChoreographyTask' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    GlobalChoreographyTask getGlobalChoreographyTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalChoreographyTask <em>Global Choreography Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global Choreography Task</em>' containment reference.
     * @see #getGlobalChoreographyTask()
     * @generated
     */
    void setGlobalChoreographyTask(GlobalChoreographyTask value);

    /**
     * Returns the value of the '<em><b>Global Communication</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Communication</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Communication</em>' containment reference.
     * @see #setGlobalCommunication(GlobalCommunication)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_GlobalCommunication()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='globalCommunication' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    GlobalCommunication getGlobalCommunication();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalCommunication <em>Global Communication</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global Communication</em>' containment reference.
     * @see #getGlobalCommunication()
     * @generated
     */
    void setGlobalCommunication(GlobalCommunication value);

    /**
     * Returns the value of the '<em><b>Global Manual Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Manual Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Manual Task</em>' containment reference.
     * @see #setGlobalManualTask(GlobalManualTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_GlobalManualTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='globalManualTask' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    GlobalManualTask getGlobalManualTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalManualTask <em>Global Manual Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global Manual Task</em>' containment reference.
     * @see #getGlobalManualTask()
     * @generated
     */
    void setGlobalManualTask(GlobalManualTask value);

    /**
     * Returns the value of the '<em><b>Global Script Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Script Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Script Task</em>' containment reference.
     * @see #setGlobalScriptTask(GlobalScriptTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_GlobalScriptTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='globalScriptTask' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    GlobalScriptTask getGlobalScriptTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalScriptTask <em>Global Script Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global Script Task</em>' containment reference.
     * @see #getGlobalScriptTask()
     * @generated
     */
    void setGlobalScriptTask(GlobalScriptTask value);

    /**
     * Returns the value of the '<em><b>Global Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Task</em>' containment reference.
     * @see #setGlobalTask(GlobalTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_GlobalTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='globalTask' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    GlobalTask getGlobalTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalTask <em>Global Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global Task</em>' containment reference.
     * @see #getGlobalTask()
     * @generated
     */
    void setGlobalTask(GlobalTask value);

    /**
     * Returns the value of the '<em><b>Global User Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global User Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global User Task</em>' containment reference.
     * @see #setGlobalUserTask(GlobalUserTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_GlobalUserTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='globalUserTask' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    GlobalUserTask getGlobalUserTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGlobalUserTask <em>Global User Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global User Task</em>' containment reference.
     * @see #getGlobalUserTask()
     * @generated
     */
    void setGlobalUserTask(GlobalUserTask value);

    /**
     * Returns the value of the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' containment reference.
     * @see #setGroup(Group)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Group()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace' affiliation='artifact'"
     * @generated
     */
    Group getGroup();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getGroup <em>Group</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' containment reference.
     * @see #getGroup()
     * @generated
     */
    void setGroup(Group value);

    /**
     * Returns the value of the '<em><b>Human Performer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Human Performer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Human Performer</em>' containment reference.
     * @see #setHumanPerformer(HumanPerformer)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_HumanPerformer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='humanPerformer' namespace='##targetNamespace' affiliation='performer'"
     * @generated
     */
    HumanPerformer getHumanPerformer();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getHumanPerformer <em>Human Performer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Human Performer</em>' containment reference.
     * @see #getHumanPerformer()
     * @generated
     */
    void setHumanPerformer(HumanPerformer value);

    /**
     * Returns the value of the '<em><b>Performer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Performer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Performer</em>' containment reference.
     * @see #setPerformer(Performer)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Performer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace' affiliation='activityResource'"
     * @generated
     */
    Performer getPerformer();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getPerformer <em>Performer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Performer</em>' containment reference.
     * @see #getPerformer()
     * @generated
     */
    void setPerformer(Performer value);

    /**
     * Returns the value of the '<em><b>Implicit Throw Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implicit Throw Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Implicit Throw Event</em>' containment reference.
     * @see #setImplicitThrowEvent(ImplicitThrowEvent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ImplicitThrowEvent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='implicitThrowEvent' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ImplicitThrowEvent getImplicitThrowEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getImplicitThrowEvent <em>Implicit Throw Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implicit Throw Event</em>' containment reference.
     * @see #getImplicitThrowEvent()
     * @generated
     */
    void setImplicitThrowEvent(ImplicitThrowEvent value);

    /**
     * Returns the value of the '<em><b>Import</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Import</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Import</em>' containment reference.
     * @see #setImport(Import)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Import()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
     * @generated
     */
    Import getImport();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getImport <em>Import</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Import</em>' containment reference.
     * @see #getImport()
     * @generated
     */
    void setImport(Import value);

    /**
     * Returns the value of the '<em><b>Inclusive Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inclusive Gateway</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inclusive Gateway</em>' containment reference.
     * @see #setInclusiveGateway(InclusiveGateway)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_InclusiveGateway()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inclusiveGateway' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    InclusiveGateway getInclusiveGateway();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getInclusiveGateway <em>Inclusive Gateway</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inclusive Gateway</em>' containment reference.
     * @see #getInclusiveGateway()
     * @generated
     */
    void setInclusiveGateway(InclusiveGateway value);

    /**
     * Returns the value of the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Set</em>' containment reference.
     * @see #setInputSet(InputSet)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_InputSet()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inputSet' namespace='##targetNamespace'"
     * @generated
     */
    InputSet getInputSet();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getInputSet <em>Input Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Set</em>' containment reference.
     * @see #getInputSet()
     * @generated
     */
    void setInputSet(InputSet value);

    /**
     * Returns the value of the '<em><b>Interface</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface</em>' containment reference.
     * @see #setInterface(Interface)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Interface()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interface' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    Interface getInterface();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getInterface <em>Interface</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface</em>' containment reference.
     * @see #getInterface()
     * @generated
     */
    void setInterface(Interface value);

    /**
     * Returns the value of the '<em><b>Intermediate Catch Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Intermediate Catch Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Intermediate Catch Event</em>' containment reference.
     * @see #setIntermediateCatchEvent(IntermediateCatchEvent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_IntermediateCatchEvent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='intermediateCatchEvent' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    IntermediateCatchEvent getIntermediateCatchEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intermediate Catch Event</em>' containment reference.
     * @see #getIntermediateCatchEvent()
     * @generated
     */
    void setIntermediateCatchEvent(IntermediateCatchEvent value);

    /**
     * Returns the value of the '<em><b>Intermediate Throw Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Intermediate Throw Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Intermediate Throw Event</em>' containment reference.
     * @see #setIntermediateThrowEvent(IntermediateThrowEvent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_IntermediateThrowEvent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='intermediateThrowEvent' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    IntermediateThrowEvent getIntermediateThrowEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intermediate Throw Event</em>' containment reference.
     * @see #getIntermediateThrowEvent()
     * @generated
     */
    void setIntermediateThrowEvent(IntermediateThrowEvent value);

    /**
     * Returns the value of the '<em><b>Io Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Io Binding</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Io Binding</em>' containment reference.
     * @see #setIoBinding(InputOutputBinding)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_IoBinding()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ioBinding' namespace='##targetNamespace'"
     * @generated
     */
    InputOutputBinding getIoBinding();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getIoBinding <em>Io Binding</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Io Binding</em>' containment reference.
     * @see #getIoBinding()
     * @generated
     */
    void setIoBinding(InputOutputBinding value);

    /**
     * Returns the value of the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Io Specification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Io Specification</em>' containment reference.
     * @see #setIoSpecification(InputOutputSpecification)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_IoSpecification()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='ioSpecification' namespace='##targetNamespace'"
     * @generated
     */
    InputOutputSpecification getIoSpecification();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getIoSpecification <em>Io Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Io Specification</em>' containment reference.
     * @see #getIoSpecification()
     * @generated
     */
    void setIoSpecification(InputOutputSpecification value);

    /**
     * Returns the value of the '<em><b>Item Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Item Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Item Definition</em>' containment reference.
     * @see #setItemDefinition(ItemDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ItemDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='itemDefinition' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    ItemDefinition getItemDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getItemDefinition <em>Item Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item Definition</em>' containment reference.
     * @see #getItemDefinition()
     * @generated
     */
    void setItemDefinition(ItemDefinition value);

    /**
     * Returns the value of the '<em><b>Lane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lane</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lane</em>' containment reference.
     * @see #setLane(Lane)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Lane()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='lane' namespace='##targetNamespace'"
     * @generated
     */
    Lane getLane();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getLane <em>Lane</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lane</em>' containment reference.
     * @see #getLane()
     * @generated
     */
    void setLane(Lane value);

    /**
     * Returns the value of the '<em><b>Lane Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lane Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lane Set</em>' containment reference.
     * @see #setLaneSet(LaneSet)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_LaneSet()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='laneSet' namespace='##targetNamespace'"
     * @generated
     */
    LaneSet getLaneSet();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getLaneSet <em>Lane Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lane Set</em>' containment reference.
     * @see #getLaneSet()
     * @generated
     */
    void setLaneSet(LaneSet value);

    /**
     * Returns the value of the '<em><b>Link Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Link Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Link Event Definition</em>' containment reference.
     * @see #setLinkEventDefinition(LinkEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_LinkEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='linkEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    LinkEventDefinition getLinkEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getLinkEventDefinition <em>Link Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Link Event Definition</em>' containment reference.
     * @see #getLinkEventDefinition()
     * @generated
     */
    void setLinkEventDefinition(LinkEventDefinition value);

    /**
     * Returns the value of the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Characteristics</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Characteristics</em>' containment reference.
     * @see #setLoopCharacteristics(LoopCharacteristics)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_LoopCharacteristics()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loopCharacteristics' namespace='##targetNamespace'"
     * @generated
     */
    LoopCharacteristics getLoopCharacteristics();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getLoopCharacteristics <em>Loop Characteristics</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Characteristics</em>' containment reference.
     * @see #getLoopCharacteristics()
     * @generated
     */
    void setLoopCharacteristics(LoopCharacteristics value);

    /**
     * Returns the value of the '<em><b>Manual Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manual Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manual Task</em>' containment reference.
     * @see #setManualTask(ManualTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ManualTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='manualTask' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ManualTask getManualTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getManualTask <em>Manual Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manual Task</em>' containment reference.
     * @see #getManualTask()
     * @generated
     */
    void setManualTask(ManualTask value);

    /**
     * Returns the value of the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' containment reference.
     * @see #setMessage(Message)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Message()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    Message getMessage();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessage <em>Message</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' containment reference.
     * @see #getMessage()
     * @generated
     */
    void setMessage(Message value);

    /**
     * Returns the value of the '<em><b>Message Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Event Definition</em>' containment reference.
     * @see #setMessageEventDefinition(MessageEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_MessageEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='messageEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    MessageEventDefinition getMessageEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessageEventDefinition <em>Message Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Event Definition</em>' containment reference.
     * @see #getMessageEventDefinition()
     * @generated
     */
    void setMessageEventDefinition(MessageEventDefinition value);

    /**
     * Returns the value of the '<em><b>Message Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flow</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flow</em>' containment reference.
     * @see #setMessageFlow(MessageFlow)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_MessageFlow()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='messageFlow' namespace='##targetNamespace'"
     * @generated
     */
    MessageFlow getMessageFlow();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessageFlow <em>Message Flow</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Flow</em>' containment reference.
     * @see #getMessageFlow()
     * @generated
     */
    void setMessageFlow(MessageFlow value);

    /**
     * Returns the value of the '<em><b>Message Flow Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flow Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flow Association</em>' containment reference.
     * @see #setMessageFlowAssociation(MessageFlowAssociation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_MessageFlowAssociation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='messageFlowAssociation' namespace='##targetNamespace'"
     * @generated
     */
    MessageFlowAssociation getMessageFlowAssociation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMessageFlowAssociation <em>Message Flow Association</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Flow Association</em>' containment reference.
     * @see #getMessageFlowAssociation()
     * @generated
     */
    void setMessageFlowAssociation(MessageFlowAssociation value);

    /**
     * Returns the value of the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitoring</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitoring</em>' containment reference.
     * @see #setMonitoring(Monitoring)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Monitoring()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='monitoring' namespace='##targetNamespace'"
     * @generated
     */
    Monitoring getMonitoring();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMonitoring <em>Monitoring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitoring</em>' containment reference.
     * @see #getMonitoring()
     * @generated
     */
    void setMonitoring(Monitoring value);

    /**
     * Returns the value of the '<em><b>Multi Instance Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multi Instance Loop Characteristics</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multi Instance Loop Characteristics</em>' containment reference.
     * @see #setMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_MultiInstanceLoopCharacteristics()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='multiInstanceLoopCharacteristics' namespace='##targetNamespace' affiliation='loopCharacteristics'"
     * @generated
     */
    MultiInstanceLoopCharacteristics getMultiInstanceLoopCharacteristics();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multi Instance Loop Characteristics</em>' containment reference.
     * @see #getMultiInstanceLoopCharacteristics()
     * @generated
     */
    void setMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics value);

    /**
     * Returns the value of the '<em><b>Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' containment reference.
     * @see #setOperation(Operation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Operation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
     * @generated
     */
    Operation getOperation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getOperation <em>Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' containment reference.
     * @see #getOperation()
     * @generated
     */
    void setOperation(Operation value);

    /**
     * Returns the value of the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Set</em>' containment reference.
     * @see #setOutputSet(OutputSet)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_OutputSet()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='outputSet' namespace='##targetNamespace'"
     * @generated
     */
    OutputSet getOutputSet();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getOutputSet <em>Output Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Set</em>' containment reference.
     * @see #getOutputSet()
     * @generated
     */
    void setOutputSet(OutputSet value);

    /**
     * Returns the value of the '<em><b>Parallel Gateway</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parallel Gateway</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parallel Gateway</em>' containment reference.
     * @see #setParallelGateway(ParallelGateway)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ParallelGateway()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='parallelGateway' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ParallelGateway getParallelGateway();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getParallelGateway <em>Parallel Gateway</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parallel Gateway</em>' containment reference.
     * @see #getParallelGateway()
     * @generated
     */
    void setParallelGateway(ParallelGateway value);

    /**
     * Returns the value of the '<em><b>Participant</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant</em>' containment reference.
     * @see #setParticipant(Participant)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Participant()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
     * @generated
     */
    Participant getParticipant();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getParticipant <em>Participant</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participant</em>' containment reference.
     * @see #getParticipant()
     * @generated
     */
    void setParticipant(Participant value);

    /**
     * Returns the value of the '<em><b>Participant Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Association</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Association</em>' containment reference.
     * @see #setParticipantAssociation(ParticipantAssociation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ParticipantAssociation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='participantAssociation' namespace='##targetNamespace'"
     * @generated
     */
    ParticipantAssociation getParticipantAssociation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getParticipantAssociation <em>Participant Association</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participant Association</em>' containment reference.
     * @see #getParticipantAssociation()
     * @generated
     */
    void setParticipantAssociation(ParticipantAssociation value);

    /**
     * Returns the value of the '<em><b>Participant Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Multiplicity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Multiplicity</em>' containment reference.
     * @see #setParticipantMultiplicity(ParticipantMultiplicity)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ParticipantMultiplicity()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='participantMultiplicity' namespace='##targetNamespace'"
     * @generated
     */
    ParticipantMultiplicity getParticipantMultiplicity();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getParticipantMultiplicity <em>Participant Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participant Multiplicity</em>' containment reference.
     * @see #getParticipantMultiplicity()
     * @generated
     */
    void setParticipantMultiplicity(ParticipantMultiplicity value);

    /**
     * Returns the value of the '<em><b>Partner Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Partner Entity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Partner Entity</em>' containment reference.
     * @see #setPartnerEntity(PartnerEntity)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_PartnerEntity()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='partnerEntity' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    PartnerEntity getPartnerEntity();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getPartnerEntity <em>Partner Entity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Partner Entity</em>' containment reference.
     * @see #getPartnerEntity()
     * @generated
     */
    void setPartnerEntity(PartnerEntity value);

    /**
     * Returns the value of the '<em><b>Partner Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Partner Role</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Partner Role</em>' containment reference.
     * @see #setPartnerRole(PartnerRole)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_PartnerRole()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='partnerRole' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    PartnerRole getPartnerRole();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getPartnerRole <em>Partner Role</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Partner Role</em>' containment reference.
     * @see #getPartnerRole()
     * @generated
     */
    void setPartnerRole(PartnerRole value);

    /**
     * Returns the value of the '<em><b>Potential Owner</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Potential Owner</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Potential Owner</em>' containment reference.
     * @see #setPotentialOwner(PotentialOwner)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_PotentialOwner()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='potentialOwner' namespace='##targetNamespace' affiliation='performer'"
     * @generated
     */
    PotentialOwner getPotentialOwner();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getPotentialOwner <em>Potential Owner</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Potential Owner</em>' containment reference.
     * @see #getPotentialOwner()
     * @generated
     */
    void setPotentialOwner(PotentialOwner value);

    /**
     * Returns the value of the '<em><b>Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' containment reference.
     * @see #setProcess(org.eclipse.mdt.bpmn.Process)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Process()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    org.eclipse.mdt.bpmn.Process getProcess();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getProcess <em>Process</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' containment reference.
     * @see #getProcess()
     * @generated
     */
    void setProcess(org.eclipse.mdt.bpmn.Process value);

    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference.
     * @see #setProperty(Property)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Property()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    Property getProperty();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getProperty <em>Property</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' containment reference.
     * @see #getProperty()
     * @generated
     */
    void setProperty(Property value);

    /**
     * Returns the value of the '<em><b>Receive Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Receive Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Receive Task</em>' containment reference.
     * @see #setReceiveTask(ReceiveTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ReceiveTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='receiveTask' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ReceiveTask getReceiveTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getReceiveTask <em>Receive Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Receive Task</em>' containment reference.
     * @see #getReceiveTask()
     * @generated
     */
    void setReceiveTask(ReceiveTask value);

    /**
     * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relationship</em>' containment reference.
     * @see #setRelationship(Relationship)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Relationship()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
     * @generated
     */
    Relationship getRelationship();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getRelationship <em>Relationship</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relationship</em>' containment reference.
     * @see #getRelationship()
     * @generated
     */
    void setRelationship(Relationship value);

    /**
     * Returns the value of the '<em><b>Rendering</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rendering</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rendering</em>' containment reference.
     * @see #setRendering(Rendering)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Rendering()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='rendering' namespace='##targetNamespace'"
     * @generated
     */
    Rendering getRendering();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getRendering <em>Rendering</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rendering</em>' containment reference.
     * @see #getRendering()
     * @generated
     */
    void setRendering(Rendering value);

    /**
     * Returns the value of the '<em><b>Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' containment reference.
     * @see #setResource(Resource)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Resource()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    Resource getResource();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getResource <em>Resource</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' containment reference.
     * @see #getResource()
     * @generated
     */
    void setResource(Resource value);

    /**
     * Returns the value of the '<em><b>Resource Assignment Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Assignment Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Assignment Expression</em>' containment reference.
     * @see #setResourceAssignmentExpression(ResourceAssignmentExpression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ResourceAssignmentExpression()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resourceAssignmentExpression' namespace='##targetNamespace'"
     * @generated
     */
    ResourceAssignmentExpression getResourceAssignmentExpression();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Assignment Expression</em>' containment reference.
     * @see #getResourceAssignmentExpression()
     * @generated
     */
    void setResourceAssignmentExpression(ResourceAssignmentExpression value);

    /**
     * Returns the value of the '<em><b>Resource Parameter</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Parameter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Parameter</em>' containment reference.
     * @see #setResourceParameter(ResourceParameter)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ResourceParameter()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resourceParameter' namespace='##targetNamespace'"
     * @generated
     */
    ResourceParameter getResourceParameter();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getResourceParameter <em>Resource Parameter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Parameter</em>' containment reference.
     * @see #getResourceParameter()
     * @generated
     */
    void setResourceParameter(ResourceParameter value);

    /**
     * Returns the value of the '<em><b>Resource Parameter Binding</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Parameter Binding</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Parameter Binding</em>' containment reference.
     * @see #setResourceParameterBinding(ResourceParameterBinding)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ResourceParameterBinding()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resourceParameterBinding' namespace='##targetNamespace'"
     * @generated
     */
    ResourceParameterBinding getResourceParameterBinding();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getResourceParameterBinding <em>Resource Parameter Binding</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Parameter Binding</em>' containment reference.
     * @see #getResourceParameterBinding()
     * @generated
     */
    void setResourceParameterBinding(ResourceParameterBinding value);

    /**
     * Returns the value of the '<em><b>Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script</em>' containment reference.
     * @see #setScript(Script)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Script()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace'"
     * @generated
     */
    Script getScript();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getScript <em>Script</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script</em>' containment reference.
     * @see #getScript()
     * @generated
     */
    void setScript(Script value);

    /**
     * Returns the value of the '<em><b>Script Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script Task</em>' containment reference.
     * @see #setScriptTask(ScriptTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ScriptTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='scriptTask' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ScriptTask getScriptTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getScriptTask <em>Script Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script Task</em>' containment reference.
     * @see #getScriptTask()
     * @generated
     */
    void setScriptTask(ScriptTask value);

    /**
     * Returns the value of the '<em><b>Send Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Send Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Send Task</em>' containment reference.
     * @see #setSendTask(SendTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_SendTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sendTask' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    SendTask getSendTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSendTask <em>Send Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Send Task</em>' containment reference.
     * @see #getSendTask()
     * @generated
     */
    void setSendTask(SendTask value);

    /**
     * Returns the value of the '<em><b>Sequence Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence Flow</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence Flow</em>' containment reference.
     * @see #setSequenceFlow(SequenceFlow)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_SequenceFlow()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sequenceFlow' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    SequenceFlow getSequenceFlow();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence Flow</em>' containment reference.
     * @see #getSequenceFlow()
     * @generated
     */
    void setSequenceFlow(SequenceFlow value);

    /**
     * Returns the value of the '<em><b>Service Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Task</em>' containment reference.
     * @see #setServiceTask(ServiceTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ServiceTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='serviceTask' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    ServiceTask getServiceTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getServiceTask <em>Service Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Task</em>' containment reference.
     * @see #getServiceTask()
     * @generated
     */
    void setServiceTask(ServiceTask value);

    /**
     * Returns the value of the '<em><b>Signal</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signal</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Signal</em>' containment reference.
     * @see #setSignal(Signal)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Signal()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='signal' namespace='##targetNamespace' affiliation='rootElement'"
     * @generated
     */
    Signal getSignal();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSignal <em>Signal</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal</em>' containment reference.
     * @see #getSignal()
     * @generated
     */
    void setSignal(Signal value);

    /**
     * Returns the value of the '<em><b>Signal Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signal Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Signal Event Definition</em>' containment reference.
     * @see #setSignalEventDefinition(SignalEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_SignalEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='signalEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    SignalEventDefinition getSignalEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSignalEventDefinition <em>Signal Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal Event Definition</em>' containment reference.
     * @see #getSignalEventDefinition()
     * @generated
     */
    void setSignalEventDefinition(SignalEventDefinition value);

    /**
     * Returns the value of the '<em><b>Standard Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Loop Characteristics</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Loop Characteristics</em>' containment reference.
     * @see #setStandardLoopCharacteristics(StandardLoopCharacteristics)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_StandardLoopCharacteristics()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='standardLoopCharacteristics' namespace='##targetNamespace' affiliation='loopCharacteristics'"
     * @generated
     */
    StandardLoopCharacteristics getStandardLoopCharacteristics();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Loop Characteristics</em>' containment reference.
     * @see #getStandardLoopCharacteristics()
     * @generated
     */
    void setStandardLoopCharacteristics(StandardLoopCharacteristics value);

    /**
     * Returns the value of the '<em><b>Start Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Event</em>' containment reference.
     * @see #setStartEvent(StartEvent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_StartEvent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='startEvent' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    StartEvent getStartEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getStartEvent <em>Start Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Event</em>' containment reference.
     * @see #getStartEvent()
     * @generated
     */
    void setStartEvent(StartEvent value);

    /**
     * Returns the value of the '<em><b>Sub Conversation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Conversation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Conversation</em>' containment reference.
     * @see #setSubConversation(SubConversation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_SubConversation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='subConversation' namespace='##targetNamespace' affiliation='conversationNode'"
     * @generated
     */
    SubConversation getSubConversation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSubConversation <em>Sub Conversation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Conversation</em>' containment reference.
     * @see #getSubConversation()
     * @generated
     */
    void setSubConversation(SubConversation value);

    /**
     * Returns the value of the '<em><b>Sub Process</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Process</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Process</em>' containment reference.
     * @see #setSubProcess(SubProcess)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_SubProcess()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='subProcess' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    SubProcess getSubProcess();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getSubProcess <em>Sub Process</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Process</em>' containment reference.
     * @see #getSubProcess()
     * @generated
     */
    void setSubProcess(SubProcess value);

    /**
     * Returns the value of the '<em><b>Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task</em>' containment reference.
     * @see #setTask(Task)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Task()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    Task getTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTask <em>Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task</em>' containment reference.
     * @see #getTask()
     * @generated
     */
    void setTask(Task value);

    /**
     * Returns the value of the '<em><b>Terminate Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminate Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Terminate Event Definition</em>' containment reference.
     * @see #setTerminateEventDefinition(TerminateEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_TerminateEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='terminateEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    TerminateEventDefinition getTerminateEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTerminateEventDefinition <em>Terminate Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminate Event Definition</em>' containment reference.
     * @see #getTerminateEventDefinition()
     * @generated
     */
    void setTerminateEventDefinition(TerminateEventDefinition value);

    /**
     * Returns the value of the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' containment reference.
     * @see #setText(Text)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Text()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
     * @generated
     */
    Text getText();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getText <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' containment reference.
     * @see #getText()
     * @generated
     */
    void setText(Text value);

    /**
     * Returns the value of the '<em><b>Text Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text Annotation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text Annotation</em>' containment reference.
     * @see #setTextAnnotation(TextAnnotation)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_TextAnnotation()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='textAnnotation' namespace='##targetNamespace' affiliation='artifact'"
     * @generated
     */
    TextAnnotation getTextAnnotation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTextAnnotation <em>Text Annotation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text Annotation</em>' containment reference.
     * @see #getTextAnnotation()
     * @generated
     */
    void setTextAnnotation(TextAnnotation value);

    /**
     * Returns the value of the '<em><b>Throw Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Throw Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Throw Event</em>' containment reference.
     * @see #setThrowEvent(ThrowEvent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_ThrowEvent()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='throwEvent' namespace='##targetNamespace'"
     * @generated
     */
    ThrowEvent getThrowEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getThrowEvent <em>Throw Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Throw Event</em>' containment reference.
     * @see #getThrowEvent()
     * @generated
     */
    void setThrowEvent(ThrowEvent value);

    /**
     * Returns the value of the '<em><b>Timer Event Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timer Event Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timer Event Definition</em>' containment reference.
     * @see #setTimerEventDefinition(TimerEventDefinition)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_TimerEventDefinition()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='timerEventDefinition' namespace='##targetNamespace' affiliation='eventDefinition'"
     * @generated
     */
    TimerEventDefinition getTimerEventDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTimerEventDefinition <em>Timer Event Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timer Event Definition</em>' containment reference.
     * @see #getTimerEventDefinition()
     * @generated
     */
    void setTimerEventDefinition(TimerEventDefinition value);

    /**
     * Returns the value of the '<em><b>Transaction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transaction</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transaction</em>' containment reference.
     * @see #setTransaction(Transaction)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_Transaction()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transaction' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    Transaction getTransaction();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getTransaction <em>Transaction</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transaction</em>' containment reference.
     * @see #getTransaction()
     * @generated
     */
    void setTransaction(Transaction value);

    /**
     * Returns the value of the '<em><b>User Task</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Task</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Task</em>' containment reference.
     * @see #setUserTask(UserTask)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDocumentRoot_UserTask()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='userTask' namespace='##targetNamespace' affiliation='flowElement'"
     * @generated
     */
    UserTask getUserTask();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DocumentRoot#getUserTask <em>User Task</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Task</em>' containment reference.
     * @see #getUserTask()
     * @generated
     */
    void setUserTask(UserTask value);

} // DocumentRoot
