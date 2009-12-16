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

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.FormalExpression#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getFormalExpression()
 * @model extendedMetaData="name='tFormalExpression' kind='mixed'"
 * @generated
 */
public interface FormalExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Evaluates To Type Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Evaluates To Type Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Evaluates To Type Ref</em>' attribute.
     * @see #setEvaluatesToTypeRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getFormalExpression_EvaluatesToTypeRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='evaluatesToTypeRef'"
     * @generated
     */
    QName getEvaluatesToTypeRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Evaluates To Type Ref</em>' attribute.
     * @see #getEvaluatesToTypeRef()
     * @generated
     */
    void setEvaluatesToTypeRef(QName value);

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
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getFormalExpression_Language()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='language'"
     * @generated
     */
    String getLanguage();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.FormalExpression#getLanguage <em>Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' attribute.
     * @see #getLanguage()
     * @generated
     */
    void setLanguage(String value);

} // FormalExpression
