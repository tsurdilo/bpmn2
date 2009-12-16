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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Relationship#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Relationship#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getRelationship()
 * @model extendedMetaData="name='tRelationship' kind='elementOnly'"
 * @generated
 */
public interface Relationship extends BaseElement {
    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getRelationship_Source()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getSource();

    /**
     * Returns the value of the '<em><b>Target</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getRelationship_Target()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getTarget();

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn.RelationshipDirection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see org.eclipse.mdt.bpmn.RelationshipDirection
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #setDirection(RelationshipDirection)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getRelationship_Direction()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='direction'"
     * @generated
     */
    RelationshipDirection getDirection();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Relationship#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see org.eclipse.mdt.bpmn.RelationshipDirection
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #getDirection()
     * @generated
     */
    void setDirection(RelationshipDirection value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.Relationship#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirection()
     * @see #getDirection()
     * @see #setDirection(RelationshipDirection)
     * @generated
     */
    void unsetDirection();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.Relationship#getDirection <em>Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Direction</em>' attribute is set.
     * @see #unsetDirection()
     * @see #getDirection()
     * @see #setDirection(RelationshipDirection)
     * @generated
     */
    boolean isSetDirection();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getRelationship_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Relationship#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // Relationship
