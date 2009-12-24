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
 * A representation of the model object '<em><b>Resource Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ResourceParameter#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ResourceParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ResourceParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getResourceParameter()
 * @model extendedMetaData="name='tResourceParameter' kind='elementOnly'"
 * @generated
 */
public interface ResourceParameter extends BaseElement {
    /**
     * Returns the value of the '<em><b>Is Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Required</em>' attribute.
     * @see #isSetIsRequired()
     * @see #unsetIsRequired()
     * @see #setIsRequired(boolean)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getResourceParameter_IsRequired()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isRequired'"
     * @generated
     */
    boolean isIsRequired();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ResourceParameter#isIsRequired <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Required</em>' attribute.
     * @see #isSetIsRequired()
     * @see #unsetIsRequired()
     * @see #isIsRequired()
     * @generated
     */
    void setIsRequired(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.ResourceParameter#isIsRequired <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsRequired()
     * @see #isIsRequired()
     * @see #setIsRequired(boolean)
     * @generated
     */
    void unsetIsRequired();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.ResourceParameter#isIsRequired <em>Is Required</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Required</em>' attribute is set.
     * @see #unsetIsRequired()
     * @see #isIsRequired()
     * @see #setIsRequired(boolean)
     * @generated
     */
    boolean isSetIsRequired();

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getResourceParameter_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ResourceParameter#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getResourceParameter_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    QName getType();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ResourceParameter#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(QName value);

} // ResourceParameter
