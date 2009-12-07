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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.UserTask#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.UserTask#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.UserTask#getInMessageRef <em>In Message Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.UserTask#getOutMessageRef <em>Out Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getUserTask()
 * @model extendedMetaData="name='tUserTask' kind='elementOnly'"
 * @generated
 */
public interface UserTask extends Task {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Rendering</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.Rendering}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rendering</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rendering</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getUserTask_Rendering()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='rendering' namespace='##targetNamespace'"
     * @generated
     */
    EList<Rendering> getRendering();

    /**
     * Returns the value of the '<em><b>Implementation</b></em>' attribute.
     * The default value is <code>"unspecified"</code>.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn2.UserTaskImplementation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.UserTaskImplementation
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #setImplementation(UserTaskImplementation)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getUserTask_Implementation()
     * @model default="unspecified" unsettable="true"
     *        extendedMetaData="kind='attribute' name='implementation'"
     * @generated
     */
    UserTaskImplementation getImplementation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.UserTask#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.UserTaskImplementation
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #getImplementation()
     * @generated
     */
    void setImplementation(UserTaskImplementation value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.UserTask#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImplementation()
     * @see #getImplementation()
     * @see #setImplementation(UserTaskImplementation)
     * @generated
     */
    void unsetImplementation();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.UserTask#getImplementation <em>Implementation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Implementation</em>' attribute is set.
     * @see #unsetImplementation()
     * @see #getImplementation()
     * @see #setImplementation(UserTaskImplementation)
     * @generated
     */
    boolean isSetImplementation();

    /**
     * Returns the value of the '<em><b>In Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Message Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Message Ref</em>' attribute.
     * @see #setInMessageRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getUserTask_InMessageRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='inMessageRef'"
     * @generated
     */
    QName getInMessageRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.UserTask#getInMessageRef <em>In Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Message Ref</em>' attribute.
     * @see #getInMessageRef()
     * @generated
     */
    void setInMessageRef(QName value);

    /**
     * Returns the value of the '<em><b>Out Message Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Out Message Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Out Message Ref</em>' attribute.
     * @see #setOutMessageRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getUserTask_OutMessageRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='outMessageRef'"
     * @generated
     */
    QName getOutMessageRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.UserTask#getOutMessageRef <em>Out Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Message Ref</em>' attribute.
     * @see #getOutMessageRef()
     * @generated
     */
    void setOutMessageRef(QName value);

} // UserTask
