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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.SignalEventDefinition;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.SignalEventDefinitionImpl#getSignalRef <em>Signal Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalEventDefinitionImpl extends EventDefinitionImpl implements SignalEventDefinition {
    /**
     * The default value of the '{@link #getSignalRef() <em>Signal Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignalRef()
     * @generated
     * @ordered
     */
    protected static final QName SIGNAL_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSignalRef() <em>Signal Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignalRef()
     * @generated
     * @ordered
     */
    protected QName signalRef = SIGNAL_REF_EDEFAULT;

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
        return bpmnPackage.eINSTANCE.getSignalEventDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getSignalRef() {
        return signalRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSignalRef(QName newSignalRef) {
        QName oldSignalRef = signalRef;
        signalRef = newSignalRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF, oldSignalRef, signalRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case bpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
                return getSignalRef();
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
            case bpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
                setSignalRef((QName)newValue);
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
            case bpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
                setSignalRef(SIGNAL_REF_EDEFAULT);
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
            case bpmnPackage.SIGNAL_EVENT_DEFINITION__SIGNAL_REF:
                return SIGNAL_REF_EDEFAULT == null ? signalRef != null : !SIGNAL_REF_EDEFAULT.equals(signalRef);
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
        result.append(" (signalRef: "); //$NON-NLS-1$
        result.append(signalRef);
        result.append(')');
        return result.toString();
    }

} //SignalEventDefinitionImpl
