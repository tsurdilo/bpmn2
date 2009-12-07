/**
 * Copyright (c) 2009, Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Intalio Inc. - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.mdt.bpmn2.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.Expression;
import org.eclipse.mdt.bpmn2.ParameterBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ParameterBindingImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ParameterBindingImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ParameterBindingImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterBindingImpl extends BaseElementImpl implements
        ParameterBinding {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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
     * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
    protected static final QName PARAMETER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
    protected QName parameter = PARAMETER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getParameterBinding();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getExpressionGroup() {
        if (expressionGroup == null) {
            expressionGroup = new BasicFeatureMap(this,
                    Bpmn2Package.PARAMETER_BINDING__EXPRESSION_GROUP);
        }
        return expressionGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getExpression() {
        return (Expression) getExpressionGroup().get(
                Bpmn2Package.eINSTANCE.getParameterBinding_Expression(), true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(Expression newExpression,
            NotificationChain msgs) {
        return ((FeatureMap.Internal) getExpressionGroup()).basicAdd(
                Bpmn2Package.eINSTANCE.getParameterBinding_Expression(),
                newExpression, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(Expression newExpression) {
        ((FeatureMap.Internal) getExpressionGroup()).set(Bpmn2Package.eINSTANCE
                .getParameterBinding_Expression(), newExpression);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getParameter() {
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParameter(QName newParameter) {
        QName oldParameter = parameter;
        parameter = newParameter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.PARAMETER_BINDING__PARAMETER, oldParameter,
                    parameter));
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
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION_GROUP:
            return ((InternalEList<?>) getExpressionGroup()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION:
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
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION_GROUP:
            if (coreType)
                return getExpressionGroup();
            return ((FeatureMap.Internal) getExpressionGroup()).getWrapper();
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION:
            return getExpression();
        case Bpmn2Package.PARAMETER_BINDING__PARAMETER:
            return getParameter();
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
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION_GROUP:
            ((FeatureMap.Internal) getExpressionGroup()).set(newValue);
            return;
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION:
            setExpression((Expression) newValue);
            return;
        case Bpmn2Package.PARAMETER_BINDING__PARAMETER:
            setParameter((QName) newValue);
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
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION_GROUP:
            getExpressionGroup().clear();
            return;
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION:
            setExpression((Expression) null);
            return;
        case Bpmn2Package.PARAMETER_BINDING__PARAMETER:
            setParameter(PARAMETER_EDEFAULT);
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
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION_GROUP:
            return expressionGroup != null && !expressionGroup.isEmpty();
        case Bpmn2Package.PARAMETER_BINDING__EXPRESSION:
            return getExpression() != null;
        case Bpmn2Package.PARAMETER_BINDING__PARAMETER:
            return PARAMETER_EDEFAULT == null ? parameter != null
                    : !PARAMETER_EDEFAULT.equals(parameter);
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
        result.append(" (expressionGroup: ");
        result.append(expressionGroup);
        result.append(", parameter: ");
        result.append(parameter);
        result.append(')');
        return result.toString();
    }

} //ParameterBindingImpl
