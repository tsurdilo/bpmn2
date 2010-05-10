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
import org.eclipse.bpmn.Gateway;
import org.eclipse.bpmn.GatewayDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.GatewayImpl#getGatewayDirection <em>Gateway Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GatewayImpl extends FlowNodeImpl implements Gateway {
    /**
     * The default value of the '{@link #getGatewayDirection() <em>Gateway Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGatewayDirection()
     * @generated
     * @ordered
     */
    protected static final GatewayDirection GATEWAY_DIRECTION_EDEFAULT = GatewayDirection.UNSPECIFIED;

    /**
     * The cached value of the '{@link #getGatewayDirection() <em>Gateway Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGatewayDirection()
     * @generated
     * @ordered
     */
    protected GatewayDirection gatewayDirection = GATEWAY_DIRECTION_EDEFAULT;

    /**
     * This is true if the Gateway Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gatewayDirectionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GatewayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getGateway();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GatewayDirection getGatewayDirection() {
        return gatewayDirection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGatewayDirection(GatewayDirection newGatewayDirection) {
        GatewayDirection oldGatewayDirection = gatewayDirection;
        gatewayDirection = newGatewayDirection == null ? GATEWAY_DIRECTION_EDEFAULT
                : newGatewayDirection;
        boolean oldGatewayDirectionESet = gatewayDirectionESet;
        gatewayDirectionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.GATEWAY__GATEWAY_DIRECTION,
                    oldGatewayDirection, gatewayDirection,
                    !oldGatewayDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetGatewayDirection() {
        GatewayDirection oldGatewayDirection = gatewayDirection;
        boolean oldGatewayDirectionESet = gatewayDirectionESet;
        gatewayDirection = GATEWAY_DIRECTION_EDEFAULT;
        gatewayDirectionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.GATEWAY__GATEWAY_DIRECTION,
                    oldGatewayDirection, GATEWAY_DIRECTION_EDEFAULT,
                    oldGatewayDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetGatewayDirection() {
        return gatewayDirectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.GATEWAY__GATEWAY_DIRECTION:
            return getGatewayDirection();
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
        case BpmnPackage.GATEWAY__GATEWAY_DIRECTION:
            setGatewayDirection((GatewayDirection) newValue);
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
        case BpmnPackage.GATEWAY__GATEWAY_DIRECTION:
            unsetGatewayDirection();
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
        case BpmnPackage.GATEWAY__GATEWAY_DIRECTION:
            return isSetGatewayDirection();
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
        result.append(" (gatewayDirection: "); //$NON-NLS-1$
        if (gatewayDirectionESet)
            result.append(gatewayDirection);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //GatewayImpl
