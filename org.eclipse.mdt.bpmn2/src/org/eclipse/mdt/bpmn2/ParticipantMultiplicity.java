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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMinimum <em>Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipantMultiplicity()
 * @model extendedMetaData="name='tParticipantMultiplicity' kind='elementOnly'"
 * @generated
 */
public interface ParticipantMultiplicity extends BaseElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Maximum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum</em>' attribute.
     * @see #isSetMaximum()
     * @see #unsetMaximum()
     * @see #setMaximum(int)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipantMultiplicity_Maximum()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='maximum'"
     * @generated
     */
    int getMaximum();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMaximum <em>Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum</em>' attribute.
     * @see #isSetMaximum()
     * @see #unsetMaximum()
     * @see #getMaximum()
     * @generated
     */
    void setMaximum(int value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMaximum <em>Maximum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximum()
     * @see #getMaximum()
     * @see #setMaximum(int)
     * @generated
     */
    void unsetMaximum();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMaximum <em>Maximum</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum</em>' attribute is set.
     * @see #unsetMaximum()
     * @see #getMaximum()
     * @see #setMaximum(int)
     * @generated
     */
    boolean isSetMaximum();

    /**
     * Returns the value of the '<em><b>Minimum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum</em>' attribute.
     * @see #isSetMinimum()
     * @see #unsetMinimum()
     * @see #setMinimum(int)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getParticipantMultiplicity_Minimum()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='minimum'"
     * @generated
     */
    int getMinimum();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMinimum <em>Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum</em>' attribute.
     * @see #isSetMinimum()
     * @see #unsetMinimum()
     * @see #getMinimum()
     * @generated
     */
    void setMinimum(int value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMinimum <em>Minimum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinimum()
     * @see #getMinimum()
     * @see #setMinimum(int)
     * @generated
     */
    void unsetMinimum();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.ParticipantMultiplicity#getMinimum <em>Minimum</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Minimum</em>' attribute is set.
     * @see #unsetMinimum()
     * @see #getMinimum()
     * @see #setMinimum(int)
     * @generated
     */
    boolean isSetMinimum();

} // ParticipantMultiplicity
