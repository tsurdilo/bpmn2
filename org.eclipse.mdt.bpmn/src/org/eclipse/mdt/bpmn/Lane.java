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
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Lane#getPartitionElement <em>Partition Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Lane#getFlowElementRef <em>Flow Element Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Lane#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Lane#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Lane#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getLane()
 * @model extendedMetaData="name='tLane' kind='elementOnly'"
 * @generated
 */
public interface Lane extends BaseElement {
    /**
     * Returns the value of the '<em><b>Partition Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Partition Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Partition Element</em>' containment reference.
     * @see #setPartitionElement(BaseElement)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getLane_PartitionElement()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='partitionElement' namespace='##targetNamespace'"
     * @generated
     */
    BaseElement getPartitionElement();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Lane#getPartitionElement <em>Partition Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Partition Element</em>' containment reference.
     * @see #getPartitionElement()
     * @generated
     */
    void setPartitionElement(BaseElement value);

    /**
     * Returns the value of the '<em><b>Flow Element Ref</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getLane_FlowElementRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='element' name='flowElementRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<String> getFlowElementRef();

    /**
     * Returns the value of the '<em><b>Child Lane Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Lane Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child Lane Set</em>' containment reference.
     * @see #setChildLaneSet(LaneSet)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getLane_ChildLaneSet()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='childLaneSet' namespace='##targetNamespace'"
     * @generated
     */
    LaneSet getChildLaneSet();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Lane#getChildLaneSet <em>Child Lane Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child Lane Set</em>' containment reference.
     * @see #getChildLaneSet()
     * @generated
     */
    void setChildLaneSet(LaneSet value);

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
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getLane_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Lane#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Partition Element Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Partition Element Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Partition Element Ref</em>' attribute.
     * @see #setPartitionElementRef(String)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getLane_PartitionElementRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='attribute' name='partitionElementRef'"
     * @generated
     */
    String getPartitionElementRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Lane#getPartitionElementRef <em>Partition Element Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Partition Element Ref</em>' attribute.
     * @see #getPartitionElementRef()
     * @generated
     */
    void setPartitionElementRef(String value);

} // Lane
