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

import org.eclipse.mdt.bpmn2.AdHocSubProcess;
import org.eclipse.mdt.bpmn2.Bpmn2Factory;
import org.eclipse.mdt.bpmn2.Bpmn2Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn2.AdHocSubProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdHocSubProcessItemProvider extends SubProcessItemProvider
        implements IEditingDomainItemProvider, IStructuredItemContentProvider,
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
                        getString("_UI_AdHocSubProcess_cancelRemainingInstances_feature"),
                        getString(
                                "_UI_PropertyDescriptor_description",
                                "_UI_AdHocSubProcess_cancelRemainingInstances_feature",
                                "_UI_AdHocSubProcess_type"),
                        Bpmn2Package.eINSTANCE
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
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory)
                        .getRootAdapterFactory(), getResourceLocator(),
                getString("_UI_AdHocSubProcess_ordering_feature"), getString(
                        "_UI_PropertyDescriptor_description",
                        "_UI_AdHocSubProcess_ordering_feature",
                        "_UI_AdHocSubProcess_type"), Bpmn2Package.eINSTANCE
                        .getAdHocSubProcess_Ordering(), true, false, false,
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
            childrenFeatures.add(Bpmn2Package.eINSTANCE
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
     * This returns AdHocSubProcess.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/AdHocSubProcess"));
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
        return label == null || label.length() == 0 ? getString("_UI_AdHocSubProcess_type")
                : getString("_UI_AdHocSubProcess_type") + " " + label;
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
        case Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
        case Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
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
                .getAdHocSubProcess_CompletionCondition(),
                Bpmn2Factory.eINSTANCE.createExpression()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getAdHocSubProcess_CompletionCondition(),
                Bpmn2Factory.eINSTANCE.createFormalExpression()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getAdHocSubProcess_CompletionCondition(),
                Bpmn2Factory.eINSTANCE
                        .createCorrelationPropertyRetrievalExpression()));
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
                        .getDocumentRoot_StandardLoopCharacteristics()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getSubProcess_FlowElement()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SubProcess()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_AdHocSubProcess()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BoundaryEvent()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Event()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Task()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BusinessRuleTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CallActivity()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ChoreographySubProcess()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ChoreographyTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ComplexGateway()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_DataObject()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EndEvent()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EventBasedGateway()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ExclusiveGateway()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Handler()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_InclusiveGateway()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_IntermediateCatchEvent()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_IntermediateThrowEvent()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ManualTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ParallelGateway()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ReceiveTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ScriptTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SendTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SequenceFlow()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ServiceTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_StartEvent()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Transaction()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_UserTask();

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] {
                    getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
