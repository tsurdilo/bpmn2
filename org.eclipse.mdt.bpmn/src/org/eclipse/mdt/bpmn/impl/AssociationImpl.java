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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.Association;
import org.eclipse.mdt.bpmn.AssociationDirection;
import org.eclipse.mdt.bpmn.BpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.AssociationImpl#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.AssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.AssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ArtifactImpl implements Association {
    /**
     * The default value of the '{@link #getAssociationDirection() <em>Association Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociationDirection()
     * @generated
     * @ordered
     */
    protected static final AssociationDirection ASSOCIATION_DIRECTION_EDEFAULT = AssociationDirection.NONE;

    /**
     * The cached value of the '{@link #getAssociationDirection() <em>Association Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociationDirection()
     * @generated
     * @ordered
     */
    protected AssociationDirection associationDirection = ASSOCIATION_DIRECTION_EDEFAULT;

    /**
     * This is true if the Association Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean associationDirectionESet;

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
    protected AssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getAssociation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationDirection getAssociationDirection() {
        return associationDirection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssociationDirection(
            AssociationDirection newAssociationDirection) {
        AssociationDirection oldAssociationDirection = associationDirection;
        associationDirection = newAssociationDirection == null ? ASSOCIATION_DIRECTION_EDEFAULT
                : newAssociationDirection;
        boolean oldAssociationDirectionESet = associationDirectionESet;
        associationDirectionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.ASSOCIATION__ASSOCIATION_DIRECTION,
                    oldAssociationDirection, associationDirection,
                    !oldAssociationDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAssociationDirection() {
        AssociationDirection oldAssociationDirection = associationDirection;
        boolean oldAssociationDirectionESet = associationDirectionESet;
        associationDirection = ASSOCIATION_DIRECTION_EDEFAULT;
        associationDirectionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.ASSOCIATION__ASSOCIATION_DIRECTION,
                    oldAssociationDirection, ASSOCIATION_DIRECTION_EDEFAULT,
                    oldAssociationDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAssociationDirection() {
        return associationDirectionESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.ASSOCIATION__SOURCE_REF, oldSourceRef,
                    sourceRef));
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
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.ASSOCIATION__TARGET_REF, oldTargetRef,
                    targetRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.ASSOCIATION__ASSOCIATION_DIRECTION:
            return getAssociationDirection();
        case BpmnPackage.ASSOCIATION__SOURCE_REF:
            return getSourceRef();
        case BpmnPackage.ASSOCIATION__TARGET_REF:
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
        case BpmnPackage.ASSOCIATION__ASSOCIATION_DIRECTION:
            setAssociationDirection((AssociationDirection) newValue);
            return;
        case BpmnPackage.ASSOCIATION__SOURCE_REF:
            setSourceRef((QName) newValue);
            return;
        case BpmnPackage.ASSOCIATION__TARGET_REF:
            setTargetRef((QName) newValue);
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
        case BpmnPackage.ASSOCIATION__ASSOCIATION_DIRECTION:
            unsetAssociationDirection();
            return;
        case BpmnPackage.ASSOCIATION__SOURCE_REF:
            setSourceRef(SOURCE_REF_EDEFAULT);
            return;
        case BpmnPackage.ASSOCIATION__TARGET_REF:
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
        case BpmnPackage.ASSOCIATION__ASSOCIATION_DIRECTION:
            return isSetAssociationDirection();
        case BpmnPackage.ASSOCIATION__SOURCE_REF:
            return SOURCE_REF_EDEFAULT == null ? sourceRef != null
                    : !SOURCE_REF_EDEFAULT.equals(sourceRef);
        case BpmnPackage.ASSOCIATION__TARGET_REF:
            return TARGET_REF_EDEFAULT == null ? targetRef != null
                    : !TARGET_REF_EDEFAULT.equals(targetRef);
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
        result.append(" (associationDirection: "); //$NON-NLS-1$
        if (associationDirectionESet)
            result.append(associationDirection);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", sourceRef: "); //$NON-NLS-1$
        result.append(sourceRef);
        result.append(", targetRef: "); //$NON-NLS-1$
        result.append(targetRef);
        result.append(')');
        return result.toString();
    }

} //AssociationImpl
