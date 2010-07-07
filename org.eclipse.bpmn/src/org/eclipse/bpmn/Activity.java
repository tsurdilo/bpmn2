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

import java.math.BigInteger;

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.Activity#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getDataInputAssociations <em>Data Input Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getDataOutputAssociations <em>Data Output Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getActivityResourceGroups <em>Activity Resource Groups</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getActivityResources <em>Activity Resources</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getLoopCharacteristicsGroup <em>Loop Characteristics Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getCompletionQuantity <em>Completion Quantity</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#isIsForCompensation <em>Is For Compensation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.Activity#getStartQuantity <em>Start Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getActivity()
 * @model abstract="true"
 *        extendedMetaData="name='tActivity' kind='elementOnly'"
 * @generated
 */
public interface Activity extends FlowNode {
    /**
     * Returns the value of the '<em><b>Io Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Io Specification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Io Specification</em>' containment reference.
     * @see #setIoSpecification(InputOutputSpecification)
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_IoSpecification()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ioSpecification' namespace='##targetNamespace'"
     * @generated
     */
    InputOutputSpecification getIoSpecification();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Activity#getIoSpecification <em>Io Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Io Specification</em>' containment reference.
     * @see #getIoSpecification()
     * @generated
     */
    void setIoSpecification(InputOutputSpecification value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_Properties()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    List<Property> getProperties();

    /**
     * Returns the value of the '<em><b>Data Input Associations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.DataInputAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Input Associations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Input Associations</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_DataInputAssociations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataInputAssociation' namespace='##targetNamespace'"
     * @generated
     */
    List<DataInputAssociation> getDataInputAssociations();

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
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_DataOutputAssociations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataOutputAssociation' namespace='##targetNamespace'"
     * @generated
     */
    List<DataOutputAssociation> getDataOutputAssociations();

    /**
     * Returns the value of the '<em><b>Activity Resource Groups</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Resource Groups</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Resource Groups</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_ActivityResourceGroups()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='activityResource:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getActivityResourceGroups();

    /**
     * Returns the value of the '<em><b>Activity Resources</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.ActivityResource}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Resources</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Resources</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_ActivityResources()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='activityResource' namespace='##targetNamespace' group='activityResource:group'"
     * @generated
     */
    List<ActivityResource> getActivityResources();

    /**
     * Returns the value of the '<em><b>Loop Characteristics Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Characteristics Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Characteristics Group</em>' attribute list.
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_LoopCharacteristicsGroup()
     * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
     *        extendedMetaData="kind='group' name='loopCharacteristics:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getLoopCharacteristicsGroup();

    /**
     * Returns the value of the '<em><b>Loop Characteristics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Characteristics</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Characteristics</em>' containment reference.
     * @see #setLoopCharacteristics(LoopCharacteristics)
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_LoopCharacteristics()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loopCharacteristics' namespace='##targetNamespace' group='loopCharacteristics:group'"
     * @generated
     */
    LoopCharacteristics getLoopCharacteristics();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Characteristics</em>' containment reference.
     * @see #getLoopCharacteristics()
     * @generated
     */
    void setLoopCharacteristics(LoopCharacteristics value);

    /**
     * Returns the value of the '<em><b>Completion Quantity</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Completion Quantity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Completion Quantity</em>' attribute.
     * @see #isSetCompletionQuantity()
     * @see #unsetCompletionQuantity()
     * @see #setCompletionQuantity(BigInteger)
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_CompletionQuantity()
     * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
     *        extendedMetaData="kind='attribute' name='completionQuantity'"
     * @generated
     */
    BigInteger getCompletionQuantity();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Activity#getCompletionQuantity <em>Completion Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completion Quantity</em>' attribute.
     * @see #isSetCompletionQuantity()
     * @see #unsetCompletionQuantity()
     * @see #getCompletionQuantity()
     * @generated
     */
    void setCompletionQuantity(BigInteger value);

    /**
     * Unsets the value of the '{@link org.eclipse.bpmn.Activity#getCompletionQuantity <em>Completion Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCompletionQuantity()
     * @see #getCompletionQuantity()
     * @see #setCompletionQuantity(BigInteger)
     * @generated
     */
    void unsetCompletionQuantity();

    /**
     * Returns whether the value of the '{@link org.eclipse.bpmn.Activity#getCompletionQuantity <em>Completion Quantity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Completion Quantity</em>' attribute is set.
     * @see #unsetCompletionQuantity()
     * @see #getCompletionQuantity()
     * @see #setCompletionQuantity(BigInteger)
     * @generated
     */
    boolean isSetCompletionQuantity();

    /**
     * Returns the value of the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default</em>' attribute.
     * @see #setDefault(String)
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_Default()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='attribute' name='default'"
     * @generated
     */
    String getDefault();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Activity#getDefault <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' attribute.
     * @see #getDefault()
     * @generated
     */
    void setDefault(String value);

    /**
     * Returns the value of the '<em><b>Is For Compensation</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is For Compensation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is For Compensation</em>' attribute.
     * @see #isSetIsForCompensation()
     * @see #unsetIsForCompensation()
     * @see #setIsForCompensation(boolean)
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_IsForCompensation()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isForCompensation'"
     * @generated
     */
    boolean isIsForCompensation();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Activity#isIsForCompensation <em>Is For Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is For Compensation</em>' attribute.
     * @see #isSetIsForCompensation()
     * @see #unsetIsForCompensation()
     * @see #isIsForCompensation()
     * @generated
     */
    void setIsForCompensation(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.bpmn.Activity#isIsForCompensation <em>Is For Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsForCompensation()
     * @see #isIsForCompensation()
     * @see #setIsForCompensation(boolean)
     * @generated
     */
    void unsetIsForCompensation();

    /**
     * Returns whether the value of the '{@link org.eclipse.bpmn.Activity#isIsForCompensation <em>Is For Compensation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is For Compensation</em>' attribute is set.
     * @see #unsetIsForCompensation()
     * @see #isIsForCompensation()
     * @see #setIsForCompensation(boolean)
     * @generated
     */
    boolean isSetIsForCompensation();

    /**
     * Returns the value of the '<em><b>Start Quantity</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Quantity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Quantity</em>' attribute.
     * @see #isSetStartQuantity()
     * @see #unsetStartQuantity()
     * @see #setStartQuantity(BigInteger)
     * @see org.eclipse.bpmn.BpmnPackage#getActivity_StartQuantity()
     * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
     *        extendedMetaData="kind='attribute' name='startQuantity'"
     * @generated
     */
    BigInteger getStartQuantity();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.Activity#getStartQuantity <em>Start Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Quantity</em>' attribute.
     * @see #isSetStartQuantity()
     * @see #unsetStartQuantity()
     * @see #getStartQuantity()
     * @generated
     */
    void setStartQuantity(BigInteger value);

    /**
     * Unsets the value of the '{@link org.eclipse.bpmn.Activity#getStartQuantity <em>Start Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartQuantity()
     * @see #getStartQuantity()
     * @see #setStartQuantity(BigInteger)
     * @generated
     */
    void unsetStartQuantity();

    /**
     * Returns whether the value of the '{@link org.eclipse.bpmn.Activity#getStartQuantity <em>Start Quantity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Quantity</em>' attribute is set.
     * @see #unsetStartQuantity()
     * @see #getStartQuantity()
     * @see #setStartQuantity(BigInteger)
     * @generated
     */
    boolean isSetStartQuantity();

} // Activity
