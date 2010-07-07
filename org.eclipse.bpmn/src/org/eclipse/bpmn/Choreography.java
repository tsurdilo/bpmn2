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

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.Choreography#getFlowElementGroups <em>Flow Element Groups</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#getArtifactGroups <em>Artifact Groups</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#getMessageFlows <em>Message Flows</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#getConversations <em>Conversations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#getConversationAssociations <em>Conversation Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#getMessageFlowAssociations <em>Message Flow Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Choreography#isIsClosed <em>Is Closed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getChoreography()
 * @model extendedMetaData="name='tChoreography' kind='elementOnly'"
 * @generated
 */
public interface Choreography extends CallableElement {
    /**
     * Returns the value of the '<em><b>Flow Element Groups</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element Groups</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element Groups</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_FlowElementGroups()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='flowElement:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getFlowElementGroups();

    /**
     * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.FlowElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Elements</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_FlowElements()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flowElement' namespace='##targetNamespace' group='flowElement:group'"
     * @generated
     */
    List<FlowElement> getFlowElements();

    /**
     * Returns the value of the '<em><b>Artifact Groups</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact Groups</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact Groups</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_ArtifactGroups()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='artifact:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getArtifactGroups();

    /**
     * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Artifact}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifacts</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_Artifacts()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' group='artifact:group'"
     * @generated
     */
    List<Artifact> getArtifacts();

    /**
     * Returns the value of the '<em><b>Message Flows</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.MessageFlow}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flows</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flows</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_MessageFlows()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageFlow' namespace='##targetNamespace'"
     * @generated
     */
    List<MessageFlow> getMessageFlows();

    /**
     * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Participant}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participants</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_Participants()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
     * @generated
     */
    List<Participant> getParticipants();

    /**
     * Returns the value of the '<em><b>Conversations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Conversation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversations</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_Conversations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='conversation' namespace='##targetNamespace'"
     * @generated
     */
    List<Conversation> getConversations();

    /**
     * Returns the value of the '<em><b>Conversation Associations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.ConversationAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Associations</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_ConversationAssociations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='conversationAssociation' namespace='##targetNamespace'"
     * @generated
     */
    List<ConversationAssociation> getConversationAssociations();

    /**
     * Returns the value of the '<em><b>Message Flow Associations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.MessageFlowAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flow Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flow Associations</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_MessageFlowAssociations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageFlowAssociation' namespace='##targetNamespace'"
     * @generated
     */
    List<MessageFlowAssociation> getMessageFlowAssociations();

    /**
     * Returns the value of the '<em><b>Participant Associations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.ParticipantAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Associations</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_ParticipantAssociations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='participantAssociation' namespace='##targetNamespace'"
     * @generated
     */
    List<ParticipantAssociation> getParticipantAssociations();

    /**
     * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Closed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Closed</em>' attribute.
     * @see #isSetIsClosed()
     * @see #unsetIsClosed()
     * @see #setIsClosed(boolean)
     * @see org.eclipse.bpmn.BpmnPackage#getChoreography_IsClosed()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isClosed'"
     * @generated
     */
    boolean isIsClosed();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Choreography#isIsClosed <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Closed</em>' attribute.
     * @see #isSetIsClosed()
     * @see #unsetIsClosed()
     * @see #isIsClosed()
     * @generated
     */
    void setIsClosed(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.bpmn.Choreography#isIsClosed <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsClosed()
     * @see #isIsClosed()
     * @see #setIsClosed(boolean)
     * @generated
     */
    void unsetIsClosed();

    /**
     * Returns whether the value of the '{@link org.eclipse.bpmn.Choreography#isIsClosed <em>Is Closed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Closed</em>' attribute is set.
     * @see #unsetIsClosed()
     * @see #isIsClosed()
     * @see #setIsClosed(boolean)
     * @generated
     */
    boolean isSetIsClosed();

} // Choreography
