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

import org.eclipse.mdt.bpmn.BoundaryEvent;
import org.eclipse.mdt.bpmn.BpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.BoundaryEventImpl#getAttachedToRef <em>Attached To Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.BoundaryEventImpl#isCancelActivity <em>Cancel Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundaryEventImpl extends CatchEventImpl implements BoundaryEvent {
    /**
     * The default value of the '{@link #getAttachedToRef() <em>Attached To Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttachedToRef()
     * @generated
     * @ordered
     */
    protected static final QName ATTACHED_TO_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttachedToRef() <em>Attached To Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttachedToRef()
     * @generated
     * @ordered
     */
    protected QName attachedToRef = ATTACHED_TO_REF_EDEFAULT;

    /**
     * The default value of the '{@link #isCancelActivity() <em>Cancel Activity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelActivity()
     * @generated
     * @ordered
     */
    protected static final boolean CANCEL_ACTIVITY_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isCancelActivity() <em>Cancel Activity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelActivity()
     * @generated
     * @ordered
     */
    protected boolean cancelActivity = CANCEL_ACTIVITY_EDEFAULT;

    /**
     * This is true if the Cancel Activity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cancelActivityESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BoundaryEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getBoundaryEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getAttachedToRef() {
        return attachedToRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttachedToRef(QName newAttachedToRef) {
        QName oldAttachedToRef = attachedToRef;
        attachedToRef = newAttachedToRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.BOUNDARY_EVENT__ATTACHED_TO_REF,
                    oldAttachedToRef, attachedToRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCancelActivity() {
        return cancelActivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCancelActivity(boolean newCancelActivity) {
        boolean oldCancelActivity = cancelActivity;
        cancelActivity = newCancelActivity;
        boolean oldCancelActivityESet = cancelActivityESet;
        cancelActivityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY,
                    oldCancelActivity, cancelActivity, !oldCancelActivityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCancelActivity() {
        boolean oldCancelActivity = cancelActivity;
        boolean oldCancelActivityESet = cancelActivityESet;
        cancelActivity = CANCEL_ACTIVITY_EDEFAULT;
        cancelActivityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY,
                    oldCancelActivity, CANCEL_ACTIVITY_EDEFAULT,
                    oldCancelActivityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCancelActivity() {
        return cancelActivityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
            return getAttachedToRef();
        case BpmnPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY:
            return isCancelActivity();
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
        case BpmnPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
            setAttachedToRef((QName) newValue);
            return;
        case BpmnPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY:
            setCancelActivity((Boolean) newValue);
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
        case BpmnPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
            setAttachedToRef(ATTACHED_TO_REF_EDEFAULT);
            return;
        case BpmnPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY:
            unsetCancelActivity();
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
        case BpmnPackage.BOUNDARY_EVENT__ATTACHED_TO_REF:
            return ATTACHED_TO_REF_EDEFAULT == null ? attachedToRef != null
                    : !ATTACHED_TO_REF_EDEFAULT.equals(attachedToRef);
        case BpmnPackage.BOUNDARY_EVENT__CANCEL_ACTIVITY:
            return isSetCancelActivity();
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
        result.append(" (attachedToRef: "); //$NON-NLS-1$
        result.append(attachedToRef);
        result.append(", cancelActivity: "); //$NON-NLS-1$
        if (cancelActivityESet)
            result.append(cancelActivity);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //BoundaryEventImpl
