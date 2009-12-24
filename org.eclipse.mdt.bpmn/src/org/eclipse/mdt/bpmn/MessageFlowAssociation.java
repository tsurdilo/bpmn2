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
 * A representation of the model object '<em><b>Message Flow Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.MessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.MessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getMessageFlowAssociation()
 * @model extendedMetaData="name='tMessageFlowAssociation' kind='elementOnly'"
 * @generated
 */
public interface MessageFlowAssociation extends BaseElement {
    /**
     * Returns the value of the '<em><b>Inner Message Flow Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inner Message Flow Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inner Message Flow Ref</em>' attribute.
     * @see #setInnerMessageFlowRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getMessageFlowAssociation_InnerMessageFlowRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='innerMessageFlowRef'"
     * @generated
     */
    QName getInnerMessageFlowRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.MessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inner Message Flow Ref</em>' attribute.
     * @see #getInnerMessageFlowRef()
     * @generated
     */
    void setInnerMessageFlowRef(QName value);

    /**
     * Returns the value of the '<em><b>Outer Message Flow Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outer Message Flow Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outer Message Flow Ref</em>' attribute.
     * @see #setOuterMessageFlowRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getMessageFlowAssociation_OuterMessageFlowRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='outerMessageFlowRef'"
     * @generated
     */
    QName getOuterMessageFlowRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.MessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outer Message Flow Ref</em>' attribute.
     * @see #getOuterMessageFlowRef()
     * @generated
     */
    void setOuterMessageFlowRef(QName value);

} // MessageFlowAssociation
