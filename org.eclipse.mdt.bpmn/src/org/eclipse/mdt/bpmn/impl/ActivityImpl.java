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
package org.eclipse.mdt.bpmn.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.Activity;
import org.eclipse.mdt.bpmn.ActivityResource;
import org.eclipse.mdt.bpmn.DataInputAssociation;
import org.eclipse.mdt.bpmn.DataOutputAssociation;
import org.eclipse.mdt.bpmn.InputOutputSpecification;
import org.eclipse.mdt.bpmn.LoopCharacteristics;
import org.eclipse.mdt.bpmn.Property;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getActivityResourceGroup <em>Activity Resource Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getActivityResource <em>Activity Resource</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getLoopCharacteristicsGroup <em>Loop Characteristics Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getCompletionQuantity <em>Completion Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#isIsForCompensation <em>Is For Compensation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ActivityImpl#getStartQuantity <em>Start Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityImpl extends FlowNodeImpl implements Activity {
    /**
     * The cached value of the '{@link #getIoSpecification() <em>Io Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIoSpecification()
     * @generated
     * @ordered
     */
    protected InputOutputSpecification ioSpecification;

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected EList<Property> property;

    /**
     * The cached value of the '{@link #getDataInputAssociation() <em>Data Input Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInputAssociation()
     * @generated
     * @ordered
     */
    protected EList<DataInputAssociation> dataInputAssociation;

    /**
     * The cached value of the '{@link #getDataOutputAssociation() <em>Data Output Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutputAssociation()
     * @generated
     * @ordered
     */
    protected EList<DataOutputAssociation> dataOutputAssociation;

    /**
     * The cached value of the '{@link #getActivityResourceGroup() <em>Activity Resource Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityResourceGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap activityResourceGroup;

    /**
     * The cached value of the '{@link #getLoopCharacteristicsGroup() <em>Loop Characteristics Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoopCharacteristicsGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap loopCharacteristicsGroup;

    /**
     * The default value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompletionQuantity()
     * @generated
     * @ordered
     */
    protected static final BigInteger COMPLETION_QUANTITY_EDEFAULT = new BigInteger("1"); //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCompletionQuantity()
     * @generated
     * @ordered
     */
    protected BigInteger completionQuantity = COMPLETION_QUANTITY_EDEFAULT;

    /**
     * This is true if the Completion Quantity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean completionQuantityESet;

    /**
     * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected String default_ = DEFAULT_EDEFAULT;

    /**
     * The default value of the '{@link #isIsForCompensation() <em>Is For Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsForCompensation()
     * @generated
     * @ordered
     */
    protected static final boolean IS_FOR_COMPENSATION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsForCompensation() <em>Is For Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsForCompensation()
     * @generated
     * @ordered
     */
    protected boolean isForCompensation = IS_FOR_COMPENSATION_EDEFAULT;

    /**
     * This is true if the Is For Compensation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isForCompensationESet;

    /**
     * The default value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartQuantity()
     * @generated
     * @ordered
     */
    protected static final BigInteger START_QUANTITY_EDEFAULT = new BigInteger("1"); //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartQuantity()
     * @generated
     * @ordered
     */
    protected BigInteger startQuantity = START_QUANTITY_EDEFAULT;

    /**
     * This is true if the Start Quantity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startQuantityESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getActivity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputOutputSpecification getIoSpecification() {
        return ioSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIoSpecification(InputOutputSpecification newIoSpecification, NotificationChain msgs) {
        InputOutputSpecification oldIoSpecification = ioSpecification;
        ioSpecification = newIoSpecification;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, bpmnPackage.ACTIVITY__IO_SPECIFICATION, oldIoSpecification, newIoSpecification);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIoSpecification(InputOutputSpecification newIoSpecification) {
        if (newIoSpecification != ioSpecification) {
            NotificationChain msgs = null;
            if (ioSpecification != null)
                msgs = ((InternalEObject)ioSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - bpmnPackage.ACTIVITY__IO_SPECIFICATION, null, msgs);
            if (newIoSpecification != null)
                msgs = ((InternalEObject)newIoSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - bpmnPackage.ACTIVITY__IO_SPECIFICATION, null, msgs);
            msgs = basicSetIoSpecification(newIoSpecification, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.ACTIVITY__IO_SPECIFICATION, newIoSpecification, newIoSpecification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<Property>(Property.class, this, bpmnPackage.ACTIVITY__PROPERTY);
        }
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataInputAssociation> getDataInputAssociation() {
        if (dataInputAssociation == null) {
            dataInputAssociation = new EObjectContainmentEList<DataInputAssociation>(DataInputAssociation.class, this, bpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATION);
        }
        return dataInputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataOutputAssociation> getDataOutputAssociation() {
        if (dataOutputAssociation == null) {
            dataOutputAssociation = new EObjectContainmentEList<DataOutputAssociation>(DataOutputAssociation.class, this, bpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATION);
        }
        return dataOutputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getActivityResourceGroup() {
        if (activityResourceGroup == null) {
            activityResourceGroup = new BasicFeatureMap(this, bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUP);
        }
        return activityResourceGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityResource> getActivityResource() {
        return getActivityResourceGroup().list(bpmnPackage.eINSTANCE.getActivity_ActivityResource());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getLoopCharacteristicsGroup() {
        if (loopCharacteristicsGroup == null) {
            loopCharacteristicsGroup = new BasicFeatureMap(this, bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP);
        }
        return loopCharacteristicsGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoopCharacteristics getLoopCharacteristics() {
        return (LoopCharacteristics)getLoopCharacteristicsGroup().get(bpmnPackage.eINSTANCE.getActivity_LoopCharacteristics(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopCharacteristics(LoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
        return ((FeatureMap.Internal)getLoopCharacteristicsGroup()).basicAdd(bpmnPackage.eINSTANCE.getActivity_LoopCharacteristics(), newLoopCharacteristics, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoopCharacteristics(LoopCharacteristics newLoopCharacteristics) {
        ((FeatureMap.Internal)getLoopCharacteristicsGroup()).set(bpmnPackage.eINSTANCE.getActivity_LoopCharacteristics(), newLoopCharacteristics);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getCompletionQuantity() {
        return completionQuantity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCompletionQuantity(BigInteger newCompletionQuantity) {
        BigInteger oldCompletionQuantity = completionQuantity;
        completionQuantity = newCompletionQuantity;
        boolean oldCompletionQuantityESet = completionQuantityESet;
        completionQuantityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.ACTIVITY__COMPLETION_QUANTITY, oldCompletionQuantity, completionQuantity, !oldCompletionQuantityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCompletionQuantity() {
        BigInteger oldCompletionQuantity = completionQuantity;
        boolean oldCompletionQuantityESet = completionQuantityESet;
        completionQuantity = COMPLETION_QUANTITY_EDEFAULT;
        completionQuantityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, bpmnPackage.ACTIVITY__COMPLETION_QUANTITY, oldCompletionQuantity, COMPLETION_QUANTITY_EDEFAULT, oldCompletionQuantityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCompletionQuantity() {
        return completionQuantityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefault() {
        return default_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefault(String newDefault) {
        String oldDefault = default_;
        default_ = newDefault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.ACTIVITY__DEFAULT, oldDefault, default_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsForCompensation() {
        return isForCompensation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsForCompensation(boolean newIsForCompensation) {
        boolean oldIsForCompensation = isForCompensation;
        isForCompensation = newIsForCompensation;
        boolean oldIsForCompensationESet = isForCompensationESet;
        isForCompensationESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.ACTIVITY__IS_FOR_COMPENSATION, oldIsForCompensation, isForCompensation, !oldIsForCompensationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsForCompensation() {
        boolean oldIsForCompensation = isForCompensation;
        boolean oldIsForCompensationESet = isForCompensationESet;
        isForCompensation = IS_FOR_COMPENSATION_EDEFAULT;
        isForCompensationESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, bpmnPackage.ACTIVITY__IS_FOR_COMPENSATION, oldIsForCompensation, IS_FOR_COMPENSATION_EDEFAULT, oldIsForCompensationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsForCompensation() {
        return isForCompensationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getStartQuantity() {
        return startQuantity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartQuantity(BigInteger newStartQuantity) {
        BigInteger oldStartQuantity = startQuantity;
        startQuantity = newStartQuantity;
        boolean oldStartQuantityESet = startQuantityESet;
        startQuantityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.ACTIVITY__START_QUANTITY, oldStartQuantity, startQuantity, !oldStartQuantityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStartQuantity() {
        BigInteger oldStartQuantity = startQuantity;
        boolean oldStartQuantityESet = startQuantityESet;
        startQuantity = START_QUANTITY_EDEFAULT;
        startQuantityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, bpmnPackage.ACTIVITY__START_QUANTITY, oldStartQuantity, START_QUANTITY_EDEFAULT, oldStartQuantityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStartQuantity() {
        return startQuantityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case bpmnPackage.ACTIVITY__IO_SPECIFICATION:
                return basicSetIoSpecification(null, msgs);
            case bpmnPackage.ACTIVITY__PROPERTY:
                return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
            case bpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATION:
                return ((InternalEList<?>)getDataInputAssociation()).basicRemove(otherEnd, msgs);
            case bpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
                return ((InternalEList<?>)getDataOutputAssociation()).basicRemove(otherEnd, msgs);
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUP:
                return ((InternalEList<?>)getActivityResourceGroup()).basicRemove(otherEnd, msgs);
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE:
                return ((InternalEList<?>)getActivityResource()).basicRemove(otherEnd, msgs);
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
                return ((InternalEList<?>)getLoopCharacteristicsGroup()).basicRemove(otherEnd, msgs);
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
                return basicSetLoopCharacteristics(null, msgs);
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
            case bpmnPackage.ACTIVITY__IO_SPECIFICATION:
                return getIoSpecification();
            case bpmnPackage.ACTIVITY__PROPERTY:
                return getProperty();
            case bpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATION:
                return getDataInputAssociation();
            case bpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
                return getDataOutputAssociation();
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUP:
                if (coreType) return getActivityResourceGroup();
                return ((FeatureMap.Internal)getActivityResourceGroup()).getWrapper();
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE:
                return getActivityResource();
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
                if (coreType) return getLoopCharacteristicsGroup();
                return ((FeatureMap.Internal)getLoopCharacteristicsGroup()).getWrapper();
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
                return getLoopCharacteristics();
            case bpmnPackage.ACTIVITY__COMPLETION_QUANTITY:
                return getCompletionQuantity();
            case bpmnPackage.ACTIVITY__DEFAULT:
                return getDefault();
            case bpmnPackage.ACTIVITY__IS_FOR_COMPENSATION:
                return isIsForCompensation();
            case bpmnPackage.ACTIVITY__START_QUANTITY:
                return getStartQuantity();
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
            case bpmnPackage.ACTIVITY__IO_SPECIFICATION:
                setIoSpecification((InputOutputSpecification)newValue);
                return;
            case bpmnPackage.ACTIVITY__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends Property>)newValue);
                return;
            case bpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATION:
                getDataInputAssociation().clear();
                getDataInputAssociation().addAll((Collection<? extends DataInputAssociation>)newValue);
                return;
            case bpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
                getDataOutputAssociation().clear();
                getDataOutputAssociation().addAll((Collection<? extends DataOutputAssociation>)newValue);
                return;
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUP:
                ((FeatureMap.Internal)getActivityResourceGroup()).set(newValue);
                return;
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE:
                getActivityResource().clear();
                getActivityResource().addAll((Collection<? extends ActivityResource>)newValue);
                return;
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
                ((FeatureMap.Internal)getLoopCharacteristicsGroup()).set(newValue);
                return;
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
                setLoopCharacteristics((LoopCharacteristics)newValue);
                return;
            case bpmnPackage.ACTIVITY__COMPLETION_QUANTITY:
                setCompletionQuantity((BigInteger)newValue);
                return;
            case bpmnPackage.ACTIVITY__DEFAULT:
                setDefault((String)newValue);
                return;
            case bpmnPackage.ACTIVITY__IS_FOR_COMPENSATION:
                setIsForCompensation((Boolean)newValue);
                return;
            case bpmnPackage.ACTIVITY__START_QUANTITY:
                setStartQuantity((BigInteger)newValue);
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
            case bpmnPackage.ACTIVITY__IO_SPECIFICATION:
                setIoSpecification((InputOutputSpecification)null);
                return;
            case bpmnPackage.ACTIVITY__PROPERTY:
                getProperty().clear();
                return;
            case bpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATION:
                getDataInputAssociation().clear();
                return;
            case bpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
                getDataOutputAssociation().clear();
                return;
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUP:
                getActivityResourceGroup().clear();
                return;
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE:
                getActivityResource().clear();
                return;
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
                getLoopCharacteristicsGroup().clear();
                return;
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
                setLoopCharacteristics((LoopCharacteristics)null);
                return;
            case bpmnPackage.ACTIVITY__COMPLETION_QUANTITY:
                unsetCompletionQuantity();
                return;
            case bpmnPackage.ACTIVITY__DEFAULT:
                setDefault(DEFAULT_EDEFAULT);
                return;
            case bpmnPackage.ACTIVITY__IS_FOR_COMPENSATION:
                unsetIsForCompensation();
                return;
            case bpmnPackage.ACTIVITY__START_QUANTITY:
                unsetStartQuantity();
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
            case bpmnPackage.ACTIVITY__IO_SPECIFICATION:
                return ioSpecification != null;
            case bpmnPackage.ACTIVITY__PROPERTY:
                return property != null && !property.isEmpty();
            case bpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATION:
                return dataInputAssociation != null && !dataInputAssociation.isEmpty();
            case bpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
                return dataOutputAssociation != null && !dataOutputAssociation.isEmpty();
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUP:
                return activityResourceGroup != null && !activityResourceGroup.isEmpty();
            case bpmnPackage.ACTIVITY__ACTIVITY_RESOURCE:
                return !getActivityResource().isEmpty();
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
                return loopCharacteristicsGroup != null && !loopCharacteristicsGroup.isEmpty();
            case bpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
                return getLoopCharacteristics() != null;
            case bpmnPackage.ACTIVITY__COMPLETION_QUANTITY:
                return isSetCompletionQuantity();
            case bpmnPackage.ACTIVITY__DEFAULT:
                return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
            case bpmnPackage.ACTIVITY__IS_FOR_COMPENSATION:
                return isSetIsForCompensation();
            case bpmnPackage.ACTIVITY__START_QUANTITY:
                return isSetStartQuantity();
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
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (activityResourceGroup: "); //$NON-NLS-1$
        result.append(activityResourceGroup);
        result.append(", loopCharacteristicsGroup: "); //$NON-NLS-1$
        result.append(loopCharacteristicsGroup);
        result.append(", completionQuantity: "); //$NON-NLS-1$
        if (completionQuantityESet) result.append(completionQuantity); else result.append("<unset>"); //$NON-NLS-1$
        result.append(", default: "); //$NON-NLS-1$
        result.append(default_);
        result.append(", isForCompensation: "); //$NON-NLS-1$
        if (isForCompensationESet) result.append(isForCompensation); else result.append("<unset>"); //$NON-NLS-1$
        result.append(", startQuantity: "); //$NON-NLS-1$
        if (startQuantityESet) result.append(startQuantity); else result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //ActivityImpl
