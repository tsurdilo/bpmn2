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
package org.eclipse.mdt.bpmn.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.ErrorEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ErrorEventDefinitionImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ErrorEventDefinitionImpl#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorEventDefinitionImpl extends EventDefinitionImpl implements
        ErrorEventDefinition {
    /**
     * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorCode()
     * @generated
     * @ordered
     */
    protected static final String ERROR_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorCode()
     * @generated
     * @ordered
     */
    protected String errorCode = ERROR_CODE_EDEFAULT;

    /**
     * The default value of the '{@link #getErrorRef() <em>Error Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorRef()
     * @generated
     * @ordered
     */
    protected static final QName ERROR_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getErrorRef() <em>Error Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErrorRef()
     * @generated
     * @ordered
     */
    protected QName errorRef = ERROR_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ErrorEventDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getErrorEventDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setErrorCode(String newErrorCode) {
        String oldErrorCode = errorCode;
        errorCode = newErrorCode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_CODE,
                    oldErrorCode, errorCode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getErrorRef() {
        return errorRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setErrorRef(QName newErrorRef) {
        QName oldErrorRef = errorRef;
        errorRef = newErrorRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_REF, oldErrorRef,
                    errorRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_CODE:
            return getErrorCode();
        case BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_REF:
            return getErrorRef();
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
        case BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_CODE:
            setErrorCode((String) newValue);
            return;
        case BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_REF:
            setErrorRef((QName) newValue);
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
        case BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_CODE:
            setErrorCode(ERROR_CODE_EDEFAULT);
            return;
        case BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_REF:
            setErrorRef(ERROR_REF_EDEFAULT);
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
        case BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_CODE:
            return ERROR_CODE_EDEFAULT == null ? errorCode != null
                    : !ERROR_CODE_EDEFAULT.equals(errorCode);
        case BpmnPackage.ERROR_EVENT_DEFINITION__ERROR_REF:
            return ERROR_REF_EDEFAULT == null ? errorRef != null
                    : !ERROR_REF_EDEFAULT.equals(errorRef);
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
        result.append(" (errorCode: "); //$NON-NLS-1$
        result.append(errorCode);
        result.append(", errorRef: "); //$NON-NLS-1$
        result.append(errorRef);
        result.append(')');
        return result.toString();
    }

} //ErrorEventDefinitionImpl
