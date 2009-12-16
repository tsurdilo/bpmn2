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
 * A representation of the model object '<em><b>Input Output Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.InputOutputSpecification#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.InputOutputSpecification#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.InputOutputSpecification#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.InputOutputSpecification#getOutputSet <em>Output Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getInputOutputSpecification()
 * @model extendedMetaData="name='tInputOutputSpecification' kind='elementOnly'"
 * @generated
 */
public interface InputOutputSpecification extends BaseElement {
    /**
     * Returns the value of the '<em><b>Data Input</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.DataInput}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Input</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Input</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getInputOutputSpecification_DataInput()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataInput' namespace='##targetNamespace'"
     * @generated
     */
    EList<DataInput> getDataInput();

    /**
     * Returns the value of the '<em><b>Data Output</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.DataOutput}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getInputOutputSpecification_DataOutput()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataOutput' namespace='##targetNamespace'"
     * @generated
     */
    EList<DataOutput> getDataOutput();

    /**
     * Returns the value of the '<em><b>Input Set</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.InputSet}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Set</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Set</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getInputOutputSpecification_InputSet()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='inputSet' namespace='##targetNamespace'"
     * @generated
     */
    EList<InputSet> getInputSet();

    /**
     * Returns the value of the '<em><b>Output Set</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.OutputSet}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Set</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Set</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getInputOutputSpecification_OutputSet()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='outputSet' namespace='##targetNamespace'"
     * @generated
     */
    EList<OutputSet> getOutputSet();

} // InputOutputSpecification
