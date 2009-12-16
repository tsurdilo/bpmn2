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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Operation#getInMessageRef <em>In Message Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Operation#getOutMessageRef <em>Out Message Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Operation#getErrorRef <em>Error Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Operation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getOperation()
 * @model extendedMetaData="name='tOperation' kind='elementOnly'"
 * @generated
 */
public interface Operation extends BaseElement {
    /**
     * Returns the value of the '<em><b>In Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Message Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Message Ref</em>' attribute.
     * @see #setInMessageRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getOperation_InMessageRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='element' name='inMessageRef' namespace='##targetNamespace'"
     * @generated
     */
    QName getInMessageRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Operation#getInMessageRef <em>In Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Message Ref</em>' attribute.
     * @see #getInMessageRef()
     * @generated
     */
    void setInMessageRef(QName value);

    /**
     * Returns the value of the '<em><b>Out Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Out Message Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Out Message Ref</em>' attribute.
     * @see #setOutMessageRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getOperation_OutMessageRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='outMessageRef' namespace='##targetNamespace'"
     * @generated
     */
    QName getOutMessageRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Operation#getOutMessageRef <em>Out Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Message Ref</em>' attribute.
     * @see #getOutMessageRef()
     * @generated
     */
    void setOutMessageRef(QName value);

    /**
     * Returns the value of the '<em><b>Error Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getOperation_ErrorRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='errorRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getErrorRef();

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
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getOperation_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Operation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Operation
