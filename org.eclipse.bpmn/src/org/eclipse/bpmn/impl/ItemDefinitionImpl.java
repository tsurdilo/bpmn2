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

import javax.xml.namespace.QName;

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.ItemDefinition;
import org.eclipse.bpmn.ItemKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ItemDefinitionImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ItemDefinitionImpl#getItemKind <em>Item Kind</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ItemDefinitionImpl#getStructureRef <em>Structure Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemDefinitionImpl extends RootElementImpl implements ItemDefinition {
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
     * The default value of the '{@link #getItemKind() <em>Item Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemKind()
     * @generated
     * @ordered
     */
    protected static final ItemKind ITEM_KIND_EDEFAULT = ItemKind.INFORMATION;

    /**
     * The cached value of the '{@link #getItemKind() <em>Item Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemKind()
     * @generated
     * @ordered
     */
    protected ItemKind itemKind = ITEM_KIND_EDEFAULT;

    /**
     * This is true if the Item Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean itemKindESet;

    /**
     * The default value of the '{@link #getStructureRef() <em>Structure Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStructureRef()
     * @generated
     * @ordered
     */
    protected static final QName STRUCTURE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStructureRef() <em>Structure Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStructureRef()
     * @generated
     * @ordered
     */
    protected QName structureRef = STRUCTURE_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ItemDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getItemDefinition();
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ITEM_DEFINITION__IS_COLLECTION, oldIsCollection, isCollection,
                    !oldIsCollectionESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.ITEM_DEFINITION__IS_COLLECTION, oldIsCollection, IS_COLLECTION_EDEFAULT,
                    oldIsCollectionESet));
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
    public ItemKind getItemKind() {
        return itemKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setItemKind(ItemKind newItemKind) {
        ItemKind oldItemKind = itemKind;
        itemKind = newItemKind == null ? ITEM_KIND_EDEFAULT : newItemKind;
        boolean oldItemKindESet = itemKindESet;
        itemKindESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ITEM_DEFINITION__ITEM_KIND, oldItemKind, itemKind, !oldItemKindESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetItemKind() {
        ItemKind oldItemKind = itemKind;
        boolean oldItemKindESet = itemKindESet;
        itemKind = ITEM_KIND_EDEFAULT;
        itemKindESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.ITEM_DEFINITION__ITEM_KIND, oldItemKind, ITEM_KIND_EDEFAULT, oldItemKindESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetItemKind() {
        return itemKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getStructureRef() {
        return structureRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStructureRef(QName newStructureRef) {
        QName oldStructureRef = structureRef;
        structureRef = newStructureRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ITEM_DEFINITION__STRUCTURE_REF, oldStructureRef, structureRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.ITEM_DEFINITION__IS_COLLECTION:
            return isIsCollection();
        case BpmnPackage.ITEM_DEFINITION__ITEM_KIND:
            return getItemKind();
        case BpmnPackage.ITEM_DEFINITION__STRUCTURE_REF:
            return getStructureRef();
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
        case BpmnPackage.ITEM_DEFINITION__IS_COLLECTION:
            setIsCollection((Boolean) newValue);
            return;
        case BpmnPackage.ITEM_DEFINITION__ITEM_KIND:
            setItemKind((ItemKind) newValue);
            return;
        case BpmnPackage.ITEM_DEFINITION__STRUCTURE_REF:
            setStructureRef((QName) newValue);
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
        case BpmnPackage.ITEM_DEFINITION__IS_COLLECTION:
            unsetIsCollection();
            return;
        case BpmnPackage.ITEM_DEFINITION__ITEM_KIND:
            unsetItemKind();
            return;
        case BpmnPackage.ITEM_DEFINITION__STRUCTURE_REF:
            setStructureRef(STRUCTURE_REF_EDEFAULT);
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
        case BpmnPackage.ITEM_DEFINITION__IS_COLLECTION:
            return isSetIsCollection();
        case BpmnPackage.ITEM_DEFINITION__ITEM_KIND:
            return isSetItemKind();
        case BpmnPackage.ITEM_DEFINITION__STRUCTURE_REF:
            return STRUCTURE_REF_EDEFAULT == null ? structureRef != null : !STRUCTURE_REF_EDEFAULT.equals(structureRef);
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
        result.append(" (isCollection: "); //$NON-NLS-1$
        if (isCollectionESet)
            result.append(isCollection);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", itemKind: "); //$NON-NLS-1$
        if (itemKindESet)
            result.append(itemKind);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", structureRef: "); //$NON-NLS-1$
        result.append(structureRef);
        result.append(')');
        return result.toString();
    }

} //ItemDefinitionImpl
