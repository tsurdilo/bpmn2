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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.CallConversation#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.CallConversation#getCalledElementRef <em>Called Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getCallConversation()
 * @model extendedMetaData="name='tCallConversation' kind='elementOnly'"
 * @generated
 */
public interface CallConversation extends ConversationNode {
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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCallConversation_ParticipantAssociation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='participantAssociation' namespace='##targetNamespace'"
     * @generated
     */
    EList<ParticipantAssociation> getParticipantAssociation();

    /**
     * Returns the value of the '<em><b>Called Element Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Called Element Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Called Element Ref</em>' attribute.
     * @see #setCalledElementRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCallConversation_CalledElementRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='calledElementRef'"
     * @generated
     */
    QName getCalledElementRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.CallConversation#getCalledElementRef <em>Called Element Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Called Element Ref</em>' attribute.
     * @see #getCalledElementRef()
     * @generated
     */
    void setCalledElementRef(QName value);

} // CallConversation
