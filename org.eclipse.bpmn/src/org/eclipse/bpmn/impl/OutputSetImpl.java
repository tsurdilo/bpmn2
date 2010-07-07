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
import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.OutputSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.OutputSetImpl#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.OutputSetImpl#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.OutputSetImpl#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.OutputSetImpl#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.OutputSetImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputSetImpl extends BaseElementImpl implements OutputSet {
    /**
     * The cached value of the '{@link #getDataOutputRefs() <em>Data Output Refs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutputRefs()
     * @generated
     * @ordered
     */
    protected EList<String> dataOutputRefs;

    /**
     * The cached value of the '{@link #getOptionalOutputRefs() <em>Optional Output Refs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptionalOutputRefs()
     * @generated
     * @ordered
     */
    protected EList<String> optionalOutputRefs;

    /**
     * The cached value of the '{@link #getWhileExecutingOutputRefs() <em>While Executing Output Refs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhileExecutingOutputRefs()
     * @generated
     * @ordered
     */
    protected EList<String> whileExecutingOutputRefs;

    /**
     * The cached value of the '{@link #getInputSetRefs() <em>Input Set Refs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSetRefs()
     * @generated
     * @ordered
     */
    protected EList<String> inputSetRefs;

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
    protected OutputSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getOutputSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getDataOutputRefs() {
        if (dataOutputRefs == null) {
            dataOutputRefs = new EDataTypeEList<String>(String.class, this, BpmnPackage.OUTPUT_SET__DATA_OUTPUT_REFS);
        }
        return dataOutputRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getOptionalOutputRefs() {
        if (optionalOutputRefs == null) {
            optionalOutputRefs = new EDataTypeEList<String>(String.class, this, BpmnPackage.OUTPUT_SET__OPTIONAL_OUTPUT_REFS);
        }
        return optionalOutputRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getWhileExecutingOutputRefs() {
        if (whileExecutingOutputRefs == null) {
            whileExecutingOutputRefs = new EDataTypeEList<String>(String.class, this, BpmnPackage.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS);
        }
        return whileExecutingOutputRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getInputSetRefs() {
        if (inputSetRefs == null) {
            inputSetRefs = new EDataTypeEList<String>(String.class, this, BpmnPackage.OUTPUT_SET__INPUT_SET_REFS);
        }
        return inputSetRefs;
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
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.OUTPUT_SET__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
            return getDataOutputRefs();
        case BpmnPackage.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
            return getOptionalOutputRefs();
        case BpmnPackage.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
            return getWhileExecutingOutputRefs();
        case BpmnPackage.OUTPUT_SET__INPUT_SET_REFS:
            return getInputSetRefs();
        case BpmnPackage.OUTPUT_SET__NAME:
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
        case BpmnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
            getDataOutputRefs().clear();
            getDataOutputRefs().addAll((Collection<? extends String>) newValue);
            return;
        case BpmnPackage.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
            getOptionalOutputRefs().clear();
            getOptionalOutputRefs().addAll((Collection<? extends String>) newValue);
            return;
        case BpmnPackage.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
            getWhileExecutingOutputRefs().clear();
            getWhileExecutingOutputRefs().addAll((Collection<? extends String>) newValue);
            return;
        case BpmnPackage.OUTPUT_SET__INPUT_SET_REFS:
            getInputSetRefs().clear();
            getInputSetRefs().addAll((Collection<? extends String>) newValue);
            return;
        case BpmnPackage.OUTPUT_SET__NAME:
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
        case BpmnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
            getDataOutputRefs().clear();
            return;
        case BpmnPackage.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
            getOptionalOutputRefs().clear();
            return;
        case BpmnPackage.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
            getWhileExecutingOutputRefs().clear();
            return;
        case BpmnPackage.OUTPUT_SET__INPUT_SET_REFS:
            getInputSetRefs().clear();
            return;
        case BpmnPackage.OUTPUT_SET__NAME:
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
        case BpmnPackage.OUTPUT_SET__DATA_OUTPUT_REFS:
            return dataOutputRefs != null && !dataOutputRefs.isEmpty();
        case BpmnPackage.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
            return optionalOutputRefs != null && !optionalOutputRefs.isEmpty();
        case BpmnPackage.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
            return whileExecutingOutputRefs != null && !whileExecutingOutputRefs.isEmpty();
        case BpmnPackage.OUTPUT_SET__INPUT_SET_REFS:
            return inputSetRefs != null && !inputSetRefs.isEmpty();
        case BpmnPackage.OUTPUT_SET__NAME:
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
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (dataOutputRefs: "); //$NON-NLS-1$
        result.append(dataOutputRefs);
        result.append(", optionalOutputRefs: "); //$NON-NLS-1$
        result.append(optionalOutputRefs);
        result.append(", whileExecutingOutputRefs: "); //$NON-NLS-1$
        result.append(whileExecutingOutputRefs);
        result.append(", inputSetRefs: "); //$NON-NLS-1$
        result.append(inputSetRefs);
        result.append(", name: "); //$NON-NLS-1$
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //OutputSetImpl
