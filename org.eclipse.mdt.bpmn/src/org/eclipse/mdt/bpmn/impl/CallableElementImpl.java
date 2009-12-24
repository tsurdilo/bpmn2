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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.CallableElement;
import org.eclipse.mdt.bpmn.InputOutputBinding;
import org.eclipse.mdt.bpmn.InputOutputSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CallableElementImpl#getSupportedInterfaceRef <em>Supported Interface Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CallableElementImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CallableElementImpl#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CallableElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallableElementImpl extends RootElementImpl implements
        CallableElement {
    /**
     * The cached value of the '{@link #getSupportedInterfaceRef() <em>Supported Interface Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSupportedInterfaceRef()
     * @generated
     * @ordered
     */
    protected EList<QName> supportedInterfaceRef;

    /**
     * The cached value of the '{@link #getIoSpecification() <em>Io Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIoSpecification()
     * @generated
     * @ordered
     */
    protected InputOutputSpecification ioSpecification;

    /**
     * The cached value of the '{@link #getIoBinding() <em>Io Binding</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIoBinding()
     * @generated
     * @ordered
     */
    protected EList<InputOutputBinding> ioBinding;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CallableElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getCallableElement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getSupportedInterfaceRef() {
        if (supportedInterfaceRef == null) {
            supportedInterfaceRef = new EDataTypeEList<QName>(QName.class,
                    this, BpmnPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF);
        }
        return supportedInterfaceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputOutputSpecification getIoSpecification() {
        return ioSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIoSpecification(
            InputOutputSpecification newIoSpecification, NotificationChain msgs) {
        InputOutputSpecification oldIoSpecification = ioSpecification;
        ioSpecification = newIoSpecification;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    BpmnPackage.CALLABLE_ELEMENT__IO_SPECIFICATION,
                    oldIoSpecification, newIoSpecification);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIoSpecification(InputOutputSpecification newIoSpecification) {
        if (newIoSpecification != ioSpecification) {
            NotificationChain msgs = null;
            if (ioSpecification != null)
                msgs = ((InternalEObject) ioSpecification)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.CALLABLE_ELEMENT__IO_SPECIFICATION,
                                null, msgs);
            if (newIoSpecification != null)
                msgs = ((InternalEObject) newIoSpecification)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.CALLABLE_ELEMENT__IO_SPECIFICATION,
                                null, msgs);
            msgs = basicSetIoSpecification(newIoSpecification, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CALLABLE_ELEMENT__IO_SPECIFICATION,
                    newIoSpecification, newIoSpecification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InputOutputBinding> getIoBinding() {
        if (ioBinding == null) {
            ioBinding = new EObjectContainmentEList<InputOutputBinding>(
                    InputOutputBinding.class, this,
                    BpmnPackage.CALLABLE_ELEMENT__IO_BINDING);
        }
        return ioBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CALLABLE_ELEMENT__NAME, oldName, name));
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
        case BpmnPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
            return basicSetIoSpecification(null, msgs);
        case BpmnPackage.CALLABLE_ELEMENT__IO_BINDING:
            return ((InternalEList<?>) getIoBinding()).basicRemove(otherEnd,
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
        case BpmnPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF:
            return getSupportedInterfaceRef();
        case BpmnPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
            return getIoSpecification();
        case BpmnPackage.CALLABLE_ELEMENT__IO_BINDING:
            return getIoBinding();
        case BpmnPackage.CALLABLE_ELEMENT__NAME:
            return getName();
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
        case BpmnPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF:
            getSupportedInterfaceRef().clear();
            getSupportedInterfaceRef().addAll(
                    (Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
            setIoSpecification((InputOutputSpecification) newValue);
            return;
        case BpmnPackage.CALLABLE_ELEMENT__IO_BINDING:
            getIoBinding().clear();
            getIoBinding().addAll(
                    (Collection<? extends InputOutputBinding>) newValue);
            return;
        case BpmnPackage.CALLABLE_ELEMENT__NAME:
            setName((String) newValue);
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
        case BpmnPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF:
            getSupportedInterfaceRef().clear();
            return;
        case BpmnPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
            setIoSpecification((InputOutputSpecification) null);
            return;
        case BpmnPackage.CALLABLE_ELEMENT__IO_BINDING:
            getIoBinding().clear();
            return;
        case BpmnPackage.CALLABLE_ELEMENT__NAME:
            setName(NAME_EDEFAULT);
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
        case BpmnPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF:
            return supportedInterfaceRef != null
                    && !supportedInterfaceRef.isEmpty();
        case BpmnPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
            return ioSpecification != null;
        case BpmnPackage.CALLABLE_ELEMENT__IO_BINDING:
            return ioBinding != null && !ioBinding.isEmpty();
        case BpmnPackage.CALLABLE_ELEMENT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
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
        result.append(" (supportedInterfaceRef: "); //$NON-NLS-1$
        result.append(supportedInterfaceRef);
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //CallableElementImpl
