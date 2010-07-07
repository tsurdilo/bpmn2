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

import java.util.Collection;

import java.util.List;
import javax.xml.namespace.QName;

import org.eclipse.bpmn.Artifact;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.Collaboration;
import org.eclipse.bpmn.Conversation;
import org.eclipse.bpmn.ConversationAssociation;
import org.eclipse.bpmn.MessageFlow;
import org.eclipse.bpmn.MessageFlowAssociation;
import org.eclipse.bpmn.Participant;
import org.eclipse.bpmn.ParticipantAssociation;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getConversation <em>Conversation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getChoreographyRef <em>Choreography Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CollaborationImpl#getName <em>Name</em>}</li>
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
        return BpmnPackage.eINSTANCE.getCollaboration();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Participant> getParticipant() {
        if (participant == null) {
            participant = new EObjectContainmentEList<Participant>(Participant.class, this, BpmnPackage.COLLABORATION__PARTICIPANT);
        }
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<MessageFlow> getMessageFlow() {
        if (messageFlow == null) {
            messageFlow = new EObjectContainmentEList<MessageFlow>(MessageFlow.class, this, BpmnPackage.COLLABORATION__MESSAGE_FLOW);
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
            artifactGroup = new BasicFeatureMap(this, BpmnPackage.COLLABORATION__ARTIFACT_GROUP);
        }
        return artifactGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Artifact> getArtifact() {
        return getArtifactGroup().list(BpmnPackage.eINSTANCE.getCollaboration_Artifact());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Conversation> getConversation() {
        if (conversation == null) {
            conversation = new EObjectContainmentEList<Conversation>(Conversation.class, this, BpmnPackage.COLLABORATION__CONVERSATION);
        }
        return conversation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<ConversationAssociation> getConversationAssociation() {
        if (conversationAssociation == null) {
            conversationAssociation = new EObjectContainmentEList<ConversationAssociation>(ConversationAssociation.class, this,
                    BpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION);
        }
        return conversationAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<ParticipantAssociation> getParticipantAssociation() {
        if (participantAssociation == null) {
            participantAssociation = new EObjectContainmentEList<ParticipantAssociation>(ParticipantAssociation.class, this,
                    BpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION);
        }
        return participantAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<MessageFlowAssociation> getMessageFlowAssociation() {
        if (messageFlowAssociation == null) {
            messageFlowAssociation = new EObjectContainmentEList<MessageFlowAssociation>(MessageFlowAssociation.class, this,
                    BpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION);
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.COLLABORATION__CHOREOGRAPHY_REF, oldChoreographyRef, choreographyRef));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.COLLABORATION__IS_CLOSED, oldIsClosed, isClosed, !oldIsClosedESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.COLLABORATION__IS_CLOSED, oldIsClosed, IS_CLOSED_EDEFAULT, oldIsClosedESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.COLLABORATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.COLLABORATION__PARTICIPANT:
            return ((InternalEList<?>) getParticipant()).basicRemove(otherEnd, msgs);
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW:
            return ((InternalEList<?>) getMessageFlow()).basicRemove(otherEnd, msgs);
        case BpmnPackage.COLLABORATION__ARTIFACT_GROUP:
            return ((InternalEList<?>) getArtifactGroup()).basicRemove(otherEnd, msgs);
        case BpmnPackage.COLLABORATION__ARTIFACT:
            return ((InternalEList<?>) getArtifact()).basicRemove(otherEnd, msgs);
        case BpmnPackage.COLLABORATION__CONVERSATION:
            return ((InternalEList<?>) getConversation()).basicRemove(otherEnd, msgs);
        case BpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
            return ((InternalEList<?>) getConversationAssociation()).basicRemove(otherEnd, msgs);
        case BpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
            return ((InternalEList<?>) getParticipantAssociation()).basicRemove(otherEnd, msgs);
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
            return ((InternalEList<?>) getMessageFlowAssociation()).basicRemove(otherEnd, msgs);
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
        case BpmnPackage.COLLABORATION__PARTICIPANT:
            return getParticipant();
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW:
            return getMessageFlow();
        case BpmnPackage.COLLABORATION__ARTIFACT_GROUP:
            if (coreType)
                return getArtifactGroup();
            return ((FeatureMap.Internal) getArtifactGroup()).getWrapper();
        case BpmnPackage.COLLABORATION__ARTIFACT:
            return getArtifact();
        case BpmnPackage.COLLABORATION__CONVERSATION:
            return getConversation();
        case BpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
            return getConversationAssociation();
        case BpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
            return getParticipantAssociation();
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
            return getMessageFlowAssociation();
        case BpmnPackage.COLLABORATION__CHOREOGRAPHY_REF:
            return getChoreographyRef();
        case BpmnPackage.COLLABORATION__IS_CLOSED:
            return isIsClosed();
        case BpmnPackage.COLLABORATION__NAME:
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
        case BpmnPackage.COLLABORATION__PARTICIPANT:
            getParticipant().clear();
            getParticipant().addAll((Collection<? extends Participant>) newValue);
            return;
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW:
            getMessageFlow().clear();
            getMessageFlow().addAll((Collection<? extends MessageFlow>) newValue);
            return;
        case BpmnPackage.COLLABORATION__ARTIFACT_GROUP:
            ((FeatureMap.Internal) getArtifactGroup()).set(newValue);
            return;
        case BpmnPackage.COLLABORATION__ARTIFACT:
            getArtifact().clear();
            getArtifact().addAll((Collection<? extends Artifact>) newValue);
            return;
        case BpmnPackage.COLLABORATION__CONVERSATION:
            getConversation().clear();
            getConversation().addAll((Collection<? extends Conversation>) newValue);
            return;
        case BpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
            getConversationAssociation().clear();
            getConversationAssociation().addAll((Collection<? extends ConversationAssociation>) newValue);
            return;
        case BpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
            getParticipantAssociation().clear();
            getParticipantAssociation().addAll((Collection<? extends ParticipantAssociation>) newValue);
            return;
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
            getMessageFlowAssociation().clear();
            getMessageFlowAssociation().addAll((Collection<? extends MessageFlowAssociation>) newValue);
            return;
        case BpmnPackage.COLLABORATION__CHOREOGRAPHY_REF:
            setChoreographyRef((QName) newValue);
            return;
        case BpmnPackage.COLLABORATION__IS_CLOSED:
            setIsClosed((Boolean) newValue);
            return;
        case BpmnPackage.COLLABORATION__NAME:
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
        case BpmnPackage.COLLABORATION__PARTICIPANT:
            getParticipant().clear();
            return;
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW:
            getMessageFlow().clear();
            return;
        case BpmnPackage.COLLABORATION__ARTIFACT_GROUP:
            getArtifactGroup().clear();
            return;
        case BpmnPackage.COLLABORATION__ARTIFACT:
            getArtifact().clear();
            return;
        case BpmnPackage.COLLABORATION__CONVERSATION:
            getConversation().clear();
            return;
        case BpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
            getConversationAssociation().clear();
            return;
        case BpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
            getParticipantAssociation().clear();
            return;
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
            getMessageFlowAssociation().clear();
            return;
        case BpmnPackage.COLLABORATION__CHOREOGRAPHY_REF:
            setChoreographyRef(CHOREOGRAPHY_REF_EDEFAULT);
            return;
        case BpmnPackage.COLLABORATION__IS_CLOSED:
            unsetIsClosed();
            return;
        case BpmnPackage.COLLABORATION__NAME:
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
        case BpmnPackage.COLLABORATION__PARTICIPANT:
            return participant != null && !participant.isEmpty();
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW:
            return messageFlow != null && !messageFlow.isEmpty();
        case BpmnPackage.COLLABORATION__ARTIFACT_GROUP:
            return artifactGroup != null && !artifactGroup.isEmpty();
        case BpmnPackage.COLLABORATION__ARTIFACT:
            return !getArtifact().isEmpty();
        case BpmnPackage.COLLABORATION__CONVERSATION:
            return conversation != null && !conversation.isEmpty();
        case BpmnPackage.COLLABORATION__CONVERSATION_ASSOCIATION:
            return conversationAssociation != null && !conversationAssociation.isEmpty();
        case BpmnPackage.COLLABORATION__PARTICIPANT_ASSOCIATION:
            return participantAssociation != null && !participantAssociation.isEmpty();
        case BpmnPackage.COLLABORATION__MESSAGE_FLOW_ASSOCIATION:
            return messageFlowAssociation != null && !messageFlowAssociation.isEmpty();
        case BpmnPackage.COLLABORATION__CHOREOGRAPHY_REF:
            return CHOREOGRAPHY_REF_EDEFAULT == null ? choreographyRef != null : !CHOREOGRAPHY_REF_EDEFAULT.equals(choreographyRef);
        case BpmnPackage.COLLABORATION__IS_CLOSED:
            return isSetIsClosed();
        case BpmnPackage.COLLABORATION__NAME:
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
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (artifactGroup: "); //$NON-NLS-1$
        result.append(artifactGroup);
        result.append(", choreographyRef: "); //$NON-NLS-1$
        result.append(choreographyRef);
        result.append(", isClosed: "); //$NON-NLS-1$
        if (isClosedESet)
            result.append(isClosed);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //CollaborationImpl
