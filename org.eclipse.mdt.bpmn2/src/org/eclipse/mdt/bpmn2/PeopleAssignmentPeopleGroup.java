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
 * A representation of the model object '<em><b>People Assignment People Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getPeopleAssignmentPeopleGroup()
 * @model extendedMetaData="name='tPeopleAssignmentPeopleGroup' kind='elementOnly'"
 * @generated
 */
public interface PeopleAssignmentPeopleGroup extends PeopleAssignment {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.ParameterBinding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getPeopleAssignmentPeopleGroup_Parameter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
     * @generated
     */
    EList<ParameterBinding> getParameter();

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getPeopleAssignmentPeopleGroup_Definition()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
     *        extendedMetaData="kind='attribute' name='definition'"
     * @generated
     */
    QName getDefinition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup#getDefinition <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definition</em>' attribute.
     * @see #getDefinition()
     * @generated
     */
    void setDefinition(QName value);

} // PeopleAssignmentPeopleGroup
