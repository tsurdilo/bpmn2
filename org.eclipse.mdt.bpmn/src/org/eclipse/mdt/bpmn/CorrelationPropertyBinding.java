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
 * A representation of the model object '<em><b>Correlation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getCorrelationPropertyBinding()
 * @model extendedMetaData="name='tCorrelationPropertyBinding' kind='elementOnly'"
 * @generated
 */
public interface CorrelationPropertyBinding extends BaseElement {
    /**
     * Returns the value of the '<em><b>Data Path</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Path</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Path</em>' containment reference.
     * @see #setDataPath(FormalExpression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getCorrelationPropertyBinding_DataPath()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='dataPath' namespace='##targetNamespace'"
     * @generated
     */
    FormalExpression getDataPath();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Path</em>' containment reference.
     * @see #getDataPath()
     * @generated
     */
    void setDataPath(FormalExpression value);

    /**
     * Returns the value of the '<em><b>Correlation Property Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Property Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Property Ref</em>' attribute.
     * @see #setCorrelationPropertyRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getCorrelationPropertyBinding_CorrelationPropertyRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='correlationPropertyRef'"
     * @generated
     */
    QName getCorrelationPropertyRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Correlation Property Ref</em>' attribute.
     * @see #getCorrelationPropertyRef()
     * @generated
     */
    void setCorrelationPropertyRef(QName value);

} // CorrelationPropertyBinding
