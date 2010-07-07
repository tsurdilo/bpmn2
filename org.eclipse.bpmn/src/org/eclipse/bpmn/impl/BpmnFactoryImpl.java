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

import org.eclipse.bpmn.ActivityResource;
import org.eclipse.bpmn.AdHocOrdering;
import org.eclipse.bpmn.AdHocSubProcess;
import org.eclipse.bpmn.Assignment;
import org.eclipse.bpmn.Association;
import org.eclipse.bpmn.AssociationDirection;
import org.eclipse.bpmn.Auditing;
import org.eclipse.bpmn.BoundaryEvent;
import org.eclipse.bpmn.BpmnFactory;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.BusinessRuleTask;
import org.eclipse.bpmn.CallActivity;
import org.eclipse.bpmn.CallChoreographyActivity;
import org.eclipse.bpmn.CallConversation;
import org.eclipse.bpmn.CallableElement;
import org.eclipse.bpmn.CancelEventDefinition;
import org.eclipse.bpmn.Category;
import org.eclipse.bpmn.CategoryValue;
import org.eclipse.bpmn.Choreography;
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
import org.eclipse.bpmn.CorrelationKey;
import org.eclipse.bpmn.CorrelationProperty;
import org.eclipse.bpmn.CorrelationPropertyBinding;
import org.eclipse.bpmn.CorrelationPropertyRetrievalExpression;
import org.eclipse.bpmn.CorrelationSubscription;
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
import org.eclipse.bpmn.EventBasedGateway;
import org.eclipse.bpmn.EventBasedGatewayType;
import org.eclipse.bpmn.ExclusiveGateway;
import org.eclipse.bpmn.Expression;
import org.eclipse.bpmn.Extension;
import org.eclipse.bpmn.FormalExpression;
import org.eclipse.bpmn.Gateway;
import org.eclipse.bpmn.GatewayDirection;
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
import org.eclipse.bpmn.ItemKind;
import org.eclipse.bpmn.Lane;
import org.eclipse.bpmn.LaneSet;
import org.eclipse.bpmn.LinkEventDefinition;
import org.eclipse.bpmn.ManualTask;
import org.eclipse.bpmn.Message;
import org.eclipse.bpmn.MessageEventDefinition;
import org.eclipse.bpmn.MessageFlow;
import org.eclipse.bpmn.MessageFlowAssociation;
import org.eclipse.bpmn.Monitoring;
import org.eclipse.bpmn.MultiInstanceFlowCondition;
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
import org.eclipse.bpmn.ProcessType;
import org.eclipse.bpmn.Property;
import org.eclipse.bpmn.ReceiveTask;
import org.eclipse.bpmn.Relationship;
import org.eclipse.bpmn.RelationshipDirection;
import org.eclipse.bpmn.Rendering;
import org.eclipse.bpmn.Resource;
import org.eclipse.bpmn.ResourceAssignmentExpression;
import org.eclipse.bpmn.ResourceParameter;
import org.eclipse.bpmn.ResourceParameterBinding;
import org.eclipse.bpmn.Script;
import org.eclipse.bpmn.ScriptTask;
import org.eclipse.bpmn.SendTask;
import org.eclipse.bpmn.SequenceFlow;
import org.eclipse.bpmn.ServiceImplementation;
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
import org.eclipse.bpmn.TimerEventDefinition;
import org.eclipse.bpmn.Transaction;
import org.eclipse.bpmn.TransactionMethod;
import org.eclipse.bpmn.UserTask;
import org.eclipse.bpmn.UserTaskImplementation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnFactoryImpl extends EFactoryImpl implements BpmnFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BpmnFactory init() {
        try {
            BpmnFactory theBpmnFactory = (BpmnFactory) EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/BPMN/2.0"); //$NON-NLS-1$ 
            if (theBpmnFactory != null) {
                return theBpmnFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BpmnFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BpmnFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case BpmnPackage.DOCUMENT_ROOT:
            return createDocumentRoot();
        case BpmnPackage.ACTIVITY_RESOURCE:
            return createActivityResource();
        case BpmnPackage.AD_HOC_SUB_PROCESS:
            return createAdHocSubProcess();
        case BpmnPackage.ASSIGNMENT:
            return createAssignment();
        case BpmnPackage.ASSOCIATION:
            return createAssociation();
        case BpmnPackage.AUDITING:
            return createAuditing();
        case BpmnPackage.BOUNDARY_EVENT:
            return createBoundaryEvent();
        case BpmnPackage.BUSINESS_RULE_TASK:
            return createBusinessRuleTask();
        case BpmnPackage.CALLABLE_ELEMENT:
            return createCallableElement();
        case BpmnPackage.CALL_ACTIVITY:
            return createCallActivity();
        case BpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY:
            return createCallChoreographyActivity();
        case BpmnPackage.CALL_CONVERSATION:
            return createCallConversation();
        case BpmnPackage.CANCEL_EVENT_DEFINITION:
            return createCancelEventDefinition();
        case BpmnPackage.CATEGORY:
            return createCategory();
        case BpmnPackage.CATEGORY_VALUE:
            return createCategoryValue();
        case BpmnPackage.CHOREOGRAPHY:
            return createChoreography();
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS:
            return createChoreographySubProcess();
        case BpmnPackage.CHOREOGRAPHY_TASK:
            return createChoreographyTask();
        case BpmnPackage.COLLABORATION:
            return createCollaboration();
        case BpmnPackage.COMMUNICATION:
            return createCommunication();
        case BpmnPackage.COMPENSATE_EVENT_DEFINITION:
            return createCompensateEventDefinition();
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION:
            return createComplexBehaviorDefinition();
        case BpmnPackage.COMPLEX_GATEWAY:
            return createComplexGateway();
        case BpmnPackage.CONDITIONAL_EVENT_DEFINITION:
            return createConditionalEventDefinition();
        case BpmnPackage.CONVERSATION:
            return createConversation();
        case BpmnPackage.CONVERSATION_ASSOCIATION:
            return createConversationAssociation();
        case BpmnPackage.CORRELATION_KEY:
            return createCorrelationKey();
        case BpmnPackage.CORRELATION_PROPERTY:
            return createCorrelationProperty();
        case BpmnPackage.CORRELATION_PROPERTY_BINDING:
            return createCorrelationPropertyBinding();
        case BpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return createCorrelationPropertyRetrievalExpression();
        case BpmnPackage.CORRELATION_SUBSCRIPTION:
            return createCorrelationSubscription();
        case BpmnPackage.DATA_INPUT:
            return createDataInput();
        case BpmnPackage.DATA_INPUT_ASSOCIATION:
            return createDataInputAssociation();
        case BpmnPackage.DATA_OBJECT:
            return createDataObject();
        case BpmnPackage.DATA_OUTPUT:
            return createDataOutput();
        case BpmnPackage.DATA_OUTPUT_ASSOCIATION:
            return createDataOutputAssociation();
        case BpmnPackage.DATA_STATE:
            return createDataState();
        case BpmnPackage.DATA_STORE:
            return createDataStore();
        case BpmnPackage.DATA_STORE_REFERENCE:
            return createDataStoreReference();
        case BpmnPackage.DEFINITIONS:
            return createDefinitions();
        case BpmnPackage.DOCUMENTATION:
            return createDocumentation();
        case BpmnPackage.END_EVENT:
            return createEndEvent();
        case BpmnPackage.END_POINT:
            return createEndPoint();
        case BpmnPackage.ERROR:
            return createError();
        case BpmnPackage.ERROR_EVENT_DEFINITION:
            return createErrorEventDefinition();
        case BpmnPackage.ESCALATION:
            return createEscalation();
        case BpmnPackage.ESCALATION_EVENT_DEFINITION:
            return createEscalationEventDefinition();
        case BpmnPackage.EVENT_BASED_GATEWAY:
            return createEventBasedGateway();
        case BpmnPackage.EXCLUSIVE_GATEWAY:
            return createExclusiveGateway();
        case BpmnPackage.EXPRESSION:
            return createExpression();
        case BpmnPackage.EXTENSION:
            return createExtension();
        case BpmnPackage.FORMAL_EXPRESSION:
            return createFormalExpression();
        case BpmnPackage.GATEWAY:
            return createGateway();
        case BpmnPackage.GLOBAL_BUSINESS_RULE_TASK:
            return createGlobalBusinessRuleTask();
        case BpmnPackage.GLOBAL_CHOREOGRAPHY_TASK:
            return createGlobalChoreographyTask();
        case BpmnPackage.GLOBAL_COMMUNICATION:
            return createGlobalCommunication();
        case BpmnPackage.GLOBAL_MANUAL_TASK:
            return createGlobalManualTask();
        case BpmnPackage.GLOBAL_SCRIPT_TASK:
            return createGlobalScriptTask();
        case BpmnPackage.GLOBAL_TASK:
            return createGlobalTask();
        case BpmnPackage.GLOBAL_USER_TASK:
            return createGlobalUserTask();
        case BpmnPackage.GROUP:
            return createGroup();
        case BpmnPackage.HUMAN_PERFORMER:
            return createHumanPerformer();
        case BpmnPackage.IMPLICIT_THROW_EVENT:
            return createImplicitThrowEvent();
        case BpmnPackage.IMPORT:
            return createImport();
        case BpmnPackage.INCLUSIVE_GATEWAY:
            return createInclusiveGateway();
        case BpmnPackage.INPUT_OUTPUT_BINDING:
            return createInputOutputBinding();
        case BpmnPackage.INPUT_OUTPUT_SPECIFICATION:
            return createInputOutputSpecification();
        case BpmnPackage.INPUT_SET:
            return createInputSet();
        case BpmnPackage.INTERFACE:
            return createInterface();
        case BpmnPackage.INTERMEDIATE_CATCH_EVENT:
            return createIntermediateCatchEvent();
        case BpmnPackage.INTERMEDIATE_THROW_EVENT:
            return createIntermediateThrowEvent();
        case BpmnPackage.ITEM_DEFINITION:
            return createItemDefinition();
        case BpmnPackage.LANE:
            return createLane();
        case BpmnPackage.LANE_SET:
            return createLaneSet();
        case BpmnPackage.LINK_EVENT_DEFINITION:
            return createLinkEventDefinition();
        case BpmnPackage.MANUAL_TASK:
            return createManualTask();
        case BpmnPackage.MESSAGE:
            return createMessage();
        case BpmnPackage.MESSAGE_EVENT_DEFINITION:
            return createMessageEventDefinition();
        case BpmnPackage.MESSAGE_FLOW:
            return createMessageFlow();
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION:
            return createMessageFlowAssociation();
        case BpmnPackage.MONITORING:
            return createMonitoring();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS:
            return createMultiInstanceLoopCharacteristics();
        case BpmnPackage.OPERATION:
            return createOperation();
        case BpmnPackage.OUTPUT_SET:
            return createOutputSet();
        case BpmnPackage.PARALLEL_GATEWAY:
            return createParallelGateway();
        case BpmnPackage.PARTICIPANT:
            return createParticipant();
        case BpmnPackage.PARTICIPANT_ASSOCIATION:
            return createParticipantAssociation();
        case BpmnPackage.PARTICIPANT_MULTIPLICITY:
            return createParticipantMultiplicity();
        case BpmnPackage.PARTNER_ENTITY:
            return createPartnerEntity();
        case BpmnPackage.PARTNER_ROLE:
            return createPartnerRole();
        case BpmnPackage.PERFORMER:
            return createPerformer();
        case BpmnPackage.POTENTIAL_OWNER:
            return createPotentialOwner();
        case BpmnPackage.PROCESS:
            return createProcess();
        case BpmnPackage.PROPERTY:
            return createProperty();
        case BpmnPackage.RECEIVE_TASK:
            return createReceiveTask();
        case BpmnPackage.RELATIONSHIP:
            return createRelationship();
        case BpmnPackage.RENDERING:
            return createRendering();
        case BpmnPackage.RESOURCE:
            return createResource();
        case BpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION:
            return createResourceAssignmentExpression();
        case BpmnPackage.RESOURCE_PARAMETER:
            return createResourceParameter();
        case BpmnPackage.RESOURCE_PARAMETER_BINDING:
            return createResourceParameterBinding();
        case BpmnPackage.SCRIPT:
            return createScript();
        case BpmnPackage.SCRIPT_TASK:
            return createScriptTask();
        case BpmnPackage.SEND_TASK:
            return createSendTask();
        case BpmnPackage.SEQUENCE_FLOW:
            return createSequenceFlow();
        case BpmnPackage.SERVICE_TASK:
            return createServiceTask();
        case BpmnPackage.SIGNAL:
            return createSignal();
        case BpmnPackage.SIGNAL_EVENT_DEFINITION:
            return createSignalEventDefinition();
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS:
            return createStandardLoopCharacteristics();
        case BpmnPackage.START_EVENT:
            return createStartEvent();
        case BpmnPackage.SUB_CONVERSATION:
            return createSubConversation();
        case BpmnPackage.SUB_PROCESS:
            return createSubProcess();
        case BpmnPackage.TASK:
            return createTask();
        case BpmnPackage.TERMINATE_EVENT_DEFINITION:
            return createTerminateEventDefinition();
        case BpmnPackage.TEXT:
            return createText();
        case BpmnPackage.TEXT_ANNOTATION:
            return createTextAnnotation();
        case BpmnPackage.TIMER_EVENT_DEFINITION:
            return createTimerEventDefinition();
        case BpmnPackage.TRANSACTION:
            return createTransaction();
        case BpmnPackage.USER_TASK:
            return createUserTask();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case BpmnPackage.AD_HOC_ORDERING:
            return createAdHocOrderingFromString(eDataType, initialValue);
        case BpmnPackage.ASSOCIATION_DIRECTION:
            return createAssociationDirectionFromString(eDataType, initialValue);
        case BpmnPackage.EVENT_BASED_GATEWAY_TYPE:
            return createEventBasedGatewayTypeFromString(eDataType, initialValue);
        case BpmnPackage.GATEWAY_DIRECTION:
            return createGatewayDirectionFromString(eDataType, initialValue);
        case BpmnPackage.ITEM_KIND:
            return createItemKindFromString(eDataType, initialValue);
        case BpmnPackage.MULTI_INSTANCE_FLOW_CONDITION:
            return createMultiInstanceFlowConditionFromString(eDataType, initialValue);
        case BpmnPackage.PROCESS_TYPE:
            return createProcessTypeFromString(eDataType, initialValue);
        case BpmnPackage.RELATIONSHIP_DIRECTION:
            return createRelationshipDirectionFromString(eDataType, initialValue);
        case BpmnPackage.SERVICE_IMPLEMENTATION:
            return createServiceImplementationFromString(eDataType, initialValue);
        case BpmnPackage.TRANSACTION_METHOD:
            return createTransactionMethodFromString(eDataType, initialValue);
        case BpmnPackage.USER_TASK_IMPLEMENTATION:
            return createUserTaskImplementationFromString(eDataType, initialValue);
        case BpmnPackage.AD_HOC_ORDERING_OBJECT:
            return createAdHocOrderingObjectFromString(eDataType, initialValue);
        case BpmnPackage.ASSOCIATION_DIRECTION_OBJECT:
            return createAssociationDirectionObjectFromString(eDataType, initialValue);
        case BpmnPackage.EVENT_BASED_GATEWAY_TYPE_OBJECT:
            return createEventBasedGatewayTypeObjectFromString(eDataType, initialValue);
        case BpmnPackage.GATEWAY_DIRECTION_OBJECT:
            return createGatewayDirectionObjectFromString(eDataType, initialValue);
        case BpmnPackage.ITEM_KIND_OBJECT:
            return createItemKindObjectFromString(eDataType, initialValue);
        case BpmnPackage.MULTI_INSTANCE_FLOW_CONDITION_OBJECT:
            return createMultiInstanceFlowConditionObjectFromString(eDataType, initialValue);
        case BpmnPackage.PROCESS_TYPE_OBJECT:
            return createProcessTypeObjectFromString(eDataType, initialValue);
        case BpmnPackage.RELATIONSHIP_DIRECTION_OBJECT:
            return createRelationshipDirectionObjectFromString(eDataType, initialValue);
        case BpmnPackage.SERVICE_IMPLEMENTATION_OBJECT:
            return createServiceImplementationObjectFromString(eDataType, initialValue);
        case BpmnPackage.TRANSACTION_METHOD_OBJECT:
            return createTransactionMethodObjectFromString(eDataType, initialValue);
        case BpmnPackage.USER_TASK_IMPLEMENTATION_OBJECT:
            return createUserTaskImplementationObjectFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case BpmnPackage.AD_HOC_ORDERING:
            return convertAdHocOrderingToString(eDataType, instanceValue);
        case BpmnPackage.ASSOCIATION_DIRECTION:
            return convertAssociationDirectionToString(eDataType, instanceValue);
        case BpmnPackage.EVENT_BASED_GATEWAY_TYPE:
            return convertEventBasedGatewayTypeToString(eDataType, instanceValue);
        case BpmnPackage.GATEWAY_DIRECTION:
            return convertGatewayDirectionToString(eDataType, instanceValue);
        case BpmnPackage.ITEM_KIND:
            return convertItemKindToString(eDataType, instanceValue);
        case BpmnPackage.MULTI_INSTANCE_FLOW_CONDITION:
            return convertMultiInstanceFlowConditionToString(eDataType, instanceValue);
        case BpmnPackage.PROCESS_TYPE:
            return convertProcessTypeToString(eDataType, instanceValue);
        case BpmnPackage.RELATIONSHIP_DIRECTION:
            return convertRelationshipDirectionToString(eDataType, instanceValue);
        case BpmnPackage.SERVICE_IMPLEMENTATION:
            return convertServiceImplementationToString(eDataType, instanceValue);
        case BpmnPackage.TRANSACTION_METHOD:
            return convertTransactionMethodToString(eDataType, instanceValue);
        case BpmnPackage.USER_TASK_IMPLEMENTATION:
            return convertUserTaskImplementationToString(eDataType, instanceValue);
        case BpmnPackage.AD_HOC_ORDERING_OBJECT:
            return convertAdHocOrderingObjectToString(eDataType, instanceValue);
        case BpmnPackage.ASSOCIATION_DIRECTION_OBJECT:
            return convertAssociationDirectionObjectToString(eDataType, instanceValue);
        case BpmnPackage.EVENT_BASED_GATEWAY_TYPE_OBJECT:
            return convertEventBasedGatewayTypeObjectToString(eDataType, instanceValue);
        case BpmnPackage.GATEWAY_DIRECTION_OBJECT:
            return convertGatewayDirectionObjectToString(eDataType, instanceValue);
        case BpmnPackage.ITEM_KIND_OBJECT:
            return convertItemKindObjectToString(eDataType, instanceValue);
        case BpmnPackage.MULTI_INSTANCE_FLOW_CONDITION_OBJECT:
            return convertMultiInstanceFlowConditionObjectToString(eDataType, instanceValue);
        case BpmnPackage.PROCESS_TYPE_OBJECT:
            return convertProcessTypeObjectToString(eDataType, instanceValue);
        case BpmnPackage.RELATIONSHIP_DIRECTION_OBJECT:
            return convertRelationshipDirectionObjectToString(eDataType, instanceValue);
        case BpmnPackage.SERVICE_IMPLEMENTATION_OBJECT:
            return convertServiceImplementationObjectToString(eDataType, instanceValue);
        case BpmnPackage.TRANSACTION_METHOD_OBJECT:
            return convertTransactionMethodObjectToString(eDataType, instanceValue);
        case BpmnPackage.USER_TASK_IMPLEMENTATION_OBJECT:
            return convertUserTaskImplementationObjectToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityResource createActivityResource() {
        ActivityResourceImpl activityResource = new ActivityResourceImpl();
        return activityResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocSubProcess createAdHocSubProcess() {
        AdHocSubProcessImpl adHocSubProcess = new AdHocSubProcessImpl();
        return adHocSubProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Association createAssociation() {
        AssociationImpl association = new AssociationImpl();
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Auditing createAuditing() {
        AuditingImpl auditing = new AuditingImpl();
        return auditing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoundaryEvent createBoundaryEvent() {
        BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();
        return boundaryEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessRuleTask createBusinessRuleTask() {
        BusinessRuleTaskImpl businessRuleTask = new BusinessRuleTaskImpl();
        return businessRuleTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallableElement createCallableElement() {
        CallableElementImpl callableElement = new CallableElementImpl();
        return callableElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallActivity createCallActivity() {
        CallActivityImpl callActivity = new CallActivityImpl();
        return callActivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallChoreographyActivity createCallChoreographyActivity() {
        CallChoreographyActivityImpl callChoreographyActivity = new CallChoreographyActivityImpl();
        return callChoreographyActivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallConversation createCallConversation() {
        CallConversationImpl callConversation = new CallConversationImpl();
        return callConversation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CancelEventDefinition createCancelEventDefinition() {
        CancelEventDefinitionImpl cancelEventDefinition = new CancelEventDefinitionImpl();
        return cancelEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Category createCategory() {
        CategoryImpl category = new CategoryImpl();
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CategoryValue createCategoryValue() {
        CategoryValueImpl categoryValue = new CategoryValueImpl();
        return categoryValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Choreography createChoreography() {
        ChoreographyImpl choreography = new ChoreographyImpl();
        return choreography;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChoreographySubProcess createChoreographySubProcess() {
        ChoreographySubProcessImpl choreographySubProcess = new ChoreographySubProcessImpl();
        return choreographySubProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChoreographyTask createChoreographyTask() {
        ChoreographyTaskImpl choreographyTask = new ChoreographyTaskImpl();
        return choreographyTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collaboration createCollaboration() {
        CollaborationImpl collaboration = new CollaborationImpl();
        return collaboration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Communication createCommunication() {
        CommunicationImpl communication = new CommunicationImpl();
        return communication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompensateEventDefinition createCompensateEventDefinition() {
        CompensateEventDefinitionImpl compensateEventDefinition = new CompensateEventDefinitionImpl();
        return compensateEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexBehaviorDefinition createComplexBehaviorDefinition() {
        ComplexBehaviorDefinitionImpl complexBehaviorDefinition = new ComplexBehaviorDefinitionImpl();
        return complexBehaviorDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexGateway createComplexGateway() {
        ComplexGatewayImpl complexGateway = new ComplexGatewayImpl();
        return complexGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionalEventDefinition createConditionalEventDefinition() {
        ConditionalEventDefinitionImpl conditionalEventDefinition = new ConditionalEventDefinitionImpl();
        return conditionalEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Conversation createConversation() {
        ConversationImpl conversation = new ConversationImpl();
        return conversation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConversationAssociation createConversationAssociation() {
        ConversationAssociationImpl conversationAssociation = new ConversationAssociationImpl();
        return conversationAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationKey createCorrelationKey() {
        CorrelationKeyImpl correlationKey = new CorrelationKeyImpl();
        return correlationKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationProperty createCorrelationProperty() {
        CorrelationPropertyImpl correlationProperty = new CorrelationPropertyImpl();
        return correlationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationPropertyBinding createCorrelationPropertyBinding() {
        CorrelationPropertyBindingImpl correlationPropertyBinding = new CorrelationPropertyBindingImpl();
        return correlationPropertyBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
        CorrelationPropertyRetrievalExpressionImpl correlationPropertyRetrievalExpression = new CorrelationPropertyRetrievalExpressionImpl();
        return correlationPropertyRetrievalExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationSubscription createCorrelationSubscription() {
        CorrelationSubscriptionImpl correlationSubscription = new CorrelationSubscriptionImpl();
        return correlationSubscription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInput createDataInput() {
        DataInputImpl dataInput = new DataInputImpl();
        return dataInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInputAssociation createDataInputAssociation() {
        DataInputAssociationImpl dataInputAssociation = new DataInputAssociationImpl();
        return dataInputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataObject createDataObject() {
        DataObjectImpl dataObject = new DataObjectImpl();
        return dataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutput createDataOutput() {
        DataOutputImpl dataOutput = new DataOutputImpl();
        return dataOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutputAssociation createDataOutputAssociation() {
        DataOutputAssociationImpl dataOutputAssociation = new DataOutputAssociationImpl();
        return dataOutputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataState createDataState() {
        DataStateImpl dataState = new DataStateImpl();
        return dataState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataStore createDataStore() {
        DataStoreImpl dataStore = new DataStoreImpl();
        return dataStore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataStoreReference createDataStoreReference() {
        DataStoreReferenceImpl dataStoreReference = new DataStoreReferenceImpl();
        return dataStoreReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Definitions createDefinitions() {
        DefinitionsImpl definitions = new DefinitionsImpl();
        return definitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Documentation createDocumentation() {
        DocumentationImpl documentation = new DocumentationImpl();
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndEvent createEndEvent() {
        EndEventImpl endEvent = new EndEventImpl();
        return endEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndPoint createEndPoint() {
        EndPointImpl endPoint = new EndPointImpl();
        return endPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.bpmn.Error createError() {
        ErrorImpl error = new ErrorImpl();
        return error;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ErrorEventDefinition createErrorEventDefinition() {
        ErrorEventDefinitionImpl errorEventDefinition = new ErrorEventDefinitionImpl();
        return errorEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Escalation createEscalation() {
        EscalationImpl escalation = new EscalationImpl();
        return escalation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EscalationEventDefinition createEscalationEventDefinition() {
        EscalationEventDefinitionImpl escalationEventDefinition = new EscalationEventDefinitionImpl();
        return escalationEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventBasedGateway createEventBasedGateway() {
        EventBasedGatewayImpl eventBasedGateway = new EventBasedGatewayImpl();
        return eventBasedGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExclusiveGateway createExclusiveGateway() {
        ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
        return exclusiveGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression createExpression() {
        ExpressionImpl expression = new ExpressionImpl();
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Extension createExtension() {
        ExtensionImpl extension = new ExtensionImpl();
        return extension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormalExpression createFormalExpression() {
        FormalExpressionImpl formalExpression = new FormalExpressionImpl();
        return formalExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gateway createGateway() {
        GatewayImpl gateway = new GatewayImpl();
        return gateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalBusinessRuleTask createGlobalBusinessRuleTask() {
        GlobalBusinessRuleTaskImpl globalBusinessRuleTask = new GlobalBusinessRuleTaskImpl();
        return globalBusinessRuleTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalChoreographyTask createGlobalChoreographyTask() {
        GlobalChoreographyTaskImpl globalChoreographyTask = new GlobalChoreographyTaskImpl();
        return globalChoreographyTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalCommunication createGlobalCommunication() {
        GlobalCommunicationImpl globalCommunication = new GlobalCommunicationImpl();
        return globalCommunication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalManualTask createGlobalManualTask() {
        GlobalManualTaskImpl globalManualTask = new GlobalManualTaskImpl();
        return globalManualTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalScriptTask createGlobalScriptTask() {
        GlobalScriptTaskImpl globalScriptTask = new GlobalScriptTaskImpl();
        return globalScriptTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalTask createGlobalTask() {
        GlobalTaskImpl globalTask = new GlobalTaskImpl();
        return globalTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalUserTask createGlobalUserTask() {
        GlobalUserTaskImpl globalUserTask = new GlobalUserTaskImpl();
        return globalUserTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Group createGroup() {
        GroupImpl group = new GroupImpl();
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumanPerformer createHumanPerformer() {
        HumanPerformerImpl humanPerformer = new HumanPerformerImpl();
        return humanPerformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplicitThrowEvent createImplicitThrowEvent() {
        ImplicitThrowEventImpl implicitThrowEvent = new ImplicitThrowEventImpl();
        return implicitThrowEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Import createImport() {
        ImportImpl import_ = new ImportImpl();
        return import_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InclusiveGateway createInclusiveGateway() {
        InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();
        return inclusiveGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputOutputBinding createInputOutputBinding() {
        InputOutputBindingImpl inputOutputBinding = new InputOutputBindingImpl();
        return inputOutputBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputOutputSpecification createInputOutputSpecification() {
        InputOutputSpecificationImpl inputOutputSpecification = new InputOutputSpecificationImpl();
        return inputOutputSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputSet createInputSet() {
        InputSetImpl inputSet = new InputSetImpl();
        return inputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface createInterface() {
        InterfaceImpl interface_ = new InterfaceImpl();
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateCatchEvent createIntermediateCatchEvent() {
        IntermediateCatchEventImpl intermediateCatchEvent = new IntermediateCatchEventImpl();
        return intermediateCatchEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateThrowEvent createIntermediateThrowEvent() {
        IntermediateThrowEventImpl intermediateThrowEvent = new IntermediateThrowEventImpl();
        return intermediateThrowEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemDefinition createItemDefinition() {
        ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();
        return itemDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Lane createLane() {
        LaneImpl lane = new LaneImpl();
        return lane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LaneSet createLaneSet() {
        LaneSetImpl laneSet = new LaneSetImpl();
        return laneSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkEventDefinition createLinkEventDefinition() {
        LinkEventDefinitionImpl linkEventDefinition = new LinkEventDefinitionImpl();
        return linkEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManualTask createManualTask() {
        ManualTaskImpl manualTask = new ManualTaskImpl();
        return manualTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message createMessage() {
        MessageImpl message = new MessageImpl();
        return message;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageEventDefinition createMessageEventDefinition() {
        MessageEventDefinitionImpl messageEventDefinition = new MessageEventDefinitionImpl();
        return messageEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageFlow createMessageFlow() {
        MessageFlowImpl messageFlow = new MessageFlowImpl();
        return messageFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageFlowAssociation createMessageFlowAssociation() {
        MessageFlowAssociationImpl messageFlowAssociation = new MessageFlowAssociationImpl();
        return messageFlowAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Monitoring createMonitoring() {
        MonitoringImpl monitoring = new MonitoringImpl();
        return monitoring;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceLoopCharacteristics createMultiInstanceLoopCharacteristics() {
        MultiInstanceLoopCharacteristicsImpl multiInstanceLoopCharacteristics = new MultiInstanceLoopCharacteristicsImpl();
        return multiInstanceLoopCharacteristics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputSet createOutputSet() {
        OutputSetImpl outputSet = new OutputSetImpl();
        return outputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParallelGateway createParallelGateway() {
        ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
        return parallelGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Participant createParticipant() {
        ParticipantImpl participant = new ParticipantImpl();
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantAssociation createParticipantAssociation() {
        ParticipantAssociationImpl participantAssociation = new ParticipantAssociationImpl();
        return participantAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantMultiplicity createParticipantMultiplicity() {
        ParticipantMultiplicityImpl participantMultiplicity = new ParticipantMultiplicityImpl();
        return participantMultiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartnerEntity createPartnerEntity() {
        PartnerEntityImpl partnerEntity = new PartnerEntityImpl();
        return partnerEntity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartnerRole createPartnerRole() {
        PartnerRoleImpl partnerRole = new PartnerRoleImpl();
        return partnerRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Performer createPerformer() {
        PerformerImpl performer = new PerformerImpl();
        return performer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PotentialOwner createPotentialOwner() {
        PotentialOwnerImpl potentialOwner = new PotentialOwnerImpl();
        return potentialOwner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.bpmn.Process createProcess() {
        ProcessImpl process = new ProcessImpl();
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReceiveTask createReceiveTask() {
        ReceiveTaskImpl receiveTask = new ReceiveTaskImpl();
        return receiveTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Relationship createRelationship() {
        RelationshipImpl relationship = new RelationshipImpl();
        return relationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rendering createRendering() {
        RenderingImpl rendering = new RenderingImpl();
        return rendering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Resource createResource() {
        ResourceImpl resource = new ResourceImpl();
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceAssignmentExpression createResourceAssignmentExpression() {
        ResourceAssignmentExpressionImpl resourceAssignmentExpression = new ResourceAssignmentExpressionImpl();
        return resourceAssignmentExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceParameter createResourceParameter() {
        ResourceParameterImpl resourceParameter = new ResourceParameterImpl();
        return resourceParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceParameterBinding createResourceParameterBinding() {
        ResourceParameterBindingImpl resourceParameterBinding = new ResourceParameterBindingImpl();
        return resourceParameterBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script createScript() {
        ScriptImpl script = new ScriptImpl();
        return script;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptTask createScriptTask() {
        ScriptTaskImpl scriptTask = new ScriptTaskImpl();
        return scriptTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SendTask createSendTask() {
        SendTaskImpl sendTask = new SendTaskImpl();
        return sendTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceFlow createSequenceFlow() {
        SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
        return sequenceFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceTask createServiceTask() {
        ServiceTaskImpl serviceTask = new ServiceTaskImpl();
        return serviceTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal createSignal() {
        SignalImpl signal = new SignalImpl();
        return signal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SignalEventDefinition createSignalEventDefinition() {
        SignalEventDefinitionImpl signalEventDefinition = new SignalEventDefinitionImpl();
        return signalEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StandardLoopCharacteristics createStandardLoopCharacteristics() {
        StandardLoopCharacteristicsImpl standardLoopCharacteristics = new StandardLoopCharacteristicsImpl();
        return standardLoopCharacteristics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartEvent createStartEvent() {
        StartEventImpl startEvent = new StartEventImpl();
        return startEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubConversation createSubConversation() {
        SubConversationImpl subConversation = new SubConversationImpl();
        return subConversation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubProcess createSubProcess() {
        SubProcessImpl subProcess = new SubProcessImpl();
        return subProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task createTask() {
        TaskImpl task = new TaskImpl();
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TerminateEventDefinition createTerminateEventDefinition() {
        TerminateEventDefinitionImpl terminateEventDefinition = new TerminateEventDefinitionImpl();
        return terminateEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Text createText() {
        TextImpl text = new TextImpl();
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextAnnotation createTextAnnotation() {
        TextAnnotationImpl textAnnotation = new TextAnnotationImpl();
        return textAnnotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimerEventDefinition createTimerEventDefinition() {
        TimerEventDefinitionImpl timerEventDefinition = new TimerEventDefinitionImpl();
        return timerEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Transaction createTransaction() {
        TransactionImpl transaction = new TransactionImpl();
        return transaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTask createUserTask() {
        UserTaskImpl userTask = new UserTaskImpl();
        return userTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocOrdering createAdHocOrderingFromString(EDataType eDataType, String initialValue) {
        AdHocOrdering result = AdHocOrdering.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAdHocOrderingToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationDirection createAssociationDirectionFromString(EDataType eDataType, String initialValue) {
        AssociationDirection result = AssociationDirection.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventBasedGatewayType createEventBasedGatewayTypeFromString(EDataType eDataType, String initialValue) {
        EventBasedGatewayType result = EventBasedGatewayType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEventBasedGatewayTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GatewayDirection createGatewayDirectionFromString(EDataType eDataType, String initialValue) {
        GatewayDirection result = GatewayDirection.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGatewayDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemKind createItemKindFromString(EDataType eDataType, String initialValue) {
        ItemKind result = ItemKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertItemKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceFlowCondition createMultiInstanceFlowConditionFromString(EDataType eDataType, String initialValue) {
        MultiInstanceFlowCondition result = MultiInstanceFlowCondition.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiInstanceFlowConditionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
        ProcessType result = ProcessType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationshipDirection createRelationshipDirectionFromString(EDataType eDataType, String initialValue) {
        RelationshipDirection result = RelationshipDirection.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRelationshipDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceImplementation createServiceImplementationFromString(EDataType eDataType, String initialValue) {
        ServiceImplementation result = ServiceImplementation.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceImplementationToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransactionMethod createTransactionMethodFromString(EDataType eDataType, String initialValue) {
        TransactionMethod result = TransactionMethod.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransactionMethodToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTaskImplementation createUserTaskImplementationFromString(EDataType eDataType, String initialValue) {
        UserTaskImplementation result = UserTaskImplementation.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUserTaskImplementationToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocOrdering createAdHocOrderingObjectFromString(EDataType eDataType, String initialValue) {
        return createAdHocOrderingFromString(BpmnPackage.eINSTANCE.getAdHocOrdering(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAdHocOrderingObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAdHocOrderingToString(BpmnPackage.eINSTANCE.getAdHocOrdering(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationDirection createAssociationDirectionObjectFromString(EDataType eDataType, String initialValue) {
        return createAssociationDirectionFromString(BpmnPackage.eINSTANCE.getAssociationDirection(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssociationDirectionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAssociationDirectionToString(BpmnPackage.eINSTANCE.getAssociationDirection(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventBasedGatewayType createEventBasedGatewayTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createEventBasedGatewayTypeFromString(BpmnPackage.eINSTANCE.getEventBasedGatewayType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEventBasedGatewayTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertEventBasedGatewayTypeToString(BpmnPackage.eINSTANCE.getEventBasedGatewayType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GatewayDirection createGatewayDirectionObjectFromString(EDataType eDataType, String initialValue) {
        return createGatewayDirectionFromString(BpmnPackage.eINSTANCE.getGatewayDirection(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGatewayDirectionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertGatewayDirectionToString(BpmnPackage.eINSTANCE.getGatewayDirection(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemKind createItemKindObjectFromString(EDataType eDataType, String initialValue) {
        return createItemKindFromString(BpmnPackage.eINSTANCE.getItemKind(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertItemKindObjectToString(EDataType eDataType, Object instanceValue) {
        return convertItemKindToString(BpmnPackage.eINSTANCE.getItemKind(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceFlowCondition createMultiInstanceFlowConditionObjectFromString(EDataType eDataType, String initialValue) {
        return createMultiInstanceFlowConditionFromString(BpmnPackage.eINSTANCE.getMultiInstanceFlowCondition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiInstanceFlowConditionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMultiInstanceFlowConditionToString(BpmnPackage.eINSTANCE.getMultiInstanceFlowCondition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createProcessTypeFromString(BpmnPackage.eINSTANCE.getProcessType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertProcessTypeToString(BpmnPackage.eINSTANCE.getProcessType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationshipDirection createRelationshipDirectionObjectFromString(EDataType eDataType, String initialValue) {
        return createRelationshipDirectionFromString(BpmnPackage.eINSTANCE.getRelationshipDirection(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRelationshipDirectionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertRelationshipDirectionToString(BpmnPackage.eINSTANCE.getRelationshipDirection(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceImplementation createServiceImplementationObjectFromString(EDataType eDataType, String initialValue) {
        return createServiceImplementationFromString(BpmnPackage.eINSTANCE.getServiceImplementation(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceImplementationObjectToString(EDataType eDataType, Object instanceValue) {
        return convertServiceImplementationToString(BpmnPackage.eINSTANCE.getServiceImplementation(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransactionMethod createTransactionMethodObjectFromString(EDataType eDataType, String initialValue) {
        return createTransactionMethodFromString(BpmnPackage.eINSTANCE.getTransactionMethod(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransactionMethodObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTransactionMethodToString(BpmnPackage.eINSTANCE.getTransactionMethod(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTaskImplementation createUserTaskImplementationObjectFromString(EDataType eDataType, String initialValue) {
        return createUserTaskImplementationFromString(BpmnPackage.eINSTANCE.getUserTaskImplementation(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUserTaskImplementationObjectToString(EDataType eDataType, Object instanceValue) {
        return convertUserTaskImplementationToString(BpmnPackage.eINSTANCE.getUserTaskImplementation(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BpmnPackage getBpmnPackage() {
        return (BpmnPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static BpmnPackage getPackage() {
        return BpmnPackage.eINSTANCE;
    }

} //BpmnFactoryImpl
