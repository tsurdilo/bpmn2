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

import org.eclipse.mdt.bpmn.CompensateEventDefinition;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compensate Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CompensateEventDefinitionImpl#getActivityRef <em>Activity Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CompensateEventDefinitionImpl#isWaitForCompletion <em>Wait For Completion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompensateEventDefinitionImpl extends EventDefinitionImpl implements CompensateEventDefinition {
    /**
     * The default value of the '{@link #getActivityRef() <em>Activity Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityRef()
     * @generated
     * @ordered
     */
    protected static final QName ACTIVITY_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActivityRef() <em>Activity Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityRef()
     * @generated
     * @ordered
     */
    protected QName activityRef = ACTIVITY_REF_EDEFAULT;

    /**
     * The default value of the '{@link #isWaitForCompletion() <em>Wait For Completion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isWaitForCompletion()
     * @generated
     * @ordered
     */
    protected static final boolean WAIT_FOR_COMPLETION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isWaitForCompletion() <em>Wait For Completion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isWaitForCompletion()
     * @generated
     * @ordered
     */
    protected boolean waitForCompletion = WAIT_FOR_COMPLETION_EDEFAULT;

    /**
     * This is true if the Wait For Completion attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean waitForCompletionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompensateEventDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getCompensateEventDefinition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getActivityRef() {
        return activityRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivityRef(QName newActivityRef) {
        QName oldActivityRef = activityRef;
        activityRef = newActivityRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF, oldActivityRef, activityRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isWaitForCompletion() {
        return waitForCompletion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWaitForCompletion(boolean newWaitForCompletion) {
        boolean oldWaitForCompletion = waitForCompletion;
        waitForCompletion = newWaitForCompletion;
        boolean oldWaitForCompletionESet = waitForCompletionESet;
        waitForCompletionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION, oldWaitForCompletion, waitForCompletion, !oldWaitForCompletionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetWaitForCompletion() {
        boolean oldWaitForCompletion = waitForCompletion;
        boolean oldWaitForCompletionESet = waitForCompletionESet;
        waitForCompletion = WAIT_FOR_COMPLETION_EDEFAULT;
        waitForCompletionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, bpmnPackage.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION, oldWaitForCompletion, WAIT_FOR_COMPLETION_EDEFAULT, oldWaitForCompletionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetWaitForCompletion() {
        return waitForCompletionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case bpmnPackage.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
                return getActivityRef();
            case bpmnPackage.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
                return isWaitForCompletion();
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
            case bpmnPackage.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
                setActivityRef((QName)newValue);
                return;
            case bpmnPackage.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
                setWaitForCompletion((Boolean)newValue);
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
            case bpmnPackage.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
                setActivityRef(ACTIVITY_REF_EDEFAULT);
                return;
            case bpmnPackage.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
                unsetWaitForCompletion();
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
            case bpmnPackage.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
                return ACTIVITY_REF_EDEFAULT == null ? activityRef != null : !ACTIVITY_REF_EDEFAULT.equals(activityRef);
            case bpmnPackage.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
                return isSetWaitForCompletion();
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
        result.append(" (activityRef: "); //$NON-NLS-1$
        result.append(activityRef);
        result.append(", waitForCompletion: "); //$NON-NLS-1$
        if (waitForCompletionESet) result.append(waitForCompletion); else result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //CompensateEventDefinitionImpl
