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
 * A representation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ErrorEventDefinition#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getErrorEventDefinition()
 * @model extendedMetaData="name='tErrorEventDefinition' kind='elementOnly'"
 * @generated
 */
public interface ErrorEventDefinition extends EventDefinition {
    /**
     * Returns the value of the '<em><b>Error Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Code</em>' attribute.
     * @see #setErrorCode(String)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getErrorEventDefinition_ErrorCode()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='errorCode'"
     * @generated
     */
    String getErrorCode();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ErrorEventDefinition#getErrorCode <em>Error Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Code</em>' attribute.
     * @see #getErrorCode()
     * @generated
     */
    void setErrorCode(String value);

    /**
     * Returns the value of the '<em><b>Error Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Ref</em>' attribute.
     * @see #setErrorRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getErrorEventDefinition_ErrorRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='errorRef'"
     * @generated
     */
    QName getErrorRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Ref</em>' attribute.
     * @see #getErrorRef()
     * @generated
     */
    void setErrorRef(QName value);

} // ErrorEventDefinition
