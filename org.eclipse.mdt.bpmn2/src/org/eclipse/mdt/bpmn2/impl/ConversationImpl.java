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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.Conversation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ConversationImpl#getChildConversationRef <em>Child Conversation Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ConversationImpl#getParticipantRef <em>Participant Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ConversationImpl#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ConversationImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationImpl extends RootElementImpl implements Conversation {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getChildConversationRef() <em>Child Conversation Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildConversationRef()
     * @generated
     * @ordered
     */
    protected EList<QName> childConversationRef;

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
     * The cached value of the '{@link #getMessageFlowRef() <em>Message Flow Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlowRef()
     * @generated
     * @ordered
     */
    protected EList<QName> messageFlowRef;

    /**
     * The cached value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationKeyRef()
     * @generated
     * @ordered
     */
    protected EList<QName> correlationKeyRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConversationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getConversation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getChildConversationRef() {
        if (childConversationRef == null) {
            childConversationRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.CONVERSATION__CHILD_CONVERSATION_REF);
        }
        return childConversationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getParticipantRef() {
        if (participantRef == null) {
            participantRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.CONVERSATION__PARTICIPANT_REF);
        }
        return participantRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getMessageFlowRef() {
        if (messageFlowRef == null) {
            messageFlowRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.CONVERSATION__MESSAGE_FLOW_REF);
        }
        return messageFlowRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getCorrelationKeyRef() {
        if (correlationKeyRef == null) {
            correlationKeyRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.CONVERSATION__CORRELATION_KEY_REF);
        }
        return correlationKeyRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.CONVERSATION__CHILD_CONVERSATION_REF:
            return getChildConversationRef();
        case Bpmn2Package.CONVERSATION__PARTICIPANT_REF:
            return getParticipantRef();
        case Bpmn2Package.CONVERSATION__MESSAGE_FLOW_REF:
            return getMessageFlowRef();
        case Bpmn2Package.CONVERSATION__CORRELATION_KEY_REF:
            return getCorrelationKeyRef();
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
        case Bpmn2Package.CONVERSATION__CHILD_CONVERSATION_REF:
            getChildConversationRef().clear();
            getChildConversationRef().addAll(
                    (Collection<? extends QName>) newValue);
            return;
        case Bpmn2Package.CONVERSATION__PARTICIPANT_REF:
            getParticipantRef().clear();
            getParticipantRef().addAll((Collection<? extends QName>) newValue);
            return;
        case Bpmn2Package.CONVERSATION__MESSAGE_FLOW_REF:
            getMessageFlowRef().clear();
            getMessageFlowRef().addAll((Collection<? extends QName>) newValue);
            return;
        case Bpmn2Package.CONVERSATION__CORRELATION_KEY_REF:
            getCorrelationKeyRef().clear();
            getCorrelationKeyRef().addAll(
                    (Collection<? extends QName>) newValue);
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
        case Bpmn2Package.CONVERSATION__CHILD_CONVERSATION_REF:
            getChildConversationRef().clear();
            return;
        case Bpmn2Package.CONVERSATION__PARTICIPANT_REF:
            getParticipantRef().clear();
            return;
        case Bpmn2Package.CONVERSATION__MESSAGE_FLOW_REF:
            getMessageFlowRef().clear();
            return;
        case Bpmn2Package.CONVERSATION__CORRELATION_KEY_REF:
            getCorrelationKeyRef().clear();
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
        case Bpmn2Package.CONVERSATION__CHILD_CONVERSATION_REF:
            return childConversationRef != null
                    && !childConversationRef.isEmpty();
        case Bpmn2Package.CONVERSATION__PARTICIPANT_REF:
            return participantRef != null && !participantRef.isEmpty();
        case Bpmn2Package.CONVERSATION__MESSAGE_FLOW_REF:
            return messageFlowRef != null && !messageFlowRef.isEmpty();
        case Bpmn2Package.CONVERSATION__CORRELATION_KEY_REF:
            return correlationKeyRef != null && !correlationKeyRef.isEmpty();
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
        result.append(" (childConversationRef: ");
        result.append(childConversationRef);
        result.append(", participantRef: ");
        result.append(participantRef);
        result.append(", messageFlowRef: ");
        result.append(messageFlowRef);
        result.append(", correlationKeyRef: ");
        result.append(correlationKeyRef);
        result.append(')');
        return result.toString();
    }

} //ConversationImpl
