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
import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.ConversationNode#getParticipantRef <em>Participant Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.ConversationNode#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getConversationNode()
 * @model abstract="true"
 *        extendedMetaData="name='tConversationNode' kind='elementOnly'"
 * @generated
 */
public interface ConversationNode extends BaseElement {
    /**
     * Returns the value of the '<em><b>Participant Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Ref</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getConversationNode_ParticipantRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='participantRef' namespace='##targetNamespace'"
     * @generated
     */
    List<QName> getParticipantRef();

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
     * @see org.eclipse.bpmn.BpmnPackage#getConversationNode_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.ConversationNode#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ConversationNode
