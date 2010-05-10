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

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.ComplexGateway;
import org.eclipse.bpmn.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ComplexGatewayImpl#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ComplexGatewayImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexGatewayImpl extends GatewayImpl implements ComplexGateway {
    /**
     * The cached value of the '{@link #getActivationCondition() <em>Activation Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivationCondition()
     * @generated
     * @ordered
     */
    protected Expression activationCondition;

    /**
     * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected String default_ = DEFAULT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexGatewayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getComplexGateway();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getActivationCondition() {
        return activationCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivationCondition(
            Expression newActivationCondition, NotificationChain msgs) {
        Expression oldActivationCondition = activationCondition;
        activationCondition = newActivationCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    BpmnPackage.COMPLEX_GATEWAY__ACTIVATION_CONDITION,
                    oldActivationCondition, newActivationCondition);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivationCondition(Expression newActivationCondition) {
        if (newActivationCondition != activationCondition) {
            NotificationChain msgs = null;
            if (activationCondition != null)
                msgs = ((InternalEObject) activationCondition)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.COMPLEX_GATEWAY__ACTIVATION_CONDITION,
                                null, msgs);
            if (newActivationCondition != null)
                msgs = ((InternalEObject) newActivationCondition)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.COMPLEX_GATEWAY__ACTIVATION_CONDITION,
                                null, msgs);
            msgs = basicSetActivationCondition(newActivationCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.COMPLEX_GATEWAY__ACTIVATION_CONDITION,
                    newActivationCondition, newActivationCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefault() {
        return default_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefault(String newDefault) {
        String oldDefault = default_;
        default_ = newDefault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.COMPLEX_GATEWAY__DEFAULT, oldDefault, default_));
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
        case BpmnPackage.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            return basicSetActivationCondition(null, msgs);
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
        case BpmnPackage.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            return getActivationCondition();
        case BpmnPackage.COMPLEX_GATEWAY__DEFAULT:
            return getDefault();
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
        case BpmnPackage.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            setActivationCondition((Expression) newValue);
            return;
        case BpmnPackage.COMPLEX_GATEWAY__DEFAULT:
            setDefault((String) newValue);
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
        case BpmnPackage.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            setActivationCondition((Expression) null);
            return;
        case BpmnPackage.COMPLEX_GATEWAY__DEFAULT:
            setDefault(DEFAULT_EDEFAULT);
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
        case BpmnPackage.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            return activationCondition != null;
        case BpmnPackage.COMPLEX_GATEWAY__DEFAULT:
            return DEFAULT_EDEFAULT == null ? default_ != null
                    : !DEFAULT_EDEFAULT.equals(default_);
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
        result.append(" (default: "); //$NON-NLS-1$
        result.append(default_);
        result.append(')');
        return result.toString();
    }

} //ComplexGatewayImpl
