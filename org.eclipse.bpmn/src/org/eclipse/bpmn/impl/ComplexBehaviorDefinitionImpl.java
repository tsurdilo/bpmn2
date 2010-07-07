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
import org.eclipse.bpmn.ComplexBehaviorDefinition;
import org.eclipse.bpmn.FormalExpression;
import org.eclipse.bpmn.ImplicitThrowEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Behavior Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ComplexBehaviorDefinitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ComplexBehaviorDefinitionImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexBehaviorDefinitionImpl extends BaseElementImpl implements ComplexBehaviorDefinition {
    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected FormalExpression condition;

    /**
     * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvent()
     * @generated
     * @ordered
     */
    protected ImplicitThrowEvent event;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexBehaviorDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getComplexBehaviorDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormalExpression getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(FormalExpression newCondition, NotificationChain msgs) {
        FormalExpression oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION, oldCondition,
                    newCondition);
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
    public void setCondition(FormalExpression newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject) condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION, null,
                        msgs);
            if (newCondition != null)
                msgs = ((InternalEObject) newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION, null,
                        msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION, newCondition, newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplicitThrowEvent getEvent() {
        return event;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEvent(ImplicitThrowEvent newEvent, NotificationChain msgs) {
        ImplicitThrowEvent oldEvent = event;
        event = newEvent;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT, oldEvent, newEvent);
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
    public void setEvent(ImplicitThrowEvent newEvent) {
        if (newEvent != event) {
            NotificationChain msgs = null;
            if (event != null)
                msgs = ((InternalEObject) event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT, null, msgs);
            if (newEvent != null)
                msgs = ((InternalEObject) newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT, null, msgs);
            msgs = basicSetEvent(newEvent, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT, newEvent, newEvent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
            return basicSetCondition(null, msgs);
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
            return basicSetEvent(null, msgs);
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
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
            return getCondition();
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
            return getEvent();
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
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
            setCondition((FormalExpression) newValue);
            return;
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
            setEvent((ImplicitThrowEvent) newValue);
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
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
            setCondition((FormalExpression) null);
            return;
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
            setEvent((ImplicitThrowEvent) null);
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
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
            return condition != null;
        case BpmnPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
            return event != null;
        }
        return super.eIsSet(featureID);
    }

} //ComplexBehaviorDefinitionImpl
