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
 * A representation of the model object '<em><b>Data Store Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.DataStoreReference#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.bpmn.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.DataStoreReference#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getDataStoreReference()
 * @model extendedMetaData="name='tDataStoreReference' kind='elementOnly'"
 * @generated
 */
public interface DataStoreReference extends FlowElement {
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
     * @see org.eclipse.bpmn.BpmnPackage#getDataStoreReference_DataState()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataState' namespace='##targetNamespace'"
     * @generated
     */
    DataState getDataState();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.DataStoreReference#getDataState <em>Data State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data State</em>' containment reference.
     * @see #getDataState()
     * @generated
     */
    void setDataState(DataState value);

    /**
     * Returns the value of the '<em><b>Data Store Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Store Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Store Ref</em>' attribute.
     * @see #setDataStoreRef(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getDataStoreReference_DataStoreRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='dataStoreRef'"
     * @generated
     */
    QName getDataStoreRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Store Ref</em>' attribute.
     * @see #getDataStoreRef()
     * @generated
     */
    void setDataStoreRef(QName value);

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
     * @see org.eclipse.bpmn.BpmnPackage#getDataStoreReference_ItemSubjectRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='itemSubjectRef'"
     * @generated
     */
    QName getItemSubjectRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.DataStoreReference#getItemSubjectRef <em>Item Subject Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item Subject Ref</em>' attribute.
     * @see #getItemSubjectRef()
     * @generated
     */
    void setItemSubjectRef(QName value);

} // DataStoreReference
