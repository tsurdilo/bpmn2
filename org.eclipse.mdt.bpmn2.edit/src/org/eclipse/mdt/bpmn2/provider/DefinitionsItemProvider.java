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

import org.eclipse.mdt.bpmn2.Bpmn2Factory;
import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.Definitions;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn2.Definitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionsItemProvider extends BaseElementItemProvider implements
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
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Definitions_expressionLanguage_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Definitions_expressionLanguage_feature",
                        "_UI_Definitions_type"), Bpmn2Package.eINSTANCE
                        .getDefinitions_ExpressionLanguage(), true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Target Namespace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetNamespacePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Definitions_targetNamespace_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_Definitions_targetNamespace_feature",
                        "_UI_Definitions_type"), Bpmn2Package.eINSTANCE
                        .getDefinitions_TargetNamespace(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type Language feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypeLanguagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_Definitions_typeLanguage_feature"), getString(
                        "_UI_PropertyDescriptor_description",
                        "_UI_Definitions_typeLanguage_feature",
                        "_UI_Definitions_type"), Bpmn2Package.eINSTANCE
                        .getDefinitions_TypeLanguage(), true, false, false,
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
            childrenFeatures
                    .add(Bpmn2Package.eINSTANCE.getDefinitions_Import());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getDefinitions_Extension());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getDefinitions_RootElementGroup());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getDefinitions_Relationship());
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
     * This returns Definitions.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/Definitions"));
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
        return label == null || label.length() == 0 ? getString("_UI_Definitions_type")
                : getString("_UI_Definitions_type") + " " + label;
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
        case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
        case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
        case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case Bpmn2Package.DEFINITIONS__IMPORT:
        case Bpmn2Package.DEFINITIONS__EXTENSION:
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT_GROUP:
        case Bpmn2Package.DEFINITIONS__RELATIONSHIP:
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
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDefinitions_Import(), Bpmn2Factory.eINSTANCE
                        .createImport()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_Extension(), Bpmn2Factory.eINSTANCE
                .createExtension()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createCallableElement())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createConversationView())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createEntity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createPeopleGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createRole())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createServiceReference())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createStructureDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement(),
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CancelEventDefinition(),
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Category(),
                Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Choreography(),
                Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration(),
                Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration(),
                Bpmn2Factory.eINSTANCE.createConversationView())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition(),
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition(),
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Conversation(),
                Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationKey(),
                Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationProperty(),
                Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EndPoint(),
                Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Entity(),
                Bpmn2Factory.eINSTANCE.createEntity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Error(),
                Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ErrorEventDefinition(),
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Escalation(),
                Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition(),
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDefinitions_RootElementGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_GlobalBusinessRuleTask(),
                                Bpmn2Factory.eINSTANCE
                                        .createGlobalBusinessRuleTask())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDefinitions_RootElementGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_GlobalChoreographyTask(),
                                Bpmn2Factory.eINSTANCE
                                        .createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalManualTask(),
                Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalScriptTask(),
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalUserTask(),
                Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Interface(),
                Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_LinkEventDefinition(),
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Message(),
                Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDefinitions_RootElementGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_MessageEventDefinition(),
                                Bpmn2Factory.eINSTANCE
                                        .createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_MessageFlow(),
                Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Participant(),
                Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_PeopleGroup(),
                Bpmn2Factory.eINSTANCE.createPeopleGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Process(),
                Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Role(),
                Bpmn2Factory.eINSTANCE.createRole())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ServiceReference(),
                Bpmn2Factory.eINSTANCE.createServiceReference())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Signal(),
                Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_SignalEventDefinition(),
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_StructureDefinition(),
                Bpmn2Factory.eINSTANCE.createStructureDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition(),
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_RootElementGroup(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_TimerEventDefinition(),
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDefinitions_Relationship(), Bpmn2Factory.eINSTANCE
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

        boolean qualify = childFeature == Bpmn2Package.eINSTANCE
                .getDefinitions_RootElement()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Category()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Choreography()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Collaboration()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Conversation()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CorrelationKey()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CorrelationProperty()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EndPoint()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Entity()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Error()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ErrorEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Escalation()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_GlobalTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_GlobalBusinessRuleTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_GlobalChoreographyTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_GlobalManualTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_GlobalScriptTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_GlobalUserTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Interface()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Message()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_MessageEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_MessageFlow()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Participant()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PeopleGroup()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Process()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Role()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ServiceReference()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Signal()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SignalEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_StructureDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TimerEventDefinition();

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] {
                    getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
