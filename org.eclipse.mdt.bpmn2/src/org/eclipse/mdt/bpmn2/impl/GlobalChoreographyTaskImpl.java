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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.GlobalChoreographyTask;
import org.eclipse.mdt.bpmn2.MessageFlow;
import org.eclipse.mdt.bpmn2.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.GlobalChoreographyTaskImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.GlobalChoreographyTaskImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.GlobalChoreographyTaskImpl#getInitiatingParticipant <em>Initiating Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalChoreographyTaskImpl extends CallableElementImpl implements
        GlobalChoreographyTask {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipant()
     * @generated
     * @ordered
     */
    protected EList<Participant> participant;

    /**
     * The cached value of the '{@link #getMessageFlow() <em>Message Flow</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlow()
     * @generated
     * @ordered
     */
    protected EList<MessageFlow> messageFlow;

    /**
     * The default value of the '{@link #getInitiatingParticipant() <em>Initiating Participant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitiatingParticipant()
     * @generated
     * @ordered
     */
    protected static final QName INITIATING_PARTICIPANT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitiatingParticipant() <em>Initiating Participant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitiatingParticipant()
     * @generated
     * @ordered
     */
    protected QName initiatingParticipant = INITIATING_PARTICIPANT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GlobalChoreographyTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getGlobalChoreographyTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Participant> getParticipant() {
        if (participant == null) {
            participant = new EObjectContainmentEList<Participant>(
                    Participant.class, this,
                    Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT);
        }
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MessageFlow> getMessageFlow() {
        if (messageFlow == null) {
            messageFlow = new EObjectContainmentEList<MessageFlow>(
                    MessageFlow.class, this,
                    Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW);
        }
        return messageFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getInitiatingParticipant() {
        return initiatingParticipant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitiatingParticipant(QName newInitiatingParticipant) {
        QName oldInitiatingParticipant = initiatingParticipant;
        initiatingParticipant = newInitiatingParticipant;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT,
                    oldInitiatingParticipant, initiatingParticipant));
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
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT:
            return ((InternalEList<?>) getParticipant()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW:
            return ((InternalEList<?>) getMessageFlow()).basicRemove(otherEnd,
                    msgs);
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
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT:
            return getParticipant();
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW:
            return getMessageFlow();
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT:
            return getInitiatingParticipant();
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
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT:
            getParticipant().clear();
            getParticipant().addAll(
                    (Collection<? extends Participant>) newValue);
            return;
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW:
            getMessageFlow().clear();
            getMessageFlow().addAll(
                    (Collection<? extends MessageFlow>) newValue);
            return;
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT:
            setInitiatingParticipant((QName) newValue);
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
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT:
            getParticipant().clear();
            return;
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW:
            getMessageFlow().clear();
            return;
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT:
            setInitiatingParticipant(INITIATING_PARTICIPANT_EDEFAULT);
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
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT:
            return participant != null && !participant.isEmpty();
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW:
            return messageFlow != null && !messageFlow.isEmpty();
        case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT:
            return INITIATING_PARTICIPANT_EDEFAULT == null ? initiatingParticipant != null
                    : !INITIATING_PARTICIPANT_EDEFAULT
                            .equals(initiatingParticipant);
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
        result.append(" (initiatingParticipant: ");
        result.append(initiatingParticipant);
        result.append(')');
        return result.toString();
    }

} //GlobalChoreographyTaskImpl
