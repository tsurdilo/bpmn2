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
 * A representation of the model object '<em><b>Escalation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Escalation#getStructureRef <em>Structure Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getEscalation()
 * @model extendedMetaData="name='tEscalation' kind='elementOnly'"
 * @generated
 */
public interface Escalation extends RootElement {
    /**
     * Returns the value of the '<em><b>Structure Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Structure Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Structure Ref</em>' attribute.
     * @see #setStructureRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getEscalation_StructureRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='structureRef'"
     * @generated
     */
    QName getStructureRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Escalation#getStructureRef <em>Structure Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Structure Ref</em>' attribute.
     * @see #getStructureRef()
     * @generated
     */
    void setStructureRef(QName value);

} // Escalation
