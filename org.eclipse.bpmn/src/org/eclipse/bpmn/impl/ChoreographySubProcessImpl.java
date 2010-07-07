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
package org.eclipse.bpmn.impl;

import java.util.Collection;

import java.util.List;
import org.eclipse.bpmn.Artifact;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.ChoreographySubProcess;
import org.eclipse.bpmn.FlowElement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographySubProcessImpl#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographySubProcessImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographySubProcessImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographySubProcessImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoreographySubProcessImpl extends ChoreographyActivityImpl implements ChoreographySubProcess {
    /**
     * The cached value of the '{@link #getFlowElementGroup() <em>Flow Element Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowElementGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap flowElementGroup;

    /**
     * The cached value of the '{@link #getArtifactGroup() <em>Artifact Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifactGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap artifactGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChoreographySubProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getChoreographySubProcess();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFlowElementGroup() {
        if (flowElementGroup == null) {
            flowElementGroup = new BasicFeatureMap(this, BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP);
        }
        return flowElementGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<FlowElement> getFlowElement() {
        return getFlowElementGroup().list(BpmnPackage.eINSTANCE.getChoreographySubProcess_FlowElement());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getArtifactGroup() {
        if (artifactGroup == null) {
            artifactGroup = new BasicFeatureMap(this, BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT_GROUP);
        }
        return artifactGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Artifact> getArtifact() {
        return getArtifactGroup().list(BpmnPackage.eINSTANCE.getChoreographySubProcess_Artifact());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            return ((InternalEList<?>) getFlowElementGroup()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            return ((InternalEList<?>) getFlowElement()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT_GROUP:
            return ((InternalEList<?>) getArtifactGroup()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT:
            return ((InternalEList<?>) getArtifact()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            if (coreType)
                return getFlowElementGroup();
            return ((FeatureMap.Internal) getFlowElementGroup()).getWrapper();
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            return getFlowElement();
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT_GROUP:
            if (coreType)
                return getArtifactGroup();
            return ((FeatureMap.Internal) getArtifactGroup()).getWrapper();
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT:
            return getArtifact();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            ((FeatureMap.Internal) getFlowElementGroup()).set(newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            getFlowElement().clear();
            getFlowElement().addAll((Collection<? extends FlowElement>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT_GROUP:
            ((FeatureMap.Internal) getArtifactGroup()).set(newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT:
            getArtifact().clear();
            getArtifact().addAll((Collection<? extends Artifact>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            getFlowElementGroup().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            getFlowElement().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT_GROUP:
            getArtifactGroup().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT:
            getArtifact().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            return flowElementGroup != null && !flowElementGroup.isEmpty();
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            return !getFlowElement().isEmpty();
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT_GROUP:
            return artifactGroup != null && !artifactGroup.isEmpty();
        case BpmnPackage.CHOREOGRAPHY_SUB_PROCESS__ARTIFACT:
            return !getArtifact().isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (flowElementGroup: "); //$NON-NLS-1$
        result.append(flowElementGroup);
        result.append(", artifactGroup: "); //$NON-NLS-1$
        result.append(artifactGroup);
        result.append(')');
        return result.toString();
    }

} //ChoreographySubProcessImpl
