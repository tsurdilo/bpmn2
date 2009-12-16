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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.ParticipantMultiplicity;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ParticipantMultiplicityImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ParticipantMultiplicityImpl#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantMultiplicityImpl extends BaseElementImpl implements ParticipantMultiplicity {
    /**
     * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximum()
     * @generated
     * @ordered
     */
    protected static final int MAXIMUM_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximum()
     * @generated
     * @ordered
     */
    protected int maximum = MAXIMUM_EDEFAULT;

    /**
     * This is true if the Maximum attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maximumESet;

    /**
     * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimum()
     * @generated
     * @ordered
     */
    protected static final int MINIMUM_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimum()
     * @generated
     * @ordered
     */
    protected int minimum = MINIMUM_EDEFAULT;

    /**
     * This is true if the Minimum attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minimumESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParticipantMultiplicityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getParticipantMultiplicity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaximum(int newMaximum) {
        int oldMaximum = maximum;
        maximum = newMaximum;
        boolean oldMaximumESet = maximumESet;
        maximumESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM, oldMaximum, maximum, !oldMaximumESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaximum() {
        int oldMaximum = maximum;
        boolean oldMaximumESet = maximumESet;
        maximum = MAXIMUM_EDEFAULT;
        maximumESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, bpmnPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM, oldMaximum, MAXIMUM_EDEFAULT, oldMaximumESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMaximum() {
        return maximumESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinimum(int newMinimum) {
        int oldMinimum = minimum;
        minimum = newMinimum;
        boolean oldMinimumESet = minimumESet;
        minimumESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.PARTICIPANT_MULTIPLICITY__MINIMUM, oldMinimum, minimum, !oldMinimumESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMinimum() {
        int oldMinimum = minimum;
        boolean oldMinimumESet = minimumESet;
        minimum = MINIMUM_EDEFAULT;
        minimumESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, bpmnPackage.PARTICIPANT_MULTIPLICITY__MINIMUM, oldMinimum, MINIMUM_EDEFAULT, oldMinimumESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMinimum() {
        return minimumESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case bpmnPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM:
                return getMaximum();
            case bpmnPackage.PARTICIPANT_MULTIPLICITY__MINIMUM:
                return getMinimum();
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
            case bpmnPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM:
                setMaximum((Integer)newValue);
                return;
            case bpmnPackage.PARTICIPANT_MULTIPLICITY__MINIMUM:
                setMinimum((Integer)newValue);
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
            case bpmnPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM:
                unsetMaximum();
                return;
            case bpmnPackage.PARTICIPANT_MULTIPLICITY__MINIMUM:
                unsetMinimum();
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
            case bpmnPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM:
                return isSetMaximum();
            case bpmnPackage.PARTICIPANT_MULTIPLICITY__MINIMUM:
                return isSetMinimum();
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
        result.append(" (maximum: "); //$NON-NLS-1$
        if (maximumESet) result.append(maximum); else result.append("<unset>"); //$NON-NLS-1$
        result.append(", minimum: "); //$NON-NLS-1$
        if (minimumESet) result.append(minimum); else result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //ParticipantMultiplicityImpl
