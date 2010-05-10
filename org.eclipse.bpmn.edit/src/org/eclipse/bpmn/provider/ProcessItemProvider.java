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
 * This is the item provider adapter for a {@link org.eclipse.bpmn.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider extends CallableElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessItemProvider(AdapterFactory adapterFactory) {
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

            addSupportsPropertyDescriptor(object);
            addDefinitionalCollaborationRefPropertyDescriptor(object);
            addIsClosedPropertyDescriptor(object);
            addProcessTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Supports feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportsPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Process_supports_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Process_supports_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getProcess_Supports(), true,
                        false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Definitional Collaboration Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefinitionalCollaborationRefPropertyDescriptor(
            Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Process_definitionalCollaborationRef_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Process_definitionalCollaborationRef_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE
                                .getProcess_DefinitionalCollaborationRef(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Closed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsClosedPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Process_isClosed_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Process_isClosed_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getProcess_IsClosed(), true,
                        false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Process Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcessTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Process_processType_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Process_processType_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getProcess_ProcessType(), true,
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
            childrenFeatures.add(BpmnPackage.eINSTANCE.getProcess_Auditing());
            childrenFeatures.add(BpmnPackage.eINSTANCE.getProcess_Monitoring());
            childrenFeatures.add(BpmnPackage.eINSTANCE.getProcess_Property());
            childrenFeatures.add(BpmnPackage.eINSTANCE.getProcess_LaneSet());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getProcess_FlowElementGroup());
            childrenFeatures.add(BpmnPackage.eINSTANCE
                    .getProcess_ArtifactGroup());
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
     * This returns Process.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/Process.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((org.eclipse.bpmn.Process) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Process_type") : //$NON-NLS-1$
                getString("_UI_Process_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(org.eclipse.bpmn.Process.class)) {
        case BpmnPackage.PROCESS__SUPPORTS:
        case BpmnPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
        case BpmnPackage.PROCESS__IS_CLOSED:
        case BpmnPackage.PROCESS__PROCESS_TYPE:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case BpmnPackage.PROCESS__AUDITING:
        case BpmnPackage.PROCESS__MONITORING:
        case BpmnPackage.PROCESS__PROPERTY:
        case BpmnPackage.PROCESS__LANE_SET:
        case BpmnPackage.PROCESS__FLOW_ELEMENT_GROUP:
        case BpmnPackage.PROCESS__ARTIFACT_GROUP:
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
                        .getProcess_Auditing(), BpmnFactory.eINSTANCE
                        .createAuditing()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_Monitoring(), BpmnFactory.eINSTANCE
                .createMonitoring()));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getProcess_Property(), BpmnFactory.eINSTANCE
                        .createProperty()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_LaneSet(), BpmnFactory.eINSTANCE.createLaneSet()));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_FlowElement(),
                BpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BoundaryEvent(),
                BpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallActivity(),
                BpmnFactory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity(),
                BpmnFactory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographySubProcess(),
                BpmnFactory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyTask(),
                BpmnFactory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ComplexGateway(),
                BpmnFactory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataObject(),
                BpmnFactory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataStoreReference(),
                BpmnFactory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EndEvent(),
                BpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventBasedGateway(),
                BpmnFactory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway(),
                BpmnFactory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_InclusiveGateway(),
                BpmnFactory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ManualTask(),
                BpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ParallelGateway(),
                BpmnFactory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ReceiveTask(),
                BpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ScriptTask(),
                BpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SendTask(),
                BpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SequenceFlow(),
                BpmnFactory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ServiceTask(),
                BpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_StartEvent(),
                BpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SubProcess(),
                BpmnFactory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SubProcess(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Transaction(),
                BpmnFactory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_UserTask(),
                BpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_Artifact(),
                BpmnFactory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_Artifact(),
                BpmnFactory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getProcess_Artifact(),
                BpmnFactory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Association(),
                BpmnFactory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Group(),
                BpmnFactory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_TextAnnotation(),
                BpmnFactory.eINSTANCE.createTextAnnotation())));
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
                        .getProcess_FlowElement()
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
                || childFeature == BpmnPackage.eINSTANCE.getProcess_Artifact()
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
