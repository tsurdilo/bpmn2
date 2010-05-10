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

import java.math.BigInteger;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.DataStore#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.bpmn.DataStore#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.eclipse.bpmn.DataStore#isIsUnlimited <em>Is Unlimited</em>}</li>
 *   <li>{@link org.eclipse.bpmn.DataStore#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.DataStore#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getDataStore()
 * @model extendedMetaData="name='tDataStore' kind='elementOnly'"
 * @generated
 */
public interface DataStore extends RootElement {
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
     * @see org.eclipse.bpmn.BpmnPackage#getDataStore_DataState()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataState' namespace='##targetNamespace'"
     * @generated
     */
    DataState getDataState();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.DataStore#getDataState <em>Data State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data State</em>' containment reference.
     * @see #getDataState()
     * @generated
     */
    void setDataState(DataState value);

    /**
     * Returns the value of the '<em><b>Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capacity</em>' attribute.
     * @see #setCapacity(BigInteger)
     * @see org.eclipse.bpmn.BpmnPackage#getDataStore_Capacity()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
     *        extendedMetaData="kind='attribute' name='capacity'"
     * @generated
     */
    BigInteger getCapacity();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.DataStore#getCapacity <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacity</em>' attribute.
     * @see #getCapacity()
     * @generated
     */
    void setCapacity(BigInteger value);

    /**
     * Returns the value of the '<em><b>Is Unlimited</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Unlimited</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Unlimited</em>' attribute.
     * @see #isSetIsUnlimited()
     * @see #unsetIsUnlimited()
     * @see #setIsUnlimited(boolean)
     * @see org.eclipse.bpmn.BpmnPackage#getDataStore_IsUnlimited()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isUnlimited'"
     * @generated
     */
    boolean isIsUnlimited();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.DataStore#isIsUnlimited <em>Is Unlimited</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Unlimited</em>' attribute.
     * @see #isSetIsUnlimited()
     * @see #unsetIsUnlimited()
     * @see #isIsUnlimited()
     * @generated
     */
    void setIsUnlimited(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.bpmn.DataStore#isIsUnlimited <em>Is Unlimited</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsUnlimited()
     * @see #isIsUnlimited()
     * @see #setIsUnlimited(boolean)
     * @generated
     */
    void unsetIsUnlimited();

    /**
     * Returns whether the value of the '{@link org.eclipse.bpmn.DataStore#isIsUnlimited <em>Is Unlimited</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Unlimited</em>' attribute is set.
     * @see #unsetIsUnlimited()
     * @see #isIsUnlimited()
     * @see #setIsUnlimited(boolean)
     * @generated
     */
    boolean isSetIsUnlimited();

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
     * @see org.eclipse.bpmn.BpmnPackage#getDataStore_ItemSubjectRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='itemSubjectRef'"
     * @generated
     */
    QName getItemSubjectRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.DataStore#getItemSubjectRef <em>Item Subject Ref</em>}' attribute.
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
     * @see org.eclipse.bpmn.BpmnPackage#getDataStore_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.DataStore#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // DataStore
