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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.ComplexGateway;
import org.eclipse.mdt.bpmn2.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ComplexGatewayImpl#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ComplexGatewayImpl#getResetSequenceFlow <em>Reset Sequence Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexGatewayImpl extends GatewayImpl implements ComplexGateway {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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
     * The default value of the '{@link #getResetSequenceFlow() <em>Reset Sequence Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResetSequenceFlow()
     * @generated
     * @ordered
     */
    protected static final String RESET_SEQUENCE_FLOW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResetSequenceFlow() <em>Reset Sequence Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResetSequenceFlow()
     * @generated
     * @ordered
     */
    protected String resetSequenceFlow = RESET_SEQUENCE_FLOW_EDEFAULT;

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
        return Bpmn2Package.eINSTANCE.getComplexGateway();
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
                    Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION,
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
                                        - Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION,
                                null, msgs);
            if (newActivationCondition != null)
                msgs = ((InternalEObject) newActivationCondition)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION,
                                null, msgs);
            msgs = basicSetActivationCondition(newActivationCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION,
                    newActivationCondition, newActivationCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getResetSequenceFlow() {
        return resetSequenceFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResetSequenceFlow(String newResetSequenceFlow) {
        String oldResetSequenceFlow = resetSequenceFlow;
        resetSequenceFlow = newResetSequenceFlow;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.COMPLEX_GATEWAY__RESET_SEQUENCE_FLOW,
                    oldResetSequenceFlow, resetSequenceFlow));
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
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
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
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            return getActivationCondition();
        case Bpmn2Package.COMPLEX_GATEWAY__RESET_SEQUENCE_FLOW:
            return getResetSequenceFlow();
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
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            setActivationCondition((Expression) newValue);
            return;
        case Bpmn2Package.COMPLEX_GATEWAY__RESET_SEQUENCE_FLOW:
            setResetSequenceFlow((String) newValue);
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
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            setActivationCondition((Expression) null);
            return;
        case Bpmn2Package.COMPLEX_GATEWAY__RESET_SEQUENCE_FLOW:
            setResetSequenceFlow(RESET_SEQUENCE_FLOW_EDEFAULT);
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
        case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
            return activationCondition != null;
        case Bpmn2Package.COMPLEX_GATEWAY__RESET_SEQUENCE_FLOW:
            return RESET_SEQUENCE_FLOW_EDEFAULT == null ? resetSequenceFlow != null
                    : !RESET_SEQUENCE_FLOW_EDEFAULT.equals(resetSequenceFlow);
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
        result.append(" (resetSequenceFlow: ");
        result.append(resetSequenceFlow);
        result.append(')');
        return result.toString();
    }

} //ComplexGatewayImpl
