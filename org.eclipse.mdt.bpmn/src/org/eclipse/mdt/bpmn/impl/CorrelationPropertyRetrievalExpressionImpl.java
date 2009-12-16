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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression;
import org.eclipse.mdt.bpmn.FormalExpression;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CorrelationPropertyRetrievalExpressionImpl#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CorrelationPropertyRetrievalExpressionImpl#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationPropertyRetrievalExpressionImpl extends BaseElementImpl implements CorrelationPropertyRetrievalExpression {
    /**
     * The cached value of the '{@link #getMessagePath() <em>Message Path</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessagePath()
     * @generated
     * @ordered
     */
    protected FormalExpression messagePath;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CorrelationPropertyRetrievalExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getCorrelationPropertyRetrievalExpression();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormalExpression getMessagePath() {
        return messagePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessagePath(FormalExpression newMessagePath, NotificationChain msgs) {
        FormalExpression oldMessagePath = messagePath;
        messagePath = newMessagePath;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, oldMessagePath, newMessagePath);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessagePath(FormalExpression newMessagePath) {
        if (newMessagePath != messagePath) {
            NotificationChain msgs = null;
            if (messagePath != null)
                msgs = ((InternalEObject)messagePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, null, msgs);
            if (newMessagePath != null)
                msgs = ((InternalEObject)newMessagePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, null, msgs);
            msgs = basicSetMessagePath(newMessagePath, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, newMessagePath, newMessagePath));
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
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF, oldMessageRef, messageRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
                return basicSetMessagePath(null, msgs);
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
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
                return getMessagePath();
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
                return getMessageRef();
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
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
                setMessagePath((FormalExpression)newValue);
                return;
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
                setMessageRef((QName)newValue);
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
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
                setMessagePath((FormalExpression)null);
                return;
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
                setMessageRef(MESSAGE_REF_EDEFAULT);
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
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
                return messagePath != null;
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
                return MESSAGE_REF_EDEFAULT == null ? messageRef != null : !MESSAGE_REF_EDEFAULT.equals(messageRef);
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
        result.append(')');
        return result.toString();
    }

} //CorrelationPropertyRetrievalExpressionImpl
