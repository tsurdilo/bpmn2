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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escalation Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.EscalationEventDefinition#getEscalationCode <em>Escalation Code</em>}</li>
 *   <li>{@link org.eclipse.bpmn.EscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getEscalationEventDefinition()
 * @model extendedMetaData="name='tEscalationEventDefinition' kind='elementOnly'"
 * @generated
 */
public interface EscalationEventDefinition extends EventDefinition {
    /**
     * Returns the value of the '<em><b>Escalation Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Escalation Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Escalation Code</em>' attribute.
     * @see #setEscalationCode(String)
     * @see org.eclipse.bpmn.BpmnPackage#getEscalationEventDefinition_EscalationCode()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='escalationCode'"
     * @generated
     */
    String getEscalationCode();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.EscalationEventDefinition#getEscalationCode <em>Escalation Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Escalation Code</em>' attribute.
     * @see #getEscalationCode()
     * @generated
     */
    void setEscalationCode(String value);

    /**
     * Returns the value of the '<em><b>Escalation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Escalation Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Escalation Ref</em>' attribute.
     * @see #setEscalationRef(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getEscalationEventDefinition_EscalationRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='escalationRef'"
     * @generated
     */
    QName getEscalationRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.EscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Escalation Ref</em>' attribute.
     * @see #getEscalationRef()
     * @generated
     */
    void setEscalationRef(QName value);

} // EscalationEventDefinition
