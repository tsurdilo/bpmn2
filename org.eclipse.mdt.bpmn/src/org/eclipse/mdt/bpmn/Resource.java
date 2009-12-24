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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Resource#getResourceParameter <em>Resource Parameter</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Resource#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getResource()
 * @model extendedMetaData="name='tResource' kind='elementOnly'"
 * @generated
 */
public interface Resource extends RootElement {
    /**
     * Returns the value of the '<em><b>Resource Parameter</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.ResourceParameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Parameter</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getResource_ResourceParameter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='resourceParameter' namespace='##targetNamespace'"
     * @generated
     */
    EList<ResourceParameter> getResourceParameter();

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getResource_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Resource#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Resource
