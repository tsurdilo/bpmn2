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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.DataInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DataInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DataInputImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DataInputImpl#getStructureDefinitionRef <em>Structure Definition Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DataInputImpl#isWhileExecuting <em>While Executing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataInputImpl extends BaseElementImpl implements DataInput {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

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
     * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOptional()
     * @generated
     * @ordered
     */
    protected static final boolean OPTIONAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOptional()
     * @generated
     * @ordered
     */
    protected boolean optional = OPTIONAL_EDEFAULT;

    /**
     * This is true if the Optional attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean optionalESet;

    /**
     * The default value of the '{@link #getStructureDefinitionRef() <em>Structure Definition Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStructureDefinitionRef()
     * @generated
     * @ordered
     */
    protected static final QName STRUCTURE_DEFINITION_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStructureDefinitionRef() <em>Structure Definition Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStructureDefinitionRef()
     * @generated
     * @ordered
     */
    protected QName structureDefinitionRef = STRUCTURE_DEFINITION_REF_EDEFAULT;

    /**
     * The default value of the '{@link #isWhileExecuting() <em>While Executing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isWhileExecuting()
     * @generated
     * @ordered
     */
    protected static final boolean WHILE_EXECUTING_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isWhileExecuting() <em>While Executing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isWhileExecuting()
     * @generated
     * @ordered
     */
    protected boolean whileExecuting = WHILE_EXECUTING_EDEFAULT;

    /**
     * This is true if the While Executing attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean whileExecutingESet;

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
        return Bpmn2Package.eINSTANCE.getDataInput();
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
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.DATA_INPUT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOptional() {
        return optional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOptional(boolean newOptional) {
        boolean oldOptional = optional;
        optional = newOptional;
        boolean oldOptionalESet = optionalESet;
        optionalESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.DATA_INPUT__OPTIONAL, oldOptional, optional,
                    !oldOptionalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOptional() {
        boolean oldOptional = optional;
        boolean oldOptionalESet = optionalESet;
        optional = OPTIONAL_EDEFAULT;
        optionalESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    Bpmn2Package.DATA_INPUT__OPTIONAL, oldOptional,
                    OPTIONAL_EDEFAULT, oldOptionalESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOptional() {
        return optionalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getStructureDefinitionRef() {
        return structureDefinitionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStructureDefinitionRef(QName newStructureDefinitionRef) {
        QName oldStructureDefinitionRef = structureDefinitionRef;
        structureDefinitionRef = newStructureDefinitionRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.DATA_INPUT__STRUCTURE_DEFINITION_REF,
                    oldStructureDefinitionRef, structureDefinitionRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isWhileExecuting() {
        return whileExecuting;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWhileExecuting(boolean newWhileExecuting) {
        boolean oldWhileExecuting = whileExecuting;
        whileExecuting = newWhileExecuting;
        boolean oldWhileExecutingESet = whileExecutingESet;
        whileExecutingESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.DATA_INPUT__WHILE_EXECUTING,
                    oldWhileExecuting, whileExecuting, !oldWhileExecutingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetWhileExecuting() {
        boolean oldWhileExecuting = whileExecuting;
        boolean oldWhileExecutingESet = whileExecutingESet;
        whileExecuting = WHILE_EXECUTING_EDEFAULT;
        whileExecutingESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    Bpmn2Package.DATA_INPUT__WHILE_EXECUTING,
                    oldWhileExecuting, WHILE_EXECUTING_EDEFAULT,
                    oldWhileExecutingESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetWhileExecuting() {
        return whileExecutingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.DATA_INPUT__NAME:
            return getName();
        case Bpmn2Package.DATA_INPUT__OPTIONAL:
            return isOptional();
        case Bpmn2Package.DATA_INPUT__STRUCTURE_DEFINITION_REF:
            return getStructureDefinitionRef();
        case Bpmn2Package.DATA_INPUT__WHILE_EXECUTING:
            return isWhileExecuting();
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
        case Bpmn2Package.DATA_INPUT__NAME:
            setName((String) newValue);
            return;
        case Bpmn2Package.DATA_INPUT__OPTIONAL:
            setOptional((Boolean) newValue);
            return;
        case Bpmn2Package.DATA_INPUT__STRUCTURE_DEFINITION_REF:
            setStructureDefinitionRef((QName) newValue);
            return;
        case Bpmn2Package.DATA_INPUT__WHILE_EXECUTING:
            setWhileExecuting((Boolean) newValue);
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
        case Bpmn2Package.DATA_INPUT__NAME:
            setName(NAME_EDEFAULT);
            return;
        case Bpmn2Package.DATA_INPUT__OPTIONAL:
            unsetOptional();
            return;
        case Bpmn2Package.DATA_INPUT__STRUCTURE_DEFINITION_REF:
            setStructureDefinitionRef(STRUCTURE_DEFINITION_REF_EDEFAULT);
            return;
        case Bpmn2Package.DATA_INPUT__WHILE_EXECUTING:
            unsetWhileExecuting();
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
        case Bpmn2Package.DATA_INPUT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
        case Bpmn2Package.DATA_INPUT__OPTIONAL:
            return isSetOptional();
        case Bpmn2Package.DATA_INPUT__STRUCTURE_DEFINITION_REF:
            return STRUCTURE_DEFINITION_REF_EDEFAULT == null ? structureDefinitionRef != null
                    : !STRUCTURE_DEFINITION_REF_EDEFAULT
                            .equals(structureDefinitionRef);
        case Bpmn2Package.DATA_INPUT__WHILE_EXECUTING:
            return isSetWhileExecuting();
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
        result.append(" (name: ");
        result.append(name);
        result.append(", optional: ");
        if (optionalESet)
            result.append(optional);
        else
            result.append("<unset>");
        result.append(", structureDefinitionRef: ");
        result.append(structureDefinitionRef);
        result.append(", whileExecuting: ");
        if (whileExecutingESet)
            result.append(whileExecuting);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DataInputImpl
