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

import org.eclipse.mdt.bpmn.EscalationEventDefinition;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escalation Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.EscalationEventDefinitionImpl#getEscalationCode <em>Escalation Code</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.EscalationEventDefinitionImpl#getEscalationRef <em>Escalation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EscalationEventDefinitionImpl extends EventDefinitionImpl implements EscalationEventDefinition {
    /**
     * The default value of the '{@link #getEscalationCode() <em>Escalation Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEscalationCode()
     * @generated
     * @ordered
     */
    protected static final String ESCALATION_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEscalationCode() <em>Escalation Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEscalationCode()
     * @generated
     * @ordered
     */
    protected String escalationCode = ESCALATION_CODE_EDEFAULT;

    /**
     * The default value of the '{@link #getEscalationRef() <em>Escalation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEscalationRef()
     * @generated
     * @ordered
     */
    protected static final QName ESCALATION_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEscalationRef() <em>Escalation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEscalationRef()
     * @generated
     * @ordered
     */
    protected QName escalationRef = ESCALATION_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EscalationEventDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getEscalationEventDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEscalationCode() {
        return escalationCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEscalationCode(String newEscalationCode) {
        String oldEscalationCode = escalationCode;
        escalationCode = newEscalationCode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_CODE, oldEscalationCode, escalationCode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getEscalationRef() {
        return escalationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEscalationRef(QName newEscalationRef) {
        QName oldEscalationRef = escalationRef;
        escalationRef = newEscalationRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF, oldEscalationRef, escalationRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_CODE:
                return getEscalationCode();
            case bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
                return getEscalationRef();
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
            case bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_CODE:
                setEscalationCode((String)newValue);
                return;
            case bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
                setEscalationRef((QName)newValue);
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
            case bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_CODE:
                setEscalationCode(ESCALATION_CODE_EDEFAULT);
                return;
            case bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
                setEscalationRef(ESCALATION_REF_EDEFAULT);
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
            case bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_CODE:
                return ESCALATION_CODE_EDEFAULT == null ? escalationCode != null : !ESCALATION_CODE_EDEFAULT.equals(escalationCode);
            case bpmnPackage.ESCALATION_EVENT_DEFINITION__ESCALATION_REF:
                return ESCALATION_REF_EDEFAULT == null ? escalationRef != null : !ESCALATION_REF_EDEFAULT.equals(escalationRef);
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
        result.append(" (escalationCode: "); //$NON-NLS-1$
        result.append(escalationCode);
        result.append(", escalationRef: "); //$NON-NLS-1$
        result.append(escalationRef);
        result.append(')');
        return result.toString();
    }

} //EscalationEventDefinitionImpl
