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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Assignment#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Assignment#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Assignment#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getAssignment()
 * @model extendedMetaData="name='tAssignment' kind='elementOnly'"
 * @generated
 */
public interface Assignment extends BaseElement {
    /**
     * Returns the value of the '<em><b>From</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' containment reference.
     * @see #setFrom(BaseElementWithMixedContent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getAssignment_From()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
     * @generated
     */
    BaseElementWithMixedContent getFrom();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Assignment#getFrom <em>From</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' containment reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(BaseElementWithMixedContent value);

    /**
     * Returns the value of the '<em><b>To</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' containment reference.
     * @see #setTo(BaseElementWithMixedContent)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getAssignment_To()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
     * @generated
     */
    BaseElementWithMixedContent getTo();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Assignment#getTo <em>To</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' containment reference.
     * @see #getTo()
     * @generated
     */
    void setTo(BaseElementWithMixedContent value);

    /**
     * Returns the value of the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Language</em>' attribute.
     * @see #setLanguage(String)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getAssignment_Language()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='language'"
     * @generated
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Assignment#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' attribute.
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(String value);

} // Assignment
