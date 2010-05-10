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
import org.eclipse.bpmn.MessageFlowAssociation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Flow Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.MessageFlowAssociationImpl#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MessageFlowAssociationImpl#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageFlowAssociationImpl extends BaseElementImpl implements
        MessageFlowAssociation {
    /**
     * The default value of the '{@link #getInnerMessageFlowRef() <em>Inner Message Flow Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInnerMessageFlowRef()
     * @generated
     * @ordered
     */
    protected static final QName INNER_MESSAGE_FLOW_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInnerMessageFlowRef() <em>Inner Message Flow Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInnerMessageFlowRef()
     * @generated
     * @ordered
     */
    protected QName innerMessageFlowRef = INNER_MESSAGE_FLOW_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getOuterMessageFlowRef() <em>Outer Message Flow Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOuterMessageFlowRef()
     * @generated
     * @ordered
     */
    protected static final QName OUTER_MESSAGE_FLOW_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOuterMessageFlowRef() <em>Outer Message Flow Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOuterMessageFlowRef()
     * @generated
     * @ordered
     */
    protected QName outerMessageFlowRef = OUTER_MESSAGE_FLOW_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageFlowAssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getMessageFlowAssociation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getInnerMessageFlowRef() {
        return innerMessageFlowRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInnerMessageFlowRef(QName newInnerMessageFlowRef) {
        QName oldInnerMessageFlowRef = innerMessageFlowRef;
        innerMessageFlowRef = newInnerMessageFlowRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    BpmnPackage.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF,
                    oldInnerMessageFlowRef, innerMessageFlowRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getOuterMessageFlowRef() {
        return outerMessageFlowRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOuterMessageFlowRef(QName newOuterMessageFlowRef) {
        QName oldOuterMessageFlowRef = outerMessageFlowRef;
        outerMessageFlowRef = newOuterMessageFlowRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    BpmnPackage.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF,
                    oldOuterMessageFlowRef, outerMessageFlowRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
            return getInnerMessageFlowRef();
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
            return getOuterMessageFlowRef();
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
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
            setInnerMessageFlowRef((QName) newValue);
            return;
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
            setOuterMessageFlowRef((QName) newValue);
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
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
            setInnerMessageFlowRef(INNER_MESSAGE_FLOW_REF_EDEFAULT);
            return;
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
            setOuterMessageFlowRef(OUTER_MESSAGE_FLOW_REF_EDEFAULT);
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
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF:
            return INNER_MESSAGE_FLOW_REF_EDEFAULT == null ? innerMessageFlowRef != null
                    : !INNER_MESSAGE_FLOW_REF_EDEFAULT
                            .equals(innerMessageFlowRef);
        case BpmnPackage.MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF:
            return OUTER_MESSAGE_FLOW_REF_EDEFAULT == null ? outerMessageFlowRef != null
                    : !OUTER_MESSAGE_FLOW_REF_EDEFAULT
                            .equals(outerMessageFlowRef);
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
        result.append(" (innerMessageFlowRef: "); //$NON-NLS-1$
        result.append(innerMessageFlowRef);
        result.append(", outerMessageFlowRef: "); //$NON-NLS-1$
        result.append(outerMessageFlowRef);
        result.append(')');
        return result.toString();
    }

} //MessageFlowAssociationImpl
