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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.ComplexGateway#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.ComplexGateway#getResetSequenceFlow <em>Reset Sequence Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getComplexGateway()
 * @model extendedMetaData="name='tComplexGateway' kind='elementOnly'"
 * @generated
 */
public interface ComplexGateway extends Gateway {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getComplexGateway_ActivationCondition()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='activationCondition' namespace='##targetNamespace'"
     * @generated
     */
    Expression getActivationCondition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.ComplexGateway#getActivationCondition <em>Activation Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activation Condition</em>' containment reference.
     * @see #getActivationCondition()
     * @generated
     */
    void setActivationCondition(Expression value);

    /**
     * Returns the value of the '<em><b>Reset Sequence Flow</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reset Sequence Flow</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reset Sequence Flow</em>' attribute.
     * @see #setResetSequenceFlow(String)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getComplexGateway_ResetSequenceFlow()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='attribute' name='resetSequenceFlow'"
     * @generated
     */
    String getResetSequenceFlow();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.ComplexGateway#getResetSequenceFlow <em>Reset Sequence Flow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reset Sequence Flow</em>' attribute.
     * @see #getResetSequenceFlow()
     * @generated
     */
    void setResetSequenceFlow(String value);

} // ComplexGateway
