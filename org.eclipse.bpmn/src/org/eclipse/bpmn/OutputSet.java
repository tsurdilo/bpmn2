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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.OutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.OutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.OutputSet#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.OutputSet#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getOutputSet()
 * @model extendedMetaData="name='tOutputSet' kind='elementOnly'"
 * @generated
 */
public interface OutputSet extends BaseElement {
    /**
     * Returns the value of the '<em><b>Data Output Refs</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output Refs</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output Refs</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getOutputSet_DataOutputRefs()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='element' name='dataOutputRefs' namespace='##targetNamespace'"
     * @generated
     */
    EList<String> getDataOutputRefs();

    /**
     * Returns the value of the '<em><b>Optional Output Refs</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Optional Output Refs</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Optional Output Refs</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getOutputSet_OptionalOutputRefs()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='element' name='optionalOutputRefs' namespace='##targetNamespace'"
     * @generated
     */
    EList<String> getOptionalOutputRefs();

    /**
     * Returns the value of the '<em><b>While Executing Output Refs</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>While Executing Output Refs</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>While Executing Output Refs</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getOutputSet_WhileExecutingOutputRefs()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='element' name='whileExecutingOutputRefs' namespace='##targetNamespace'"
     * @generated
     */
    EList<String> getWhileExecutingOutputRefs();

    /**
     * Returns the value of the '<em><b>Input Set Refs</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Set Refs</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Set Refs</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getOutputSet_InputSetRefs()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='element' name='inputSetRefs' namespace='##targetNamespace'"
     * @generated
     */
    EList<String> getInputSetRefs();

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
     * @see org.eclipse.bpmn.BpmnPackage#getOutputSet_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.OutputSet#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // OutputSet
