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
 * $Id$
 */
package org.eclipse.mdt.bpmn.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.CorrelationPropertyBinding;
import org.eclipse.mdt.bpmn.CorrelationSubscription;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CorrelationSubscriptionImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CorrelationSubscriptionImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CorrelationSubscriptionImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationSubscriptionImpl extends BaseElementImpl implements CorrelationSubscription {
    /**
     * The cached value of the '{@link #getCorrelationPropertyBinding() <em>Correlation Property Binding</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationPropertyBinding()
     * @generated
     * @ordered
     */
    protected EList<CorrelationPropertyBinding> correlationPropertyBinding;

    /**
     * The default value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationKeyRef()
     * @generated
     * @ordered
     */
    protected static final QName CORRELATION_KEY_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationKeyRef()
     * @generated
     * @ordered
     */
    protected QName correlationKeyRef = CORRELATION_KEY_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getProcess() <em>Process</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcess()
     * @generated
     * @ordered
     */
    protected static final QName PROCESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcess() <em>Process</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcess()
     * @generated
     * @ordered
     */
    protected QName process = PROCESS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CorrelationSubscriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getCorrelationSubscription();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CorrelationPropertyBinding> getCorrelationPropertyBinding() {
        if (correlationPropertyBinding == null) {
            correlationPropertyBinding = new EObjectContainmentEList<CorrelationPropertyBinding>(CorrelationPropertyBinding.class, this, bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING);
        }
        return correlationPropertyBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getCorrelationKeyRef() {
        return correlationKeyRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCorrelationKeyRef(QName newCorrelationKeyRef) {
        QName oldCorrelationKeyRef = correlationKeyRef;
        correlationKeyRef = newCorrelationKeyRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF, oldCorrelationKeyRef, correlationKeyRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getProcess() {
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcess(QName newProcess) {
        QName oldProcess = process;
        process = newProcess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.CORRELATION_SUBSCRIPTION__PROCESS, oldProcess, process));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
                return ((InternalEList<?>)getCorrelationPropertyBinding()).basicRemove(otherEnd, msgs);
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
            case bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
                return getCorrelationPropertyBinding();
            case bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
                return getCorrelationKeyRef();
            case bpmnPackage.CORRELATION_SUBSCRIPTION__PROCESS:
                return getProcess();
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
            case bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
                getCorrelationPropertyBinding().clear();
                getCorrelationPropertyBinding().addAll((Collection<? extends CorrelationPropertyBinding>)newValue);
                return;
            case bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
                setCorrelationKeyRef((QName)newValue);
                return;
            case bpmnPackage.CORRELATION_SUBSCRIPTION__PROCESS:
                setProcess((QName)newValue);
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
            case bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
                getCorrelationPropertyBinding().clear();
                return;
            case bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
                setCorrelationKeyRef(CORRELATION_KEY_REF_EDEFAULT);
                return;
            case bpmnPackage.CORRELATION_SUBSCRIPTION__PROCESS:
                setProcess(PROCESS_EDEFAULT);
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
            case bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
                return correlationPropertyBinding != null && !correlationPropertyBinding.isEmpty();
            case bpmnPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
                return CORRELATION_KEY_REF_EDEFAULT == null ? correlationKeyRef != null : !CORRELATION_KEY_REF_EDEFAULT.equals(correlationKeyRef);
            case bpmnPackage.CORRELATION_SUBSCRIPTION__PROCESS:
                return PROCESS_EDEFAULT == null ? process != null : !PROCESS_EDEFAULT.equals(process);
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
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (correlationKeyRef: "); //$NON-NLS-1$
        result.append(correlationKeyRef);
        result.append(", process: "); //$NON-NLS-1$
        result.append(process);
        result.append(')');
        return result.toString();
    }

} //CorrelationSubscriptionImpl
