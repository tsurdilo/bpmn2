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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.CorrelationSubscription#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CorrelationSubscription#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getCorrelationSubscription()
 * @model extendedMetaData="name='tCorrelationSubscription' kind='elementOnly'"
 * @generated
 */
public interface CorrelationSubscription extends BaseElement {
    /**
     * Returns the value of the '<em><b>Correlation Property Binding</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.CorrelationPropertyBinding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Property Binding</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Property Binding</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getCorrelationSubscription_CorrelationPropertyBinding()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='correlationPropertyBinding' namespace='##targetNamespace'"
     * @generated
     */
    EList<CorrelationPropertyBinding> getCorrelationPropertyBinding();

    /**
     * Returns the value of the '<em><b>Correlation Key Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Key Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Key Ref</em>' attribute.
     * @see #setCorrelationKeyRef(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getCorrelationSubscription_CorrelationKeyRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='correlationKeyRef'"
     * @generated
     */
    QName getCorrelationKeyRef();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.CorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Key Ref</em>' attribute.
     * @see #getCorrelationKeyRef()
     * @generated
     */
    void setCorrelationKeyRef(QName value);

    /**
     * Returns the value of the '<em><b>Process</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' attribute.
     * @see #setProcess(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getCorrelationSubscription_Process()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='process'"
     * @generated
     */
    QName getProcess();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.CorrelationSubscription#getProcess <em>Process</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' attribute.
     * @see #getProcess()
     * @generated
     */
    void setProcess(QName value);

} // CorrelationSubscription
