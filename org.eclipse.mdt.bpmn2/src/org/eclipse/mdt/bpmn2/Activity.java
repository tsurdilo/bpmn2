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
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#getPerformerGroup <em>Performer Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#getLoopCharacteristicsGroup <em>Loop Characteristics Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.Activity#isIsForCompensation <em>Is For Compensation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity()
 * @model abstract="true"
 *        extendedMetaData="name='tActivity' kind='elementOnly'"
 * @generated
 */
public interface Activity extends FlowNode {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_IoSpecification()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ioSpecification' namespace='##targetNamespace'"
     * @generated
     */
    InputOutputSpecification getIoSpecification();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Activity#getIoSpecification <em>Io Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Io Specification</em>' containment reference.
     * @see #getIoSpecification()
     * @generated
     */
    void setIoSpecification(InputOutputSpecification value);

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_Property()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
    EList<Property> getProperty();

    /**
     * Returns the value of the '<em><b>Data Input Association</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.DataInputAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Input Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Input Association</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_DataInputAssociation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataInputAssociation' namespace='##targetNamespace'"
     * @generated
     */
    EList<DataInputAssociation> getDataInputAssociation();

    /**
     * Returns the value of the '<em><b>Data Output Association</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.DataOutputAssociation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Output Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Output Association</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_DataOutputAssociation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='dataOutputAssociation' namespace='##targetNamespace'"
     * @generated
     */
    EList<DataOutputAssociation> getDataOutputAssociation();

    /**
     * Returns the value of the '<em><b>Performer Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Performer Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Performer Group</em>' attribute list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_PerformerGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='performer:group' namespace='##targetNamespace'"
     * @generated
     */
    FeatureMap getPerformerGroup();

    /**
     * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.Performer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Performer</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_Performer()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace' group='performer:group'"
     * @generated
     */
    EList<Performer> getPerformer();

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_LoopCharacteristicsGroup()
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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_LoopCharacteristics()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loopCharacteristics' namespace='##targetNamespace' group='loopCharacteristics:group'"
     * @generated
     */
    LoopCharacteristics getLoopCharacteristics();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Characteristics</em>' containment reference.
     * @see #getLoopCharacteristics()
     * @generated
     */
    void setLoopCharacteristics(LoopCharacteristics value);

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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_Default()
     * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
     *        extendedMetaData="kind='attribute' name='default'"
     * @generated
     */
    String getDefault();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Activity#getDefault <em>Default</em>}' attribute.
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
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getActivity_IsForCompensation()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isForCompensation'"
     * @generated
     */
    boolean isIsForCompensation();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.Activity#isIsForCompensation <em>Is For Compensation</em>}' attribute.
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
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.Activity#isIsForCompensation <em>Is For Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsForCompensation()
     * @see #isIsForCompensation()
     * @see #setIsForCompensation(boolean)
     * @generated
     */
    void unsetIsForCompensation();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.Activity#isIsForCompensation <em>Is For Compensation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is For Compensation</em>' attribute is set.
     * @see #unsetIsForCompensation()
     * @see #isIsForCompensation()
     * @see #setIsForCompensation(boolean)
     * @generated
     */
    boolean isSetIsForCompensation();

} // Activity
