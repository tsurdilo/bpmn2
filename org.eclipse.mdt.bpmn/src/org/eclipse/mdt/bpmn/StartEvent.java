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
 * A representation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.StartEvent#isIsInterrupting <em>Is Interrupting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getStartEvent()
 * @model extendedMetaData="name='tStartEvent' kind='elementOnly'"
 * @generated
 */
public interface StartEvent extends CatchEvent {
    /**
     * Returns the value of the '<em><b>Is Interrupting</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Interrupting</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Interrupting</em>' attribute.
     * @see #isSetIsInterrupting()
     * @see #unsetIsInterrupting()
     * @see #setIsInterrupting(boolean)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getStartEvent_IsInterrupting()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isInterrupting'"
     * @generated
     */
    boolean isIsInterrupting();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.StartEvent#isIsInterrupting <em>Is Interrupting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Interrupting</em>' attribute.
     * @see #isSetIsInterrupting()
     * @see #unsetIsInterrupting()
     * @see #isIsInterrupting()
     * @generated
     */
    void setIsInterrupting(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.StartEvent#isIsInterrupting <em>Is Interrupting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsInterrupting()
     * @see #isIsInterrupting()
     * @see #setIsInterrupting(boolean)
     * @generated
     */
    void unsetIsInterrupting();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.StartEvent#isIsInterrupting <em>Is Interrupting</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Interrupting</em>' attribute is set.
     * @see #unsetIsInterrupting()
     * @see #isIsInterrupting()
     * @see #setIsInterrupting(boolean)
     * @generated
     */
    boolean isSetIsInterrupting();

} // StartEvent
