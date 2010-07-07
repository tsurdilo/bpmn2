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

import java.util.List;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.DataAssociation#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.DataAssociation#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getDataAssociation()
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
     * @see org.eclipse.bpmn.BpmnPackage#getDataAssociation_Transformation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
     * @generated
     */
    FormalExpression getTransformation();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.DataAssociation#getTransformation <em>Transformation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformation</em>' containment reference.
     * @see #getTransformation()
     * @generated
     */
    void setTransformation(FormalExpression value);

    /**
     * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Assignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignments</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getDataAssociation_Assignments()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='assignment' namespace='##targetNamespace'"
     * @generated
     */
    List<Assignment> getAssignments();

} // DataAssociation
