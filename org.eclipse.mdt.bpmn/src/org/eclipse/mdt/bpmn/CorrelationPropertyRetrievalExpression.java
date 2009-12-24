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
 * A representation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getCorrelationPropertyRetrievalExpression()
 * @model extendedMetaData="name='tCorrelationPropertyRetrievalExpression' kind='elementOnly'"
 * @generated
 */
public interface CorrelationPropertyRetrievalExpression extends BaseElement {
    /**
     * Returns the value of the '<em><b>Message Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Path</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Path</em>' containment reference.
     * @see #setMessagePath(FormalExpression)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCorrelationPropertyRetrievalExpression_MessagePath()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='messagePath' namespace='##targetNamespace'"
     * @generated
     */
    FormalExpression getMessagePath();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Path</em>' containment reference.
     * @see #getMessagePath()
     * @generated
     */
    void setMessagePath(FormalExpression value);

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCorrelationPropertyRetrievalExpression_MessageRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='messageRef'"
     * @generated
     */
    QName getMessageRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Ref</em>' attribute.
     * @see #getMessageRef()
     * @generated
     */
    void setMessageRef(QName value);

} // CorrelationPropertyRetrievalExpression
