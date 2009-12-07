/**
 * Copyright (c) 2009, Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Intalio Inc. - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.mdt.bpmn2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.Gateway#getGatewayDirection <em>Gateway Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getGateway()
 * @model extendedMetaData="name='tGateway' kind='elementOnly'"
 * @generated
 */
public interface Gateway extends FlowNode {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Gateway Direction</b></em>' attribute.
     * The default value is <code>"unspecified"</code>.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn2.GatewayDirection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gateway Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gateway Direction</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.GatewayDirection
     * @see #isSetGatewayDirection()
     * @see #unsetGatewayDirection()
     * @see #setGatewayDirection(GatewayDirection)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getGateway_GatewayDirection()
     * @model default="unspecified" unsettable="true"
     *        extendedMetaData="kind='attribute' name='gatewayDirection'"
     * @generated
     */
    GatewayDirection getGatewayDirection();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Gateway#getGatewayDirection <em>Gateway Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gateway Direction</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.GatewayDirection
     * @see #isSetGatewayDirection()
     * @see #unsetGatewayDirection()
     * @see #getGatewayDirection()
     * @generated
     */
    void setGatewayDirection(GatewayDirection value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.Gateway#getGatewayDirection <em>Gateway Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGatewayDirection()
     * @see #getGatewayDirection()
     * @see #setGatewayDirection(GatewayDirection)
     * @generated
     */
    void unsetGatewayDirection();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.Gateway#getGatewayDirection <em>Gateway Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gateway Direction</em>' attribute is set.
     * @see #unsetGatewayDirection()
     * @see #getGatewayDirection()
     * @see #setGatewayDirection(GatewayDirection)
     * @generated
     */
    boolean isSetGatewayDirection();

} // Gateway
