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

import org.eclipse.mdt.bpmn2.Artifact;
import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.Collaboration;
import org.eclipse.mdt.bpmn2.MessageFlow;
import org.eclipse.mdt.bpmn2.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CollaborationImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CollaborationImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CollaborationImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CollaborationImpl#getChoreographyRef <em>Choreography Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CollaborationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends RootElementImpl implements Collaboration {
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
     * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifact()
     * @generated
     * @ordered
     */
    protected EList<Artifact> artifact;

    /**
     * The default value of the '{@link #getChoreographyRef() <em>Choreography Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChoreographyRef()
     * @generated
     * @ordered
     */
    protected static final QName CHOREOGRAPHY_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChoreographyRef() <em>Choreography Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChoreographyRef()
     * @generated
     * @ordered
     */
    protected QName choreographyRef = CHOREOGRAPHY_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CollaborationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getCollaboration();
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
                    Bpmn2Package.COLLABORATION__PARTICIPANT);
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
                    Bpmn2Package.COLLABORATION__MESSAGE_FLOW);
        }
        return messageFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Artifact> getArtifact() {
        if (artifact == null) {
            artifact = new EObjectContainmentEList<Artifact>(Artifact.class,
                    this, Bpmn2Package.COLLABORATION__ARTIFACT);
        }
        return artifact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getChoreographyRef() {
        return choreographyRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoreographyRef(QName newChoreographyRef) {
        QName oldChoreographyRef = choreographyRef;
        choreographyRef = newChoreographyRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF,
                    oldChoreographyRef, choreographyRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.COLLABORATION__NAME, oldName, name));
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
        case Bpmn2Package.COLLABORATION__PARTICIPANT:
            return ((InternalEList<?>) getParticipant()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.COLLABORATION__MESSAGE_FLOW:
            return ((InternalEList<?>) getMessageFlow()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.COLLABORATION__ARTIFACT:
            return ((InternalEList<?>) getArtifact()).basicRemove(otherEnd,
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
        case Bpmn2Package.COLLABORATION__PARTICIPANT:
            return getParticipant();
        case Bpmn2Package.COLLABORATION__MESSAGE_FLOW:
            return getMessageFlow();
        case Bpmn2Package.COLLABORATION__ARTIFACT:
            return getArtifact();
        case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF:
            return getChoreographyRef();
        case Bpmn2Package.COLLABORATION__NAME:
            return getName();
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
        case Bpmn2Package.COLLABORATION__PARTICIPANT:
            getParticipant().clear();
            getParticipant().addAll(
                    (Collection<? extends Participant>) newValue);
            return;
        case Bpmn2Package.COLLABORATION__MESSAGE_FLOW:
            getMessageFlow().clear();
            getMessageFlow().addAll(
                    (Collection<? extends MessageFlow>) newValue);
            return;
        case Bpmn2Package.COLLABORATION__ARTIFACT:
            getArtifact().clear();
            getArtifact().addAll((Collection<? extends Artifact>) newValue);
            return;
        case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF:
            setChoreographyRef((QName) newValue);
            return;
        case Bpmn2Package.COLLABORATION__NAME:
            setName((String) newValue);
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
        case Bpmn2Package.COLLABORATION__PARTICIPANT:
            getParticipant().clear();
            return;
        case Bpmn2Package.COLLABORATION__MESSAGE_FLOW:
            getMessageFlow().clear();
            return;
        case Bpmn2Package.COLLABORATION__ARTIFACT:
            getArtifact().clear();
            return;
        case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF:
            setChoreographyRef(CHOREOGRAPHY_REF_EDEFAULT);
            return;
        case Bpmn2Package.COLLABORATION__NAME:
            setName(NAME_EDEFAULT);
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
        case Bpmn2Package.COLLABORATION__PARTICIPANT:
            return participant != null && !participant.isEmpty();
        case Bpmn2Package.COLLABORATION__MESSAGE_FLOW:
            return messageFlow != null && !messageFlow.isEmpty();
        case Bpmn2Package.COLLABORATION__ARTIFACT:
            return artifact != null && !artifact.isEmpty();
        case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF:
            return CHOREOGRAPHY_REF_EDEFAULT == null ? choreographyRef != null
                    : !CHOREOGRAPHY_REF_EDEFAULT.equals(choreographyRef);
        case Bpmn2Package.COLLABORATION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
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
        result.append(" (choreographyRef: ");
        result.append(choreographyRef);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //CollaborationImpl
