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
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Communication#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Communication#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getCommunication()
 * @model extendedMetaData="name='tCommunication' kind='elementOnly'"
 * @generated
 */
public interface Communication extends ConversationNode {
    /**
     * Returns the value of the '<em><b>Message Flow Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message Flow Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message Flow Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCommunication_MessageFlowRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='messageFlowRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getMessageFlowRef();

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCommunication_CorrelationKeyRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='correlationKeyRef'"
     * @generated
     */
    QName getCorrelationKeyRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Communication#getCorrelationKeyRef <em>Correlation Key Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Key Ref</em>' attribute.
     * @see #getCorrelationKeyRef()
     * @generated
     */
    void setCorrelationKeyRef(QName value);

} // Communication
