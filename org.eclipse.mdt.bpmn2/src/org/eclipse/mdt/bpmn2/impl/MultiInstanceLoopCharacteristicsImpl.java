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
package org.eclipse.mdt.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.DataInput;
import org.eclipse.mdt.bpmn2.DataOutput;
import org.eclipse.mdt.bpmn2.Expression;
import org.eclipse.mdt.bpmn2.MultiInstanceFlowCondition;
import org.eclipse.mdt.bpmn2.MultiInstanceLoopCharacteristics;
import org.eclipse.mdt.bpmn2.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getLoopCardinality <em>Loop Cardinality</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getComplexFlowCondition <em>Complex Flow Condition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataInput <em>Loop Data Input</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataOutput <em>Loop Data Output</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getInputDataItem <em>Input Data Item</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getOutputDataItem <em>Output Data Item</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#isIsSequential <em>Is Sequential</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiInstanceLoopCharacteristicsImpl extends
        LoopCharacteristicsImpl implements MultiInstanceLoopCharacteristics {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getLoopCardinality() <em>Loop Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoopCardinality()
     * @generated
     * @ordered
     */
    protected Expression loopCardinality;

    /**
     * The cached value of the '{@link #getComplexFlowCondition() <em>Complex Flow Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComplexFlowCondition()
     * @generated
     * @ordered
     */
    protected Expression complexFlowCondition;

    /**
     * The cached value of the '{@link #getLoopDataInput() <em>Loop Data Input</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoopDataInput()
     * @generated
     * @ordered
     */
    protected DataInput loopDataInput;

    /**
     * The cached value of the '{@link #getLoopDataOutput() <em>Loop Data Output</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoopDataOutput()
     * @generated
     * @ordered
     */
    protected DataOutput loopDataOutput;

    /**
     * The cached value of the '{@link #getInputDataItem() <em>Input Data Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputDataItem()
     * @generated
     * @ordered
     */
    protected Property inputDataItem;

    /**
     * The cached value of the '{@link #getOutputDataItem() <em>Output Data Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputDataItem()
     * @generated
     * @ordered
     */
    protected Property outputDataItem;

    /**
     * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehavior()
     * @generated
     * @ordered
     */
    protected static final MultiInstanceFlowCondition BEHAVIOR_EDEFAULT = MultiInstanceFlowCondition.ALL;

    /**
     * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehavior()
     * @generated
     * @ordered
     */
    protected MultiInstanceFlowCondition behavior = BEHAVIOR_EDEFAULT;

    /**
     * This is true if the Behavior attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean behaviorESet;

    /**
     * The default value of the '{@link #isCancelRemainingInstances() <em>Cancel Remaining Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelRemainingInstances()
     * @generated
     * @ordered
     */
    protected static final boolean CANCEL_REMAINING_INSTANCES_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCancelRemainingInstances() <em>Cancel Remaining Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelRemainingInstances()
     * @generated
     * @ordered
     */
    protected boolean cancelRemainingInstances = CANCEL_REMAINING_INSTANCES_EDEFAULT;

    /**
     * This is true if the Cancel Remaining Instances attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cancelRemainingInstancesESet;

    /**
     * The default value of the '{@link #isIsSequential() <em>Is Sequential</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSequential()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SEQUENTIAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSequential() <em>Is Sequential</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSequential()
     * @generated
     * @ordered
     */
    protected boolean isSequential = IS_SEQUENTIAL_EDEFAULT;

    /**
     * This is true if the Is Sequential attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSequentialESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MultiInstanceLoopCharacteristicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getMultiInstanceLoopCharacteristics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getLoopCardinality() {
        return loopCardinality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopCardinality(
            Expression newLoopCardinality, NotificationChain msgs) {
        Expression oldLoopCardinality = loopCardinality;
        loopCardinality = newLoopCardinality;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY,
                    oldLoopCardinality, newLoopCardinality);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoopCardinality(Expression newLoopCardinality) {
        if (newLoopCardinality != loopCardinality) {
            NotificationChain msgs = null;
            if (loopCardinality != null)
                msgs = ((InternalEObject) loopCardinality)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY,
                                null, msgs);
            if (newLoopCardinality != null)
                msgs = ((InternalEObject) newLoopCardinality)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY,
                                null, msgs);
            msgs = basicSetLoopCardinality(newLoopCardinality, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY,
                    newLoopCardinality, newLoopCardinality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getComplexFlowCondition() {
        return complexFlowCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetComplexFlowCondition(
            Expression newComplexFlowCondition, NotificationChain msgs) {
        Expression oldComplexFlowCondition = complexFlowCondition;
        complexFlowCondition = newComplexFlowCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION,
                    oldComplexFlowCondition, newComplexFlowCondition);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComplexFlowCondition(Expression newComplexFlowCondition) {
        if (newComplexFlowCondition != complexFlowCondition) {
            NotificationChain msgs = null;
            if (complexFlowCondition != null)
                msgs = ((InternalEObject) complexFlowCondition)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION,
                                null, msgs);
            if (newComplexFlowCondition != null)
                msgs = ((InternalEObject) newComplexFlowCondition)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION,
                                null, msgs);
            msgs = basicSetComplexFlowCondition(newComplexFlowCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION,
                    newComplexFlowCondition, newComplexFlowCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInput getLoopDataInput() {
        return loopDataInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopDataInput(DataInput newLoopDataInput,
            NotificationChain msgs) {
        DataInput oldLoopDataInput = loopDataInput;
        loopDataInput = newLoopDataInput;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT,
                    oldLoopDataInput, newLoopDataInput);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoopDataInput(DataInput newLoopDataInput) {
        if (newLoopDataInput != loopDataInput) {
            NotificationChain msgs = null;
            if (loopDataInput != null)
                msgs = ((InternalEObject) loopDataInput)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT,
                                null, msgs);
            if (newLoopDataInput != null)
                msgs = ((InternalEObject) newLoopDataInput)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT,
                                null, msgs);
            msgs = basicSetLoopDataInput(newLoopDataInput, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT,
                    newLoopDataInput, newLoopDataInput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutput getLoopDataOutput() {
        return loopDataOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopDataOutput(
            DataOutput newLoopDataOutput, NotificationChain msgs) {
        DataOutput oldLoopDataOutput = loopDataOutput;
        loopDataOutput = newLoopDataOutput;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT,
                    oldLoopDataOutput, newLoopDataOutput);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoopDataOutput(DataOutput newLoopDataOutput) {
        if (newLoopDataOutput != loopDataOutput) {
            NotificationChain msgs = null;
            if (loopDataOutput != null)
                msgs = ((InternalEObject) loopDataOutput)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT,
                                null, msgs);
            if (newLoopDataOutput != null)
                msgs = ((InternalEObject) newLoopDataOutput)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT,
                                null, msgs);
            msgs = basicSetLoopDataOutput(newLoopDataOutput, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT,
                    newLoopDataOutput, newLoopDataOutput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property getInputDataItem() {
        return inputDataItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputDataItem(Property newInputDataItem,
            NotificationChain msgs) {
        Property oldInputDataItem = inputDataItem;
        inputDataItem = newInputDataItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM,
                    oldInputDataItem, newInputDataItem);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputDataItem(Property newInputDataItem) {
        if (newInputDataItem != inputDataItem) {
            NotificationChain msgs = null;
            if (inputDataItem != null)
                msgs = ((InternalEObject) inputDataItem)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM,
                                null, msgs);
            if (newInputDataItem != null)
                msgs = ((InternalEObject) newInputDataItem)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM,
                                null, msgs);
            msgs = basicSetInputDataItem(newInputDataItem, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM,
                    newInputDataItem, newInputDataItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property getOutputDataItem() {
        return outputDataItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputDataItem(Property newOutputDataItem,
            NotificationChain msgs) {
        Property oldOutputDataItem = outputDataItem;
        outputDataItem = newOutputDataItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM,
                    oldOutputDataItem, newOutputDataItem);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputDataItem(Property newOutputDataItem) {
        if (newOutputDataItem != outputDataItem) {
            NotificationChain msgs = null;
            if (outputDataItem != null)
                msgs = ((InternalEObject) outputDataItem)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM,
                                null, msgs);
            if (newOutputDataItem != null)
                msgs = ((InternalEObject) newOutputDataItem)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM,
                                null, msgs);
            msgs = basicSetOutputDataItem(newOutputDataItem, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM,
                    newOutputDataItem, newOutputDataItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceFlowCondition getBehavior() {
        return behavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehavior(MultiInstanceFlowCondition newBehavior) {
        MultiInstanceFlowCondition oldBehavior = behavior;
        behavior = newBehavior == null ? BEHAVIOR_EDEFAULT : newBehavior;
        boolean oldBehaviorESet = behaviorESet;
        behaviorESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR,
                    oldBehavior, behavior, !oldBehaviorESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBehavior() {
        MultiInstanceFlowCondition oldBehavior = behavior;
        boolean oldBehaviorESet = behaviorESet;
        behavior = BEHAVIOR_EDEFAULT;
        behaviorESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR,
                    oldBehavior, BEHAVIOR_EDEFAULT, oldBehaviorESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBehavior() {
        return behaviorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCancelRemainingInstances() {
        return cancelRemainingInstances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCancelRemainingInstances(boolean newCancelRemainingInstances) {
        boolean oldCancelRemainingInstances = cancelRemainingInstances;
        cancelRemainingInstances = newCancelRemainingInstances;
        boolean oldCancelRemainingInstancesESet = cancelRemainingInstancesESet;
        cancelRemainingInstancesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__CANCEL_REMAINING_INSTANCES,
                    oldCancelRemainingInstances, cancelRemainingInstances,
                    !oldCancelRemainingInstancesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCancelRemainingInstances() {
        boolean oldCancelRemainingInstances = cancelRemainingInstances;
        boolean oldCancelRemainingInstancesESet = cancelRemainingInstancesESet;
        cancelRemainingInstances = CANCEL_REMAINING_INSTANCES_EDEFAULT;
        cancelRemainingInstancesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.UNSET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__CANCEL_REMAINING_INSTANCES,
                    oldCancelRemainingInstances,
                    CANCEL_REMAINING_INSTANCES_EDEFAULT,
                    oldCancelRemainingInstancesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCancelRemainingInstances() {
        return cancelRemainingInstancesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSequential() {
        return isSequential;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsSequential(boolean newIsSequential) {
        boolean oldIsSequential = isSequential;
        isSequential = newIsSequential;
        boolean oldIsSequentialESet = isSequentialESet;
        isSequentialESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL,
                    oldIsSequential, isSequential, !oldIsSequentialESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsSequential() {
        boolean oldIsSequential = isSequential;
        boolean oldIsSequentialESet = isSequentialESet;
        isSequential = IS_SEQUENTIAL_EDEFAULT;
        isSequentialESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.UNSET,
                    Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL,
                    oldIsSequential, IS_SEQUENTIAL_EDEFAULT,
                    oldIsSequentialESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsSequential() {
        return isSequentialESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
            int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            return basicSetLoopCardinality(null, msgs);
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION:
            return basicSetComplexFlowCondition(null, msgs);
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            return basicSetLoopDataInput(null, msgs);
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            return basicSetLoopDataOutput(null, msgs);
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            return basicSetInputDataItem(null, msgs);
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            return basicSetOutputDataItem(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            return getLoopCardinality();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION:
            return getComplexFlowCondition();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            return getLoopDataInput();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            return getLoopDataOutput();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            return getInputDataItem();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            return getOutputDataItem();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            return getBehavior();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__CANCEL_REMAINING_INSTANCES:
            return isCancelRemainingInstances();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            return isIsSequential();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            setLoopCardinality((Expression) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION:
            setComplexFlowCondition((Expression) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            setLoopDataInput((DataInput) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            setLoopDataOutput((DataOutput) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            setInputDataItem((Property) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            setOutputDataItem((Property) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            setBehavior((MultiInstanceFlowCondition) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__CANCEL_REMAINING_INSTANCES:
            setCancelRemainingInstances((Boolean) newValue);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            setIsSequential((Boolean) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            setLoopCardinality((Expression) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION:
            setComplexFlowCondition((Expression) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            setLoopDataInput((DataInput) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            setLoopDataOutput((DataOutput) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            setInputDataItem((Property) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            setOutputDataItem((Property) null);
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            unsetBehavior();
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__CANCEL_REMAINING_INSTANCES:
            unsetCancelRemainingInstances();
            return;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            unsetIsSequential();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            return loopCardinality != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_FLOW_CONDITION:
            return complexFlowCondition != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            return loopDataInput != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            return loopDataOutput != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            return inputDataItem != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            return outputDataItem != null;
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            return isSetBehavior();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__CANCEL_REMAINING_INSTANCES:
            return isSetCancelRemainingInstances();
        case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            return isSetIsSequential();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (behavior: ");
        if (behaviorESet)
            result.append(behavior);
        else
            result.append("<unset>");
        result.append(", cancelRemainingInstances: ");
        if (cancelRemainingInstancesESet)
            result.append(cancelRemainingInstances);
        else
            result.append("<unset>");
        result.append(", isSequential: ");
        if (isSequentialESet)
            result.append(isSequential);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //MultiInstanceLoopCharacteristicsImpl
