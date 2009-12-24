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
 * A representation of the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.MessageFlow#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.MessageFlow#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.MessageFlow#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.MessageFlow#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getMessageFlow()
 * @model extendedMetaData="name='tMessageFlow' kind='elementOnly'"
 * @generated
 */
public interface MessageFlow extends BaseElement {
    /**
     * Returns the value of the '<em><b>Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Ref</em>' attribute.
     * @see #setMessageRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getMessageFlow_MessageRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='messageRef'"
     * @generated
     */
    QName getMessageRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.MessageFlow#getMessageRef <em>Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Ref</em>' attribute.
     * @see #getMessageRef()
     * @generated
     */
    void setMessageRef(QName value);

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getMessageFlow_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.MessageFlow#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Ref</em>' attribute.
     * @see #setSourceRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getMessageFlow_SourceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='sourceRef'"
     * @generated
     */
    QName getSourceRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.MessageFlow#getSourceRef <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Ref</em>' attribute.
     * @see #getSourceRef()
     * @generated
     */
    void setSourceRef(QName value);

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getMessageFlow_TargetRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='targetRef'"
     * @generated
     */
    QName getTargetRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.MessageFlow#getTargetRef <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Ref</em>' attribute.
     * @see #getTargetRef()
     * @generated
     */
    void setTargetRef(QName value);

} // MessageFlow
