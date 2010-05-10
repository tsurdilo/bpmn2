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

import org.eclipse.bpmn.di.Diagram;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.bpmn.di.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.Definitions#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getRootElementGroup <em>Root Element Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getTypeLanguage <em>Type Language</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Definitions#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getDefinitions()
 * @model extendedMetaData="name='tDefinitions' kind='elementOnly'"
 * @generated
 */
public interface Definitions extends EObject {
    /**
     * Returns the value of the '<em><b>Import</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Import}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Import</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_Import()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
     * @generated
     */
    EList<Import> getImport();

    /**
     * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Extension}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_Extension()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
     * @generated
     */
    EList<Extension> getExtension();

    /**
     * Returns the value of the '<em><b>Root Element Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Element Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Element Group</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_RootElementGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='rootElement:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getRootElementGroup();

    /**
     * Returns the value of the '<em><b>Root Element</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.RootElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Element</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_RootElement()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='rootElement' namespace='##targetNamespace' group='rootElement:group'"
     * @generated
     */
    EList<RootElement> getRootElement();

    /**
     * Returns the value of the '<em><b>Diagram</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.di.Diagram}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_Diagram()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='diagram' namespace='http://www.omg.com/di/1.0.0'"
     * @generated
     */
    EList<Diagram> getDiagram();

    /**
     * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Relationship}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relationship</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_Relationship()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
     * @generated
     */
    EList<Relationship> getRelationship();

    /**
     * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
     * The default value is <code>"http://www.w3.org/1999/XPath"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Language</em>' attribute.
     * @see #isSetExpressionLanguage()
     * @see #unsetExpressionLanguage()
     * @see #setExpressionLanguage(String)
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_ExpressionLanguage()
     * @model default="http://www.w3.org/1999/XPath" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='expressionLanguage'"
     * @generated
     */
    String getExpressionLanguage();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Definitions#getExpressionLanguage <em>Expression Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Language</em>' attribute.
     * @see #isSetExpressionLanguage()
     * @see #unsetExpressionLanguage()
     * @see #getExpressionLanguage()
     * @generated
     */
    void setExpressionLanguage(String value);

    /**
     * Unsets the value of the '{@link org.eclipse.bpmn.Definitions#getExpressionLanguage <em>Expression Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExpressionLanguage()
     * @see #getExpressionLanguage()
     * @see #setExpressionLanguage(String)
     * @generated
     */
    void unsetExpressionLanguage();

    /**
     * Returns whether the value of the '{@link org.eclipse.bpmn.Definitions#getExpressionLanguage <em>Expression Language</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Expression Language</em>' attribute is set.
     * @see #unsetExpressionLanguage()
     * @see #getExpressionLanguage()
     * @see #setExpressionLanguage(String)
     * @generated
     */
    boolean isSetExpressionLanguage();

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
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Definitions#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Namespace</em>' attribute.
     * @see #setTargetNamespace(String)
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_TargetNamespace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='attribute' name='targetNamespace'"
     * @generated
     */
    String getTargetNamespace();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Definitions#getTargetNamespace <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Namespace</em>' attribute.
     * @see #getTargetNamespace()
     * @generated
     */
    void setTargetNamespace(String value);

    /**
     * Returns the value of the '<em><b>Type Language</b></em>' attribute.
     * The default value is <code>"http://www.w3.org/2001/XMLSchema"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Language</em>' attribute.
     * @see #isSetTypeLanguage()
     * @see #unsetTypeLanguage()
     * @see #setTypeLanguage(String)
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_TypeLanguage()
     * @model default="http://www.w3.org/2001/XMLSchema" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='typeLanguage'"
     * @generated
     */
    String getTypeLanguage();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Definitions#getTypeLanguage <em>Type Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type Language</em>' attribute.
     * @see #isSetTypeLanguage()
     * @see #unsetTypeLanguage()
     * @see #getTypeLanguage()
     * @generated
     */
    void setTypeLanguage(String value);

    /**
     * Unsets the value of the '{@link org.eclipse.bpmn.Definitions#getTypeLanguage <em>Type Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTypeLanguage()
     * @see #getTypeLanguage()
     * @see #setTypeLanguage(String)
     * @generated
     */
    void unsetTypeLanguage();

    /**
     * Returns whether the value of the '{@link org.eclipse.bpmn.Definitions#getTypeLanguage <em>Type Language</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type Language</em>' attribute is set.
     * @see #unsetTypeLanguage()
     * @see #getTypeLanguage()
     * @see #setTypeLanguage(String)
     * @generated
     */
    boolean isSetTypeLanguage();

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
     * @see org.eclipse.bpmn.BpmnPackage#getDefinitions_AnyAttribute()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':10' processing='lax'"
     * @generated
     */
    FeatureMap getAnyAttribute();

} // Definitions
