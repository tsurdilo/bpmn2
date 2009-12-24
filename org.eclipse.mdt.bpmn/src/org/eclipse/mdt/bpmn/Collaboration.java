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
package org.eclipse.mdt.bpmn;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getConversation <em>Conversation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getChoreographyRef <em>Choreography Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Collaboration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration()
 * @model extendedMetaData="name='tCollaboration' kind='elementOnly'"
 * @generated
 */
public interface Collaboration extends RootElement {
    /**
     * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.Participant}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_Participant()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
     * @generated
     */
    EList<Participant> getParticipant();

    /**
     * Returns the value of the '<em><b>Message Flow</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.MessageFlow}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flow</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flow</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_MessageFlow()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageFlow' namespace='##targetNamespace'"
     * @generated
     */
    EList<MessageFlow> getMessageFlow();

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_ArtifactGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='artifact:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getArtifactGroup();

    /**
     * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.Artifact}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_Artifact()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' group='artifact:group'"
     * @generated
     */
    EList<Artifact> getArtifact();

    /**
     * Returns the value of the '<em><b>Conversation</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.Conversation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_Conversation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='conversation' namespace='##targetNamespace'"
     * @generated
     */
    EList<Conversation> getConversation();

    /**
     * Returns the value of the '<em><b>Conversation Association</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.ConversationAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Association</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_ConversationAssociation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='conversationAssociation' namespace='##targetNamespace'"
     * @generated
     */
    EList<ConversationAssociation> getConversationAssociation();

    /**
     * Returns the value of the '<em><b>Participant Association</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.ParticipantAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Association</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_ParticipantAssociation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='participantAssociation' namespace='##targetNamespace'"
     * @generated
     */
    EList<ParticipantAssociation> getParticipantAssociation();

    /**
     * Returns the value of the '<em><b>Message Flow Association</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.MessageFlowAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flow Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flow Association</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_MessageFlowAssociation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageFlowAssociation' namespace='##targetNamespace'"
     * @generated
     */
    EList<MessageFlowAssociation> getMessageFlowAssociation();

    /**
     * Returns the value of the '<em><b>Choreography Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Choreography Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Choreography Ref</em>' attribute.
     * @see #setChoreographyRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_ChoreographyRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='choreographyRef'"
     * @generated
     */
    QName getChoreographyRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Collaboration#getChoreographyRef <em>Choreography Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choreography Ref</em>' attribute.
     * @see #getChoreographyRef()
     * @generated
     */
    void setChoreographyRef(QName value);

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_IsClosed()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isClosed'"
     * @generated
     */
    boolean isIsClosed();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Collaboration#isIsClosed <em>Is Closed</em>}' attribute.
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
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.Collaboration#isIsClosed <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsClosed()
     * @see #isIsClosed()
     * @see #setIsClosed(boolean)
     * @generated
     */
    void unsetIsClosed();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.Collaboration#isIsClosed <em>Is Closed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Closed</em>' attribute is set.
     * @see #unsetIsClosed()
     * @see #isIsClosed()
     * @see #setIsClosed(boolean)
     * @generated
     */
    boolean isSetIsClosed();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCollaboration_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Collaboration#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Collaboration
