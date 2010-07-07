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
 * A representation of the model object '<em><b>Call Choreography Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.CallChoreographyActivity#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CallChoreographyActivity#getCalledElement <em>Called Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getCallChoreographyActivity()
 * @model extendedMetaData="name='tCallChoreographyActivity' kind='elementOnly'"
 * @generated
 */
public interface CallChoreographyActivity extends ChoreographyActivity {
    /**
     * Returns the value of the '<em><b>Participant Associations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.ParticipantAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participant Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participant Associations</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getCallChoreographyActivity_ParticipantAssociations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='participantAssociation' namespace='##targetNamespace'"
     * @generated
     */
    List<ParticipantAssociation> getParticipantAssociations();

    /**
     * Returns the value of the '<em><b>Called Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Called Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Called Element</em>' attribute.
     * @see #setCalledElement(QName)
     * @see org.eclipse.bpmn.BpmnPackage#getCallChoreographyActivity_CalledElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='calledElement'"
     * @generated
     */
    QName getCalledElement();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.CallChoreographyActivity#getCalledElement <em>Called Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Called Element</em>' attribute.
     * @see #getCalledElement()
     * @generated
     */
    void setCalledElement(QName value);

} // CallChoreographyActivity
