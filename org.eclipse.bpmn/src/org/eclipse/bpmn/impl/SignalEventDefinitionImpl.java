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

import javax.xml.namespace.QName;

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.SignalEventDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.SignalEventDefinitionImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalEventDefinitionImpl extends EventDefinitionImpl implements SignalEventDefinition {
    /**
     * The default value of the '{@link #getSignal() <em>Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignal()
     * @generated
     * @ordered
     */
    protected static final QName SIGNAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSignal() <em>Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignal()
     * @generated
     * @ordered
     */
    protected QName signal = SIGNAL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SignalEventDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getSignalEventDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getSignal() {
        return signal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSignal(QName newSignal) {
        QName oldSignal = signal;
        signal = newSignal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL, oldSignal, signal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL:
            return getSignal();
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
        case BpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL:
            setSignal((QName) newValue);
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
        case BpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL:
            setSignal(SIGNAL_EDEFAULT);
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
        case BpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL:
            return SIGNAL_EDEFAULT == null ? signal != null : !SIGNAL_EDEFAULT.equals(signal);
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
        result.append(" (signal: "); //$NON-NLS-1$
        result.append(signal);
        result.append(')');
        return result.toString();
    }

} //SignalEventDefinitionImpl
