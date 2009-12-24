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

import org.eclipse.mdt.bpmn.Activity;
import org.eclipse.mdt.bpmn.BpmnFactory;
import org.eclipse.mdt.bpmn.BpmnPackage;

import org.eclipse.mdt.bpmn.di.DIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends FlowNodeItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityItemProvider(AdapterFactory adapterFactory) {
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

            addCompletionQuantityPropertyDescriptor(object);
            addDefaultPropertyDescriptor(object);
            addIsForCompensationPropertyDescriptor(object);
            addStartQuantityPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Completion Quantity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCompletionQuantityPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Activity_completionQuantity_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Activity_completionQuantity_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getActivity_CompletionQuantity(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Default feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefaultPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Activity_default_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Activity_default_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getActivity_Default(), true,
                        false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is For Compensation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsForCompensationPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Activity_isForCompensation_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Activity_isForCompensation_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getActivity_IsForCompensation(),
                        true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Start Quantity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartQuantityPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Activity_startQuantity_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Activity_startQuantity_feature", "_UI_Activity_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getActivity_StartQuantity(),
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
                    .getActivity_IoSpecification());
            childrenFeatures.add(BpmnPackage.eINSTANCE.getActivity_Property());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getActivity_DataInputAssociation());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getActivity_DataOutputAssociation());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getActivity_ActivityResourceGroup());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getActivity_LoopCharacteristicsGroup());
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Activity) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Activity_type") : //$NON-NLS-1$
                getString("_UI_Activity_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(Activity.class)) {
        case BpmnPackage.ACTIVITY__COMPLETION_QUANTITY:
        case BpmnPackage.ACTIVITY__DEFAULT:
        case BpmnPackage.ACTIVITY__IS_FOR_COMPENSATION:
        case BpmnPackage.ACTIVITY__START_QUANTITY:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case BpmnPackage.ACTIVITY__IO_SPECIFICATION:
        case BpmnPackage.ACTIVITY__PROPERTY:
        case BpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATION:
        case BpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUP:
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
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

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_IoSpecification(), BpmnFactory.eINSTANCE
                .createInputOutputSpecification()));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getActivity_Property(), BpmnFactory.eINSTANCE
                        .createProperty()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_DataInputAssociation(), BpmnFactory.eINSTANCE
                .createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_DataOutputAssociation(), BpmnFactory.eINSTANCE
                .createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getActivity_ActivityResource(), BpmnFactory.eINSTANCE
                        .createActivityResource())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getActivity_ActivityResource(), BpmnFactory.eINSTANCE
                        .createPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getActivity_ActivityResource(), BpmnFactory.eINSTANCE
                        .createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getActivity_ActivityResource(), BpmnFactory.eINSTANCE
                        .createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_HumanPerformer(),
                        BpmnFactory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_HumanPerformer(),
                        BpmnFactory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE.getDocumentRoot_Performer(),
                        BpmnFactory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE.getDocumentRoot_Performer(),
                        BpmnFactory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE.getDocumentRoot_Performer(),
                        BpmnFactory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_ActivityResourceGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_PotentialOwner(),
                        BpmnFactory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_LoopCharacteristicsGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getActivity_LoopCharacteristics(),
                        BpmnFactory.eINSTANCE
                                .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_LoopCharacteristicsGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getActivity_LoopCharacteristics(),
                        BpmnFactory.eINSTANCE
                                .createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_LoopCharacteristicsGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics(),
                        BpmnFactory.eINSTANCE
                                .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getActivity_LoopCharacteristicsGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics(),
                        BpmnFactory.eINSTANCE
                                .createStandardLoopCharacteristics())));
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
                        .getActivity_ActivityResource()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Performer()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_HumanPerformer()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_PotentialOwner()
                || childFeature == BpmnPackage.eINSTANCE
                        .getActivity_LoopCharacteristics()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics();

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
