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
 * A representation of the model object '<em><b>Multi Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopCardinality <em>Loop Cardinality</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getComplexFlowCondition <em>Complex Flow Condition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataInput <em>Loop Data Input</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataOutput <em>Loop Data Output</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getInputDataItem <em>Input Data Item</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getOutputDataItem <em>Output Data Item</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics()
 * @model extendedMetaData="name='tMultiInstanceLoopCharacteristics' kind='elementOnly'"
 * @generated
 */
public interface MultiInstanceLoopCharacteristics extends LoopCharacteristics {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Loop Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Cardinality</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Cardinality</em>' containment reference.
     * @see #setLoopCardinality(Expression)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_LoopCardinality()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='loopCardinality' namespace='##targetNamespace'"
     * @generated
     */
    Expression getLoopCardinality();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopCardinality <em>Loop Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Cardinality</em>' containment reference.
     * @see #getLoopCardinality()
     * @generated
     */
    void setLoopCardinality(Expression value);

    /**
     * Returns the value of the '<em><b>Complex Flow Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Complex Flow Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Complex Flow Condition</em>' containment reference.
     * @see #setComplexFlowCondition(Expression)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_ComplexFlowCondition()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='complexFlowCondition' namespace='##targetNamespace'"
     * @generated
     */
    Expression getComplexFlowCondition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getComplexFlowCondition <em>Complex Flow Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Complex Flow Condition</em>' containment reference.
     * @see #getComplexFlowCondition()
     * @generated
     */
    void setComplexFlowCondition(Expression value);

    /**
     * Returns the value of the '<em><b>Loop Data Input</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Data Input</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Data Input</em>' containment reference.
     * @see #setLoopDataInput(DataInput)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_LoopDataInput()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='loopDataInput' namespace='##targetNamespace'"
     * @generated
     */
    DataInput getLoopDataInput();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataInput <em>Loop Data Input</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Data Input</em>' containment reference.
     * @see #getLoopDataInput()
     * @generated
     */
    void setLoopDataInput(DataInput value);

    /**
     * Returns the value of the '<em><b>Loop Data Output</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Loop Data Output</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Data Output</em>' containment reference.
     * @see #setLoopDataOutput(DataOutput)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_LoopDataOutput()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='loopDataOutput' namespace='##targetNamespace'"
     * @generated
     */
    DataOutput getLoopDataOutput();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataOutput <em>Loop Data Output</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Data Output</em>' containment reference.
     * @see #getLoopDataOutput()
     * @generated
     */
    void setLoopDataOutput(DataOutput value);

    /**
     * Returns the value of the '<em><b>Input Data Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Data Item</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Data Item</em>' containment reference.
     * @see #setInputDataItem(Property)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_InputDataItem()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inputDataItem' namespace='##targetNamespace'"
     * @generated
     */
    Property getInputDataItem();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getInputDataItem <em>Input Data Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Data Item</em>' containment reference.
     * @see #getInputDataItem()
     * @generated
     */
    void setInputDataItem(Property value);

    /**
     * Returns the value of the '<em><b>Output Data Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Data Item</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Data Item</em>' containment reference.
     * @see #setOutputDataItem(Property)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_OutputDataItem()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='outputDataItem' namespace='##targetNamespace'"
     * @generated
     */
    Property getOutputDataItem();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getOutputDataItem <em>Output Data Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Data Item</em>' containment reference.
     * @see #getOutputDataItem()
     * @generated
     */
    void setOutputDataItem(Property value);

    /**
     * Returns the value of the '<em><b>Behavior</b></em>' attribute.
     * The default value is <code>"all"</code>.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition
     * @see #isSetBehavior()
     * @see #unsetBehavior()
     * @see #setBehavior(MultiInstanceFlowCondition)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_Behavior()
     * @model default="all" unsettable="true"
     *        extendedMetaData="kind='attribute' name='behavior'"
     * @generated
     */
    MultiInstanceFlowCondition getBehavior();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior</em>' attribute.
     * @see org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition
     * @see #isSetBehavior()
     * @see #unsetBehavior()
     * @see #getBehavior()
     * @generated
     */
    void setBehavior(MultiInstanceFlowCondition value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBehavior()
     * @see #getBehavior()
     * @see #setBehavior(MultiInstanceFlowCondition)
     * @generated
     */
    void unsetBehavior();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Behavior</em>' attribute is set.
     * @see #unsetBehavior()
     * @see #getBehavior()
     * @see #setBehavior(MultiInstanceFlowCondition)
     * @generated
     */
    boolean isSetBehavior();

    /**
     * Returns the value of the '<em><b>Cancel Remaining Instances</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cancel Remaining Instances</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cancel Remaining Instances</em>' attribute.
     * @see #isSetCancelRemainingInstances()
     * @see #unsetCancelRemainingInstances()
     * @see #setCancelRemainingInstances(boolean)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_CancelRemainingInstances()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='cancelRemainingInstances'"
     * @generated
     */
    boolean isCancelRemainingInstances();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancel Remaining Instances</em>' attribute.
     * @see #isSetCancelRemainingInstances()
     * @see #unsetCancelRemainingInstances()
     * @see #isCancelRemainingInstances()
     * @generated
     */
    void setCancelRemainingInstances(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCancelRemainingInstances()
     * @see #isCancelRemainingInstances()
     * @see #setCancelRemainingInstances(boolean)
     * @generated
     */
    void unsetCancelRemainingInstances();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cancel Remaining Instances</em>' attribute is set.
     * @see #unsetCancelRemainingInstances()
     * @see #isCancelRemainingInstances()
     * @see #setCancelRemainingInstances(boolean)
     * @generated
     */
    boolean isSetCancelRemainingInstances();

    /**
     * Returns the value of the '<em><b>Is Sequential</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Sequential</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Sequential</em>' attribute.
     * @see #isSetIsSequential()
     * @see #unsetIsSequential()
     * @see #setIsSequential(boolean)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_IsSequential()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isSequential'"
     * @generated
     */
    boolean isIsSequential();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Sequential</em>' attribute.
     * @see #isSetIsSequential()
     * @see #unsetIsSequential()
     * @see #isIsSequential()
     * @generated
     */
    void setIsSequential(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsSequential()
     * @see #isIsSequential()
     * @see #setIsSequential(boolean)
     * @generated
     */
    void unsetIsSequential();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Sequential</em>' attribute is set.
     * @see #unsetIsSequential()
     * @see #isIsSequential()
     * @see #setIsSequential(boolean)
     * @generated
     */
    boolean isSetIsSequential();

} // MultiInstanceLoopCharacteristics
