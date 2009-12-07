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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.ConversationLink#getConversationRef <em>Conversation Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.ConversationLink#getParticipantRef <em>Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversationLink()
 * @model extendedMetaData="name='tConversationLink' kind='elementOnly'"
 * @generated
 */
public interface ConversationLink extends BaseElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Conversation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Ref</em>' attribute.
     * @see #setConversationRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversationLink_ConversationRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='conversationRef'"
     * @generated
     */
    QName getConversationRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.ConversationLink#getConversationRef <em>Conversation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conversation Ref</em>' attribute.
     * @see #getConversationRef()
     * @generated
     */
    void setConversationRef(QName value);

    /**
     * Returns the value of the '<em><b>Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Ref</em>' attribute.
     * @see #setParticipantRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversationLink_ParticipantRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='participantRef'"
     * @generated
     */
    QName getParticipantRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.ConversationLink#getParticipantRef <em>Participant Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participant Ref</em>' attribute.
     * @see #getParticipantRef()
     * @generated
     */
    void setParticipantRef(QName value);

} // ConversationLink
