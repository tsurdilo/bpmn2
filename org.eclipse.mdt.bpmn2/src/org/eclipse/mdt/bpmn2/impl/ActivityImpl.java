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

import org.eclipse.mdt.bpmn2.Activity;
import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.DataInputAssociation;
import org.eclipse.mdt.bpmn2.DataOutputAssociation;
import org.eclipse.mdt.bpmn2.InputOutputSpecification;
import org.eclipse.mdt.bpmn2.LoopCharacteristics;
import org.eclipse.mdt.bpmn2.Performer;
import org.eclipse.mdt.bpmn2.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#getPerformerGroup <em>Performer Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#getLoopCharacteristicsGroup <em>Loop Characteristics Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ActivityImpl#isIsForCompensation <em>Is For Compensation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityImpl extends FlowNodeImpl implements Activity {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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
     * The cached value of the '{@link #getPerformerGroup() <em>Performer Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPerformerGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap performerGroup;

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
        return Bpmn2Package.eINSTANCE.getActivity();
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
    public NotificationChain basicSetIoSpecification(
            InputOutputSpecification newIoSpecification, NotificationChain msgs) {
        InputOutputSpecification oldIoSpecification = ioSpecification;
        ioSpecification = newIoSpecification;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, Bpmn2Package.ACTIVITY__IO_SPECIFICATION,
                    oldIoSpecification, newIoSpecification);
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
                msgs = ((InternalEObject) ioSpecification).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.ACTIVITY__IO_SPECIFICATION,
                        null, msgs);
            if (newIoSpecification != null)
                msgs = ((InternalEObject) newIoSpecification).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.ACTIVITY__IO_SPECIFICATION,
                        null, msgs);
            msgs = basicSetIoSpecification(newIoSpecification, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.ACTIVITY__IO_SPECIFICATION,
                    newIoSpecification, newIoSpecification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<Property>(Property.class,
                    this, Bpmn2Package.ACTIVITY__PROPERTY);
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
            dataInputAssociation = new EObjectContainmentEList<DataInputAssociation>(
                    DataInputAssociation.class, this,
                    Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATION);
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
            dataOutputAssociation = new EObjectContainmentEList<DataOutputAssociation>(
                    DataOutputAssociation.class, this,
                    Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATION);
        }
        return dataOutputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getPerformerGroup() {
        if (performerGroup == null) {
            performerGroup = new BasicFeatureMap(this,
                    Bpmn2Package.ACTIVITY__PERFORMER_GROUP);
        }
        return performerGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Performer> getPerformer() {
        return getPerformerGroup().list(
                Bpmn2Package.eINSTANCE.getActivity_Performer());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getLoopCharacteristicsGroup() {
        if (loopCharacteristicsGroup == null) {
            loopCharacteristicsGroup = new BasicFeatureMap(this,
                    Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS_GROUP);
        }
        return loopCharacteristicsGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoopCharacteristics getLoopCharacteristics() {
        return (LoopCharacteristics) getLoopCharacteristicsGroup().get(
                Bpmn2Package.eINSTANCE.getActivity_LoopCharacteristics(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoopCharacteristics(
            LoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
        return ((FeatureMap.Internal) getLoopCharacteristicsGroup()).basicAdd(
                Bpmn2Package.eINSTANCE.getActivity_LoopCharacteristics(),
                newLoopCharacteristics, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoopCharacteristics(
            LoopCharacteristics newLoopCharacteristics) {
        ((FeatureMap.Internal) getLoopCharacteristicsGroup()).set(
                Bpmn2Package.eINSTANCE.getActivity_LoopCharacteristics(),
                newLoopCharacteristics);
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
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.ACTIVITY__DEFAULT, oldDefault, default_));
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
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION,
                    oldIsForCompensation, isForCompensation,
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
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION,
                    oldIsForCompensation, IS_FOR_COMPENSATION_EDEFAULT,
                    oldIsForCompensationESet));
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
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
            int featureID, NotificationChain msgs) {
        switch (featureID) {
        case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
            return basicSetIoSpecification(null, msgs);
        case Bpmn2Package.ACTIVITY__PROPERTY:
            return ((InternalEList<?>) getProperty()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATION:
            return ((InternalEList<?>) getDataInputAssociation()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
            return ((InternalEList<?>) getDataOutputAssociation()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__PERFORMER_GROUP:
            return ((InternalEList<?>) getPerformerGroup()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__PERFORMER:
            return ((InternalEList<?>) getPerformer()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            return ((InternalEList<?>) getLoopCharacteristicsGroup())
                    .basicRemove(otherEnd, msgs);
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
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
        case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
            return getIoSpecification();
        case Bpmn2Package.ACTIVITY__PROPERTY:
            return getProperty();
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATION:
            return getDataInputAssociation();
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
            return getDataOutputAssociation();
        case Bpmn2Package.ACTIVITY__PERFORMER_GROUP:
            if (coreType)
                return getPerformerGroup();
            return ((FeatureMap.Internal) getPerformerGroup()).getWrapper();
        case Bpmn2Package.ACTIVITY__PERFORMER:
            return getPerformer();
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            if (coreType)
                return getLoopCharacteristicsGroup();
            return ((FeatureMap.Internal) getLoopCharacteristicsGroup())
                    .getWrapper();
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
            return getLoopCharacteristics();
        case Bpmn2Package.ACTIVITY__DEFAULT:
            return getDefault();
        case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
            return isIsForCompensation();
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
        case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
            setIoSpecification((InputOutputSpecification) newValue);
            return;
        case Bpmn2Package.ACTIVITY__PROPERTY:
            getProperty().clear();
            getProperty().addAll((Collection<? extends Property>) newValue);
            return;
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATION:
            getDataInputAssociation().clear();
            getDataInputAssociation().addAll(
                    (Collection<? extends DataInputAssociation>) newValue);
            return;
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
            getDataOutputAssociation().clear();
            getDataOutputAssociation().addAll(
                    (Collection<? extends DataOutputAssociation>) newValue);
            return;
        case Bpmn2Package.ACTIVITY__PERFORMER_GROUP:
            ((FeatureMap.Internal) getPerformerGroup()).set(newValue);
            return;
        case Bpmn2Package.ACTIVITY__PERFORMER:
            getPerformer().clear();
            getPerformer().addAll((Collection<? extends Performer>) newValue);
            return;
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            ((FeatureMap.Internal) getLoopCharacteristicsGroup()).set(newValue);
            return;
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
            setLoopCharacteristics((LoopCharacteristics) newValue);
            return;
        case Bpmn2Package.ACTIVITY__DEFAULT:
            setDefault((String) newValue);
            return;
        case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
            setIsForCompensation((Boolean) newValue);
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
        case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
            setIoSpecification((InputOutputSpecification) null);
            return;
        case Bpmn2Package.ACTIVITY__PROPERTY:
            getProperty().clear();
            return;
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATION:
            getDataInputAssociation().clear();
            return;
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
            getDataOutputAssociation().clear();
            return;
        case Bpmn2Package.ACTIVITY__PERFORMER_GROUP:
            getPerformerGroup().clear();
            return;
        case Bpmn2Package.ACTIVITY__PERFORMER:
            getPerformer().clear();
            return;
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            getLoopCharacteristicsGroup().clear();
            return;
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
            setLoopCharacteristics((LoopCharacteristics) null);
            return;
        case Bpmn2Package.ACTIVITY__DEFAULT:
            setDefault(DEFAULT_EDEFAULT);
            return;
        case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
            unsetIsForCompensation();
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
        case Bpmn2Package.ACTIVITY__IO_SPECIFICATION:
            return ioSpecification != null;
        case Bpmn2Package.ACTIVITY__PROPERTY:
            return property != null && !property.isEmpty();
        case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATION:
            return dataInputAssociation != null
                    && !dataInputAssociation.isEmpty();
        case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATION:
            return dataOutputAssociation != null
                    && !dataOutputAssociation.isEmpty();
        case Bpmn2Package.ACTIVITY__PERFORMER_GROUP:
            return performerGroup != null && !performerGroup.isEmpty();
        case Bpmn2Package.ACTIVITY__PERFORMER:
            return !getPerformer().isEmpty();
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS_GROUP:
            return loopCharacteristicsGroup != null
                    && !loopCharacteristicsGroup.isEmpty();
        case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS:
            return getLoopCharacteristics() != null;
        case Bpmn2Package.ACTIVITY__DEFAULT:
            return DEFAULT_EDEFAULT == null ? default_ != null
                    : !DEFAULT_EDEFAULT.equals(default_);
        case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION:
            return isSetIsForCompensation();
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
        result.append(" (performerGroup: ");
        result.append(performerGroup);
        result.append(", loopCharacteristicsGroup: ");
        result.append(loopCharacteristicsGroup);
        result.append(", default: ");
        result.append(default_);
        result.append(", isForCompensation: ");
        if (isForCompensationESet)
            result.append(isForCompensation);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ActivityImpl
