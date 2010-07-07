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
 * A representation of the model object '<em><b>Global Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.GlobalChoreographyTask#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.bpmn.GlobalChoreographyTask#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.bpmn.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getGlobalChoreographyTask()
 * @model extendedMetaData="name='tGlobalChoreographyTask' kind='elementOnly'"
 * @generated
 */
public interface GlobalChoreographyTask extends CallableElement {
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
     * @see org.eclipse.bpmn.BpmnPackage#getGlobalChoreographyTask_Participant()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
     * @generated
     */
    List<Participant> getParticipant();

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
     * @see org.eclipse.bpmn.BpmnPackage#getGlobalChoreographyTask_MessageFlow()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageFlow' namespace='##targetNamespace'"
     * @generated
     */
    List<MessageFlow> getMessageFlow();

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
     * @see org.eclipse.bpmn.BpmnPackage#getGlobalChoreographyTask_InitiatingParticipantRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='initiatingParticipantRef'"
     * @generated
     */
    QName getInitiatingParticipantRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initiating Participant Ref</em>' attribute.
     * @see #getInitiatingParticipantRef()
     * @generated
     */
    void setInitiatingParticipantRef(QName value);

} // GlobalChoreographyTask
