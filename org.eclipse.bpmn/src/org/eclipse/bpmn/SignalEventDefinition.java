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
 * A representation of the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.SignalEventDefinition#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getSignalEventDefinition()
 * @model extendedMetaData="name='tSignalEventDefinition' kind='elementOnly'"
 * @generated
 */
public interface SignalEventDefinition extends EventDefinition {
    /**
     * Returns the value of the '<em><b>Signal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Signal</em>' attribute.
     * @see #setSignal(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getSignalEventDefinition_Signal()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='signalRef'"
     * @generated
     */
    QName getSignal();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.SignalEventDefinition#getSignal <em>Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal</em>' attribute.
     * @see #getSignal()
     * @generated
     */
    void setSignal(QName value);

} // SignalEventDefinition
