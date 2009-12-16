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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Property#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Property#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Property#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getProperty()
 * @model extendedMetaData="name='tProperty' kind='elementOnly'"
 * @generated
 */
public interface Property extends BaseElement {
    /**
     * Returns the value of the '<em><b>Data State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data State</em>' containment reference.
     * @see #setDataState(DataState)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProperty_DataState()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataState' namespace='##targetNamespace'"
     * @generated
     */
    DataState getDataState();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Property#getDataState <em>Data State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data State</em>' containment reference.
     * @see #getDataState()
     * @generated
     */
    void setDataState(DataState value);

    /**
     * Returns the value of the '<em><b>Item Subject Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Item Subject Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Item Subject Ref</em>' attribute.
     * @see #setItemSubjectRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProperty_ItemSubjectRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='itemSubjectRef'"
     * @generated
     */
    QName getItemSubjectRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Property#getItemSubjectRef <em>Item Subject Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item Subject Ref</em>' attribute.
     * @see #getItemSubjectRef()
     * @generated
     */
    void setItemSubjectRef(QName value);

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
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProperty_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Property#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Property
