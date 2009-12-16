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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.Artifact;
import org.eclipse.mdt.bpmn.Conversation;
import org.eclipse.mdt.bpmn.ConversationNode;
import org.eclipse.mdt.bpmn.CorrelationKey;
import org.eclipse.mdt.bpmn.MessageFlow;
import org.eclipse.mdt.bpmn.Participant;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationImpl#getConversationNodeGroup <em>Conversation Node Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationImpl#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationImpl#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ConversationImpl#getCorrelationKey <em>Correlation Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationImpl extends CallableElementImpl implements Conversation {
    /**
     * The cached value of the '{@link #getConversationNodeGroup() <em>Conversation Node Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationNodeGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap conversationNodeGroup;

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
     * The cached value of the '{@link #getArtifactGroup() <em>Artifact Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifactGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap artifactGroup;

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
     * The cached value of the '{@link #getMessageFlowRef() <em>Message Flow Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageFlowRef()
     * @generated
     * @ordered
     */
    protected EList<QName> messageFlowRef;

    /**
     * The cached value of the '{@link #getCorrelationKey() <em>Correlation Key</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationKey()
     * @generated
     * @ordered
     */
    protected EList<CorrelationKey> correlationKey;

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
        return bpmnPackage.eINSTANCE.getConversation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getConversationNodeGroup() {
        if (conversationNodeGroup == null) {
            conversationNodeGroup = new BasicFeatureMap(this, bpmnPackage.CONVERSATION__CONVERSATION_NODE_GROUP);
        }
        return conversationNodeGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConversationNode> getConversationNode() {
        return getConversationNodeGroup().list(bpmnPackage.eINSTANCE.getConversation_ConversationNode());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Participant> getParticipant() {
        if (participant == null) {
            participant = new EObjectContainmentEList<Participant>(Participant.class, this, bpmnPackage.CONVERSATION__PARTICIPANT);
        }
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getArtifactGroup() {
        if (artifactGroup == null) {
            artifactGroup = new BasicFeatureMap(this, bpmnPackage.CONVERSATION__ARTIFACT_GROUP);
        }
        return artifactGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Artifact> getArtifact() {
        return getArtifactGroup().list(bpmnPackage.eINSTANCE.getConversation_Artifact());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MessageFlow> getMessageFlow() {
        if (messageFlow == null) {
            messageFlow = new EObjectContainmentEList<MessageFlow>(MessageFlow.class, this, bpmnPackage.CONVERSATION__MESSAGE_FLOW);
        }
        return messageFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getMessageFlowRef() {
        if (messageFlowRef == null) {
            messageFlowRef = new EDataTypeEList<QName>(QName.class, this, bpmnPackage.CONVERSATION__MESSAGE_FLOW_REF);
        }
        return messageFlowRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CorrelationKey> getCorrelationKey() {
        if (correlationKey == null) {
            correlationKey = new EObjectContainmentEList<CorrelationKey>(CorrelationKey.class, this, bpmnPackage.CONVERSATION__CORRELATION_KEY);
        }
        return correlationKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE_GROUP:
                return ((InternalEList<?>)getConversationNodeGroup()).basicRemove(otherEnd, msgs);
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE:
                return ((InternalEList<?>)getConversationNode()).basicRemove(otherEnd, msgs);
            case bpmnPackage.CONVERSATION__PARTICIPANT:
                return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
            case bpmnPackage.CONVERSATION__ARTIFACT_GROUP:
                return ((InternalEList<?>)getArtifactGroup()).basicRemove(otherEnd, msgs);
            case bpmnPackage.CONVERSATION__ARTIFACT:
                return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
            case bpmnPackage.CONVERSATION__MESSAGE_FLOW:
                return ((InternalEList<?>)getMessageFlow()).basicRemove(otherEnd, msgs);
            case bpmnPackage.CONVERSATION__CORRELATION_KEY:
                return ((InternalEList<?>)getCorrelationKey()).basicRemove(otherEnd, msgs);
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
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE_GROUP:
                if (coreType) return getConversationNodeGroup();
                return ((FeatureMap.Internal)getConversationNodeGroup()).getWrapper();
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE:
                return getConversationNode();
            case bpmnPackage.CONVERSATION__PARTICIPANT:
                return getParticipant();
            case bpmnPackage.CONVERSATION__ARTIFACT_GROUP:
                if (coreType) return getArtifactGroup();
                return ((FeatureMap.Internal)getArtifactGroup()).getWrapper();
            case bpmnPackage.CONVERSATION__ARTIFACT:
                return getArtifact();
            case bpmnPackage.CONVERSATION__MESSAGE_FLOW:
                return getMessageFlow();
            case bpmnPackage.CONVERSATION__MESSAGE_FLOW_REF:
                return getMessageFlowRef();
            case bpmnPackage.CONVERSATION__CORRELATION_KEY:
                return getCorrelationKey();
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
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE_GROUP:
                ((FeatureMap.Internal)getConversationNodeGroup()).set(newValue);
                return;
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE:
                getConversationNode().clear();
                getConversationNode().addAll((Collection<? extends ConversationNode>)newValue);
                return;
            case bpmnPackage.CONVERSATION__PARTICIPANT:
                getParticipant().clear();
                getParticipant().addAll((Collection<? extends Participant>)newValue);
                return;
            case bpmnPackage.CONVERSATION__ARTIFACT_GROUP:
                ((FeatureMap.Internal)getArtifactGroup()).set(newValue);
                return;
            case bpmnPackage.CONVERSATION__ARTIFACT:
                getArtifact().clear();
                getArtifact().addAll((Collection<? extends Artifact>)newValue);
                return;
            case bpmnPackage.CONVERSATION__MESSAGE_FLOW:
                getMessageFlow().clear();
                getMessageFlow().addAll((Collection<? extends MessageFlow>)newValue);
                return;
            case bpmnPackage.CONVERSATION__MESSAGE_FLOW_REF:
                getMessageFlowRef().clear();
                getMessageFlowRef().addAll((Collection<? extends QName>)newValue);
                return;
            case bpmnPackage.CONVERSATION__CORRELATION_KEY:
                getCorrelationKey().clear();
                getCorrelationKey().addAll((Collection<? extends CorrelationKey>)newValue);
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
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE_GROUP:
                getConversationNodeGroup().clear();
                return;
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE:
                getConversationNode().clear();
                return;
            case bpmnPackage.CONVERSATION__PARTICIPANT:
                getParticipant().clear();
                return;
            case bpmnPackage.CONVERSATION__ARTIFACT_GROUP:
                getArtifactGroup().clear();
                return;
            case bpmnPackage.CONVERSATION__ARTIFACT:
                getArtifact().clear();
                return;
            case bpmnPackage.CONVERSATION__MESSAGE_FLOW:
                getMessageFlow().clear();
                return;
            case bpmnPackage.CONVERSATION__MESSAGE_FLOW_REF:
                getMessageFlowRef().clear();
                return;
            case bpmnPackage.CONVERSATION__CORRELATION_KEY:
                getCorrelationKey().clear();
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
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE_GROUP:
                return conversationNodeGroup != null && !conversationNodeGroup.isEmpty();
            case bpmnPackage.CONVERSATION__CONVERSATION_NODE:
                return !getConversationNode().isEmpty();
            case bpmnPackage.CONVERSATION__PARTICIPANT:
                return participant != null && !participant.isEmpty();
            case bpmnPackage.CONVERSATION__ARTIFACT_GROUP:
                return artifactGroup != null && !artifactGroup.isEmpty();
            case bpmnPackage.CONVERSATION__ARTIFACT:
                return !getArtifact().isEmpty();
            case bpmnPackage.CONVERSATION__MESSAGE_FLOW:
                return messageFlow != null && !messageFlow.isEmpty();
            case bpmnPackage.CONVERSATION__MESSAGE_FLOW_REF:
                return messageFlowRef != null && !messageFlowRef.isEmpty();
            case bpmnPackage.CONVERSATION__CORRELATION_KEY:
                return correlationKey != null && !correlationKey.isEmpty();
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
        result.append(" (conversationNodeGroup: "); //$NON-NLS-1$
        result.append(conversationNodeGroup);
        result.append(", artifactGroup: "); //$NON-NLS-1$
        result.append(artifactGroup);
        result.append(", messageFlowRef: "); //$NON-NLS-1$
        result.append(messageFlowRef);
        result.append(')');
        return result.toString();
    }

} //ConversationImpl
