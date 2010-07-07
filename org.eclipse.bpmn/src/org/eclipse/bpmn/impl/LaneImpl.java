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
import org.eclipse.bpmn.BaseElement;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.Lane;
import org.eclipse.bpmn.LaneSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.LaneImpl#getPartitionElement <em>Partition Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.LaneImpl#getFlowElementRef <em>Flow Element Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.LaneImpl#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.LaneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.LaneImpl#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaneImpl extends BaseElementImpl implements Lane {
    /**
     * The cached value of the '{@link #getPartitionElement() <em>Partition Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartitionElement()
     * @generated
     * @ordered
     */
    protected BaseElement partitionElement;

    /**
     * The cached value of the '{@link #getFlowElementRef() <em>Flow Element Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowElementRef()
     * @generated
     * @ordered
     */
    protected EList<String> flowElementRef;

    /**
     * The cached value of the '{@link #getChildLaneSet() <em>Child Lane Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildLaneSet()
     * @generated
     * @ordered
     */
    protected LaneSet childLaneSet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPartitionElementRef() <em>Partition Element Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartitionElementRef()
     * @generated
     * @ordered
     */
    protected static final String PARTITION_ELEMENT_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPartitionElementRef() <em>Partition Element Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartitionElementRef()
     * @generated
     * @ordered
     */
    protected String partitionElementRef = PARTITION_ELEMENT_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LaneImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getLane();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseElement getPartitionElement() {
        return partitionElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPartitionElement(BaseElement newPartitionElement, NotificationChain msgs) {
        BaseElement oldPartitionElement = partitionElement;
        partitionElement = newPartitionElement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.LANE__PARTITION_ELEMENT, oldPartitionElement,
                    newPartitionElement);
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
    public void setPartitionElement(BaseElement newPartitionElement) {
        if (newPartitionElement != partitionElement) {
            NotificationChain msgs = null;
            if (partitionElement != null)
                msgs = ((InternalEObject) partitionElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.LANE__PARTITION_ELEMENT, null, msgs);
            if (newPartitionElement != null)
                msgs = ((InternalEObject) newPartitionElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.LANE__PARTITION_ELEMENT, null, msgs);
            msgs = basicSetPartitionElement(newPartitionElement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.LANE__PARTITION_ELEMENT, newPartitionElement, newPartitionElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getFlowElementRef() {
        if (flowElementRef == null) {
            flowElementRef = new EDataTypeEList<String>(String.class, this, BpmnPackage.LANE__FLOW_ELEMENT_REF);
        }
        return flowElementRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LaneSet getChildLaneSet() {
        return childLaneSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChildLaneSet(LaneSet newChildLaneSet, NotificationChain msgs) {
        LaneSet oldChildLaneSet = childLaneSet;
        childLaneSet = newChildLaneSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.LANE__CHILD_LANE_SET, oldChildLaneSet, newChildLaneSet);
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
    public void setChildLaneSet(LaneSet newChildLaneSet) {
        if (newChildLaneSet != childLaneSet) {
            NotificationChain msgs = null;
            if (childLaneSet != null)
                msgs = ((InternalEObject) childLaneSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.LANE__CHILD_LANE_SET, null, msgs);
            if (newChildLaneSet != null)
                msgs = ((InternalEObject) newChildLaneSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.LANE__CHILD_LANE_SET, null, msgs);
            msgs = basicSetChildLaneSet(newChildLaneSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.LANE__CHILD_LANE_SET, newChildLaneSet, newChildLaneSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.LANE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPartitionElementRef() {
        return partitionElementRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPartitionElementRef(String newPartitionElementRef) {
        String oldPartitionElementRef = partitionElementRef;
        partitionElementRef = newPartitionElementRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.LANE__PARTITION_ELEMENT_REF, oldPartitionElementRef, partitionElementRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.LANE__PARTITION_ELEMENT:
            return basicSetPartitionElement(null, msgs);
        case BpmnPackage.LANE__CHILD_LANE_SET:
            return basicSetChildLaneSet(null, msgs);
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
        case BpmnPackage.LANE__PARTITION_ELEMENT:
            return getPartitionElement();
        case BpmnPackage.LANE__FLOW_ELEMENT_REF:
            return getFlowElementRef();
        case BpmnPackage.LANE__CHILD_LANE_SET:
            return getChildLaneSet();
        case BpmnPackage.LANE__NAME:
            return getName();
        case BpmnPackage.LANE__PARTITION_ELEMENT_REF:
            return getPartitionElementRef();
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
        case BpmnPackage.LANE__PARTITION_ELEMENT:
            setPartitionElement((BaseElement) newValue);
            return;
        case BpmnPackage.LANE__FLOW_ELEMENT_REF:
            getFlowElementRef().clear();
            getFlowElementRef().addAll((Collection<? extends String>) newValue);
            return;
        case BpmnPackage.LANE__CHILD_LANE_SET:
            setChildLaneSet((LaneSet) newValue);
            return;
        case BpmnPackage.LANE__NAME:
            setName((String) newValue);
            return;
        case BpmnPackage.LANE__PARTITION_ELEMENT_REF:
            setPartitionElementRef((String) newValue);
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
        case BpmnPackage.LANE__PARTITION_ELEMENT:
            setPartitionElement((BaseElement) null);
            return;
        case BpmnPackage.LANE__FLOW_ELEMENT_REF:
            getFlowElementRef().clear();
            return;
        case BpmnPackage.LANE__CHILD_LANE_SET:
            setChildLaneSet((LaneSet) null);
            return;
        case BpmnPackage.LANE__NAME:
            setName(NAME_EDEFAULT);
            return;
        case BpmnPackage.LANE__PARTITION_ELEMENT_REF:
            setPartitionElementRef(PARTITION_ELEMENT_REF_EDEFAULT);
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
        case BpmnPackage.LANE__PARTITION_ELEMENT:
            return partitionElement != null;
        case BpmnPackage.LANE__FLOW_ELEMENT_REF:
            return flowElementRef != null && !flowElementRef.isEmpty();
        case BpmnPackage.LANE__CHILD_LANE_SET:
            return childLaneSet != null;
        case BpmnPackage.LANE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case BpmnPackage.LANE__PARTITION_ELEMENT_REF:
            return PARTITION_ELEMENT_REF_EDEFAULT == null ? partitionElementRef != null : !PARTITION_ELEMENT_REF_EDEFAULT.equals(partitionElementRef);
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
        result.append(" (flowElementRef: "); //$NON-NLS-1$
        result.append(flowElementRef);
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(", partitionElementRef: "); //$NON-NLS-1$
        result.append(partitionElementRef);
        result.append(')');
        return result.toString();
    }

} //LaneImpl
