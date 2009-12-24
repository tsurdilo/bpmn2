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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.CorrelationKey#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.BpmnPackage#getCorrelationKey()
 * @model extendedMetaData="name='tCorrelationKey' kind='elementOnly'"
 * @generated
 */
public interface CorrelationKey extends BaseElement {
    /**
     * Returns the value of the '<em><b>Correlation Property Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Property Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Property Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.BpmnPackage#getCorrelationKey_CorrelationPropertyRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='correlationPropertyRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getCorrelationPropertyRef();

} // CorrelationKey
