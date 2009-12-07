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
package org.eclipse.mdt.bpmn2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdt.bpmn2.Activity;
import org.eclipse.mdt.bpmn2.AdHocSubProcess;
import org.eclipse.mdt.bpmn2.Artifact;
import org.eclipse.mdt.bpmn2.Assignment;
import org.eclipse.mdt.bpmn2.Association;
import org.eclipse.mdt.bpmn2.Auditing;
import org.eclipse.mdt.bpmn2.BaseElement;
import org.eclipse.mdt.bpmn2.BaseElementWithMixedContent;
import org.eclipse.mdt.bpmn2.BoundaryEvent;
import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.BusinessRuleTask;
import org.eclipse.mdt.bpmn2.CallActivity;
import org.eclipse.mdt.bpmn2.CallChoreographyActivity;
import org.eclipse.mdt.bpmn2.CallableElement;
import org.eclipse.mdt.bpmn2.CancelEventDefinition;
import org.eclipse.mdt.bpmn2.CatchEvent;
import org.eclipse.mdt.bpmn2.Category;
import org.eclipse.mdt.bpmn2.CategoryValue;
import org.eclipse.mdt.bpmn2.Choreography;
import org.eclipse.mdt.bpmn2.ChoreographyActivity;
import org.eclipse.mdt.bpmn2.ChoreographySubProcess;
import org.eclipse.mdt.bpmn2.ChoreographyTask;
import org.eclipse.mdt.bpmn2.Collaboration;
import org.eclipse.mdt.bpmn2.CompensateEventDefinition;
import org.eclipse.mdt.bpmn2.ComplexGateway;
import org.eclipse.mdt.bpmn2.ConditionalEventDefinition;
import org.eclipse.mdt.bpmn2.Conversation;
import org.eclipse.mdt.bpmn2.ConversationLink;
import org.eclipse.mdt.bpmn2.ConversationView;
import org.eclipse.mdt.bpmn2.CorrelationKey;
import org.eclipse.mdt.bpmn2.CorrelationProperty;
import org.eclipse.mdt.bpmn2.CorrelationPropertyRetrievalExpression;
import org.eclipse.mdt.bpmn2.CorrelationSet;
import org.eclipse.mdt.bpmn2.DataAssociation;
import org.eclipse.mdt.bpmn2.DataInput;
import org.eclipse.mdt.bpmn2.DataInputAssociation;
import org.eclipse.mdt.bpmn2.DataObject;
import org.eclipse.mdt.bpmn2.DataObjectState;
import org.eclipse.mdt.bpmn2.DataOutput;
import org.eclipse.mdt.bpmn2.DataOutputAssociation;
import org.eclipse.mdt.bpmn2.Definitions;
import org.eclipse.mdt.bpmn2.DocumentRoot;
import org.eclipse.mdt.bpmn2.Documentation;
import org.eclipse.mdt.bpmn2.EndEvent;
import org.eclipse.mdt.bpmn2.EndPoint;
import org.eclipse.mdt.bpmn2.Entity;
import org.eclipse.mdt.bpmn2.ErrorEventDefinition;
import org.eclipse.mdt.bpmn2.Escalation;
import org.eclipse.mdt.bpmn2.EscalationEventDefinition;
import org.eclipse.mdt.bpmn2.Event;
import org.eclipse.mdt.bpmn2.EventBasedGateway;
import org.eclipse.mdt.bpmn2.EventDefinition;
import org.eclipse.mdt.bpmn2.ExclusiveGateway;
import org.eclipse.mdt.bpmn2.Expression;
import org.eclipse.mdt.bpmn2.Extension;
import org.eclipse.mdt.bpmn2.FlowElement;
import org.eclipse.mdt.bpmn2.FlowNode;
import org.eclipse.mdt.bpmn2.FormalExpression;
import org.eclipse.mdt.bpmn2.Gateway;
import org.eclipse.mdt.bpmn2.GlobalBusinessRuleTask;
import org.eclipse.mdt.bpmn2.GlobalChoreographyTask;
import org.eclipse.mdt.bpmn2.GlobalManualTask;
import org.eclipse.mdt.bpmn2.GlobalScriptTask;
import org.eclipse.mdt.bpmn2.GlobalTask;
import org.eclipse.mdt.bpmn2.GlobalUserTask;
import org.eclipse.mdt.bpmn2.Group;
import org.eclipse.mdt.bpmn2.Handler;
import org.eclipse.mdt.bpmn2.HumanPerformer;
import org.eclipse.mdt.bpmn2.Import;
import org.eclipse.mdt.bpmn2.InclusiveGateway;
import org.eclipse.mdt.bpmn2.InputOutputBinding;
import org.eclipse.mdt.bpmn2.InputOutputSpecification;
import org.eclipse.mdt.bpmn2.InputSet;
import org.eclipse.mdt.bpmn2.Interface;
import org.eclipse.mdt.bpmn2.IntermediateCatchEvent;
import org.eclipse.mdt.bpmn2.IntermediateThrowEvent;
import org.eclipse.mdt.bpmn2.Lane;
import org.eclipse.mdt.bpmn2.LaneSet;
import org.eclipse.mdt.bpmn2.LinkEventDefinition;
import org.eclipse.mdt.bpmn2.LoopCharacteristics;
import org.eclipse.mdt.bpmn2.ManualTask;
import org.eclipse.mdt.bpmn2.Message;
import org.eclipse.mdt.bpmn2.MessageEventDefinition;
import org.eclipse.mdt.bpmn2.MessageFlow;
import org.eclipse.mdt.bpmn2.Monitoring;
import org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics;
import org.eclipse.mdt.bpmn2.Operation;
import org.eclipse.mdt.bpmn2.OutputSet;
import org.eclipse.mdt.bpmn2.ParallelGateway;
import org.eclipse.mdt.bpmn2.Parameter;
import org.eclipse.mdt.bpmn2.ParameterBinding;
import org.eclipse.mdt.bpmn2.Participant;
import org.eclipse.mdt.bpmn2.ParticipantMultiplicity;
import org.eclipse.mdt.bpmn2.PeopleAssignment;
import org.eclipse.mdt.bpmn2.PeopleAssignmentExpression;
import org.eclipse.mdt.bpmn2.PeopleAssignmentLiteral;
import org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup;
import org.eclipse.mdt.bpmn2.PeopleGroup;
import org.eclipse.mdt.bpmn2.Performer;
import org.eclipse.mdt.bpmn2.PotentialOwner;
import org.eclipse.mdt.bpmn2.ProcessRole;
import org.eclipse.mdt.bpmn2.Property;
import org.eclipse.mdt.bpmn2.ReceiveTask;
import org.eclipse.mdt.bpmn2.Relationship;
import org.eclipse.mdt.bpmn2.Rendering;
import org.eclipse.mdt.bpmn2.Role;
import org.eclipse.mdt.bpmn2.RootElement;
import org.eclipse.mdt.bpmn2.Script;
import org.eclipse.mdt.bpmn2.ScriptTask;
import org.eclipse.mdt.bpmn2.SendTask;
import org.eclipse.mdt.bpmn2.SequenceFlow;
import org.eclipse.mdt.bpmn2.ServiceReference;
import org.eclipse.mdt.bpmn2.ServiceTask;
import org.eclipse.mdt.bpmn2.Signal;
import org.eclipse.mdt.bpmn2.SignalEventDefinition;
import org.eclipse.mdt.bpmn2.StandardLoopCharacteristics;
import org.eclipse.mdt.bpmn2.StartEvent;
import org.eclipse.mdt.bpmn2.StructureDefinition;
import org.eclipse.mdt.bpmn2.SubProcess;
import org.eclipse.mdt.bpmn2.Task;
import org.eclipse.mdt.bpmn2.TerminateEventDefinition;
import org.eclipse.mdt.bpmn2.Text;
import org.eclipse.mdt.bpmn2.TextAnnotation;
import org.eclipse.mdt.bpmn2.ThrowEvent;
import org.eclipse.mdt.bpmn2.TimerEventDefinition;
import org.eclipse.mdt.bpmn2.Transaction;
import org.eclipse.mdt.bpmn2.UserTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package
 * @generated
 */
