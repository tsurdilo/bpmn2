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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.DataInput;
import org.eclipse.mdt.bpmn2.DataInputAssociation;
import org.eclipse.mdt.bpmn2.EventDefinition;
import org.eclipse.mdt.bpmn2.InputSet;
import org.eclipse.mdt.bpmn2.ThrowEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throw Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ThrowEventImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ThrowEventImpl#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ThrowEventImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ThrowEventImpl#getEventDefinitionGroup <em>Event Definition Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ThrowEventImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ThrowEventImpl#getEventDefinitionRef <em>Event Definition Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ThrowEventImpl extends EventImpl implements ThrowEvent {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getInputSet() <em>Input Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSet()
     * @generated
     * @ordered
     */
    protected InputSet inputSet;

    /**
     * The cached value of the '{@link #getDataInput() <em>Data Input</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInput()
     * @generated
     * @ordered
     */
    protected DataInput dataInput;

    /**
     * The cached value of the '{@link #getDataInputAssociation() <em>Data Input Association</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInputAssociation()
     * @generated
     * @ordered
     */
    protected DataInputAssociation dataInputAssociation;

    /**
     * The cached value of the '{@link #getEventDefinitionGroup() <em>Event Definition Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventDefinitionGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap eventDefinitionGroup;

    /**
     * The cached value of the '{@link #getEventDefinitionRef() <em>Event Definition Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventDefinitionRef()
     * @generated
     * @ordered
     */
    protected EList<QName> eventDefinitionRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ThrowEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getThrowEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputSet getInputSet() {
        return inputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputSet(InputSet newInputSet,
            NotificationChain msgs) {
        InputSet oldInputSet = inputSet;
        inputSet = newInputSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, Bpmn2Package.THROW_EVENT__INPUT_SET,
                    oldInputSet, newInputSet);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputSet(InputSet newInputSet) {
        if (newInputSet != inputSet) {
            NotificationChain msgs = null;
            if (inputSet != null)
                msgs = ((InternalEObject) inputSet).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.THROW_EVENT__INPUT_SET, null,
                        msgs);
            if (newInputSet != null)
                msgs = ((InternalEObject) newInputSet).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.THROW_EVENT__INPUT_SET, null,
                        msgs);
            msgs = basicSetInputSet(newInputSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.THROW_EVENT__INPUT_SET, newInputSet,
                    newInputSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInput getDataInput() {
        return dataInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataInput(DataInput newDataInput,
            NotificationChain msgs) {
        DataInput oldDataInput = dataInput;
        dataInput = newDataInput;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, Bpmn2Package.THROW_EVENT__DATA_INPUT,
                    oldDataInput, newDataInput);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataInput(DataInput newDataInput) {
        if (newDataInput != dataInput) {
            NotificationChain msgs = null;
            if (dataInput != null)
                msgs = ((InternalEObject) dataInput).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.THROW_EVENT__DATA_INPUT, null,
                        msgs);
            if (newDataInput != null)
                msgs = ((InternalEObject) newDataInput).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.THROW_EVENT__DATA_INPUT, null,
                        msgs);
            msgs = basicSetDataInput(newDataInput, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.THROW_EVENT__DATA_INPUT, newDataInput,
                    newDataInput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInputAssociation getDataInputAssociation() {
        return dataInputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataInputAssociation(
            DataInputAssociation newDataInputAssociation, NotificationChain msgs) {
        DataInputAssociation oldDataInputAssociation = dataInputAssociation;
        dataInputAssociation = newDataInputAssociation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION,
                    oldDataInputAssociation, newDataInputAssociation);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataInputAssociation(
            DataInputAssociation newDataInputAssociation) {
        if (newDataInputAssociation != dataInputAssociation) {
            NotificationChain msgs = null;
            if (dataInputAssociation != null)
                msgs = ((InternalEObject) dataInputAssociation)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION,
                                null, msgs);
            if (newDataInputAssociation != null)
                msgs = ((InternalEObject) newDataInputAssociation)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION,
                                null, msgs);
            msgs = basicSetDataInputAssociation(newDataInputAssociation, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION,
                    newDataInputAssociation, newDataInputAssociation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getEventDefinitionGroup() {
        if (eventDefinitionGroup == null) {
            eventDefinitionGroup = new BasicFeatureMap(this,
                    Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_GROUP);
        }
        return eventDefinitionGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EventDefinition> getEventDefinition() {
        return getEventDefinitionGroup().list(
                Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinition());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getEventDefinitionRef() {
        if (eventDefinitionRef == null) {
            eventDefinitionRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REF);
        }
        return eventDefinitionRef;
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
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            return basicSetInputSet(null, msgs);
        case Bpmn2Package.THROW_EVENT__DATA_INPUT:
            return basicSetDataInput(null, msgs);
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            return basicSetDataInputAssociation(null, msgs);
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_GROUP:
            return ((InternalEList<?>) getEventDefinitionGroup()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION:
            return ((InternalEList<?>) getEventDefinition()).basicRemove(
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
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            return getInputSet();
        case Bpmn2Package.THROW_EVENT__DATA_INPUT:
            return getDataInput();
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            return getDataInputAssociation();
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_GROUP:
            if (coreType)
                return getEventDefinitionGroup();
            return ((FeatureMap.Internal) getEventDefinitionGroup())
                    .getWrapper();
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION:
            return getEventDefinition();
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REF:
            return getEventDefinitionRef();
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
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            setInputSet((InputSet) newValue);
            return;
        case Bpmn2Package.THROW_EVENT__DATA_INPUT:
            setDataInput((DataInput) newValue);
            return;
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            setDataInputAssociation((DataInputAssociation) newValue);
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_GROUP:
            ((FeatureMap.Internal) getEventDefinitionGroup()).set(newValue);
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION:
            getEventDefinition().clear();
            getEventDefinition().addAll(
                    (Collection<? extends EventDefinition>) newValue);
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REF:
            getEventDefinitionRef().clear();
            getEventDefinitionRef().addAll(
                    (Collection<? extends QName>) newValue);
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
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            setInputSet((InputSet) null);
            return;
        case Bpmn2Package.THROW_EVENT__DATA_INPUT:
            setDataInput((DataInput) null);
            return;
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            setDataInputAssociation((DataInputAssociation) null);
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_GROUP:
            getEventDefinitionGroup().clear();
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION:
            getEventDefinition().clear();
            return;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REF:
            getEventDefinitionRef().clear();
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
        case Bpmn2Package.THROW_EVENT__INPUT_SET:
            return inputSet != null;
        case Bpmn2Package.THROW_EVENT__DATA_INPUT:
            return dataInput != null;
        case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            return dataInputAssociation != null;
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_GROUP:
            return eventDefinitionGroup != null
                    && !eventDefinitionGroup.isEmpty();
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION:
            return !getEventDefinition().isEmpty();
        case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REF:
            return eventDefinitionRef != null && !eventDefinitionRef.isEmpty();
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
        result.append(" (eventDefinitionGroup: ");
        result.append(eventDefinitionGroup);
        result.append(", eventDefinitionRef: ");
        result.append(eventDefinitionRef);
        result.append(')');
        return result.toString();
    }

} //ThrowEventImpl
