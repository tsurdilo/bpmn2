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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.MessageFlow;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.MessageFlowImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.MessageFlowImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.MessageFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.MessageFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageFlowImpl extends BaseElementImpl implements MessageFlow {
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
     * The default value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected static final QName SOURCE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected QName sourceRef = SOURCE_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRef()
     * @generated
     * @ordered
     */
    protected static final QName TARGET_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetRef()
     * @generated
     * @ordered
     */
    protected QName targetRef = TARGET_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageFlowImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getMessageFlow();
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
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.MESSAGE_FLOW__MESSAGE_REF, oldMessageRef, messageRef));
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
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.MESSAGE_FLOW__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getSourceRef() {
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceRef(QName newSourceRef) {
        QName oldSourceRef = sourceRef;
        sourceRef = newSourceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.MESSAGE_FLOW__SOURCE_REF, oldSourceRef, sourceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getTargetRef() {
        return targetRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetRef(QName newTargetRef) {
        QName oldTargetRef = targetRef;
        targetRef = newTargetRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.MESSAGE_FLOW__TARGET_REF, oldTargetRef, targetRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case bpmnPackage.MESSAGE_FLOW__MESSAGE_REF:
                return getMessageRef();
            case bpmnPackage.MESSAGE_FLOW__NAME:
                return getName();
            case bpmnPackage.MESSAGE_FLOW__SOURCE_REF:
                return getSourceRef();
            case bpmnPackage.MESSAGE_FLOW__TARGET_REF:
                return getTargetRef();
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
            case bpmnPackage.MESSAGE_FLOW__MESSAGE_REF:
                setMessageRef((QName)newValue);
                return;
            case bpmnPackage.MESSAGE_FLOW__NAME:
                setName((String)newValue);
                return;
            case bpmnPackage.MESSAGE_FLOW__SOURCE_REF:
                setSourceRef((QName)newValue);
                return;
            case bpmnPackage.MESSAGE_FLOW__TARGET_REF:
                setTargetRef((QName)newValue);
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
            case bpmnPackage.MESSAGE_FLOW__MESSAGE_REF:
                setMessageRef(MESSAGE_REF_EDEFAULT);
                return;
            case bpmnPackage.MESSAGE_FLOW__NAME:
                setName(NAME_EDEFAULT);
                return;
            case bpmnPackage.MESSAGE_FLOW__SOURCE_REF:
                setSourceRef(SOURCE_REF_EDEFAULT);
                return;
            case bpmnPackage.MESSAGE_FLOW__TARGET_REF:
                setTargetRef(TARGET_REF_EDEFAULT);
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
            case bpmnPackage.MESSAGE_FLOW__MESSAGE_REF:
                return MESSAGE_REF_EDEFAULT == null ? messageRef != null : !MESSAGE_REF_EDEFAULT.equals(messageRef);
            case bpmnPackage.MESSAGE_FLOW__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case bpmnPackage.MESSAGE_FLOW__SOURCE_REF:
                return SOURCE_REF_EDEFAULT == null ? sourceRef != null : !SOURCE_REF_EDEFAULT.equals(sourceRef);
            case bpmnPackage.MESSAGE_FLOW__TARGET_REF:
                return TARGET_REF_EDEFAULT == null ? targetRef != null : !TARGET_REF_EDEFAULT.equals(targetRef);
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
        result.append(" (messageRef: "); //$NON-NLS-1$
        result.append(messageRef);
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(", sourceRef: "); //$NON-NLS-1$
        result.append(sourceRef);
        result.append(", targetRef: "); //$NON-NLS-1$
        result.append(targetRef);
        result.append(')');
        return result.toString();
    }

} //MessageFlowImpl
