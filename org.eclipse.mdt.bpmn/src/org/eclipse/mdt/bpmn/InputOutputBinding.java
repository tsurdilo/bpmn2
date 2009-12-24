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
 * A representation of the model object '<em><b>Input Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.InputOutputBinding#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.InputOutputBinding#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.InputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getInputOutputBinding()
 * @model extendedMetaData="name='tInputOutputBinding' kind='elementOnly'"
 * @generated
 */
public interface InputOutputBinding extends BaseElement {
    /**
     * Returns the value of the '<em><b>Input Data Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Data Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Data Ref</em>' attribute.
     * @see #setInputDataRef(String)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getInputOutputBinding_InputDataRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
     *        extendedMetaData="kind='attribute' name='inputDataRef'"
     * @generated
     */
    String getInputDataRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.InputOutputBinding#getInputDataRef <em>Input Data Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Data Ref</em>' attribute.
     * @see #getInputDataRef()
     * @generated
     */
    void setInputDataRef(String value);

    /**
     * Returns the value of the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation Ref</em>' attribute.
     * @see #setOperationRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getInputOutputBinding_OperationRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='operationRef'"
     * @generated
     */
    QName getOperationRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.InputOutputBinding#getOperationRef <em>Operation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation Ref</em>' attribute.
     * @see #getOperationRef()
     * @generated
     */
    void setOperationRef(QName value);

    /**
     * Returns the value of the '<em><b>Output Data Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Data Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Data Ref</em>' attribute.
     * @see #setOutputDataRef(String)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getInputOutputBinding_OutputDataRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
     *        extendedMetaData="kind='attribute' name='outputDataRef'"
     * @generated
     */
    String getOutputDataRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.InputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Data Ref</em>' attribute.
     * @see #getOutputDataRef()
     * @generated
     */
    void setOutputDataRef(String value);

} // InputOutputBinding
