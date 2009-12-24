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

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
import org.eclipse.mdt.bpmn.Documentation;

import org.eclipse.mdt.bpmn.di.DIFactory;
import org.eclipse.mdt.bpmn.di.DIPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.Documentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentationItemProvider extends ItemProviderAdapter implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationItemProvider(AdapterFactory adapterFactory) {
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

            addIdPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                        getString("_UI_Documentation_id_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Documentation_id_feature", "_UI_Documentation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        BpmnPackage.eINSTANCE.getDocumentation_Id(), true,
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
            childrenFeatures
                    .add(BpmnPackage.eINSTANCE.getDocumentation_Mixed());
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
     * This returns Documentation.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/Documentation.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Documentation) object).getId();
        return label == null || label.length() == 0 ? getString("_UI_Documentation_type") : //$NON-NLS-1$
                getString("_UI_Documentation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(Documentation.class)) {
        case BpmnPackage.DOCUMENTATION__ID:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case BpmnPackage.DOCUMENTATION__MIXED:
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
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT, ""))); //$NON-NLS-1$

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, ""))); //$NON-NLS-1$

        newChildDescriptors
                .add(createChildParameter(
                        BpmnPackage.eINSTANCE.getDocumentation_Mixed(),
                        FeatureMapUtil
                                .createEntry(
                                        XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
                                        XMLTypeFactory.eINSTANCE
                                                .createProcessingInstruction())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA, ""))); //$NON-NLS-1$

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Activity(),
                BpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ActivityResource(),
                BpmnFactory.eINSTANCE.createActivityResource())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ActivityResource(),
                BpmnFactory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ActivityResource(),
                BpmnFactory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ActivityResource(),
                BpmnFactory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowElement(),
                BpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Artifact(),
                BpmnFactory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Artifact(),
                BpmnFactory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Artifact(),
                BpmnFactory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Assignment(),
                BpmnFactory.eINSTANCE.createAssignment())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Association(),
                BpmnFactory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Auditing(),
                BpmnFactory.eINSTANCE.createAuditing())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createActivityResource())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createAssignment())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createAuditing())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCallableElement())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCategoryValue())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCommunication())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createComplexBehaviorDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createConversationAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCorrelationPropertyBinding())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE
                        .createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createCorrelationSubscription())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createDataInput())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createDataOutput())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createDataState())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createGlobalCommunication())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createInputOutputBinding())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createInputOutputSpecification())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createInputSet())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createLane())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createLaneSet())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createMessageFlowAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createMonitoring())));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                        BpmnFactory.eINSTANCE
                                .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createOperation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createOutputSet())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createParticipantAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createParticipantMultiplicity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createProperty())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createRelationship())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createRendering())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createResourceAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createResourceParameter())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createResourceParameterBinding())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BaseElement(),
                BpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_BaseElementWithMixedContent(),
                BpmnFactory.eINSTANCE.createExpression())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_BaseElementWithMixedContent(),
                BpmnFactory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BoundaryEvent(),
                BpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createCallableElement())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createGlobalCommunication())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallableElement(),
                BpmnFactory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallActivity(),
                BpmnFactory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity(),
                BpmnFactory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CallConversation(),
                BpmnFactory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ConversationNode(),
                BpmnFactory.eINSTANCE.createCallConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ConversationNode(),
                BpmnFactory.eINSTANCE.createCommunication())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ConversationNode(),
                BpmnFactory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CancelEventDefinition(),
                BpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventDefinition(),
                BpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createCallableElement())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalCommunication())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_RootElement(),
                BpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CatchEvent(),
                BpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CatchEvent(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CatchEvent(),
                BpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Category(),
                BpmnFactory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CategoryValue(),
                BpmnFactory.eINSTANCE.createCategoryValue())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Choreography(),
                BpmnFactory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
                BpmnFactory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
                BpmnFactory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
                BpmnFactory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographySubProcess(),
                BpmnFactory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyTask(),
                BpmnFactory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Collaboration(),
                BpmnFactory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Communication(),
                BpmnFactory.eINSTANCE.createCommunication())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition(),
                BpmnFactory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_ComplexBehaviorDefinition(),
                BpmnFactory.eINSTANCE.createComplexBehaviorDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ComplexGateway(),
                BpmnFactory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition(),
                BpmnFactory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Conversation(),
                BpmnFactory.eINSTANCE.createConversation())));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        BpmnPackage.eINSTANCE
                                .getDocumentRoot_ConversationAssociation(),
                        BpmnFactory.eINSTANCE.createConversationAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationKey(),
                BpmnFactory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_CorrelationProperty(),
                BpmnFactory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationPropertyBinding(),
                BpmnFactory.eINSTANCE.createCorrelationPropertyBinding())));

        newChildDescriptors
                .add(createChildParameter(
                        BpmnPackage.eINSTANCE.getDocumentation_Mixed(),
                        FeatureMapUtil
                                .createEntry(
                                        BpmnPackage.eINSTANCE
                                                .getDocumentRoot_CorrelationPropertyRetrievalExpression(),
                                        BpmnFactory.eINSTANCE
                                                .createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        BpmnPackage.eINSTANCE
                                .getDocumentRoot_CorrelationSubscription(),
                        BpmnFactory.eINSTANCE.createCorrelationSubscription())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataAssociation(),
                BpmnFactory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataAssociation(),
                BpmnFactory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataInput(),
                BpmnFactory.eINSTANCE.createDataInput())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataInputAssociation(),
                BpmnFactory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataObject(),
                BpmnFactory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataOutput(),
                BpmnFactory.eINSTANCE.createDataOutput())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataOutputAssociation(),
                BpmnFactory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataState(),
                BpmnFactory.eINSTANCE.createDataState())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataStore(),
                BpmnFactory.eINSTANCE.createDataStore())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_DataStoreReference(),
                BpmnFactory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Definitions(),
                BpmnFactory.eINSTANCE.createDefinitions())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Documentation(),
                BpmnFactory.eINSTANCE.createDocumentation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EndEvent(),
                BpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EndPoint(),
                BpmnFactory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Error(),
                BpmnFactory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ErrorEventDefinition(),
                BpmnFactory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Escalation(),
                BpmnFactory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition(),
                BpmnFactory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                BpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_EventBasedGateway(),
                BpmnFactory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway(),
                BpmnFactory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Expression(),
                BpmnFactory.eINSTANCE.createExpression())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Expression(),
                BpmnFactory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Extension(),
                BpmnFactory.eINSTANCE.createExtension())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FlowNode(),
                BpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_FormalExpression(),
                BpmnFactory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask(),
                BpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalChoreographyTask(),
                BpmnFactory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalCommunication(),
                BpmnFactory.eINSTANCE.createGlobalCommunication())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalManualTask(),
                BpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalScriptTask(),
                BpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalTask(),
                BpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_GlobalUserTask(),
                BpmnFactory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Group(),
                BpmnFactory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_HumanPerformer(),
                BpmnFactory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_HumanPerformer(),
                BpmnFactory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Performer(),
                BpmnFactory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Performer(),
                BpmnFactory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Performer(),
                BpmnFactory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Import(),
                BpmnFactory.eINSTANCE.createImport())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_InclusiveGateway(),
                BpmnFactory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_InputSet(),
                BpmnFactory.eINSTANCE.createInputSet())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Interface(),
                BpmnFactory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent(),
                BpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_IoBinding(),
                BpmnFactory.eINSTANCE.createInputOutputBinding())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_IoSpecification(),
                BpmnFactory.eINSTANCE.createInputOutputSpecification())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ItemDefinition(),
                BpmnFactory.eINSTANCE.createItemDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Lane(),
                BpmnFactory.eINSTANCE.createLane())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_LaneSet(),
                BpmnFactory.eINSTANCE.createLaneSet())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_LinkEventDefinition(),
                BpmnFactory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        BpmnPackage.eINSTANCE
                                .getDocumentRoot_LoopCharacteristics(),
                        BpmnFactory.eINSTANCE
                                .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_LoopCharacteristics(),
                BpmnFactory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ManualTask(),
                BpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Message(),
                BpmnFactory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_MessageEventDefinition(),
                BpmnFactory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_MessageFlow(),
                BpmnFactory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_MessageFlowAssociation(),
                BpmnFactory.eINSTANCE.createMessageFlowAssociation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Monitoring(),
                BpmnFactory.eINSTANCE.createMonitoring())));

        newChildDescriptors
                .add(createChildParameter(
                        BpmnPackage.eINSTANCE.getDocumentation_Mixed(),
                        FeatureMapUtil
                                .createEntry(
                                        BpmnPackage.eINSTANCE
                                                .getDocumentRoot_MultiInstanceLoopCharacteristics(),
                                        BpmnFactory.eINSTANCE
                                                .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Operation(),
                BpmnFactory.eINSTANCE.createOperation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_OutputSet(),
                BpmnFactory.eINSTANCE.createOutputSet())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ParallelGateway(),
                BpmnFactory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Participant(),
                BpmnFactory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ParticipantAssociation(),
                BpmnFactory.eINSTANCE.createParticipantAssociation())));

        newChildDescriptors
                .add(createChildParameter(BpmnPackage.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        BpmnPackage.eINSTANCE
                                .getDocumentRoot_ParticipantMultiplicity(),
                        BpmnFactory.eINSTANCE.createParticipantMultiplicity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_PartnerEntity(),
                BpmnFactory.eINSTANCE.createPartnerEntity())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_PartnerRole(),
                BpmnFactory.eINSTANCE.createPartnerRole())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_PotentialOwner(),
                BpmnFactory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Process(),
                BpmnFactory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Property(),
                BpmnFactory.eINSTANCE.createProperty())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ReceiveTask(),
                BpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Relationship(),
                BpmnFactory.eINSTANCE.createRelationship())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Rendering(),
                BpmnFactory.eINSTANCE.createRendering())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Resource(),
                BpmnFactory.eINSTANCE.createResource())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_ResourceAssignmentExpression(),
                BpmnFactory.eINSTANCE.createResourceAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ResourceParameter(),
                BpmnFactory.eINSTANCE.createResourceParameter())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_ResourceParameterBinding(),
                BpmnFactory.eINSTANCE.createResourceParameterBinding())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Script(),
                BpmnFactory.eINSTANCE.createScript())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ScriptTask(),
                BpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SendTask(),
                BpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SequenceFlow(),
                BpmnFactory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ServiceTask(),
                BpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Signal(),
                BpmnFactory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SignalEventDefinition(),
                BpmnFactory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics(),
                BpmnFactory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_StartEvent(),
                BpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SubConversation(),
                BpmnFactory.eINSTANCE.createSubConversation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SubProcess(),
                BpmnFactory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_SubProcess(),
                BpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                BpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition(),
                BpmnFactory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Text(),
                BpmnFactory.eINSTANCE.createText())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_TextAnnotation(),
                BpmnFactory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ThrowEvent(),
                BpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ThrowEvent(),
                BpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_ThrowEvent(),
                BpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_TimerEventDefinition(),
                BpmnFactory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_Transaction(),
                BpmnFactory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                BpmnPackage.eINSTANCE.getDocumentRoot_UserTask(),
                BpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                DIPackage.Literals.DOCUMENT_ROOT__BENDPOINT,
                DIFactory.eINSTANCE.createBendpoint())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                DIPackage.Literals.DOCUMENT_ROOT__CONNECTOR,
                DIFactory.eINSTANCE.createConnector())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                DIPackage.Literals.DOCUMENT_ROOT__VIEW, DIFactory.eINSTANCE
                        .createConnector())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                DIPackage.Literals.DOCUMENT_ROOT__VIEW, DIFactory.eINSTANCE
                        .createDiagram())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                DIPackage.Literals.DOCUMENT_ROOT__VIEW, DIFactory.eINSTANCE
                        .createNode())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                DIPackage.Literals.DOCUMENT_ROOT__DIAGRAM, DIFactory.eINSTANCE
                        .createDiagram())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                DIPackage.Literals.DOCUMENT_ROOT__NODE, DIFactory.eINSTANCE
                        .createNode())));

        newChildDescriptors.add(createChildParameter(BpmnPackage.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                DIPackage.Literals.DOCUMENT_ROOT__STYLE, DIFactory.eINSTANCE
                        .createStyle())));
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
                .getDocumentRoot_Activity()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_FlowElement()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_BaseElement()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_FlowNode()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_SubProcess()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_AdHocSubProcess()
                || childFeature == BpmnPackage.eINSTANCE.getDocumentRoot_Task()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_BusinessRuleTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CallActivity()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ManualTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ReceiveTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ScriptTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_SendTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ServiceTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Transaction()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_UserTask()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ActivityResource()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Performer()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_HumanPerformer()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_PotentialOwner()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_BoundaryEvent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CatchEvent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Event()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ChoreographyActivity()
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
                        .getDocumentRoot_ThrowEvent()
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
                        .getDocumentRoot_ParallelGateway()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_SequenceFlow()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_StartEvent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Artifact()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Association()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Group()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_TextAnnotation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Assignment()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Auditing()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CallableElement()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_RootElement()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CallConversation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ConversationNode()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_EventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Category()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CategoryValue()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Choreography()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Collaboration()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Communication()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ComplexBehaviorDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Conversation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ConversationAssociation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationKey()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationProperty()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationPropertyBinding()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationPropertyRetrievalExpression()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_CorrelationSubscription()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_DataInput()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_DataAssociation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_DataInputAssociation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_DataOutput()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_DataOutputAssociation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_DataState()
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
                        .getDocumentRoot_IoBinding()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_IoSpecification()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_InputSet()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Interface()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ItemDefinition()
                || childFeature == BpmnPackage.eINSTANCE.getDocumentRoot_Lane()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_LaneSet()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Message()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageFlow()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_MessageFlowAssociation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Monitoring()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_LoopCharacteristics()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Operation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_OutputSet()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Participant()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ParticipantAssociation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ParticipantMultiplicity()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_PartnerEntity()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_PartnerRole()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Process()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Property()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Relationship()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Rendering()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Resource()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ResourceAssignmentExpression()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ResourceParameter()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_ResourceParameterBinding()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Signal()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_SignalEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_SubConversation()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_TimerEventDefinition()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_BaseElementWithMixedContent()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_Expression()
                || childFeature == BpmnPackage.eINSTANCE
                        .getDocumentRoot_FormalExpression()
                || childFeature == DIPackage.Literals.DOCUMENT_ROOT__CONNECTOR
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
