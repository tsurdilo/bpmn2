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
import org.eclipse.bpmn.Expression;
import org.eclipse.bpmn.TimerEventDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.TimerEventDefinitionImpl#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.TimerEventDefinitionImpl#getTimeCycle <em>Time Cycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerEventDefinitionImpl extends EventDefinitionImpl implements TimerEventDefinition {
    /**
     * The cached value of the '{@link #getTimeDate() <em>Time Date</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeDate()
     * @generated
     * @ordered
     */
    protected Expression timeDate;

    /**
     * The cached value of the '{@link #getTimeCycle() <em>Time Cycle</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeCycle()
     * @generated
     * @ordered
     */
    protected Expression timeCycle;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimerEventDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getTimerEventDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getTimeDate() {
        return timeDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimeDate(Expression newTimeDate, NotificationChain msgs) {
        Expression oldTimeDate = timeDate;
        timeDate = newTimeDate;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.TIMER_EVENT_DEFINITION__TIME_DATE, oldTimeDate,
                    newTimeDate);
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
    public void setTimeDate(Expression newTimeDate) {
        if (newTimeDate != timeDate) {
            NotificationChain msgs = null;
            if (timeDate != null)
                msgs = ((InternalEObject) timeDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.TIMER_EVENT_DEFINITION__TIME_DATE, null, msgs);
            if (newTimeDate != null)
                msgs = ((InternalEObject) newTimeDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.TIMER_EVENT_DEFINITION__TIME_DATE, null, msgs);
            msgs = basicSetTimeDate(newTimeDate, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.TIMER_EVENT_DEFINITION__TIME_DATE, newTimeDate, newTimeDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getTimeCycle() {
        return timeCycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimeCycle(Expression newTimeCycle, NotificationChain msgs) {
        Expression oldTimeCycle = timeCycle;
        timeCycle = newTimeCycle;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE, oldTimeCycle,
                    newTimeCycle);
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
    public void setTimeCycle(Expression newTimeCycle) {
        if (newTimeCycle != timeCycle) {
            NotificationChain msgs = null;
            if (timeCycle != null)
                msgs = ((InternalEObject) timeCycle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE, null, msgs);
            if (newTimeCycle != null)
                msgs = ((InternalEObject) newTimeCycle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE, null, msgs);
            msgs = basicSetTimeCycle(newTimeCycle, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE, newTimeCycle, newTimeCycle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_DATE:
            return basicSetTimeDate(null, msgs);
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE:
            return basicSetTimeCycle(null, msgs);
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
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_DATE:
            return getTimeDate();
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE:
            return getTimeCycle();
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
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_DATE:
            setTimeDate((Expression) newValue);
            return;
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE:
            setTimeCycle((Expression) newValue);
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
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_DATE:
            setTimeDate((Expression) null);
            return;
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE:
            setTimeCycle((Expression) null);
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
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_DATE:
            return timeDate != null;
        case BpmnPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE:
            return timeCycle != null;
        }
        return super.eIsSet(featureID);
    }

} //TimerEventDefinitionImpl
