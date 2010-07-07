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
import org.eclipse.bpmn.Artifact;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.Choreography;
import org.eclipse.bpmn.Conversation;
import org.eclipse.bpmn.ConversationAssociation;
import org.eclipse.bpmn.FlowElement;
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
 * An implementation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getFlowElementGroups <em>Flow Element Groups</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getArtifactGroups <em>Artifact Groups</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getMessageFlows <em>Message Flows</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getConversations <em>Conversations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getConversationAssociations <em>Conversation Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getMessageFlowAssociations <em>Message Flow Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ChoreographyImpl#isIsClosed <em>Is Closed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoreographyImpl extends CallableElementImpl implements Choreography {
    /**
     * The cached value of the '{@link #getFlowElementGroups() <em>Flow Element Groups</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowElementGroups()
     * @generated
     * @ordered
     */
    protected FeatureMap flowElementGroups;

    /**
     * The cached value of the '{@link #getArtifactGroups() <em>Artifact Groups</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifactGroups()
     * @generated
     * @ordered
     */
    protected FeatureMap artifactGroups;

    /**
     * The cached value of the '{@link #getMessageFlows() <em>Message Flows</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlows()
     * @generated
     * @ordered
     */
    protected EList<MessageFlow> messageFlows;

    /**
     * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipants()
     * @generated
     * @ordered
     */
    protected EList<Participant> participants;

    /**
     * The cached value of the '{@link #getConversations() <em>Conversations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversations()
     * @generated
     * @ordered
     */
    protected EList<Conversation> conversations;

    /**
     * The cached value of the '{@link #getConversationAssociations() <em>Conversation Associations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationAssociations()
     * @generated
     * @ordered
     */
    protected EList<ConversationAssociation> conversationAssociations;

    /**
     * The cached value of the '{@link #getMessageFlowAssociations() <em>Message Flow Associations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlowAssociations()
     * @generated
     * @ordered
     */
    protected EList<MessageFlowAssociation> messageFlowAssociations;

    /**
     * The cached value of the '{@link #getParticipantAssociations() <em>Participant Associations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantAssociations()
     * @generated
     * @ordered
     */
    protected EList<ParticipantAssociation> participantAssociations;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChoreographyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getChoreography();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFlowElementGroups() {
        if (flowElementGroups == null) {
            flowElementGroups = new BasicFeatureMap(this, BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUPS);
        }
        return flowElementGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<FlowElement> getFlowElements() {
        return getFlowElementGroups().list(BpmnPackage.eINSTANCE.getChoreography_FlowElements());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getArtifactGroups() {
        if (artifactGroups == null) {
            artifactGroups = new BasicFeatureMap(this, BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUPS);
        }
        return artifactGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Artifact> getArtifacts() {
        return getArtifactGroups().list(BpmnPackage.eINSTANCE.getChoreography_Artifacts());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<MessageFlow> getMessageFlows() {
        if (messageFlows == null) {
            messageFlows = new EObjectContainmentEList<MessageFlow>(MessageFlow.class, this, BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOWS);
        }
        return messageFlows;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Participant> getParticipants() {
        if (participants == null) {
            participants = new EObjectContainmentEList<Participant>(Participant.class, this, BpmnPackage.CHOREOGRAPHY__PARTICIPANTS);
        }
        return participants;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Conversation> getConversations() {
        if (conversations == null) {
            conversations = new EObjectContainmentEList<Conversation>(Conversation.class, this, BpmnPackage.CHOREOGRAPHY__CONVERSATIONS);
        }
        return conversations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<ConversationAssociation> getConversationAssociations() {
        if (conversationAssociations == null) {
            conversationAssociations = new EObjectContainmentEList<ConversationAssociation>(ConversationAssociation.class, this,
                    BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS);
        }
        return conversationAssociations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<MessageFlowAssociation> getMessageFlowAssociations() {
        if (messageFlowAssociations == null) {
            messageFlowAssociations = new EObjectContainmentEList<MessageFlowAssociation>(MessageFlowAssociation.class, this,
                    BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS);
        }
        return messageFlowAssociations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<ParticipantAssociation> getParticipantAssociations() {
        if (participantAssociations == null) {
            participantAssociations = new EObjectContainmentEList<ParticipantAssociation>(ParticipantAssociation.class, this,
                    BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS);
        }
        return participantAssociations;
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.CHOREOGRAPHY__IS_CLOSED, oldIsClosed, isClosed, !oldIsClosedESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.CHOREOGRAPHY__IS_CLOSED, oldIsClosed, IS_CLOSED_EDEFAULT, oldIsClosedESet));
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
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUPS:
            return ((InternalEList<?>) getFlowElementGroups()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
            return ((InternalEList<?>) getFlowElements()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUPS:
            return ((InternalEList<?>) getArtifactGroups()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__ARTIFACTS:
            return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOWS:
            return ((InternalEList<?>) getMessageFlows()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANTS:
            return ((InternalEList<?>) getParticipants()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__CONVERSATIONS:
            return ((InternalEList<?>) getConversations()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS:
            return ((InternalEList<?>) getConversationAssociations()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS:
            return ((InternalEList<?>) getMessageFlowAssociations()).basicRemove(otherEnd, msgs);
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
            return ((InternalEList<?>) getParticipantAssociations()).basicRemove(otherEnd, msgs);
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
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUPS:
            if (coreType)
                return getFlowElementGroups();
            return ((FeatureMap.Internal) getFlowElementGroups()).getWrapper();
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
            return getFlowElements();
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUPS:
            if (coreType)
                return getArtifactGroups();
            return ((FeatureMap.Internal) getArtifactGroups()).getWrapper();
        case BpmnPackage.CHOREOGRAPHY__ARTIFACTS:
            return getArtifacts();
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOWS:
            return getMessageFlows();
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANTS:
            return getParticipants();
        case BpmnPackage.CHOREOGRAPHY__CONVERSATIONS:
            return getConversations();
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS:
            return getConversationAssociations();
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS:
            return getMessageFlowAssociations();
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
            return getParticipantAssociations();
        case BpmnPackage.CHOREOGRAPHY__IS_CLOSED:
            return isIsClosed();
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
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUPS:
            ((FeatureMap.Internal) getFlowElementGroups()).set(newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
            getFlowElements().clear();
            getFlowElements().addAll((Collection<? extends FlowElement>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUPS:
            ((FeatureMap.Internal) getArtifactGroups()).set(newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__ARTIFACTS:
            getArtifacts().clear();
            getArtifacts().addAll((Collection<? extends Artifact>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOWS:
            getMessageFlows().clear();
            getMessageFlows().addAll((Collection<? extends MessageFlow>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANTS:
            getParticipants().clear();
            getParticipants().addAll((Collection<? extends Participant>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__CONVERSATIONS:
            getConversations().clear();
            getConversations().addAll((Collection<? extends Conversation>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS:
            getConversationAssociations().clear();
            getConversationAssociations().addAll((Collection<? extends ConversationAssociation>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS:
            getMessageFlowAssociations().clear();
            getMessageFlowAssociations().addAll((Collection<? extends MessageFlowAssociation>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
            getParticipantAssociations().clear();
            getParticipantAssociations().addAll((Collection<? extends ParticipantAssociation>) newValue);
            return;
        case BpmnPackage.CHOREOGRAPHY__IS_CLOSED:
            setIsClosed((Boolean) newValue);
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
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUPS:
            getFlowElementGroups().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
            getFlowElements().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUPS:
            getArtifactGroups().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__ARTIFACTS:
            getArtifacts().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOWS:
            getMessageFlows().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANTS:
            getParticipants().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__CONVERSATIONS:
            getConversations().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS:
            getConversationAssociations().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS:
            getMessageFlowAssociations().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
            getParticipantAssociations().clear();
            return;
        case BpmnPackage.CHOREOGRAPHY__IS_CLOSED:
            unsetIsClosed();
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
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENT_GROUPS:
            return flowElementGroups != null && !flowElementGroups.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__FLOW_ELEMENTS:
            return !getFlowElements().isEmpty();
        case BpmnPackage.CHOREOGRAPHY__ARTIFACT_GROUPS:
            return artifactGroups != null && !artifactGroups.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__ARTIFACTS:
            return !getArtifacts().isEmpty();
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOWS:
            return messageFlows != null && !messageFlows.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANTS:
            return participants != null && !participants.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__CONVERSATIONS:
            return conversations != null && !conversations.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS:
            return conversationAssociations != null && !conversationAssociations.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS:
            return messageFlowAssociations != null && !messageFlowAssociations.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS:
            return participantAssociations != null && !participantAssociations.isEmpty();
        case BpmnPackage.CHOREOGRAPHY__IS_CLOSED:
            return isSetIsClosed();
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
        result.append(" (flowElementGroups: "); //$NON-NLS-1$
        result.append(flowElementGroups);
        result.append(", artifactGroups: "); //$NON-NLS-1$
        result.append(artifactGroups);
        result.append(", isClosed: "); //$NON-NLS-1$
        if (isClosedESet)
            result.append(isClosed);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //ChoreographyImpl
