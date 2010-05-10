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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inclusive Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.InclusiveGateway#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getInclusiveGateway()
 * @model extendedMetaData="name='tInclusiveGateway' kind='elementOnly'"
 * @generated
 */
public interface InclusiveGateway extends Gateway {
    /**
     * Returns the value of the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default</em>' attribute.
     * @see #setDefault(String)
     * @see org.eclipse.bpmn.BpmnPackage#getInclusiveGateway_Default()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='attribute' name='default'"
     * @generated
     */
    String getDefault();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.InclusiveGateway#getDefault <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' attribute.
     * @see #getDefault()
     * @generated
     */
    void setDefault(String value);

} // InclusiveGateway
