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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.DataInput;
import org.eclipse.mdt.bpmn2.DataOutput;
import org.eclipse.mdt.bpmn2.InputOutputSpecification;
import org.eclipse.mdt.bpmn2.InputSet;
import org.eclipse.mdt.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.InputOutputSpecificationImpl#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.InputOutputSpecificationImpl#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.InputOutputSpecificationImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.InputOutputSpecificationImpl#getOutputSet <em>Output Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOutputSpecificationImpl extends BaseElementImpl implements
        InputOutputSpecification {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getDataInput() <em>Data Input</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInput()
     * @generated
     * @ordered
     */
    protected EList<DataInput> dataInput;

    /**
     * The cached value of the '{@link #getDataOutput() <em>Data Output</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutput()
     * @generated
     * @ordered
     */
    protected EList<DataOutput> dataOutput;

    /**
     * The cached value of the '{@link #getInputSet() <em>Input Set</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSet()
     * @generated
     * @ordered
     */
    protected EList<InputSet> inputSet;

    /**
     * The cached value of the '{@link #getOutputSet() <em>Output Set</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputSet()
     * @generated
     * @ordered
     */
    protected EList<OutputSet> outputSet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputOutputSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getInputOutputSpecification();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataInput> getDataInput() {
        if (dataInput == null) {
            dataInput = new EObjectContainmentEList<DataInput>(DataInput.class,
                    this, Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUT);
        }
        return dataInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataOutput> getDataOutput() {
        if (dataOutput == null) {
            dataOutput = new EObjectContainmentEList<DataOutput>(
                    DataOutput.class, this,
                    Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT);
        }
        return dataOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InputSet> getInputSet() {
        if (inputSet == null) {
            inputSet = new EObjectContainmentEList<InputSet>(InputSet.class,
                    this, Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SET);
        }
        return inputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OutputSet> getOutputSet() {
        if (outputSet == null) {
            outputSet = new EObjectContainmentEList<OutputSet>(OutputSet.class,
                    this, Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SET);
        }
        return outputSet;
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
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
            return ((InternalEList<?>) getDataInput()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
            return ((InternalEList<?>) getDataOutput()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SET:
            return ((InternalEList<?>) getInputSet()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
            return ((InternalEList<?>) getOutputSet()).basicRemove(otherEnd,
                    msgs);
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
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
            return getDataInput();
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
            return getDataOutput();
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SET:
            return getInputSet();
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
            return getOutputSet();
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
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
            getDataInput().clear();
            getDataInput().addAll((Collection<? extends DataInput>) newValue);
            return;
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
            getDataOutput().clear();
            getDataOutput().addAll((Collection<? extends DataOutput>) newValue);
            return;
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SET:
            getInputSet().clear();
            getInputSet().addAll((Collection<? extends InputSet>) newValue);
            return;
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
            getOutputSet().clear();
            getOutputSet().addAll((Collection<? extends OutputSet>) newValue);
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
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
            getDataInput().clear();
            return;
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
            getDataOutput().clear();
            return;
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SET:
            getInputSet().clear();
            return;
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
            getOutputSet().clear();
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
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUT:
            return dataInput != null && !dataInput.isEmpty();
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT:
            return dataOutput != null && !dataOutput.isEmpty();
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SET:
            return inputSet != null && !inputSet.isEmpty();
        case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SET:
            return outputSet != null && !outputSet.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InputOutputSpecificationImpl
