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

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ServiceTask#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ServiceTask#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getServiceTask()
 * @model extendedMetaData="name='tServiceTask' kind='elementOnly'"
 * @generated
 */
public interface ServiceTask extends Task {
    /**
     * Returns the value of the '<em><b>Implementation</b></em>' attribute.
     * The default value is <code>"WebService"</code>.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn.ServiceImplementation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation</em>' attribute.
     * @see org.eclipse.mdt.bpmn.ServiceImplementation
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #setImplementation(ServiceImplementation)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getServiceTask_Implementation()
     * @model default="WebService" unsettable="true"
     *        extendedMetaData="kind='attribute' name='implementation'"
     * @generated
     */
    ServiceImplementation getImplementation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ServiceTask#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation</em>' attribute.
     * @see org.eclipse.mdt.bpmn.ServiceImplementation
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #getImplementation()
     * @generated
     */
    void setImplementation(ServiceImplementation value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.ServiceTask#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImplementation()
     * @see #getImplementation()
     * @see #setImplementation(ServiceImplementation)
     * @generated
     */
    void unsetImplementation();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.ServiceTask#getImplementation <em>Implementation</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Operation Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation Ref</em>' attribute.
     * @see #setOperationRef(QName)
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getServiceTask_OperationRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='operationRef'"
     * @generated
     */
    QName getOperationRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ServiceTask#getOperationRef <em>Operation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation Ref</em>' attribute.
     * @see #getOperationRef()
     * @generated
     */
    void setOperationRef(QName value);

} // ServiceTask
