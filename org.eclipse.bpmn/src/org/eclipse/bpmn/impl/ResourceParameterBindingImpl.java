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

import javax.xml.namespace.QName;

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.Expression;
import org.eclipse.bpmn.ResourceParameterBinding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ResourceParameterBindingImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ResourceParameterBindingImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ResourceParameterBindingImpl#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceParameterBindingImpl extends BaseElementImpl implements ResourceParameterBinding {
    /**
     * The cached value of the '{@link #getExpressionGroup() <em>Expression Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap expressionGroup;

    /**
     * The default value of the '{@link #getParameterRef() <em>Parameter Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterRef()
     * @generated
     * @ordered
     */
    protected static final QName PARAMETER_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getParameterRef() <em>Parameter Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterRef()
     * @generated
     * @ordered
     */
    protected QName parameterRef = PARAMETER_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceParameterBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getResourceParameterBinding();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getExpressionGroup() {
        if (expressionGroup == null) {
            expressionGroup = new BasicFeatureMap(this, BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION_GROUP);
        }
        return expressionGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getExpression() {
        return (Expression) getExpressionGroup().get(BpmnPackage.eINSTANCE.getResourceParameterBinding_Expression(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
        return ((FeatureMap.Internal) getExpressionGroup()).basicAdd(BpmnPackage.eINSTANCE.getResourceParameterBinding_Expression(), newExpression, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(Expression newExpression) {
        ((FeatureMap.Internal) getExpressionGroup()).set(BpmnPackage.eINSTANCE.getResourceParameterBinding_Expression(), newExpression);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getParameterRef() {
        return parameterRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParameterRef(QName newParameterRef) {
        QName oldParameterRef = parameterRef;
        parameterRef = newParameterRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.RESOURCE_PARAMETER_BINDING__PARAMETER_REF, oldParameterRef, parameterRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION_GROUP:
            return ((InternalEList<?>) getExpressionGroup()).basicRemove(otherEnd, msgs);
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            return basicSetExpression(null, msgs);
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
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION_GROUP:
            if (coreType)
                return getExpressionGroup();
            return ((FeatureMap.Internal) getExpressionGroup()).getWrapper();
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            return getExpression();
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
            return getParameterRef();
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
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION_GROUP:
            ((FeatureMap.Internal) getExpressionGroup()).set(newValue);
            return;
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            setExpression((Expression) newValue);
            return;
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
            setParameterRef((QName) newValue);
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
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION_GROUP:
            getExpressionGroup().clear();
            return;
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            setExpression((Expression) null);
            return;
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
            setParameterRef(PARAMETER_REF_EDEFAULT);
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
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION_GROUP:
            return expressionGroup != null && !expressionGroup.isEmpty();
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__EXPRESSION:
            return getExpression() != null;
        case BpmnPackage.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
            return PARAMETER_REF_EDEFAULT == null ? parameterRef != null : !PARAMETER_REF_EDEFAULT.equals(parameterRef);
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
        result.append(" (expressionGroup: "); //$NON-NLS-1$
        result.append(expressionGroup);
        result.append(", parameterRef: "); //$NON-NLS-1$
        result.append(parameterRef);
        result.append(')');
        return result.toString();
    }

} //ResourceParameterBindingImpl
