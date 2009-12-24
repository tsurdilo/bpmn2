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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Input Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.DataInputAssociation#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.DataInputAssociation#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getDataInputAssociation()
 * @model extendedMetaData="name='tDataInputAssociation' kind='elementOnly'"
 * @generated
 */
public interface DataInputAssociation extends DataAssociation {
    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getDataInputAssociation_SourceRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='element' name='sourceRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getSourceRef();

    /**
     * Returns the value of the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Ref</em>' attribute.
     * @see #setTargetRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getDataInputAssociation_TargetRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='element' name='targetRef' namespace='##targetNamespace'"
     * @generated
     */
    QName getTargetRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.DataInputAssociation#getTargetRef <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Ref</em>' attribute.
     * @see #getTargetRef()
     * @generated
     */
    void setTargetRef(QName value);

} // DataInputAssociation
