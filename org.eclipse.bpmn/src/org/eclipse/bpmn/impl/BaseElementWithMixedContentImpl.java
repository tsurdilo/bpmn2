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
import org.eclipse.bpmn.BaseElementWithMixedContent;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.Category;
import org.eclipse.bpmn.Documentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Element With Mixed Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.BaseElementWithMixedContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.BaseElementWithMixedContentImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.BaseElementWithMixedContentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.BaseElementWithMixedContentImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.BaseElementWithMixedContentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.BaseElementWithMixedContentImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BaseElementWithMixedContentImpl extends EObjectImpl implements BaseElementWithMixedContent {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

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
    protected BaseElementWithMixedContentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getBaseElementWithMixedContent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Documentation> getDocumentation() {
        return getMixed().list(BpmnPackage.eINSTANCE.getBaseElementWithMixedContent_Documentation());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Category> getCategory() {
        return getMixed().list(BpmnPackage.eINSTANCE.getBaseElementWithMixedContent_Category());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        return (FeatureMap) getMixed().<FeatureMap.Entry> list(BpmnPackage.eINSTANCE.getBaseElementWithMixedContent_Any());
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE);
        }
        return anyAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__MIXED:
            return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
            return ((InternalEList<?>) getDocumentation()).basicRemove(otherEnd, msgs);
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__CATEGORY:
            return ((InternalEList<?>) getCategory()).basicRemove(otherEnd, msgs);
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY:
            return ((InternalEList<?>) getAny()).basicRemove(otherEnd, msgs);
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
            return ((InternalEList<?>) getAnyAttribute()).basicRemove(otherEnd, msgs);
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
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__MIXED:
            if (coreType)
                return getMixed();
            return ((FeatureMap.Internal) getMixed()).getWrapper();
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
            return getDocumentation();
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__CATEGORY:
            return getCategory();
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY:
            if (coreType)
                return getAny();
            return ((FeatureMap.Internal) getAny()).getWrapper();
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ID:
            return getId();
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__MIXED:
            ((FeatureMap.Internal) getMixed()).set(newValue);
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
            getDocumentation().clear();
            getDocumentation().addAll((Collection<? extends Documentation>) newValue);
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__CATEGORY:
            getCategory().clear();
            getCategory().addAll((Collection<? extends Category>) newValue);
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY:
            ((FeatureMap.Internal) getAny()).set(newValue);
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ID:
            setId((String) newValue);
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__MIXED:
            getMixed().clear();
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
            getDocumentation().clear();
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__CATEGORY:
            getCategory().clear();
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY:
            getAny().clear();
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ID:
            setId(ID_EDEFAULT);
            return;
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__MIXED:
            return mixed != null && !mixed.isEmpty();
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
            return !getDocumentation().isEmpty();
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__CATEGORY:
            return !getCategory().isEmpty();
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY:
            return !getAny().isEmpty();
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
        case BpmnPackage.BASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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
        result.append(" (mixed: "); //$NON-NLS-1$
        result.append(mixed);
        result.append(", id: "); //$NON-NLS-1$
        result.append(id);
        result.append(", anyAttribute: "); //$NON-NLS-1$
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //BaseElementWithMixedContentImpl
