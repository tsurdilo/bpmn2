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

import java.util.List;
import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.CallableElement#getSupportedInterfaceRefs <em>Supported Interface Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CallableElement#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CallableElement#getIoBindings <em>Io Bindings</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CallableElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getCallableElement()
 * @model extendedMetaData="name='tCallableElement' kind='elementOnly'"
 * @generated
 */
public interface CallableElement extends RootElement {
    /**
     * Returns the value of the '<em><b>Supported Interface Refs</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supported Interface Refs</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supported Interface Refs</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getCallableElement_SupportedInterfaceRefs()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='supportedInterfaceRef' namespace='##targetNamespace'"
     * @generated
     */
    List<QName> getSupportedInterfaceRefs();

    /**
     * Returns the value of the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Io Specification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Io Specification</em>' containment reference.
     * @see #setIoSpecification(InputOutputSpecification)
     * @see org.eclipse.bpmn.BpmnPackage#getCallableElement_IoSpecification()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ioSpecification' namespace='##targetNamespace'"
     * @generated
     */
    InputOutputSpecification getIoSpecification();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.CallableElement#getIoSpecification <em>Io Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Io Specification</em>' containment reference.
     * @see #getIoSpecification()
     * @generated
     */
    void setIoSpecification(InputOutputSpecification value);

    /**
     * Returns the value of the '<em><b>Io Bindings</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.InputOutputBinding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Io Bindings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Io Bindings</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getCallableElement_IoBindings()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ioBinding' namespace='##targetNamespace'"
     * @generated
     */
    List<InputOutputBinding> getIoBindings();

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
     * @see org.eclipse.bpmn.BpmnPackage#getCallableElement_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.CallableElement#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // CallableElement
