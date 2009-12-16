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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ActivityResource#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ActivityResource#getResourceParameterBinding <em>Resource Parameter Binding</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ActivityResource#getResourceRef <em>Resource Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getActivityResource()
 * @model extendedMetaData="name='tActivityResource' kind='elementOnly'"
 * @generated
 */
public interface ActivityResource extends BaseElement {
    /**
     * Returns the value of the '<em><b>Resource Assignment Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Assignment Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Assignment Expression</em>' containment reference.
     * @see #setResourceAssignmentExpression(ResourceAssignmentExpression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getActivityResource_ResourceAssignmentExpression()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='resourceAssignmentExpression' namespace='##targetNamespace'"
     * @generated
     */
    ResourceAssignmentExpression getResourceAssignmentExpression();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ActivityResource#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Assignment Expression</em>' containment reference.
     * @see #getResourceAssignmentExpression()
     * @generated
     */
    void setResourceAssignmentExpression(ResourceAssignmentExpression value);

    /**
     * Returns the value of the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.ResourceParameterBinding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Parameter Binding</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Parameter Binding</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getActivityResource_ResourceParameterBinding()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='resourceParameterBinding' namespace='##targetNamespace'"
     * @generated
     */
    EList<ResourceParameterBinding> getResourceParameterBinding();

    /**
     * Returns the value of the '<em><b>Resource Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Ref</em>' attribute.
     * @see #setResourceRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getActivityResource_ResourceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='resourceRef'"
     * @generated
     */
    QName getResourceRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ActivityResource#getResourceRef <em>Resource Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Ref</em>' attribute.
     * @see #getResourceRef()
     * @generated
     */
    void setResourceRef(QName value);

} // ActivityResource
