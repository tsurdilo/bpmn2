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
import org.eclipse.mdt.bpmn2.GlobalTask;
import org.eclipse.mdt.bpmn2.Performer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.GlobalTaskImpl#getPerformerGroup <em>Performer Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.GlobalTaskImpl#getPerformer <em>Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalTaskImpl extends CallableElementImpl implements GlobalTask {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getPerformerGroup() <em>Performer Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPerformerGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap performerGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GlobalTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getGlobalTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getPerformerGroup() {
        if (performerGroup == null) {
            performerGroup = new BasicFeatureMap(this,
                    Bpmn2Package.GLOBAL_TASK__PERFORMER_GROUP);
        }
        return performerGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Performer> getPerformer() {
        return getPerformerGroup().list(
                Bpmn2Package.eINSTANCE.getGlobalTask_Performer());
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
        case Bpmn2Package.GLOBAL_TASK__PERFORMER_GROUP:
            return ((InternalEList<?>) getPerformerGroup()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.GLOBAL_TASK__PERFORMER:
            return ((InternalEList<?>) getPerformer()).basicRemove(otherEnd,
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
        case Bpmn2Package.GLOBAL_TASK__PERFORMER_GROUP:
            if (coreType)
                return getPerformerGroup();
            return ((FeatureMap.Internal) getPerformerGroup()).getWrapper();
        case Bpmn2Package.GLOBAL_TASK__PERFORMER:
            return getPerformer();
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
        case Bpmn2Package.GLOBAL_TASK__PERFORMER_GROUP:
            ((FeatureMap.Internal) getPerformerGroup()).set(newValue);
            return;
        case Bpmn2Package.GLOBAL_TASK__PERFORMER:
            getPerformer().clear();
            getPerformer().addAll((Collection<? extends Performer>) newValue);
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
        case Bpmn2Package.GLOBAL_TASK__PERFORMER_GROUP:
            getPerformerGroup().clear();
            return;
        case Bpmn2Package.GLOBAL_TASK__PERFORMER:
            getPerformer().clear();
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
        case Bpmn2Package.GLOBAL_TASK__PERFORMER_GROUP:
            return performerGroup != null && !performerGroup.isEmpty();
        case Bpmn2Package.GLOBAL_TASK__PERFORMER:
            return !getPerformer().isEmpty();
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
        result.append(" (performerGroup: ");
        result.append(performerGroup);
        result.append(')');
        return result.toString();
    }

} //GlobalTaskImpl
