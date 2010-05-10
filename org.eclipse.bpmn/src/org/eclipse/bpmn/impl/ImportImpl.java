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
import org.eclipse.bpmn.Import;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ImportImpl#getImportType <em>Import Type</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ImportImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ImportImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends EObjectImpl implements Import {
    /**
     * The default value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImportType()
     * @generated
     * @ordered
     */
    protected static final String IMPORT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImportType()
     * @generated
     * @ordered
     */
    protected String importType = IMPORT_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected static final String LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected String location = LOCATION_EDEFAULT;

    /**
     * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected String namespace = NAMESPACE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getImport();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImportType() {
        return importType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImportType(String newImportType) {
        String oldImportType = importType;
        importType = newImportType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.IMPORT__IMPORT_TYPE, oldImportType, importType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(String newLocation) {
        String oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.IMPORT__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNamespace(String newNamespace) {
        String oldNamespace = namespace;
        namespace = newNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.IMPORT__NAMESPACE, oldNamespace, namespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.IMPORT__IMPORT_TYPE:
            return getImportType();
        case BpmnPackage.IMPORT__LOCATION:
            return getLocation();
        case BpmnPackage.IMPORT__NAMESPACE:
            return getNamespace();
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
        case BpmnPackage.IMPORT__IMPORT_TYPE:
            setImportType((String) newValue);
            return;
        case BpmnPackage.IMPORT__LOCATION:
            setLocation((String) newValue);
            return;
        case BpmnPackage.IMPORT__NAMESPACE:
            setNamespace((String) newValue);
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
        case BpmnPackage.IMPORT__IMPORT_TYPE:
            setImportType(IMPORT_TYPE_EDEFAULT);
            return;
        case BpmnPackage.IMPORT__LOCATION:
            setLocation(LOCATION_EDEFAULT);
            return;
        case BpmnPackage.IMPORT__NAMESPACE:
            setNamespace(NAMESPACE_EDEFAULT);
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
        case BpmnPackage.IMPORT__IMPORT_TYPE:
            return IMPORT_TYPE_EDEFAULT == null ? importType != null
                    : !IMPORT_TYPE_EDEFAULT.equals(importType);
        case BpmnPackage.IMPORT__LOCATION:
            return LOCATION_EDEFAULT == null ? location != null
                    : !LOCATION_EDEFAULT.equals(location);
        case BpmnPackage.IMPORT__NAMESPACE:
            return NAMESPACE_EDEFAULT == null ? namespace != null
                    : !NAMESPACE_EDEFAULT.equals(namespace);
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
        result.append(" (importType: "); //$NON-NLS-1$
        result.append(importType);
        result.append(", location: "); //$NON-NLS-1$
        result.append(location);
        result.append(", namespace: "); //$NON-NLS-1$
        result.append(namespace);
        result.append(')');
        return result.toString();
    }

} //ImportImpl
