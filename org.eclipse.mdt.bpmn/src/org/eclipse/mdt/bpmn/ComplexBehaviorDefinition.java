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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Behavior Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ComplexBehaviorDefinition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ComplexBehaviorDefinition#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getComplexBehaviorDefinition()
 * @model extendedMetaData="name='tComplexBehaviorDefinition' kind='elementOnly'"
 * @generated
 */
public interface ComplexBehaviorDefinition extends BaseElement {
    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(FormalExpression)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getComplexBehaviorDefinition_Condition()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
     * @generated
     */
    FormalExpression getCondition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ComplexBehaviorDefinition#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(FormalExpression value);

    /**
     * Returns the value of the '<em><b>Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event</em>' containment reference.
     * @see #setEvent(ImplicitThrowEvent)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getComplexBehaviorDefinition_Event()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
     * @generated
     */
    ImplicitThrowEvent getEvent();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ComplexBehaviorDefinition#getEvent <em>Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event</em>' containment reference.
     * @see #getEvent()
     * @generated
     */
    void setEvent(ImplicitThrowEvent value);

} // ComplexBehaviorDefinition
