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

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.Artifact;
import org.eclipse.mdt.bpmn.Collaboration;
import org.eclipse.mdt.bpmn.Conversation;
import org.eclipse.mdt.bpmn.ConversationAssociation;
import org.eclipse.mdt.bpmn.MessageFlow;
import org.eclipse.mdt.bpmn.MessageFlowAssociation;
import org.eclipse.mdt.bpmn.Participant;
import org.eclipse.mdt.bpmn.ParticipantAssociation;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getConversation <em>Conversation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getChoreographyRef <em>Choreography Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CollaborationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends RootElementImpl implements Collaboration {
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
     * The cached value of the '{@link #getArtifactGroup() <em>Artifact Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifactGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap artifactGroup;

    /**
     * The cached value of the '{@link #getConversation() <em>Conversation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversation()
     * @generated
     * @ordered
     */
    protected EList<Conversation> conversation;

    /**
     * The cached value of the '{@link #getConversationAssociation() <em>Conversation Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationAssociation()
     * @generated
     * @ordered
     */
    protected EList<ConversationAssociation> conversationAssociation;

    /**
     * The cached value of the '{@link #getParticipantAssociation() <em>Participant Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantAssociation()
     * @generated
     * @ordered
     */
    protected EList<ParticipantAssociation> participantAssociation;

    /**
     * The cached value of the '{@link #getMessageFlowAssociation() <em>Message Flow Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlowAssociation()
     * @generated
     * @ordered
     */
    protected EList<MessageFlowAssociation> messageFlowAssociation;

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
     * The default value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsClosed()
     * @generated
     * @ordered
     */
    protected static final boolean IS_CLOSED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsClosed()
     * @generated
     * @ordered
     */
    protected boolean isClosed = IS_CLOSED_EDEFAULT;

    /**
     * This is true if the Is Closed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isClosedESet;

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
        return bpmnPackage.eINSTANCE.getCollaboration();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Participant> getParticipant() {
        if (participant == null) {
            participant = new EObjectContainmentEList<Participant>(Participant.class, this, bpmnPackage.COLLABORATION__PARTICIPANT);
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
            messageFlow = new EObjectContainmentEList<MessageFlow>(MessageFlow.class, this, bpmnPackage.COLLABORATION__MESSAGE_FLOW);
        }
        return messageFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getArtifactGroup() {
        if (artifactGroup == null) {
            artifactGroup = new BasicFeatureMap(this, bpmnPackage.COLLABORATION__ARTIFACT_GROUP);
        }
        return artifactGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Artifact> getArtifact() {
        return getArtifactGroup().list(bpmnPackage.eINSTANCE.getCollaboration_Artifact());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Conversation> getConversation() {
        if (conversation == null) {
            conversation = new EObjectContainmentEList<Conversation>(Conversation.class, this, bpmnPackage.COLLABORATION__CONVERSATION);
        }
        return conversation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConversationAssociation> getConversationAssociation() {
        if (conversationAssociation == null) {
            conversationAssociation = new EObjectContainmentEList<ConversationAssociation>(ConversationAssociation.class, this, bpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION);
        }
        return conversationAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParticipantAssociation> getParticipantAssociation() {
        if (participantAssociation == null) {
            participantAssociation = new EObjectContainmentEList<ParticipantAssociation>(ParticipantAssociation.class, this, bpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION);
        }
        return participantAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MessageFlowAssociation> getMessageFlowAssociation() {
        if (messageFlowAssociation == null) {
            messageFlowAssociation = new EObjectContainmentEList<MessageFlowAssociation>(MessageFlowAssociation.class, this, bpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION);
        }
        return messageFlowAssociation;
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
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.COLLABORATION__CHOREOGRAPHY_REF, oldChoreographyRef, choreographyRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsClosed() {
        return isClosed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsClosed(boolean newIsClosed) {
        boolean oldIsClosed = isClosed;
        isClosed = newIsClosed;
        boolean oldIsClosedESet = isClosedESet;
        isClosedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.COLLABORATION__IS_CLOSED, oldIsClosed, isClosed, !oldIsClosedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsClosed() {
        boolean oldIsClosed = isClosed;
        boolean oldIsClosedESet = isClosedESet;
        isClosed = IS_CLOSED_EDEFAULT;
        isClosedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, bpmnPackage.COLLABORATION__IS_CLOSED, oldIsClosed, IS_CLOSED_EDEFAULT, oldIsClosedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsClosed() {
        return isClosedESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.COLLABORATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case bpmnPackage.COLLABORATION__PARTICIPANT:
                return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW:
                return ((InternalEList<?>)getMessageFlow()).basicRemove(otherEnd, msgs);
            case bpmnPackage.COLLABORATION__ARTIFACT_GROUP:
                return ((InternalEList<?>)getArtifactGroup()).basicRemove(otherEnd, msgs);
            case bpmnPackage.COLLABORATION__ARTIFACT:
                return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
            case bpmnPackage.COLLABORATION__CONVERSATION:
                return ((InternalEList<?>)getConversation()).basicRemove(otherEnd, msgs);
            case bpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
                return ((InternalEList<?>)getConversationAssociation()).basicRemove(otherEnd, msgs);
            case bpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
                return ((InternalEList<?>)getParticipantAssociation()).basicRemove(otherEnd, msgs);
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
                return ((InternalEList<?>)getMessageFlowAssociation()).basicRemove(otherEnd, msgs);
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
            case bpmnPackage.COLLABORATION__PARTICIPANT:
                return getParticipant();
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW:
                return getMessageFlow();
            case bpmnPackage.COLLABORATION__ARTIFACT_GROUP:
                if (coreType) return getArtifactGroup();
                return ((FeatureMap.Internal)getArtifactGroup()).getWrapper();
            case bpmnPackage.COLLABORATION__ARTIFACT:
                return getArtifact();
            case bpmnPackage.COLLABORATION__CONVERSATION:
                return getConversation();
            case bpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
                return getConversationAssociation();
            case bpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
                return getParticipantAssociation();
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
                return getMessageFlowAssociation();
            case bpmnPackage.COLLABORATION__CHOREOGRAPHY_REF:
                return getChoreographyRef();
            case bpmnPackage.COLLABORATION__IS_CLOSED:
                return isIsClosed();
            case bpmnPackage.COLLABORATION__NAME:
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
            case bpmnPackage.COLLABORATION__PARTICIPANT:
                getParticipant().clear();
                getParticipant().addAll((Collection<? extends Participant>)newValue);
                return;
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW:
                getMessageFlow().clear();
                getMessageFlow().addAll((Collection<? extends MessageFlow>)newValue);
                return;
            case bpmnPackage.COLLABORATION__ARTIFACT_GROUP:
                ((FeatureMap.Internal)getArtifactGroup()).set(newValue);
                return;
            case bpmnPackage.COLLABORATION__ARTIFACT:
                getArtifact().clear();
                getArtifact().addAll((Collection<? extends Artifact>)newValue);
                return;
            case bpmnPackage.COLLABORATION__CONVERSATION:
                getConversation().clear();
                getConversation().addAll((Collection<? extends Conversation>)newValue);
                return;
            case bpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
                getConversationAssociation().clear();
                getConversationAssociation().addAll((Collection<? extends ConversationAssociation>)newValue);
                return;
            case bpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
                getParticipantAssociation().clear();
                getParticipantAssociation().addAll((Collection<? extends ParticipantAssociation>)newValue);
                return;
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
                getMessageFlowAssociation().clear();
                getMessageFlowAssociation().addAll((Collection<? extends MessageFlowAssociation>)newValue);
                return;
            case bpmnPackage.COLLABORATION__CHOREOGRAPHY_REF:
                setChoreographyRef((QName)newValue);
                return;
            case bpmnPackage.COLLABORATION__IS_CLOSED:
                setIsClosed((Boolean)newValue);
                return;
            case bpmnPackage.COLLABORATION__NAME:
                setName((String)newValue);
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
            case bpmnPackage.COLLABORATION__PARTICIPANT:
                getParticipant().clear();
                return;
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW:
                getMessageFlow().clear();
                return;
            case bpmnPackage.COLLABORATION__ARTIFACT_GROUP:
                getArtifactGroup().clear();
                return;
            case bpmnPackage.COLLABORATION__ARTIFACT:
                getArtifact().clear();
                return;
            case bpmnPackage.COLLABORATION__CONVERSATION:
                getConversation().clear();
                return;
            case bpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
                getConversationAssociation().clear();
                return;
            case bpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
                getParticipantAssociation().clear();
                return;
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
                getMessageFlowAssociation().clear();
                return;
            case bpmnPackage.COLLABORATION__CHOREOGRAPHY_REF:
                setChoreographyRef(CHOREOGRAPHY_REF_EDEFAULT);
                return;
            case bpmnPackage.COLLABORATION__IS_CLOSED:
                unsetIsClosed();
                return;
            case bpmnPackage.COLLABORATION__NAME:
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
            case bpmnPackage.COLLABORATION__PARTICIPANT:
                return participant != null && !participant.isEmpty();
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW:
                return messageFlow != null && !messageFlow.isEmpty();
            case bpmnPackage.COLLABORATION__ARTIFACT_GROUP:
                return artifactGroup != null && !artifactGroup.isEmpty();
            case bpmnPackage.COLLABORATION__ARTIFACT:
                return !getArtifact().isEmpty();
            case bpmnPackage.COLLABORATION__CONVERSATION:
                return conversation != null && !conversation.isEmpty();
            case bpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
                return conversationAssociation != null && !conversationAssociation.isEmpty();
            case bpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
                return participantAssociation != null && !participantAssociation.isEmpty();
            case bpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
                return messageFlowAssociation != null && !messageFlowAssociation.isEmpty();
            case bpmnPackage.COLLABORATION__CHOREOGRAPHY_REF:
                return CHOREOGRAPHY_REF_EDEFAULT == null ? choreographyRef != null : !CHOREOGRAPHY_REF_EDEFAULT.equals(choreographyRef);
            case bpmnPackage.COLLABORATION__IS_CLOSED:
                return isSetIsClosed();
            case bpmnPackage.COLLABORATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (artifactGroup: "); //$NON-NLS-1$
        result.append(artifactGroup);
        result.append(", choreographyRef: "); //$NON-NLS-1$
        result.append(choreographyRef);
        result.append(", isClosed: "); //$NON-NLS-1$
        if (isClosedESet) result.append(isClosed); else result.append("<unset>"); //$NON-NLS-1$
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //CollaborationImpl
