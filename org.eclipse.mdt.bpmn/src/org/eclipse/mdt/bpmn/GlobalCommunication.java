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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.GlobalCommunication#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.GlobalCommunication#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.GlobalCommunication#getCorrelationKey <em>Correlation Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getGlobalCommunication()
 * @model extendedMetaData="name='tGlobalCommunication' kind='elementOnly'"
 * @generated
 */
public interface GlobalCommunication extends CallableElement {
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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getGlobalCommunication_Participant()
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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getGlobalCommunication_MessageFlow()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageFlow' namespace='##targetNamespace'"
     * @generated
     */
    EList<MessageFlow> getMessageFlow();

    /**
     * Returns the value of the '<em><b>Correlation Key</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.CorrelationKey}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Key</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Key</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getGlobalCommunication_CorrelationKey()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='correlationKey' namespace='##targetNamespace'"
     * @generated
     */
    EList<CorrelationKey> getCorrelationKey();

} // GlobalCommunication
