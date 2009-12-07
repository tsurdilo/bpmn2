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
package org.eclipse.mdt.bpmn2;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.Conversation#getChildConversationRef <em>Child Conversation Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Conversation#getParticipantRef <em>Participant Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Conversation#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Conversation#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversation()
 * @model extendedMetaData="name='tConversation' kind='elementOnly'"
 * @generated
 */
public interface Conversation extends RootElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Child Conversation Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Conversation Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child Conversation Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversation_ChildConversationRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='childConversationRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getChildConversationRef();

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversation_ParticipantRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName" lower="2"
     *        extendedMetaData="kind='element' name='participantRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getParticipantRef();

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversation_MessageFlowRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='messageFlowRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getMessageFlowRef();

    /**
     * Returns the value of the '<em><b>Correlation Key Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Key Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Key Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversation_CorrelationKeyRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='correlationKeyRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getCorrelationKeyRef();

} // Conversation
