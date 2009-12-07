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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.ConversationLink;
import org.eclipse.mdt.bpmn2.ConversationView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ConversationViewImpl#getConversationRef <em>Conversation Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ConversationViewImpl#getConversationLink <em>Conversation Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationViewImpl extends CollaborationImpl implements
        ConversationView {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getConversationRef() <em>Conversation Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationRef()
     * @generated
     * @ordered
     */
    protected EList<QName> conversationRef;

    /**
     * The cached value of the '{@link #getConversationLink() <em>Conversation Link</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConversationLink()
     * @generated
     * @ordered
     */
    protected EList<ConversationLink> conversationLink;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConversationViewImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getConversationView();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getConversationRef() {
        if (conversationRef == null) {
            conversationRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_REF);
        }
        return conversationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConversationLink> getConversationLink() {
        if (conversationLink == null) {
            conversationLink = new EObjectContainmentEList<ConversationLink>(
                    ConversationLink.class, this,
                    Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_LINK);
        }
        return conversationLink;
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
        case Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_LINK:
            return ((InternalEList<?>) getConversationLink()).basicRemove(
                    otherEnd, msgs);
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
        case Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_REF:
            return getConversationRef();
        case Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_LINK:
            return getConversationLink();
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
        case Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_REF:
            getConversationRef().clear();
            getConversationRef().addAll((Collection<? extends QName>) newValue);
            return;
        case Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_LINK:
            getConversationLink().clear();
            getConversationLink().addAll(
                    (Collection<? extends ConversationLink>) newValue);
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
        case Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_REF:
            getConversationRef().clear();
            return;
        case Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_LINK:
            getConversationLink().clear();
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
        case Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_REF:
            return conversationRef != null && !conversationRef.isEmpty();
        case Bpmn2Package.CONVERSATION_VIEW__CONVERSATION_LINK:
            return conversationLink != null && !conversationLink.isEmpty();
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
        result.append(" (conversationRef: ");
        result.append(conversationRef);
        result.append(')');
        return result.toString();
    }

} //ConversationViewImpl
