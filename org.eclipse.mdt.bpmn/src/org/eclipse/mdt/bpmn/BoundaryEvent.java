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
 * A representation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getBoundaryEvent()
 * @model extendedMetaData="name='tBoundaryEvent' kind='elementOnly'"
 * @generated
 */
public interface BoundaryEvent extends CatchEvent {
    /**
     * Returns the value of the '<em><b>Attached To Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attached To Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attached To Ref</em>' attribute.
     * @see #setAttachedToRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getBoundaryEvent_AttachedToRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='attachedToRef'"
     * @generated
     */
    QName getAttachedToRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attached To Ref</em>' attribute.
     * @see #getAttachedToRef()
     * @generated
     */
    void setAttachedToRef(QName value);

    /**
     * Returns the value of the '<em><b>Cancel Activity</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cancel Activity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cancel Activity</em>' attribute.
     * @see #isSetCancelActivity()
     * @see #unsetCancelActivity()
     * @see #setCancelActivity(boolean)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getBoundaryEvent_CancelActivity()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='cancelActivity'"
     * @generated
     */
    boolean isCancelActivity();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancel Activity</em>' attribute.
     * @see #isSetCancelActivity()
     * @see #unsetCancelActivity()
     * @see #isCancelActivity()
     * @generated
     */
    void setCancelActivity(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCancelActivity()
     * @see #isCancelActivity()
     * @see #setCancelActivity(boolean)
     * @generated
     */
    void unsetCancelActivity();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cancel Activity</em>' attribute is set.
     * @see #unsetCancelActivity()
     * @see #isCancelActivity()
     * @see #setCancelActivity(boolean)
     * @generated
     */
    boolean isSetCancelActivity();

} // BoundaryEvent
