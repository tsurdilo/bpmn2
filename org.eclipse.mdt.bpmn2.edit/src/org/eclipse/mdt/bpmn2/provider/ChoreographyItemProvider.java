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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.mdt.bpmn2.Bpmn2Factory;
import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.Choreography;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn2.Choreography} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChoreographyItemProvider extends CallableElementItemProvider
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
    public ChoreographyItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
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
                    .getChoreography_Participant());
            childrenFeatures.add(Bpmn2Package.eINSTANCE
                    .getChoreography_FlowElementGroup());
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
     * This returns Choreography.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/Choreography"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Choreography) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Choreography_type")
                : getString("_UI_Choreography_type") + " " + label;
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

        switch (notification.getFeatureID(Choreography.class)) {
        case Bpmn2Package.CHOREOGRAPHY__PARTICIPANT:
        case Bpmn2Package.CHOREOGRAPHY__FLOW_ELEMENT_GROUP:
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
                .getChoreography_Participant(), Bpmn2Factory.eINSTANCE
                .createParticipant()));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createCallActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createComplexGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createDataObject())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createEndEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createHandler())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createParallelGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createReceiveTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createSendTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createServiceTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createStartEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createTransaction())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElement(), Bpmn2Factory.eINSTANCE
                        .createUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_AdHocSubProcess(),
                        Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BoundaryEvent(),
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BusinessRuleTask(),
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CallActivity(), Bpmn2Factory.eINSTANCE
                        .createCallActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(),
                FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_CallChoreographyActivity(),
                                Bpmn2Factory.eINSTANCE
                                        .createCallChoreographyActivity())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElementGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_ChoreographySubProcess(),
                                Bpmn2Factory.eINSTANCE
                                        .createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ChoreographyTask(),
                        Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ComplexGateway(),
                        Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_DataObject(), Bpmn2Factory.eINSTANCE
                        .createDataObject())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_EndEvent(),
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
                        Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
                        Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElementGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_Event(),
                                Bpmn2Factory.eINSTANCE
                                        .createIntermediateCatchEvent())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElementGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_Event(),
                                Bpmn2Factory.eINSTANCE
                                        .createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
                        Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EventBasedGateway(),
                        Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ExclusiveGateway(),
                        Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Handler(),
                        Bpmn2Factory.eINSTANCE.createHandler())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_InclusiveGateway(),
                        Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElementGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_IntermediateCatchEvent(),
                                Bpmn2Factory.eINSTANCE
                                        .createIntermediateCatchEvent())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getChoreography_FlowElementGroup(), FeatureMapUtil
                        .createEntry(Bpmn2Package.eINSTANCE
                                .getDocumentRoot_IntermediateThrowEvent(),
                                Bpmn2Factory.eINSTANCE
                                        .createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ManualTask(), Bpmn2Factory.eINSTANCE
                        .createManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ParallelGateway(),
                        Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ReceiveTask(), Bpmn2Factory.eINSTANCE
                        .createReceiveTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ScriptTask(), Bpmn2Factory.eINSTANCE
                        .createScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_SendTask(),
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SequenceFlow(), Bpmn2Factory.eINSTANCE
                        .createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ServiceTask(), Bpmn2Factory.eINSTANCE
                        .createServiceTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_StartEvent(), Bpmn2Factory.eINSTANCE
                        .createStartEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SubProcess(), Bpmn2Factory.eINSTANCE
                        .createSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SubProcess(), Bpmn2Factory.eINSTANCE
                        .createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                        Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                        Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                        Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                        Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                        Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                        Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                        Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                        Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Transaction(), Bpmn2Factory.eINSTANCE
                        .createTransaction())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getChoreography_FlowElementGroup(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE.getDocumentRoot_UserTask(),
                        Bpmn2Factory.eINSTANCE.createUserTask())));
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
                .getChoreography_FlowElement()
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
