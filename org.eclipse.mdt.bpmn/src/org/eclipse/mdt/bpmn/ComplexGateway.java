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
 * $Id$
 */
package org.eclipse.mdt.bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ComplexGateway#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ComplexGateway#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getComplexGateway()
 * @model extendedMetaData="name='tComplexGateway' kind='elementOnly'"
 * @generated
 */
public interface ComplexGateway extends Gateway {
    /**
     * Returns the value of the '<em><b>Activation Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activation Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activation Condition</em>' containment reference.
     * @see #setActivationCondition(Expression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getComplexGateway_ActivationCondition()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='activationCondition' namespace='##targetNamespace'"
     * @generated
     */
    Expression getActivationCondition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ComplexGateway#getActivationCondition <em>Activation Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activation Condition</em>' containment reference.
     * @see #getActivationCondition()
     * @generated
     */
    void setActivationCondition(Expression value);

    /**
     * Returns the value of the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default</em>' attribute.
     * @see #setDefault(String)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getComplexGateway_Default()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='attribute' name='default'"
     * @generated
     */
    String getDefault();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ComplexGateway#getDefault <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' attribute.
     * @see #getDefault()
     * @generated
     */
    void setDefault(String value);

} // ComplexGateway
