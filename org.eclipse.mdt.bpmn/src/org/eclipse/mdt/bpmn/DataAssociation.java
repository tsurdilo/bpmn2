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
 * A representation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.DataAssociation#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DataAssociation#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getDataAssociation()
 * @model abstract="true"
 *        extendedMetaData="name='tDataAssociation' kind='elementOnly'"
 * @generated
 */
public interface DataAssociation extends BaseElement {
    /**
     * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformation</em>' containment reference.
     * @see #setTransformation(FormalExpression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDataAssociation_Transformation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
     * @generated
     */
    FormalExpression getTransformation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DataAssociation#getTransformation <em>Transformation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformation</em>' containment reference.
     * @see #getTransformation()
     * @generated
     */
    void setTransformation(FormalExpression value);

    /**
     * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.Assignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getDataAssociation_Assignment()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='assignment' namespace='##targetNamespace'"
     * @generated
     */
    EList<Assignment> getAssignment();

} // DataAssociation
