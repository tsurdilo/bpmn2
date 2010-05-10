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

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getParticipantAssociation()
 * @model extendedMetaData="name='tParticipantAssociation' kind='elementOnly'"
 * @generated
 */
public interface ParticipantAssociation extends BaseElement {
    /**
     * Returns the value of the '<em><b>Inner Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inner Participant Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inner Participant Ref</em>' attribute.
     * @see #setInnerParticipantRef(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getParticipantAssociation_InnerParticipantRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='element' name='innerParticipantRef' namespace='##targetNamespace'"
     * @generated
     */
    QName getInnerParticipantRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inner Participant Ref</em>' attribute.
     * @see #getInnerParticipantRef()
     * @generated
     */
    void setInnerParticipantRef(QName value);

    /**
     * Returns the value of the '<em><b>Outer Participant Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outer Participant Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outer Participant Ref</em>' attribute.
     * @see #setOuterParticipantRef(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getParticipantAssociation_OuterParticipantRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='element' name='outerParticipantRef' namespace='##targetNamespace'"
     * @generated
     */
    QName getOuterParticipantRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outer Participant Ref</em>' attribute.
     * @see #getOuterParticipantRef()
     * @generated
     */
    void setOuterParticipantRef(QName value);

} // ParticipantAssociation
