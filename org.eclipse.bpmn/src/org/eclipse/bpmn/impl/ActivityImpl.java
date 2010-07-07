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

import java.math.BigInteger;

import java.util.Collection;

import java.util.List;
import org.eclipse.bpmn.Activity;
import org.eclipse.bpmn.ActivityResource;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.DataInputAssociation;
import org.eclipse.bpmn.DataOutputAssociation;
import org.eclipse.bpmn.InputOutputSpecification;
import org.eclipse.bpmn.LoopCharacteristics;
import org.eclipse.bpmn.Property;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getDataInputAssociations <em>Data Input Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getDataOutputAssociations <em>Data Output Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getActivityResourceGroups <em>Activity Resource Groups</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getActivityResources <em>Activity Resources</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getLoopCharacteristicsGroup <em>Loop Characteristics Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getCompletionQuantity <em>Completion Quantity</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#isIsForCompensation <em>Is For Compensation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ActivityImpl#getStartQuantity <em>Start Quantity</em>}</li>
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
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

    /**
     * The cached value of the '{@link #getDataInputAssociations() <em>Data Input Associations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInputAssociations()
     * @generated
     * @ordered
     */
    protected EList<DataInputAssociation> dataInputAssociations;

    /**
     * The cached value of the '{@link #getDataOutputAssociations() <em>Data Output Associations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutputAssociations()
     * @generated
     * @ordered
     */
    protected EList<DataOutputAssociation> dataOutputAssociations;

    /**
     * The cached value of the '{@link #getActivityResourceGroups() <em>Activity Resource Groups</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityResourceGroups()
     * @generated
     * @ordered
     */
    protected FeatureMap activityResourceGroups;

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
        return BpmnPackage.eINSTANCE.getActivity();
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__IO_SPECIFICATION, oldIoSpecification,
                    newIoSpecification);
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
    public void setIoSpecification(InputOutputSpecification newIoSpecification) {
        if (newIoSpecification != ioSpecification) {
            NotificationChain msgs = null;
            if (ioSpecification != null)
                msgs = ((InternalEObject) ioSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.ACTIVITY__IO_SPECIFICATION, null, msgs);
            if (newIoSpecification != null)
                msgs = ((InternalEObject) newIoSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.ACTIVITY__IO_SPECIFICATION, null, msgs);
            msgs = basicSetIoSpecification(newIoSpecification, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__IO_SPECIFICATION, newIoSpecification, newIoSpecification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, BpmnPackage.ACTIVITY__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<DataInputAssociation> getDataInputAssociations() {
        if (dataInputAssociations == null) {
            dataInputAssociations = new EObjectContainmentEList<DataInputAssociation>(DataInputAssociation.class, this,
                    BpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATIONS);
        }
        return dataInputAssociations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<DataOutputAssociation> getDataOutputAssociations() {
        if (dataOutputAssociations == null) {
            dataOutputAssociations = new EObjectContainmentEList<DataOutputAssociation>(DataOutputAssociation.class, this,
                    BpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS);
        }
        return dataOutputAssociations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getActivityResourceGroups() {
        if (activityResourceGroups == null) {
            activityResourceGroups = new BasicFeatureMap(this, BpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUPS);
        }
        return activityResourceGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<ActivityResource> getActivityResources() {
        return getActivityResourceGroups().list(BpmnPackage.eINSTANCE.getActivity_ActivityResources());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getLoopCharacteristicsGroup() {
        if (loopCharacteristicsGroup == null) {
            loopCharacteristicsGroup = new BasicFeatureMap(this, BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP);
        }
        return loopCharacteristicsGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoopCharacteristics getLoopCharacteristics() {
        return (LoopCharacteristics) getLoopCharacteristicsGroup().get(BpmnPackage.eINSTANCE.getActivity_LoopCharacteristics(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopCharacteristics(LoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
        return ((FeatureMap.Internal) getLoopCharacteristicsGroup()).basicAdd(BpmnPackage.eINSTANCE.getActivity_LoopCharacteristics(), newLoopCharacteristics,
                msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoopCharacteristics(LoopCharacteristics newLoopCharacteristics) {
        ((FeatureMap.Internal) getLoopCharacteristicsGroup()).set(BpmnPackage.eINSTANCE.getActivity_LoopCharacteristics(), newLoopCharacteristics);
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__COMPLETION_QUANTITY, oldCompletionQuantity, completionQuantity,
                    !oldCompletionQuantityESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.ACTIVITY__COMPLETION_QUANTITY, oldCompletionQuantity,
                    COMPLETION_QUANTITY_EDEFAULT, oldCompletionQuantityESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__DEFAULT, oldDefault, default_));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__IS_FOR_COMPENSATION, oldIsForCompensation, isForCompensation,
                    !oldIsForCompensationESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.ACTIVITY__IS_FOR_COMPENSATION, oldIsForCompensation,
                    IS_FOR_COMPENSATION_EDEFAULT, oldIsForCompensationESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__START_QUANTITY, oldStartQuantity, startQuantity, !oldStartQuantityESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.ACTIVITY__START_QUANTITY, oldStartQuantity, START_QUANTITY_EDEFAULT,
                    oldStartQuantityESet));
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
        case BpmnPackage.ACTIVITY__IO_SPECIFICATION:
            return basicSetIoSpecification(null, msgs);
        case BpmnPackage.ACTIVITY__PROPERTIES:
            return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
        case BpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
            return ((InternalEList<?>) getDataInputAssociations()).basicRemove(otherEnd, msgs);
        case BpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
            return ((InternalEList<?>) getDataOutputAssociations()).basicRemove(otherEnd, msgs);
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUPS:
            return ((InternalEList<?>) getActivityResourceGroups()).basicRemove(otherEnd, msgs);
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCES:
            return ((InternalEList<?>) getActivityResources()).basicRemove(otherEnd, msgs);
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            return ((InternalEList<?>) getLoopCharacteristicsGroup()).basicRemove(otherEnd, msgs);
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
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
        case BpmnPackage.ACTIVITY__IO_SPECIFICATION:
            return getIoSpecification();
        case BpmnPackage.ACTIVITY__PROPERTIES:
            return getProperties();
        case BpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
            return getDataInputAssociations();
        case BpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
            return getDataOutputAssociations();
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUPS:
            if (coreType)
                return getActivityResourceGroups();
            return ((FeatureMap.Internal) getActivityResourceGroups()).getWrapper();
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCES:
            return getActivityResources();
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            if (coreType)
                return getLoopCharacteristicsGroup();
            return ((FeatureMap.Internal) getLoopCharacteristicsGroup()).getWrapper();
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
            return getLoopCharacteristics();
        case BpmnPackage.ACTIVITY__COMPLETION_QUANTITY:
            return getCompletionQuantity();
        case BpmnPackage.ACTIVITY__DEFAULT:
            return getDefault();
        case BpmnPackage.ACTIVITY__IS_FOR_COMPENSATION:
            return isIsForCompensation();
        case BpmnPackage.ACTIVITY__START_QUANTITY:
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
        case BpmnPackage.ACTIVITY__IO_SPECIFICATION:
            setIoSpecification((InputOutputSpecification) newValue);
            return;
        case BpmnPackage.ACTIVITY__PROPERTIES:
            getProperties().clear();
            getProperties().addAll((Collection<? extends Property>) newValue);
            return;
        case BpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
            getDataInputAssociations().clear();
            getDataInputAssociations().addAll((Collection<? extends DataInputAssociation>) newValue);
            return;
        case BpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
            getDataOutputAssociations().clear();
            getDataOutputAssociations().addAll((Collection<? extends DataOutputAssociation>) newValue);
            return;
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUPS:
            ((FeatureMap.Internal) getActivityResourceGroups()).set(newValue);
            return;
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCES:
            getActivityResources().clear();
            getActivityResources().addAll((Collection<? extends ActivityResource>) newValue);
            return;
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            ((FeatureMap.Internal) getLoopCharacteristicsGroup()).set(newValue);
            return;
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
            setLoopCharacteristics((LoopCharacteristics) newValue);
            return;
        case BpmnPackage.ACTIVITY__COMPLETION_QUANTITY:
            setCompletionQuantity((BigInteger) newValue);
            return;
        case BpmnPackage.ACTIVITY__DEFAULT:
            setDefault((String) newValue);
            return;
        case BpmnPackage.ACTIVITY__IS_FOR_COMPENSATION:
            setIsForCompensation((Boolean) newValue);
            return;
        case BpmnPackage.ACTIVITY__START_QUANTITY:
            setStartQuantity((BigInteger) newValue);
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
        case BpmnPackage.ACTIVITY__IO_SPECIFICATION:
            setIoSpecification((InputOutputSpecification) null);
            return;
        case BpmnPackage.ACTIVITY__PROPERTIES:
            getProperties().clear();
            return;
        case BpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
            getDataInputAssociations().clear();
            return;
        case BpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
            getDataOutputAssociations().clear();
            return;
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUPS:
            getActivityResourceGroups().clear();
            return;
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCES:
            getActivityResources().clear();
            return;
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            getLoopCharacteristicsGroup().clear();
            return;
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
            setLoopCharacteristics((LoopCharacteristics) null);
            return;
        case BpmnPackage.ACTIVITY__COMPLETION_QUANTITY:
            unsetCompletionQuantity();
            return;
        case BpmnPackage.ACTIVITY__DEFAULT:
            setDefault(DEFAULT_EDEFAULT);
            return;
        case BpmnPackage.ACTIVITY__IS_FOR_COMPENSATION:
            unsetIsForCompensation();
            return;
        case BpmnPackage.ACTIVITY__START_QUANTITY:
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
        case BpmnPackage.ACTIVITY__IO_SPECIFICATION:
            return ioSpecification != null;
        case BpmnPackage.ACTIVITY__PROPERTIES:
            return properties != null && !properties.isEmpty();
        case BpmnPackage.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
            return dataInputAssociations != null && !dataInputAssociations.isEmpty();
        case BpmnPackage.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
            return dataOutputAssociations != null && !dataOutputAssociations.isEmpty();
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCE_GROUPS:
            return activityResourceGroups != null && !activityResourceGroups.isEmpty();
        case BpmnPackage.ACTIVITY__ACTIVITY_RESOURCES:
            return !getActivityResources().isEmpty();
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            return loopCharacteristicsGroup != null && !loopCharacteristicsGroup.isEmpty();
        case BpmnPackage.ACTIVITY__LOOP_CHARACTERISTICS:
            return getLoopCharacteristics() != null;
        case BpmnPackage.ACTIVITY__COMPLETION_QUANTITY:
            return isSetCompletionQuantity();
        case BpmnPackage.ACTIVITY__DEFAULT:
            return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
        case BpmnPackage.ACTIVITY__IS_FOR_COMPENSATION:
            return isSetIsForCompensation();
        case BpmnPackage.ACTIVITY__START_QUANTITY:
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
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (activityResourceGroups: "); //$NON-NLS-1$
        result.append(activityResourceGroups);
        result.append(", loopCharacteristicsGroup: "); //$NON-NLS-1$
        result.append(loopCharacteristicsGroup);
        result.append(", completionQuantity: "); //$NON-NLS-1$
        if (completionQuantityESet)
            result.append(completionQuantity);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", default: "); //$NON-NLS-1$
        result.append(default_);
        result.append(", isForCompensation: "); //$NON-NLS-1$
        if (isForCompensationESet)
            result.append(isForCompensation);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", startQuantity: "); //$NON-NLS-1$
        if (startQuantityESet)
            result.append(startQuantity);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //ActivityImpl
