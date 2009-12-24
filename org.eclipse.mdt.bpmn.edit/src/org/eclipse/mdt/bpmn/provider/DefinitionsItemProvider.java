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

import org.eclipse.mdt.bpmn.BpmnFactory;
import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.Definitions;

import org.eclipse.mdt.bpmn.di.DIFactory;

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
                        BpmnPackage.eINSTANCE
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
                        BpmnPackage.eINSTANCE.getDefinitions_Id(), true, false,
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
                        BpmnPackage.eINSTANCE.getDefinitions_TargetNamespace(),
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
                        BpmnPackage.eINSTANCE.getDefinitions_TypeLanguage(),
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
            childrenFeatures.add(BpmnPackage.eINSTANCE.getDefinitions_Import());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getDefinitions_Extension());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getDefinitions_RootElementGroup());
            childrenFeatures
                    .add(BpmnPackage.eINSTANCE.getDefinitions_Diagram());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getDefinitions_Relationship());
            childrenFeatures.add(BpmnPackage.eINSTANCE
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
        case BpmnPackage.DEFINITIONS__EXPRESSION_LANGUAGE:
        case BpmnPackage.DEFINITIONS__ID:
        case BpmnPackage.DEFINITIONS__TARGET_NAMESPACE:
        case BpmnPackage.DEFINITIONS__TYPE_LANGUAGE:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case BpmnPackage.DEFINITIONS__IMPORT:
        case BpmnPackage.DEFINITIONS__EXTENSION:
        case BpmnPackage.DEFINITIONS__ROOT_ELEMENT_GROUP:
        case BpmnPackage.DEFINITIONS__DIAGRAM:
        case BpmnPackage.DEFINITIONS__RELATIONSHIP:
        case BpmnPackage.DEFINITIONS__ANY_ATTRIBUTE:
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
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getDefinitions_Import(), BpmnFactory.eINSTANCE
                        .createImport()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_Extension(), BpmnFactory.eINSTANCE
                .createExtension()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createCallableElement())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalCommunication())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDefinitions_RootElement(),
                BpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition(),
                BpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Category(),
                BpmnFactory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Choreography(),
                BpmnFactory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Collaboration(),
                BpmnFactory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition(),
                BpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition(),
                BpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Conversation(),
                BpmnFactory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationProperty(),
                BpmnFactory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataStore(),
                BpmnFactory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EndPoint(),
                BpmnFactory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Error(),
                BpmnFactory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition(),
                BpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Escalation(),
                BpmnFactory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition(),
                BpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask(),
                BpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask(),
                BpmnFactory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalCommunication(),
                BpmnFactory.eINSTANCE.createGlobalCommunication())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalManualTask(),
                BpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask(),
                BpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalUserTask(),
                BpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Interface(),
                BpmnFactory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ItemDefinition(),
                BpmnFactory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition(),
                BpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Message(),
                BpmnFactory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition(),
                BpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_PartnerEntity(),
                BpmnFactory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_PartnerRole(),
                BpmnFactory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Process(),
                BpmnFactory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Resource(),
                BpmnFactory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Signal(),
                BpmnFactory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition(),
                BpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition(),
                BpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition(),
                BpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getDefinitions_Diagram(), DIFactory.eINSTANCE
                        .createDiagram()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDefinitions_Relationship(), BpmnFactory.eINSTANCE
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

        boolean qualify = childFeature == BpmnPackage.eINSTANCE
                .getDefinitions_RootElement()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_EventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Category()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Choreography()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Collaboration()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Conversation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationProperty()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_DataStore()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_EndPoint()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Error()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ErrorEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Escalation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalBusinessRuleTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalChoreographyTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalCommunication()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalManualTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalScriptTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_GlobalUserTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Interface()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ItemDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Message()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_PartnerEntity()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_PartnerRole()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Process()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Resource()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Signal()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_SignalEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
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
