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
package org.eclipse.bpmn.di;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.di.Connector#getBendpoint <em>Bendpoint</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.Connector#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.di.DIPackage#getConnector()
 * @model extendedMetaData="name='Connector' kind='elementOnly'"
 * @generated
 */
public interface Connector extends View {
    /**
     * Returns the value of the '<em><b>Bendpoint</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.di.Bendpoint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bendpoint</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bendpoint</em>' containment reference list.
     * @see org.eclipse.bpmn.di.DIPackage#getConnector_Bendpoint()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='bendpoint' namespace='##targetNamespace'"
     * @generated
     */
    EList<Bendpoint> getBendpoint();

    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see org.eclipse.bpmn.di.DIPackage#getConnector_Source()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='attribute' name='source'"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.di.Connector#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource(String value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' attribute.
     * @see #setTarget(String)
     * @see org.eclipse.bpmn.di.DIPackage#getConnector_Target()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='attribute' name='target'"
     * @generated
     */
    String getTarget();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.di.Connector#getTarget <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' attribute.
     * @see #getTarget()
     * @generated
     */
    void setTarget(String value);

} // Connector
