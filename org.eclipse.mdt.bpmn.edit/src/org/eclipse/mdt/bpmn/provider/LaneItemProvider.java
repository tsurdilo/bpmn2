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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.mdt.bpmn.Lane;
import org.eclipse.mdt.bpmn.bpmnFactory;
import org.eclipse.mdt.bpmn.bpmnPackage;

import org.eclipse.mdt.bpmn.di.diPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.Lane} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LaneItemProvider extends BaseElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LaneItemProvider(AdapterFactory adapterFactory) {
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

            addFlowElementRefPropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addPartitionElementRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Flow Element Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlowElementRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Lane_flowElementRef_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Lane_flowElementRef_feature", "_UI_Lane_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getLane_FlowElementRef(), true,
                        false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Lane_name_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Lane_name_feature", "_UI_Lane_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getLane_Name(), true, false,
                        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null, null));
    }

    /**
     * This adds a property descriptor for the Partition Element Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPartitionElementRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Lane_partitionElementRef_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Lane_partitionElementRef_feature", "_UI_Lane_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getLane_PartitionElementRef(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
                    .getLane_PartitionElement());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getLane_ChildLaneSet());
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
     * This returns Lane.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/Lane.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Lane) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Lane_type") : //$NON-NLS-1$
                getString("_UI_Lane_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(Lane.class)) {
        case bpmnPackage.LANE__FLOW_ELEMENT_REF:
        case bpmnPackage.LANE__NAME:
        case bpmnPackage.LANE__PARTITION_ELEMENT_REF:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case bpmnPackage.LANE__PARTITION_ELEMENT:
        case bpmnPackage.LANE__CHILD_LANE_SET:
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
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createActivityResource()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createAdHocSubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createAssignment()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createAuditing()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createBoundaryEvent()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                        .createTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCallableElement()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCallActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCallChoreographyActivity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCallConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCancelEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCategory()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCategoryValue()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createChoreography()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createChoreographySubProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCollaboration()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCommunication()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCompensateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createComplexBehaviorDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createComplexGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createConditionalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createConversationAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCorrelationKey()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCorrelationProperty()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCorrelationPropertyBinding()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCorrelationPropertyRetrievalExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createCorrelationSubscription()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createDataInput()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createDataObject()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createDataOutput()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createDataState()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createDataStore()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createDataStoreReference()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createEndEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createEndPoint()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createError()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createErrorEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createEscalation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createEscalationEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createEventBasedGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createExclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createGlobalTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createGlobalBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createGlobalChoreographyTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createGlobalCommunication()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createGlobalManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createGlobalScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createGlobalUserTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createGroup()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createPerformer()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createHumanPerformer()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createImplicitThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createInclusiveGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createInputOutputBinding()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createInputOutputSpecification()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createInputSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createInterface()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createItemDefinition()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                        .createLane()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createLaneSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createLinkEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createManualTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createMessage()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createMessageEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createMessageFlow()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createMessageFlowAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createMonitoring()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createMultiInstanceLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createOperation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createOutputSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createParallelGateway()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createParticipant()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createParticipantAssociation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createParticipantMultiplicity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createPartnerEntity()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createPartnerRole()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createProcess()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createProperty()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createReceiveTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createRelationship()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createRendering()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createResource()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createResourceAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createResourceParameter()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createResourceParameterBinding()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createScriptTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createSendTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createSequenceFlow()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createServiceTask()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createSignal()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createSignalEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createStandardLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createStartEvent()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createSubConversation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createTerminateEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createTextAnnotation()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createTimerEventDefinition()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createTransaction()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getLane_PartitionElement(), bpmnFactory.eINSTANCE
                .createUserTask()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getLane_ChildLaneSet(), bpmnFactory.eINSTANCE
                        .createLaneSet()));
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

        if (childFeature instanceof EStructuralFeature
                && FeatureMapUtil
                        .isFeatureMap((EStructuralFeature) childFeature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify = childFeature == diPackage.Literals.DOCUMENT_ROOT__CONNECTOR
                || childFeature == diPackage.Literals.DOCUMENT_ROOT__VIEW
                || childFeature == diPackage.Literals.DOCUMENT_ROOT__DIAGRAM
                || childFeature == diPackage.Literals.DOCUMENT_ROOT__NODE
                || childFeature == bpmnPackage.eINSTANCE
                        .getLane_PartitionElement()
                || childFeature == bpmnPackage.eINSTANCE.getLane_ChildLaneSet();

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
