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
 * A representation of the model object '<em><b>Structure Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.StructureDefinition#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.StructureDefinition#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getStructureDefinition()
 * @model extendedMetaData="name='tStructureDefinition' kind='elementOnly'"
 * @generated
 */
public interface StructureDefinition extends RootElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Collection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Collection</em>' attribute.
     * @see #isSetIsCollection()
     * @see #unsetIsCollection()
     * @see #setIsCollection(boolean)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getStructureDefinition_IsCollection()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isCollection'"
     * @generated
     */
    boolean isIsCollection();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.StructureDefinition#isIsCollection <em>Is Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Collection</em>' attribute.
     * @see #isSetIsCollection()
     * @see #unsetIsCollection()
     * @see #isIsCollection()
     * @generated
     */
    void setIsCollection(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.StructureDefinition#isIsCollection <em>Is Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsCollection()
     * @see #isIsCollection()
     * @see #setIsCollection(boolean)
     * @generated
     */
    void unsetIsCollection();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.StructureDefinition#isIsCollection <em>Is Collection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Collection</em>' attribute is set.
     * @see #unsetIsCollection()
     * @see #isIsCollection()
     * @see #setIsCollection(boolean)
     * @generated
     */
    boolean isSetIsCollection();

    /**
     * Returns the value of the '<em><b>Structure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Structure</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Structure</em>' attribute.
     * @see #setStructure(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getStructureDefinition_Structure()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='structure'"
     * @generated
     */
    QName getStructure();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.StructureDefinition#getStructure <em>Structure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Structure</em>' attribute.
     * @see #getStructure()
     * @generated
     */
    void setStructure(QName value);

} // StructureDefinition
