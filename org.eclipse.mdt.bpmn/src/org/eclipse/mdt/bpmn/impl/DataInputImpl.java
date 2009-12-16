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

import org.eclipse.mdt.bpmn.DataInput;
import org.eclipse.mdt.bpmn.DataState;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataInputImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataInputImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataInputImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.DataInputImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataInputImpl extends BaseElementImpl implements DataInput {
    /**
     * The cached value of the '{@link #getDataState() <em>Data State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataState()
     * @generated
     * @ordered
     */
    protected DataState dataState;

    /**
     * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsCollection()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COLLECTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsCollection()
     * @generated
     * @ordered
     */
    protected boolean isCollection = IS_COLLECTION_EDEFAULT;

    /**
     * This is true if the Is Collection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isCollectionESet;

    /**
     * The default value of the '{@link #getItemSubjectRef() <em>Item Subject Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemSubjectRef()
     * @generated
     * @ordered
     */
    protected static final QName ITEM_SUBJECT_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getItemSubjectRef() <em>Item Subject Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemSubjectRef()
     * @generated
     * @ordered
     */
    protected QName itemSubjectRef = ITEM_SUBJECT_REF_EDEFAULT;

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
    protected DataInputImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return bpmnPackage.eINSTANCE.getDataInput();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataState getDataState() {
        return dataState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataState(DataState newDataState, NotificationChain msgs) {
        DataState oldDataState = dataState;
        dataState = newDataState;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, bpmnPackage.DATA_INPUT__DATA_STATE, oldDataState, newDataState);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataState(DataState newDataState) {
        if (newDataState != dataState) {
            NotificationChain msgs = null;
            if (dataState != null)
                msgs = ((InternalEObject)dataState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - bpmnPackage.DATA_INPUT__DATA_STATE, null, msgs);
            if (newDataState != null)
                msgs = ((InternalEObject)newDataState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - bpmnPackage.DATA_INPUT__DATA_STATE, null, msgs);
            msgs = basicSetDataState(newDataState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.DATA_INPUT__DATA_STATE, newDataState, newDataState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsCollection() {
        return isCollection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsCollection(boolean newIsCollection) {
        boolean oldIsCollection = isCollection;
        isCollection = newIsCollection;
        boolean oldIsCollectionESet = isCollectionESet;
        isCollectionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.DATA_INPUT__IS_COLLECTION, oldIsCollection, isCollection, !oldIsCollectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsCollection() {
        boolean oldIsCollection = isCollection;
        boolean oldIsCollectionESet = isCollectionESet;
        isCollection = IS_COLLECTION_EDEFAULT;
        isCollectionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, bpmnPackage.DATA_INPUT__IS_COLLECTION, oldIsCollection, IS_COLLECTION_EDEFAULT, oldIsCollectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsCollection() {
        return isCollectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getItemSubjectRef() {
        return itemSubjectRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setItemSubjectRef(QName newItemSubjectRef) {
        QName oldItemSubjectRef = itemSubjectRef;
        itemSubjectRef = newItemSubjectRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.DATA_INPUT__ITEM_SUBJECT_REF, oldItemSubjectRef, itemSubjectRef));
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
            eNotify(new ENotificationImpl(this, Notification.SET, bpmnPackage.DATA_INPUT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case bpmnPackage.DATA_INPUT__DATA_STATE:
                return basicSetDataState(null, msgs);
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
            case bpmnPackage.DATA_INPUT__DATA_STATE:
                return getDataState();
            case bpmnPackage.DATA_INPUT__IS_COLLECTION:
                return isIsCollection();
            case bpmnPackage.DATA_INPUT__ITEM_SUBJECT_REF:
                return getItemSubjectRef();
            case bpmnPackage.DATA_INPUT__NAME:
                return getName();
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
            case bpmnPackage.DATA_INPUT__DATA_STATE:
                setDataState((DataState)newValue);
                return;
            case bpmnPackage.DATA_INPUT__IS_COLLECTION:
                setIsCollection((Boolean)newValue);
                return;
            case bpmnPackage.DATA_INPUT__ITEM_SUBJECT_REF:
                setItemSubjectRef((QName)newValue);
                return;
            case bpmnPackage.DATA_INPUT__NAME:
                setName((String)newValue);
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
            case bpmnPackage.DATA_INPUT__DATA_STATE:
                setDataState((DataState)null);
                return;
            case bpmnPackage.DATA_INPUT__IS_COLLECTION:
                unsetIsCollection();
                return;
            case bpmnPackage.DATA_INPUT__ITEM_SUBJECT_REF:
                setItemSubjectRef(ITEM_SUBJECT_REF_EDEFAULT);
                return;
            case bpmnPackage.DATA_INPUT__NAME:
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
            case bpmnPackage.DATA_INPUT__DATA_STATE:
                return dataState != null;
            case bpmnPackage.DATA_INPUT__IS_COLLECTION:
                return isSetIsCollection();
            case bpmnPackage.DATA_INPUT__ITEM_SUBJECT_REF:
                return ITEM_SUBJECT_REF_EDEFAULT == null ? itemSubjectRef != null : !ITEM_SUBJECT_REF_EDEFAULT.equals(itemSubjectRef);
            case bpmnPackage.DATA_INPUT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (isCollection: "); //$NON-NLS-1$
        if (isCollectionESet) result.append(isCollection); else result.append("<unset>"); //$NON-NLS-1$
        result.append(", itemSubjectRef: "); //$NON-NLS-1$
        result.append(itemSubjectRef);
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //DataInputImpl
