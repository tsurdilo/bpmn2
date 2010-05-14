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

import org.eclipse.bpmn.AdHocSubProcess;
import org.eclipse.bpmn.BpmnFactory;
import org.eclipse.bpmn.BpmnPackage;

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
 * This is the item provider adapter for a {@link org.eclipse.bpmn.AdHocSubProcess} object.
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
                        BpmnPackage.eINSTANCE
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
                        BpmnPackage.eINSTANCE.getAdHocSubProcess_Ordering(),
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
        try {
            return overlayImage(
                    object,
                    getResourceLocator().getImage(
                            "full/obj16/AdHocSubProcess.png")); //$NON-NLS-1$
        } catch (java.util.MissingResourceException e) {
            return overlayImage(
                    object,
                    getResourceLocator().getImage(
                            "full/obj16/AdHocSubProcess.gif")); //$NON-NLS-1$
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
        case BpmnPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
        case BpmnPackage.AD_HOC_SUB_PROCESS__ORDERING:
            fireNotifyChanged(new ViewerNotification(notification,
                    notification.getNotifier(), false, true));
            return;
        case BpmnPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
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
                BpmnPackage.eINSTANCE.getAdHocSubProcess_CompletionCondition(),
                BpmnFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(
                BpmnPackage.eINSTANCE.getAdHocSubProcess_CompletionCondition(),
                BpmnFactory.eINSTANCE.createFormalExpression()));
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
                        .getActivity_ActivityResources()
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
                        .getDocumentRoot_StandardLoopCharacteristics()
                || childFeature == BpmnPackage.eINSTANCE
                        .getSubProcess_FlowElements()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_SubProcess()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_AdHocSubProcess()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_BoundaryEvent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Event()
                || childFeature == BpmnPackage.eINSTANCE.getDocumentRoot_Task()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_BusinessRuleTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CallActivity()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ChoreographySubProcess()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ChoreographyTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ComplexGateway()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_DataObject()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_DataStoreReference()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_EndEvent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_EventBasedGateway()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ExclusiveGateway()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ImplicitThrowEvent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_InclusiveGateway()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_IntermediateCatchEvent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_IntermediateThrowEvent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ManualTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ParallelGateway()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ReceiveTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ScriptTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_SendTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_SequenceFlow()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ServiceTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_StartEvent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Transaction()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_UserTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getSubProcess_Artifacts()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Association()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Group()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_TextAnnotation();

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
