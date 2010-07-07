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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn.BpmnPackage
 * @generated
 */
public class BpmnAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static BpmnPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BpmnAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = BpmnPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BpmnSwitch<Adapter> modelSwitch = new BpmnSwitch<Adapter>() {
        @Override
        public Adapter caseDocumentRoot(DocumentRoot object) {
            return createDocumentRootAdapter();
        }

        @Override
        public Adapter caseActivity(Activity object) {
            return createActivityAdapter();
        }

        @Override
        public Adapter caseActivityResource(ActivityResource object) {
            return createActivityResourceAdapter();
        }

        @Override
        public Adapter caseAdHocSubProcess(AdHocSubProcess object) {
            return createAdHocSubProcessAdapter();
        }

        @Override
        public Adapter caseArtifact(Artifact object) {
            return createArtifactAdapter();
        }

        @Override
        public Adapter caseAssignment(Assignment object) {
            return createAssignmentAdapter();
        }

        @Override
        public Adapter caseAssociation(Association object) {
            return createAssociationAdapter();
        }

        @Override
        public Adapter caseAuditing(Auditing object) {
            return createAuditingAdapter();
        }

        @Override
        public Adapter caseBaseElement(BaseElement object) {
            return createBaseElementAdapter();
        }

        @Override
        public Adapter caseBaseElementWithMixedContent(BaseElementWithMixedContent object) {
            return createBaseElementWithMixedContentAdapter();
        }

        @Override
        public Adapter caseBoundaryEvent(BoundaryEvent object) {
            return createBoundaryEventAdapter();
        }

        @Override
        public Adapter caseBusinessRuleTask(BusinessRuleTask object) {
            return createBusinessRuleTaskAdapter();
        }

        @Override
        public Adapter caseCallableElement(CallableElement object) {
            return createCallableElementAdapter();
        }

        @Override
        public Adapter caseCallActivity(CallActivity object) {
            return createCallActivityAdapter();
        }

        @Override
        public Adapter caseCallChoreographyActivity(CallChoreographyActivity object) {
            return createCallChoreographyActivityAdapter();
        }

        @Override
        public Adapter caseCallConversation(CallConversation object) {
            return createCallConversationAdapter();
        }

        @Override
        public Adapter caseCancelEventDefinition(CancelEventDefinition object) {
            return createCancelEventDefinitionAdapter();
        }

        @Override
        public Adapter caseCatchEvent(CatchEvent object) {
            return createCatchEventAdapter();
        }

        @Override
        public Adapter caseCategory(Category object) {
            return createCategoryAdapter();
        }

        @Override
        public Adapter caseCategoryValue(CategoryValue object) {
            return createCategoryValueAdapter();
        }

        @Override
        public Adapter caseChoreography(Choreography object) {
            return createChoreographyAdapter();
        }

        @Override
        public Adapter caseChoreographyActivity(ChoreographyActivity object) {
            return createChoreographyActivityAdapter();
        }

        @Override
        public Adapter caseChoreographySubProcess(ChoreographySubProcess object) {
            return createChoreographySubProcessAdapter();
        }

        @Override
        public Adapter caseChoreographyTask(ChoreographyTask object) {
            return createChoreographyTaskAdapter();
        }

        @Override
        public Adapter caseCollaboration(Collaboration object) {
            return createCollaborationAdapter();
        }

        @Override
        public Adapter caseCommunication(Communication object) {
            return createCommunicationAdapter();
        }

        @Override
        public Adapter caseCompensateEventDefinition(CompensateEventDefinition object) {
            return createCompensateEventDefinitionAdapter();
        }

        @Override
        public Adapter caseComplexBehaviorDefinition(ComplexBehaviorDefinition object) {
            return createComplexBehaviorDefinitionAdapter();
        }

        @Override
        public Adapter caseComplexGateway(ComplexGateway object) {
            return createComplexGatewayAdapter();
        }

        @Override
        public Adapter caseConditionalEventDefinition(ConditionalEventDefinition object) {
            return createConditionalEventDefinitionAdapter();
        }

        @Override
        public Adapter caseConversation(Conversation object) {
            return createConversationAdapter();
        }

        @Override
        public Adapter caseConversationAssociation(ConversationAssociation object) {
            return createConversationAssociationAdapter();
        }

