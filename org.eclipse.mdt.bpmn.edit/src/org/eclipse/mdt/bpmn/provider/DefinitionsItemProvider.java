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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.mdt.bpmn.Definitions;
import org.eclipse.mdt.bpmn.bpmnFactory;
import org.eclipse.mdt.bpmn.bpmnPackage;

import org.eclipse.mdt.bpmn.di.diFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.Definitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionsItemProvider extends ItemProviderAdapter implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefinitionsItemProvider(AdapterFactory adapterFactory) {
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

            addExpressionLanguagePropertyDescriptor(object);
            addIdPropertyDescriptor(object);
            addTargetNamespacePropertyDescriptor(object);
            addTypeLanguagePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Expression Language feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExpressionLanguagePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Definitions_expressionLanguage_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Definitions_expressionLanguage_feature", "_UI_Definitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE
                                .getDefinitions_ExpressionLanguage(), true,
                        false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Definitions_id_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Definitions_id_feature", "_UI_Definitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getDefinitions_Id(), true, false,
                        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null, null));
    }

    /**
     * This adds a property descriptor for the Target Namespace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetNamespacePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Definitions_targetNamespace_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Definitions_targetNamespace_feature", "_UI_Definitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getDefinitions_TargetNamespace(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type Language feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypeLanguagePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Definitions_typeLanguage_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Definitions_typeLanguage_feature", "_UI_Definitions_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getDefinitions_TypeLanguage(),
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
            childrenFeatures.add(bpmnPackage.eINSTANCE.getDefinitions_Import());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDefinitions_Extension());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDefinitions_RootElementGroup());
            childrenFeatures
                    .add(bpmnPackage.eINSTANCE.getDefinitions_Diagram());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDefinitions_Relationship());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getDefinitions_AnyAttribute());
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
     * This returns Definitions.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/Definitions.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Definitions) object).getId();
        return label == null || label.length() == 0 ? getString("_UI_Definitions_type") : //$NON-NLS-1$
                getString("_UI_Definitions_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(Definitions.class)) {
        case bpmnPackage.DEFINITIONS__EXPRESSION_LANGUAGE:
        case bpmnPackage.DEFINITIONS__ID:
        case bpmnPackage.DEFINITIONS__TARGET_NAMESPACE:
        case bpmnPackage.DEFINITIONS__TYPE_LANGUAGE:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case bpmnPackage.DEFINITIONS__IMPORT:
        case bpmnPackage.DEFINITIONS__EXTENSION:
        case bpmnPackage.DEFINITIONS__ROOT_ELEMENT_GROUP:
        case bpmnPackage.DEFINITIONS__DIAGRAM:
        case bpmnPackage.DEFINITIONS__RELATIONSHIP:
        case bpmnPackage.DEFINITIONS__ANY_ATTRIBUTE:
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

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDefinitions_Import(), bpmnFactory.eINSTANCE
                        .createImport()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_Extension(), bpmnFactory.eINSTANCE
                .createExtension()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createCallableElement())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createGlobalCommunication())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                bpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition(),
                bpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                bpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Category(),
                bpmnFactory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Choreography(),
                bpmnFactory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Collaboration(),
                bpmnFactory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition(),
                bpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition(),
                bpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Conversation(),
                bpmnFactory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_CorrelationProperty(),
                bpmnFactory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_DataStore(),
                bpmnFactory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EndPoint(),
                bpmnFactory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Error(),
                bpmnFactory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition(),
                bpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Escalation(),
                bpmnFactory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition(),
                bpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask(),
                bpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask(),
                bpmnFactory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalCommunication(),
                bpmnFactory.eINSTANCE.createGlobalCommunication())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalManualTask(),
                bpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask(),
                bpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                bpmnFactory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                bpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                bpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                bpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                bpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_GlobalUserTask(),
                bpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Interface(),
                bpmnFactory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ItemDefinition(),
                bpmnFactory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition(),
                bpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Message(),
                bpmnFactory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition(),
                bpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_PartnerEntity(),
                bpmnFactory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_PartnerRole(),
                bpmnFactory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Process(),
                bpmnFactory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Resource(),
                bpmnFactory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Signal(),
                bpmnFactory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition(),
                bpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition(),
                bpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition(),
                bpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getDefinitions_Diagram(), diFactory.eINSTANCE
                        .createDiagram()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getDefinitions_Relationship(), bpmnFactory.eINSTANCE
                .createRelationship()));
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

        boolean qualify = childFeature == bpmnPackage.eINSTANCE
                .getDefinitions_RootElement()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_EventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Category()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Choreography()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Collaboration()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Conversation()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationProperty()
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
                        .getDocumentRoot_Interface()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ItemDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Message()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_PartnerEntity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_PartnerRole()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Process()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Resource()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Signal()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SignalEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_TimerEventDefinition();

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
