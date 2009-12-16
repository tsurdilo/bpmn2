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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Interface#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Interface#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getInterface()
 * @model extendedMetaData="name='tInterface' kind='elementOnly'"
 * @generated
 */
public interface Interface extends RootElement {
    /**
     * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.Operation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getInterface_Operation()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
     * @generated
     */
    EList<Operation> getOperation();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getInterface_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Interface#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Interface
