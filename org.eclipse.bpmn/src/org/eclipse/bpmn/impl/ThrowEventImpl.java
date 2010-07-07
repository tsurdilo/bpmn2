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

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.DataInput;
import org.eclipse.bpmn.DataInputAssociation;
import org.eclipse.bpmn.EventDefinition;
import org.eclipse.bpmn.InputSet;
import org.eclipse.bpmn.ThrowEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throw Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ThrowEventImpl#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ThrowEventImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ThrowEventImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ThrowEventImpl#getEventDefinitionGroup <em>Event Definition Group</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ThrowEventImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ThrowEventImpl#getEventDefinitionRef <em>Event Definition Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ThrowEventImpl extends EventImpl implements ThrowEvent {
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
     * The cached value of the '{@link #getDataInputAssociation() <em>Data Input Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInputAssociation()
     * @generated
     * @ordered
     */
    protected EList<DataInputAssociation> dataInputAssociation;

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
        return BpmnPackage.eINSTANCE.getThrowEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<DataInput> getDataInput() {
        if (dataInput == null) {
            dataInput = new EObjectContainmentEList<DataInput>(DataInput.class, this, BpmnPackage.THROW_EVENT__DATA_INPUT);
        }
        return dataInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<DataInputAssociation> getDataInputAssociation() {
        if (dataInputAssociation == null) {
            dataInputAssociation = new EObjectContainmentEList<DataInputAssociation>(DataInputAssociation.class, this,
                    BpmnPackage.THROW_EVENT__DATA_INPUT_ASSOCIATION);
        }
        return dataInputAssociation;
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
    public NotificationChain basicSetInputSet(InputSet newInputSet, NotificationChain msgs) {
        InputSet oldInputSet = inputSet;
        inputSet = newInputSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.THROW_EVENT__INPUT_SET, oldInputSet, newInputSet);
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
                msgs = ((InternalEObject) inputSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.THROW_EVENT__INPUT_SET, null, msgs);
            if (newInputSet != null)
                msgs = ((InternalEObject) newInputSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.THROW_EVENT__INPUT_SET, null, msgs);
            msgs = basicSetInputSet(newInputSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.THROW_EVENT__INPUT_SET, newInputSet, newInputSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getEventDefinitionGroup() {
        if (eventDefinitionGroup == null) {
            eventDefinitionGroup = new BasicFeatureMap(this, BpmnPackage.THROW_EVENT__EVENT_DEFINITION_GROUP);
        }
        return eventDefinitionGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<EventDefinition> getEventDefinition() {
        return getEventDefinitionGroup().list(BpmnPackage.eINSTANCE.getThrowEvent_EventDefinition());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<QName> getEventDefinitionRef() {
        if (eventDefinitionRef == null) {
            eventDefinitionRef = new EDataTypeEList<QName>(QName.class, this, BpmnPackage.THROW_EVENT__EVENT_DEFINITION_REF);
        }
        return eventDefinitionRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.THROW_EVENT__DATA_INPUT:
            return ((InternalEList<?>) getDataInput()).basicRemove(otherEnd, msgs);
        case BpmnPackage.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            return ((InternalEList<?>) getDataInputAssociation()).basicRemove(otherEnd, msgs);
        case BpmnPackage.THROW_EVENT__INPUT_SET:
            return basicSetInputSet(null, msgs);
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_GROUP:
            return ((InternalEList<?>) getEventDefinitionGroup()).basicRemove(otherEnd, msgs);
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION:
            return ((InternalEList<?>) getEventDefinition()).basicRemove(otherEnd, msgs);
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
        case BpmnPackage.THROW_EVENT__DATA_INPUT:
            return getDataInput();
        case BpmnPackage.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            return getDataInputAssociation();
        case BpmnPackage.THROW_EVENT__INPUT_SET:
            return getInputSet();
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_GROUP:
            if (coreType)
                return getEventDefinitionGroup();
            return ((FeatureMap.Internal) getEventDefinitionGroup()).getWrapper();
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION:
            return getEventDefinition();
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_REF:
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
        case BpmnPackage.THROW_EVENT__DATA_INPUT:
            getDataInput().clear();
            getDataInput().addAll((Collection<? extends DataInput>) newValue);
            return;
        case BpmnPackage.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            getDataInputAssociation().clear();
            getDataInputAssociation().addAll((Collection<? extends DataInputAssociation>) newValue);
            return;
        case BpmnPackage.THROW_EVENT__INPUT_SET:
            setInputSet((InputSet) newValue);
            return;
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_GROUP:
            ((FeatureMap.Internal) getEventDefinitionGroup()).set(newValue);
            return;
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION:
            getEventDefinition().clear();
            getEventDefinition().addAll((Collection<? extends EventDefinition>) newValue);
            return;
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_REF:
            getEventDefinitionRef().clear();
            getEventDefinitionRef().addAll((Collection<? extends QName>) newValue);
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
        case BpmnPackage.THROW_EVENT__DATA_INPUT:
            getDataInput().clear();
            return;
        case BpmnPackage.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            getDataInputAssociation().clear();
            return;
        case BpmnPackage.THROW_EVENT__INPUT_SET:
            setInputSet((InputSet) null);
            return;
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_GROUP:
            getEventDefinitionGroup().clear();
            return;
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION:
            getEventDefinition().clear();
            return;
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_REF:
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
        case BpmnPackage.THROW_EVENT__DATA_INPUT:
            return dataInput != null && !dataInput.isEmpty();
        case BpmnPackage.THROW_EVENT__DATA_INPUT_ASSOCIATION:
            return dataInputAssociation != null && !dataInputAssociation.isEmpty();
        case BpmnPackage.THROW_EVENT__INPUT_SET:
            return inputSet != null;
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_GROUP:
            return eventDefinitionGroup != null && !eventDefinitionGroup.isEmpty();
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION:
            return !getEventDefinition().isEmpty();
        case BpmnPackage.THROW_EVENT__EVENT_DEFINITION_REF:
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
        result.append(" (eventDefinitionGroup: "); //$NON-NLS-1$
        result.append(eventDefinitionGroup);
        result.append(", eventDefinitionRef: "); //$NON-NLS-1$
        result.append(eventDefinitionRef);
        result.append(')');
        return result.toString();
    }

} //ThrowEventImpl
