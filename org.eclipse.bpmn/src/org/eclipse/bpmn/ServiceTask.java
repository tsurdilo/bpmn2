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

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.ServiceTask#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.ServiceTask#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getServiceTask()
 * @model extendedMetaData="name='tServiceTask' kind='elementOnly'"
 * @generated
 */
public interface ServiceTask extends Task {
    /**
     * Returns the value of the '<em><b>Implementation</b></em>' attribute.
     * The default value is <code>"WebService"</code>.
     * The literals are from the enumeration {@link org.eclipse.bpmn.ServiceImplementation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation</em>' attribute.
     * @see org.eclipse.bpmn.ServiceImplementation
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #setImplementation(ServiceImplementation)
     * @see org.eclipse.bpmn.BpmnPackage#getServiceTask_Implementation()
     * @model default="WebService" unsettable="true"
     *        extendedMetaData="kind='attribute' name='implementation'"
     * @generated
     */
    ServiceImplementation getImplementation();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.ServiceTask#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation</em>' attribute.
     * @see org.eclipse.bpmn.ServiceImplementation
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #getImplementation()
     * @generated
     */
    void setImplementation(ServiceImplementation value);

    /**
     * Unsets the value of the '{@link org.eclipse.bpmn.ServiceTask#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImplementation()
     * @see #getImplementation()
     * @see #setImplementation(ServiceImplementation)
     * @generated
     */
    void unsetImplementation();

    /**
     * Returns whether the value of the '{@link org.eclipse.bpmn.ServiceTask#getImplementation <em>Implementation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Implementation</em>' attribute is set.
     * @see #unsetImplementation()
     * @see #getImplementation()
     * @see #setImplementation(ServiceImplementation)
     * @generated
     */
    boolean isSetImplementation();

    /**
     * Returns the value of the '<em><b>Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' attribute.
     * @see #setOperation(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getServiceTask_Operation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='operationRef'"
     * @generated
     */
    QName getOperation();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.ServiceTask#getOperation <em>Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' attribute.
     * @see #getOperation()
     * @generated
     */
    void setOperation(QName value);

} // ServiceTask
