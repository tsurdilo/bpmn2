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
package org.eclipse.mdt.bpmn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.mdt.bpmn.DocumentRoot;
import org.eclipse.mdt.bpmn.bpmnFactory;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider extends ItemProviderAdapter implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRootItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(
            Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Activity());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ActivityResource());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_AdHocSubProcess());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_FlowElement());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Artifact());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Assignment());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Association());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Auditing());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_BaseElement());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_BaseElementWithMixedContent());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_BoundaryEvent());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_BusinessRuleTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CallableElement());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CallActivity());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CallChoreographyActivity());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CallConversation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ConversationNode());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CancelEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_EventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_RootElement());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CatchEvent());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Category());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CategoryValue());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Choreography());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ChoreographyActivity());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ChoreographySubProcess());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ChoreographyTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Collaboration());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Communication());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CompensateEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ComplexBehaviorDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ComplexGateway());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ConditionalEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Conversation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ConversationAssociation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CorrelationKey());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CorrelationProperty());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CorrelationPropertyBinding());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CorrelationPropertyRetrievalExpression());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_CorrelationSubscription());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_DataAssociation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_DataInput());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_DataInputAssociation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_DataObject());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_DataOutput());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_DataOutputAssociation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_DataState());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_DataStore());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_DataStoreReference());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Definitions());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Documentation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_EndEvent());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_EndPoint());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getDocumentRoot_Error());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ErrorEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Escalation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_EscalationEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getDocumentRoot_Event());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_EventBasedGateway());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ExclusiveGateway());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Expression());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Extension());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_FlowNode());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_FormalExpression());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Gateway());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_GlobalBusinessRuleTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_GlobalChoreographyTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_GlobalCommunication());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_GlobalManualTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_GlobalScriptTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_GlobalTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_GlobalUserTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getDocumentRoot_Group());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_HumanPerformer());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Performer());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ImplicitThrowEvent());
            childrenFeatures
                    .add(bpmnPackage.eINSTANCE.getDocumentRoot_Import());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_InclusiveGateway());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_InputSet());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Interface());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_IntermediateCatchEvent());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_IntermediateThrowEvent());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_IoBinding());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_IoSpecification());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ItemDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getDocumentRoot_Lane());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_LaneSet());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_LinkEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_LoopCharacteristics());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ManualTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Message());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_MessageEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_MessageFlow());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_MessageFlowAssociation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Monitoring());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_MultiInstanceLoopCharacteristics());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Operation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_OutputSet());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ParallelGateway());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Participant());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ParticipantAssociation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ParticipantMultiplicity());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_PartnerEntity());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_PartnerRole());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_PotentialOwner());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Process());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Property());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ReceiveTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Relationship());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Rendering());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Resource());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ResourceAssignmentExpression());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ResourceParameter());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ResourceParameterBinding());
            childrenFeatures
                    .add(bpmnPackage.eINSTANCE.getDocumentRoot_Script());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ScriptTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_SendTask());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_SequenceFlow());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ServiceTask());
            childrenFeatures
                    .add(bpmnPackage.eINSTANCE.getDocumentRoot_Signal());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_SignalEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_StandardLoopCharacteristics());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_StartEvent());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_SubConversation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_SubProcess());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getDocumentRoot_Task());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_TerminateEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getDocumentRoot_Text());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_TextAnnotation());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_ThrowEvent());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_TimerEventDefinition());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_Transaction());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDocumentRoot_UserTask());
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns DocumentRoot.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/DocumentRoot.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_DocumentRoot_type"); //$NON-NLS-1$
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DocumentRoot.class)) {
        case bpmnPackage.DOCUMENT_ROOT__ACTIVITY:
        case bpmnPackage.DOCUMENT_ROOT__ACTIVITY_RESOURCE:
        case bpmnPackage.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
        case bpmnPackage.DOCUMENT_ROOT__FLOW_ELEMENT:
        case bpmnPackage.DOCUMENT_ROOT__ARTIFACT:
        case bpmnPackage.DOCUMENT_ROOT__ASSIGNMENT:
        case bpmnPackage.DOCUMENT_ROOT__ASSOCIATION:
        case bpmnPackage.DOCUMENT_ROOT__AUDITING:
        case bpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT:
        case bpmnPackage.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
        case bpmnPackage.DOCUMENT_ROOT__BOUNDARY_EVENT:
        case bpmnPackage.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
        case bpmnPackage.DOCUMENT_ROOT__CALLABLE_ELEMENT:
        case bpmnPackage.DOCUMENT_ROOT__CALL_ACTIVITY:
        case bpmnPackage.DOCUMENT_ROOT__CALL_CHOREOGRAPHY_ACTIVITY:
        case bpmnPackage.DOCUMENT_ROOT__CALL_CONVERSATION:
        case bpmnPackage.DOCUMENT_ROOT__CONVERSATION_NODE:
        case bpmnPackage.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__ROOT_ELEMENT:
        case bpmnPackage.DOCUMENT_ROOT__CATCH_EVENT:
        case bpmnPackage.DOCUMENT_ROOT__CATEGORY:
        case bpmnPackage.DOCUMENT_ROOT__CATEGORY_VALUE:
        case bpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY:
        case bpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
        case bpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_SUB_PROCESS:
        case bpmnPackage.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
        case bpmnPackage.DOCUMENT_ROOT__COLLABORATION:
        case bpmnPackage.DOCUMENT_ROOT__COMMUNICATION:
        case bpmnPackage.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__COMPLEX_GATEWAY:
        case bpmnPackage.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__CONVERSATION:
        case bpmnPackage.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
        case bpmnPackage.DOCUMENT_ROOT__CORRELATION_KEY:
        case bpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY:
        case bpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
        case bpmnPackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
        case bpmnPackage.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
        case bpmnPackage.DOCUMENT_ROOT__DATA_ASSOCIATION:
        case bpmnPackage.DOCUMENT_ROOT__DATA_INPUT:
        case bpmnPackage.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
        case bpmnPackage.DOCUMENT_ROOT__DATA_OBJECT:
        case bpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT:
        case bpmnPackage.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
        case bpmnPackage.DOCUMENT_ROOT__DATA_STATE:
        case bpmnPackage.DOCUMENT_ROOT__DATA_STORE:
        case bpmnPackage.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
        case bpmnPackage.DOCUMENT_ROOT__DEFINITIONS:
        case bpmnPackage.DOCUMENT_ROOT__DOCUMENTATION:
        case bpmnPackage.DOCUMENT_ROOT__END_EVENT:
        case bpmnPackage.DOCUMENT_ROOT__END_POINT:
        case bpmnPackage.DOCUMENT_ROOT__ERROR:
        case bpmnPackage.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__ESCALATION:
        case bpmnPackage.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__EVENT:
        case bpmnPackage.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
        case bpmnPackage.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
        case bpmnPackage.DOCUMENT_ROOT__EXPRESSION:
        case bpmnPackage.DOCUMENT_ROOT__EXTENSION:
        case bpmnPackage.DOCUMENT_ROOT__FLOW_NODE:
        case bpmnPackage.DOCUMENT_ROOT__FORMAL_EXPRESSION:
        case bpmnPackage.DOCUMENT_ROOT__GATEWAY:
        case bpmnPackage.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
        case bpmnPackage.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
        case bpmnPackage.DOCUMENT_ROOT__GLOBAL_COMMUNICATION:
        case bpmnPackage.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
        case bpmnPackage.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
        case bpmnPackage.DOCUMENT_ROOT__GLOBAL_TASK:
        case bpmnPackage.DOCUMENT_ROOT__GLOBAL_USER_TASK:
        case bpmnPackage.DOCUMENT_ROOT__GROUP:
        case bpmnPackage.DOCUMENT_ROOT__HUMAN_PERFORMER:
        case bpmnPackage.DOCUMENT_ROOT__PERFORMER:
        case bpmnPackage.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
        case bpmnPackage.DOCUMENT_ROOT__IMPORT:
        case bpmnPackage.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
        case bpmnPackage.DOCUMENT_ROOT__INPUT_SET:
        case bpmnPackage.DOCUMENT_ROOT__INTERFACE:
        case bpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
        case bpmnPackage.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
        case bpmnPackage.DOCUMENT_ROOT__IO_BINDING:
        case bpmnPackage.DOCUMENT_ROOT__IO_SPECIFICATION:
        case bpmnPackage.DOCUMENT_ROOT__ITEM_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__LANE:
        case bpmnPackage.DOCUMENT_ROOT__LANE_SET:
        case bpmnPackage.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
        case bpmnPackage.DOCUMENT_ROOT__MANUAL_TASK:
        case bpmnPackage.DOCUMENT_ROOT__MESSAGE:
        case bpmnPackage.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW:
        case bpmnPackage.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
        case bpmnPackage.DOCUMENT_ROOT__MONITORING:
        case bpmnPackage.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
        case bpmnPackage.DOCUMENT_ROOT__OPERATION:
        case bpmnPackage.DOCUMENT_ROOT__OUTPUT_SET:
        case bpmnPackage.DOCUMENT_ROOT__PARALLEL_GATEWAY:
        case bpmnPackage.DOCUMENT_ROOT__PARTICIPANT:
        case bpmnPackage.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
        case bpmnPackage.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
        case bpmnPackage.DOCUMENT_ROOT__PARTNER_ENTITY:
        case bpmnPackage.DOCUMENT_ROOT__PARTNER_ROLE:
        case bpmnPackage.DOCUMENT_ROOT__POTENTIAL_OWNER:
        case bpmnPackage.DOCUMENT_ROOT__PROCESS:
        case bpmnPackage.DOCUMENT_ROOT__PROPERTY:
        case bpmnPackage.DOCUMENT_ROOT__RECEIVE_TASK:
        case bpmnPackage.DOCUMENT_ROOT__RELATIONSHIP:
        case bpmnPackage.DOCUMENT_ROOT__RENDERING:
        case bpmnPackage.DOCUMENT_ROOT__RESOURCE:
        case bpmnPackage.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
        case bpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER:
        case bpmnPackage.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
        case bpmnPackage.DOCUMENT_ROOT__SCRIPT:
        case bpmnPackage.DOCUMENT_ROOT__SCRIPT_TASK:
        case bpmnPackage.DOCUMENT_ROOT__SEND_TASK:
        case bpmnPackage.DOCUMENT_ROOT__SEQUENCE_FLOW:
        case bpmnPackage.DOCUMENT_ROOT__SERVICE_TASK:
        case bpmnPackage.DOCUMENT_ROOT__SIGNAL:
        case bpmnPackage.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
        case bpmnPackage.DOCUMENT_ROOT__START_EVENT:
        case bpmnPackage.DOCUMENT_ROOT__SUB_CONVERSATION:
        case bpmnPackage.DOCUMENT_ROOT__SUB_PROCESS:
        case bpmnPackage.DOCUMENT_ROOT__TASK:
        case bpmnPackage.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__TEXT:
        case bpmnPackage.DOCUMENT_ROOT__TEXT_ANNOTATION:
        case bpmnPackage.DOCUMENT_ROOT__THROW_EVENT:
        case bpmnPackage.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
        case bpmnPackage.DOCUMENT_ROOT__TRANSACTION:
        case bpmnPackage.DOCUMENT_ROOT__USER_TASK:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(
            Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createAdHocSubProcess()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                        .createTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createCallActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createReceiveTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createSendTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createServiceTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createTransaction()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity(), bpmnFactory.eINSTANCE
                .createUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ActivityResource(), bpmnFactory.eINSTANCE
                .createActivityResource()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ActivityResource(), bpmnFactory.eINSTANCE
                .createPerformer()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ActivityResource(), bpmnFactory.eINSTANCE
                .createHumanPerformer()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ActivityResource(), bpmnFactory.eINSTANCE
                .createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_AdHocSubProcess(), bpmnFactory.eINSTANCE
                .createAdHocSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createAdHocSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createBoundaryEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createCallActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createCallChoreographyActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createChoreographySubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createComplexGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createDataObject()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createDataStoreReference()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createEndEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createEventBasedGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createExclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createImplicitThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createInclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createParallelGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createReceiveTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createSendTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createSequenceFlow()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createServiceTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createStartEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createTransaction()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowElement(), bpmnFactory.eINSTANCE
                .createUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Artifact(), bpmnFactory.eINSTANCE
                .createAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Artifact(), bpmnFactory.eINSTANCE
                .createGroup()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Artifact(), bpmnFactory.eINSTANCE
                .createTextAnnotation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Assignment(), bpmnFactory.eINSTANCE
                .createAssignment()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Association(), bpmnFactory.eINSTANCE
                .createAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Auditing(), bpmnFactory.eINSTANCE
                .createAuditing()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createActivityResource()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createAdHocSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createAssignment()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createAuditing()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createBoundaryEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCallableElement()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCallActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCallChoreographyActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCallConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCancelEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCategory()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCategoryValue()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createChoreography()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createChoreographySubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCollaboration()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCommunication()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCompensateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createComplexBehaviorDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createComplexGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createConditionalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createConversationAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCorrelationKey()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCorrelationProperty()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCorrelationPropertyBinding()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCorrelationPropertyRetrievalExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createCorrelationSubscription()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createDataInput()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createDataObject()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createDataOutput()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createDataState()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createDataStore()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createDataStoreReference()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createEndEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createEndPoint()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createError()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createErrorEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createEscalation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createEscalationEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createEventBasedGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createExclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createGlobalTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createGlobalBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createGlobalChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createGlobalCommunication()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createGlobalManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createGlobalScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createGlobalUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createGroup()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createPerformer()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createHumanPerformer()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createImplicitThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createInclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createInputOutputBinding()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createInputOutputSpecification()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createInputSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createInterface()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createItemDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createLane()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createLaneSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createLinkEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createMessage()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createMessageEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createMessageFlow()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createMessageFlowAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createMonitoring()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createMultiInstanceLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createOperation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createOutputSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createParallelGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createParticipant()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createParticipantAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createParticipantMultiplicity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createPartnerEntity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createPartnerRole()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createProperty()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createReceiveTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createRelationship()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createRendering()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createResource()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createResourceAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createResourceParameter()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createResourceParameterBinding()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createSendTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createSequenceFlow()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createServiceTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createSignal()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createSignalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createStandardLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createStartEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createSubConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createTerminateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createTextAnnotation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createTimerEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createTransaction()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElement(), bpmnFactory.eINSTANCE
                .createUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElementWithMixedContent(),
                bpmnFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BaseElementWithMixedContent(),
                bpmnFactory.eINSTANCE.createFormalExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BoundaryEvent(), bpmnFactory.eINSTANCE
                .createBoundaryEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_BusinessRuleTask(), bpmnFactory.eINSTANCE
                .createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createCallableElement()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createChoreography()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createGlobalTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createGlobalBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createGlobalChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createGlobalCommunication()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createGlobalManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createGlobalScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createGlobalUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallableElement(), bpmnFactory.eINSTANCE
                .createProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallActivity(), bpmnFactory.eINSTANCE
                .createCallActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallChoreographyActivity(),
                bpmnFactory.eINSTANCE.createCallChoreographyActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CallConversation(), bpmnFactory.eINSTANCE
                .createCallConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ConversationNode(), bpmnFactory.eINSTANCE
                .createCallConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ConversationNode(), bpmnFactory.eINSTANCE
                .createCommunication()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ConversationNode(), bpmnFactory.eINSTANCE
                .createSubConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CancelEventDefinition(), bpmnFactory.eINSTANCE
                .createCancelEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createCancelEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createCompensateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createConditionalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createErrorEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createEscalationEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createLinkEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createMessageEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createSignalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createTerminateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventDefinition(), bpmnFactory.eINSTANCE
                .createTimerEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createCallableElement()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createCancelEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createCategory()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createChoreography()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createCollaboration()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createCompensateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createConditionalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createCorrelationProperty()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createDataStore()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createEndPoint()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createError()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createErrorEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createEscalation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createEscalationEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createGlobalTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createGlobalBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createGlobalChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createGlobalCommunication()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createGlobalManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createGlobalScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createGlobalUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createInterface()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createItemDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createLinkEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createMessage()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createMessageEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createPartnerEntity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createPartnerRole()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createResource()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createSignal()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createSignalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createTerminateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_RootElement(), bpmnFactory.eINSTANCE
                .createTimerEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CatchEvent(), bpmnFactory.eINSTANCE
                .createBoundaryEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CatchEvent(), bpmnFactory.eINSTANCE
                .createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CatchEvent(), bpmnFactory.eINSTANCE
                .createStartEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Category(), bpmnFactory.eINSTANCE
                .createCategory()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CategoryValue(), bpmnFactory.eINSTANCE
                .createCategoryValue()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Choreography(), bpmnFactory.eINSTANCE
                .createChoreography()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ChoreographyActivity(), bpmnFactory.eINSTANCE
                .createCallChoreographyActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ChoreographyActivity(), bpmnFactory.eINSTANCE
                .createChoreographySubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ChoreographyActivity(), bpmnFactory.eINSTANCE
                .createChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ChoreographySubProcess(),
                bpmnFactory.eINSTANCE.createChoreographySubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ChoreographyTask(), bpmnFactory.eINSTANCE
                .createChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Collaboration(), bpmnFactory.eINSTANCE
                .createCollaboration()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Communication(), bpmnFactory.eINSTANCE
                .createCommunication()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CompensateEventDefinition(),
                bpmnFactory.eINSTANCE.createCompensateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ComplexBehaviorDefinition(),
                bpmnFactory.eINSTANCE.createComplexBehaviorDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ComplexGateway(), bpmnFactory.eINSTANCE
                .createComplexGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ConditionalEventDefinition(),
                bpmnFactory.eINSTANCE.createConditionalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Conversation(), bpmnFactory.eINSTANCE
                .createConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ConversationAssociation(),
                bpmnFactory.eINSTANCE.createConversationAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CorrelationKey(), bpmnFactory.eINSTANCE
                .createCorrelationKey()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CorrelationProperty(), bpmnFactory.eINSTANCE
                .createCorrelationProperty()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CorrelationPropertyBinding(),
                bpmnFactory.eINSTANCE.createCorrelationPropertyBinding()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CorrelationPropertyRetrievalExpression(),
                bpmnFactory.eINSTANCE
                        .createCorrelationPropertyRetrievalExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_CorrelationSubscription(),
                bpmnFactory.eINSTANCE.createCorrelationSubscription()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataAssociation(), bpmnFactory.eINSTANCE
                .createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataAssociation(), bpmnFactory.eINSTANCE
                .createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataInput(), bpmnFactory.eINSTANCE
                .createDataInput()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataInputAssociation(), bpmnFactory.eINSTANCE
                .createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataObject(), bpmnFactory.eINSTANCE
                .createDataObject()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataOutput(), bpmnFactory.eINSTANCE
                .createDataOutput()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataOutputAssociation(), bpmnFactory.eINSTANCE
                .createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataState(), bpmnFactory.eINSTANCE
                .createDataState()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataStore(), bpmnFactory.eINSTANCE
                .createDataStore()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_DataStoreReference(), bpmnFactory.eINSTANCE
                .createDataStoreReference()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Definitions(), bpmnFactory.eINSTANCE
                .createDefinitions()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Documentation(), bpmnFactory.eINSTANCE
                .createDocumentation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EndEvent(), bpmnFactory.eINSTANCE
                .createEndEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EndPoint(), bpmnFactory.eINSTANCE
                .createEndPoint()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Error(), bpmnFactory.eINSTANCE.createError()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ErrorEventDefinition(), bpmnFactory.eINSTANCE
                .createErrorEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Escalation(), bpmnFactory.eINSTANCE
                .createEscalation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EscalationEventDefinition(),
                bpmnFactory.eINSTANCE.createEscalationEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Event(), bpmnFactory.eINSTANCE
                .createBoundaryEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Event(), bpmnFactory.eINSTANCE
                .createEndEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Event(), bpmnFactory.eINSTANCE
                .createImplicitThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Event(), bpmnFactory.eINSTANCE
                .createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Event(), bpmnFactory.eINSTANCE
                .createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Event(), bpmnFactory.eINSTANCE
                .createStartEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_EventBasedGateway(), bpmnFactory.eINSTANCE
                .createEventBasedGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ExclusiveGateway(), bpmnFactory.eINSTANCE
                .createExclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Expression(), bpmnFactory.eINSTANCE
                .createExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Expression(), bpmnFactory.eINSTANCE
                .createFormalExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Extension(), bpmnFactory.eINSTANCE
                .createExtension()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createAdHocSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createBoundaryEvent()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                        .createTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createCallActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createCallChoreographyActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createChoreographySubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createComplexGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createEndEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createEventBasedGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createExclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createImplicitThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createInclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createParallelGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createReceiveTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createSendTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createServiceTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createStartEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createTransaction()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FlowNode(), bpmnFactory.eINSTANCE
                .createUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_FormalExpression(), bpmnFactory.eINSTANCE
                .createFormalExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalBusinessRuleTask(),
                bpmnFactory.eINSTANCE.createGlobalBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalChoreographyTask(),
                bpmnFactory.eINSTANCE.createGlobalChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalCommunication(), bpmnFactory.eINSTANCE
                .createGlobalCommunication()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalManualTask(), bpmnFactory.eINSTANCE
                .createGlobalManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalScriptTask(), bpmnFactory.eINSTANCE
                .createGlobalScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalTask(), bpmnFactory.eINSTANCE
                .createGlobalTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalTask(), bpmnFactory.eINSTANCE
                .createGlobalBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalTask(), bpmnFactory.eINSTANCE
                .createGlobalManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalTask(), bpmnFactory.eINSTANCE
                .createGlobalScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalTask(), bpmnFactory.eINSTANCE
                .createGlobalUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_GlobalUserTask(), bpmnFactory.eINSTANCE
                .createGlobalUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Group(), bpmnFactory.eINSTANCE.createGroup()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_HumanPerformer(), bpmnFactory.eINSTANCE
                .createHumanPerformer()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_HumanPerformer(), bpmnFactory.eINSTANCE
                .createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Performer(), bpmnFactory.eINSTANCE
                .createPerformer()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Performer(), bpmnFactory.eINSTANCE
                .createHumanPerformer()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Performer(), bpmnFactory.eINSTANCE
                .createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ImplicitThrowEvent(), bpmnFactory.eINSTANCE
                .createImplicitThrowEvent()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDocumentRoot_Import(), bpmnFactory.eINSTANCE
                        .createImport()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_InclusiveGateway(), bpmnFactory.eINSTANCE
                .createInclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_InputSet(), bpmnFactory.eINSTANCE
                .createInputSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Interface(), bpmnFactory.eINSTANCE
                .createInterface()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_IntermediateCatchEvent(),
                bpmnFactory.eINSTANCE.createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_IntermediateThrowEvent(),
                bpmnFactory.eINSTANCE.createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_IoBinding(), bpmnFactory.eINSTANCE
                .createInputOutputBinding()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_IoSpecification(), bpmnFactory.eINSTANCE
                .createInputOutputSpecification()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ItemDefinition(), bpmnFactory.eINSTANCE
                .createItemDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Lane(), bpmnFactory.eINSTANCE.createLane()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_LaneSet(), bpmnFactory.eINSTANCE
                .createLaneSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_LinkEventDefinition(), bpmnFactory.eINSTANCE
                .createLinkEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_LoopCharacteristics(), bpmnFactory.eINSTANCE
                .createMultiInstanceLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_LoopCharacteristics(), bpmnFactory.eINSTANCE
                .createStandardLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ManualTask(), bpmnFactory.eINSTANCE
                .createManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Message(), bpmnFactory.eINSTANCE
                .createMessage()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_MessageEventDefinition(),
                bpmnFactory.eINSTANCE.createMessageEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_MessageFlow(), bpmnFactory.eINSTANCE
                .createMessageFlow()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_MessageFlowAssociation(),
                bpmnFactory.eINSTANCE.createMessageFlowAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Monitoring(), bpmnFactory.eINSTANCE
                .createMonitoring()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics(),
                        bpmnFactory.eINSTANCE
                                .createMultiInstanceLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Operation(), bpmnFactory.eINSTANCE
                .createOperation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_OutputSet(), bpmnFactory.eINSTANCE
                .createOutputSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ParallelGateway(), bpmnFactory.eINSTANCE
                .createParallelGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Participant(), bpmnFactory.eINSTANCE
                .createParticipant()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ParticipantAssociation(),
                bpmnFactory.eINSTANCE.createParticipantAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ParticipantMultiplicity(),
                bpmnFactory.eINSTANCE.createParticipantMultiplicity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_PartnerEntity(), bpmnFactory.eINSTANCE
                .createPartnerEntity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_PartnerRole(), bpmnFactory.eINSTANCE
                .createPartnerRole()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_PotentialOwner(), bpmnFactory.eINSTANCE
                .createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Process(), bpmnFactory.eINSTANCE
                .createProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Property(), bpmnFactory.eINSTANCE
                .createProperty()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ReceiveTask(), bpmnFactory.eINSTANCE
                .createReceiveTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Relationship(), bpmnFactory.eINSTANCE
                .createRelationship()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Rendering(), bpmnFactory.eINSTANCE
                .createRendering()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Resource(), bpmnFactory.eINSTANCE
                .createResource()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ResourceAssignmentExpression(),
                bpmnFactory.eINSTANCE.createResourceAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ResourceParameter(), bpmnFactory.eINSTANCE
                .createResourceParameter()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ResourceParameterBinding(),
                bpmnFactory.eINSTANCE.createResourceParameterBinding()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDocumentRoot_Script(), bpmnFactory.eINSTANCE
                        .createScript()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ScriptTask(), bpmnFactory.eINSTANCE
                .createScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_SendTask(), bpmnFactory.eINSTANCE
                .createSendTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_SequenceFlow(), bpmnFactory.eINSTANCE
                .createSequenceFlow()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ServiceTask(), bpmnFactory.eINSTANCE
                .createServiceTask()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDocumentRoot_Signal(), bpmnFactory.eINSTANCE
                        .createSignal()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_SignalEventDefinition(), bpmnFactory.eINSTANCE
                .createSignalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_StandardLoopCharacteristics(),
                bpmnFactory.eINSTANCE.createStandardLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_StartEvent(), bpmnFactory.eINSTANCE
                .createStartEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_SubConversation(), bpmnFactory.eINSTANCE
                .createSubConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_SubProcess(), bpmnFactory.eINSTANCE
                .createSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_SubProcess(), bpmnFactory.eINSTANCE
                .createAdHocSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Task(), bpmnFactory.eINSTANCE.createTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Task(), bpmnFactory.eINSTANCE
                .createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Task(), bpmnFactory.eINSTANCE
                .createManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Task(), bpmnFactory.eINSTANCE
                .createReceiveTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Task(), bpmnFactory.eINSTANCE
                .createScriptTask()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDocumentRoot_Task(), bpmnFactory.eINSTANCE
                        .createSendTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Task(), bpmnFactory.eINSTANCE
                .createServiceTask()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDocumentRoot_Task(), bpmnFactory.eINSTANCE
                        .createUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_TerminateEventDefinition(),
                bpmnFactory.eINSTANCE.createTerminateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Text(), bpmnFactory.eINSTANCE.createText()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_TextAnnotation(), bpmnFactory.eINSTANCE
                .createTextAnnotation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ThrowEvent(), bpmnFactory.eINSTANCE
                .createEndEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ThrowEvent(), bpmnFactory.eINSTANCE
                .createImplicitThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_ThrowEvent(), bpmnFactory.eINSTANCE
                .createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_TimerEventDefinition(), bpmnFactory.eINSTANCE
                .createTimerEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_Transaction(), bpmnFactory.eINSTANCE
                .createTransaction()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDocumentRoot_UserTask(), bpmnFactory.eINSTANCE
                .createUserTask()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature,
            Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == bpmnPackage.eINSTANCE
                .getDocumentRoot_Activity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_FlowElement()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_BaseElement()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_FlowNode()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SubProcess()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_AdHocSubProcess()
                || childFeature == bpmnPackage.eINSTANCE.getDocumentRoot_Task()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_BusinessRuleTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallActivity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ManualTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ReceiveTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ScriptTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SendTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ServiceTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Transaction()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_UserTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ActivityResource()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Performer()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_HumanPerformer()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_PotentialOwner()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_BoundaryEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CatchEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Event()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ChoreographyActivity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ChoreographySubProcess()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ChoreographyTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ComplexGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataObject()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataStoreReference()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_EndEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ThrowEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_EventBasedGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ExclusiveGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ImplicitThrowEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_InclusiveGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_IntermediateCatchEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_IntermediateThrowEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ParallelGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SequenceFlow()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_StartEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Artifact()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Association()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Group()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_TextAnnotation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Assignment()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Auditing()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallableElement()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_RootElement()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallConversation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ConversationNode()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_EventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Category()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CategoryValue()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Choreography()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Collaboration()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Communication()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ComplexBehaviorDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Conversation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ConversationAssociation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationKey()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationProperty()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationPropertyBinding()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationPropertyRetrievalExpression()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationSubscription()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataInput()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataAssociation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataInputAssociation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataOutput()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataOutputAssociation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataState()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataStore()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_EndPoint()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Error()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ErrorEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Escalation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalBusinessRuleTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalChoreographyTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalCommunication()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalManualTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalScriptTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalUserTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_IoBinding()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_IoSpecification()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_InputSet()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Interface()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ItemDefinition()
                || childFeature == bpmnPackage.eINSTANCE.getDocumentRoot_Lane()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_LaneSet()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Message()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageFlow()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageFlowAssociation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Monitoring()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_LoopCharacteristics()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Operation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_OutputSet()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Participant()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ParticipantAssociation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ParticipantMultiplicity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_PartnerEntity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_PartnerRole()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Process()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Property()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Relationship()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Rendering()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Resource()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ResourceAssignmentExpression()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ResourceParameter()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ResourceParameterBinding()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Signal()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SignalEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SubConversation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_TimerEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_BaseElementWithMixedContent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Expression()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_FormalExpression();

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return bpmnEditPlugin.INSTANCE;
    }

}
