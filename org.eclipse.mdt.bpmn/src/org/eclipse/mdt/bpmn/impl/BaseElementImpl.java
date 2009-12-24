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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.BaseElement;
import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.Documentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.BaseElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.BaseElementImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.BaseElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.BaseElementImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseElementImpl extends EObjectImpl implements
        BaseElement {
    /**
     * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected EList<Documentation> documentation;

    /**
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
    protected FeatureMap any;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
    protected FeatureMap anyAttribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BaseElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getBaseElement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Documentation> getDocumentation() {
        if (documentation == null) {
            documentation = new EObjectContainmentEList<Documentation>(
                    Documentation.class, this,
                    BpmnPackage.BASE_ELEMENT__DOCUMENTATION);
        }
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, BpmnPackage.BASE_ELEMENT__ANY);
        }
        return any;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.BASE_ELEMENT__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this,
                    BpmnPackage.BASE_ELEMENT__ANY_ATTRIBUTE);
        }
        return anyAttribute;
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
        case BpmnPackage.BASE_ELEMENT__DOCUMENTATION:
            return ((InternalEList<?>) getDocumentation()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.BASE_ELEMENT__ANY:
            return ((InternalEList<?>) getAny()).basicRemove(otherEnd, msgs);
        case BpmnPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
            return ((InternalEList<?>) getAnyAttribute()).basicRemove(otherEnd,
                    msgs);
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
        case BpmnPackage.BASE_ELEMENT__DOCUMENTATION:
            return getDocumentation();
        case BpmnPackage.BASE_ELEMENT__ANY:
            if (coreType)
                return getAny();
            return ((FeatureMap.Internal) getAny()).getWrapper();
        case BpmnPackage.BASE_ELEMENT__ID:
            return getId();
        case BpmnPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
            if (coreType)
                return getAnyAttribute();
            return ((FeatureMap.Internal) getAnyAttribute()).getWrapper();
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
        case BpmnPackage.BASE_ELEMENT__DOCUMENTATION:
            getDocumentation().clear();
            getDocumentation().addAll(
                    (Collection<? extends Documentation>) newValue);
            return;
        case BpmnPackage.BASE_ELEMENT__ANY:
            ((FeatureMap.Internal) getAny()).set(newValue);
            return;
        case BpmnPackage.BASE_ELEMENT__ID:
            setId((String) newValue);
            return;
        case BpmnPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
            ((FeatureMap.Internal) getAnyAttribute()).set(newValue);
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
        case BpmnPackage.BASE_ELEMENT__DOCUMENTATION:
            getDocumentation().clear();
            return;
        case BpmnPackage.BASE_ELEMENT__ANY:
            getAny().clear();
            return;
        case BpmnPackage.BASE_ELEMENT__ID:
            setId(ID_EDEFAULT);
            return;
        case BpmnPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
            getAnyAttribute().clear();
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
        case BpmnPackage.BASE_ELEMENT__DOCUMENTATION:
            return documentation != null && !documentation.isEmpty();
        case BpmnPackage.BASE_ELEMENT__ANY:
            return any != null && !any.isEmpty();
        case BpmnPackage.BASE_ELEMENT__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
        case BpmnPackage.BASE_ELEMENT__ANY_ATTRIBUTE:
            return anyAttribute != null && !anyAttribute.isEmpty();
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
        result.append(" (any: "); //$NON-NLS-1$
        result.append(any);
        result.append(", id: "); //$NON-NLS-1$
        result.append(id);
        result.append(", anyAttribute: "); //$NON-NLS-1$
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //BaseElementImpl
