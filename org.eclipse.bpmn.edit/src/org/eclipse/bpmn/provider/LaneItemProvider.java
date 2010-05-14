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
package org.eclipse.bpmn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn.BpmnFactory;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.Lane;

import org.eclipse.bpmn.di.DIPackage;

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

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn.Lane} object.
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
                        BpmnPackage.eINSTANCE.getLane_FlowElementRef(), true,
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
                        BpmnPackage.eINSTANCE.getLane_Name(), true, false,
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
                        BpmnPackage.eINSTANCE.getLane_PartitionElementRef(),
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
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getLane_PartitionElement());
            childrenFeatures.add(BpmnPackage.eINSTANCE.getLane_ChildLaneSet());
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
        try {
            return overlayImage(object,
                    getResourceLocator().getImage("full/obj16/Lane.png")); //$NON-NLS-1$
        } catch (java.util.MissingResourceException e) {
            return overlayImage(object,
                    getResourceLocator().getImage("full/obj16/Lane.gif")); //$NON-NLS-1$
        }
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
        case BpmnPackage.LANE__FLOW_ELEMENT_REF:
        case BpmnPackage.LANE__NAME:
        case BpmnPackage.LANE__PARTITION_ELEMENT_REF:
            fireNotifyChanged(new ViewerNotification(notification,
                    notification.getNotifier(), false, true));
            return;
        case BpmnPackage.LANE__PARTITION_ELEMENT:
        case BpmnPackage.LANE__CHILD_LANE_SET:
            fireNotifyChanged(new ViewerNotification(notification,
                    notification.getNotifier(), true, false));
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

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createActivityResource()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createSubProcess()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createAssignment()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createAssociation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createAuditing()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createBoundaryEvent()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCallableElement()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCallActivity()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCallChoreographyActivity()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCallConversation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCancelEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCategory()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCategoryValue()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createChoreography()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createChoreographySubProcess()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createChoreographyTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCollaboration()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCommunication()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCompensateEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createComplexBehaviorDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createGateway()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createComplexGateway()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createConditionalEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createConversation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createConversationAssociation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCorrelationKey()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCorrelationProperty()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCorrelationPropertyBinding()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getLane_PartitionElement(), BpmnFactory.eINSTANCE
                .createCorrelationPropertyRetrievalExpression()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createCorrelationSubscription()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createDataInput()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createDataObject()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createDataOutput()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createDataState()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createDataStore()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createDataStoreReference()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createEndEvent()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createEndPoint()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createError()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createErrorEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createEscalation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createEscalationEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createEventBasedGateway()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createExclusiveGateway()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createGlobalTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createGlobalBusinessRuleTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createGlobalChoreographyTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createGlobalCommunication()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createGlobalManualTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createGlobalScriptTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createGlobalUserTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createGroup()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createPerformer()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createHumanPerformer()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createInclusiveGateway()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createInputOutputBinding()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createInputOutputSpecification()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createInputSet()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createInterface()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createItemDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createLane()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createLaneSet()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createLinkEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createManualTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createMessage()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createMessageEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createMessageFlow()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createMessageFlowAssociation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createMonitoring()));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getLane_PartitionElement(), BpmnFactory.eINSTANCE
                        .createMultiInstanceLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createOperation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createOutputSet()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createParallelGateway()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createParticipant()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createParticipantAssociation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createParticipantMultiplicity()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createPartnerEntity()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createPartnerRole()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createPotentialOwner()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createProcess()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createProperty()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createReceiveTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createRelationship()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createRendering()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createResource()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createResourceAssignmentExpression()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createResourceParameter()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createResourceParameterBinding()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createScriptTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createSendTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createSequenceFlow()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createServiceTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createSignal()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createSignalEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createStandardLoopCharacteristics()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createStartEvent()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createSubConversation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createTerminateEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createTextAnnotation()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createTimerEventDefinition()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createTransaction()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_PartitionElement(),
                BpmnFactory.eINSTANCE.createUserTask()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getLane_ChildLaneSet(),
                BpmnFactory.eINSTANCE.createLaneSet()));
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

        boolean qualify = childFeature == DIPackage.Literals.DOCUMENT_ROOT__CONNECTOR
                || childFeature == DIPackage.Literals.DOCUMENT_ROOT__VIEW
                || childFeature == DIPackage.Literals.DOCUMENT_ROOT__DIAGRAM
                || childFeature == DIPackage.Literals.DOCUMENT_ROOT__NODE
                || childFeature == BpmnPackage.eINSTANCE
                        .getLane_PartitionElement()
                || childFeature == BpmnPackage.eINSTANCE.getLane_ChildLaneSet();

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
