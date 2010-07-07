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

import java.util.List;
import javax.xml.namespace.QName;

import org.eclipse.bpmn.Artifact;
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.ConversationNode;
import org.eclipse.bpmn.SubConversation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Conversation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.SubConversationImpl#getConversationNodeGroup <em>Conversation Node Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.SubConversationImpl#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.SubConversationImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.SubConversationImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.SubConversationImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubConversationImpl extends ConversationNodeImpl implements SubConversation {
    /**
     * The cached value of the '{@link #getConversationNodeGroup() <em>Conversation Node Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationNodeGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap conversationNodeGroup;

    /**
     * The cached value of the '{@link #getArtifactGroup() <em>Artifact Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifactGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap artifactGroup;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubConversationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getSubConversation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getConversationNodeGroup() {
        if (conversationNodeGroup == null) {
            conversationNodeGroup = new BasicFeatureMap(this, BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE_GROUP);
        }
        return conversationNodeGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<ConversationNode> getConversationNode() {
        return getConversationNodeGroup().list(BpmnPackage.eINSTANCE.getSubConversation_ConversationNode());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getArtifactGroup() {
        if (artifactGroup == null) {
            artifactGroup = new BasicFeatureMap(this, BpmnPackage.SUB_CONVERSATION__ARTIFACT_GROUP);
        }
        return artifactGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Artifact> getArtifact() {
        return getArtifactGroup().list(BpmnPackage.eINSTANCE.getSubConversation_Artifact());
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.SUB_CONVERSATION__CORRELATION_KEY_REF, oldCorrelationKeyRef, correlationKeyRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE_GROUP:
            return ((InternalEList<?>) getConversationNodeGroup()).basicRemove(otherEnd, msgs);
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE:
            return ((InternalEList<?>) getConversationNode()).basicRemove(otherEnd, msgs);
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT_GROUP:
            return ((InternalEList<?>) getArtifactGroup()).basicRemove(otherEnd, msgs);
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT:
            return ((InternalEList<?>) getArtifact()).basicRemove(otherEnd, msgs);
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
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE_GROUP:
            if (coreType)
                return getConversationNodeGroup();
            return ((FeatureMap.Internal) getConversationNodeGroup()).getWrapper();
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE:
            return getConversationNode();
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT_GROUP:
            if (coreType)
                return getArtifactGroup();
            return ((FeatureMap.Internal) getArtifactGroup()).getWrapper();
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT:
            return getArtifact();
        case BpmnPackage.SUB_CONVERSATION__CORRELATION_KEY_REF:
            return getCorrelationKeyRef();
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
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE_GROUP:
            ((FeatureMap.Internal) getConversationNodeGroup()).set(newValue);
            return;
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE:
            getConversationNode().clear();
            getConversationNode().addAll((Collection<? extends ConversationNode>) newValue);
            return;
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT_GROUP:
            ((FeatureMap.Internal) getArtifactGroup()).set(newValue);
            return;
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT:
            getArtifact().clear();
            getArtifact().addAll((Collection<? extends Artifact>) newValue);
            return;
        case BpmnPackage.SUB_CONVERSATION__CORRELATION_KEY_REF:
            setCorrelationKeyRef((QName) newValue);
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
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE_GROUP:
            getConversationNodeGroup().clear();
            return;
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE:
            getConversationNode().clear();
            return;
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT_GROUP:
            getArtifactGroup().clear();
            return;
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT:
            getArtifact().clear();
            return;
        case BpmnPackage.SUB_CONVERSATION__CORRELATION_KEY_REF:
            setCorrelationKeyRef(CORRELATION_KEY_REF_EDEFAULT);
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
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE_GROUP:
            return conversationNodeGroup != null && !conversationNodeGroup.isEmpty();
        case BpmnPackage.SUB_CONVERSATION__CONVERSATION_NODE:
            return !getConversationNode().isEmpty();
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT_GROUP:
            return artifactGroup != null && !artifactGroup.isEmpty();
        case BpmnPackage.SUB_CONVERSATION__ARTIFACT:
            return !getArtifact().isEmpty();
        case BpmnPackage.SUB_CONVERSATION__CORRELATION_KEY_REF:
            return CORRELATION_KEY_REF_EDEFAULT == null ? correlationKeyRef != null : !CORRELATION_KEY_REF_EDEFAULT.equals(correlationKeyRef);
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
        result.append(" (conversationNodeGroup: "); //$NON-NLS-1$
        result.append(conversationNodeGroup);
        result.append(", artifactGroup: "); //$NON-NLS-1$
        result.append(artifactGroup);
        result.append(", correlationKeyRef: "); //$NON-NLS-1$
        result.append(correlationKeyRef);
        result.append(')');
        return result.toString();
    }

} //SubConversationImpl
