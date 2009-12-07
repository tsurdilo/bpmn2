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
package org.eclipse.mdt.bpmn2.provider;

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

import org.eclipse.mdt.bpmn2.Activity;
import org.eclipse.mdt.bpmn2.Bpmn2Factory;
import org.eclipse.mdt.bpmn2.Bpmn2Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn2.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends FlowNodeItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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

            addDefaultPropertyDescriptor(object);
            addIsForCompensationPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Default feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefaultPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Activity_default_feature"), getString(
                        "_UI_PropertyDescriptor_description",
                        "_UI_Activity_default_feature", "_UI_Activity_type"),
                Bpmn2Package.eINSTANCE.getActivity_Default(), true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is For Compensation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsForCompensationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Activity_isForCompensation_feature"), getString(
                        "_UI_PropertyDescriptor_description",
                        "_UI_Activity_isForCompensation_feature",
                        "_UI_Activity_type"), Bpmn2Package.eINSTANCE
                        .getActivity_IsForCompensation(), true, false, false,
                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getActivity_IoSpecification());
            childrenFeatures.add(Bpmn2Package.eINSTANCE.getActivity_Property());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getActivity_DataInputAssociation());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getActivity_DataOutputAssociation());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getActivity_PerformerGroup());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
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
        return label == null || label.length() == 0 ? getString("_UI_Activity_type")
                : getString("_UI_Activity_type") + " " + label;
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
        case Bpmn2Package.ACTIVITY__DEFAULT:
        case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
        case Bpmn2Package.ACTIVITY__PROPERTY:
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATION:
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
        case Bpmn2Package.ACTIVITY__PERFORMER_GROUP:
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
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

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_IoSpecification(), Bpmn2Factory.eINSTANCE
                .createInputOutputSpecification()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_Property(), Bpmn2Factory.eINSTANCE
                .createProperty()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_DataInputAssociation(), Bpmn2Factory.eINSTANCE
                .createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_DataOutputAssociation(), Bpmn2Factory.eINSTANCE
                .createDataOutputAssociation()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_PerformerGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getActivity_Performer(),
                Bpmn2Factory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_PerformerGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getActivity_Performer(),
                Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_PerformerGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getActivity_Performer(),
                Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_PerformerGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_HumanPerformer(),
                Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_PerformerGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_HumanPerformer(),
                Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_PerformerGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_PotentialOwner(),
                Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_LoopCharacteristicsGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getActivity_LoopCharacteristics(),
                        Bpmn2Factory.eINSTANCE
                                .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_LoopCharacteristicsGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getActivity_LoopCharacteristics(),
                        Bpmn2Factory.eINSTANCE
                                .createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_LoopCharacteristicsGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics(),
                        Bpmn2Factory.eINSTANCE
                                .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getActivity_LoopCharacteristicsGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics(),
                        Bpmn2Factory.eINSTANCE
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

        boolean qualify = childFeature == Bpmn2Package.eINSTANCE
                .getActivity_Performer()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_HumanPerformer()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PotentialOwner()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getActivity_LoopCharacteristics()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics();

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] {
                    getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
