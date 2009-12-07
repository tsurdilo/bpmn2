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
import org.eclipse.mdt.bpmn2.Expression;
import org.eclipse.mdt.bpmn2.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.SequenceFlowImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.SequenceFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.SequenceFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceFlowImpl extends FlowElementImpl implements SequenceFlow {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditionExpression()
     * @generated
     * @ordered
     */
    protected Expression conditionExpression;

    /**
     * The default value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected String sourceRef = SOURCE_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRef()
     * @generated
     * @ordered
     */
    protected static final String TARGET_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRef()
     * @generated
     * @ordered
     */
    protected String targetRef = TARGET_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SequenceFlowImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getSequenceFlow();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getConditionExpression() {
        return conditionExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConditionExpression(
            Expression newConditionExpression, NotificationChain msgs) {
        Expression oldConditionExpression = conditionExpression;
        conditionExpression = newConditionExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION,
                    oldConditionExpression, newConditionExpression);
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
    public void setConditionExpression(Expression newConditionExpression) {
        if (newConditionExpression != conditionExpression) {
            NotificationChain msgs = null;
            if (conditionExpression != null)
                msgs = ((InternalEObject) conditionExpression)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION,
                                null, msgs);
            if (newConditionExpression != null)
                msgs = ((InternalEObject) newConditionExpression)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION,
                                null, msgs);
            msgs = basicSetConditionExpression(newConditionExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION,
                    newConditionExpression, newConditionExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSourceRef() {
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceRef(String newSourceRef) {
        String oldSourceRef = sourceRef;
        sourceRef = newSourceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF, oldSourceRef,
                    sourceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTargetRef() {
        return targetRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetRef(String newTargetRef) {
        String oldTargetRef = targetRef;
        targetRef = newTargetRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.SEQUENCE_FLOW__TARGET_REF, oldTargetRef,
                    targetRef));
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
        case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
            return basicSetConditionExpression(null, msgs);
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
        case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
            return getConditionExpression();
        case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
            return getSourceRef();
        case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
            return getTargetRef();
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
        case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
            setConditionExpression((Expression) newValue);
            return;
        case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
            setSourceRef((String) newValue);
            return;
        case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
            setTargetRef((String) newValue);
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
        case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
            setConditionExpression((Expression) null);
            return;
        case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
            setSourceRef(SOURCE_REF_EDEFAULT);
            return;
        case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
            setTargetRef(TARGET_REF_EDEFAULT);
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
        case Bpmn2Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
            return conditionExpression != null;
        case Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF:
            return SOURCE_REF_EDEFAULT == null ? sourceRef != null
                    : !SOURCE_REF_EDEFAULT.equals(sourceRef);
        case Bpmn2Package.SEQUENCE_FLOW__TARGET_REF:
            return TARGET_REF_EDEFAULT == null ? targetRef != null
                    : !TARGET_REF_EDEFAULT.equals(targetRef);
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
        result.append(" (sourceRef: ");
        result.append(sourceRef);
        result.append(", targetRef: ");
        result.append(targetRef);
        result.append(')');
        return result.toString();
    }

} //SequenceFlowImpl
