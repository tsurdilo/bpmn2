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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.CatchEvent#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CatchEvent#getDataOutputAssociations <em>Data Output Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CatchEvent#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CatchEvent#getEventDefinitionGroups <em>Event Definition Groups</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CatchEvent#getEventDefinitions <em>Event Definitions</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CatchEvent#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getCatchEvent()
 * @model abstract="true"
 *        extendedMetaData="name='tCatchEvent' kind='elementOnly'"
 * @generated
 */
public interface CatchEvent extends Event {
    /**
     * Returns the value of the '<em><b>Data Outputs</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.DataOutput}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Outputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Outputs</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getCatchEvent_DataOutputs()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataOutput' namespace='##targetNamespace'"
     * @generated
     */
    EList<DataOutput> getDataOutputs();

    /**
     * Returns the value of the '<em><b>Data Output Associations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.DataOutputAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output Associations</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getCatchEvent_DataOutputAssociations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataOutputAssociation' namespace='##targetNamespace'"
     * @generated
     */
    EList<DataOutputAssociation> getDataOutputAssociations();

    /**
     * Returns the value of the '<em><b>Output Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Set</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Set</em>' containment reference.
     * @see #setOutputSet(OutputSet)
     * @see org.eclipse.bpmn.BpmnPackage#getCatchEvent_OutputSet()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='outputSet' namespace='##targetNamespace'"
     * @generated
     */
    OutputSet getOutputSet();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.CatchEvent#getOutputSet <em>Output Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Set</em>' containment reference.
     * @see #getOutputSet()
     * @generated
     */
    void setOutputSet(OutputSet value);

    /**
     * Returns the value of the '<em><b>Event Definition Groups</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Definition Groups</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Definition Groups</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getCatchEvent_EventDefinitionGroups()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='eventDefinition:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getEventDefinitionGroups();

    /**
     * Returns the value of the '<em><b>Event Definitions</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.EventDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Definitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Definitions</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getCatchEvent_EventDefinitions()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='eventDefinition' namespace='##targetNamespace' group='eventDefinition:group'"
     * @generated
     */
    EList<EventDefinition> getEventDefinitions();

    /**
     * Returns the value of the '<em><b>Event Definition Refs</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Definition Refs</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Definition Refs</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getCatchEvent_EventDefinitionRefs()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='eventDefinitionRef' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getEventDefinitionRefs();

    /**
     * Returns the value of the '<em><b>Parallel Multiple</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parallel Multiple</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parallel Multiple</em>' attribute.
     * @see #isSetParallelMultiple()
     * @see #unsetParallelMultiple()
     * @see #setParallelMultiple(boolean)
     * @see org.eclipse.bpmn.BpmnPackage#getCatchEvent_ParallelMultiple()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='parallelMultiple'"
     * @generated
     */
    boolean isParallelMultiple();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parallel Multiple</em>' attribute.
     * @see #isSetParallelMultiple()
     * @see #unsetParallelMultiple()
     * @see #isParallelMultiple()
     * @generated
     */
    void setParallelMultiple(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.bpmn.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetParallelMultiple()
     * @see #isParallelMultiple()
     * @see #setParallelMultiple(boolean)
     * @generated
     */
    void unsetParallelMultiple();

    /**
     * Returns whether the value of the '{@link org.eclipse.bpmn.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Parallel Multiple</em>' attribute is set.
     * @see #unsetParallelMultiple()
     * @see #isParallelMultiple()
     * @see #setParallelMultiple(boolean)
     * @generated
     */
    boolean isSetParallelMultiple();

} // CatchEvent
