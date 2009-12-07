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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.mdt.bpmn2.Bpmn2Factory;
import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.Documentation;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn2.Documentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentationItemProvider extends ItemProviderAdapter implements
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
                    .getDocumentation_Mixed());
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
     * This returns Documentation.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/Documentation"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_Documentation_type");
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
        case Bpmn2Package.DOCUMENTATION__MIXED:
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
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT, "")));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, "")));

        newChildDescriptors
                .add(createChildParameter(
                        Bpmn2Package.eINSTANCE.getDocumentation_Mixed(),
                        FeatureMapUtil
                                .createEntry(
                                        XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
                                        XMLTypeFactory.eINSTANCE
                                                .createProcessingInstruction())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA, "")));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
                Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_AdHocSubProcess(),
                Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createHandler())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
                Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Artifact(),
                Bpmn2Factory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Artifact(),
                Bpmn2Factory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Artifact(),
                Bpmn2Factory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Association(),
                Bpmn2Factory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Auditing(),
                Bpmn2Factory.eINSTANCE.createAuditing())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createAssignment())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createAuditing())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCallableElement())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCategoryValue())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createConversationLink())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createConversationView())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createCorrelationSet())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createDataInput())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createDataObjectState())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createDataOutput())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createDefinitions())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createEntity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createHandler())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createInputOutputBinding())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createInputOutputSpecification())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createInputSet())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createLane())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createLaneSet())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createMonitoring())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BaseElement(), Bpmn2Factory.eINSTANCE
                        .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createOperation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createOutputSet())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createParameter())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createParameterBinding())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createParticipantMultiplicity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignment())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignmentLiteral())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignmentPeopleGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createPeopleGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createProcessRole())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createProperty())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createRelationship())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createRendering())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createRole())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createServiceReference())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createStructureDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
                Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BaseElementWithMixedContent(),
                Bpmn2Factory.eINSTANCE.createExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BaseElementWithMixedContent(),
                Bpmn2Factory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BaseElementWithMixedContent(),
                Bpmn2Factory.eINSTANCE
                        .createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BoundaryEvent(),
                Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_BusinessRuleTask(),
                Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
                Bpmn2Factory.eINSTANCE.createCallableElement())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
                Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
                Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
                Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
                Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
                Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
                Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
                Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CallActivity(),
                Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity(),
                Bpmn2Factory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CancelEventDefinition(),
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createCallableElement())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createCancelEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createConversationView())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createEntity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createPeopleGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createRole())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createServiceReference())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createStructureDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CatchEvent(),
                Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CatchEvent(),
                Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CatchEvent(),
                Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Category(),
                Bpmn2Factory.eINSTANCE.createCategory())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CategoryValue(),
                Bpmn2Factory.eINSTANCE.createCategoryValue())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Choreography(),
                Bpmn2Factory.eINSTANCE.createChoreography())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
                Bpmn2Factory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
                Bpmn2Factory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
                Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        Bpmn2Package.eINSTANCE
                                .getDocumentRoot_ChoreographySubProcess(),
                        Bpmn2Factory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyTask(),
                Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration(),
                Bpmn2Factory.eINSTANCE.createCollaboration())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration(),
                Bpmn2Factory.eINSTANCE.createConversationView())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CompensateEventDefinition(),
                Bpmn2Factory.eINSTANCE.createCompensateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ComplexGateway(),
                Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ConditionalEventDefinition(),
                Bpmn2Factory.eINSTANCE.createConditionalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Conversation(),
                Bpmn2Factory.eINSTANCE.createConversation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationLink(),
                Bpmn2Factory.eINSTANCE.createConversationLink())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationView(),
                Bpmn2Factory.eINSTANCE.createConversationView())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationKey(),
                Bpmn2Factory.eINSTANCE.createCorrelationKey())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationProperty(),
                Bpmn2Factory.eINSTANCE.createCorrelationProperty())));

        newChildDescriptors
                .add(createChildParameter(
                        Bpmn2Package.eINSTANCE.getDocumentation_Mixed(),
                        FeatureMapUtil
                                .createEntry(
                                        Bpmn2Package.eINSTANCE
                                                .getDocumentRoot_CorrelationPropertyRetrievalExpression(),
                                        Bpmn2Factory.eINSTANCE
                                                .createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationSet(),
                Bpmn2Factory.eINSTANCE.createCorrelationSet())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_DataAssociation(),
                Bpmn2Factory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_DataAssociation(),
                Bpmn2Factory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_DataInput(),
                Bpmn2Factory.eINSTANCE.createDataInput())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_DataInputAssociation(),
                Bpmn2Factory.eINSTANCE.createDataInputAssociation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_DataObject(),
                Bpmn2Factory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_DataOutput(),
                Bpmn2Factory.eINSTANCE.createDataOutput())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_DataOutputAssociation(),
                Bpmn2Factory.eINSTANCE.createDataOutputAssociation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_DataState(),
                Bpmn2Factory.eINSTANCE.createDataObjectState())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Definitions(),
                Bpmn2Factory.eINSTANCE.createDefinitions())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Documentation(),
                Bpmn2Factory.eINSTANCE.createDocumentation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EndEvent(),
                Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EndPoint(),
                Bpmn2Factory.eINSTANCE.createEndPoint())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Entity(),
                Bpmn2Factory.eINSTANCE.createEntity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Error(),
                Bpmn2Factory.eINSTANCE.createError())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ErrorEventDefinition(),
                Bpmn2Factory.eINSTANCE.createErrorEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Escalation(),
                Bpmn2Factory.eINSTANCE.createEscalation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EscalationEventDefinition(),
                Bpmn2Factory.eINSTANCE.createEscalationEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
                Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
                Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
                Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
                Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
                Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_EventBasedGateway(),
                Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ExclusiveGateway(),
                Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Expression(),
                Bpmn2Factory.eINSTANCE.createExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Expression(),
                Bpmn2Factory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Expression(),
                Bpmn2Factory.eINSTANCE
                        .createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Extension(),
                Bpmn2Factory.eINSTANCE.createExtension())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createHandler())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
                Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FormalExpression(),
                Bpmn2Factory.eINSTANCE.createFormalExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_FormalExpression(),
                Bpmn2Factory.eINSTANCE
                        .createCorrelationPropertyRetrievalExpression())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        Bpmn2Package.eINSTANCE
                                .getDocumentRoot_GlobalBusinessRuleTask(),
                        Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        Bpmn2Package.eINSTANCE
                                .getDocumentRoot_GlobalChoreographyTask(),
                        Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalManualTask(),
                Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalScriptTask(),
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
                Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalUserTask(),
                Bpmn2Factory.eINSTANCE.createGlobalUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Group(),
                Bpmn2Factory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Handler(),
                Bpmn2Factory.eINSTANCE.createHandler())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_HumanPerformer(),
                Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_HumanPerformer(),
                Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Performer(),
                Bpmn2Factory.eINSTANCE.createPerformer())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Performer(),
                Bpmn2Factory.eINSTANCE.createHumanPerformer())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Performer(),
                Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Import(),
                Bpmn2Factory.eINSTANCE.createImport())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_InclusiveGateway(),
                Bpmn2Factory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_InputSet(),
                Bpmn2Factory.eINSTANCE.createInputSet())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Interface(),
                Bpmn2Factory.eINSTANCE.createInterface())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        Bpmn2Package.eINSTANCE
                                .getDocumentRoot_IntermediateCatchEvent(),
                        Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        Bpmn2Package.eINSTANCE
                                .getDocumentRoot_IntermediateThrowEvent(),
                        Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_IoBinding(),
                Bpmn2Factory.eINSTANCE.createInputOutputBinding())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_IoSpecification(),
                Bpmn2Factory.eINSTANCE.createInputOutputSpecification())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Lane(),
                Bpmn2Factory.eINSTANCE.createLane())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_LaneSet(),
                Bpmn2Factory.eINSTANCE.createLaneSet())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_LinkEventDefinition(),
                Bpmn2Factory.eINSTANCE.createLinkEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_LoopCharacteristics(),
                        Bpmn2Factory.eINSTANCE
                                .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_LoopCharacteristics(),
                Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ManualTask(),
                Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Message(),
                Bpmn2Factory.eINSTANCE.createMessage())));

        newChildDescriptors
                .add(createChildParameter(Bpmn2Package.eINSTANCE
                        .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                        Bpmn2Package.eINSTANCE
                                .getDocumentRoot_MessageEventDefinition(),
                        Bpmn2Factory.eINSTANCE.createMessageEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_MessageFlow(),
                Bpmn2Factory.eINSTANCE.createMessageFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Monitoring(),
                Bpmn2Factory.eINSTANCE.createMonitoring())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil
                .createEntry(Bpmn2Package.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics(),
                        Bpmn2Factory.eINSTANCE
                                .createMultiInstanceLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Operation(),
                Bpmn2Factory.eINSTANCE.createOperation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_OutputSet(),
                Bpmn2Factory.eINSTANCE.createOutputSet())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ParallelGateway(),
                Bpmn2Factory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Parameter(),
                Bpmn2Factory.eINSTANCE.createParameter())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ParameterBinding(),
                Bpmn2Factory.eINSTANCE.createParameterBinding())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Participant(),
                Bpmn2Factory.eINSTANCE.createParticipant())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ParticipantMultiplicity(),
                Bpmn2Factory.eINSTANCE.createParticipantMultiplicity())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_PeopleAssignment(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignment())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_PeopleAssignment(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_PeopleAssignment(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignmentLiteral())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_PeopleAssignment(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignmentPeopleGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PeopleAssignmentExpression(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignmentExpression())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PeopleAssignmentLiteral(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignmentLiteral())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PeopleAssignmentPeopleGroup(),
                Bpmn2Factory.eINSTANCE.createPeopleAssignmentPeopleGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_PeopleGroup(),
                Bpmn2Factory.eINSTANCE.createPeopleGroup())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_PotentialOwner(),
                Bpmn2Factory.eINSTANCE.createPotentialOwner())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Process(),
                Bpmn2Factory.eINSTANCE.createProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ProcessRole(),
                Bpmn2Factory.eINSTANCE.createProcessRole())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Property(),
                Bpmn2Factory.eINSTANCE.createProperty())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ReceiveTask(),
                Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Relationship(),
                Bpmn2Factory.eINSTANCE.createRelationship())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Rendering(),
                Bpmn2Factory.eINSTANCE.createRendering())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Role(),
                Bpmn2Factory.eINSTANCE.createRole())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
                Bpmn2Factory.eINSTANCE.createScript())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ScriptTask(),
                Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_SendTask(),
                Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_SequenceFlow(),
                Bpmn2Factory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ServiceReference(),
                Bpmn2Factory.eINSTANCE.createServiceReference())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ServiceTask(),
                Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Signal(),
                Bpmn2Factory.eINSTANCE.createSignal())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_SignalEventDefinition(),
                Bpmn2Factory.eINSTANCE.createSignalEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics(),
                Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_StartEvent(),
                Bpmn2Factory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_StructureDefinition(),
                Bpmn2Factory.eINSTANCE.createStructureDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_SubProcess(),
                Bpmn2Factory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_SubProcess(),
                Bpmn2Factory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                Bpmn2Factory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                Bpmn2Factory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                Bpmn2Factory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                Bpmn2Factory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                Bpmn2Factory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                Bpmn2Factory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                Bpmn2Factory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
                Bpmn2Factory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition(),
                Bpmn2Factory.eINSTANCE.createTerminateEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
                Bpmn2Factory.eINSTANCE.createText())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_TextAnnotation(),
                Bpmn2Factory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ThrowEvent(),
                Bpmn2Factory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_ThrowEvent(),
                Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_TimerEventDefinition(),
                Bpmn2Factory.eINSTANCE.createTimerEventDefinition())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_Transaction(),
                Bpmn2Factory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(Bpmn2Package.eINSTANCE
                .getDocumentation_Mixed(), FeatureMapUtil.createEntry(
                Bpmn2Package.eINSTANCE.getDocumentRoot_UserTask(),
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
                .getDocumentRoot_Activity()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_FlowElement()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BaseElement()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_FlowNode()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SubProcess()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_AdHocSubProcess()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Task()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BusinessRuleTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CallActivity()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ManualTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ReceiveTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ScriptTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SendTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ServiceTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Transaction()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_UserTask()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BoundaryEvent()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CatchEvent()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Event()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ChoreographyActivity()
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
                        .getDocumentRoot_ThrowEvent()
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
                        .getDocumentRoot_ParallelGateway()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SequenceFlow()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_StartEvent()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Artifact()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Association()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Group()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TextAnnotation()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Auditing()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CallableElement()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_RootElement()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CancelEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_EventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Category()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CategoryValue()
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
                        .getDocumentRoot_ConversationLink()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ConversationView()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CorrelationKey()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CorrelationProperty()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CorrelationSet()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_DataInput()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_DataAssociation()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_DataInputAssociation()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_DataState()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_DataOutput()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_DataOutputAssociation()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Definitions()
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
                        .getDocumentRoot_Performer()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_HumanPerformer()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_IoBinding()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_IoSpecification()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_InputSet()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Interface()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Lane()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_LaneSet()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_LinkEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Message()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_MessageEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_MessageFlow()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Monitoring()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_LoopCharacteristics()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_MultiInstanceLoopCharacteristics()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Operation()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_OutputSet()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Parameter()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ParameterBinding()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Participant()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ParticipantMultiplicity()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PeopleAssignment()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PeopleAssignmentExpression()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PeopleAssignmentLiteral()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PeopleAssignmentPeopleGroup()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PeopleGroup()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_PotentialOwner()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Process()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ProcessRole()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Property()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Relationship()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Rendering()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Role()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_ServiceReference()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Signal()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_SignalEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_StandardLoopCharacteristics()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_StructureDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TerminateEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_TimerEventDefinition()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_BaseElementWithMixedContent()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_Expression()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_FormalExpression()
                || childFeature == Bpmn2Package.eINSTANCE
                        .getDocumentRoot_CorrelationPropertyRetrievalExpression();

        if (qualify) {
            return getString("_UI_CreateChild_text2", new Object[] {
                    getTypeText(childObject), getFeatureText(childFeature),
                    getTypeText(owner) });
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
        return BPMN20EditPlugin.INSTANCE;
    }

}
