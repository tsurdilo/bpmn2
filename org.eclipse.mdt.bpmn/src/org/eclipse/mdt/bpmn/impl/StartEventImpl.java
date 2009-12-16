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
package org.eclipse.mdt.bpmn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.StartEvent;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.StartEventImpl#isIsInterrupting <em>Is Interrupting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartEventImpl extends CatchEventImpl implements StartEvent {
    /**
     * The default value of the '{@link #isIsInterrupting() <em>Is Interrupting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInterrupting()
     * @generated
     * @ordered
     */
    protected static final boolean IS_INTERRUPTING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsInterrupting() <em>Is Interrupting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInterrupting()
     * @generated
     * @ordered
     */
    protected boolean isInterrupting = IS_INTERRUPTING_EDEFAULT;

    /**
     * This is true if the Is Interrupting attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isInterruptingESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StartEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getStartEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsInterrupting() {
        return isInterrupting;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsInterrupting(boolean newIsInterrupting) {
        boolean oldIsInterrupting = isInterrupting;
        isInterrupting = newIsInterrupting;
        boolean oldIsInterruptingESet = isInterruptingESet;
        isInterruptingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.START_EVENT__IS_INTERRUPTING, oldIsInterrupting, isInterrupting, !oldIsInterruptingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsInterrupting() {
        boolean oldIsInterrupting = isInterrupting;
        boolean oldIsInterruptingESet = isInterruptingESet;
        isInterrupting = IS_INTERRUPTING_EDEFAULT;
        isInterruptingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, bpmnPackage.START_EVENT__IS_INTERRUPTING, oldIsInterrupting, IS_INTERRUPTING_EDEFAULT, oldIsInterruptingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsInterrupting() {
        return isInterruptingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case bpmnPackage.START_EVENT__IS_INTERRUPTING:
                return isIsInterrupting();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case bpmnPackage.START_EVENT__IS_INTERRUPTING:
                setIsInterrupting((Boolean)newValue);
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
            case bpmnPackage.START_EVENT__IS_INTERRUPTING:
                unsetIsInterrupting();
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
            case bpmnPackage.START_EVENT__IS_INTERRUPTING:
                return isSetIsInterrupting();
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
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isInterrupting: "); //$NON-NLS-1$
        if (isInterruptingESet) result.append(isInterrupting); else result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //StartEventImpl
