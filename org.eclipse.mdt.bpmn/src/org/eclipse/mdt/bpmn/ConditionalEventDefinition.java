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
 * A representation of the model object '<em><b>Conditional Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ConditionalEventDefinition#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getConditionalEventDefinition()
 * @model extendedMetaData="name='tConditionalEventDefinition' kind='elementOnly'"
 * @generated
 */
public interface ConditionalEventDefinition extends EventDefinition {
    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(Expression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getConditionalEventDefinition_Condition()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
     * @generated
     */
    Expression getCondition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ConditionalEventDefinition#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(Expression value);

} // ConditionalEventDefinition
