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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.ThrowEvent#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ThrowEvent#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ThrowEvent#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ThrowEvent#getEventDefinitionGroup <em>Event Definition Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ThrowEvent#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.ThrowEvent#getEventDefinitionRef <em>Event Definition Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getThrowEvent()
 * @model abstract="true"
 *        extendedMetaData="name='tThrowEvent' kind='elementOnly'"
 * @generated
 */
public interface ThrowEvent extends Event {
    /**
     * Returns the value of the '<em><b>Data Input</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.DataInput}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Input</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Input</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getThrowEvent_DataInput()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataInput' namespace='##targetNamespace'"
     * @generated
     */
    EList<DataInput> getDataInput();

    /**
     * Returns the value of the '<em><b>Data Input Association</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.DataInputAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Input Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Input Association</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getThrowEvent_DataInputAssociation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataInputAssociation' namespace='##targetNamespace'"
     * @generated
     */
    EList<DataInputAssociation> getDataInputAssociation();

    /**
     * Returns the value of the '<em><b>Input Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Set</em>' containment reference.
     * @see #setInputSet(InputSet)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getThrowEvent_InputSet()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inputSet' namespace='##targetNamespace'"
     * @generated
     */
    InputSet getInputSet();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.ThrowEvent#getInputSet <em>Input Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Set</em>' containment reference.
     * @see #getInputSet()
     * @generated
     */
    void setInputSet(InputSet value);

    /**
     * Returns the value of the '<em><b>Event Definition Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Definition Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Definition Group</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getThrowEvent_EventDefinitionGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='eventDefinition:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getEventDefinitionGroup();

    /**
     * Returns the value of the '<em><b>Event Definition</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.EventDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Definition</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Definition</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getThrowEvent_EventDefinition()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventDefinition' namespace='##targetNamespace' group='eventDefinition:group'"
     * @generated
     */
    EList<EventDefinition> getEventDefinition();

    /**
     * Returns the value of the '<em><b>Event Definition Ref</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Definition Ref</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Definition Ref</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getThrowEvent_EventDefinitionRef()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='eventDefinitionRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getEventDefinitionRef();

} // ThrowEvent
