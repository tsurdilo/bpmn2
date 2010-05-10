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
import org.eclipse.bpmn.Rendering;
import org.eclipse.bpmn.UserTask;
import org.eclipse.bpmn.UserTaskImplementation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.UserTaskImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.UserTaskImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserTaskImpl extends TaskImpl implements UserTask {
    /**
     * The cached value of the '{@link #getRendering() <em>Rendering</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRendering()
     * @generated
     * @ordered
     */
    protected EList<Rendering> rendering;

    /**
     * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementation()
     * @generated
     * @ordered
     */
    protected static final UserTaskImplementation IMPLEMENTATION_EDEFAULT = UserTaskImplementation.UNSPECIFIED;

    /**
     * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementation()
     * @generated
     * @ordered
     */
    protected UserTaskImplementation implementation = IMPLEMENTATION_EDEFAULT;

    /**
     * This is true if the Implementation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean implementationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UserTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getUserTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Rendering> getRendering() {
        if (rendering == null) {
            rendering = new EObjectContainmentEList<Rendering>(Rendering.class,
                    this, BpmnPackage.USER_TASK__RENDERING);
        }
        return rendering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTaskImplementation getImplementation() {
        return implementation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImplementation(UserTaskImplementation newImplementation) {
        UserTaskImplementation oldImplementation = implementation;
        implementation = newImplementation == null ? IMPLEMENTATION_EDEFAULT
                : newImplementation;
        boolean oldImplementationESet = implementationESet;
        implementationESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.USER_TASK__IMPLEMENTATION, oldImplementation,
                    implementation, !oldImplementationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetImplementation() {
        UserTaskImplementation oldImplementation = implementation;
        boolean oldImplementationESet = implementationESet;
        implementation = IMPLEMENTATION_EDEFAULT;
        implementationESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.USER_TASK__IMPLEMENTATION, oldImplementation,
                    IMPLEMENTATION_EDEFAULT, oldImplementationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetImplementation() {
        return implementationESet;
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
        case BpmnPackage.USER_TASK__RENDERING:
            return ((InternalEList<?>) getRendering()).basicRemove(otherEnd,
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
        case BpmnPackage.USER_TASK__RENDERING:
            return getRendering();
        case BpmnPackage.USER_TASK__IMPLEMENTATION:
            return getImplementation();
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
        case BpmnPackage.USER_TASK__RENDERING:
            getRendering().clear();
            getRendering().addAll((Collection<? extends Rendering>) newValue);
            return;
        case BpmnPackage.USER_TASK__IMPLEMENTATION:
            setImplementation((UserTaskImplementation) newValue);
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
        case BpmnPackage.USER_TASK__RENDERING:
            getRendering().clear();
            return;
        case BpmnPackage.USER_TASK__IMPLEMENTATION:
            unsetImplementation();
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
        case BpmnPackage.USER_TASK__RENDERING:
            return rendering != null && !rendering.isEmpty();
        case BpmnPackage.USER_TASK__IMPLEMENTATION:
            return isSetImplementation();
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
        result.append(" (implementation: "); //$NON-NLS-1$
        if (implementationESet)
            result.append(implementation);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //UserTaskImpl
