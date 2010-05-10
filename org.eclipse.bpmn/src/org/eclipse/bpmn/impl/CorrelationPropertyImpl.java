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

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.CorrelationProperty;
import org.eclipse.bpmn.CorrelationPropertyRetrievalExpression;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.CorrelationPropertyImpl#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationPropertyImpl extends RootElementImpl implements
        CorrelationProperty {
    /**
     * The cached value of the '{@link #getCorrelationPropertyRetrievalExpression() <em>Correlation Property Retrieval Expression</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationPropertyRetrievalExpression()
     * @generated
     * @ordered
     */
    protected EList<CorrelationPropertyRetrievalExpression> correlationPropertyRetrievalExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CorrelationPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getCorrelationProperty();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CorrelationPropertyRetrievalExpression> getCorrelationPropertyRetrievalExpression() {
        if (correlationPropertyRetrievalExpression == null) {
            correlationPropertyRetrievalExpression = new EObjectContainmentEList<CorrelationPropertyRetrievalExpression>(
                    CorrelationPropertyRetrievalExpression.class,
                    this,
                    BpmnPackage.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION);
        }
        return correlationPropertyRetrievalExpression;
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
        case BpmnPackage.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return ((InternalEList<?>) getCorrelationPropertyRetrievalExpression())
                    .basicRemove(otherEnd, msgs);
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
        case BpmnPackage.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return getCorrelationPropertyRetrievalExpression();
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
        case BpmnPackage.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            getCorrelationPropertyRetrievalExpression().clear();
            getCorrelationPropertyRetrievalExpression()
                    .addAll(
                            (Collection<? extends CorrelationPropertyRetrievalExpression>) newValue);
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
        case BpmnPackage.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            getCorrelationPropertyRetrievalExpression().clear();
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
        case BpmnPackage.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
            return correlationPropertyRetrievalExpression != null
                    && !correlationPropertyRetrievalExpression.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CorrelationPropertyImpl
