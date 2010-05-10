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
package org.eclipse.bpmn.util;

import java.util.List;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn.BpmnPackage
 * @generated
 */
public class BpmnSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static BpmnPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BpmnSwitch() {
        if (modelPackage == null) {
            modelPackage = BpmnPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        } else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
                    eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case BpmnPackage.DOCUMENT_ROOT: {
            DocumentRoot documentRoot = (DocumentRoot) theEObject;
            T result = caseDocumentRoot(documentRoot);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ACTIVITY: {
            Activity activity = (Activity) theEObject;
            T result = caseActivity(activity);
            if (result == null)
                result = caseFlowNode(activity);
            if (result == null)
                result = caseFlowElement(activity);
            if (result == null)
                result = caseBaseElement(activity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ACTIVITY_RESOURCE: {
            ActivityResource activityResource = (ActivityResource) theEObject;
            T result = caseActivityResource(activityResource);
            if (result == null)
                result = caseBaseElement(activityResource);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.AD_HOC_SUB_PROCESS: {
            AdHocSubProcess adHocSubProcess = (AdHocSubProcess) theEObject;
            T result = caseAdHocSubProcess(adHocSubProcess);
            if (result == null)
                result = caseSubProcess(adHocSubProcess);
            if (result == null)
                result = caseActivity(adHocSubProcess);
            if (result == null)
                result = caseFlowNode(adHocSubProcess);
            if (result == null)
                result = caseFlowElement(adHocSubProcess);
            if (result == null)
                result = caseBaseElement(adHocSubProcess);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ARTIFACT: {
            Artifact artifact = (Artifact) theEObject;
            T result = caseArtifact(artifact);
            if (result == null)
                result = caseBaseElement(artifact);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ASSIGNMENT: {
            Assignment assignment = (Assignment) theEObject;
            T result = caseAssignment(assignment);
            if (result == null)
                result = caseBaseElement(assignment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ASSOCIATION: {
            Association association = (Association) theEObject;
            T result = caseAssociation(association);
            if (result == null)
                result = caseArtifact(association);
            if (result == null)
                result = caseBaseElement(association);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.AUDITING: {
            Auditing auditing = (Auditing) theEObject;
            T result = caseAuditing(auditing);
            if (result == null)
                result = caseBaseElement(auditing);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.BASE_ELEMENT: {
            BaseElement baseElement = (BaseElement) theEObject;
            T result = caseBaseElement(baseElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT: {
            BaseElementWithMixedContent baseElementWithMixedContent = (BaseElementWithMixedContent) theEObject;
            T result = caseBaseElementWithMixedContent(baseElementWithMixedContent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.BOUNDARY_EVENT: {
            BoundaryEvent boundaryEvent = (BoundaryEvent) theEObject;
            T result = caseBoundaryEvent(boundaryEvent);
            if (result == null)
                result = caseCatchEvent(boundaryEvent);
            if (result == null)
                result = caseEvent(boundaryEvent);
            if (result == null)
                result = caseFlowNode(boundaryEvent);
            if (result == null)
                result = caseFlowElement(boundaryEvent);
            if (result == null)
                result = caseBaseElement(boundaryEvent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.BUSINESS_RULE_TASK: {
            BusinessRuleTask businessRuleTask = (BusinessRuleTask) theEObject;
            T result = caseBusinessRuleTask(businessRuleTask);
            if (result == null)
                result = caseTask(businessRuleTask);
            if (result == null)
                result = caseActivity(businessRuleTask);
            if (result == null)
                result = caseFlowNode(businessRuleTask);
            if (result == null)
                result = caseFlowElement(businessRuleTask);
            if (result == null)
                result = caseBaseElement(businessRuleTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CALLABLE_ELEMENT: {
            CallableElement callableElement = (CallableElement) theEObject;
            T result = caseCallableElement(callableElement);
            if (result == null)
                result = caseRootElement(callableElement);
            if (result == null)
                result = caseBaseElement(callableElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CALL_ACTIVITY: {
            CallActivity callActivity = (CallActivity) theEObject;
            T result = caseCallActivity(callActivity);
            if (result == null)
                result = caseActivity(callActivity);
            if (result == null)
                result = caseFlowNode(callActivity);
            if (result == null)
                result = caseFlowElement(callActivity);
            if (result == null)
                result = caseBaseElement(callActivity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY: {
            CallChoreographyActivity callChoreographyActivity = (CallChoreographyActivity) theEObject;
            T result = caseCallChoreographyActivity(callChoreographyActivity);
            if (result == null)
                result = caseChoreographyActivity(callChoreographyActivity);
            if (result == null)
                result = caseFlowNode(callChoreographyActivity);
            if (result == null)
                result = caseFlowElement(callChoreographyActivity);
            if (result == null)
                result = caseBaseElement(callChoreographyActivity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CALL_CONVERSATION: {
            CallConversation callConversation = (CallConversation) theEObject;
            T result = caseCallConversation(callConversation);
            if (result == null)
                result = caseConversationNode(callConversation);
            if (result == null)
                result = caseBaseElement(callConversation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CANCEL_EVENT_DEFINITION: {
            CancelEventDefinition cancelEventDefinition = (CancelEventDefinition) theEObject;
            T result = caseCancelEventDefinition(cancelEventDefinition);
            if (result == null)
                result = caseEventDefinition(cancelEventDefinition);
            if (result == null)
                result = caseRootElement(cancelEventDefinition);
            if (result == null)
                result = caseBaseElement(cancelEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CATCH_EVENT: {
            CatchEvent catchEvent = (CatchEvent) theEObject;
            T result = caseCatchEvent(catchEvent);
            if (result == null)
                result = caseEvent(catchEvent);
            if (result == null)
                result = caseFlowNode(catchEvent);
            if (result == null)
                result = caseFlowElement(catchEvent);
            if (result == null)
                result = caseBaseElement(catchEvent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CATEGORY: {
            Category category = (Category) theEObject;
            T result = caseCategory(category);
            if (result == null)
                result = caseRootElement(category);
            if (result == null)
                result = caseBaseElement(category);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CATEGORY_VALUE: {
            CategoryValue categoryValue = (CategoryValue) theEObject;
            T result = caseCategoryValue(categoryValue);
            if (result == null)
                result = caseBaseElement(categoryValue);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CHOREOGRAPHY: {
            Choreography choreography = (Choreography) theEObject;
            T result = caseChoreography(choreography);
            if (result == null)
                result = caseCallableElement(choreography);
            if (result == null)
                result = caseRootElement(choreography);
            if (result == null)
                result = caseBaseElement(choreography);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CHOREOGRAPHY_ACTIVITY: {
            ChoreographyActivity choreographyActivity = (ChoreographyActivity) theEObject;
            T result = caseChoreographyActivity(choreographyActivity);
            if (result == null)
                result = caseFlowNode(choreographyActivity);
            if (result == null)
                result = caseFlowElement(choreographyActivity);
            if (result == null)
                result = caseBaseElement(choreographyActivity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS: {
            ChoreographySubProcess choreographySubProcess = (ChoreographySubProcess) theEObject;
            T result = caseChoreographySubProcess(choreographySubProcess);
            if (result == null)
                result = caseChoreographyActivity(choreographySubProcess);
            if (result == null)
                result = caseFlowNode(choreographySubProcess);
            if (result == null)
                result = caseFlowElement(choreographySubProcess);
            if (result == null)
                result = caseBaseElement(choreographySubProcess);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CHOREOGRAPHY_TASK: {
            ChoreographyTask choreographyTask = (ChoreographyTask) theEObject;
            T result = caseChoreographyTask(choreographyTask);
            if (result == null)
                result = caseChoreographyActivity(choreographyTask);
            if (result == null)
                result = caseFlowNode(choreographyTask);
            if (result == null)
                result = caseFlowElement(choreographyTask);
            if (result == null)
                result = caseBaseElement(choreographyTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.COLLABORATION: {
            Collaboration collaboration = (Collaboration) theEObject;
            T result = caseCollaboration(collaboration);
            if (result == null)
                result = caseRootElement(collaboration);
            if (result == null)
                result = caseBaseElement(collaboration);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.COMMUNICATION: {
            Communication communication = (Communication) theEObject;
            T result = caseCommunication(communication);
            if (result == null)
                result = caseConversationNode(communication);
            if (result == null)
                result = caseBaseElement(communication);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.COMPENSATE_EVENT_DEFINITION: {
            CompensateEventDefinition compensateEventDefinition = (CompensateEventDefinition) theEObject;
            T result = caseCompensateEventDefinition(compensateEventDefinition);
            if (result == null)
                result = caseEventDefinition(compensateEventDefinition);
            if (result == null)
                result = caseRootElement(compensateEventDefinition);
            if (result == null)
                result = caseBaseElement(compensateEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION: {
            ComplexBehaviorDefinition complexBehaviorDefinition = (ComplexBehaviorDefinition) theEObject;
            T result = caseComplexBehaviorDefinition(complexBehaviorDefinition);
            if (result == null)
                result = caseBaseElement(complexBehaviorDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.COMPLEX_GATEWAY: {
            ComplexGateway complexGateway = (ComplexGateway) theEObject;
            T result = caseComplexGateway(complexGateway);
            if (result == null)
                result = caseGateway(complexGateway);
            if (result == null)
                result = caseFlowNode(complexGateway);
            if (result == null)
                result = caseFlowElement(complexGateway);
            if (result == null)
                result = caseBaseElement(complexGateway);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CONDITIONAL_EVENT_DEFINITION: {
            ConditionalEventDefinition conditionalEventDefinition = (ConditionalEventDefinition) theEObject;
            T result = caseConditionalEventDefinition(conditionalEventDefinition);
            if (result == null)
                result = caseEventDefinition(conditionalEventDefinition);
            if (result == null)
                result = caseRootElement(conditionalEventDefinition);
            if (result == null)
                result = caseBaseElement(conditionalEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CONVERSATION: {
            Conversation conversation = (Conversation) theEObject;
            T result = caseConversation(conversation);
            if (result == null)
                result = caseCallableElement(conversation);
            if (result == null)
                result = caseRootElement(conversation);
            if (result == null)
                result = caseBaseElement(conversation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CONVERSATION_ASSOCIATION: {
            ConversationAssociation conversationAssociation = (ConversationAssociation) theEObject;
            T result = caseConversationAssociation(conversationAssociation);
            if (result == null)
                result = caseBaseElement(conversationAssociation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CONVERSATION_NODE: {
            ConversationNode conversationNode = (ConversationNode) theEObject;
            T result = caseConversationNode(conversationNode);
            if (result == null)
                result = caseBaseElement(conversationNode);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CORRELATION_KEY: {
            CorrelationKey correlationKey = (CorrelationKey) theEObject;
            T result = caseCorrelationKey(correlationKey);
            if (result == null)
                result = caseBaseElement(correlationKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CORRELATION_PROPERTY: {
            CorrelationProperty correlationProperty = (CorrelationProperty) theEObject;
            T result = caseCorrelationProperty(correlationProperty);
            if (result == null)
                result = caseRootElement(correlationProperty);
            if (result == null)
                result = caseBaseElement(correlationProperty);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CORRELATION_PROPERTY_BINDING: {
            CorrelationPropertyBinding correlationPropertyBinding = (CorrelationPropertyBinding) theEObject;
            T result = caseCorrelationPropertyBinding(correlationPropertyBinding);
            if (result == null)
                result = caseBaseElement(correlationPropertyBinding);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION: {
            CorrelationPropertyRetrievalExpression correlationPropertyRetrievalExpression = (CorrelationPropertyRetrievalExpression) theEObject;
            T result = caseCorrelationPropertyRetrievalExpression(correlationPropertyRetrievalExpression);
            if (result == null)
                result = caseBaseElement(correlationPropertyRetrievalExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.CORRELATION_SUBSCRIPTION: {
            CorrelationSubscription correlationSubscription = (CorrelationSubscription) theEObject;
            T result = caseCorrelationSubscription(correlationSubscription);
            if (result == null)
                result = caseBaseElement(correlationSubscription);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DATA_ASSOCIATION: {
            DataAssociation dataAssociation = (DataAssociation) theEObject;
            T result = caseDataAssociation(dataAssociation);
            if (result == null)
                result = caseBaseElement(dataAssociation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DATA_INPUT: {
            DataInput dataInput = (DataInput) theEObject;
            T result = caseDataInput(dataInput);
            if (result == null)
                result = caseBaseElement(dataInput);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DATA_INPUT_ASSOCIATION: {
            DataInputAssociation dataInputAssociation = (DataInputAssociation) theEObject;
            T result = caseDataInputAssociation(dataInputAssociation);
            if (result == null)
                result = caseDataAssociation(dataInputAssociation);
            if (result == null)
                result = caseBaseElement(dataInputAssociation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DATA_OBJECT: {
            DataObject dataObject = (DataObject) theEObject;
            T result = caseDataObject(dataObject);
            if (result == null)
                result = caseFlowElement(dataObject);
            if (result == null)
                result = caseBaseElement(dataObject);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DATA_OUTPUT: {
            DataOutput dataOutput = (DataOutput) theEObject;
            T result = caseDataOutput(dataOutput);
            if (result == null)
                result = caseBaseElement(dataOutput);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION: {
            DataOutputAssociation dataOutputAssociation = (DataOutputAssociation) theEObject;
            T result = caseDataOutputAssociation(dataOutputAssociation);
            if (result == null)
                result = caseDataAssociation(dataOutputAssociation);
            if (result == null)
                result = caseBaseElement(dataOutputAssociation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DATA_STATE: {
            DataState dataState = (DataState) theEObject;
            T result = caseDataState(dataState);
            if (result == null)
                result = caseBaseElement(dataState);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DATA_STORE: {
            DataStore dataStore = (DataStore) theEObject;
            T result = caseDataStore(dataStore);
            if (result == null)
                result = caseRootElement(dataStore);
            if (result == null)
                result = caseBaseElement(dataStore);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DATA_STORE_REFERENCE: {
            DataStoreReference dataStoreReference = (DataStoreReference) theEObject;
            T result = caseDataStoreReference(dataStoreReference);
            if (result == null)
                result = caseFlowElement(dataStoreReference);
            if (result == null)
                result = caseBaseElement(dataStoreReference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DEFINITIONS: {
            Definitions definitions = (Definitions) theEObject;
            T result = caseDefinitions(definitions);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.DOCUMENTATION: {
            Documentation documentation = (Documentation) theEObject;
            T result = caseDocumentation(documentation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.END_EVENT: {
            EndEvent endEvent = (EndEvent) theEObject;
            T result = caseEndEvent(endEvent);
            if (result == null)
                result = caseThrowEvent(endEvent);
            if (result == null)
                result = caseEvent(endEvent);
            if (result == null)
                result = caseFlowNode(endEvent);
            if (result == null)
                result = caseFlowElement(endEvent);
            if (result == null)
                result = caseBaseElement(endEvent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.END_POINT: {
            EndPoint endPoint = (EndPoint) theEObject;
            T result = caseEndPoint(endPoint);
            if (result == null)
                result = caseRootElement(endPoint);
            if (result == null)
                result = caseBaseElement(endPoint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ERROR: {
            org.eclipse.bpmn.Error error = (org.eclipse.bpmn.Error) theEObject;
            T result = caseError(error);
            if (result == null)
                result = caseRootElement(error);
            if (result == null)
                result = caseBaseElement(error);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ERROR_EVENT_DEFINITION: {
            ErrorEventDefinition errorEventDefinition = (ErrorEventDefinition) theEObject;
            T result = caseErrorEventDefinition(errorEventDefinition);
            if (result == null)
                result = caseEventDefinition(errorEventDefinition);
            if (result == null)
                result = caseRootElement(errorEventDefinition);
            if (result == null)
                result = caseBaseElement(errorEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ESCALATION: {
            Escalation escalation = (Escalation) theEObject;
            T result = caseEscalation(escalation);
            if (result == null)
                result = caseRootElement(escalation);
            if (result == null)
                result = caseBaseElement(escalation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ESCALATION_EVENT_DEFINITION: {
            EscalationEventDefinition escalationEventDefinition = (EscalationEventDefinition) theEObject;
            T result = caseEscalationEventDefinition(escalationEventDefinition);
            if (result == null)
                result = caseEventDefinition(escalationEventDefinition);
            if (result == null)
                result = caseRootElement(escalationEventDefinition);
            if (result == null)
                result = caseBaseElement(escalationEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.EVENT: {
            Event event = (Event) theEObject;
            T result = caseEvent(event);
            if (result == null)
                result = caseFlowNode(event);
            if (result == null)
                result = caseFlowElement(event);
            if (result == null)
                result = caseBaseElement(event);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.EVENT_BASED_GATEWAY: {
            EventBasedGateway eventBasedGateway = (EventBasedGateway) theEObject;
            T result = caseEventBasedGateway(eventBasedGateway);
            if (result == null)
                result = caseGateway(eventBasedGateway);
            if (result == null)
                result = caseFlowNode(eventBasedGateway);
            if (result == null)
                result = caseFlowElement(eventBasedGateway);
            if (result == null)
                result = caseBaseElement(eventBasedGateway);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.EVENT_DEFINITION: {
            EventDefinition eventDefinition = (EventDefinition) theEObject;
            T result = caseEventDefinition(eventDefinition);
            if (result == null)
                result = caseRootElement(eventDefinition);
            if (result == null)
                result = caseBaseElement(eventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.EXCLUSIVE_GATEWAY: {
            ExclusiveGateway exclusiveGateway = (ExclusiveGateway) theEObject;
            T result = caseExclusiveGateway(exclusiveGateway);
            if (result == null)
                result = caseGateway(exclusiveGateway);
            if (result == null)
                result = caseFlowNode(exclusiveGateway);
            if (result == null)
                result = caseFlowElement(exclusiveGateway);
            if (result == null)
                result = caseBaseElement(exclusiveGateway);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.EXPRESSION: {
            Expression expression = (Expression) theEObject;
            T result = caseExpression(expression);
            if (result == null)
                result = caseBaseElementWithMixedContent(expression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.EXTENSION: {
            Extension extension = (Extension) theEObject;
            T result = caseExtension(extension);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.FLOW_ELEMENT: {
            FlowElement flowElement = (FlowElement) theEObject;
            T result = caseFlowElement(flowElement);
            if (result == null)
                result = caseBaseElement(flowElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.FLOW_NODE: {
            FlowNode flowNode = (FlowNode) theEObject;
            T result = caseFlowNode(flowNode);
            if (result == null)
                result = caseFlowElement(flowNode);
            if (result == null)
                result = caseBaseElement(flowNode);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.FORMAL_EXPRESSION: {
            FormalExpression formalExpression = (FormalExpression) theEObject;
            T result = caseFormalExpression(formalExpression);
            if (result == null)
                result = caseExpression(formalExpression);
            if (result == null)
                result = caseBaseElementWithMixedContent(formalExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.GATEWAY: {
            Gateway gateway = (Gateway) theEObject;
            T result = caseGateway(gateway);
            if (result == null)
                result = caseFlowNode(gateway);
            if (result == null)
                result = caseFlowElement(gateway);
            if (result == null)
                result = caseBaseElement(gateway);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.GLOBAL_BUSINESS_RULE_TASK: {
            GlobalBusinessRuleTask globalBusinessRuleTask = (GlobalBusinessRuleTask) theEObject;
            T result = caseGlobalBusinessRuleTask(globalBusinessRuleTask);
            if (result == null)
                result = caseGlobalTask(globalBusinessRuleTask);
            if (result == null)
                result = caseCallableElement(globalBusinessRuleTask);
            if (result == null)
                result = caseRootElement(globalBusinessRuleTask);
            if (result == null)
                result = caseBaseElement(globalBusinessRuleTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.GLOBAL_CHOREOGRAPHY_TASK: {
            GlobalChoreographyTask globalChoreographyTask = (GlobalChoreographyTask) theEObject;
            T result = caseGlobalChoreographyTask(globalChoreographyTask);
            if (result == null)
                result = caseCallableElement(globalChoreographyTask);
            if (result == null)
                result = caseRootElement(globalChoreographyTask);
            if (result == null)
                result = caseBaseElement(globalChoreographyTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.GLOBAL_COMMUNICATION: {
            GlobalCommunication globalCommunication = (GlobalCommunication) theEObject;
            T result = caseGlobalCommunication(globalCommunication);
            if (result == null)
                result = caseCallableElement(globalCommunication);
            if (result == null)
                result = caseRootElement(globalCommunication);
            if (result == null)
                result = caseBaseElement(globalCommunication);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.GLOBAL_MANUAL_TASK: {
            GlobalManualTask globalManualTask = (GlobalManualTask) theEObject;
            T result = caseGlobalManualTask(globalManualTask);
            if (result == null)
                result = caseGlobalTask(globalManualTask);
            if (result == null)
                result = caseCallableElement(globalManualTask);
            if (result == null)
                result = caseRootElement(globalManualTask);
            if (result == null)
                result = caseBaseElement(globalManualTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.GLOBAL_SCRIPT_TASK: {
            GlobalScriptTask globalScriptTask = (GlobalScriptTask) theEObject;
            T result = caseGlobalScriptTask(globalScriptTask);
            if (result == null)
                result = caseGlobalTask(globalScriptTask);
            if (result == null)
                result = caseCallableElement(globalScriptTask);
            if (result == null)
                result = caseRootElement(globalScriptTask);
            if (result == null)
                result = caseBaseElement(globalScriptTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.GLOBAL_TASK: {
            GlobalTask globalTask = (GlobalTask) theEObject;
            T result = caseGlobalTask(globalTask);
            if (result == null)
                result = caseCallableElement(globalTask);
            if (result == null)
                result = caseRootElement(globalTask);
            if (result == null)
                result = caseBaseElement(globalTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.GLOBAL_USER_TASK: {
            GlobalUserTask globalUserTask = (GlobalUserTask) theEObject;
            T result = caseGlobalUserTask(globalUserTask);
            if (result == null)
                result = caseGlobalTask(globalUserTask);
            if (result == null)
                result = caseCallableElement(globalUserTask);
            if (result == null)
                result = caseRootElement(globalUserTask);
            if (result == null)
                result = caseBaseElement(globalUserTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.GROUP: {
            Group group = (Group) theEObject;
            T result = caseGroup(group);
            if (result == null)
                result = caseArtifact(group);
            if (result == null)
                result = caseBaseElement(group);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.HUMAN_PERFORMER: {
            HumanPerformer humanPerformer = (HumanPerformer) theEObject;
            T result = caseHumanPerformer(humanPerformer);
            if (result == null)
                result = casePerformer(humanPerformer);
            if (result == null)
                result = caseActivityResource(humanPerformer);
            if (result == null)
                result = caseBaseElement(humanPerformer);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.IMPLICIT_THROW_EVENT: {
            ImplicitThrowEvent implicitThrowEvent = (ImplicitThrowEvent) theEObject;
            T result = caseImplicitThrowEvent(implicitThrowEvent);
            if (result == null)
                result = caseThrowEvent(implicitThrowEvent);
            if (result == null)
                result = caseEvent(implicitThrowEvent);
            if (result == null)
                result = caseFlowNode(implicitThrowEvent);
            if (result == null)
                result = caseFlowElement(implicitThrowEvent);
            if (result == null)
                result = caseBaseElement(implicitThrowEvent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.IMPORT: {
            Import import_ = (Import) theEObject;
            T result = caseImport(import_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.INCLUSIVE_GATEWAY: {
            InclusiveGateway inclusiveGateway = (InclusiveGateway) theEObject;
            T result = caseInclusiveGateway(inclusiveGateway);
            if (result == null)
                result = caseGateway(inclusiveGateway);
            if (result == null)
                result = caseFlowNode(inclusiveGateway);
            if (result == null)
                result = caseFlowElement(inclusiveGateway);
            if (result == null)
                result = caseBaseElement(inclusiveGateway);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.INPUT_OUTPUT_BINDING: {
            InputOutputBinding inputOutputBinding = (InputOutputBinding) theEObject;
            T result = caseInputOutputBinding(inputOutputBinding);
            if (result == null)
                result = caseBaseElement(inputOutputBinding);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.INPUT_OUTPUT_SPECIFICATION: {
            InputOutputSpecification inputOutputSpecification = (InputOutputSpecification) theEObject;
            T result = caseInputOutputSpecification(inputOutputSpecification);
            if (result == null)
                result = caseBaseElement(inputOutputSpecification);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.INPUT_SET: {
            InputSet inputSet = (InputSet) theEObject;
            T result = caseInputSet(inputSet);
            if (result == null)
                result = caseBaseElement(inputSet);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.INTERFACE: {
            Interface interface_ = (Interface) theEObject;
            T result = caseInterface(interface_);
            if (result == null)
                result = caseRootElement(interface_);
            if (result == null)
                result = caseBaseElement(interface_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.INTERMEDIATE_CATCH_EVENT: {
            IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) theEObject;
            T result = caseIntermediateCatchEvent(intermediateCatchEvent);
            if (result == null)
                result = caseCatchEvent(intermediateCatchEvent);
            if (result == null)
                result = caseEvent(intermediateCatchEvent);
            if (result == null)
                result = caseFlowNode(intermediateCatchEvent);
            if (result == null)
                result = caseFlowElement(intermediateCatchEvent);
            if (result == null)
                result = caseBaseElement(intermediateCatchEvent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.INTERMEDIATE_THROW_EVENT: {
            IntermediateThrowEvent intermediateThrowEvent = (IntermediateThrowEvent) theEObject;
            T result = caseIntermediateThrowEvent(intermediateThrowEvent);
            if (result == null)
                result = caseThrowEvent(intermediateThrowEvent);
            if (result == null)
                result = caseEvent(intermediateThrowEvent);
            if (result == null)
                result = caseFlowNode(intermediateThrowEvent);
            if (result == null)
                result = caseFlowElement(intermediateThrowEvent);
            if (result == null)
                result = caseBaseElement(intermediateThrowEvent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ITEM_DEFINITION: {
            ItemDefinition itemDefinition = (ItemDefinition) theEObject;
            T result = caseItemDefinition(itemDefinition);
            if (result == null)
                result = caseRootElement(itemDefinition);
            if (result == null)
                result = caseBaseElement(itemDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.LANE: {
            Lane lane = (Lane) theEObject;
            T result = caseLane(lane);
            if (result == null)
                result = caseBaseElement(lane);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.LANE_SET: {
            LaneSet laneSet = (LaneSet) theEObject;
            T result = caseLaneSet(laneSet);
            if (result == null)
                result = caseBaseElement(laneSet);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.LINK_EVENT_DEFINITION: {
            LinkEventDefinition linkEventDefinition = (LinkEventDefinition) theEObject;
            T result = caseLinkEventDefinition(linkEventDefinition);
            if (result == null)
                result = caseEventDefinition(linkEventDefinition);
            if (result == null)
                result = caseRootElement(linkEventDefinition);
            if (result == null)
                result = caseBaseElement(linkEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.LOOP_CHARACTERISTICS: {
            LoopCharacteristics loopCharacteristics = (LoopCharacteristics) theEObject;
            T result = caseLoopCharacteristics(loopCharacteristics);
            if (result == null)
                result = caseBaseElement(loopCharacteristics);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.MANUAL_TASK: {
            ManualTask manualTask = (ManualTask) theEObject;
            T result = caseManualTask(manualTask);
            if (result == null)
                result = caseTask(manualTask);
            if (result == null)
                result = caseActivity(manualTask);
            if (result == null)
                result = caseFlowNode(manualTask);
            if (result == null)
                result = caseFlowElement(manualTask);
            if (result == null)
                result = caseBaseElement(manualTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.MESSAGE: {
            Message message = (Message) theEObject;
            T result = caseMessage(message);
            if (result == null)
                result = caseRootElement(message);
            if (result == null)
                result = caseBaseElement(message);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.MESSAGE_EVENT_DEFINITION: {
            MessageEventDefinition messageEventDefinition = (MessageEventDefinition) theEObject;
            T result = caseMessageEventDefinition(messageEventDefinition);
            if (result == null)
                result = caseEventDefinition(messageEventDefinition);
            if (result == null)
                result = caseRootElement(messageEventDefinition);
            if (result == null)
                result = caseBaseElement(messageEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.MESSAGE_FLOW: {
            MessageFlow messageFlow = (MessageFlow) theEObject;
            T result = caseMessageFlow(messageFlow);
            if (result == null)
                result = caseBaseElement(messageFlow);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION: {
            MessageFlowAssociation messageFlowAssociation = (MessageFlowAssociation) theEObject;
            T result = caseMessageFlowAssociation(messageFlowAssociation);
            if (result == null)
                result = caseBaseElement(messageFlowAssociation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.MONITORING: {
            Monitoring monitoring = (Monitoring) theEObject;
            T result = caseMonitoring(monitoring);
            if (result == null)
                result = caseBaseElement(monitoring);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS: {
            MultiInstanceLoopCharacteristics multiInstanceLoopCharacteristics = (MultiInstanceLoopCharacteristics) theEObject;
            T result = caseMultiInstanceLoopCharacteristics(multiInstanceLoopCharacteristics);
            if (result == null)
                result = caseLoopCharacteristics(multiInstanceLoopCharacteristics);
            if (result == null)
                result = caseBaseElement(multiInstanceLoopCharacteristics);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.OPERATION: {
            Operation operation = (Operation) theEObject;
            T result = caseOperation(operation);
            if (result == null)
                result = caseBaseElement(operation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.OUTPUT_SET: {
            OutputSet outputSet = (OutputSet) theEObject;
            T result = caseOutputSet(outputSet);
            if (result == null)
                result = caseBaseElement(outputSet);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.PARALLEL_GATEWAY: {
            ParallelGateway parallelGateway = (ParallelGateway) theEObject;
            T result = caseParallelGateway(parallelGateway);
            if (result == null)
                result = caseGateway(parallelGateway);
            if (result == null)
                result = caseFlowNode(parallelGateway);
            if (result == null)
                result = caseFlowElement(parallelGateway);
            if (result == null)
                result = caseBaseElement(parallelGateway);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.PARTICIPANT: {
            Participant participant = (Participant) theEObject;
            T result = caseParticipant(participant);
            if (result == null)
                result = caseBaseElement(participant);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.PARTICIPANT_ASSOCIATION: {
            ParticipantAssociation participantAssociation = (ParticipantAssociation) theEObject;
            T result = caseParticipantAssociation(participantAssociation);
            if (result == null)
                result = caseBaseElement(participantAssociation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.PARTICIPANT_MULTIPLICITY: {
            ParticipantMultiplicity participantMultiplicity = (ParticipantMultiplicity) theEObject;
            T result = caseParticipantMultiplicity(participantMultiplicity);
            if (result == null)
                result = caseBaseElement(participantMultiplicity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.PARTNER_ENTITY: {
            PartnerEntity partnerEntity = (PartnerEntity) theEObject;
            T result = casePartnerEntity(partnerEntity);
            if (result == null)
                result = caseRootElement(partnerEntity);
            if (result == null)
                result = caseBaseElement(partnerEntity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.PARTNER_ROLE: {
            PartnerRole partnerRole = (PartnerRole) theEObject;
            T result = casePartnerRole(partnerRole);
            if (result == null)
                result = caseRootElement(partnerRole);
            if (result == null)
                result = caseBaseElement(partnerRole);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.PERFORMER: {
            Performer performer = (Performer) theEObject;
            T result = casePerformer(performer);
            if (result == null)
                result = caseActivityResource(performer);
            if (result == null)
                result = caseBaseElement(performer);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.POTENTIAL_OWNER: {
            PotentialOwner potentialOwner = (PotentialOwner) theEObject;
            T result = casePotentialOwner(potentialOwner);
            if (result == null)
                result = caseHumanPerformer(potentialOwner);
            if (result == null)
                result = casePerformer(potentialOwner);
            if (result == null)
                result = caseActivityResource(potentialOwner);
            if (result == null)
                result = caseBaseElement(potentialOwner);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.PROCESS: {
            org.eclipse.bpmn.Process process = (org.eclipse.bpmn.Process) theEObject;
            T result = caseProcess(process);
            if (result == null)
                result = caseCallableElement(process);
            if (result == null)
                result = caseRootElement(process);
            if (result == null)
                result = caseBaseElement(process);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.PROPERTY: {
            Property property = (Property) theEObject;
            T result = caseProperty(property);
            if (result == null)
                result = caseBaseElement(property);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.RECEIVE_TASK: {
            ReceiveTask receiveTask = (ReceiveTask) theEObject;
            T result = caseReceiveTask(receiveTask);
            if (result == null)
                result = caseTask(receiveTask);
            if (result == null)
                result = caseActivity(receiveTask);
            if (result == null)
                result = caseFlowNode(receiveTask);
            if (result == null)
                result = caseFlowElement(receiveTask);
            if (result == null)
                result = caseBaseElement(receiveTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.RELATIONSHIP: {
            Relationship relationship = (Relationship) theEObject;
            T result = caseRelationship(relationship);
            if (result == null)
                result = caseBaseElement(relationship);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.RENDERING: {
            Rendering rendering = (Rendering) theEObject;
            T result = caseRendering(rendering);
            if (result == null)
                result = caseBaseElement(rendering);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.RESOURCE: {
            Resource resource = (Resource) theEObject;
            T result = caseResource(resource);
            if (result == null)
                result = caseRootElement(resource);
            if (result == null)
                result = caseBaseElement(resource);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION: {
            ResourceAssignmentExpression resourceAssignmentExpression = (ResourceAssignmentExpression) theEObject;
            T result = caseResourceAssignmentExpression(resourceAssignmentExpression);
            if (result == null)
                result = caseBaseElement(resourceAssignmentExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.RESOURCE_PARAMETER: {
            ResourceParameter resourceParameter = (ResourceParameter) theEObject;
            T result = caseResourceParameter(resourceParameter);
            if (result == null)
                result = caseBaseElement(resourceParameter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.RESOURCE_PARAMETER_BINDING: {
            ResourceParameterBinding resourceParameterBinding = (ResourceParameterBinding) theEObject;
            T result = caseResourceParameterBinding(resourceParameterBinding);
            if (result == null)
                result = caseBaseElement(resourceParameterBinding);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.ROOT_ELEMENT: {
            RootElement rootElement = (RootElement) theEObject;
            T result = caseRootElement(rootElement);
            if (result == null)
                result = caseBaseElement(rootElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.SCRIPT: {
            Script script = (Script) theEObject;
            T result = caseScript(script);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.SCRIPT_TASK: {
            ScriptTask scriptTask = (ScriptTask) theEObject;
            T result = caseScriptTask(scriptTask);
            if (result == null)
                result = caseTask(scriptTask);
            if (result == null)
                result = caseActivity(scriptTask);
            if (result == null)
                result = caseFlowNode(scriptTask);
            if (result == null)
                result = caseFlowElement(scriptTask);
            if (result == null)
                result = caseBaseElement(scriptTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.SEND_TASK: {
            SendTask sendTask = (SendTask) theEObject;
            T result = caseSendTask(sendTask);
            if (result == null)
                result = caseTask(sendTask);
            if (result == null)
                result = caseActivity(sendTask);
            if (result == null)
                result = caseFlowNode(sendTask);
            if (result == null)
                result = caseFlowElement(sendTask);
            if (result == null)
                result = caseBaseElement(sendTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.SEQUENCE_FLOW: {
            SequenceFlow sequenceFlow = (SequenceFlow) theEObject;
            T result = caseSequenceFlow(sequenceFlow);
            if (result == null)
                result = caseFlowElement(sequenceFlow);
            if (result == null)
                result = caseBaseElement(sequenceFlow);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.SERVICE_TASK: {
            ServiceTask serviceTask = (ServiceTask) theEObject;
            T result = caseServiceTask(serviceTask);
            if (result == null)
                result = caseTask(serviceTask);
            if (result == null)
                result = caseActivity(serviceTask);
            if (result == null)
                result = caseFlowNode(serviceTask);
            if (result == null)
                result = caseFlowElement(serviceTask);
            if (result == null)
                result = caseBaseElement(serviceTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.SIGNAL: {
            Signal signal = (Signal) theEObject;
            T result = caseSignal(signal);
            if (result == null)
                result = caseRootElement(signal);
            if (result == null)
                result = caseBaseElement(signal);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.SIGNAL_EVENT_DEFINITION: {
            SignalEventDefinition signalEventDefinition = (SignalEventDefinition) theEObject;
            T result = caseSignalEventDefinition(signalEventDefinition);
            if (result == null)
                result = caseEventDefinition(signalEventDefinition);
            if (result == null)
                result = caseRootElement(signalEventDefinition);
            if (result == null)
                result = caseBaseElement(signalEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS: {
            StandardLoopCharacteristics standardLoopCharacteristics = (StandardLoopCharacteristics) theEObject;
            T result = caseStandardLoopCharacteristics(standardLoopCharacteristics);
            if (result == null)
                result = caseLoopCharacteristics(standardLoopCharacteristics);
            if (result == null)
                result = caseBaseElement(standardLoopCharacteristics);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.START_EVENT: {
            StartEvent startEvent = (StartEvent) theEObject;
            T result = caseStartEvent(startEvent);
            if (result == null)
                result = caseCatchEvent(startEvent);
            if (result == null)
                result = caseEvent(startEvent);
            if (result == null)
                result = caseFlowNode(startEvent);
            if (result == null)
                result = caseFlowElement(startEvent);
            if (result == null)
                result = caseBaseElement(startEvent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.SUB_CONVERSATION: {
            SubConversation subConversation = (SubConversation) theEObject;
            T result = caseSubConversation(subConversation);
            if (result == null)
                result = caseConversationNode(subConversation);
            if (result == null)
                result = caseBaseElement(subConversation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.SUB_PROCESS: {
            SubProcess subProcess = (SubProcess) theEObject;
            T result = caseSubProcess(subProcess);
            if (result == null)
                result = caseActivity(subProcess);
            if (result == null)
                result = caseFlowNode(subProcess);
            if (result == null)
                result = caseFlowElement(subProcess);
            if (result == null)
                result = caseBaseElement(subProcess);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.TASK: {
            Task task = (Task) theEObject;
            T result = caseTask(task);
            if (result == null)
                result = caseActivity(task);
            if (result == null)
                result = caseFlowNode(task);
            if (result == null)
                result = caseFlowElement(task);
            if (result == null)
                result = caseBaseElement(task);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.TERMINATE_EVENT_DEFINITION: {
            TerminateEventDefinition terminateEventDefinition = (TerminateEventDefinition) theEObject;
            T result = caseTerminateEventDefinition(terminateEventDefinition);
            if (result == null)
                result = caseEventDefinition(terminateEventDefinition);
            if (result == null)
                result = caseRootElement(terminateEventDefinition);
            if (result == null)
                result = caseBaseElement(terminateEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.TEXT: {
            Text text = (Text) theEObject;
            T result = caseText(text);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.TEXT_ANNOTATION: {
            TextAnnotation textAnnotation = (TextAnnotation) theEObject;
            T result = caseTextAnnotation(textAnnotation);
            if (result == null)
                result = caseArtifact(textAnnotation);
            if (result == null)
                result = caseBaseElement(textAnnotation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.THROW_EVENT: {
            ThrowEvent throwEvent = (ThrowEvent) theEObject;
            T result = caseThrowEvent(throwEvent);
            if (result == null)
                result = caseEvent(throwEvent);
            if (result == null)
                result = caseFlowNode(throwEvent);
            if (result == null)
                result = caseFlowElement(throwEvent);
            if (result == null)
                result = caseBaseElement(throwEvent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.TIMER_EVENT_DEFINITION: {
            TimerEventDefinition timerEventDefinition = (TimerEventDefinition) theEObject;
            T result = caseTimerEventDefinition(timerEventDefinition);
            if (result == null)
                result = caseEventDefinition(timerEventDefinition);
            if (result == null)
                result = caseRootElement(timerEventDefinition);
            if (result == null)
                result = caseBaseElement(timerEventDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.TRANSACTION: {
            Transaction transaction = (Transaction) theEObject;
            T result = caseTransaction(transaction);
            if (result == null)
                result = caseActivity(transaction);
            if (result == null)
                result = caseFlowNode(transaction);
            if (result == null)
                result = caseFlowElement(transaction);
            if (result == null)
                result = caseBaseElement(transaction);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case BpmnPackage.USER_TASK: {
            UserTask userTask = (UserTask) theEObject;
            T result = caseUserTask(userTask);
            if (result == null)
                result = caseTask(userTask);
            if (result == null)
                result = caseActivity(userTask);
            if (result == null)
                result = caseFlowNode(userTask);
            if (result == null)
                result = caseFlowElement(userTask);
            if (result == null)
                result = caseBaseElement(userTask);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivity(Activity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityResource(ActivityResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ad Hoc Sub Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ad Hoc Sub Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdHocSubProcess(AdHocSubProcess object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArtifact(Artifact object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignment(Assignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociation(Association object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Auditing</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Auditing</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuditing(Auditing object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseElement(BaseElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Element With Mixed Content</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Element With Mixed Content</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseElementWithMixedContent(BaseElementWithMixedContent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boundary Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boundary Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoundaryEvent(BoundaryEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Business Rule Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Business Rule Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusinessRuleTask(BusinessRuleTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Callable Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Callable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallableElement(CallableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Call Activity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call Activity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallActivity(CallActivity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Call Choreography Activity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call Choreography Activity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallChoreographyActivity(CallChoreographyActivity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Call Conversation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Call Conversation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCallConversation(CallConversation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cancel Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cancel Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCancelEventDefinition(CancelEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Catch Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Catch Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCatchEvent(CatchEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCategory(Category object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Category Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Category Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCategoryValue(CategoryValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Choreography</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Choreography</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChoreography(Choreography object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Choreography Activity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Choreography Activity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChoreographyActivity(ChoreographyActivity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Choreography Sub Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Choreography Sub Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChoreographySubProcess(ChoreographySubProcess object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Choreography Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Choreography Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChoreographyTask(ChoreographyTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Collaboration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Collaboration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCollaboration(Collaboration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommunication(Communication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Compensate Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Compensate Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompensateEventDefinition(CompensateEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complex Behavior Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complex Behavior Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComplexBehaviorDefinition(ComplexBehaviorDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complex Gateway</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complex Gateway</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComplexGateway(ComplexGateway object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conditional Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conditional Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConditionalEventDefinition(ConditionalEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conversation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conversation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConversation(Conversation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conversation Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conversation Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConversationAssociation(ConversationAssociation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conversation Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conversation Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConversationNode(ConversationNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Correlation Key</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Correlation Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCorrelationKey(CorrelationKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Correlation Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Correlation Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCorrelationProperty(CorrelationProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Correlation Property Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Correlation Property Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCorrelationPropertyBinding(CorrelationPropertyBinding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Correlation Property Retrieval Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Correlation Property Retrieval Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCorrelationPropertyRetrievalExpression(
            CorrelationPropertyRetrievalExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Correlation Subscription</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Correlation Subscription</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCorrelationSubscription(CorrelationSubscription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataAssociation(DataAssociation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Input</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Input</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInput(DataInput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Input Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Input Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInputAssociation(DataInputAssociation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataObject(DataObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Output</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataOutput(DataOutput object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Output Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Output Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataOutputAssociation(DataOutputAssociation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataState(DataState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Store</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Store</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataStore(DataStore object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Store Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Store Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataStoreReference(DataStoreReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefinitions(Definitions object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentation(Documentation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndEvent(EndEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndPoint(EndPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Error</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseError(org.eclipse.bpmn.Error object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Error Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Error Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseErrorEventDefinition(ErrorEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Escalation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Escalation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEscalation(Escalation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Escalation Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Escalation Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEscalationEventDefinition(EscalationEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEvent(Event object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Based Gateway</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Based Gateway</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventBasedGateway(EventBasedGateway object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventDefinition(EventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exclusive Gateway</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exclusive Gateway</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExclusiveGateway(ExclusiveGateway object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpression(Expression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtension(Extension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowElement(FlowElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowNode(FlowNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formal Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formal Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormalExpression(FormalExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGateway(Gateway object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global Business Rule Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global Business Rule Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGlobalBusinessRuleTask(GlobalBusinessRuleTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global Choreography Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global Choreography Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGlobalChoreographyTask(GlobalChoreographyTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global Communication</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global Communication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGlobalCommunication(GlobalCommunication object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global Manual Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global Manual Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGlobalManualTask(GlobalManualTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global Script Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global Script Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGlobalScriptTask(GlobalScriptTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGlobalTask(GlobalTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Global User Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Global User Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGlobalUserTask(GlobalUserTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGroup(Group object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Human Performer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Human Performer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHumanPerformer(HumanPerformer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Implicit Throw Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implicit Throw Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImplicitThrowEvent(ImplicitThrowEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Import</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImport(Import object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inclusive Gateway</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inclusive Gateway</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInclusiveGateway(InclusiveGateway object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Output Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Output Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputOutputBinding(InputOutputBinding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Output Specification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Output Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputOutputSpecification(InputOutputSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Input Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Input Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputSet(InputSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterface(Interface object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Intermediate Catch Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intermediate Catch Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntermediateCatchEvent(IntermediateCatchEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Intermediate Throw Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intermediate Throw Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntermediateThrowEvent(IntermediateThrowEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Item Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Item Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseItemDefinition(ItemDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLane(Lane object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lane Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lane Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLaneSet(LaneSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkEventDefinition(LinkEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Loop Characteristics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Loop Characteristics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoopCharacteristics(LoopCharacteristics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Manual Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Manual Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseManualTask(ManualTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMessage(Message object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Message Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Message Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMessageEventDefinition(MessageEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Message Flow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Message Flow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMessageFlow(MessageFlow object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Message Flow Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Message Flow Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMessageFlowAssociation(MessageFlowAssociation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monitoring</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monitoring</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonitoring(Monitoring object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multi Instance Loop Characteristics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multi Instance Loop Characteristics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiInstanceLoopCharacteristics(
            MultiInstanceLoopCharacteristics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperation(Operation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Output Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Output Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutputSet(OutputSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parallel Gateway</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parallel Gateway</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParallelGateway(ParallelGateway object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParticipant(Participant object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Participant Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Participant Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParticipantAssociation(ParticipantAssociation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Participant Multiplicity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Participant Multiplicity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParticipantMultiplicity(ParticipantMultiplicity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Partner Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Partner Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePartnerEntity(PartnerEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Partner Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Partner Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePartnerRole(PartnerRole object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Performer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Performer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerformer(Performer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Potential Owner</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Potential Owner</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePotentialOwner(PotentialOwner object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcess(org.eclipse.bpmn.Process object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(Property object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Receive Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Receive Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReceiveTask(ReceiveTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationship(Relationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rendering</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rendering</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRendering(Rendering object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResource(Resource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Assignment Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Assignment Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceAssignmentExpression(
            ResourceAssignmentExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceParameter(ResourceParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Parameter Binding</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Parameter Binding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceParameterBinding(ResourceParameterBinding object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Root Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Root Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRootElement(RootElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScript(Script object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Script Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Script Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScriptTask(ScriptTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Send Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Send Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSendTask(SendTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSequenceFlow(SequenceFlow object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceTask(ServiceTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSignal(Signal object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Signal Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Signal Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSignalEventDefinition(SignalEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Standard Loop Characteristics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Standard Loop Characteristics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStandardLoopCharacteristics(StandardLoopCharacteristics object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Start Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Start Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStartEvent(StartEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Conversation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Conversation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubConversation(SubConversation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Process</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubProcess(SubProcess object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTask(Task object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Terminate Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Terminate Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTerminateEventDefinition(TerminateEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseText(Text object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Annotation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Annotation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextAnnotation(TextAnnotation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Throw Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Throw Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThrowEvent(ThrowEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timer Event Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timer Event Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimerEventDefinition(TimerEventDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransaction(Transaction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUserTask(UserTask object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //BpmnSwitch
