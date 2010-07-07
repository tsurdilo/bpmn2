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
package org.eclipse.bpmn.impl;

import java.util.Map;
import org.eclipse.bpmn.Activity;
import org.eclipse.bpmn.ActivityResource;
import org.eclipse.bpmn.AdHocSubProcess;
import org.eclipse.bpmn.Artifact;
import org.eclipse.bpmn.Assignment;
import org.eclipse.bpmn.Association;
import org.eclipse.bpmn.Auditing;
import org.eclipse.bpmn.BaseElement;
import org.eclipse.bpmn.BaseElementWithMixedContent;
import org.eclipse.bpmn.BoundaryEvent;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.BusinessRuleTask;
import org.eclipse.bpmn.CallActivity;
import org.eclipse.bpmn.CallChoreographyActivity;
import org.eclipse.bpmn.CallConversation;
import org.eclipse.bpmn.CallableElement;
import org.eclipse.bpmn.CancelEventDefinition;
import org.eclipse.bpmn.CatchEvent;
import org.eclipse.bpmn.Category;
import org.eclipse.bpmn.CategoryValue;
import org.eclipse.bpmn.Choreography;
import org.eclipse.bpmn.ChoreographyActivity;
import org.eclipse.bpmn.ChoreographySubProcess;
import org.eclipse.bpmn.ChoreographyTask;
import org.eclipse.bpmn.Collaboration;
import org.eclipse.bpmn.Communication;
import org.eclipse.bpmn.CompensateEventDefinition;
import org.eclipse.bpmn.ComplexBehaviorDefinition;
import org.eclipse.bpmn.ComplexGateway;
import org.eclipse.bpmn.ConditionalEventDefinition;
import org.eclipse.bpmn.Conversation;
import org.eclipse.bpmn.ConversationAssociation;
import org.eclipse.bpmn.ConversationNode;
import org.eclipse.bpmn.CorrelationKey;
import org.eclipse.bpmn.CorrelationProperty;
import org.eclipse.bpmn.CorrelationPropertyBinding;
import org.eclipse.bpmn.CorrelationPropertyRetrievalExpression;
import org.eclipse.bpmn.CorrelationSubscription;
import org.eclipse.bpmn.DataAssociation;
import org.eclipse.bpmn.DataInput;
import org.eclipse.bpmn.DataInputAssociation;
import org.eclipse.bpmn.DataObject;
import org.eclipse.bpmn.DataOutput;
import org.eclipse.bpmn.DataOutputAssociation;
import org.eclipse.bpmn.DataState;
import org.eclipse.bpmn.DataStore;
import org.eclipse.bpmn.DataStoreReference;
import org.eclipse.bpmn.Definitions;
import org.eclipse.bpmn.DocumentRoot;
import org.eclipse.bpmn.Documentation;
import org.eclipse.bpmn.EndEvent;
import org.eclipse.bpmn.EndPoint;
import org.eclipse.bpmn.ErrorEventDefinition;
import org.eclipse.bpmn.Escalation;
import org.eclipse.bpmn.EscalationEventDefinition;
import org.eclipse.bpmn.Event;
import org.eclipse.bpmn.EventBasedGateway;
import org.eclipse.bpmn.EventDefinition;
import org.eclipse.bpmn.ExclusiveGateway;
import org.eclipse.bpmn.Expression;
import org.eclipse.bpmn.Extension;
import org.eclipse.bpmn.FlowElement;
import org.eclipse.bpmn.FlowNode;
import org.eclipse.bpmn.FormalExpression;
import org.eclipse.bpmn.Gateway;
import org.eclipse.bpmn.GlobalBusinessRuleTask;
import org.eclipse.bpmn.GlobalChoreographyTask;
import org.eclipse.bpmn.GlobalCommunication;
import org.eclipse.bpmn.GlobalManualTask;
import org.eclipse.bpmn.GlobalScriptTask;
import org.eclipse.bpmn.GlobalTask;
import org.eclipse.bpmn.GlobalUserTask;
import org.eclipse.bpmn.Group;
import org.eclipse.bpmn.HumanPerformer;
import org.eclipse.bpmn.ImplicitThrowEvent;
import org.eclipse.bpmn.Import;
import org.eclipse.bpmn.InclusiveGateway;
import org.eclipse.bpmn.InputOutputBinding;
import org.eclipse.bpmn.InputOutputSpecification;
import org.eclipse.bpmn.InputSet;
import org.eclipse.bpmn.Interface;
import org.eclipse.bpmn.IntermediateCatchEvent;
import org.eclipse.bpmn.IntermediateThrowEvent;
import org.eclipse.bpmn.ItemDefinition;
import org.eclipse.bpmn.Lane;
import org.eclipse.bpmn.LaneSet;
import org.eclipse.bpmn.LinkEventDefinition;
import org.eclipse.bpmn.LoopCharacteristics;
import org.eclipse.bpmn.ManualTask;
import org.eclipse.bpmn.Message;
import org.eclipse.bpmn.MessageEventDefinition;
import org.eclipse.bpmn.MessageFlow;
import org.eclipse.bpmn.MessageFlowAssociation;
import org.eclipse.bpmn.Monitoring;
import org.eclipse.bpmn.MultiInstanceLoopCharacteristics;
import org.eclipse.bpmn.Operation;
import org.eclipse.bpmn.OutputSet;
import org.eclipse.bpmn.ParallelGateway;
import org.eclipse.bpmn.Participant;
import org.eclipse.bpmn.ParticipantAssociation;
import org.eclipse.bpmn.ParticipantMultiplicity;
import org.eclipse.bpmn.PartnerEntity;
import org.eclipse.bpmn.PartnerRole;
import org.eclipse.bpmn.Performer;
import org.eclipse.bpmn.PotentialOwner;
import org.eclipse.bpmn.Property;
import org.eclipse.bpmn.ReceiveTask;
import org.eclipse.bpmn.Relationship;
import org.eclipse.bpmn.Rendering;
import org.eclipse.bpmn.Resource;
import org.eclipse.bpmn.ResourceAssignmentExpression;
import org.eclipse.bpmn.ResourceParameter;
import org.eclipse.bpmn.ResourceParameterBinding;
import org.eclipse.bpmn.RootElement;
import org.eclipse.bpmn.Script;
import org.eclipse.bpmn.ScriptTask;
import org.eclipse.bpmn.SendTask;
import org.eclipse.bpmn.SequenceFlow;
import org.eclipse.bpmn.ServiceTask;
import org.eclipse.bpmn.Signal;
import org.eclipse.bpmn.SignalEventDefinition;
import org.eclipse.bpmn.StandardLoopCharacteristics;
import org.eclipse.bpmn.StartEvent;
import org.eclipse.bpmn.SubConversation;
import org.eclipse.bpmn.SubProcess;
import org.eclipse.bpmn.Task;
import org.eclipse.bpmn.TerminateEventDefinition;
import org.eclipse.bpmn.Text;
import org.eclipse.bpmn.TextAnnotation;
import org.eclipse.bpmn.ThrowEvent;
import org.eclipse.bpmn.TimerEventDefinition;
import org.eclipse.bpmn.Transaction;
import org.eclipse.bpmn.UserTask;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getActivityResource <em>Activity Resource</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getBaseElement <em>Base Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getBoundaryEvent <em>Boundary Event</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getBusinessRuleTask <em>Business Rule Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCallableElement <em>Callable Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCallActivity <em>Call Activity</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCallChoreographyActivity <em>Call Choreography Activity</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCallConversation <em>Call Conversation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCancelEventDefinition <em>Cancel Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCatchEvent <em>Catch Event</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCategoryValue <em>Category Value</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getChoreographyActivity <em>Choreography Activity</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getChoreographySubProcess <em>Choreography Sub Process</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getChoreographyTask <em>Choreography Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCompensateEventDefinition <em>Compensate Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getComplexGateway <em>Complex Gateway</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getConditionalEventDefinition <em>Conditional Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getConversation <em>Conversation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCorrelationKey <em>Correlation Key</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCorrelationProperty <em>Correlation Property</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getCorrelationSubscription <em>Correlation Subscription</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDataAssociation <em>Data Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDataStore <em>Data Store</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDataStoreReference <em>Data Store Reference</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getEndEvent <em>End Event</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getErrorEventDefinition <em>Error Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getEscalation <em>Escalation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getEscalationEventDefinition <em>Escalation Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getEventBasedGateway <em>Event Based Gateway</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getExclusiveGateway <em>Exclusive Gateway</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getFormalExpression <em>Formal Expression</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getGlobalChoreographyTask <em>Global Choreography Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getGlobalCommunication <em>Global Communication</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getGlobalManualTask <em>Global Manual Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getGlobalScriptTask <em>Global Script Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getGlobalTask <em>Global Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getGlobalUserTask <em>Global User Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getHumanPerformer <em>Human Performer</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getImplicitThrowEvent <em>Implicit Throw Event</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getInclusiveGateway <em>Inclusive Gateway</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getLane <em>Lane</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getLaneSet <em>Lane Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getLinkEventDefinition <em>Link Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getManualTask <em>Manual Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getMessageEventDefinition <em>Message Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getParallelGateway <em>Parallel Gateway</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getPartnerEntity <em>Partner Entity</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getPartnerRole <em>Partner Role</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getPotentialOwner <em>Potential Owner</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getReceiveTask <em>Receive Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getResourceParameter <em>Resource Parameter</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getResourceParameterBinding <em>Resource Parameter Binding</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getScriptTask <em>Script Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getSendTask <em>Send Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getServiceTask <em>Service Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getSignalEventDefinition <em>Signal Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getSubConversation <em>Sub Conversation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getSubProcess <em>Sub Process</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getTerminateEventDefinition <em>Terminate Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getTextAnnotation <em>Text Annotation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getThrowEvent <em>Throw Event</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getTimerEventDefinition <em>Timer Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.DocumentRootImpl#getUserTask <em>User Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getDocumentRoot();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, BpmnPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
                    BpmnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap.map();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
                    BpmnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation.map();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity getActivity() {
        return (Activity) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Activity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Activity(), newActivity, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivity(Activity newActivity) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Activity(), newActivity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityResource getActivityResource() {
        return (ActivityResource) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ActivityResource(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivityResource(ActivityResource newActivityResource, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ActivityResource(), newActivityResource, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivityResource(ActivityResource newActivityResource) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ActivityResource(), newActivityResource);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocSubProcess getAdHocSubProcess() {
        return (AdHocSubProcess) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAdHocSubProcess(AdHocSubProcess newAdHocSubProcess, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess(), newAdHocSubProcess, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAdHocSubProcess(AdHocSubProcess newAdHocSubProcess) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess(), newAdHocSubProcess);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowElement getFlowElement() {
        return (FlowElement) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFlowElement(FlowElement newFlowElement, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(), newFlowElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlowElement(FlowElement newFlowElement) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(), newFlowElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Artifact getArtifact() {
        return (Artifact) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Artifact(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetArtifact(Artifact newArtifact, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Artifact(), newArtifact, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArtifact(Artifact newArtifact) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Artifact(), newArtifact);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assignment getAssignment() {
        return (Assignment) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Assignment(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssignment(Assignment newAssignment, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Assignment(), newAssignment, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssignment(Assignment newAssignment) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Assignment(), newAssignment);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Association getAssociation() {
        return (Association) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Association(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Association(), newAssociation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssociation(Association newAssociation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Association(), newAssociation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Auditing getAuditing() {
        return (Auditing) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Auditing(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuditing(Auditing newAuditing, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Auditing(), newAuditing, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuditing(Auditing newAuditing) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Auditing(), newAuditing);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseElement getBaseElement() {
        return (BaseElement) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseElement(BaseElement newBaseElement, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(), newBaseElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBaseElement(BaseElement newBaseElement) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(), newBaseElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseElementWithMixedContent getBaseElementWithMixedContent() {
        return (BaseElementWithMixedContent) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseElementWithMixedContent(BaseElementWithMixedContent newBaseElementWithMixedContent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(), newBaseElementWithMixedContent,
                msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBaseElementWithMixedContent(BaseElementWithMixedContent newBaseElementWithMixedContent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(), newBaseElementWithMixedContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoundaryEvent getBoundaryEvent() {
        return (BoundaryEvent) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_BoundaryEvent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBoundaryEvent(BoundaryEvent newBoundaryEvent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_BoundaryEvent(), newBoundaryEvent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBoundaryEvent(BoundaryEvent newBoundaryEvent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_BoundaryEvent(), newBoundaryEvent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessRuleTask getBusinessRuleTask() {
        return (BusinessRuleTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBusinessRuleTask(BusinessRuleTask newBusinessRuleTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask(), newBusinessRuleTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBusinessRuleTask(BusinessRuleTask newBusinessRuleTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask(), newBusinessRuleTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallableElement getCallableElement() {
        return (CallableElement) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCallableElement(CallableElement newCallableElement, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(), newCallableElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallableElement(CallableElement newCallableElement) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(), newCallableElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallActivity getCallActivity() {
        return (CallActivity) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CallActivity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCallActivity(CallActivity newCallActivity, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CallActivity(), newCallActivity, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallActivity(CallActivity newCallActivity) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CallActivity(), newCallActivity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallChoreographyActivity getCallChoreographyActivity() {
        return (CallChoreographyActivity) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CallChoreographyActivity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCallChoreographyActivity(CallChoreographyActivity newCallChoreographyActivity, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CallChoreographyActivity(), newCallChoreographyActivity, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallChoreographyActivity(CallChoreographyActivity newCallChoreographyActivity) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CallChoreographyActivity(), newCallChoreographyActivity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallConversation getCallConversation() {
        return (CallConversation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CallConversation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCallConversation(CallConversation newCallConversation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CallConversation(), newCallConversation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallConversation(CallConversation newCallConversation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CallConversation(), newCallConversation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConversationNode getConversationNode() {
        return (ConversationNode) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ConversationNode(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConversationNode(ConversationNode newConversationNode, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ConversationNode(), newConversationNode, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConversationNode(ConversationNode newConversationNode) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ConversationNode(), newConversationNode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CancelEventDefinition getCancelEventDefinition() {
        return (CancelEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCancelEventDefinition(CancelEventDefinition newCancelEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition(), newCancelEventDefinition, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCancelEventDefinition(CancelEventDefinition newCancelEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition(), newCancelEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventDefinition getEventDefinition() {
        return (EventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventDefinition(EventDefinition newEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(), newEventDefinition, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventDefinition(EventDefinition newEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(), newEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RootElement getRootElement() {
        return (RootElement) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRootElement(RootElement newRootElement, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(), newRootElement, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootElement(RootElement newRootElement) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(), newRootElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CatchEvent getCatchEvent() {
        return (CatchEvent) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CatchEvent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCatchEvent(CatchEvent newCatchEvent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CatchEvent(), newCatchEvent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCatchEvent(CatchEvent newCatchEvent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CatchEvent(), newCatchEvent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Category getCategory() {
        return (Category) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Category(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCategory(Category newCategory, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Category(), newCategory, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCategory(Category newCategory) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Category(), newCategory);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CategoryValue getCategoryValue() {
        return (CategoryValue) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CategoryValue(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCategoryValue(CategoryValue newCategoryValue, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CategoryValue(), newCategoryValue, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCategoryValue(CategoryValue newCategoryValue) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CategoryValue(), newCategoryValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Choreography getChoreography() {
        return (Choreography) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Choreography(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChoreography(Choreography newChoreography, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Choreography(), newChoreography, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoreography(Choreography newChoreography) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Choreography(), newChoreography);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChoreographyActivity getChoreographyActivity() {
        return (ChoreographyActivity) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChoreographyActivity(ChoreographyActivity newChoreographyActivity, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(), newChoreographyActivity, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoreographyActivity(ChoreographyActivity newChoreographyActivity) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(), newChoreographyActivity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChoreographySubProcess getChoreographySubProcess() {
        return (ChoreographySubProcess) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographySubProcess(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChoreographySubProcess(ChoreographySubProcess newChoreographySubProcess, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographySubProcess(), newChoreographySubProcess, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoreographySubProcess(ChoreographySubProcess newChoreographySubProcess) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographySubProcess(), newChoreographySubProcess);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChoreographyTask getChoreographyTask() {
        return (ChoreographyTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChoreographyTask(ChoreographyTask newChoreographyTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyTask(), newChoreographyTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoreographyTask(ChoreographyTask newChoreographyTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyTask(), newChoreographyTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collaboration getCollaboration() {
        return (Collaboration) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Collaboration(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCollaboration(Collaboration newCollaboration, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Collaboration(), newCollaboration, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCollaboration(Collaboration newCollaboration) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Collaboration(), newCollaboration);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Communication getCommunication() {
        return (Communication) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Communication(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCommunication(Communication newCommunication, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Communication(), newCommunication, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCommunication(Communication newCommunication) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Communication(), newCommunication);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompensateEventDefinition getCompensateEventDefinition() {
        return (CompensateEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CompensateEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCompensateEventDefinition(CompensateEventDefinition newCompensateEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CompensateEventDefinition(), newCompensateEventDefinition,
                msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCompensateEventDefinition(CompensateEventDefinition newCompensateEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CompensateEventDefinition(), newCompensateEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexBehaviorDefinition getComplexBehaviorDefinition() {
        return (ComplexBehaviorDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetComplexBehaviorDefinition(ComplexBehaviorDefinition newComplexBehaviorDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition(), newComplexBehaviorDefinition,
                msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComplexBehaviorDefinition(ComplexBehaviorDefinition newComplexBehaviorDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition(), newComplexBehaviorDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexGateway getComplexGateway() {
        return (ComplexGateway) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ComplexGateway(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetComplexGateway(ComplexGateway newComplexGateway, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ComplexGateway(), newComplexGateway, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComplexGateway(ComplexGateway newComplexGateway) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ComplexGateway(), newComplexGateway);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionalEventDefinition getConditionalEventDefinition() {
        return (ConditionalEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ConditionalEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConditionalEventDefinition(ConditionalEventDefinition newConditionalEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ConditionalEventDefinition(), newConditionalEventDefinition,
                msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConditionalEventDefinition(ConditionalEventDefinition newConditionalEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ConditionalEventDefinition(), newConditionalEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Conversation getConversation() {
        return (Conversation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Conversation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConversation(Conversation newConversation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Conversation(), newConversation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConversation(Conversation newConversation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Conversation(), newConversation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConversationAssociation getConversationAssociation() {
        return (ConversationAssociation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ConversationAssociation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConversationAssociation(ConversationAssociation newConversationAssociation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ConversationAssociation(), newConversationAssociation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConversationAssociation(ConversationAssociation newConversationAssociation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ConversationAssociation(), newConversationAssociation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationKey getCorrelationKey() {
        return (CorrelationKey) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationKey(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCorrelationKey(CorrelationKey newCorrelationKey, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationKey(), newCorrelationKey, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCorrelationKey(CorrelationKey newCorrelationKey) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationKey(), newCorrelationKey);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationProperty getCorrelationProperty() {
        return (CorrelationProperty) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationProperty(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCorrelationProperty(CorrelationProperty newCorrelationProperty, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationProperty(), newCorrelationProperty, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCorrelationProperty(CorrelationProperty newCorrelationProperty) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationProperty(), newCorrelationProperty);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationPropertyBinding getCorrelationPropertyBinding() {
        return (CorrelationPropertyBinding) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCorrelationPropertyBinding(CorrelationPropertyBinding newCorrelationPropertyBinding, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding(), newCorrelationPropertyBinding,
                msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCorrelationPropertyBinding(CorrelationPropertyBinding newCorrelationPropertyBinding) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding(), newCorrelationPropertyBinding);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationPropertyRetrievalExpression getCorrelationPropertyRetrievalExpression() {
        return (CorrelationPropertyRetrievalExpression) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression newCorrelationPropertyRetrievalExpression,
            NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression(),
                newCorrelationPropertyRetrievalExpression, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression newCorrelationPropertyRetrievalExpression) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression(),
                newCorrelationPropertyRetrievalExpression);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationSubscription getCorrelationSubscription() {
        return (CorrelationSubscription) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationSubscription(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCorrelationSubscription(CorrelationSubscription newCorrelationSubscription, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationSubscription(), newCorrelationSubscription, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCorrelationSubscription(CorrelationSubscription newCorrelationSubscription) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationSubscription(), newCorrelationSubscription);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataAssociation getDataAssociation() {
        return (DataAssociation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_DataAssociation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataAssociation(DataAssociation newDataAssociation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_DataAssociation(), newDataAssociation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataAssociation(DataAssociation newDataAssociation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_DataAssociation(), newDataAssociation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInput getDataInput() {
        return (DataInput) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_DataInput(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataInput(DataInput newDataInput, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_DataInput(), newDataInput, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataInput(DataInput newDataInput) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_DataInput(), newDataInput);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInputAssociation getDataInputAssociation() {
        return (DataInputAssociation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_DataInputAssociation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataInputAssociation(DataInputAssociation newDataInputAssociation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_DataInputAssociation(), newDataInputAssociation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataInputAssociation(DataInputAssociation newDataInputAssociation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_DataInputAssociation(), newDataInputAssociation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataObject getDataObject() {
        return (DataObject) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_DataObject(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataObject(DataObject newDataObject, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_DataObject(), newDataObject, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataObject(DataObject newDataObject) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_DataObject(), newDataObject);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutput getDataOutput() {
        return (DataOutput) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_DataOutput(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataOutput(DataOutput newDataOutput, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_DataOutput(), newDataOutput, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataOutput(DataOutput newDataOutput) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_DataOutput(), newDataOutput);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutputAssociation getDataOutputAssociation() {
        return (DataOutputAssociation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_DataOutputAssociation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataOutputAssociation(DataOutputAssociation newDataOutputAssociation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_DataOutputAssociation(), newDataOutputAssociation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataOutputAssociation(DataOutputAssociation newDataOutputAssociation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_DataOutputAssociation(), newDataOutputAssociation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataState getDataState() {
        return (DataState) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_DataState(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataState(DataState newDataState, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_DataState(), newDataState, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataState(DataState newDataState) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_DataState(), newDataState);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataStore getDataStore() {
        return (DataStore) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_DataStore(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataStore(DataStore newDataStore, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_DataStore(), newDataStore, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataStore(DataStore newDataStore) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_DataStore(), newDataStore);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataStoreReference getDataStoreReference() {
        return (DataStoreReference) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_DataStoreReference(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataStoreReference(DataStoreReference newDataStoreReference, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_DataStoreReference(), newDataStoreReference, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataStoreReference(DataStoreReference newDataStoreReference) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_DataStoreReference(), newDataStoreReference);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Definitions getDefinitions() {
        return (Definitions) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Definitions(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefinitions(Definitions newDefinitions, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Definitions(), newDefinitions, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefinitions(Definitions newDefinitions) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Definitions(), newDefinitions);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Documentation getDocumentation() {
        return (Documentation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Documentation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Documentation(), newDocumentation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDocumentation(Documentation newDocumentation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Documentation(), newDocumentation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndEvent getEndEvent() {
        return (EndEvent) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_EndEvent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndEvent(EndEvent newEndEvent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_EndEvent(), newEndEvent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndEvent(EndEvent newEndEvent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_EndEvent(), newEndEvent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndPoint getEndPoint() {
        return (EndPoint) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_EndPoint(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEndPoint(EndPoint newEndPoint, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_EndPoint(), newEndPoint, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndPoint(EndPoint newEndPoint) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_EndPoint(), newEndPoint);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.bpmn.Error getError() {
        return (org.eclipse.bpmn.Error) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Error(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetError(org.eclipse.bpmn.Error newError, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Error(), newError, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setError(org.eclipse.bpmn.Error newError) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Error(), newError);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ErrorEventDefinition getErrorEventDefinition() {
        return (ErrorEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetErrorEventDefinition(ErrorEventDefinition newErrorEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition(), newErrorEventDefinition, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setErrorEventDefinition(ErrorEventDefinition newErrorEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition(), newErrorEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Escalation getEscalation() {
        return (Escalation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Escalation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEscalation(Escalation newEscalation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Escalation(), newEscalation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEscalation(Escalation newEscalation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Escalation(), newEscalation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EscalationEventDefinition getEscalationEventDefinition() {
        return (EscalationEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_EscalationEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEscalationEventDefinition(EscalationEventDefinition newEscalationEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_EscalationEventDefinition(), newEscalationEventDefinition,
                msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEscalationEventDefinition(EscalationEventDefinition newEscalationEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_EscalationEventDefinition(), newEscalationEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Event getEvent() {
        return (Event) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Event(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Event(), newEvent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEvent(Event newEvent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Event(), newEvent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventBasedGateway getEventBasedGateway() {
        return (EventBasedGateway) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_EventBasedGateway(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEventBasedGateway(EventBasedGateway newEventBasedGateway, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_EventBasedGateway(), newEventBasedGateway, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventBasedGateway(EventBasedGateway newEventBasedGateway) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_EventBasedGateway(), newEventBasedGateway);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExclusiveGateway getExclusiveGateway() {
        return (ExclusiveGateway) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExclusiveGateway(ExclusiveGateway newExclusiveGateway, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway(), newExclusiveGateway, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExclusiveGateway(ExclusiveGateway newExclusiveGateway) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway(), newExclusiveGateway);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getExpression() {
        return (Expression) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Expression(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(Expression newExpression) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Expression(), newExpression);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Extension getExtension() {
        return (Extension) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Extension(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExtension(Extension newExtension, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Extension(), newExtension, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtension(Extension newExtension) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Extension(), newExtension);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowNode getFlowNode() {
        return (FlowNode) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFlowNode(FlowNode newFlowNode, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(), newFlowNode, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlowNode(FlowNode newFlowNode) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(), newFlowNode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormalExpression getFormalExpression() {
        return (FormalExpression) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_FormalExpression(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFormalExpression(FormalExpression newFormalExpression, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_FormalExpression(), newFormalExpression, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFormalExpression(FormalExpression newFormalExpression) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_FormalExpression(), newFormalExpression);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gateway getGateway() {
        return (Gateway) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Gateway(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGateway(Gateway newGateway, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Gateway(), newGateway, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalBusinessRuleTask getGlobalBusinessRuleTask() {
        return (GlobalBusinessRuleTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobalBusinessRuleTask(GlobalBusinessRuleTask newGlobalBusinessRuleTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask(), newGlobalBusinessRuleTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobalBusinessRuleTask(GlobalBusinessRuleTask newGlobalBusinessRuleTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask(), newGlobalBusinessRuleTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalChoreographyTask getGlobalChoreographyTask() {
        return (GlobalChoreographyTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobalChoreographyTask(GlobalChoreographyTask newGlobalChoreographyTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask(), newGlobalChoreographyTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobalChoreographyTask(GlobalChoreographyTask newGlobalChoreographyTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask(), newGlobalChoreographyTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalCommunication getGlobalCommunication() {
        return (GlobalCommunication) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalCommunication(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobalCommunication(GlobalCommunication newGlobalCommunication, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalCommunication(), newGlobalCommunication, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobalCommunication(GlobalCommunication newGlobalCommunication) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalCommunication(), newGlobalCommunication);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalManualTask getGlobalManualTask() {
        return (GlobalManualTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalManualTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobalManualTask(GlobalManualTask newGlobalManualTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalManualTask(), newGlobalManualTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobalManualTask(GlobalManualTask newGlobalManualTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalManualTask(), newGlobalManualTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalScriptTask getGlobalScriptTask() {
        return (GlobalScriptTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobalScriptTask(GlobalScriptTask newGlobalScriptTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask(), newGlobalScriptTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobalScriptTask(GlobalScriptTask newGlobalScriptTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask(), newGlobalScriptTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalTask getGlobalTask() {
        return (GlobalTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobalTask(GlobalTask newGlobalTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(), newGlobalTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobalTask(GlobalTask newGlobalTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(), newGlobalTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalUserTask getGlobalUserTask() {
        return (GlobalUserTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalUserTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGlobalUserTask(GlobalUserTask newGlobalUserTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalUserTask(), newGlobalUserTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGlobalUserTask(GlobalUserTask newGlobalUserTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_GlobalUserTask(), newGlobalUserTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Group getGroup() {
        return (Group) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Group(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Group(), newGroup, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(Group newGroup) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Group(), newGroup);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumanPerformer getHumanPerformer() {
        return (HumanPerformer) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_HumanPerformer(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHumanPerformer(HumanPerformer newHumanPerformer, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_HumanPerformer(), newHumanPerformer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHumanPerformer(HumanPerformer newHumanPerformer) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_HumanPerformer(), newHumanPerformer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Performer getPerformer() {
        return (Performer) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Performer(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPerformer(Performer newPerformer, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Performer(), newPerformer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPerformer(Performer newPerformer) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Performer(), newPerformer);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplicitThrowEvent getImplicitThrowEvent() {
        return (ImplicitThrowEvent) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetImplicitThrowEvent(ImplicitThrowEvent newImplicitThrowEvent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent(), newImplicitThrowEvent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImplicitThrowEvent(ImplicitThrowEvent newImplicitThrowEvent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent(), newImplicitThrowEvent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Import getImport() {
        return (Import) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Import(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetImport(Import newImport, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Import(), newImport, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImport(Import newImport) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Import(), newImport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InclusiveGateway getInclusiveGateway() {
        return (InclusiveGateway) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_InclusiveGateway(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInclusiveGateway(InclusiveGateway newInclusiveGateway, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_InclusiveGateway(), newInclusiveGateway, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInclusiveGateway(InclusiveGateway newInclusiveGateway) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_InclusiveGateway(), newInclusiveGateway);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputSet getInputSet() {
        return (InputSet) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_InputSet(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputSet(InputSet newInputSet, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_InputSet(), newInputSet, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputSet(InputSet newInputSet) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_InputSet(), newInputSet);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface getInterface() {
        return (Interface) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Interface(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Interface(), newInterface, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterface(Interface newInterface) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Interface(), newInterface);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateCatchEvent getIntermediateCatchEvent() {
        return (IntermediateCatchEvent) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIntermediateCatchEvent(IntermediateCatchEvent newIntermediateCatchEvent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent(), newIntermediateCatchEvent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIntermediateCatchEvent(IntermediateCatchEvent newIntermediateCatchEvent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent(), newIntermediateCatchEvent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateThrowEvent getIntermediateThrowEvent() {
        return (IntermediateThrowEvent) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIntermediateThrowEvent(IntermediateThrowEvent newIntermediateThrowEvent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent(), newIntermediateThrowEvent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIntermediateThrowEvent(IntermediateThrowEvent newIntermediateThrowEvent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent(), newIntermediateThrowEvent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputOutputBinding getIoBinding() {
        return (InputOutputBinding) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_IoBinding(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIoBinding(InputOutputBinding newIoBinding, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_IoBinding(), newIoBinding, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIoBinding(InputOutputBinding newIoBinding) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_IoBinding(), newIoBinding);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputOutputSpecification getIoSpecification() {
        return (InputOutputSpecification) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_IoSpecification(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIoSpecification(InputOutputSpecification newIoSpecification, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_IoSpecification(), newIoSpecification, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIoSpecification(InputOutputSpecification newIoSpecification) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_IoSpecification(), newIoSpecification);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemDefinition getItemDefinition() {
        return (ItemDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ItemDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetItemDefinition(ItemDefinition newItemDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ItemDefinition(), newItemDefinition, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setItemDefinition(ItemDefinition newItemDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ItemDefinition(), newItemDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Lane getLane() {
        return (Lane) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Lane(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLane(Lane newLane, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Lane(), newLane, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLane(Lane newLane) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Lane(), newLane);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LaneSet getLaneSet() {
        return (LaneSet) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_LaneSet(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLaneSet(LaneSet newLaneSet, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_LaneSet(), newLaneSet, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLaneSet(LaneSet newLaneSet) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_LaneSet(), newLaneSet);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkEventDefinition getLinkEventDefinition() {
        return (LinkEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLinkEventDefinition(LinkEventDefinition newLinkEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition(), newLinkEventDefinition, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLinkEventDefinition(LinkEventDefinition newLinkEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition(), newLinkEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoopCharacteristics getLoopCharacteristics() {
        return (LoopCharacteristics) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_LoopCharacteristics(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopCharacteristics(LoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_LoopCharacteristics(), newLoopCharacteristics, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoopCharacteristics(LoopCharacteristics newLoopCharacteristics) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_LoopCharacteristics(), newLoopCharacteristics);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManualTask getManualTask() {
        return (ManualTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ManualTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManualTask(ManualTask newManualTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ManualTask(), newManualTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setManualTask(ManualTask newManualTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ManualTask(), newManualTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message getMessage() {
        return (Message) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Message(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Message(), newMessage, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessage(Message newMessage) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Message(), newMessage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageEventDefinition getMessageEventDefinition() {
        return (MessageEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageEventDefinition(MessageEventDefinition newMessageEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition(), newMessageEventDefinition, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageEventDefinition(MessageEventDefinition newMessageEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition(), newMessageEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageFlow getMessageFlow() {
        return (MessageFlow) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_MessageFlow(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageFlow(MessageFlow newMessageFlow, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_MessageFlow(), newMessageFlow, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageFlow(MessageFlow newMessageFlow) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_MessageFlow(), newMessageFlow);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageFlowAssociation getMessageFlowAssociation() {
        return (MessageFlowAssociation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_MessageFlowAssociation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageFlowAssociation(MessageFlowAssociation newMessageFlowAssociation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_MessageFlowAssociation(), newMessageFlowAssociation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageFlowAssociation(MessageFlowAssociation newMessageFlowAssociation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_MessageFlowAssociation(), newMessageFlowAssociation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Monitoring getMonitoring() {
        return (Monitoring) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Monitoring(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMonitoring(Monitoring newMonitoring, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Monitoring(), newMonitoring, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMonitoring(Monitoring newMonitoring) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Monitoring(), newMonitoring);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceLoopCharacteristics getMultiInstanceLoopCharacteristics() {
        return (MultiInstanceLoopCharacteristics) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics newMultiInstanceLoopCharacteristics,
            NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics(),
                newMultiInstanceLoopCharacteristics, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics newMultiInstanceLoopCharacteristics) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics(), newMultiInstanceLoopCharacteristics);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getOperation() {
        return (Operation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Operation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Operation(), newOperation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation(Operation newOperation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Operation(), newOperation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputSet getOutputSet() {
        return (OutputSet) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_OutputSet(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputSet(OutputSet newOutputSet, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_OutputSet(), newOutputSet, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputSet(OutputSet newOutputSet) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_OutputSet(), newOutputSet);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParallelGateway getParallelGateway() {
        return (ParallelGateway) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ParallelGateway(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParallelGateway(ParallelGateway newParallelGateway, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ParallelGateway(), newParallelGateway, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParallelGateway(ParallelGateway newParallelGateway) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ParallelGateway(), newParallelGateway);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Participant getParticipant() {
        return (Participant) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Participant(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipant(Participant newParticipant, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Participant(), newParticipant, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParticipant(Participant newParticipant) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Participant(), newParticipant);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantAssociation getParticipantAssociation() {
        return (ParticipantAssociation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ParticipantAssociation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipantAssociation(ParticipantAssociation newParticipantAssociation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ParticipantAssociation(), newParticipantAssociation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParticipantAssociation(ParticipantAssociation newParticipantAssociation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ParticipantAssociation(), newParticipantAssociation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantMultiplicity getParticipantMultiplicity() {
        return (ParticipantMultiplicity) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ParticipantMultiplicity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipantMultiplicity(ParticipantMultiplicity newParticipantMultiplicity, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ParticipantMultiplicity(), newParticipantMultiplicity, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParticipantMultiplicity(ParticipantMultiplicity newParticipantMultiplicity) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ParticipantMultiplicity(), newParticipantMultiplicity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartnerEntity getPartnerEntity() {
        return (PartnerEntity) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_PartnerEntity(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPartnerEntity(PartnerEntity newPartnerEntity, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_PartnerEntity(), newPartnerEntity, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPartnerEntity(PartnerEntity newPartnerEntity) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_PartnerEntity(), newPartnerEntity);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartnerRole getPartnerRole() {
        return (PartnerRole) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_PartnerRole(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPartnerRole(PartnerRole newPartnerRole, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_PartnerRole(), newPartnerRole, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPartnerRole(PartnerRole newPartnerRole) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_PartnerRole(), newPartnerRole);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PotentialOwner getPotentialOwner() {
        return (PotentialOwner) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_PotentialOwner(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPotentialOwner(PotentialOwner newPotentialOwner, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_PotentialOwner(), newPotentialOwner, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPotentialOwner(PotentialOwner newPotentialOwner) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_PotentialOwner(), newPotentialOwner);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.bpmn.Process getProcess() {
        return (org.eclipse.bpmn.Process) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Process(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProcess(org.eclipse.bpmn.Process newProcess, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Process(), newProcess, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcess(org.eclipse.bpmn.Process newProcess) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Process(), newProcess);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property getProperty() {
        return (Property) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Property(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Property(), newProperty, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperty(Property newProperty) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Property(), newProperty);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReceiveTask getReceiveTask() {
        return (ReceiveTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ReceiveTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReceiveTask(ReceiveTask newReceiveTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ReceiveTask(), newReceiveTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReceiveTask(ReceiveTask newReceiveTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ReceiveTask(), newReceiveTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Relationship getRelationship() {
        return (Relationship) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Relationship(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRelationship(Relationship newRelationship, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Relationship(), newRelationship, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRelationship(Relationship newRelationship) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Relationship(), newRelationship);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rendering getRendering() {
        return (Rendering) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Rendering(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRendering(Rendering newRendering, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Rendering(), newRendering, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRendering(Rendering newRendering) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Rendering(), newRendering);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Resource getResource() {
        return (Resource) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Resource(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Resource(), newResource, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResource(Resource newResource) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Resource(), newResource);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceAssignmentExpression getResourceAssignmentExpression() {
        return (ResourceAssignmentExpression) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression(),
                newResourceAssignmentExpression, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourceAssignmentExpression(ResourceAssignmentExpression newResourceAssignmentExpression) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression(), newResourceAssignmentExpression);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceParameter getResourceParameter() {
        return (ResourceParameter) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ResourceParameter(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResourceParameter(ResourceParameter newResourceParameter, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ResourceParameter(), newResourceParameter, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourceParameter(ResourceParameter newResourceParameter) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ResourceParameter(), newResourceParameter);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceParameterBinding getResourceParameterBinding() {
        return (ResourceParameterBinding) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ResourceParameterBinding(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResourceParameterBinding(ResourceParameterBinding newResourceParameterBinding, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ResourceParameterBinding(), newResourceParameterBinding, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResourceParameterBinding(ResourceParameterBinding newResourceParameterBinding) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ResourceParameterBinding(), newResourceParameterBinding);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getScript() {
        return (Script) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Script(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScript(Script newScript, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Script(), newScript, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScript(Script newScript) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Script(), newScript);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptTask getScriptTask() {
        return (ScriptTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ScriptTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScriptTask(ScriptTask newScriptTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ScriptTask(), newScriptTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScriptTask(ScriptTask newScriptTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ScriptTask(), newScriptTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SendTask getSendTask() {
        return (SendTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_SendTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSendTask(SendTask newSendTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_SendTask(), newSendTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendTask(SendTask newSendTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_SendTask(), newSendTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceFlow getSequenceFlow() {
        return (SequenceFlow) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_SequenceFlow(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSequenceFlow(SequenceFlow newSequenceFlow, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_SequenceFlow(), newSequenceFlow, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequenceFlow(SequenceFlow newSequenceFlow) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_SequenceFlow(), newSequenceFlow);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceTask getServiceTask() {
        return (ServiceTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ServiceTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceTask(ServiceTask newServiceTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ServiceTask(), newServiceTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServiceTask(ServiceTask newServiceTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ServiceTask(), newServiceTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal getSignal() {
        return (Signal) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Signal(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSignal(Signal newSignal, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Signal(), newSignal, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSignal(Signal newSignal) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Signal(), newSignal);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SignalEventDefinition getSignalEventDefinition() {
        return (SignalEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSignalEventDefinition(SignalEventDefinition newSignalEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition(), newSignalEventDefinition, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSignalEventDefinition(SignalEventDefinition newSignalEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition(), newSignalEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StandardLoopCharacteristics getStandardLoopCharacteristics() {
        return (StandardLoopCharacteristics) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStandardLoopCharacteristics(StandardLoopCharacteristics newStandardLoopCharacteristics, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics(), newStandardLoopCharacteristics,
                msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStandardLoopCharacteristics(StandardLoopCharacteristics newStandardLoopCharacteristics) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics(), newStandardLoopCharacteristics);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartEvent getStartEvent() {
        return (StartEvent) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_StartEvent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStartEvent(StartEvent newStartEvent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_StartEvent(), newStartEvent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartEvent(StartEvent newStartEvent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_StartEvent(), newStartEvent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubConversation getSubConversation() {
        return (SubConversation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_SubConversation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubConversation(SubConversation newSubConversation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_SubConversation(), newSubConversation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubConversation(SubConversation newSubConversation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_SubConversation(), newSubConversation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubProcess getSubProcess() {
        return (SubProcess) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_SubProcess(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubProcess(SubProcess newSubProcess, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_SubProcess(), newSubProcess, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubProcess(SubProcess newSubProcess) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_SubProcess(), newSubProcess);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task getTask() {
        return (Task) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Task(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Task(), newTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTask(Task newTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Task(), newTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TerminateEventDefinition getTerminateEventDefinition() {
        return (TerminateEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_TerminateEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminateEventDefinition(TerminateEventDefinition newTerminateEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_TerminateEventDefinition(), newTerminateEventDefinition, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTerminateEventDefinition(TerminateEventDefinition newTerminateEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_TerminateEventDefinition(), newTerminateEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Text getText() {
        return (Text) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Text(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetText(Text newText, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Text(), newText, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setText(Text newText) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Text(), newText);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextAnnotation getTextAnnotation() {
        return (TextAnnotation) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_TextAnnotation(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTextAnnotation(TextAnnotation newTextAnnotation, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_TextAnnotation(), newTextAnnotation, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTextAnnotation(TextAnnotation newTextAnnotation) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_TextAnnotation(), newTextAnnotation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ThrowEvent getThrowEvent() {
        return (ThrowEvent) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_ThrowEvent(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThrowEvent(ThrowEvent newThrowEvent, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_ThrowEvent(), newThrowEvent, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThrowEvent(ThrowEvent newThrowEvent) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_ThrowEvent(), newThrowEvent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimerEventDefinition getTimerEventDefinition() {
        return (TimerEventDefinition) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimerEventDefinition(TimerEventDefinition newTimerEventDefinition, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition(), newTimerEventDefinition, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimerEventDefinition(TimerEventDefinition newTimerEventDefinition) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition(), newTimerEventDefinition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Transaction getTransaction() {
        return (Transaction) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_Transaction(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransaction(Transaction newTransaction, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_Transaction(), newTransaction, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransaction(Transaction newTransaction) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_Transaction(), newTransaction);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTask getUserTask() {
        return (UserTask) getMixed().get(BpmnPackage.eINSTANCE.getDocumentRoot_UserTask(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUserTask(UserTask newUserTask, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(BpmnPackage.eINSTANCE.getDocumentRoot_UserTask(), newUserTask, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUserTask(UserTask newUserTask) {
        ((FeatureMap.Internal) getMixed()).set(BpmnPackage.eINSTANCE.getDocumentRoot_UserTask(), newUserTask);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.DOCUMENT_ROOT__MIXED:
            return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
        case BpmnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return ((InternalEList<?>) ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap()).basicRemove(otherEnd, msgs);
        case BpmnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return ((InternalEList<?>) ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap()).basicRemove(otherEnd, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY:
            return basicSetActivity(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY_RESOURCE:
            return basicSetActivityResource(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
            return basicSetAdHocSubProcess(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
            return basicSetFlowElement(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ARTIFACT:
            return basicSetArtifact(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ASSIGNMENT:
            return basicSetAssignment(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ASSOCIATION:
            return basicSetAssociation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__AUDITING:
            return basicSetAuditing(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
            return basicSetBaseElement(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
            return basicSetBaseElementWithMixedContent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
            return basicSetBoundaryEvent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
            return basicSetBusinessRuleTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
            return basicSetCallableElement(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
            return basicSetCallActivity(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY_ACTIVITY:
            return basicSetCallChoreographyActivity(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
            return basicSetCallConversation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
            return basicSetConversationNode(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
            return basicSetCancelEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
            return basicSetEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
            return basicSetRootElement(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CATCH_EVENT:
            return basicSetCatchEvent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY:
            return basicSetCategory(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
            return basicSetCategoryValue(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
            return basicSetChoreography(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
            return basicSetChoreographyActivity(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_SUB_PROCESS:
            return basicSetChoreographySubProcess(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
            return basicSetChoreographyTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__COLLABORATION:
            return basicSetCollaboration(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__COMMUNICATION:
            return basicSetCommunication(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
            return basicSetCompensateEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
            return basicSetComplexBehaviorDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
            return basicSetComplexGateway(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
            return basicSetConditionalEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION:
            return basicSetConversation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
            return basicSetConversationAssociation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_KEY:
            return basicSetCorrelationKey(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
            return basicSetCorrelationProperty(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
            return basicSetCorrelationPropertyBinding(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return basicSetCorrelationPropertyRetrievalExpression(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
            return basicSetCorrelationSubscription(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
            return basicSetDataAssociation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT:
            return basicSetDataInput(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
            return basicSetDataInputAssociation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DATA_OBJECT:
            return basicSetDataObject(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
            return basicSetDataOutput(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
            return basicSetDataOutputAssociation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DATA_STATE:
            return basicSetDataState(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE:
            return basicSetDataStore(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
            return basicSetDataStoreReference(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DEFINITIONS:
            return basicSetDefinitions(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__DOCUMENTATION:
            return basicSetDocumentation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__END_EVENT:
            return basicSetEndEvent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__END_POINT:
            return basicSetEndPoint(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ERROR:
            return basicSetError(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
            return basicSetErrorEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION:
            return basicSetEscalation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
            return basicSetEscalationEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__EVENT:
            return basicSetEvent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
            return basicSetEventBasedGateway(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
            return basicSetExclusiveGateway(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__EXPRESSION:
            return basicSetExpression(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__EXTENSION:
            return basicSetExtension(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__FLOW_NODE:
            return basicSetFlowNode(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
            return basicSetFormalExpression(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__GATEWAY:
            return basicSetGateway(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
            return basicSetGlobalBusinessRuleTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
            return basicSetGlobalChoreographyTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_COMMUNICATION:
            return basicSetGlobalCommunication(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
            return basicSetGlobalManualTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
            return basicSetGlobalScriptTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_TASK:
            return basicSetGlobalTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
            return basicSetGlobalUserTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__GROUP:
            return basicSetGroup(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
            return basicSetHumanPerformer(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__PERFORMER:
            return basicSetPerformer(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
            return basicSetImplicitThrowEvent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__IMPORT:
            return basicSetImport(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
            return basicSetInclusiveGateway(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__INPUT_SET:
            return basicSetInputSet(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__INTERFACE:
            return basicSetInterface(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
            return basicSetIntermediateCatchEvent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
            return basicSetIntermediateThrowEvent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__IO_BINDING:
            return basicSetIoBinding(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
            return basicSetIoSpecification(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
            return basicSetItemDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__LANE:
            return basicSetLane(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__LANE_SET:
            return basicSetLaneSet(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
            return basicSetLinkEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
            return basicSetLoopCharacteristics(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__MANUAL_TASK:
            return basicSetManualTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE:
            return basicSetMessage(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
            return basicSetMessageEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
            return basicSetMessageFlow(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
            return basicSetMessageFlowAssociation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__MONITORING:
            return basicSetMonitoring(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
            return basicSetMultiInstanceLoopCharacteristics(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__OPERATION:
            return basicSetOperation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__OUTPUT_SET:
            return basicSetOutputSet(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
            return basicSetParallelGateway(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT:
            return basicSetParticipant(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
            return basicSetParticipantAssociation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
            return basicSetParticipantMultiplicity(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
            return basicSetPartnerEntity(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ROLE:
            return basicSetPartnerRole(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
            return basicSetPotentialOwner(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__PROCESS:
            return basicSetProcess(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__PROPERTY:
            return basicSetProperty(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__RECEIVE_TASK:
            return basicSetReceiveTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__RELATIONSHIP:
            return basicSetRelationship(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__RENDERING:
            return basicSetRendering(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE:
            return basicSetResource(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
            return basicSetResourceAssignmentExpression(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
            return basicSetResourceParameter(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
            return basicSetResourceParameterBinding(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT:
            return basicSetScript(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT_TASK:
            return basicSetScriptTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__SEND_TASK:
            return basicSetSendTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
            return basicSetSequenceFlow(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__SERVICE_TASK:
            return basicSetServiceTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL:
            return basicSetSignal(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
            return basicSetSignalEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
            return basicSetStandardLoopCharacteristics(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__START_EVENT:
            return basicSetStartEvent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
            return basicSetSubConversation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__SUB_PROCESS:
            return basicSetSubProcess(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__TASK:
            return basicSetTask(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
            return basicSetTerminateEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__TEXT:
            return basicSetText(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
            return basicSetTextAnnotation(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__THROW_EVENT:
            return basicSetThrowEvent(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
            return basicSetTimerEventDefinition(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__TRANSACTION:
            return basicSetTransaction(null, msgs);
        case BpmnPackage.DOCUMENT_ROOT__USER_TASK:
            return basicSetUserTask(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.DOCUMENT_ROOT__MIXED:
            if (coreType)
                return getMixed();
            return ((FeatureMap.Internal) getMixed()).getWrapper();
        case BpmnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            if (coreType)
                return ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap();
            else
                return getXMLNSPrefixMap();
        case BpmnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            if (coreType)
                return ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap();
            else
                return getXSISchemaLocation();
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY:
            return getActivity();
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY_RESOURCE:
            return getActivityResource();
        case BpmnPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
            return getAdHocSubProcess();
        case BpmnPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
            return getFlowElement();
        case BpmnPackage.DOCUMENT_ROOT__ARTIFACT:
            return getArtifact();
        case BpmnPackage.DOCUMENT_ROOT__ASSIGNMENT:
            return getAssignment();
        case BpmnPackage.DOCUMENT_ROOT__ASSOCIATION:
            return getAssociation();
        case BpmnPackage.DOCUMENT_ROOT__AUDITING:
            return getAuditing();
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
            return getBaseElement();
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
            return getBaseElementWithMixedContent();
        case BpmnPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
            return getBoundaryEvent();
        case BpmnPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
            return getBusinessRuleTask();
        case BpmnPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
            return getCallableElement();
        case BpmnPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
            return getCallActivity();
        case BpmnPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY_ACTIVITY:
            return getCallChoreographyActivity();
        case BpmnPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
            return getCallConversation();
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
            return getConversationNode();
        case BpmnPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
            return getCancelEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
            return getEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
            return getRootElement();
        case BpmnPackage.DOCUMENT_ROOT__CATCH_EVENT:
            return getCatchEvent();
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY:
            return getCategory();
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
            return getCategoryValue();
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
            return getChoreography();
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
            return getChoreographyActivity();
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_SUB_PROCESS:
            return getChoreographySubProcess();
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
            return getChoreographyTask();
        case BpmnPackage.DOCUMENT_ROOT__COLLABORATION:
            return getCollaboration();
        case BpmnPackage.DOCUMENT_ROOT__COMMUNICATION:
            return getCommunication();
        case BpmnPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
            return getCompensateEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
            return getComplexBehaviorDefinition();
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
            return getComplexGateway();
        case BpmnPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
            return getConditionalEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION:
            return getConversation();
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
            return getConversationAssociation();
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_KEY:
            return getCorrelationKey();
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
            return getCorrelationProperty();
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
            return getCorrelationPropertyBinding();
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return getCorrelationPropertyRetrievalExpression();
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
            return getCorrelationSubscription();
        case BpmnPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
            return getDataAssociation();
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT:
            return getDataInput();
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
            return getDataInputAssociation();
        case BpmnPackage.DOCUMENT_ROOT__DATA_OBJECT:
            return getDataObject();
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
            return getDataOutput();
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
            return getDataOutputAssociation();
        case BpmnPackage.DOCUMENT_ROOT__DATA_STATE:
            return getDataState();
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE:
            return getDataStore();
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
            return getDataStoreReference();
        case BpmnPackage.DOCUMENT_ROOT__DEFINITIONS:
            return getDefinitions();
        case BpmnPackage.DOCUMENT_ROOT__DOCUMENTATION:
            return getDocumentation();
        case BpmnPackage.DOCUMENT_ROOT__END_EVENT:
            return getEndEvent();
        case BpmnPackage.DOCUMENT_ROOT__END_POINT:
            return getEndPoint();
        case BpmnPackage.DOCUMENT_ROOT__ERROR:
            return getError();
        case BpmnPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
            return getErrorEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION:
            return getEscalation();
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
            return getEscalationEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__EVENT:
            return getEvent();
        case BpmnPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
            return getEventBasedGateway();
        case BpmnPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
            return getExclusiveGateway();
        case BpmnPackage.DOCUMENT_ROOT__EXPRESSION:
            return getExpression();
        case BpmnPackage.DOCUMENT_ROOT__EXTENSION:
            return getExtension();
        case BpmnPackage.DOCUMENT_ROOT__FLOW_NODE:
            return getFlowNode();
        case BpmnPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
            return getFormalExpression();
        case BpmnPackage.DOCUMENT_ROOT__GATEWAY:
            return getGateway();
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
            return getGlobalBusinessRuleTask();
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
            return getGlobalChoreographyTask();
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_COMMUNICATION:
            return getGlobalCommunication();
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
            return getGlobalManualTask();
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
            return getGlobalScriptTask();
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_TASK:
            return getGlobalTask();
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
            return getGlobalUserTask();
        case BpmnPackage.DOCUMENT_ROOT__GROUP:
            return getGroup();
        case BpmnPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
            return getHumanPerformer();
        case BpmnPackage.DOCUMENT_ROOT__PERFORMER:
            return getPerformer();
        case BpmnPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
            return getImplicitThrowEvent();
        case BpmnPackage.DOCUMENT_ROOT__IMPORT:
            return getImport();
        case BpmnPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
            return getInclusiveGateway();
        case BpmnPackage.DOCUMENT_ROOT__INPUT_SET:
            return getInputSet();
        case BpmnPackage.DOCUMENT_ROOT__INTERFACE:
            return getInterface();
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
            return getIntermediateCatchEvent();
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
            return getIntermediateThrowEvent();
        case BpmnPackage.DOCUMENT_ROOT__IO_BINDING:
            return getIoBinding();
        case BpmnPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
            return getIoSpecification();
        case BpmnPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
            return getItemDefinition();
        case BpmnPackage.DOCUMENT_ROOT__LANE:
            return getLane();
        case BpmnPackage.DOCUMENT_ROOT__LANE_SET:
            return getLaneSet();
        case BpmnPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
            return getLinkEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
            return getLoopCharacteristics();
        case BpmnPackage.DOCUMENT_ROOT__MANUAL_TASK:
            return getManualTask();
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE:
            return getMessage();
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
            return getMessageEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
            return getMessageFlow();
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
            return getMessageFlowAssociation();
        case BpmnPackage.DOCUMENT_ROOT__MONITORING:
            return getMonitoring();
        case BpmnPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
            return getMultiInstanceLoopCharacteristics();
        case BpmnPackage.DOCUMENT_ROOT__OPERATION:
            return getOperation();
        case BpmnPackage.DOCUMENT_ROOT__OUTPUT_SET:
            return getOutputSet();
        case BpmnPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
            return getParallelGateway();
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT:
            return getParticipant();
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
            return getParticipantAssociation();
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
            return getParticipantMultiplicity();
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
            return getPartnerEntity();
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ROLE:
            return getPartnerRole();
        case BpmnPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
            return getPotentialOwner();
        case BpmnPackage.DOCUMENT_ROOT__PROCESS:
            return getProcess();
        case BpmnPackage.DOCUMENT_ROOT__PROPERTY:
            return getProperty();
        case BpmnPackage.DOCUMENT_ROOT__RECEIVE_TASK:
            return getReceiveTask();
        case BpmnPackage.DOCUMENT_ROOT__RELATIONSHIP:
            return getRelationship();
        case BpmnPackage.DOCUMENT_ROOT__RENDERING:
            return getRendering();
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE:
            return getResource();
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
            return getResourceAssignmentExpression();
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
            return getResourceParameter();
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
            return getResourceParameterBinding();
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT:
            return getScript();
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT_TASK:
            return getScriptTask();
        case BpmnPackage.DOCUMENT_ROOT__SEND_TASK:
            return getSendTask();
        case BpmnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
            return getSequenceFlow();
        case BpmnPackage.DOCUMENT_ROOT__SERVICE_TASK:
            return getServiceTask();
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL:
            return getSignal();
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
            return getSignalEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
            return getStandardLoopCharacteristics();
        case BpmnPackage.DOCUMENT_ROOT__START_EVENT:
            return getStartEvent();
        case BpmnPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
            return getSubConversation();
        case BpmnPackage.DOCUMENT_ROOT__SUB_PROCESS:
            return getSubProcess();
        case BpmnPackage.DOCUMENT_ROOT__TASK:
            return getTask();
        case BpmnPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
            return getTerminateEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__TEXT:
            return getText();
        case BpmnPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
            return getTextAnnotation();
        case BpmnPackage.DOCUMENT_ROOT__THROW_EVENT:
            return getThrowEvent();
        case BpmnPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
            return getTimerEventDefinition();
        case BpmnPackage.DOCUMENT_ROOT__TRANSACTION:
            return getTransaction();
        case BpmnPackage.DOCUMENT_ROOT__USER_TASK:
            return getUserTask();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case BpmnPackage.DOCUMENT_ROOT__MIXED:
            ((FeatureMap.Internal) getMixed()).set(newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            ((EStructuralFeature.Setting) ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap()).set(newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            ((EStructuralFeature.Setting) ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap()).set(newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY:
            setActivity((Activity) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY_RESOURCE:
            setActivityResource((ActivityResource) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
            setAdHocSubProcess((AdHocSubProcess) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
            setFlowElement((FlowElement) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ARTIFACT:
            setArtifact((Artifact) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ASSIGNMENT:
            setAssignment((Assignment) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ASSOCIATION:
            setAssociation((Association) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__AUDITING:
            setAuditing((Auditing) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
            setBaseElement((BaseElement) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
            setBaseElementWithMixedContent((BaseElementWithMixedContent) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
            setBoundaryEvent((BoundaryEvent) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
            setBusinessRuleTask((BusinessRuleTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
            setCallableElement((CallableElement) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
            setCallActivity((CallActivity) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY_ACTIVITY:
            setCallChoreographyActivity((CallChoreographyActivity) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
            setCallConversation((CallConversation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
            setConversationNode((ConversationNode) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
            setCancelEventDefinition((CancelEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
            setEventDefinition((EventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
            setRootElement((RootElement) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CATCH_EVENT:
            setCatchEvent((CatchEvent) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY:
            setCategory((Category) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
            setCategoryValue((CategoryValue) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
            setChoreography((Choreography) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
            setChoreographyActivity((ChoreographyActivity) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_SUB_PROCESS:
            setChoreographySubProcess((ChoreographySubProcess) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
            setChoreographyTask((ChoreographyTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COLLABORATION:
            setCollaboration((Collaboration) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COMMUNICATION:
            setCommunication((Communication) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
            setCompensateEventDefinition((CompensateEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
            setComplexBehaviorDefinition((ComplexBehaviorDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
            setComplexGateway((ComplexGateway) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
            setConditionalEventDefinition((ConditionalEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION:
            setConversation((Conversation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
            setConversationAssociation((ConversationAssociation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_KEY:
            setCorrelationKey((CorrelationKey) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
            setCorrelationProperty((CorrelationProperty) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
            setCorrelationPropertyBinding((CorrelationPropertyBinding) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            setCorrelationPropertyRetrievalExpression((CorrelationPropertyRetrievalExpression) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
            setCorrelationSubscription((CorrelationSubscription) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
            setDataAssociation((DataAssociation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT:
            setDataInput((DataInput) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
            setDataInputAssociation((DataInputAssociation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_OBJECT:
            setDataObject((DataObject) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
            setDataOutput((DataOutput) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
            setDataOutputAssociation((DataOutputAssociation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_STATE:
            setDataState((DataState) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE:
            setDataStore((DataStore) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
            setDataStoreReference((DataStoreReference) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DEFINITIONS:
            setDefinitions((Definitions) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DOCUMENTATION:
            setDocumentation((Documentation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__END_EVENT:
            setEndEvent((EndEvent) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__END_POINT:
            setEndPoint((EndPoint) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ERROR:
            setError((org.eclipse.bpmn.Error) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
            setErrorEventDefinition((ErrorEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION:
            setEscalation((Escalation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
            setEscalationEventDefinition((EscalationEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EVENT:
            setEvent((Event) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
            setEventBasedGateway((EventBasedGateway) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
            setExclusiveGateway((ExclusiveGateway) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EXPRESSION:
            setExpression((Expression) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EXTENSION:
            setExtension((Extension) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__FLOW_NODE:
            setFlowNode((FlowNode) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
            setFormalExpression((FormalExpression) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
            setGlobalBusinessRuleTask((GlobalBusinessRuleTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
            setGlobalChoreographyTask((GlobalChoreographyTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_COMMUNICATION:
            setGlobalCommunication((GlobalCommunication) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
            setGlobalManualTask((GlobalManualTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
            setGlobalScriptTask((GlobalScriptTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_TASK:
            setGlobalTask((GlobalTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
            setGlobalUserTask((GlobalUserTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GROUP:
            setGroup((Group) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
            setHumanPerformer((HumanPerformer) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PERFORMER:
            setPerformer((Performer) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
            setImplicitThrowEvent((ImplicitThrowEvent) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__IMPORT:
            setImport((Import) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
            setInclusiveGateway((InclusiveGateway) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INPUT_SET:
            setInputSet((InputSet) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INTERFACE:
            setInterface((Interface) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
            setIntermediateCatchEvent((IntermediateCatchEvent) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
            setIntermediateThrowEvent((IntermediateThrowEvent) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__IO_BINDING:
            setIoBinding((InputOutputBinding) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
            setIoSpecification((InputOutputSpecification) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
            setItemDefinition((ItemDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__LANE:
            setLane((Lane) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__LANE_SET:
            setLaneSet((LaneSet) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
            setLinkEventDefinition((LinkEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
            setLoopCharacteristics((LoopCharacteristics) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MANUAL_TASK:
            setManualTask((ManualTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE:
            setMessage((Message) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
            setMessageEventDefinition((MessageEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
            setMessageFlow((MessageFlow) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
            setMessageFlowAssociation((MessageFlowAssociation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MONITORING:
            setMonitoring((Monitoring) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
            setMultiInstanceLoopCharacteristics((MultiInstanceLoopCharacteristics) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__OPERATION:
            setOperation((Operation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__OUTPUT_SET:
            setOutputSet((OutputSet) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
            setParallelGateway((ParallelGateway) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT:
            setParticipant((Participant) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
            setParticipantAssociation((ParticipantAssociation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
            setParticipantMultiplicity((ParticipantMultiplicity) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
            setPartnerEntity((PartnerEntity) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ROLE:
            setPartnerRole((PartnerRole) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
            setPotentialOwner((PotentialOwner) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PROCESS:
            setProcess((org.eclipse.bpmn.Process) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PROPERTY:
            setProperty((Property) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RECEIVE_TASK:
            setReceiveTask((ReceiveTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RELATIONSHIP:
            setRelationship((Relationship) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RENDERING:
            setRendering((Rendering) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE:
            setResource((Resource) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
            setResourceAssignmentExpression((ResourceAssignmentExpression) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
            setResourceParameter((ResourceParameter) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
            setResourceParameterBinding((ResourceParameterBinding) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT:
            setScript((Script) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT_TASK:
            setScriptTask((ScriptTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SEND_TASK:
            setSendTask((SendTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
            setSequenceFlow((SequenceFlow) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SERVICE_TASK:
            setServiceTask((ServiceTask) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL:
            setSignal((Signal) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
            setSignalEventDefinition((SignalEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
            setStandardLoopCharacteristics((StandardLoopCharacteristics) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__START_EVENT:
            setStartEvent((StartEvent) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
            setSubConversation((SubConversation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SUB_PROCESS:
            setSubProcess((SubProcess) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TASK:
            setTask((Task) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
            setTerminateEventDefinition((TerminateEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TEXT:
            setText((Text) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
            setTextAnnotation((TextAnnotation) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__THROW_EVENT:
            setThrowEvent((ThrowEvent) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
            setTimerEventDefinition((TimerEventDefinition) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TRANSACTION:
            setTransaction((Transaction) newValue);
            return;
        case BpmnPackage.DOCUMENT_ROOT__USER_TASK:
            setUserTask((UserTask) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case BpmnPackage.DOCUMENT_ROOT__MIXED:
            getMixed().clear();
            return;
        case BpmnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            getXMLNSPrefixMap().clear();
            return;
        case BpmnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            getXSISchemaLocation().clear();
            return;
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY:
            setActivity((Activity) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY_RESOURCE:
            setActivityResource((ActivityResource) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
            setAdHocSubProcess((AdHocSubProcess) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
            setFlowElement((FlowElement) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ARTIFACT:
            setArtifact((Artifact) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ASSIGNMENT:
            setAssignment((Assignment) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ASSOCIATION:
            setAssociation((Association) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__AUDITING:
            setAuditing((Auditing) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
            setBaseElement((BaseElement) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
            setBaseElementWithMixedContent((BaseElementWithMixedContent) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
            setBoundaryEvent((BoundaryEvent) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
            setBusinessRuleTask((BusinessRuleTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
            setCallableElement((CallableElement) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
            setCallActivity((CallActivity) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY_ACTIVITY:
            setCallChoreographyActivity((CallChoreographyActivity) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
            setCallConversation((CallConversation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
            setConversationNode((ConversationNode) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
            setCancelEventDefinition((CancelEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
            setEventDefinition((EventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
            setRootElement((RootElement) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CATCH_EVENT:
            setCatchEvent((CatchEvent) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY:
            setCategory((Category) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
            setCategoryValue((CategoryValue) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
            setChoreography((Choreography) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
            setChoreographyActivity((ChoreographyActivity) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_SUB_PROCESS:
            setChoreographySubProcess((ChoreographySubProcess) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
            setChoreographyTask((ChoreographyTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COLLABORATION:
            setCollaboration((Collaboration) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COMMUNICATION:
            setCommunication((Communication) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
            setCompensateEventDefinition((CompensateEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
            setComplexBehaviorDefinition((ComplexBehaviorDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
            setComplexGateway((ComplexGateway) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
            setConditionalEventDefinition((ConditionalEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION:
            setConversation((Conversation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
            setConversationAssociation((ConversationAssociation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_KEY:
            setCorrelationKey((CorrelationKey) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
            setCorrelationProperty((CorrelationProperty) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
            setCorrelationPropertyBinding((CorrelationPropertyBinding) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            setCorrelationPropertyRetrievalExpression((CorrelationPropertyRetrievalExpression) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
            setCorrelationSubscription((CorrelationSubscription) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
            setDataAssociation((DataAssociation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT:
            setDataInput((DataInput) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
            setDataInputAssociation((DataInputAssociation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_OBJECT:
            setDataObject((DataObject) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
            setDataOutput((DataOutput) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
            setDataOutputAssociation((DataOutputAssociation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_STATE:
            setDataState((DataState) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE:
            setDataStore((DataStore) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
            setDataStoreReference((DataStoreReference) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DEFINITIONS:
            setDefinitions((Definitions) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__DOCUMENTATION:
            setDocumentation((Documentation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__END_EVENT:
            setEndEvent((EndEvent) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__END_POINT:
            setEndPoint((EndPoint) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ERROR:
            setError((org.eclipse.bpmn.Error) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
            setErrorEventDefinition((ErrorEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION:
            setEscalation((Escalation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
            setEscalationEventDefinition((EscalationEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EVENT:
            setEvent((Event) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
            setEventBasedGateway((EventBasedGateway) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
            setExclusiveGateway((ExclusiveGateway) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EXPRESSION:
            setExpression((Expression) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__EXTENSION:
            setExtension((Extension) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__FLOW_NODE:
            setFlowNode((FlowNode) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
            setFormalExpression((FormalExpression) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
            setGlobalBusinessRuleTask((GlobalBusinessRuleTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
            setGlobalChoreographyTask((GlobalChoreographyTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_COMMUNICATION:
            setGlobalCommunication((GlobalCommunication) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
            setGlobalManualTask((GlobalManualTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
            setGlobalScriptTask((GlobalScriptTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_TASK:
            setGlobalTask((GlobalTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
            setGlobalUserTask((GlobalUserTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__GROUP:
            setGroup((Group) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
            setHumanPerformer((HumanPerformer) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PERFORMER:
            setPerformer((Performer) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
            setImplicitThrowEvent((ImplicitThrowEvent) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__IMPORT:
            setImport((Import) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
            setInclusiveGateway((InclusiveGateway) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INPUT_SET:
            setInputSet((InputSet) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INTERFACE:
            setInterface((Interface) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
            setIntermediateCatchEvent((IntermediateCatchEvent) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
            setIntermediateThrowEvent((IntermediateThrowEvent) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__IO_BINDING:
            setIoBinding((InputOutputBinding) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
            setIoSpecification((InputOutputSpecification) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
            setItemDefinition((ItemDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__LANE:
            setLane((Lane) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__LANE_SET:
            setLaneSet((LaneSet) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
            setLinkEventDefinition((LinkEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
            setLoopCharacteristics((LoopCharacteristics) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MANUAL_TASK:
            setManualTask((ManualTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE:
            setMessage((Message) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
            setMessageEventDefinition((MessageEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
            setMessageFlow((MessageFlow) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
            setMessageFlowAssociation((MessageFlowAssociation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MONITORING:
            setMonitoring((Monitoring) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
            setMultiInstanceLoopCharacteristics((MultiInstanceLoopCharacteristics) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__OPERATION:
            setOperation((Operation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__OUTPUT_SET:
            setOutputSet((OutputSet) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
            setParallelGateway((ParallelGateway) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT:
            setParticipant((Participant) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
            setParticipantAssociation((ParticipantAssociation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
            setParticipantMultiplicity((ParticipantMultiplicity) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
            setPartnerEntity((PartnerEntity) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ROLE:
            setPartnerRole((PartnerRole) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
            setPotentialOwner((PotentialOwner) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PROCESS:
            setProcess((org.eclipse.bpmn.Process) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__PROPERTY:
            setProperty((Property) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RECEIVE_TASK:
            setReceiveTask((ReceiveTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RELATIONSHIP:
            setRelationship((Relationship) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RENDERING:
            setRendering((Rendering) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE:
            setResource((Resource) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
            setResourceAssignmentExpression((ResourceAssignmentExpression) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
            setResourceParameter((ResourceParameter) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
            setResourceParameterBinding((ResourceParameterBinding) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT:
            setScript((Script) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT_TASK:
            setScriptTask((ScriptTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SEND_TASK:
            setSendTask((SendTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
            setSequenceFlow((SequenceFlow) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SERVICE_TASK:
            setServiceTask((ServiceTask) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL:
            setSignal((Signal) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
            setSignalEventDefinition((SignalEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
            setStandardLoopCharacteristics((StandardLoopCharacteristics) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__START_EVENT:
            setStartEvent((StartEvent) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
            setSubConversation((SubConversation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__SUB_PROCESS:
            setSubProcess((SubProcess) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TASK:
            setTask((Task) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
            setTerminateEventDefinition((TerminateEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TEXT:
            setText((Text) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
            setTextAnnotation((TextAnnotation) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__THROW_EVENT:
            setThrowEvent((ThrowEvent) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
            setTimerEventDefinition((TimerEventDefinition) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__TRANSACTION:
            setTransaction((Transaction) null);
            return;
        case BpmnPackage.DOCUMENT_ROOT__USER_TASK:
            setUserTask((UserTask) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case BpmnPackage.DOCUMENT_ROOT__MIXED:
            return mixed != null && !mixed.isEmpty();
        case BpmnPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
        case BpmnPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY:
            return getActivity() != null;
        case BpmnPackage.DOCUMENT_ROOT__ACTIVITY_RESOURCE:
            return getActivityResource() != null;
        case BpmnPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
            return getAdHocSubProcess() != null;
        case BpmnPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
            return getFlowElement() != null;
        case BpmnPackage.DOCUMENT_ROOT__ARTIFACT:
            return getArtifact() != null;
        case BpmnPackage.DOCUMENT_ROOT__ASSIGNMENT:
            return getAssignment() != null;
        case BpmnPackage.DOCUMENT_ROOT__ASSOCIATION:
            return getAssociation() != null;
        case BpmnPackage.DOCUMENT_ROOT__AUDITING:
            return getAuditing() != null;
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
            return getBaseElement() != null;
        case BpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
            return getBaseElementWithMixedContent() != null;
        case BpmnPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
            return getBoundaryEvent() != null;
        case BpmnPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
            return getBusinessRuleTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
            return getCallableElement() != null;
        case BpmnPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
            return getCallActivity() != null;
        case BpmnPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY_ACTIVITY:
            return getCallChoreographyActivity() != null;
        case BpmnPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
            return getCallConversation() != null;
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
            return getConversationNode() != null;
        case BpmnPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
            return getCancelEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
            return getEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
            return getRootElement() != null;
        case BpmnPackage.DOCUMENT_ROOT__CATCH_EVENT:
            return getCatchEvent() != null;
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY:
            return getCategory() != null;
        case BpmnPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
            return getCategoryValue() != null;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
            return getChoreography() != null;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
            return getChoreographyActivity() != null;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_SUB_PROCESS:
            return getChoreographySubProcess() != null;
        case BpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
            return getChoreographyTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__COLLABORATION:
            return getCollaboration() != null;
        case BpmnPackage.DOCUMENT_ROOT__COMMUNICATION:
            return getCommunication() != null;
        case BpmnPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
            return getCompensateEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
            return getComplexBehaviorDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
            return getComplexGateway() != null;
        case BpmnPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
            return getConditionalEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION:
            return getConversation() != null;
        case BpmnPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
            return getConversationAssociation() != null;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_KEY:
            return getCorrelationKey() != null;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
            return getCorrelationProperty() != null;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
            return getCorrelationPropertyBinding() != null;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return getCorrelationPropertyRetrievalExpression() != null;
        case BpmnPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
            return getCorrelationSubscription() != null;
        case BpmnPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
            return getDataAssociation() != null;
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT:
            return getDataInput() != null;
        case BpmnPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
            return getDataInputAssociation() != null;
        case BpmnPackage.DOCUMENT_ROOT__DATA_OBJECT:
            return getDataObject() != null;
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
            return getDataOutput() != null;
        case BpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
            return getDataOutputAssociation() != null;
        case BpmnPackage.DOCUMENT_ROOT__DATA_STATE:
            return getDataState() != null;
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE:
            return getDataStore() != null;
        case BpmnPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
            return getDataStoreReference() != null;
        case BpmnPackage.DOCUMENT_ROOT__DEFINITIONS:
            return getDefinitions() != null;
        case BpmnPackage.DOCUMENT_ROOT__DOCUMENTATION:
            return getDocumentation() != null;
        case BpmnPackage.DOCUMENT_ROOT__END_EVENT:
            return getEndEvent() != null;
        case BpmnPackage.DOCUMENT_ROOT__END_POINT:
            return getEndPoint() != null;
        case BpmnPackage.DOCUMENT_ROOT__ERROR:
            return getError() != null;
        case BpmnPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
            return getErrorEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION:
            return getEscalation() != null;
        case BpmnPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
            return getEscalationEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__EVENT:
            return getEvent() != null;
        case BpmnPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
            return getEventBasedGateway() != null;
        case BpmnPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
            return getExclusiveGateway() != null;
        case BpmnPackage.DOCUMENT_ROOT__EXPRESSION:
            return getExpression() != null;
        case BpmnPackage.DOCUMENT_ROOT__EXTENSION:
            return getExtension() != null;
        case BpmnPackage.DOCUMENT_ROOT__FLOW_NODE:
            return getFlowNode() != null;
        case BpmnPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
            return getFormalExpression() != null;
        case BpmnPackage.DOCUMENT_ROOT__GATEWAY:
            return getGateway() != null;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
            return getGlobalBusinessRuleTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
            return getGlobalChoreographyTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_COMMUNICATION:
            return getGlobalCommunication() != null;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
            return getGlobalManualTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
            return getGlobalScriptTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_TASK:
            return getGlobalTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
            return getGlobalUserTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__GROUP:
            return getGroup() != null;
        case BpmnPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
            return getHumanPerformer() != null;
        case BpmnPackage.DOCUMENT_ROOT__PERFORMER:
            return getPerformer() != null;
        case BpmnPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
            return getImplicitThrowEvent() != null;
        case BpmnPackage.DOCUMENT_ROOT__IMPORT:
            return getImport() != null;
        case BpmnPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
            return getInclusiveGateway() != null;
        case BpmnPackage.DOCUMENT_ROOT__INPUT_SET:
            return getInputSet() != null;
        case BpmnPackage.DOCUMENT_ROOT__INTERFACE:
            return getInterface() != null;
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
            return getIntermediateCatchEvent() != null;
        case BpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
            return getIntermediateThrowEvent() != null;
        case BpmnPackage.DOCUMENT_ROOT__IO_BINDING:
            return getIoBinding() != null;
        case BpmnPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
            return getIoSpecification() != null;
        case BpmnPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
            return getItemDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__LANE:
            return getLane() != null;
        case BpmnPackage.DOCUMENT_ROOT__LANE_SET:
            return getLaneSet() != null;
        case BpmnPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
            return getLinkEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
            return getLoopCharacteristics() != null;
        case BpmnPackage.DOCUMENT_ROOT__MANUAL_TASK:
            return getManualTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE:
            return getMessage() != null;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
            return getMessageEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
            return getMessageFlow() != null;
        case BpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
            return getMessageFlowAssociation() != null;
        case BpmnPackage.DOCUMENT_ROOT__MONITORING:
            return getMonitoring() != null;
        case BpmnPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
            return getMultiInstanceLoopCharacteristics() != null;
        case BpmnPackage.DOCUMENT_ROOT__OPERATION:
            return getOperation() != null;
        case BpmnPackage.DOCUMENT_ROOT__OUTPUT_SET:
            return getOutputSet() != null;
        case BpmnPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
            return getParallelGateway() != null;
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT:
            return getParticipant() != null;
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
            return getParticipantAssociation() != null;
        case BpmnPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
            return getParticipantMultiplicity() != null;
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
            return getPartnerEntity() != null;
        case BpmnPackage.DOCUMENT_ROOT__PARTNER_ROLE:
            return getPartnerRole() != null;
        case BpmnPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
            return getPotentialOwner() != null;
        case BpmnPackage.DOCUMENT_ROOT__PROCESS:
            return getProcess() != null;
        case BpmnPackage.DOCUMENT_ROOT__PROPERTY:
            return getProperty() != null;
        case BpmnPackage.DOCUMENT_ROOT__RECEIVE_TASK:
            return getReceiveTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__RELATIONSHIP:
            return getRelationship() != null;
        case BpmnPackage.DOCUMENT_ROOT__RENDERING:
            return getRendering() != null;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE:
            return getResource() != null;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
            return getResourceAssignmentExpression() != null;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
            return getResourceParameter() != null;
        case BpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
            return getResourceParameterBinding() != null;
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT:
            return getScript() != null;
        case BpmnPackage.DOCUMENT_ROOT__SCRIPT_TASK:
            return getScriptTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__SEND_TASK:
            return getSendTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
            return getSequenceFlow() != null;
        case BpmnPackage.DOCUMENT_ROOT__SERVICE_TASK:
            return getServiceTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL:
            return getSignal() != null;
        case BpmnPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
            return getSignalEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
            return getStandardLoopCharacteristics() != null;
        case BpmnPackage.DOCUMENT_ROOT__START_EVENT:
            return getStartEvent() != null;
        case BpmnPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
            return getSubConversation() != null;
        case BpmnPackage.DOCUMENT_ROOT__SUB_PROCESS:
            return getSubProcess() != null;
        case BpmnPackage.DOCUMENT_ROOT__TASK:
            return getTask() != null;
        case BpmnPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
            return getTerminateEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__TEXT:
            return getText() != null;
        case BpmnPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
            return getTextAnnotation() != null;
        case BpmnPackage.DOCUMENT_ROOT__THROW_EVENT:
            return getThrowEvent() != null;
        case BpmnPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
            return getTimerEventDefinition() != null;
        case BpmnPackage.DOCUMENT_ROOT__TRANSACTION:
            return getTransaction() != null;
        case BpmnPackage.DOCUMENT_ROOT__USER_TASK:
            return getUserTask() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed: "); //$NON-NLS-1$
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
