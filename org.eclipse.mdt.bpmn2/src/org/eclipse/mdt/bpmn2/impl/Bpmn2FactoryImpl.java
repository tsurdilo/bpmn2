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
package org.eclipse.mdt.bpmn2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdt.bpmn2.AdHocOrdering;
import org.eclipse.mdt.bpmn2.AdHocSubProcess;
import org.eclipse.mdt.bpmn2.Assignment;
import org.eclipse.mdt.bpmn2.Association;
import org.eclipse.mdt.bpmn2.AssociationDirection;
import org.eclipse.mdt.bpmn2.Auditing;
import org.eclipse.mdt.bpmn2.BoundaryEvent;
import org.eclipse.mdt.bpmn2.Bpmn2Factory;
import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.BusinessRuleTask;
import org.eclipse.mdt.bpmn2.CallActivity;
import org.eclipse.mdt.bpmn2.CallChoreographyActivity;
import org.eclipse.mdt.bpmn2.CallableElement;
import org.eclipse.mdt.bpmn2.CancelEventDefinition;
import org.eclipse.mdt.bpmn2.Category;
import org.eclipse.mdt.bpmn2.CategoryValue;
import org.eclipse.mdt.bpmn2.Choreography;
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
import org.eclipse.mdt.bpmn2.EventBasedGateway;
import org.eclipse.mdt.bpmn2.ExclusiveGateway;
import org.eclipse.mdt.bpmn2.Expression;
import org.eclipse.mdt.bpmn2.Extension;
import org.eclipse.mdt.bpmn2.FormalExpression;
import org.eclipse.mdt.bpmn2.Gateway;
import org.eclipse.mdt.bpmn2.GatewayDirection;
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
import org.eclipse.mdt.bpmn2.ManualTask;
import org.eclipse.mdt.bpmn2.Message;
import org.eclipse.mdt.bpmn2.MessageEventDefinition;
import org.eclipse.mdt.bpmn2.MessageFlow;
import org.eclipse.mdt.bpmn2.Monitoring;
import org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition;
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
import org.eclipse.mdt.bpmn2.ProcessType;
import org.eclipse.mdt.bpmn2.Property;
import org.eclipse.mdt.bpmn2.ReceiveTask;
import org.eclipse.mdt.bpmn2.Relationship;
import org.eclipse.mdt.bpmn2.RelationshipDirection;
import org.eclipse.mdt.bpmn2.Rendering;
import org.eclipse.mdt.bpmn2.Role;
import org.eclipse.mdt.bpmn2.Script;
import org.eclipse.mdt.bpmn2.ScriptTask;
import org.eclipse.mdt.bpmn2.SendTask;
import org.eclipse.mdt.bpmn2.SequenceFlow;
import org.eclipse.mdt.bpmn2.ServiceImplementation;
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
import org.eclipse.mdt.bpmn2.TimerEventDefinition;
import org.eclipse.mdt.bpmn2.Transaction;
import org.eclipse.mdt.bpmn2.TransactionMethod;
import org.eclipse.mdt.bpmn2.UserTask;
import org.eclipse.mdt.bpmn2.UserTaskImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bpmn2FactoryImpl extends EFactoryImpl implements Bpmn2Factory {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Bpmn2Factory init() {
        try {
            Bpmn2Factory theBpmn2Factory = (Bpmn2Factory) EPackage.Registry.INSTANCE
                    .getEFactory("http://www.omg.org/bpmn20");
            if (theBpmn2Factory != null) {
                return theBpmn2Factory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new Bpmn2FactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bpmn2FactoryImpl() {
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
        case Bpmn2Package.DOCUMENT_ROOT:
            return createDocumentRoot();
        case Bpmn2Package.AD_HOC_SUB_PROCESS:
            return createAdHocSubProcess();
        case Bpmn2Package.ASSIGNMENT:
            return createAssignment();
        case Bpmn2Package.ASSOCIATION:
            return createAssociation();
        case Bpmn2Package.AUDITING:
            return createAuditing();
        case Bpmn2Package.BOUNDARY_EVENT:
            return createBoundaryEvent();
        case Bpmn2Package.BUSINESS_RULE_TASK:
            return createBusinessRuleTask();
        case Bpmn2Package.CALLABLE_ELEMENT:
            return createCallableElement();
        case Bpmn2Package.CALL_ACTIVITY:
            return createCallActivity();
        case Bpmn2Package.CALL_CHOREOGRAPHY_ACTIVITY:
            return createCallChoreographyActivity();
        case Bpmn2Package.CANCEL_EVENT_DEFINITION:
            return createCancelEventDefinition();
        case Bpmn2Package.CATEGORY:
            return createCategory();
        case Bpmn2Package.CATEGORY_VALUE:
            return createCategoryValue();
        case Bpmn2Package.CHOREOGRAPHY:
            return createChoreography();
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS:
            return createChoreographySubProcess();
        case Bpmn2Package.CHOREOGRAPHY_TASK:
            return createChoreographyTask();
        case Bpmn2Package.COLLABORATION:
            return createCollaboration();
        case Bpmn2Package.COMPENSATE_EVENT_DEFINITION:
            return createCompensateEventDefinition();
        case Bpmn2Package.COMPLEX_GATEWAY:
            return createComplexGateway();
        case Bpmn2Package.CONDITIONAL_EVENT_DEFINITION:
            return createConditionalEventDefinition();
        case Bpmn2Package.CONVERSATION:
            return createConversation();
        case Bpmn2Package.CONVERSATION_LINK:
            return createConversationLink();
        case Bpmn2Package.CONVERSATION_VIEW:
            return createConversationView();
        case Bpmn2Package.CORRELATION_KEY:
            return createCorrelationKey();
        case Bpmn2Package.CORRELATION_PROPERTY:
            return createCorrelationProperty();
        case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return createCorrelationPropertyRetrievalExpression();
        case Bpmn2Package.CORRELATION_SET:
            return createCorrelationSet();
        case Bpmn2Package.DATA_INPUT:
            return createDataInput();
        case Bpmn2Package.DATA_INPUT_ASSOCIATION:
            return createDataInputAssociation();
        case Bpmn2Package.DATA_OBJECT:
            return createDataObject();
        case Bpmn2Package.DATA_OBJECT_STATE:
            return createDataObjectState();
        case Bpmn2Package.DATA_OUTPUT:
            return createDataOutput();
        case Bpmn2Package.DATA_OUTPUT_ASSOCIATION:
            return createDataOutputAssociation();
        case Bpmn2Package.DEFINITIONS:
            return createDefinitions();
        case Bpmn2Package.DOCUMENTATION:
            return createDocumentation();
        case Bpmn2Package.END_EVENT:
            return createEndEvent();
        case Bpmn2Package.END_POINT:
            return createEndPoint();
        case Bpmn2Package.ENTITY:
            return createEntity();
        case Bpmn2Package.ERROR:
            return createError();
        case Bpmn2Package.ERROR_EVENT_DEFINITION:
            return createErrorEventDefinition();
        case Bpmn2Package.ESCALATION:
            return createEscalation();
        case Bpmn2Package.ESCALATION_EVENT_DEFINITION:
            return createEscalationEventDefinition();
        case Bpmn2Package.EVENT_BASED_GATEWAY:
            return createEventBasedGateway();
        case Bpmn2Package.EXCLUSIVE_GATEWAY:
            return createExclusiveGateway();
        case Bpmn2Package.EXPRESSION:
            return createExpression();
        case Bpmn2Package.EXTENSION:
            return createExtension();
        case Bpmn2Package.FORMAL_EXPRESSION:
            return createFormalExpression();
        case Bpmn2Package.GATEWAY:
            return createGateway();
        case Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK:
            return createGlobalBusinessRuleTask();
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK:
            return createGlobalChoreographyTask();
        case Bpmn2Package.GLOBAL_MANUAL_TASK:
            return createGlobalManualTask();
        case Bpmn2Package.GLOBAL_SCRIPT_TASK:
            return createGlobalScriptTask();
        case Bpmn2Package.GLOBAL_TASK:
            return createGlobalTask();
        case Bpmn2Package.GLOBAL_USER_TASK:
            return createGlobalUserTask();
        case Bpmn2Package.GROUP:
            return createGroup();
        case Bpmn2Package.HANDLER:
            return createHandler();
        case Bpmn2Package.HUMAN_PERFORMER:
            return createHumanPerformer();
        case Bpmn2Package.IMPORT:
            return createImport();
        case Bpmn2Package.INCLUSIVE_GATEWAY:
            return createInclusiveGateway();
        case Bpmn2Package.INPUT_OUTPUT_BINDING:
            return createInputOutputBinding();
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION:
            return createInputOutputSpecification();
        case Bpmn2Package.INPUT_SET:
            return createInputSet();
        case Bpmn2Package.INTERFACE:
            return createInterface();
        case Bpmn2Package.INTERMEDIATE_CATCH_EVENT:
            return createIntermediateCatchEvent();
        case Bpmn2Package.INTERMEDIATE_THROW_EVENT:
            return createIntermediateThrowEvent();
        case Bpmn2Package.LANE:
            return createLane();
        case Bpmn2Package.LANE_SET:
            return createLaneSet();
        case Bpmn2Package.LINK_EVENT_DEFINITION:
            return createLinkEventDefinition();
        case Bpmn2Package.MANUAL_TASK:
            return createManualTask();
        case Bpmn2Package.MESSAGE:
            return createMessage();
        case Bpmn2Package.MESSAGE_EVENT_DEFINITION:
            return createMessageEventDefinition();
        case Bpmn2Package.MESSAGE_FLOW:
            return createMessageFlow();
        case Bpmn2Package.MONITORING:
            return createMonitoring();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS:
            return createMultiInstanceLoopCharacteristics();
        case Bpmn2Package.OPERATION:
            return createOperation();
        case Bpmn2Package.OUTPUT_SET:
            return createOutputSet();
        case Bpmn2Package.PARALLEL_GATEWAY:
            return createParallelGateway();
        case Bpmn2Package.PARAMETER:
            return createParameter();
        case Bpmn2Package.PARAMETER_BINDING:
            return createParameterBinding();
        case Bpmn2Package.PARTICIPANT:
            return createParticipant();
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY:
            return createParticipantMultiplicity();
        case Bpmn2Package.PEOPLE_ASSIGNMENT:
            return createPeopleAssignment();
        case Bpmn2Package.PEOPLE_ASSIGNMENT_EXPRESSION:
            return createPeopleAssignmentExpression();
        case Bpmn2Package.PEOPLE_ASSIGNMENT_LITERAL:
            return createPeopleAssignmentLiteral();
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP:
            return createPeopleAssignmentPeopleGroup();
        case Bpmn2Package.PEOPLE_GROUP:
            return createPeopleGroup();
        case Bpmn2Package.PERFORMER:
            return createPerformer();
        case Bpmn2Package.POTENTIAL_OWNER:
            return createPotentialOwner();
        case Bpmn2Package.PROCESS:
            return createProcess();
        case Bpmn2Package.PROCESS_ROLE:
            return createProcessRole();
        case Bpmn2Package.PROPERTY:
            return createProperty();
        case Bpmn2Package.RECEIVE_TASK:
            return createReceiveTask();
        case Bpmn2Package.RELATIONSHIP:
            return createRelationship();
        case Bpmn2Package.RENDERING:
            return createRendering();
        case Bpmn2Package.ROLE:
            return createRole();
        case Bpmn2Package.SCRIPT:
            return createScript();
        case Bpmn2Package.SCRIPT_TASK:
            return createScriptTask();
        case Bpmn2Package.SEND_TASK:
            return createSendTask();
        case Bpmn2Package.SEQUENCE_FLOW:
            return createSequenceFlow();
        case Bpmn2Package.SERVICE_REFERENCE:
            return createServiceReference();
        case Bpmn2Package.SERVICE_TASK:
            return createServiceTask();
        case Bpmn2Package.SIGNAL:
            return createSignal();
        case Bpmn2Package.SIGNAL_EVENT_DEFINITION:
            return createSignalEventDefinition();
        case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS:
            return createStandardLoopCharacteristics();
        case Bpmn2Package.START_EVENT:
            return createStartEvent();
        case Bpmn2Package.STRUCTURE_DEFINITION:
            return createStructureDefinition();
        case Bpmn2Package.SUB_PROCESS:
            return createSubProcess();
        case Bpmn2Package.TASK:
            return createTask();
        case Bpmn2Package.TERMINATE_EVENT_DEFINITION:
            return createTerminateEventDefinition();
        case Bpmn2Package.TEXT:
            return createText();
        case Bpmn2Package.TEXT_ANNOTATION:
            return createTextAnnotation();
        case Bpmn2Package.TIMER_EVENT_DEFINITION:
            return createTimerEventDefinition();
        case Bpmn2Package.TRANSACTION:
            return createTransaction();
        case Bpmn2Package.USER_TASK:
            return createUserTask();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName()
                    + "' is not a valid classifier");
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
        case Bpmn2Package.AD_HOC_ORDERING:
            return createAdHocOrderingFromString(eDataType, initialValue);
        case Bpmn2Package.ASSOCIATION_DIRECTION:
            return createAssociationDirectionFromString(eDataType, initialValue);
        case Bpmn2Package.GATEWAY_DIRECTION:
            return createGatewayDirectionFromString(eDataType, initialValue);
        case Bpmn2Package.MULTI_INSTANCE_FLOW_CONDITION:
            return createMultiInstanceFlowConditionFromString(eDataType,
                    initialValue);
        case Bpmn2Package.PROCESS_TYPE:
            return createProcessTypeFromString(eDataType, initialValue);
        case Bpmn2Package.RELATIONSHIP_DIRECTION:
            return createRelationshipDirectionFromString(eDataType,
                    initialValue);
        case Bpmn2Package.SERVICE_IMPLEMENTATION:
            return createServiceImplementationFromString(eDataType,
                    initialValue);
        case Bpmn2Package.TRANSACTION_METHOD:
            return createTransactionMethodFromString(eDataType, initialValue);
        case Bpmn2Package.USER_TASK_IMPLEMENTATION:
            return createUserTaskImplementationFromString(eDataType,
                    initialValue);
        case Bpmn2Package.AD_HOC_ORDERING_OBJECT:
            return createAdHocOrderingObjectFromString(eDataType, initialValue);
        case Bpmn2Package.ASSOCIATION_DIRECTION_OBJECT:
            return createAssociationDirectionObjectFromString(eDataType,
                    initialValue);
        case Bpmn2Package.GATEWAY_DIRECTION_OBJECT:
            return createGatewayDirectionObjectFromString(eDataType,
                    initialValue);
        case Bpmn2Package.MULTI_INSTANCE_FLOW_CONDITION_OBJECT:
            return createMultiInstanceFlowConditionObjectFromString(eDataType,
                    initialValue);
        case Bpmn2Package.PROCESS_TYPE_OBJECT:
            return createProcessTypeObjectFromString(eDataType, initialValue);
        case Bpmn2Package.RELATIONSHIP_DIRECTION_OBJECT:
            return createRelationshipDirectionObjectFromString(eDataType,
                    initialValue);
        case Bpmn2Package.SERVICE_IMPLEMENTATION_OBJECT:
            return createServiceImplementationObjectFromString(eDataType,
                    initialValue);
        case Bpmn2Package.TRANSACTION_METHOD_OBJECT:
            return createTransactionMethodObjectFromString(eDataType,
                    initialValue);
        case Bpmn2Package.USER_TASK_IMPLEMENTATION_OBJECT:
            return createUserTaskImplementationObjectFromString(eDataType,
                    initialValue);
        default:
            throw new IllegalArgumentException("The datatype '"
                    + eDataType.getName() + "' is not a valid classifier");
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
        case Bpmn2Package.AD_HOC_ORDERING:
            return convertAdHocOrderingToString(eDataType, instanceValue);
        case Bpmn2Package.ASSOCIATION_DIRECTION:
            return convertAssociationDirectionToString(eDataType, instanceValue);
        case Bpmn2Package.GATEWAY_DIRECTION:
            return convertGatewayDirectionToString(eDataType, instanceValue);
        case Bpmn2Package.MULTI_INSTANCE_FLOW_CONDITION:
            return convertMultiInstanceFlowConditionToString(eDataType,
                    instanceValue);
        case Bpmn2Package.PROCESS_TYPE:
            return convertProcessTypeToString(eDataType, instanceValue);
        case Bpmn2Package.RELATIONSHIP_DIRECTION:
            return convertRelationshipDirectionToString(eDataType,
                    instanceValue);
        case Bpmn2Package.SERVICE_IMPLEMENTATION:
            return convertServiceImplementationToString(eDataType,
                    instanceValue);
        case Bpmn2Package.TRANSACTION_METHOD:
            return convertTransactionMethodToString(eDataType, instanceValue);
        case Bpmn2Package.USER_TASK_IMPLEMENTATION:
            return convertUserTaskImplementationToString(eDataType,
                    instanceValue);
        case Bpmn2Package.AD_HOC_ORDERING_OBJECT:
            return convertAdHocOrderingObjectToString(eDataType, instanceValue);
        case Bpmn2Package.ASSOCIATION_DIRECTION_OBJECT:
            return convertAssociationDirectionObjectToString(eDataType,
                    instanceValue);
        case Bpmn2Package.GATEWAY_DIRECTION_OBJECT:
            return convertGatewayDirectionObjectToString(eDataType,
                    instanceValue);
        case Bpmn2Package.MULTI_INSTANCE_FLOW_CONDITION_OBJECT:
            return convertMultiInstanceFlowConditionObjectToString(eDataType,
                    instanceValue);
        case Bpmn2Package.PROCESS_TYPE_OBJECT:
            return convertProcessTypeObjectToString(eDataType, instanceValue);
        case Bpmn2Package.RELATIONSHIP_DIRECTION_OBJECT:
            return convertRelationshipDirectionObjectToString(eDataType,
                    instanceValue);
        case Bpmn2Package.SERVICE_IMPLEMENTATION_OBJECT:
            return convertServiceImplementationObjectToString(eDataType,
                    instanceValue);
        case Bpmn2Package.TRANSACTION_METHOD_OBJECT:
            return convertTransactionMethodObjectToString(eDataType,
                    instanceValue);
        case Bpmn2Package.USER_TASK_IMPLEMENTATION_OBJECT:
            return convertUserTaskImplementationObjectToString(eDataType,
                    instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '"
                    + eDataType.getName() + "' is not a valid classifier");
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
    public CompensateEventDefinition createCompensateEventDefinition() {
        CompensateEventDefinitionImpl compensateEventDefinition = new CompensateEventDefinitionImpl();
        return compensateEventDefinition;
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
    public ConversationLink createConversationLink() {
        ConversationLinkImpl conversationLink = new ConversationLinkImpl();
        return conversationLink;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConversationView createConversationView() {
        ConversationViewImpl conversationView = new ConversationViewImpl();
        return conversationView;
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
    public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
        CorrelationPropertyRetrievalExpressionImpl correlationPropertyRetrievalExpression = new CorrelationPropertyRetrievalExpressionImpl();
        return correlationPropertyRetrievalExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationSet createCorrelationSet() {
        CorrelationSetImpl correlationSet = new CorrelationSetImpl();
        return correlationSet;
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
    public DataObjectState createDataObjectState() {
        DataObjectStateImpl dataObjectState = new DataObjectStateImpl();
        return dataObjectState;
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
    public Entity createEntity() {
        EntityImpl entity = new EntityImpl();
        return entity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.mdt.bpmn2.Error createError() {
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
    public Handler createHandler() {
        HandlerImpl handler = new HandlerImpl();
        return handler;
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
    public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterBinding createParameterBinding() {
        ParameterBindingImpl parameterBinding = new ParameterBindingImpl();
        return parameterBinding;
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
    public ParticipantMultiplicity createParticipantMultiplicity() {
        ParticipantMultiplicityImpl participantMultiplicity = new ParticipantMultiplicityImpl();
        return participantMultiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeopleAssignment createPeopleAssignment() {
        PeopleAssignmentImpl peopleAssignment = new PeopleAssignmentImpl();
        return peopleAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeopleAssignmentExpression createPeopleAssignmentExpression() {
        PeopleAssignmentExpressionImpl peopleAssignmentExpression = new PeopleAssignmentExpressionImpl();
        return peopleAssignmentExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeopleAssignmentLiteral createPeopleAssignmentLiteral() {
        PeopleAssignmentLiteralImpl peopleAssignmentLiteral = new PeopleAssignmentLiteralImpl();
        return peopleAssignmentLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeopleAssignmentPeopleGroup createPeopleAssignmentPeopleGroup() {
        PeopleAssignmentPeopleGroupImpl peopleAssignmentPeopleGroup = new PeopleAssignmentPeopleGroupImpl();
        return peopleAssignmentPeopleGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeopleGroup createPeopleGroup() {
        PeopleGroupImpl peopleGroup = new PeopleGroupImpl();
        return peopleGroup;
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
    public org.eclipse.mdt.bpmn2.Process createProcess() {
        ProcessImpl process = new ProcessImpl();
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessRole createProcessRole() {
        ProcessRoleImpl processRole = new ProcessRoleImpl();
        return processRole;
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
    public Role createRole() {
        RoleImpl role = new RoleImpl();
        return role;
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
    public ServiceReference createServiceReference() {
        ServiceReferenceImpl serviceReference = new ServiceReferenceImpl();
        return serviceReference;
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
    public StructureDefinition createStructureDefinition() {
        StructureDefinitionImpl structureDefinition = new StructureDefinitionImpl();
        return structureDefinition;
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
    public AdHocOrdering createAdHocOrderingFromString(EDataType eDataType,
            String initialValue) {
        AdHocOrdering result = AdHocOrdering.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAdHocOrderingToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationDirection createAssociationDirectionFromString(
            EDataType eDataType, String initialValue) {
        AssociationDirection result = AssociationDirection.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssociationDirectionToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GatewayDirection createGatewayDirectionFromString(
            EDataType eDataType, String initialValue) {
        GatewayDirection result = GatewayDirection.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGatewayDirectionToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceFlowCondition createMultiInstanceFlowConditionFromString(
            EDataType eDataType, String initialValue) {
        MultiInstanceFlowCondition result = MultiInstanceFlowCondition
                .get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiInstanceFlowConditionToString(
            EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessTypeFromString(EDataType eDataType,
            String initialValue) {
        ProcessType result = ProcessType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationshipDirection createRelationshipDirectionFromString(
            EDataType eDataType, String initialValue) {
        RelationshipDirection result = RelationshipDirection.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRelationshipDirectionToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceImplementation createServiceImplementationFromString(
            EDataType eDataType, String initialValue) {
        ServiceImplementation result = ServiceImplementation.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceImplementationToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransactionMethod createTransactionMethodFromString(
            EDataType eDataType, String initialValue) {
        TransactionMethod result = TransactionMethod.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransactionMethodToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTaskImplementation createUserTaskImplementationFromString(
            EDataType eDataType, String initialValue) {
        UserTaskImplementation result = UserTaskImplementation
                .get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUserTaskImplementationToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocOrdering createAdHocOrderingObjectFromString(
            EDataType eDataType, String initialValue) {
        return createAdHocOrderingFromString(Bpmn2Package.eINSTANCE
                .getAdHocOrdering(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAdHocOrderingObjectToString(EDataType eDataType,
            Object instanceValue) {
        return convertAdHocOrderingToString(Bpmn2Package.eINSTANCE
                .getAdHocOrdering(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationDirection createAssociationDirectionObjectFromString(
            EDataType eDataType, String initialValue) {
        return createAssociationDirectionFromString(Bpmn2Package.eINSTANCE
                .getAssociationDirection(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssociationDirectionObjectToString(
            EDataType eDataType, Object instanceValue) {
        return convertAssociationDirectionToString(Bpmn2Package.eINSTANCE
                .getAssociationDirection(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GatewayDirection createGatewayDirectionObjectFromString(
            EDataType eDataType, String initialValue) {
        return createGatewayDirectionFromString(Bpmn2Package.eINSTANCE
                .getGatewayDirection(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGatewayDirectionObjectToString(EDataType eDataType,
            Object instanceValue) {
        return convertGatewayDirectionToString(Bpmn2Package.eINSTANCE
                .getGatewayDirection(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceFlowCondition createMultiInstanceFlowConditionObjectFromString(
            EDataType eDataType, String initialValue) {
        return createMultiInstanceFlowConditionFromString(
                Bpmn2Package.eINSTANCE.getMultiInstanceFlowCondition(),
                initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiInstanceFlowConditionObjectToString(
            EDataType eDataType, Object instanceValue) {
        return convertMultiInstanceFlowConditionToString(Bpmn2Package.eINSTANCE
                .getMultiInstanceFlowCondition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessTypeObjectFromString(EDataType eDataType,
            String initialValue) {
        return createProcessTypeFromString(Bpmn2Package.eINSTANCE
                .getProcessType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeObjectToString(EDataType eDataType,
            Object instanceValue) {
        return convertProcessTypeToString(Bpmn2Package.eINSTANCE
                .getProcessType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationshipDirection createRelationshipDirectionObjectFromString(
            EDataType eDataType, String initialValue) {
        return createRelationshipDirectionFromString(Bpmn2Package.eINSTANCE
                .getRelationshipDirection(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRelationshipDirectionObjectToString(
            EDataType eDataType, Object instanceValue) {
        return convertRelationshipDirectionToString(Bpmn2Package.eINSTANCE
                .getRelationshipDirection(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceImplementation createServiceImplementationObjectFromString(
            EDataType eDataType, String initialValue) {
        return createServiceImplementationFromString(Bpmn2Package.eINSTANCE
                .getServiceImplementation(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceImplementationObjectToString(
            EDataType eDataType, Object instanceValue) {
        return convertServiceImplementationToString(Bpmn2Package.eINSTANCE
                .getServiceImplementation(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransactionMethod createTransactionMethodObjectFromString(
            EDataType eDataType, String initialValue) {
        return createTransactionMethodFromString(Bpmn2Package.eINSTANCE
                .getTransactionMethod(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransactionMethodObjectToString(EDataType eDataType,
            Object instanceValue) {
        return convertTransactionMethodToString(Bpmn2Package.eINSTANCE
                .getTransactionMethod(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTaskImplementation createUserTaskImplementationObjectFromString(
            EDataType eDataType, String initialValue) {
        return createUserTaskImplementationFromString(Bpmn2Package.eINSTANCE
                .getUserTaskImplementation(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUserTaskImplementationObjectToString(
            EDataType eDataType, Object instanceValue) {
        return convertUserTaskImplementationToString(Bpmn2Package.eINSTANCE
                .getUserTaskImplementation(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bpmn2Package getBpmn2Package() {
        return (Bpmn2Package) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static Bpmn2Package getPackage() {
        return Bpmn2Package.eINSTANCE;
    }

} //Bpmn2FactoryImpl
