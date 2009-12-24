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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.CorrelationKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CorrelationKeyImpl#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationKeyImpl extends BaseElementImpl implements
        CorrelationKey {
    /**
     * The cached value of the '{@link #getCorrelationPropertyRef() <em>Correlation Property Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationPropertyRef()
     * @generated
     * @ordered
     */
    protected EList<QName> correlationPropertyRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CorrelationKeyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getCorrelationKey();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getCorrelationPropertyRef() {
        if (correlationPropertyRef == null) {
            correlationPropertyRef = new EDataTypeEList<QName>(QName.class,
                    this, BpmnPackage.CORRELATION_KEY__CORRELATION_PROPERTY_REF);
        }
        return correlationPropertyRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.CORRELATION_KEY__CORRELATION_PROPERTY_REF:
            return getCorrelationPropertyRef();
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
        case BpmnPackage.CORRELATION_KEY__CORRELATION_PROPERTY_REF:
            getCorrelationPropertyRef().clear();
            getCorrelationPropertyRef().addAll(
                    (Collection<? extends QName>) newValue);
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
        case BpmnPackage.CORRELATION_KEY__CORRELATION_PROPERTY_REF:
            getCorrelationPropertyRef().clear();
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
        case BpmnPackage.CORRELATION_KEY__CORRELATION_PROPERTY_REF:
            return correlationPropertyRef != null
                    && !correlationPropertyRef.isEmpty();
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
        result.append(" (correlationPropertyRef: "); //$NON-NLS-1$
        result.append(correlationPropertyRef);
        result.append(')');
        return result.toString();
    }

} //CorrelationKeyImpl
