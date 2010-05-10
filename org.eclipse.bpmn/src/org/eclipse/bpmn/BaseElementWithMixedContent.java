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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Element With Mixed Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.BaseElementWithMixedContent#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.bpmn.BaseElementWithMixedContent#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.BaseElementWithMixedContent#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.bpmn.BaseElementWithMixedContent#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.bpmn.BaseElementWithMixedContent#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.bpmn.BaseElementWithMixedContent#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getBaseElementWithMixedContent()
 * @model abstract="true"
 *        extendedMetaData="name='tBaseElementWithMixedContent' kind='mixed'"
 * @generated
 */
public interface BaseElementWithMixedContent extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getBaseElementWithMixedContent_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Documentation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getBaseElementWithMixedContent_Documentation()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
     * @generated
     */
    EList<Documentation> getDocumentation();

    /**
     * Returns the value of the '<em><b>Category</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Category}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getBaseElementWithMixedContent_Category()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
     * @generated
     */
    EList<Category> getCategory();

    /**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getBaseElementWithMixedContent_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
     * @generated
     */
    FeatureMap getAny();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.eclipse.bpmn.BpmnPackage#getBaseElementWithMixedContent_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.BaseElementWithMixedContent#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any Attribute</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getBaseElementWithMixedContent_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='lax'"
     * @generated
     */
    FeatureMap getAnyAttribute();

} // BaseElementWithMixedContent
