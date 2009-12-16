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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ResourceParameterBinding#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ResourceParameterBinding#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getResourceParameterBinding()
 * @model extendedMetaData="name='tResourceParameterBinding' kind='elementOnly'"
 * @generated
 */
public interface ResourceParameterBinding extends BaseElement {
    /**
     * Returns the value of the '<em><b>Expression Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Group</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getResourceParameterBinding_ExpressionGroup()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
     *        extendedMetaData="kind='group' name='expression:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getExpressionGroup();

    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(Expression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getResourceParameterBinding_Expression()
     * @model containment="true" required="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace' group='expression:group'"
     * @generated
     */
    Expression getExpression();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ResourceParameterBinding#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(Expression value);

    /**
     * Returns the value of the '<em><b>Parameter Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter Ref</em>' attribute.
     * @see #setParameterRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getResourceParameterBinding_ParameterRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='parameterRef'"
     * @generated
     */
    QName getParameterRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameter Ref</em>' attribute.
     * @see #getParameterRef()
     * @generated
     */
    void setParameterRef(QName value);

} // ResourceParameterBinding
