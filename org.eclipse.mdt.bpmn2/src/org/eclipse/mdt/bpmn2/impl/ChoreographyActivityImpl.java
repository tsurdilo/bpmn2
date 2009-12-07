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

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.ChoreographyActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ChoreographyActivityImpl#getParticipantRef <em>Participant Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ChoreographyActivityImpl#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChoreographyActivityImpl extends FlowNodeImpl implements
        ChoreographyActivity {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getParticipantRef() <em>Participant Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantRef()
     * @generated
     * @ordered
     */
    protected EList<QName> participantRef;

    /**
     * The default value of the '{@link #getInitiatingParticipantRef() <em>Initiating Participant Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitiatingParticipantRef()
     * @generated
     * @ordered
     */
    protected static final QName INITIATING_PARTICIPANT_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitiatingParticipantRef() <em>Initiating Participant Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitiatingParticipantRef()
     * @generated
     * @ordered
     */
    protected QName initiatingParticipantRef = INITIATING_PARTICIPANT_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChoreographyActivityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getChoreographyActivity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getParticipantRef() {
        if (participantRef == null) {
            participantRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF);
        }
        return participantRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getInitiatingParticipantRef() {
        return initiatingParticipantRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitiatingParticipantRef(QName newInitiatingParticipantRef) {
        QName oldInitiatingParticipantRef = initiatingParticipantRef;
        initiatingParticipantRef = newInitiatingParticipantRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF,
                    oldInitiatingParticipantRef, initiatingParticipantRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF:
            return getParticipantRef();
        case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
            return getInitiatingParticipantRef();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF:
            getParticipantRef().clear();
            getParticipantRef().addAll((Collection<? extends QName>) newValue);
            return;
        case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
            setInitiatingParticipantRef((QName) newValue);
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
        case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF:
            getParticipantRef().clear();
            return;
        case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
            setInitiatingParticipantRef(INITIATING_PARTICIPANT_REF_EDEFAULT);
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
        case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF:
            return participantRef != null && !participantRef.isEmpty();
        case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
            return INITIATING_PARTICIPANT_REF_EDEFAULT == null ? initiatingParticipantRef != null
                    : !INITIATING_PARTICIPANT_REF_EDEFAULT
                            .equals(initiatingParticipantRef);
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
        result.append(" (participantRef: ");
        result.append(participantRef);
        result.append(", initiatingParticipantRef: ");
        result.append(initiatingParticipantRef);
        result.append(')');
        return result.toString();
    }

} //ChoreographyActivityImpl
