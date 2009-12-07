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
 * A representation of the model object '<em><b>Conversation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.ConversationView#getConversationRef <em>Conversation Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.ConversationView#getConversationLink <em>Conversation Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversationView()
 * @model extendedMetaData="name='tConversationView' kind='elementOnly'"
 * @generated
 */
public interface ConversationView extends Collaboration {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Conversation Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversationView_ConversationRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName" lower="2"
     *        extendedMetaData="kind='element' name='conversationRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getConversationRef();

    /**
     * Returns the value of the '<em><b>Conversation Link</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.ConversationLink}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conversation Link</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conversation Link</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getConversationView_ConversationLink()
     * @model containment="true" lower="2"
     *        extendedMetaData="kind='element' name='conversationLink' namespace='##targetNamespace'"
     * @generated
     */
    EList<ConversationLink> getConversationLink();

} // ConversationView
