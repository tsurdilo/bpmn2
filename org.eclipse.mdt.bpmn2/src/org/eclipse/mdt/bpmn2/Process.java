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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.Process#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Process#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Process#getProcessRole <em>Process Role</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Process#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Process#getLaneSet <em>Lane Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Process#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Process#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Process#getProcessType <em>Process Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getProcess()
 * @model extendedMetaData="name='tProcess' kind='elementOnly'"
 * @generated
 */
public interface Process extends CallableElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Auditing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auditing</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auditing</em>' containment reference.
     * @see #setAuditing(Auditing)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getProcess_Auditing()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='auditing' namespace='##targetNamespace'"
     * @generated
     */
    Auditing getAuditing();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Process#getAuditing <em>Auditing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auditing</em>' containment reference.
     * @see #getAuditing()
     * @generated
     */
    void setAuditing(Auditing value);

    /**
     * Returns the value of the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitoring</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitoring</em>' containment reference.
     * @see #setMonitoring(Monitoring)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getProcess_Monitoring()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='monitoring' namespace='##targetNamespace'"
     * @generated
     */
    Monitoring getMonitoring();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Process#getMonitoring <em>Monitoring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitoring</em>' containment reference.
     * @see #getMonitoring()
     * @generated
     */
    void setMonitoring(Monitoring value);

    /**
     * Returns the value of the '<em><b>Process Role</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.ProcessRole}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Role</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Role</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getProcess_ProcessRole()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='processRole' namespace='##targetNamespace'"
     * @generated
     */
    EList<ProcessRole> getProcessRole();

    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getProcess_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    EList<Property> getProperty();

    /**
     * Returns the value of the '<em><b>Lane Set</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.LaneSet}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lane Set</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lane Set</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getProcess_LaneSet()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='laneSet' namespace='##targetNamespace'"
     * @generated
     */
    EList<LaneSet> getLaneSet();

    /**
     * Returns the value of the '<em><b>Flow Element Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element Group</em>' attribute list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getProcess_FlowElementGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='flowElement:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getFlowElementGroup();

    /**
     * Returns the value of the '<em><b>Flow Element</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.FlowElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getProcess_FlowElement()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flowElement' namespace='##targetNamespace' group='flowElement:group'"
     * @generated
     */
    EList<FlowElement> getFlowElement();

    /**
     * Returns the value of the '<em><b>Process Type</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn2.ProcessType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Type</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.ProcessType
     * @see #isSetProcessType()
     * @see #unsetProcessType()
     * @see #setProcessType(ProcessType)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getProcess_ProcessType()
     * @model default="none" unsettable="true"
     *        extendedMetaData="kind='attribute' name='processType'"
     * @generated
     */
    ProcessType getProcessType();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Process#getProcessType <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Type</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.ProcessType
     * @see #isSetProcessType()
     * @see #unsetProcessType()
     * @see #getProcessType()
     * @generated
     */
    void setProcessType(ProcessType value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.Process#getProcessType <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcessType()
     * @see #getProcessType()
     * @see #setProcessType(ProcessType)
     * @generated
     */
    void unsetProcessType();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.Process#getProcessType <em>Process Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Process Type</em>' attribute is set.
     * @see #unsetProcessType()
     * @see #getProcessType()
     * @see #setProcessType(ProcessType)
     * @generated
     */
    boolean isSetProcessType();

} // Process
