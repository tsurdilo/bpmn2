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

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.DataObject#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DataObject#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DataObject#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getDataObject()
 * @model extendedMetaData="name='tDataObject' kind='elementOnly'"
 * @generated
 */
public interface DataObject extends FlowElement {
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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getDataObject_DataState()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataState' namespace='##targetNamespace'"
     * @generated
     */
    DataState getDataState();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DataObject#getDataState <em>Data State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data State</em>' containment reference.
     * @see #getDataState()
     * @generated
     */
    void setDataState(DataState value);

    /**
     * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Collection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Collection</em>' attribute.
     * @see #isSetIsCollection()
     * @see #unsetIsCollection()
     * @see #setIsCollection(boolean)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getDataObject_IsCollection()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isCollection'"
     * @generated
     */
    boolean isIsCollection();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DataObject#isIsCollection <em>Is Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Collection</em>' attribute.
     * @see #isSetIsCollection()
     * @see #unsetIsCollection()
     * @see #isIsCollection()
     * @generated
     */
    void setIsCollection(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.DataObject#isIsCollection <em>Is Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsCollection()
     * @see #isIsCollection()
     * @see #setIsCollection(boolean)
     * @generated
     */
    void unsetIsCollection();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.DataObject#isIsCollection <em>Is Collection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Collection</em>' attribute is set.
     * @see #unsetIsCollection()
     * @see #isIsCollection()
     * @see #setIsCollection(boolean)
     * @generated
     */
    boolean isSetIsCollection();

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getDataObject_ItemSubjectRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='itemSubjectRef'"
     * @generated
     */
    QName getItemSubjectRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DataObject#getItemSubjectRef <em>Item Subject Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item Subject Ref</em>' attribute.
     * @see #getItemSubjectRef()
     * @generated
     */
    void setItemSubjectRef(QName value);

} // DataObject
