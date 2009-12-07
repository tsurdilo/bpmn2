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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.ReceiveTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ReceiveTaskImpl#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ReceiveTaskImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ReceiveTaskImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ReceiveTaskImpl#getServiceReferenceRef <em>Service Reference Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveTaskImpl extends TaskImpl implements ReceiveTask {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The default value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInstantiate()
     * @generated
     * @ordered
     */
    protected static final boolean INSTANTIATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInstantiate()
     * @generated
     * @ordered
     */
    protected boolean instantiate = INSTANTIATE_EDEFAULT;

    /**
     * This is true if the Instantiate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean instantiateESet;

    /**
     * The default value of the '{@link #getMessageRef() <em>Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageRef()
     * @generated
     * @ordered
     */
    protected static final QName MESSAGE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMessageRef() <em>Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageRef()
     * @generated
     * @ordered
     */
    protected QName messageRef = MESSAGE_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getOperationRef() <em>Operation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationRef()
     * @generated
     * @ordered
     */
    protected static final QName OPERATION_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationRef()
     * @generated
     * @ordered
     */
    protected QName operationRef = OPERATION_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getServiceReferenceRef() <em>Service Reference Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceReferenceRef()
     * @generated
     * @ordered
     */
    protected static final QName SERVICE_REFERENCE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceReferenceRef() <em>Service Reference Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceReferenceRef()
     * @generated
     * @ordered
     */
    protected QName serviceReferenceRef = SERVICE_REFERENCE_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReceiveTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getReceiveTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInstantiate() {
        return instantiate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiate(boolean newInstantiate) {
        boolean oldInstantiate = instantiate;
        instantiate = newInstantiate;
        boolean oldInstantiateESet = instantiateESet;
        instantiateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.RECEIVE_TASK__INSTANTIATE, oldInstantiate,
                    instantiate, !oldInstantiateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInstantiate() {
        boolean oldInstantiate = instantiate;
        boolean oldInstantiateESet = instantiateESet;
        instantiate = INSTANTIATE_EDEFAULT;
        instantiateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    Bpmn2Package.RECEIVE_TASK__INSTANTIATE, oldInstantiate,
                    INSTANTIATE_EDEFAULT, oldInstantiateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInstantiate() {
        return instantiateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getMessageRef() {
        return messageRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageRef(QName newMessageRef) {
        QName oldMessageRef = messageRef;
        messageRef = newMessageRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.RECEIVE_TASK__MESSAGE_REF, oldMessageRef,
                    messageRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getOperationRef() {
        return operationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperationRef(QName newOperationRef) {
        QName oldOperationRef = operationRef;
        operationRef = newOperationRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.RECEIVE_TASK__OPERATION_REF, oldOperationRef,
                    operationRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getServiceReferenceRef() {
        return serviceReferenceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServiceReferenceRef(QName newServiceReferenceRef) {
        QName oldServiceReferenceRef = serviceReferenceRef;
        serviceReferenceRef = newServiceReferenceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.RECEIVE_TASK__SERVICE_REFERENCE_REF,
                    oldServiceReferenceRef, serviceReferenceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.RECEIVE_TASK__INSTANTIATE:
            return isInstantiate();
        case Bpmn2Package.RECEIVE_TASK__MESSAGE_REF:
            return getMessageRef();
        case Bpmn2Package.RECEIVE_TASK__OPERATION_REF:
            return getOperationRef();
        case Bpmn2Package.RECEIVE_TASK__SERVICE_REFERENCE_REF:
            return getServiceReferenceRef();
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
        case Bpmn2Package.RECEIVE_TASK__INSTANTIATE:
            setInstantiate((Boolean) newValue);
            return;
        case Bpmn2Package.RECEIVE_TASK__MESSAGE_REF:
            setMessageRef((QName) newValue);
            return;
        case Bpmn2Package.RECEIVE_TASK__OPERATION_REF:
            setOperationRef((QName) newValue);
            return;
        case Bpmn2Package.RECEIVE_TASK__SERVICE_REFERENCE_REF:
            setServiceReferenceRef((QName) newValue);
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
        case Bpmn2Package.RECEIVE_TASK__INSTANTIATE:
            unsetInstantiate();
            return;
        case Bpmn2Package.RECEIVE_TASK__MESSAGE_REF:
            setMessageRef(MESSAGE_REF_EDEFAULT);
            return;
        case Bpmn2Package.RECEIVE_TASK__OPERATION_REF:
            setOperationRef(OPERATION_REF_EDEFAULT);
            return;
        case Bpmn2Package.RECEIVE_TASK__SERVICE_REFERENCE_REF:
            setServiceReferenceRef(SERVICE_REFERENCE_REF_EDEFAULT);
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
        case Bpmn2Package.RECEIVE_TASK__INSTANTIATE:
            return isSetInstantiate();
        case Bpmn2Package.RECEIVE_TASK__MESSAGE_REF:
            return MESSAGE_REF_EDEFAULT == null ? messageRef != null
                    : !MESSAGE_REF_EDEFAULT.equals(messageRef);
        case Bpmn2Package.RECEIVE_TASK__OPERATION_REF:
            return OPERATION_REF_EDEFAULT == null ? operationRef != null
                    : !OPERATION_REF_EDEFAULT.equals(operationRef);
        case Bpmn2Package.RECEIVE_TASK__SERVICE_REFERENCE_REF:
            return SERVICE_REFERENCE_REF_EDEFAULT == null ? serviceReferenceRef != null
                    : !SERVICE_REFERENCE_REF_EDEFAULT
                            .equals(serviceReferenceRef);
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
        result.append(" (instantiate: ");
        if (instantiateESet)
            result.append(instantiate);
        else
            result.append("<unset>");
        result.append(", messageRef: ");
        result.append(messageRef);
        result.append(", operationRef: ");
        result.append(operationRef);
        result.append(", serviceReferenceRef: ");
        result.append(serviceReferenceRef);
        result.append(')');
        return result.toString();
    }

} //ReceiveTaskImpl
