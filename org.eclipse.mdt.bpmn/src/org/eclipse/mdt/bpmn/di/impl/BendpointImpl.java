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
package org.eclipse.mdt.bpmn.di.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.mdt.bpmn.di.Bendpoint;
import org.eclipse.mdt.bpmn.di.DIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bendpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.di.impl.BendpointImpl#getSourceX <em>Source X</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.impl.BendpointImpl#getSourceY <em>Source Y</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.impl.BendpointImpl#getTargetX <em>Target X</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.impl.BendpointImpl#getTargetY <em>Target Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BendpointImpl extends EObjectImpl implements Bendpoint {
    /**
     * The default value of the '{@link #getSourceX() <em>Source X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceX()
     * @generated
     * @ordered
     */
    protected static final int SOURCE_X_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSourceX() <em>Source X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceX()
     * @generated
     * @ordered
     */
    protected int sourceX = SOURCE_X_EDEFAULT;

    /**
     * This is true if the Source X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sourceXESet;

    /**
     * The default value of the '{@link #getSourceY() <em>Source Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceY()
     * @generated
     * @ordered
     */
    protected static final int SOURCE_Y_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSourceY() <em>Source Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceY()
     * @generated
     * @ordered
     */
    protected int sourceY = SOURCE_Y_EDEFAULT;

    /**
     * This is true if the Source Y attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sourceYESet;

    /**
     * The default value of the '{@link #getTargetX() <em>Target X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetX()
     * @generated
     * @ordered
     */
    protected static final int TARGET_X_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTargetX() <em>Target X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetX()
     * @generated
     * @ordered
     */
    protected int targetX = TARGET_X_EDEFAULT;

    /**
     * This is true if the Target X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetXESet;

    /**
     * The default value of the '{@link #getTargetY() <em>Target Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetY()
     * @generated
     * @ordered
     */
    protected static final int TARGET_Y_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTargetY() <em>Target Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetY()
     * @generated
     * @ordered
     */
    protected int targetY = TARGET_Y_EDEFAULT;

    /**
     * This is true if the Target Y attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetYESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BendpointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DIPackage.Literals.BENDPOINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSourceX() {
        return sourceX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceX(int newSourceX) {
        int oldSourceX = sourceX;
        sourceX = newSourceX;
        boolean oldSourceXESet = sourceXESet;
        sourceXESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DIPackage.BENDPOINT__SOURCE_X, oldSourceX, sourceX,
                    !oldSourceXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSourceX() {
        int oldSourceX = sourceX;
        boolean oldSourceXESet = sourceXESet;
        sourceX = SOURCE_X_EDEFAULT;
        sourceXESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    DIPackage.BENDPOINT__SOURCE_X, oldSourceX,
                    SOURCE_X_EDEFAULT, oldSourceXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSourceX() {
        return sourceXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSourceY() {
        return sourceY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceY(int newSourceY) {
        int oldSourceY = sourceY;
        sourceY = newSourceY;
        boolean oldSourceYESet = sourceYESet;
        sourceYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DIPackage.BENDPOINT__SOURCE_Y, oldSourceY, sourceY,
                    !oldSourceYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSourceY() {
        int oldSourceY = sourceY;
        boolean oldSourceYESet = sourceYESet;
        sourceY = SOURCE_Y_EDEFAULT;
        sourceYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    DIPackage.BENDPOINT__SOURCE_Y, oldSourceY,
                    SOURCE_Y_EDEFAULT, oldSourceYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSourceY() {
        return sourceYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTargetX() {
        return targetX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetX(int newTargetX) {
        int oldTargetX = targetX;
        targetX = newTargetX;
        boolean oldTargetXESet = targetXESet;
        targetXESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DIPackage.BENDPOINT__TARGET_X, oldTargetX, targetX,
                    !oldTargetXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTargetX() {
        int oldTargetX = targetX;
        boolean oldTargetXESet = targetXESet;
        targetX = TARGET_X_EDEFAULT;
        targetXESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    DIPackage.BENDPOINT__TARGET_X, oldTargetX,
                    TARGET_X_EDEFAULT, oldTargetXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTargetX() {
        return targetXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTargetY() {
        return targetY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetY(int newTargetY) {
        int oldTargetY = targetY;
        targetY = newTargetY;
        boolean oldTargetYESet = targetYESet;
        targetYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DIPackage.BENDPOINT__TARGET_Y, oldTargetY, targetY,
                    !oldTargetYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTargetY() {
        int oldTargetY = targetY;
        boolean oldTargetYESet = targetYESet;
        targetY = TARGET_Y_EDEFAULT;
        targetYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    DIPackage.BENDPOINT__TARGET_Y, oldTargetY,
                    TARGET_Y_EDEFAULT, oldTargetYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTargetY() {
        return targetYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DIPackage.BENDPOINT__SOURCE_X:
            return getSourceX();
        case DIPackage.BENDPOINT__SOURCE_Y:
            return getSourceY();
        case DIPackage.BENDPOINT__TARGET_X:
            return getTargetX();
        case DIPackage.BENDPOINT__TARGET_Y:
            return getTargetY();
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
        case DIPackage.BENDPOINT__SOURCE_X:
            setSourceX((Integer) newValue);
            return;
        case DIPackage.BENDPOINT__SOURCE_Y:
            setSourceY((Integer) newValue);
            return;
        case DIPackage.BENDPOINT__TARGET_X:
            setTargetX((Integer) newValue);
            return;
        case DIPackage.BENDPOINT__TARGET_Y:
            setTargetY((Integer) newValue);
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
        case DIPackage.BENDPOINT__SOURCE_X:
            unsetSourceX();
            return;
        case DIPackage.BENDPOINT__SOURCE_Y:
            unsetSourceY();
            return;
        case DIPackage.BENDPOINT__TARGET_X:
            unsetTargetX();
            return;
        case DIPackage.BENDPOINT__TARGET_Y:
            unsetTargetY();
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
        case DIPackage.BENDPOINT__SOURCE_X:
            return isSetSourceX();
        case DIPackage.BENDPOINT__SOURCE_Y:
            return isSetSourceY();
        case DIPackage.BENDPOINT__TARGET_X:
            return isSetTargetX();
        case DIPackage.BENDPOINT__TARGET_Y:
            return isSetTargetY();
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
        result.append(" (sourceX: "); //$NON-NLS-1$
        if (sourceXESet)
            result.append(sourceX);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", sourceY: "); //$NON-NLS-1$
        if (sourceYESet)
            result.append(sourceY);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", targetX: "); //$NON-NLS-1$
        if (targetXESet)
            result.append(targetX);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", targetY: "); //$NON-NLS-1$
        if (targetYESet)
            result.append(targetY);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //BendpointImpl
