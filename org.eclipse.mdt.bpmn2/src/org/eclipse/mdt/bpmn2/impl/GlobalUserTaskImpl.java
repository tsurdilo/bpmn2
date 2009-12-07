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

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.GlobalUserTask;
import org.eclipse.mdt.bpmn2.Rendering;
import org.eclipse.mdt.bpmn2.UserTaskImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global User Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.GlobalUserTaskImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.GlobalUserTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.GlobalUserTaskImpl#getInMessageRef <em>In Message Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.GlobalUserTaskImpl#getOutMessageRef <em>Out Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalUserTaskImpl extends GlobalTaskImpl implements
        GlobalUserTask {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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
     * The default value of the '{@link #getInMessageRef() <em>In Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInMessageRef()
     * @generated
     * @ordered
     */
    protected static final QName IN_MESSAGE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInMessageRef() <em>In Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInMessageRef()
     * @generated
     * @ordered
     */
    protected QName inMessageRef = IN_MESSAGE_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getOutMessageRef() <em>Out Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutMessageRef()
     * @generated
     * @ordered
     */
    protected static final QName OUT_MESSAGE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutMessageRef() <em>Out Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutMessageRef()
     * @generated
     * @ordered
     */
    protected QName outMessageRef = OUT_MESSAGE_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GlobalUserTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getGlobalUserTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Rendering> getRendering() {
        if (rendering == null) {
            rendering = new EObjectContainmentEList<Rendering>(Rendering.class,
                    this, Bpmn2Package.GLOBAL_USER_TASK__RENDERING);
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
                    Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION,
                    oldImplementation, implementation, !oldImplementationESet));
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
                    Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION,
                    oldImplementation, IMPLEMENTATION_EDEFAULT,
                    oldImplementationESet));
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
    public QName getInMessageRef() {
        return inMessageRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInMessageRef(QName newInMessageRef) {
        QName oldInMessageRef = inMessageRef;
        inMessageRef = newInMessageRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.GLOBAL_USER_TASK__IN_MESSAGE_REF,
                    oldInMessageRef, inMessageRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getOutMessageRef() {
        return outMessageRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutMessageRef(QName newOutMessageRef) {
        QName oldOutMessageRef = outMessageRef;
        outMessageRef = newOutMessageRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.GLOBAL_USER_TASK__OUT_MESSAGE_REF,
                    oldOutMessageRef, outMessageRef));
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
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERING:
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
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERING:
            return getRendering();
        case Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION:
            return getImplementation();
        case Bpmn2Package.GLOBAL_USER_TASK__IN_MESSAGE_REF:
            return getInMessageRef();
        case Bpmn2Package.GLOBAL_USER_TASK__OUT_MESSAGE_REF:
            return getOutMessageRef();
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
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERING:
            getRendering().clear();
            getRendering().addAll((Collection<? extends Rendering>) newValue);
            return;
        case Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION:
            setImplementation((UserTaskImplementation) newValue);
            return;
        case Bpmn2Package.GLOBAL_USER_TASK__IN_MESSAGE_REF:
            setInMessageRef((QName) newValue);
            return;
        case Bpmn2Package.GLOBAL_USER_TASK__OUT_MESSAGE_REF:
            setOutMessageRef((QName) newValue);
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
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERING:
            getRendering().clear();
            return;
        case Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION:
            unsetImplementation();
            return;
        case Bpmn2Package.GLOBAL_USER_TASK__IN_MESSAGE_REF:
            setInMessageRef(IN_MESSAGE_REF_EDEFAULT);
            return;
        case Bpmn2Package.GLOBAL_USER_TASK__OUT_MESSAGE_REF:
            setOutMessageRef(OUT_MESSAGE_REF_EDEFAULT);
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
        case Bpmn2Package.GLOBAL_USER_TASK__RENDERING:
            return rendering != null && !rendering.isEmpty();
        case Bpmn2Package.GLOBAL_USER_TASK__IMPLEMENTATION:
            return isSetImplementation();
        case Bpmn2Package.GLOBAL_USER_TASK__IN_MESSAGE_REF:
            return IN_MESSAGE_REF_EDEFAULT == null ? inMessageRef != null
                    : !IN_MESSAGE_REF_EDEFAULT.equals(inMessageRef);
        case Bpmn2Package.GLOBAL_USER_TASK__OUT_MESSAGE_REF:
            return OUT_MESSAGE_REF_EDEFAULT == null ? outMessageRef != null
                    : !OUT_MESSAGE_REF_EDEFAULT.equals(outMessageRef);
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
        result.append(" (implementation: ");
        if (implementationESet)
            result.append(implementation);
        else
            result.append("<unset>");
        result.append(", inMessageRef: ");
        result.append(inMessageRef);
        result.append(", outMessageRef: ");
        result.append(outMessageRef);
        result.append(')');
        return result.toString();
    }

} //GlobalUserTaskImpl
