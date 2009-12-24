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
package org.eclipse.mdt.bpmn.di;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.di.View#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.View#getChild <em>Child</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.View#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.View#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.View#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.View#getSourceConnector <em>Source Connector</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.View#getTargetConnector <em>Target Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.di.DIPackage#getView()
 * @model abstract="true"
 *        extendedMetaData="name='View' kind='elementOnly'"
 * @generated
 */
public interface View extends EObject {
    /**
     * Returns the value of the '<em><b>Style</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.di.Style}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getView_Style()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='style' namespace='##targetNamespace'"
     * @generated
     */
    EList<Style> getStyle();

    /**
     * Returns the value of the '<em><b>Child</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.di.Node}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getView_Child()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='child' namespace='##targetNamespace'"
     * @generated
     */
    EList<Node> getChild();

    /**
     * Returns the value of the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' attribute.
     * @see #setContext(String)
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getView_Context()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='context'"
     * @generated
     */
    String getContext();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.di.View#getContext <em>Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' attribute.
     * @see #getContext()
     * @generated
     */
    void setContext(String value);

    /**
     * Returns the value of the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Definition</em>' attribute.
     * @see #setDefinition(List)
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getView_Definition()
     * @model dataType="org.eclipse.mdt.bpmn.di.DefinitionType" required="true" many="false"
     *        extendedMetaData="kind='attribute' name='definition'"
     * @generated
     */
    List<QName> getDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.di.View#getDefinition <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definition</em>' attribute.
     * @see #getDefinition()
     * @generated
     */
    void setDefinition(List<QName> value);

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
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getView_Id()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.di.View#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Source Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Connector</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Connector</em>' attribute.
     * @see #setSourceConnector(List)
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getView_SourceConnector()
     * @model dataType="org.eclipse.mdt.bpmn.di.SourceConnectorType" many="false"
     *        extendedMetaData="kind='attribute' name='sourceConnector'"
     * @generated
     */
    List<String> getSourceConnector();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.di.View#getSourceConnector <em>Source Connector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Connector</em>' attribute.
     * @see #getSourceConnector()
     * @generated
     */
    void setSourceConnector(List<String> value);

    /**
     * Returns the value of the '<em><b>Target Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Connector</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Connector</em>' attribute.
     * @see #setTargetConnector(List)
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getView_TargetConnector()
     * @model dataType="org.eclipse.mdt.bpmn.di.TargetConnectorType" many="false"
     *        extendedMetaData="kind='attribute' name='targetConnector'"
     * @generated
     */
    List<String> getTargetConnector();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.di.View#getTargetConnector <em>Target Connector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Connector</em>' attribute.
     * @see #getTargetConnector()
     * @generated
     */
    void setTargetConnector(List<String> value);

} // View
