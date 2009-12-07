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
 * A representation of the model object '<em><b>Service Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.ServiceReference#getInterfaceRef <em>Interface Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.ServiceReference#getEndPointRef <em>End Point Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.ServiceReference#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.ServiceReference#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getServiceReference()
 * @model extendedMetaData="name='tServiceReference' kind='elementOnly'"
 * @generated
 */
public interface ServiceReference extends RootElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Interface Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface Ref</em>' attribute.
     * @see #setInterfaceRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getServiceReference_InterfaceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='element' name='interfaceRef' namespace='##targetNamespace'"
     * @generated
     */
    QName getInterfaceRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.ServiceReference#getInterfaceRef <em>Interface Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface Ref</em>' attribute.
     * @see #getInterfaceRef()
     * @generated
     */
    void setInterfaceRef(QName value);

    /**
     * Returns the value of the '<em><b>End Point Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Point Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Point Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getServiceReference_EndPointRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='endPointRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getEndPointRef();

    /**
     * Returns the value of the '<em><b>Implementation</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn2.ServiceImplementation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Implementation</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.ServiceImplementation
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #setImplementation(ServiceImplementation)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getServiceReference_Implementation()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='implementation'"
     * @generated
     */
    ServiceImplementation getImplementation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.ServiceReference#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implementation</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.ServiceImplementation
     * @see #isSetImplementation()
     * @see #unsetImplementation()
     * @see #getImplementation()
     * @generated
     */
    void setImplementation(ServiceImplementation value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.ServiceReference#getImplementation <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImplementation()
     * @see #getImplementation()
     * @see #setImplementation(ServiceImplementation)
     * @generated
     */
    void unsetImplementation();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.ServiceReference#getImplementation <em>Implementation</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getServiceReference_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.ServiceReference#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ServiceReference
