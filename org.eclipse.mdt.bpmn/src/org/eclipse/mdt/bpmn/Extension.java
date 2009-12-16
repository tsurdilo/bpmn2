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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Extension#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Extension#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Extension#isMustUnderstand <em>Must Understand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getExtension()
 * @model extendedMetaData="name='tExtension' kind='elementOnly'"
 * @generated
 */
public interface Extension extends EObject {
    /**
     * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.Documentation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getExtension_Documentation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
     * @generated
     */
    EList<Documentation> getDocumentation();

    /**
     * Returns the value of the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Definition</em>' attribute.
     * @see #setDefinition(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getExtension_Definition()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='definition'"
     * @generated
     */
    QName getDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Extension#getDefinition <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definition</em>' attribute.
     * @see #getDefinition()
     * @generated
     */
    void setDefinition(QName value);

    /**
     * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Must Understand</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Must Understand</em>' attribute.
     * @see #isSetMustUnderstand()
     * @see #unsetMustUnderstand()
     * @see #setMustUnderstand(boolean)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getExtension_MustUnderstand()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='mustUnderstand'"
     * @generated
     */
    boolean isMustUnderstand();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Extension#isMustUnderstand <em>Must Understand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Must Understand</em>' attribute.
     * @see #isSetMustUnderstand()
     * @see #unsetMustUnderstand()
     * @see #isMustUnderstand()
     * @generated
     */
    void setMustUnderstand(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.Extension#isMustUnderstand <em>Must Understand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMustUnderstand()
     * @see #isMustUnderstand()
     * @see #setMustUnderstand(boolean)
     * @generated
     */
    void unsetMustUnderstand();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.Extension#isMustUnderstand <em>Must Understand</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Must Understand</em>' attribute is set.
     * @see #unsetMustUnderstand()
     * @see #isMustUnderstand()
     * @see #setMustUnderstand(boolean)
     * @generated
     */
    boolean isSetMustUnderstand();

} // Extension
