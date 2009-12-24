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
package org.eclipse.mdt.bpmn.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.ResourceParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ResourceParameterImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ResourceParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ResourceParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceParameterImpl extends BaseElementImpl implements
        ResourceParameter {
    /**
     * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsRequired()
     * @generated
     * @ordered
     */
    protected static final boolean IS_REQUIRED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsRequired()
     * @generated
     * @ordered
     */
    protected boolean isRequired = IS_REQUIRED_EDEFAULT;

    /**
     * This is true if the Is Required attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isRequiredESet;

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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final QName TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected QName type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getResourceParameter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsRequired(boolean newIsRequired) {
        boolean oldIsRequired = isRequired;
        isRequired = newIsRequired;
        boolean oldIsRequiredESet = isRequiredESet;
        isRequiredESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.RESOURCE_PARAMETER__IS_REQUIRED, oldIsRequired,
                    isRequired, !oldIsRequiredESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsRequired() {
        boolean oldIsRequired = isRequired;
        boolean oldIsRequiredESet = isRequiredESet;
        isRequired = IS_REQUIRED_EDEFAULT;
        isRequiredESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.RESOURCE_PARAMETER__IS_REQUIRED, oldIsRequired,
                    IS_REQUIRED_EDEFAULT, oldIsRequiredESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsRequired() {
        return isRequiredESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.RESOURCE_PARAMETER__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(QName newType) {
        QName oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.RESOURCE_PARAMETER__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.RESOURCE_PARAMETER__IS_REQUIRED:
            return isIsRequired();
        case BpmnPackage.RESOURCE_PARAMETER__NAME:
            return getName();
        case BpmnPackage.RESOURCE_PARAMETER__TYPE:
            return getType();
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
        case BpmnPackage.RESOURCE_PARAMETER__IS_REQUIRED:
            setIsRequired((Boolean) newValue);
            return;
        case BpmnPackage.RESOURCE_PARAMETER__NAME:
            setName((String) newValue);
            return;
        case BpmnPackage.RESOURCE_PARAMETER__TYPE:
            setType((QName) newValue);
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
        case BpmnPackage.RESOURCE_PARAMETER__IS_REQUIRED:
            unsetIsRequired();
            return;
        case BpmnPackage.RESOURCE_PARAMETER__NAME:
            setName(NAME_EDEFAULT);
            return;
        case BpmnPackage.RESOURCE_PARAMETER__TYPE:
            setType(TYPE_EDEFAULT);
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
        case BpmnPackage.RESOURCE_PARAMETER__IS_REQUIRED:
            return isSetIsRequired();
        case BpmnPackage.RESOURCE_PARAMETER__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
        case BpmnPackage.RESOURCE_PARAMETER__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
                    .equals(type);
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
        result.append(" (isRequired: "); //$NON-NLS-1$
        if (isRequiredESet)
            result.append(isRequired);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(", type: "); //$NON-NLS-1$
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //ResourceParameterImpl