        @Override
        public Adapter caseConversationNode(ConversationNode object) {
            return createConversationNodeAdapter();
        }

        @Override
        public Adapter caseCorrelationKey(CorrelationKey object) {
            return createCorrelationKeyAdapter();
        }

        @Override
        public Adapter caseCorrelationProperty(CorrelationProperty object) {
            return createCorrelationPropertyAdapter();
        }

        @Override
        public Adapter caseCorrelationPropertyBinding(CorrelationPropertyBinding object) {
            return createCorrelationPropertyBindingAdapter();
        }

        @Override
        public Adapter caseCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression object) {
            return createCorrelationPropertyRetrievalExpressionAdapter();
        }

        @Override
        public Adapter caseCorrelationSubscription(CorrelationSubscription object) {
            return createCorrelationSubscriptionAdapter();
        }

        @Override
        public Adapter caseDataAssociation(DataAssociation object) {
            return createDataAssociationAdapter();
        }

        @Override
        public Adapter caseDataInput(DataInput object) {
            return createDataInputAdapter();
        }

        @Override
        public Adapter caseDataInputAssociation(DataInputAssociation object) {
            return createDataInputAssociationAdapter();
        }

        @Override
        public Adapter caseDataObject(DataObject object) {
            return createDataObjectAdapter();
        }

        @Override
        public Adapter caseDataOutput(DataOutput object) {
            return createDataOutputAdapter();
        }

        @Override
        public Adapter caseDataOutputAssociation(DataOutputAssociation object) {
            return createDataOutputAssociationAdapter();
        }

        @Override
        public Adapter caseDataState(DataState object) {
            return createDataStateAdapter();
        }

        @Override
        public Adapter caseDataStore(DataStore object) {
            return createDataStoreAdapter();
        }

        @Override
        public Adapter caseDataStoreReference(DataStoreReference object) {
            return createDataStoreReferenceAdapter();
        }

        @Override
        public Adapter caseDefinitions(Definitions object) {
            return createDefinitionsAdapter();
        }

        @Override
        public Adapter caseDocumentation(Documentation object) {
            return createDocumentationAdapter();
        }

        @Override
        public Adapter caseEndEvent(EndEvent object) {
            return createEndEventAdapter();
        }

        @Override
        public Adapter caseEndPoint(EndPoint object) {
            return createEndPointAdapter();
        }

        @Override
        public Adapter caseError(org.eclipse.bpmn.Error object) {
            return createErrorAdapter();
        }

        @Override
        public Adapter caseErrorEventDefinition(ErrorEventDefinition object) {
            return createErrorEventDefinitionAdapter();
        }

        @Override
        public Adapter caseEscalation(Escalation object) {
            return createEscalationAdapter();
        }

        @Override
        public Adapter caseEscalationEventDefinition(EscalationEventDefinition object) {
            return createEscalationEventDefinitionAdapter();
        }

        @Override
        public Adapter caseEvent(Event object) {
            return createEventAdapter();
        }

        @Override
        public Adapter caseEventBasedGateway(EventBasedGateway object) {
            return createEventBasedGatewayAdapter();
        }

        @Override
        public Adapter caseEventDefinition(EventDefinition object) {
            return createEventDefinitionAdapter();
        }

        @Override
        public Adapter caseExclusiveGateway(ExclusiveGateway object) {
            return createExclusiveGatewayAdapter();
        }

        @Override
        public Adapter caseExpression(Expression object) {
            return createExpressionAdapter();
        }

        @Override
        public Adapter caseExtension(Extension object) {
            return createExtensionAdapter();
        }

        @Override
        public Adapter caseFlowElement(FlowElement object) {
            return createFlowElementAdapter();
        }

        @Override
        public Adapter caseFlowNode(FlowNode object) {
            return createFlowNodeAdapter();
        }

        @Override
        public Adapter caseFormalExpression(FormalExpression object) {
            return createFormalExpressionAdapter();
        }

        @Override
        public Adapter caseGateway(Gateway object) {
            return createGatewayAdapter();
        }

        @Override
        public Adapter caseGlobalBusinessRuleTask(GlobalBusinessRuleTask object) {
            return createGlobalBusinessRuleTaskAdapter();
        }

        @Override
        public Adapter caseGlobalChoreographyTask(GlobalChoreographyTask object) {
            return createGlobalChoreographyTaskAdapter();
        }

        @Override
        public Adapter caseGlobalCommunication(GlobalCommunication object) {
            return createGlobalCommunicationAdapter();
        }

        @Override
        public Adapter caseGlobalManualTask(GlobalManualTask object) {
            return createGlobalManualTaskAdapter();
        }

        @Override
        public Adapter caseGlobalScriptTask(GlobalScriptTask object) {
            return createGlobalScriptTaskAdapter();
        }

        @Override
        public Adapter caseGlobalTask(GlobalTask object) {
            return createGlobalTaskAdapter();
        }

        @Override
        public Adapter caseGlobalUserTask(GlobalUserTask object) {
            return createGlobalUserTaskAdapter();
        }

        @Override
        public Adapter caseGroup(Group object) {
            return createGroupAdapter();
        }

        @Override
        public Adapter caseHumanPerformer(HumanPerformer object) {
            return createHumanPerformerAdapter();
        }

        @Override
        public Adapter caseImplicitThrowEvent(ImplicitThrowEvent object) {
            return createImplicitThrowEventAdapter();
        }

        @Override
        public Adapter caseImport(Import object) {
            return createImportAdapter();
        }

        @Override
        public Adapter caseInclusiveGateway(InclusiveGateway object) {
            return createInclusiveGatewayAdapter();
        }

        @Override
        public Adapter caseInputOutputBinding(InputOutputBinding object) {
            return createInputOutputBindingAdapter();
        }

        @Override
        public Adapter caseInputOutputSpecification(InputOutputSpecification object) {
            return createInputOutputSpecificationAdapter();
        }

        @Override
        public Adapter caseInputSet(InputSet object) {
            return createInputSetAdapter();
        }

        @Override
        public Adapter caseInterface(Interface object) {
            return createInterfaceAdapter();
        }

        @Override
        public Adapter caseIntermediateCatchEvent(IntermediateCatchEvent object) {
            return createIntermediateCatchEventAdapter();
        }

        @Override
        public Adapter caseIntermediateThrowEvent(IntermediateThrowEvent object) {
            return createIntermediateThrowEventAdapter();
        }

        @Override
        public Adapter caseItemDefinition(ItemDefinition object) {
            return createItemDefinitionAdapter();
        }

        @Override
        public Adapter caseLane(Lane object) {
            return createLaneAdapter();
        }

        @Override
        public Adapter caseLaneSet(LaneSet object) {
            return createLaneSetAdapter();
        }

        @Override
        public Adapter caseLinkEventDefinition(LinkEventDefinition object) {
            return createLinkEventDefinitionAdapter();
        }

        @Override
        public Adapter caseLoopCharacteristics(LoopCharacteristics object) {
            return createLoopCharacteristicsAdapter();
        }

        @Override
        public Adapter caseManualTask(ManualTask object) {
            return createManualTaskAdapter();
        }

        @Override
        public Adapter caseMessage(Message object) {
            return createMessageAdapter();
        }

        @Override
        public Adapter caseMessageEventDefinition(MessageEventDefinition object) {
            return createMessageEventDefinitionAdapter();
        }

        @Override
        public Adapter caseMessageFlow(MessageFlow object) {
            return createMessageFlowAdapter();
        }

        @Override
        public Adapter caseMessageFlowAssociation(MessageFlowAssociation object) {
            return createMessageFlowAssociationAdapter();
        }

        @Override
        public Adapter caseMonitoring(Monitoring object) {
            return createMonitoringAdapter();
        }

        @Override
        public Adapter caseMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics object) {
            return createMultiInstanceLoopCharacteristicsAdapter();
        }

        @Override
        public Adapter caseOperation(Operation object) {
            return createOperationAdapter();
        }

        @Override
        public Adapter caseOutputSet(OutputSet object) {
            return createOutputSetAdapter();
        }

        @Override
        public Adapter caseParallelGateway(ParallelGateway object) {
            return createParallelGatewayAdapter();
        }

        @Override
        public Adapter caseParticipant(Participant object) {
            return createParticipantAdapter();
        }

        @Override
        public Adapter caseParticipantAssociation(ParticipantAssociation object) {
            return createParticipantAssociationAdapter();
        }

        @Override
        public Adapter caseParticipantMultiplicity(ParticipantMultiplicity object) {
            return createParticipantMultiplicityAdapter();
        }

        @Override
        public Adapter casePartnerEntity(PartnerEntity object) {
            return createPartnerEntityAdapter();
        }

        @Override
        public Adapter casePartnerRole(PartnerRole object) {
            return createPartnerRoleAdapter();
        }

        @Override
        public Adapter casePerformer(Performer object) {
            return createPerformerAdapter();
        }

        @Override
        public Adapter casePotentialOwner(PotentialOwner object) {
            return createPotentialOwnerAdapter();
        }

        @Override
        public Adapter caseProcess(org.eclipse.bpmn.Process object) {
            return createProcessAdapter();
        }

        @Override
        public Adapter caseProperty(Property object) {
            return createPropertyAdapter();
        }

        @Override
        public Adapter caseReceiveTask(ReceiveTask object) {
            return createReceiveTaskAdapter();
        }

        @Override
        public Adapter caseRelationship(Relationship object) {
            return createRelationshipAdapter();
        }

        @Override
        public Adapter caseRendering(Rendering object) {
            return createRenderingAdapter();
        }

        @Override
        public Adapter caseResource(Resource object) {
            return createResourceAdapter();
        }

        @Override
        public Adapter caseResourceAssignmentExpression(ResourceAssignmentExpression object) {
            return createResourceAssignmentExpressionAdapter();
        }

        @Override
        public Adapter caseResourceParameter(ResourceParameter object) {
            return createResourceParameterAdapter();
        }

        @Override
        public Adapter caseResourceParameterBinding(ResourceParameterBinding object) {
            return createResourceParameterBindingAdapter();
        }

        @Override
        public Adapter caseRootElement(RootElement object) {
            return createRootElementAdapter();
        }

        @Override
        public Adapter caseScript(Script object) {
            return createScriptAdapter();
        }

        @Override
        public Adapter caseScriptTask(ScriptTask object) {
            return createScriptTaskAdapter();
        }

        @Override
        public Adapter caseSendTask(SendTask object) {
            return createSendTaskAdapter();
        }

        @Override
        public Adapter caseSequenceFlow(SequenceFlow object) {
            return createSequenceFlowAdapter();
        }

        @Override
        public Adapter caseServiceTask(ServiceTask object) {
            return createServiceTaskAdapter();
        }

        @Override
        public Adapter caseSignal(Signal object) {
            return createSignalAdapter();
        }

        @Override
        public Adapter caseSignalEventDefinition(SignalEventDefinition object) {
            return createSignalEventDefinitionAdapter();
        }

        @Override
        public Adapter caseStandardLoopCharacteristics(StandardLoopCharacteristics object) {
            return createStandardLoopCharacteristicsAdapter();
        }

        @Override
        public Adapter caseStartEvent(StartEvent object) {
            return createStartEventAdapter();
        }

        @Override
        public Adapter caseSubConversation(SubConversation object) {
            return createSubConversationAdapter();
        }

        @Override
        public Adapter caseSubProcess(SubProcess object) {
            return createSubProcessAdapter();
        }

        @Override
        public Adapter caseTask(Task object) {
            return createTaskAdapter();
        }

        @Override
        public Adapter caseTerminateEventDefinition(TerminateEventDefinition object) {
            return createTerminateEventDefinitionAdapter();
        }

        @Override
        public Adapter caseText(Text object) {
            return createTextAdapter();
        }

        @Override
        public Adapter caseTextAnnotation(TextAnnotation object) {
            return createTextAnnotationAdapter();
        }

        @Override
        public Adapter caseThrowEvent(ThrowEvent object) {
            return createThrowEventAdapter();
        }

        @Override
        public Adapter caseTimerEventDefinition(TimerEventDefinition object) {
            return createTimerEventDefinitionAdapter();
        }

        @Override
        public Adapter caseTransaction(Transaction object) {
            return createTransactionAdapter();
        }

        @Override
        public Adapter caseUserTask(UserTask object) {
            return createUserTaskAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Activity
     * @generated
     */
    public Adapter createActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ActivityResource <em>Activity Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ActivityResource
     * @generated
     */
    public Adapter createActivityResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.AdHocSubProcess
     * @generated
     */
    public Adapter createAdHocSubProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Artifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Artifact
     * @generated
     */
    public Adapter createArtifactAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Assignment
     * @generated
     */
    public Adapter createAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Association
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Auditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Auditing
     * @generated
     */
    public Adapter createAuditingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.BaseElement
     * @generated
     */
    public Adapter createBaseElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.BaseElementWithMixedContent <em>Base Element With Mixed Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.BaseElementWithMixedContent
     * @generated
     */
    public Adapter createBaseElementWithMixedContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.BoundaryEvent <em>Boundary Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.BoundaryEvent
     * @generated
     */
    public Adapter createBoundaryEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.BusinessRuleTask <em>Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.BusinessRuleTask
     * @generated
     */
    public Adapter createBusinessRuleTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CallableElement
     * @generated
     */
    public Adapter createCallableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CallActivity <em>Call Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CallActivity
     * @generated
     */
    public Adapter createCallActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CallChoreographyActivity <em>Call Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CallChoreographyActivity
     * @generated
     */
    public Adapter createCallChoreographyActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CallConversation <em>Call Conversation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CallConversation
     * @generated
     */
    public Adapter createCallConversationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CancelEventDefinition <em>Cancel Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CancelEventDefinition
     * @generated
     */
    public Adapter createCancelEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CatchEvent <em>Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CatchEvent
     * @generated
     */
    public Adapter createCatchEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Category <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Category
     * @generated
     */
    public Adapter createCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CategoryValue
     * @generated
     */
    public Adapter createCategoryValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Choreography <em>Choreography</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Choreography
     * @generated
     */
    public Adapter createChoreographyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ChoreographyActivity <em>Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ChoreographyActivity
     * @generated
     */
    public Adapter createChoreographyActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ChoreographySubProcess <em>Choreography Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ChoreographySubProcess
     * @generated
     */
    public Adapter createChoreographySubProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ChoreographyTask <em>Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ChoreographyTask
     * @generated
     */
    public Adapter createChoreographyTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Collaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Collaboration
     * @generated
     */
    public Adapter createCollaborationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Communication <em>Communication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Communication
     * @generated
     */
    public Adapter createCommunicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CompensateEventDefinition
     * @generated
     */
    public Adapter createCompensateEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ComplexBehaviorDefinition
     * @generated
     */
    public Adapter createComplexBehaviorDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ComplexGateway <em>Complex Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ComplexGateway
     * @generated
     */
    public Adapter createComplexGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ConditionalEventDefinition
     * @generated
     */
    public Adapter createConditionalEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Conversation <em>Conversation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Conversation
     * @generated
     */
    public Adapter createConversationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ConversationAssociation <em>Conversation Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ConversationAssociation
     * @generated
     */
    public Adapter createConversationAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ConversationNode <em>Conversation Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ConversationNode
     * @generated
     */
    public Adapter createConversationNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CorrelationKey <em>Correlation Key</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CorrelationKey
     * @generated
     */
    public Adapter createCorrelationKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CorrelationProperty <em>Correlation Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CorrelationProperty
     * @generated
     */
    public Adapter createCorrelationPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CorrelationPropertyBinding
     * @generated
     */
    public Adapter createCorrelationPropertyBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CorrelationPropertyRetrievalExpression
     * @generated
     */
    public Adapter createCorrelationPropertyRetrievalExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.CorrelationSubscription <em>Correlation Subscription</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.CorrelationSubscription
     * @generated
     */
    public Adapter createCorrelationSubscriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DataAssociation <em>Data Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DataAssociation
     * @generated
     */
    public Adapter createDataAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DataInput
     * @generated
     */
    public Adapter createDataInputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DataInputAssociation
     * @generated
     */
    public Adapter createDataInputAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DataObject
     * @generated
     */
    public Adapter createDataObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DataOutput
     * @generated
     */
    public Adapter createDataOutputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DataOutputAssociation
     * @generated
     */
    public Adapter createDataOutputAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DataState
     * @generated
     */
    public Adapter createDataStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DataStore <em>Data Store</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DataStore
     * @generated
     */
    public Adapter createDataStoreAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.DataStoreReference <em>Data Store Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.DataStoreReference
     * @generated
     */
    public Adapter createDataStoreReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Definitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Definitions
     * @generated
     */
    public Adapter createDefinitionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Documentation
     * @generated
     */
    public Adapter createDocumentationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.EndEvent <em>End Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.EndEvent
     * @generated
     */
    public Adapter createEndEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.EndPoint <em>End Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.EndPoint
     * @generated
     */
    public Adapter createEndPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Error <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Error
     * @generated
     */
    public Adapter createErrorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ErrorEventDefinition <em>Error Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ErrorEventDefinition
     * @generated
     */
    public Adapter createErrorEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Escalation <em>Escalation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Escalation
     * @generated
     */
    public Adapter createEscalationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.EscalationEventDefinition
     * @generated
     */
    public Adapter createEscalationEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Event
     * @generated
     */
    public Adapter createEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.EventBasedGateway <em>Event Based Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.EventBasedGateway
     * @generated
     */
    public Adapter createEventBasedGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.EventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.EventDefinition
     * @generated
     */
    public Adapter createEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ExclusiveGateway <em>Exclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ExclusiveGateway
     * @generated
     */
    public Adapter createExclusiveGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Extension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Extension
     * @generated
     */
    public Adapter createExtensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.FlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.FlowElement
     * @generated
     */
    public Adapter createFlowElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.FlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.FlowNode
     * @generated
     */
    public Adapter createFlowNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.FormalExpression <em>Formal Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.FormalExpression
     * @generated
     */
    public Adapter createFormalExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Gateway <em>Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Gateway
     * @generated
     */
    public Adapter createGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.GlobalBusinessRuleTask
     * @generated
     */
    public Adapter createGlobalBusinessRuleTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.GlobalChoreographyTask
     * @generated
     */
    public Adapter createGlobalChoreographyTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.GlobalCommunication <em>Global Communication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.GlobalCommunication
     * @generated
     */
    public Adapter createGlobalCommunicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.GlobalManualTask <em>Global Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.GlobalManualTask
     * @generated
     */
    public Adapter createGlobalManualTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.GlobalScriptTask <em>Global Script Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.GlobalScriptTask
     * @generated
     */
    public Adapter createGlobalScriptTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.GlobalTask <em>Global Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.GlobalTask
     * @generated
     */
    public Adapter createGlobalTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.GlobalUserTask <em>Global User Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.GlobalUserTask
     * @generated
     */
    public Adapter createGlobalUserTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Group <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Group
     * @generated
     */
    public Adapter createGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.HumanPerformer <em>Human Performer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.HumanPerformer
     * @generated
     */
    public Adapter createHumanPerformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ImplicitThrowEvent <em>Implicit Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ImplicitThrowEvent
     * @generated
     */
    public Adapter createImplicitThrowEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Import <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Import
     * @generated
     */
    public Adapter createImportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.InclusiveGateway <em>Inclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.InclusiveGateway
     * @generated
     */
    public Adapter createInclusiveGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.InputOutputBinding <em>Input Output Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.InputOutputBinding
     * @generated
     */
    public Adapter createInputOutputBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.InputOutputSpecification <em>Input Output Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.InputOutputSpecification
     * @generated
     */
    public Adapter createInputOutputSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.InputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.InputSet
     * @generated
     */
    public Adapter createInputSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Interface
     * @generated
     */
    public Adapter createInterfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.IntermediateCatchEvent
     * @generated
     */
    public Adapter createIntermediateCatchEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.IntermediateThrowEvent
     * @generated
     */
    public Adapter createIntermediateThrowEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ItemDefinition <em>Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ItemDefinition
     * @generated
     */
    public Adapter createItemDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Lane <em>Lane</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Lane
     * @generated
     */
    public Adapter createLaneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.LaneSet <em>Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.LaneSet
     * @generated
     */
    public Adapter createLaneSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.LinkEventDefinition <em>Link Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.LinkEventDefinition
     * @generated
     */
    public Adapter createLinkEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.LoopCharacteristics <em>Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.LoopCharacteristics
     * @generated
     */
    public Adapter createLoopCharacteristicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ManualTask <em>Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ManualTask
     * @generated
     */
    public Adapter createManualTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Message <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Message
     * @generated
     */
    public Adapter createMessageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.MessageEventDefinition <em>Message Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.MessageEventDefinition
     * @generated
     */
    public Adapter createMessageEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.MessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.MessageFlow
     * @generated
     */
    public Adapter createMessageFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.MessageFlowAssociation <em>Message Flow Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.MessageFlowAssociation
     * @generated
     */
    public Adapter createMessageFlowAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Monitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Monitoring
     * @generated
     */
    public Adapter createMonitoringAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.MultiInstanceLoopCharacteristics
     * @generated
     */
    public Adapter createMultiInstanceLoopCharacteristicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Operation
     * @generated
     */
    public Adapter createOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.OutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.OutputSet
     * @generated
     */
    public Adapter createOutputSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ParallelGateway <em>Parallel Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ParallelGateway
     * @generated
     */
    public Adapter createParallelGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Participant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Participant
     * @generated
     */
    public Adapter createParticipantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ParticipantAssociation <em>Participant Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ParticipantAssociation
     * @generated
     */
    public Adapter createParticipantAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ParticipantMultiplicity
     * @generated
     */
    public Adapter createParticipantMultiplicityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.PartnerEntity <em>Partner Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.PartnerEntity
     * @generated
     */
    public Adapter createPartnerEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.PartnerRole <em>Partner Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.PartnerRole
     * @generated
     */
    public Adapter createPartnerRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Performer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Performer
     * @generated
     */
    public Adapter createPerformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.PotentialOwner <em>Potential Owner</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.PotentialOwner
     * @generated
     */
    public Adapter createPotentialOwnerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Process
     * @generated
     */
    public Adapter createProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ReceiveTask <em>Receive Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ReceiveTask
     * @generated
     */
    public Adapter createReceiveTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Relationship
     * @generated
     */
    public Adapter createRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Rendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Rendering
     * @generated
     */
    public Adapter createRenderingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Resource
     * @generated
     */
    public Adapter createResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ResourceAssignmentExpression
     * @generated
     */
    public Adapter createResourceAssignmentExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ResourceParameter <em>Resource Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ResourceParameter
     * @generated
     */
    public Adapter createResourceParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ResourceParameterBinding <em>Resource Parameter Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ResourceParameterBinding
     * @generated
     */
    public Adapter createResourceParameterBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.RootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.RootElement
     * @generated
     */
    public Adapter createRootElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Script <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Script
     * @generated
     */
    public Adapter createScriptAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ScriptTask <em>Script Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ScriptTask
     * @generated
     */
    public Adapter createScriptTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.SendTask <em>Send Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.SendTask
     * @generated
     */
    public Adapter createSendTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.SequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.SequenceFlow
     * @generated
     */
    public Adapter createSequenceFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ServiceTask <em>Service Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ServiceTask
     * @generated
     */
    public Adapter createServiceTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Signal
     * @generated
     */
    public Adapter createSignalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.SignalEventDefinition <em>Signal Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.SignalEventDefinition
     * @generated
     */
    public Adapter createSignalEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.StandardLoopCharacteristics
     * @generated
     */
    public Adapter createStandardLoopCharacteristicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.StartEvent <em>Start Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.StartEvent
     * @generated
     */
    public Adapter createStartEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.SubConversation <em>Sub Conversation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.SubConversation
     * @generated
     */
    public Adapter createSubConversationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.SubProcess <em>Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.SubProcess
     * @generated
     */
    public Adapter createSubProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Task
     * @generated
     */
    public Adapter createTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.TerminateEventDefinition
     * @generated
     */
    public Adapter createTerminateEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Text <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Text
     * @generated
     */
    public Adapter createTextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.TextAnnotation <em>Text Annotation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.TextAnnotation
     * @generated
     */
    public Adapter createTextAnnotationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.ThrowEvent <em>Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.ThrowEvent
     * @generated
     */
    public Adapter createThrowEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.TimerEventDefinition <em>Timer Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.TimerEventDefinition
     * @generated
     */
    public Adapter createTimerEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.Transaction <em>Transaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.Transaction
     * @generated
     */
    public Adapter createTransactionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.bpmn.UserTask <em>User Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.bpmn.UserTask
     * @generated
     */
    public Adapter createUserTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //BpmnAdapterFactory
