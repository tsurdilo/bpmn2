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

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.EventBasedGateway;
import org.eclipse.bpmn.EventBasedGatewayType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.EventBasedGatewayImpl#getEventGatewayType <em>Event Gateway Type</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.EventBasedGatewayImpl#isInstantiate <em>Instantiate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventBasedGatewayImpl extends GatewayImpl implements EventBasedGateway {
    /**
     * The default value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventGatewayType()
     * @generated
     * @ordered
     */
    protected static final EventBasedGatewayType EVENT_GATEWAY_TYPE_EDEFAULT = EventBasedGatewayType.EXCLUSIVE;

    /**
     * The cached value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventGatewayType()
     * @generated
     * @ordered
     */
    protected EventBasedGatewayType eventGatewayType = EVENT_GATEWAY_TYPE_EDEFAULT;

    /**
     * This is true if the Event Gateway Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eventGatewayTypeESet;

    /**
     * The default value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInstantiate()
     * @generated
     * @ordered
     */
    protected static final boolean INSTANTIATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInstantiate()
     * @generated
     * @ordered
     */
    protected boolean instantiate = INSTANTIATE_EDEFAULT;

    /**
     * This is true if the Instantiate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean instantiateESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventBasedGatewayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getEventBasedGateway();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventBasedGatewayType getEventGatewayType() {
        return eventGatewayType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventGatewayType(EventBasedGatewayType newEventGatewayType) {
        EventBasedGatewayType oldEventGatewayType = eventGatewayType;
        eventGatewayType = newEventGatewayType == null ? EVENT_GATEWAY_TYPE_EDEFAULT : newEventGatewayType;
        boolean oldEventGatewayTypeESet = eventGatewayTypeESet;
        eventGatewayTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE, oldEventGatewayType, eventGatewayType,
                    !oldEventGatewayTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetEventGatewayType() {
        EventBasedGatewayType oldEventGatewayType = eventGatewayType;
        boolean oldEventGatewayTypeESet = eventGatewayTypeESet;
        eventGatewayType = EVENT_GATEWAY_TYPE_EDEFAULT;
        eventGatewayTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE, oldEventGatewayType,
                    EVENT_GATEWAY_TYPE_EDEFAULT, oldEventGatewayTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetEventGatewayType() {
        return eventGatewayTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInstantiate() {
        return instantiate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiate(boolean newInstantiate) {
        boolean oldInstantiate = instantiate;
        instantiate = newInstantiate;
        boolean oldInstantiateESet = instantiateESet;
        instantiateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.EVENT_BASED_GATEWAY__INSTANTIATE, oldInstantiate, instantiate,
                    !oldInstantiateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInstantiate() {
        boolean oldInstantiate = instantiate;
        boolean oldInstantiateESet = instantiateESet;
        instantiate = INSTANTIATE_EDEFAULT;
        instantiateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.EVENT_BASED_GATEWAY__INSTANTIATE, oldInstantiate, INSTANTIATE_EDEFAULT,
                    oldInstantiateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInstantiate() {
        return instantiateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
            return getEventGatewayType();
        case BpmnPackage.EVENT_BASED_GATEWAY__INSTANTIATE:
            return isInstantiate();
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
        case BpmnPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
            setEventGatewayType((EventBasedGatewayType) newValue);
            return;
        case BpmnPackage.EVENT_BASED_GATEWAY__INSTANTIATE:
            setInstantiate((Boolean) newValue);
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
        case BpmnPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
            unsetEventGatewayType();
            return;
        case BpmnPackage.EVENT_BASED_GATEWAY__INSTANTIATE:
            unsetInstantiate();
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
        case BpmnPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
            return isSetEventGatewayType();
        case BpmnPackage.EVENT_BASED_GATEWAY__INSTANTIATE:
            return isSetInstantiate();
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
        result.append(" (eventGatewayType: "); //$NON-NLS-1$
        if (eventGatewayTypeESet)
            result.append(eventGatewayType);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", instantiate: "); //$NON-NLS-1$
        if (instantiateESet)
            result.append(instantiate);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //EventBasedGatewayImpl
