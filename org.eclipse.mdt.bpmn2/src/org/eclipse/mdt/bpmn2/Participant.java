/**
 * Copyright (c) 2009, Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Intalio Inc. - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.mdt.bpmn2;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.Participant#getInterfaceRef <em>Interface Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Participant#getEntityRef <em>Entity Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Participant#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Participant#getProcessRef <em>Process Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Participant#getRoleRef <em>Role Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipant()
 * @model extendedMetaData="name='tParticipant' kind='elementOnly'"
 * @generated
 */
public interface Participant extends RootElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Interface Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipant_InterfaceRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='interfaceRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getInterfaceRef();

    /**
     * Returns the value of the '<em><b>Participant Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Multiplicity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Multiplicity</em>' containment reference.
     * @see #setParticipantMultiplicity(ParticipantMultiplicity)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipant_ParticipantMultiplicity()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='participantMultiplicity' namespace='##targetNamespace'"
     * @generated
     */
    ParticipantMultiplicity getParticipantMultiplicity();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Participant Multiplicity</em>' containment reference.
     * @see #getParticipantMultiplicity()
     * @generated
     */
    void setParticipantMultiplicity(ParticipantMultiplicity value);

    /**
     * Returns the value of the '<em><b>Entity Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Ref</em>' attribute.
     * @see #setEntityRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipant_EntityRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='entityRef'"
     * @generated
     */
    QName getEntityRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Participant#getEntityRef <em>Entity Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Ref</em>' attribute.
     * @see #getEntityRef()
     * @generated
     */
    void setEntityRef(QName value);

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipant_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Participant#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Process Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Ref</em>' attribute.
     * @see #setProcessRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipant_ProcessRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='processRef'"
     * @generated
     */
    QName getProcessRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Participant#getProcessRef <em>Process Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Ref</em>' attribute.
     * @see #getProcessRef()
     * @generated
     */
    void setProcessRef(QName value);

    /**
     * Returns the value of the '<em><b>Role Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Ref</em>' attribute.
     * @see #setRoleRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipant_RoleRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='roleRef'"
     * @generated
     */
    QName getRoleRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Participant#getRoleRef <em>Role Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role Ref</em>' attribute.
     * @see #getRoleRef()
     * @generated
     */
    void setRoleRef(QName value);

} // Participant
