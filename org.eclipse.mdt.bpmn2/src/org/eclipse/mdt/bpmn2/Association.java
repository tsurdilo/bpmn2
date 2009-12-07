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
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.Association#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Association#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Association#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getAssociation()
 * @model extendedMetaData="name='tAssociation' kind='elementOnly'"
 * @generated
 */
public interface Association extends Artifact {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Association Direction</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn2.AssociationDirection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Association Direction</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.AssociationDirection
     * @see #isSetAssociationDirection()
     * @see #unsetAssociationDirection()
     * @see #setAssociationDirection(AssociationDirection)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getAssociation_AssociationDirection()
     * @model default="none" unsettable="true"
     *        extendedMetaData="kind='attribute' name='associationDirection'"
     * @generated
     */
    AssociationDirection getAssociationDirection();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Association#getAssociationDirection <em>Association Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Association Direction</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.AssociationDirection
     * @see #isSetAssociationDirection()
     * @see #unsetAssociationDirection()
     * @see #getAssociationDirection()
     * @generated
     */
    void setAssociationDirection(AssociationDirection value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.Association#getAssociationDirection <em>Association Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssociationDirection()
     * @see #getAssociationDirection()
     * @see #setAssociationDirection(AssociationDirection)
     * @generated
     */
    void unsetAssociationDirection();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.Association#getAssociationDirection <em>Association Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Association Direction</em>' attribute is set.
     * @see #unsetAssociationDirection()
     * @see #getAssociationDirection()
     * @see #setAssociationDirection(AssociationDirection)
     * @generated
     */
    boolean isSetAssociationDirection();

    /**
     * Returns the value of the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Ref</em>' attribute.
     * @see #setSourceRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getAssociation_SourceRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='sourceRef'"
     * @generated
     */
    QName getSourceRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Association#getSourceRef <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Ref</em>' attribute.
     * @see #getSourceRef()
     * @generated
     */
    void setSourceRef(QName value);

    /**
     * Returns the value of the '<em><b>Target Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Ref</em>' attribute.
     * @see #setTargetRef(QName)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getAssociation_TargetRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='targetRef'"
     * @generated
     */
    QName getTargetRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Association#getTargetRef <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Ref</em>' attribute.
     * @see #getTargetRef()
     * @generated
     */
    void setTargetRef(QName value);

} // Association
