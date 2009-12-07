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
package org.eclipse.mdt.bpmn2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.ChoreographySubProcess;
import org.eclipse.mdt.bpmn2.FlowElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ChoreographySubProcessImpl#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ChoreographySubProcessImpl#getFlowElement <em>Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoreographySubProcessImpl extends ChoreographyActivityImpl
        implements ChoreographySubProcess {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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
        return Bpmn2Package.eINSTANCE.getChoreographySubProcess();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFlowElementGroup() {
        if (flowElementGroup == null) {
            flowElementGroup = new BasicFeatureMap(this,
                    Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP);
        }
        return flowElementGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowElement> getFlowElement() {
        return getFlowElementGroup().list(
                Bpmn2Package.eINSTANCE.getChoreographySubProcess_FlowElement());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
            int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            return ((InternalEList<?>) getFlowElementGroup()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            return ((InternalEList<?>) getFlowElement()).basicRemove(otherEnd,
                    msgs);
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
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            if (coreType)
                return getFlowElementGroup();
            return ((FeatureMap.Internal) getFlowElementGroup()).getWrapper();
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            return getFlowElement();
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
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            ((FeatureMap.Internal) getFlowElementGroup()).set(newValue);
            return;
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            getFlowElement().clear();
            getFlowElement().addAll(
                    (Collection<? extends FlowElement>) newValue);
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
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            getFlowElementGroup().clear();
            return;
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            getFlowElement().clear();
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
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT_GROUP:
            return flowElementGroup != null && !flowElementGroup.isEmpty();
        case Bpmn2Package.CHOREOGRAPHY_SUB_PROCESS__FLOW_ELEMENT:
            return !getFlowElement().isEmpty();
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
        result.append(" (flowElementGroup: ");
        result.append(flowElementGroup);
        result.append(')');
        return result.toString();
    }

} //ChoreographySubProcessImpl
