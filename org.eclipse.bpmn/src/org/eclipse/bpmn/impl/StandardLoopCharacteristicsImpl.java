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

import java.math.BigInteger;

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.Expression;
import org.eclipse.bpmn.StandardLoopCharacteristics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.StandardLoopCharacteristicsImpl#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.StandardLoopCharacteristicsImpl#getLoopMaximum <em>Loop Maximum</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.StandardLoopCharacteristicsImpl#isTestBefore <em>Test Before</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardLoopCharacteristicsImpl extends LoopCharacteristicsImpl
        implements StandardLoopCharacteristics {
    /**
     * The cached value of the '{@link #getLoopCondition() <em>Loop Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoopCondition()
     * @generated
     * @ordered
     */
    protected Expression loopCondition;

    /**
     * The default value of the '{@link #getLoopMaximum() <em>Loop Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoopMaximum()
     * @generated
     * @ordered
     */
    protected static final BigInteger LOOP_MAXIMUM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLoopMaximum() <em>Loop Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoopMaximum()
     * @generated
     * @ordered
     */
    protected BigInteger loopMaximum = LOOP_MAXIMUM_EDEFAULT;

    /**
     * The default value of the '{@link #isTestBefore() <em>Test Before</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTestBefore()
     * @generated
     * @ordered
     */
    protected static final boolean TEST_BEFORE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTestBefore() <em>Test Before</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTestBefore()
     * @generated
     * @ordered
     */
    protected boolean testBefore = TEST_BEFORE_EDEFAULT;

    /**
     * This is true if the Test Before attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testBeforeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StandardLoopCharacteristicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getStandardLoopCharacteristics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getLoopCondition() {
        return loopCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopCondition(Expression newLoopCondition,
            NotificationChain msgs) {
        Expression oldLoopCondition = loopCondition;
        loopCondition = newLoopCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
                    oldLoopCondition, newLoopCondition);
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
    public void setLoopCondition(Expression newLoopCondition) {
        if (newLoopCondition != loopCondition) {
            NotificationChain msgs = null;
            if (loopCondition != null)
                msgs = ((InternalEObject) loopCondition)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
                                null, msgs);
            if (newLoopCondition != null)
                msgs = ((InternalEObject) newLoopCondition)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
                                null, msgs);
            msgs = basicSetLoopCondition(newLoopCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION,
                    newLoopCondition, newLoopCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getLoopMaximum() {
        return loopMaximum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoopMaximum(BigInteger newLoopMaximum) {
        BigInteger oldLoopMaximum = loopMaximum;
        loopMaximum = newLoopMaximum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM,
                    oldLoopMaximum, loopMaximum));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTestBefore() {
        return testBefore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTestBefore(boolean newTestBefore) {
        boolean oldTestBefore = testBefore;
        testBefore = newTestBefore;
        boolean oldTestBeforeESet = testBeforeESet;
        testBeforeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE,
                    oldTestBefore, testBefore, !oldTestBeforeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTestBefore() {
        boolean oldTestBefore = testBefore;
        boolean oldTestBeforeESet = testBeforeESet;
        testBefore = TEST_BEFORE_EDEFAULT;
        testBeforeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE,
                    oldTestBefore, TEST_BEFORE_EDEFAULT, oldTestBeforeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTestBefore() {
        return testBeforeESet;
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
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
            return basicSetLoopCondition(null, msgs);
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
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
            return getLoopCondition();
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
            return getLoopMaximum();
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
            return isTestBefore();
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
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
            setLoopCondition((Expression) newValue);
            return;
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
            setLoopMaximum((BigInteger) newValue);
            return;
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
            setTestBefore((Boolean) newValue);
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
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
            setLoopCondition((Expression) null);
            return;
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
            setLoopMaximum(LOOP_MAXIMUM_EDEFAULT);
            return;
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
            unsetTestBefore();
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
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
            return loopCondition != null;
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
            return LOOP_MAXIMUM_EDEFAULT == null ? loopMaximum != null
                    : !LOOP_MAXIMUM_EDEFAULT.equals(loopMaximum);
        case BpmnPackage.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
            return isSetTestBefore();
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
        result.append(" (loopMaximum: "); //$NON-NLS-1$
        result.append(loopMaximum);
        result.append(", testBefore: "); //$NON-NLS-1$
        if (testBeforeESet)
            result.append(testBefore);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //StandardLoopCharacteristicsImpl