public class Bpmn2AdapterFactory extends AdapterFactoryImpl {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static Bpmn2Package modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bpmn2AdapterFactory() {
        if (modelPackage == null) {
            modelPackage = Bpmn2Package.eINSTANCE;
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
    protected Bpmn2Switch<Adapter> modelSwitch = new Bpmn2Switch<Adapter>() {
        @Override
        public Adapter caseDocumentRoot(DocumentRoot object) {
            return createDocumentRootAdapter();
        }

        @Override
        public Adapter caseActivity(Activity object) {
            return createActivityAdapter();
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
        public Adapter caseBaseElementWithMixedContent(
                BaseElementWithMixedContent object) {
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
        public Adapter caseCallChoreographyActivity(
                CallChoreographyActivity object) {
            return createCallChoreographyActivityAdapter();
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
        public Adapter caseCompensateEventDefinition(
                CompensateEventDefinition object) {
            return createCompensateEventDefinitionAdapter();
        }

        @Override
        public Adapter caseComplexGateway(ComplexGateway object) {
            return createComplexGatewayAdapter();
        }

        @Override
        public Adapter caseConditionalEventDefinition(
                ConditionalEventDefinition object) {
            return createConditionalEventDefinitionAdapter();
        }

        @Override
        public Adapter caseConversation(Conversation object) {
            return createConversationAdapter();
        }

        @Override
        public Adapter caseConversationLink(ConversationLink object) {
            return createConversationLinkAdapter();
        }

        @Override
        public Adapter caseConversationView(ConversationView object) {
            return createConversationViewAdapter();
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
        public Adapter caseCorrelationPropertyRetrievalExpression(
                CorrelationPropertyRetrievalExpression object) {
            return createCorrelationPropertyRetrievalExpressionAdapter();
        }

        @Override
        public Adapter caseCorrelationSet(CorrelationSet object) {
            return createCorrelationSetAdapter();
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
        public Adapter caseDataObjectState(DataObjectState object) {
            return createDataObjectStateAdapter();
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
        public Adapter caseEntity(Entity object) {
            return createEntityAdapter();
        }

        @Override
        public Adapter caseError(org.eclipse.mdt.bpmn2.Error object) {
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
        public Adapter caseEscalationEventDefinition(
                EscalationEventDefinition object) {
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
        public Adapter caseHandler(Handler object) {
            return createHandlerAdapter();
        }

        @Override
        public Adapter caseHumanPerformer(HumanPerformer object) {
            return createHumanPerformerAdapter();
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
        public Adapter caseInputOutputSpecification(
                InputOutputSpecification object) {
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
        public Adapter caseMonitoring(Monitoring object) {
            return createMonitoringAdapter();
        }

        @Override
        public Adapter caseMultiInstanceLoopCharacteristics(
                MultiInstanceLoopCharacteristics object) {
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
        public Adapter caseParameter(Parameter object) {
            return createParameterAdapter();
        }

        @Override
        public Adapter caseParameterBinding(ParameterBinding object) {
            return createParameterBindingAdapter();
        }

        @Override
        public Adapter caseParticipant(Participant object) {
            return createParticipantAdapter();
        }

        @Override
        public Adapter caseParticipantMultiplicity(
                ParticipantMultiplicity object) {
            return createParticipantMultiplicityAdapter();
        }

        @Override
        public Adapter casePeopleAssignment(PeopleAssignment object) {
            return createPeopleAssignmentAdapter();
        }

        @Override
        public Adapter casePeopleAssignmentExpression(
                PeopleAssignmentExpression object) {
            return createPeopleAssignmentExpressionAdapter();
        }

        @Override
        public Adapter casePeopleAssignmentLiteral(
                PeopleAssignmentLiteral object) {
            return createPeopleAssignmentLiteralAdapter();
        }

        @Override
        public Adapter casePeopleAssignmentPeopleGroup(
                PeopleAssignmentPeopleGroup object) {
            return createPeopleAssignmentPeopleGroupAdapter();
        }

        @Override
        public Adapter casePeopleGroup(PeopleGroup object) {
            return createPeopleGroupAdapter();
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
        public Adapter caseProcess(org.eclipse.mdt.bpmn2.Process object) {
            return createProcessAdapter();
        }

        @Override
        public Adapter caseProcessRole(ProcessRole object) {
            return createProcessRoleAdapter();
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
        public Adapter caseRole(Role object) {
            return createRoleAdapter();
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
        public Adapter caseServiceReference(ServiceReference object) {
            return createServiceReferenceAdapter();
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
        public Adapter caseStandardLoopCharacteristics(
                StandardLoopCharacteristics object) {
            return createStandardLoopCharacteristicsAdapter();
        }

        @Override
        public Adapter caseStartEvent(StartEvent object) {
            return createStartEventAdapter();
        }

        @Override
        public Adapter caseStructureDefinition(StructureDefinition object) {
            return createStructureDefinitionAdapter();
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
        public Adapter caseTerminateEventDefinition(
                TerminateEventDefinition object) {
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
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Activity
     * @generated
     */
    public Adapter createActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.AdHocSubProcess
     * @generated
     */
    public Adapter createAdHocSubProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Artifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Artifact
     * @generated
     */
    public Adapter createArtifactAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Assignment
     * @generated
     */
    public Adapter createAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Association
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Auditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Auditing
     * @generated
     */
    public Adapter createAuditingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.BaseElement
     * @generated
     */
    public Adapter createBaseElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.BaseElementWithMixedContent <em>Base Element With Mixed Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.BaseElementWithMixedContent
     * @generated
     */
    public Adapter createBaseElementWithMixedContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.BoundaryEvent <em>Boundary Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.BoundaryEvent
     * @generated
     */
    public Adapter createBoundaryEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.BusinessRuleTask <em>Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.BusinessRuleTask
     * @generated
     */
    public Adapter createBusinessRuleTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CallableElement
     * @generated
     */
    public Adapter createCallableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CallActivity <em>Call Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CallActivity
     * @generated
     */
    public Adapter createCallActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CallChoreographyActivity <em>Call Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CallChoreographyActivity
     * @generated
     */
    public Adapter createCallChoreographyActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CancelEventDefinition <em>Cancel Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CancelEventDefinition
     * @generated
     */
    public Adapter createCancelEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CatchEvent <em>Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CatchEvent
     * @generated
     */
    public Adapter createCatchEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Category <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Category
     * @generated
     */
    public Adapter createCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CategoryValue
     * @generated
     */
    public Adapter createCategoryValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Choreography <em>Choreography</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Choreography
     * @generated
     */
    public Adapter createChoreographyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ChoreographyActivity <em>Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ChoreographyActivity
     * @generated
     */
    public Adapter createChoreographyActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ChoreographySubProcess <em>Choreography Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ChoreographySubProcess
     * @generated
     */
    public Adapter createChoreographySubProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ChoreographyTask <em>Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ChoreographyTask
     * @generated
     */
    public Adapter createChoreographyTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Collaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Collaboration
     * @generated
     */
    public Adapter createCollaborationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CompensateEventDefinition
     * @generated
     */
    public Adapter createCompensateEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ComplexGateway <em>Complex Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ComplexGateway
     * @generated
     */
    public Adapter createComplexGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ConditionalEventDefinition
     * @generated
     */
    public Adapter createConditionalEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Conversation <em>Conversation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Conversation
     * @generated
     */
    public Adapter createConversationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ConversationLink <em>Conversation Link</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ConversationLink
     * @generated
     */
    public Adapter createConversationLinkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ConversationView <em>Conversation View</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ConversationView
     * @generated
     */
    public Adapter createConversationViewAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CorrelationKey <em>Correlation Key</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CorrelationKey
     * @generated
     */
    public Adapter createCorrelationKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CorrelationProperty <em>Correlation Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CorrelationProperty
     * @generated
     */
    public Adapter createCorrelationPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CorrelationPropertyRetrievalExpression
     * @generated
     */
    public Adapter createCorrelationPropertyRetrievalExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.CorrelationSet <em>Correlation Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.CorrelationSet
     * @generated
     */
    public Adapter createCorrelationSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.DataAssociation <em>Data Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.DataAssociation
     * @generated
     */
    public Adapter createDataAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.DataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.DataInput
     * @generated
     */
    public Adapter createDataInputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.DataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.DataInputAssociation
     * @generated
     */
    public Adapter createDataInputAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.DataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.DataObject
     * @generated
     */
    public Adapter createDataObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.DataObjectState <em>Data Object State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.DataObjectState
     * @generated
     */
    public Adapter createDataObjectStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.DataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.DataOutput
     * @generated
     */
    public Adapter createDataOutputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.DataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.DataOutputAssociation
     * @generated
     */
    public Adapter createDataOutputAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Definitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Definitions
     * @generated
     */
    public Adapter createDefinitionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Documentation
     * @generated
     */
    public Adapter createDocumentationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.EndEvent <em>End Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.EndEvent
     * @generated
     */
    public Adapter createEndEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.EndPoint <em>End Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.EndPoint
     * @generated
     */
    public Adapter createEndPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Entity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Error <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Error
     * @generated
     */
    public Adapter createErrorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ErrorEventDefinition <em>Error Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ErrorEventDefinition
     * @generated
     */
    public Adapter createErrorEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Escalation <em>Escalation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Escalation
     * @generated
     */
    public Adapter createEscalationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.EscalationEventDefinition
     * @generated
     */
    public Adapter createEscalationEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Event
     * @generated
     */
    public Adapter createEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.EventBasedGateway <em>Event Based Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.EventBasedGateway
     * @generated
     */
    public Adapter createEventBasedGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.EventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.EventDefinition
     * @generated
     */
    public Adapter createEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ExclusiveGateway <em>Exclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ExclusiveGateway
     * @generated
     */
    public Adapter createExclusiveGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Extension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Extension
     * @generated
     */
    public Adapter createExtensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.FlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.FlowElement
     * @generated
     */
    public Adapter createFlowElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.FlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.FlowNode
     * @generated
     */
    public Adapter createFlowNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.FormalExpression <em>Formal Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.FormalExpression
     * @generated
     */
    public Adapter createFormalExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Gateway <em>Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Gateway
     * @generated
     */
    public Adapter createGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.GlobalBusinessRuleTask
     * @generated
     */
    public Adapter createGlobalBusinessRuleTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.GlobalChoreographyTask
     * @generated
     */
    public Adapter createGlobalChoreographyTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.GlobalManualTask <em>Global Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.GlobalManualTask
     * @generated
     */
    public Adapter createGlobalManualTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.GlobalScriptTask <em>Global Script Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.GlobalScriptTask
     * @generated
     */
    public Adapter createGlobalScriptTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.GlobalTask <em>Global Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.GlobalTask
     * @generated
     */
    public Adapter createGlobalTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.GlobalUserTask <em>Global User Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.GlobalUserTask
     * @generated
     */
    public Adapter createGlobalUserTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Group <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Group
     * @generated
     */
    public Adapter createGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Handler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Handler
     * @generated
     */
    public Adapter createHandlerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.HumanPerformer <em>Human Performer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.HumanPerformer
     * @generated
     */
    public Adapter createHumanPerformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Import <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Import
     * @generated
     */
    public Adapter createImportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.InclusiveGateway <em>Inclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.InclusiveGateway
     * @generated
     */
    public Adapter createInclusiveGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.InputOutputBinding <em>Input Output Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.InputOutputBinding
     * @generated
     */
    public Adapter createInputOutputBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.InputOutputSpecification <em>Input Output Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.InputOutputSpecification
     * @generated
     */
    public Adapter createInputOutputSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.InputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.InputSet
     * @generated
     */
    public Adapter createInputSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Interface
     * @generated
     */
    public Adapter createInterfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.IntermediateCatchEvent
     * @generated
     */
    public Adapter createIntermediateCatchEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.IntermediateThrowEvent
     * @generated
     */
    public Adapter createIntermediateThrowEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Lane <em>Lane</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Lane
     * @generated
     */
    public Adapter createLaneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.LaneSet <em>Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.LaneSet
     * @generated
     */
    public Adapter createLaneSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.LinkEventDefinition <em>Link Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.LinkEventDefinition
     * @generated
     */
    public Adapter createLinkEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.LoopCharacteristics <em>Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.LoopCharacteristics
     * @generated
     */
    public Adapter createLoopCharacteristicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ManualTask <em>Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ManualTask
     * @generated
     */
    public Adapter createManualTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Message <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Message
     * @generated
     */
    public Adapter createMessageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.MessageEventDefinition <em>Message Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.MessageEventDefinition
     * @generated
     */
    public Adapter createMessageEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.MessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.MessageFlow
     * @generated
     */
    public Adapter createMessageFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Monitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Monitoring
     * @generated
     */
    public Adapter createMonitoringAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics
     * @generated
     */
    public Adapter createMultiInstanceLoopCharacteristicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Operation
     * @generated
     */
    public Adapter createOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.OutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.OutputSet
     * @generated
     */
    public Adapter createOutputSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ParallelGateway <em>Parallel Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ParallelGateway
     * @generated
     */
    public Adapter createParallelGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Parameter
     * @generated
     */
    public Adapter createParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ParameterBinding <em>Parameter Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ParameterBinding
     * @generated
     */
    public Adapter createParameterBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Participant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Participant
     * @generated
     */
    public Adapter createParticipantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ParticipantMultiplicity
     * @generated
     */
    public Adapter createParticipantMultiplicityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.PeopleAssignment <em>People Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignment
     * @generated
     */
    public Adapter createPeopleAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentExpression <em>People Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentExpression
     * @generated
     */
    public Adapter createPeopleAssignmentExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentLiteral <em>People Assignment Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentLiteral
     * @generated
     */
    public Adapter createPeopleAssignmentLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup <em>People Assignment People Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup
     * @generated
     */
    public Adapter createPeopleAssignmentPeopleGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.PeopleGroup <em>People Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.PeopleGroup
     * @generated
     */
    public Adapter createPeopleGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Performer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Performer
     * @generated
     */
    public Adapter createPerformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.PotentialOwner <em>Potential Owner</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.PotentialOwner
     * @generated
     */
    public Adapter createPotentialOwnerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Process
     * @generated
     */
    public Adapter createProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ProcessRole <em>Process Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ProcessRole
     * @generated
     */
    public Adapter createProcessRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ReceiveTask <em>Receive Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ReceiveTask
     * @generated
     */
    public Adapter createReceiveTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Relationship
     * @generated
     */
    public Adapter createRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Rendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Rendering
     * @generated
     */
    public Adapter createRenderingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Role <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Role
     * @generated
     */
    public Adapter createRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.RootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.RootElement
     * @generated
     */
    public Adapter createRootElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Script <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Script
     * @generated
     */
    public Adapter createScriptAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ScriptTask <em>Script Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ScriptTask
     * @generated
     */
    public Adapter createScriptTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.SendTask <em>Send Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.SendTask
     * @generated
     */
    public Adapter createSendTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.SequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.SequenceFlow
     * @generated
     */
    public Adapter createSequenceFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ServiceReference <em>Service Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ServiceReference
     * @generated
     */
    public Adapter createServiceReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ServiceTask <em>Service Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ServiceTask
     * @generated
     */
    public Adapter createServiceTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Signal
     * @generated
     */
    public Adapter createSignalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.SignalEventDefinition <em>Signal Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.SignalEventDefinition
     * @generated
     */
    public Adapter createSignalEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.StandardLoopCharacteristics
     * @generated
     */
    public Adapter createStandardLoopCharacteristicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.StartEvent <em>Start Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.StartEvent
     * @generated
     */
    public Adapter createStartEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.StructureDefinition <em>Structure Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.StructureDefinition
     * @generated
     */
    public Adapter createStructureDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.SubProcess <em>Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.SubProcess
     * @generated
     */
    public Adapter createSubProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Task
     * @generated
     */
    public Adapter createTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.TerminateEventDefinition
     * @generated
     */
    public Adapter createTerminateEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Text <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Text
     * @generated
     */
    public Adapter createTextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.TextAnnotation <em>Text Annotation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.TextAnnotation
     * @generated
     */
    public Adapter createTextAnnotationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.ThrowEvent <em>Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.ThrowEvent
     * @generated
     */
    public Adapter createThrowEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.TimerEventDefinition <em>Timer Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.TimerEventDefinition
     * @generated
     */
    public Adapter createTimerEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.Transaction <em>Transaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.Transaction
     * @generated
     */
    public Adapter createTransactionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn2.UserTask <em>User Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn2.UserTask
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

} //Bpmn2AdapterFactory
