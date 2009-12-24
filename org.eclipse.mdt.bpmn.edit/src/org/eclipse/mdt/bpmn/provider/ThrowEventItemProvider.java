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

import org.eclipse.mdt.bpmn.BpmnFactory;
import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.ThrowEvent;

import org.eclipse.mdt.bpmn.di.DIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.ThrowEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThrowEventItemProvider extends EventItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ThrowEventItemProvider(AdapterFactory adapterFactory) {
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

            addEventDefinitionRefPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Event Definition Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEventDefinitionRefPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_ThrowEvent_eventDefinitionRef_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_ThrowEvent_eventDefinitionRef_feature", "_UI_ThrowEvent_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE
                                .getThrowEvent_EventDefinitionRef(), true,
                        false, false,
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
                    .getThrowEvent_DataInput());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getThrowEvent_DataInputAssociation());
            childrenFeatures
                    .add(BpmnPackage.eINSTANCE.getThrowEvent_InputSet());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getThrowEvent_EventDefinitionGroup());
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
        String label = ((ThrowEvent) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_ThrowEvent_type") : //$NON-NLS-1$
                getString("_UI_ThrowEvent_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(ThrowEvent.class)) {
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_REF:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case BpmnPackage.THROW_EVENT__DATA_INPUT:
        case BpmnPackage.THROW_EVENT__DATA_INPUT_ASSOCIATION:
        case BpmnPackage.THROW_EVENT__INPUT_SET:
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_GROUP:
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
                .getThrowEvent_DataInput(), BpmnFactory.eINSTANCE
                .createDataInput()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_DataInputAssociation(), BpmnFactory.eINSTANCE
                .createDataInputAssociation()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_InputSet(), BpmnFactory.eINSTANCE
                .createInputSet()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinition(), BpmnFactory.eINSTANCE
                        .createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition(),
                        BpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(),
                FeatureMapUtil
                        .createEntry(BpmnPackage.eINSTANCE
                                .getDocumentRoot_CompensateEventDefinition(),
                                BpmnFactory.eINSTANCE
                                        .createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition(),
                        BpmnFactory.eINSTANCE
                                .createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_ErrorEventDefinition(),
                        BpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(),
                FeatureMapUtil
                        .createEntry(BpmnPackage.eINSTANCE
                                .getDocumentRoot_EscalationEventDefinition(),
                                BpmnFactory.eINSTANCE
                                        .createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition(),
                        BpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageEventDefinition(),
                        BpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_SignalEventDefinition(),
                        BpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                        .createEntry(BpmnPackage.eINSTANCE
                                .getDocumentRoot_TerminateEventDefinition(),
                                BpmnFactory.eINSTANCE
                                        .createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getThrowEvent_EventDefinitionGroup(), FeatureMapUtil
                .createEntry(BpmnPackage.eINSTANCE
                        .getDocumentRoot_TimerEventDefinition(),
                        BpmnFactory.eINSTANCE.createTimerEventDefinition())));
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
                        .getThrowEvent_EventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ErrorEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageEventDefinition()
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

}
