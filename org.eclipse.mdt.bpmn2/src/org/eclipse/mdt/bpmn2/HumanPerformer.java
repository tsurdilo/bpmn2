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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.HumanPerformer#getPeopleAssignmentGroup <em>People Assignment Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.HumanPerformer#getPeopleAssignment <em>People Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getHumanPerformer()
 * @model extendedMetaData="name='tHumanPerformer' kind='elementOnly'"
 * @generated
 */
public interface HumanPerformer extends Performer {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>People Assignment Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>People Assignment Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>People Assignment Group</em>' attribute list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getHumanPerformer_PeopleAssignmentGroup()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
     *        extendedMetaData="kind='group' name='peopleAssignment:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getPeopleAssignmentGroup();

    /**
     * Returns the value of the '<em><b>People Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>People Assignment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>People Assignment</em>' containment reference.
     * @see #setPeopleAssignment(PeopleAssignment)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getHumanPerformer_PeopleAssignment()
     * @model containment="true" required="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='peopleAssignment' namespace='##targetNamespace' group='peopleAssignment:group'"
     * @generated
     */
    PeopleAssignment getPeopleAssignment();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.HumanPerformer#getPeopleAssignment <em>People Assignment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>People Assignment</em>' containment reference.
     * @see #getPeopleAssignment()
     * @generated
     */
    void setPeopleAssignment(PeopleAssignment value);

} // HumanPerformer
