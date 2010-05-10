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
package org.eclipse.bpmn;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.Conversation#getConversationNodeGroup <em>Conversation Node Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Conversation#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Conversation#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Conversation#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Conversation#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Conversation#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Conversation#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Conversation#getCorrelationKey <em>Correlation Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getConversation()
 * @model extendedMetaData="name='tConversation' kind='elementOnly'"
 * @generated
 */
public interface Conversation extends CallableElement {
    /**
     * Returns the value of the '<em><b>Conversation Node Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Node Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Node Group</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getConversation_ConversationNodeGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='conversationNode:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getConversationNodeGroup();

    /**
     * Returns the value of the '<em><b>Conversation Node</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.ConversationNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Node</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Node</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getConversation_ConversationNode()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='conversationNode' namespace='##targetNamespace' group='conversationNode:group'"
     * @generated
     */
    EList<ConversationNode> getConversationNode();

    /**
     * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Participant}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getConversation_Participant()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
     * @generated
     */
    EList<Participant> getParticipant();

    /**
     * Returns the value of the '<em><b>Artifact Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact Group</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getConversation_ArtifactGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='artifact:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getArtifactGroup();

    /**
     * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Artifact}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getConversation_Artifact()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' group='artifact:group'"
     * @generated
     */
    EList<Artifact> getArtifact();

    /**
     * Returns the value of the '<em><b>Message Flow</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.MessageFlow}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flow</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flow</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getConversation_MessageFlow()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageFlow' namespace='##targetNamespace'"
     * @generated
     */
    EList<MessageFlow> getMessageFlow();

    /**
     * Returns the value of the '<em><b>Message Flow Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flow Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flow Ref</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getConversation_MessageFlowRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='messageFlowRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getMessageFlowRef();

    /**
     * Returns the value of the '<em><b>Correlation Key</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.CorrelationKey}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Key</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Key</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getConversation_CorrelationKey()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='correlationKey' namespace='##targetNamespace'"
     * @generated
     */
    EList<CorrelationKey> getCorrelationKey();

} // Conversation
