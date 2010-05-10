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
 * A representation of the model object '<em><b>Sub Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.SubConversation#getConversationNodeGroup <em>Conversation Node Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.SubConversation#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.eclipse.bpmn.SubConversation#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.SubConversation#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.bpmn.SubConversation#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getSubConversation()
 * @model extendedMetaData="name='tSubConversation' kind='elementOnly'"
 * @generated
 */
public interface SubConversation extends ConversationNode {
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
     * @see org.eclipse.bpmn.BpmnPackage#getSubConversation_ConversationNodeGroup()
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
     * @see org.eclipse.bpmn.BpmnPackage#getSubConversation_ConversationNode()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='conversationNode' namespace='##targetNamespace' group='conversationNode:group'"
     * @generated
     */
    EList<ConversationNode> getConversationNode();

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
     * @see org.eclipse.bpmn.BpmnPackage#getSubConversation_ArtifactGroup()
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
     * @see org.eclipse.bpmn.BpmnPackage#getSubConversation_Artifact()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' group='artifact:group'"
     * @generated
     */
    EList<Artifact> getArtifact();

    /**
     * Returns the value of the '<em><b>Correlation Key Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Key Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Key Ref</em>' attribute.
     * @see #setCorrelationKeyRef(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getSubConversation_CorrelationKeyRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='correlationKeyRef'"
     * @generated
     */
    QName getCorrelationKeyRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.SubConversation#getCorrelationKeyRef <em>Correlation Key Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Key Ref</em>' attribute.
     * @see #getCorrelationKeyRef()
     * @generated
     */
    void setCorrelationKeyRef(QName value);

} // SubConversation
