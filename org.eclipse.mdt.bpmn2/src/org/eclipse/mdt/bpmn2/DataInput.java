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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.DataInput#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.DataInput#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.DataInput#getStructureDefinitionRef <em>Structure Definition Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.DataInput#isWhileExecuting <em>While Executing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getDataInput()
 * @model extendedMetaData="name='tDataInput' kind='elementOnly'"
 * @generated
 */
public interface DataInput extends BaseElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getDataInput_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.DataInput#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Optional</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Optional</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Optional</em>' attribute.
     * @see #isSetOptional()
     * @see #unsetOptional()
     * @see #setOptional(boolean)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getDataInput_Optional()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='optional'"
     * @generated
     */
    boolean isOptional();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.DataInput#isOptional <em>Optional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Optional</em>' attribute.
     * @see #isSetOptional()
     * @see #unsetOptional()
     * @see #isOptional()
     * @generated
     */
    void setOptional(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.DataInput#isOptional <em>Optional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOptional()
     * @see #isOptional()
     * @see #setOptional(boolean)
     * @generated
     */
    void unsetOptional();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.DataInput#isOptional <em>Optional</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Optional</em>' attribute is set.
     * @see #unsetOptional()
     * @see #isOptional()
     * @see #setOptional(boolean)
     * @generated
     */
    boolean isSetOptional();

    /**
     * Returns the value of the '<em><b>Structure Definition Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Structure Definition Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Structure Definition Ref</em>' attribute.
     * @see #setStructureDefinitionRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getDataInput_StructureDefinitionRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='structureDefinitionRef'"
     * @generated
     */
    QName getStructureDefinitionRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.DataInput#getStructureDefinitionRef <em>Structure Definition Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Structure Definition Ref</em>' attribute.
     * @see #getStructureDefinitionRef()
     * @generated
     */
    void setStructureDefinitionRef(QName value);

    /**
     * Returns the value of the '<em><b>While Executing</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>While Executing</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>While Executing</em>' attribute.
     * @see #isSetWhileExecuting()
     * @see #unsetWhileExecuting()
     * @see #setWhileExecuting(boolean)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getDataInput_WhileExecuting()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='whileExecuting'"
     * @generated
     */
    boolean isWhileExecuting();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.DataInput#isWhileExecuting <em>While Executing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>While Executing</em>' attribute.
     * @see #isSetWhileExecuting()
     * @see #unsetWhileExecuting()
     * @see #isWhileExecuting()
     * @generated
     */
    void setWhileExecuting(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.DataInput#isWhileExecuting <em>While Executing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWhileExecuting()
     * @see #isWhileExecuting()
     * @see #setWhileExecuting(boolean)
     * @generated
     */
    void unsetWhileExecuting();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.DataInput#isWhileExecuting <em>While Executing</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>While Executing</em>' attribute is set.
     * @see #unsetWhileExecuting()
     * @see #isWhileExecuting()
     * @see #setWhileExecuting(boolean)
     * @generated
     */
    boolean isSetWhileExecuting();

} // DataInput
