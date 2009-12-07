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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.ConversationLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ConversationLinkImpl#getConversationRef <em>Conversation Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ConversationLinkImpl#getParticipantRef <em>Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationLinkImpl extends BaseElementImpl implements
        ConversationLink {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The default value of the '{@link #getConversationRef() <em>Conversation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationRef()
     * @generated
     * @ordered
     */
    protected static final QName CONVERSATION_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConversationRef() <em>Conversation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationRef()
     * @generated
     * @ordered
     */
    protected QName conversationRef = CONVERSATION_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getParticipantRef() <em>Participant Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantRef()
     * @generated
     * @ordered
     */
    protected static final QName PARTICIPANT_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getParticipantRef() <em>Participant Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantRef()
     * @generated
     * @ordered
     */
    protected QName participantRef = PARTICIPANT_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConversationLinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getConversationLink();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getConversationRef() {
        return conversationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConversationRef(QName newConversationRef) {
        QName oldConversationRef = conversationRef;
        conversationRef = newConversationRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CONVERSATION_LINK__CONVERSATION_REF,
                    oldConversationRef, conversationRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getParticipantRef() {
        return participantRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParticipantRef(QName newParticipantRef) {
        QName oldParticipantRef = participantRef;
        participantRef = newParticipantRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CONVERSATION_LINK__PARTICIPANT_REF,
                    oldParticipantRef, participantRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.CONVERSATION_LINK__CONVERSATION_REF:
            return getConversationRef();
        case Bpmn2Package.CONVERSATION_LINK__PARTICIPANT_REF:
            return getParticipantRef();
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
        case Bpmn2Package.CONVERSATION_LINK__CONVERSATION_REF:
            setConversationRef((QName) newValue);
            return;
        case Bpmn2Package.CONVERSATION_LINK__PARTICIPANT_REF:
            setParticipantRef((QName) newValue);
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
        case Bpmn2Package.CONVERSATION_LINK__CONVERSATION_REF:
            setConversationRef(CONVERSATION_REF_EDEFAULT);
            return;
        case Bpmn2Package.CONVERSATION_LINK__PARTICIPANT_REF:
            setParticipantRef(PARTICIPANT_REF_EDEFAULT);
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
        case Bpmn2Package.CONVERSATION_LINK__CONVERSATION_REF:
            return CONVERSATION_REF_EDEFAULT == null ? conversationRef != null
                    : !CONVERSATION_REF_EDEFAULT.equals(conversationRef);
        case Bpmn2Package.CONVERSATION_LINK__PARTICIPANT_REF:
            return PARTICIPANT_REF_EDEFAULT == null ? participantRef != null
                    : !PARTICIPANT_REF_EDEFAULT.equals(participantRef);
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
        result.append(" (conversationRef: ");
        result.append(conversationRef);
        result.append(", participantRef: ");
        result.append(participantRef);
        result.append(')');
        return result.toString();
    }

} //ConversationLinkImpl
