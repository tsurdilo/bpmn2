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
 * A representation of the model object '<em><b>Choreography Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ChoreographyActivity#getParticipantRef <em>Participant Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getChoreographyActivity()
 * @model abstract="true"
 *        extendedMetaData="name='tChoreographyActivity' kind='elementOnly'"
 * @generated
 */
public interface ChoreographyActivity extends FlowNode {
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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getChoreographyActivity_ParticipantRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName" lower="2"
     *        extendedMetaData="kind='element' name='participantRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getParticipantRef();

    /**
     * Returns the value of the '<em><b>Initiating Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initiating Participant Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initiating Participant Ref</em>' attribute.
     * @see #setInitiatingParticipantRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getChoreographyActivity_InitiatingParticipantRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='initiatingParticipantRef'"
     * @generated
     */
    QName getInitiatingParticipantRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initiating Participant Ref</em>' attribute.
     * @see #getInitiatingParticipantRef()
     * @generated
     */
    void setInitiatingParticipantRef(QName value);

} // ChoreographyActivity
