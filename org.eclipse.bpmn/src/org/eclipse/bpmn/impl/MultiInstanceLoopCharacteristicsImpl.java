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
package org.eclipse.bpmn.impl;

import java.util.Collection;

import java.util.List;
import javax.xml.namespace.QName;

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.ComplexBehaviorDefinition;
import org.eclipse.bpmn.DataInput;
import org.eclipse.bpmn.DataOutput;
import org.eclipse.bpmn.Expression;
import org.eclipse.bpmn.MultiInstanceFlowCondition;
import org.eclipse.bpmn.MultiInstanceLoopCharacteristics;
import org.eclipse.bpmn.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getLoopCardinality <em>Loop Cardinality</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataInput <em>Loop Data Input</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataOutput <em>Loop Data Output</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getInputDataItem <em>Input Data Item</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getOutputDataItem <em>Output Data Item</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#isIsSequential <em>Is Sequential</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.MultiInstanceLoopCharacteristicsImpl#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiInstanceLoopCharacteristicsImpl extends LoopCharacteristicsImpl implements MultiInstanceLoopCharacteristics {
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
     * The cached value of the '{@link #getComplexBehaviorDefinition() <em>Complex Behavior Definition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComplexBehaviorDefinition()
     * @generated
     * @ordered
     */
    protected EList<ComplexBehaviorDefinition> complexBehaviorDefinition;

    /**
     * The cached value of the '{@link #getCompletionCondition() <em>Completion Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompletionCondition()
     * @generated
     * @ordered
     */
    protected Expression completionCondition;

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
     * The default value of the '{@link #getNoneBehaviorEventRef() <em>None Behavior Event Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNoneBehaviorEventRef()
     * @generated
     * @ordered
     */
    protected static final QName NONE_BEHAVIOR_EVENT_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNoneBehaviorEventRef() <em>None Behavior Event Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNoneBehaviorEventRef()
     * @generated
     * @ordered
     */
    protected QName noneBehaviorEventRef = NONE_BEHAVIOR_EVENT_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getOneBehaviorEventRef() <em>One Behavior Event Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOneBehaviorEventRef()
     * @generated
     * @ordered
     */
    protected static final QName ONE_BEHAVIOR_EVENT_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOneBehaviorEventRef() <em>One Behavior Event Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOneBehaviorEventRef()
     * @generated
     * @ordered
     */
    protected QName oneBehaviorEventRef = ONE_BEHAVIOR_EVENT_REF_EDEFAULT;

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
        return BpmnPackage.eINSTANCE.getMultiInstanceLoopCharacteristics();
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
    public NotificationChain basicSetLoopCardinality(Expression newLoopCardinality, NotificationChain msgs) {
        Expression oldLoopCardinality = loopCardinality;
        loopCardinality = newLoopCardinality;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY,
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
                msgs = ((InternalEObject) loopCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, null, msgs);
            if (newLoopCardinality != null)
                msgs = ((InternalEObject) newLoopCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, null, msgs);
            msgs = basicSetLoopCardinality(newLoopCardinality, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, newLoopCardinality,
                    newLoopCardinality));
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
    public NotificationChain basicSetLoopDataInput(DataInput newLoopDataInput, NotificationChain msgs) {
        DataInput oldLoopDataInput = loopDataInput;
        loopDataInput = newLoopDataInput;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT,
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
                msgs = ((InternalEObject) loopDataInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT, null, msgs);
            if (newLoopDataInput != null)
                msgs = ((InternalEObject) newLoopDataInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT, null, msgs);
            msgs = basicSetLoopDataInput(newLoopDataInput, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT, newLoopDataInput,
                    newLoopDataInput));
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
    public NotificationChain basicSetLoopDataOutput(DataOutput newLoopDataOutput, NotificationChain msgs) {
        DataOutput oldLoopDataOutput = loopDataOutput;
        loopDataOutput = newLoopDataOutput;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT,
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
                msgs = ((InternalEObject) loopDataOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT, null, msgs);
            if (newLoopDataOutput != null)
                msgs = ((InternalEObject) newLoopDataOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT, null, msgs);
            msgs = basicSetLoopDataOutput(newLoopDataOutput, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT, newLoopDataOutput,
                    newLoopDataOutput));
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
    public NotificationChain basicSetInputDataItem(Property newInputDataItem, NotificationChain msgs) {
        Property oldInputDataItem = inputDataItem;
        inputDataItem = newInputDataItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM,
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
                msgs = ((InternalEObject) inputDataItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, null, msgs);
            if (newInputDataItem != null)
                msgs = ((InternalEObject) newInputDataItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, null, msgs);
            msgs = basicSetInputDataItem(newInputDataItem, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, newInputDataItem,
                    newInputDataItem));
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
    public NotificationChain basicSetOutputDataItem(Property newOutputDataItem, NotificationChain msgs) {
        Property oldOutputDataItem = outputDataItem;
        outputDataItem = newOutputDataItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM,
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
                msgs = ((InternalEObject) outputDataItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, null, msgs);
            if (newOutputDataItem != null)
                msgs = ((InternalEObject) newOutputDataItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, null, msgs);
            msgs = basicSetOutputDataItem(newOutputDataItem, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, newOutputDataItem,
                    newOutputDataItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<ComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        if (complexBehaviorDefinition == null) {
            complexBehaviorDefinition = new EObjectContainmentEList<ComplexBehaviorDefinition>(ComplexBehaviorDefinition.class, this,
                    BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION);
        }
        return complexBehaviorDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getCompletionCondition() {
        return completionCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCompletionCondition(Expression newCompletionCondition, NotificationChain msgs) {
        Expression oldCompletionCondition = completionCondition;
        completionCondition = newCompletionCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, oldCompletionCondition, newCompletionCondition);
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
    public void setCompletionCondition(Expression newCompletionCondition) {
        if (newCompletionCondition != completionCondition) {
            NotificationChain msgs = null;
            if (completionCondition != null)
                msgs = ((InternalEObject) completionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, null, msgs);
            if (newCompletionCondition != null)
                msgs = ((InternalEObject) newCompletionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, null, msgs);
            msgs = basicSetCompletionCondition(newCompletionCondition, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION,
                    newCompletionCondition, newCompletionCondition));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, oldBehavior, behavior,
                    !oldBehaviorESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, oldBehavior, BEHAVIOR_EDEFAULT,
                    oldBehaviorESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, oldIsSequential,
                    isSequential, !oldIsSequentialESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, oldIsSequential,
                    IS_SEQUENTIAL_EDEFAULT, oldIsSequentialESet));
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
    public QName getNoneBehaviorEventRef() {
        return noneBehaviorEventRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNoneBehaviorEventRef(QName newNoneBehaviorEventRef) {
        QName oldNoneBehaviorEventRef = noneBehaviorEventRef;
        noneBehaviorEventRef = newNoneBehaviorEventRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF,
                    oldNoneBehaviorEventRef, noneBehaviorEventRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getOneBehaviorEventRef() {
        return oneBehaviorEventRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOneBehaviorEventRef(QName newOneBehaviorEventRef) {
        QName oldOneBehaviorEventRef = oneBehaviorEventRef;
        oneBehaviorEventRef = newOneBehaviorEventRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF,
                    oldOneBehaviorEventRef, oneBehaviorEventRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            return basicSetLoopCardinality(null, msgs);
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            return basicSetLoopDataInput(null, msgs);
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            return basicSetLoopDataOutput(null, msgs);
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            return basicSetInputDataItem(null, msgs);
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            return basicSetOutputDataItem(null, msgs);
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            return ((InternalEList<?>) getComplexBehaviorDefinition()).basicRemove(otherEnd, msgs);
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            return basicSetCompletionCondition(null, msgs);
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
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            return getLoopCardinality();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            return getLoopDataInput();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            return getLoopDataOutput();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            return getInputDataItem();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            return getOutputDataItem();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            return getComplexBehaviorDefinition();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            return getCompletionCondition();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            return getBehavior();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            return isIsSequential();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
            return getNoneBehaviorEventRef();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
            return getOneBehaviorEventRef();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            setLoopCardinality((Expression) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            setLoopDataInput((DataInput) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            setLoopDataOutput((DataOutput) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            setInputDataItem((Property) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            setOutputDataItem((Property) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            getComplexBehaviorDefinition().clear();
            getComplexBehaviorDefinition().addAll((Collection<? extends ComplexBehaviorDefinition>) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            setCompletionCondition((Expression) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            setBehavior((MultiInstanceFlowCondition) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            setIsSequential((Boolean) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
            setNoneBehaviorEventRef((QName) newValue);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
            setOneBehaviorEventRef((QName) newValue);
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
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            setLoopCardinality((Expression) null);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            setLoopDataInput((DataInput) null);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            setLoopDataOutput((DataOutput) null);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            setInputDataItem((Property) null);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            setOutputDataItem((Property) null);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            getComplexBehaviorDefinition().clear();
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            setCompletionCondition((Expression) null);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            unsetBehavior();
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            unsetIsSequential();
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
            setNoneBehaviorEventRef(NONE_BEHAVIOR_EVENT_REF_EDEFAULT);
            return;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
            setOneBehaviorEventRef(ONE_BEHAVIOR_EVENT_REF_EDEFAULT);
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
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
            return loopCardinality != null;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT:
            return loopDataInput != null;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT:
            return loopDataOutput != null;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
            return inputDataItem != null;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
            return outputDataItem != null;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
            return complexBehaviorDefinition != null && !complexBehaviorDefinition.isEmpty();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
            return completionCondition != null;
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
            return isSetBehavior();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
            return isSetIsSequential();
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
            return NONE_BEHAVIOR_EVENT_REF_EDEFAULT == null ? noneBehaviorEventRef != null : !NONE_BEHAVIOR_EVENT_REF_EDEFAULT.equals(noneBehaviorEventRef);
        case BpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
            return ONE_BEHAVIOR_EVENT_REF_EDEFAULT == null ? oneBehaviorEventRef != null : !ONE_BEHAVIOR_EVENT_REF_EDEFAULT.equals(oneBehaviorEventRef);
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
        result.append(" (behavior: "); //$NON-NLS-1$
        if (behaviorESet)
            result.append(behavior);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", isSequential: "); //$NON-NLS-1$
        if (isSequentialESet)
            result.append(isSequential);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", noneBehaviorEventRef: "); //$NON-NLS-1$
        result.append(noneBehaviorEventRef);
        result.append(", oneBehaviorEventRef: "); //$NON-NLS-1$
        result.append(oneBehaviorEventRef);
        result.append(')');
        return result.toString();
    }

} //MultiInstanceLoopCharacteristicsImpl
