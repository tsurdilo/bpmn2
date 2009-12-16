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

import org.eclipse.mdt.bpmn.AdHocSubProcess;
import org.eclipse.mdt.bpmn.bpmnFactory;
import org.eclipse.mdt.bpmn.bpmnPackage;

import org.eclipse.mdt.bpmn.di.diPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.AdHocSubProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdHocSubProcessItemProvider extends SubProcessItemProvider
        implements IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocSubProcessItemProvider(AdapterFactory adapterFactory) {
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

            addCancelRemainingInstancesPropertyDescriptor(object);
            addOrderingPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Cancel Remaining Instances feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCancelRemainingInstancesPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_AdHocSubProcess_cancelRemainingInstances_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_AdHocSubProcess_cancelRemainingInstances_feature", "_UI_AdHocSubProcess_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE
                                .getAdHocSubProcess_CancelRemainingInstances(),
                        true, false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Ordering feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOrderingPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_AdHocSubProcess_ordering_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_AdHocSubProcess_ordering_feature", "_UI_AdHocSubProcess_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getAdHocSubProcess_Ordering(),
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
                    .getAdHocSubProcess_CompletionCondition());
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
     * This returns AdHocSubProcess.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/AdHocSubProcess.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((AdHocSubProcess) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_AdHocSubProcess_type") : //$NON-NLS-1$
                getString("_UI_AdHocSubProcess_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(AdHocSubProcess.class)) {
        case bpmnPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
        case bpmnPackage.AD_HOC_SUB_PROCESS__ORDERING:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case bpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
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
                .getAdHocSubProcess_CompletionCondition(),
                bpmnFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getAdHocSubProcess_CompletionCondition(),
                bpmnFactory.eINSTANCE.createFormalExpression()));
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
                        .getActivity_ActivityResource()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Performer()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_HumanPerformer()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_PotentialOwner()
                || childFeature == bpmnPackage.eINSTANCE
                        .getActivity_LoopCharacteristics()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics()
                || childFeature == bpmnPackage.eINSTANCE
                        .getSubProcess_FlowElement()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SubProcess()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_AdHocSubProcess()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_BoundaryEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Event()
                || childFeature == bpmnPackage.eINSTANCE.getDocumentRoot_Task()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_BusinessRuleTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallActivity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity()
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
                        .getDocumentRoot_ManualTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ParallelGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ReceiveTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ScriptTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SendTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SequenceFlow()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ServiceTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_StartEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Transaction()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_UserTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getSubProcess_Artifact()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Association()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Group()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_TextAnnotation();

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
