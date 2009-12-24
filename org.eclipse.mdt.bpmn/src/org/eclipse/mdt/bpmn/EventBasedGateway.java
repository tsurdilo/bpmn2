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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.EventBasedGateway#isInstantiate <em>Instantiate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getEventBasedGateway()
 * @model extendedMetaData="name='tEventBasedGateway' kind='elementOnly'"
 * @generated
 */
public interface EventBasedGateway extends Gateway {
    /**
     * Returns the value of the '<em><b>Event Gateway Type</b></em>' attribute.
     * The default value is <code>"Exclusive"</code>.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn.EventBasedGatewayType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Gateway Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Gateway Type</em>' attribute.
     * @see org.eclipse.mdt.bpmn.EventBasedGatewayType
     * @see #isSetEventGatewayType()
     * @see #unsetEventGatewayType()
     * @see #setEventGatewayType(EventBasedGatewayType)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getEventBasedGateway_EventGatewayType()
     * @model default="Exclusive" unsettable="true"
     *        extendedMetaData="kind='attribute' name='eventGatewayType'"
     * @generated
     */
    EventBasedGatewayType getEventGatewayType();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Gateway Type</em>' attribute.
     * @see org.eclipse.mdt.bpmn.EventBasedGatewayType
     * @see #isSetEventGatewayType()
     * @see #unsetEventGatewayType()
     * @see #getEventGatewayType()
     * @generated
     */
    void setEventGatewayType(EventBasedGatewayType value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEventGatewayType()
     * @see #getEventGatewayType()
     * @see #setEventGatewayType(EventBasedGatewayType)
     * @generated
     */
    void unsetEventGatewayType();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Event Gateway Type</em>' attribute is set.
     * @see #unsetEventGatewayType()
     * @see #getEventGatewayType()
     * @see #setEventGatewayType(EventBasedGatewayType)
     * @generated
     */
    boolean isSetEventGatewayType();

    /**
     * Returns the value of the '<em><b>Instantiate</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiate</em>' attribute.
     * @see #isSetInstantiate()
     * @see #unsetInstantiate()
     * @see #setInstantiate(boolean)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getEventBasedGateway_Instantiate()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='instantiate'"
     * @generated
     */
    boolean isInstantiate();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.EventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiate</em>' attribute.
     * @see #isSetInstantiate()
     * @see #unsetInstantiate()
     * @see #isInstantiate()
     * @generated
     */
    void setInstantiate(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.EventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInstantiate()
     * @see #isInstantiate()
     * @see #setInstantiate(boolean)
     * @generated
     */
    void unsetInstantiate();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.EventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Instantiate</em>' attribute is set.
     * @see #unsetInstantiate()
     * @see #isInstantiate()
     * @see #setInstantiate(boolean)
     * @generated
     */
    boolean isSetInstantiate();

} // EventBasedGateway
