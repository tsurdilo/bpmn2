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
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getLaneSet <em>Lane Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.Process#getProcessType <em>Process Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess()
 * @model extendedMetaData="name='tProcess' kind='elementOnly'"
 * @generated
 */
public interface Process extends CallableElement {
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
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_Auditing()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='auditing' namespace='##targetNamespace'"
     * @generated
     */
    Auditing getAuditing();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Process#getAuditing <em>Auditing</em>}' containment reference.
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
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_Monitoring()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='monitoring' namespace='##targetNamespace'"
     * @generated
     */
    Monitoring getMonitoring();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Process#getMonitoring <em>Monitoring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitoring</em>' containment reference.
     * @see #getMonitoring()
     * @generated
     */
    void setMonitoring(Monitoring value);

    /**
     * Returns the value of the '<em><b>Property</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    EList<Property> getProperty();

    /**
     * Returns the value of the '<em><b>Lane Set</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.LaneSet}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lane Set</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lane Set</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_LaneSet()
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
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_FlowElementGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='flowElement:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getFlowElementGroup();

    /**
     * Returns the value of the '<em><b>Flow Element</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.FlowElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Element</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_FlowElement()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='flowElement' namespace='##targetNamespace' group='flowElement:group'"
     * @generated
     */
    EList<FlowElement> getFlowElement();

    /**
     * Returns the value of the '<em><b>Artifact Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact Group</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_ArtifactGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='artifact:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getArtifactGroup();

    /**
     * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.Artifact}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_Artifact()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' group='artifact:group'"
     * @generated
     */
    EList<Artifact> getArtifact();

    /**
     * Returns the value of the '<em><b>Supports</b></em>' attribute list.
     * The list contents are of type {@link javax.xml.namespace.QName}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supports</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supports</em>' attribute list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_Supports()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='element' name='supports' namespace='##targetNamespace'"
     * @generated
     */
    EList<QName> getSupports();

    /**
     * Returns the value of the '<em><b>Definitional Collaboration Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definitional Collaboration Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Definitional Collaboration Ref</em>' attribute.
     * @see #setDefinitionalCollaborationRef(QName)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_DefinitionalCollaborationRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='definitionalCollaborationRef'"
     * @generated
     */
    QName getDefinitionalCollaborationRef();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definitional Collaboration Ref</em>' attribute.
     * @see #getDefinitionalCollaborationRef()
     * @generated
     */
    void setDefinitionalCollaborationRef(QName value);

    /**
     * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Closed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Closed</em>' attribute.
     * @see #isSetIsClosed()
     * @see #unsetIsClosed()
     * @see #setIsClosed(boolean)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_IsClosed()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isClosed'"
     * @generated
     */
    boolean isIsClosed();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Process#isIsClosed <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Closed</em>' attribute.
     * @see #isSetIsClosed()
     * @see #unsetIsClosed()
     * @see #isIsClosed()
     * @generated
     */
    void setIsClosed(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.Process#isIsClosed <em>Is Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsClosed()
     * @see #isIsClosed()
     * @see #setIsClosed(boolean)
     * @generated
     */
    void unsetIsClosed();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.Process#isIsClosed <em>Is Closed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Closed</em>' attribute is set.
     * @see #unsetIsClosed()
     * @see #isIsClosed()
     * @see #setIsClosed(boolean)
     * @generated
     */
    boolean isSetIsClosed();

    /**
     * Returns the value of the '<em><b>Process Type</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn.ProcessType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Type</em>' attribute.
     * @see org.eclipse.mdt.bpmn.ProcessType
     * @see #isSetProcessType()
     * @see #unsetProcessType()
     * @see #setProcessType(ProcessType)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getProcess_ProcessType()
     * @model default="none" unsettable="true"
     *        extendedMetaData="kind='attribute' name='processType'"
     * @generated
     */
    ProcessType getProcessType();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.Process#getProcessType <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Type</em>' attribute.
     * @see org.eclipse.mdt.bpmn.ProcessType
     * @see #isSetProcessType()
     * @see #unsetProcessType()
     * @see #getProcessType()
     * @generated
     */
    void setProcessType(ProcessType value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.Process#getProcessType <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcessType()
     * @see #getProcessType()
     * @see #setProcessType(ProcessType)
     * @generated
     */
    void unsetProcessType();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.Process#getProcessType <em>Process Type</em>}' attribute is set.
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
