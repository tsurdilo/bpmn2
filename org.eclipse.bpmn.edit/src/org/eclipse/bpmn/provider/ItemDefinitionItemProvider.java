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

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.ItemDefinition;

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
 * This is the item provider adapter for a {@link org.eclipse.bpmn.ItemDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemDefinitionItemProvider extends RootElementItemProvider
        implements IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemDefinitionItemProvider(AdapterFactory adapterFactory) {
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

            addIsCollectionPropertyDescriptor(object);
            addItemKindPropertyDescriptor(object);
            addStructureRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Collection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsCollectionPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_ItemDefinition_isCollection_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_ItemDefinition_isCollection_feature", "_UI_ItemDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getItemDefinition_IsCollection(),
                        true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Item Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addItemKindPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_ItemDefinition_itemKind_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_ItemDefinition_itemKind_feature", "_UI_ItemDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getItemDefinition_ItemKind(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Structure Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStructureRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_ItemDefinition_structureRef_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_ItemDefinition_structureRef_feature", "_UI_ItemDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getItemDefinition_StructureRef(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns ItemDefinition.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/ItemDefinition.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ItemDefinition) object).getId();
        return label == null || label.length() == 0 ? getString("_UI_ItemDefinition_type") : //$NON-NLS-1$
                getString("_UI_ItemDefinition_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(ItemDefinition.class)) {
        case BpmnPackage.ITEM_DEFINITION__IS_COLLECTION:
        case BpmnPackage.ITEM_DEFINITION__ITEM_KIND:
        case BpmnPackage.ITEM_DEFINITION__STRUCTURE_REF:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
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
                || childFeature == DIPackage.Literals.DOCUMENT_ROOT__NODE;

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
