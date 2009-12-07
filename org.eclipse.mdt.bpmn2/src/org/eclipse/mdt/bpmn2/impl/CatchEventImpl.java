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
import org.eclipse.mdt.bpmn2.CatchEvent;
import org.eclipse.mdt.bpmn2.DataOutput;
import org.eclipse.mdt.bpmn2.DataOutputAssociation;
import org.eclipse.mdt.bpmn2.EventDefinition;
import org.eclipse.mdt.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CatchEventImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CatchEventImpl#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CatchEventImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CatchEventImpl#getEventDefinitionGroup <em>Event Definition Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CatchEventImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.CatchEventImpl#getEventDefinitionRef <em>Event Definition Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CatchEventImpl extends EventImpl implements CatchEvent {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getOutputSet() <em>Output Set</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputSet()
     * @generated
     * @ordered
     */
    protected OutputSet outputSet;

    /**
     * The cached value of the '{@link #getDataOutput() <em>Data Output</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutput()
     * @generated
     * @ordered
     */
    protected DataOutput dataOutput;

    /**
     * The cached value of the '{@link #getDataOutputAssociation() <em>Data Output Association</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutputAssociation()
     * @generated
     * @ordered
     */
    protected DataOutputAssociation dataOutputAssociation;

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
    protected CatchEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getCatchEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputSet getOutputSet() {
        return outputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputSet(OutputSet newOutputSet,
            NotificationChain msgs) {
        OutputSet oldOutputSet = outputSet;
        outputSet = newOutputSet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, Bpmn2Package.CATCH_EVENT__OUTPUT_SET,
                    oldOutputSet, newOutputSet);
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
    public void setOutputSet(OutputSet newOutputSet) {
        if (newOutputSet != outputSet) {
            NotificationChain msgs = null;
            if (outputSet != null)
                msgs = ((InternalEObject) outputSet).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.CATCH_EVENT__OUTPUT_SET, null,
                        msgs);
            if (newOutputSet != null)
                msgs = ((InternalEObject) newOutputSet).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.CATCH_EVENT__OUTPUT_SET, null,
                        msgs);
            msgs = basicSetOutputSet(newOutputSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CATCH_EVENT__OUTPUT_SET, newOutputSet,
                    newOutputSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutput getDataOutput() {
        return dataOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataOutput(DataOutput newDataOutput,
            NotificationChain msgs) {
        DataOutput oldDataOutput = dataOutput;
        dataOutput = newDataOutput;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, Bpmn2Package.CATCH_EVENT__DATA_OUTPUT,
                    oldDataOutput, newDataOutput);
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
    public void setDataOutput(DataOutput newDataOutput) {
        if (newDataOutput != dataOutput) {
            NotificationChain msgs = null;
            if (dataOutput != null)
                msgs = ((InternalEObject) dataOutput).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.CATCH_EVENT__DATA_OUTPUT, null,
                        msgs);
            if (newDataOutput != null)
                msgs = ((InternalEObject) newDataOutput).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.CATCH_EVENT__DATA_OUTPUT, null,
                        msgs);
            msgs = basicSetDataOutput(newDataOutput, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CATCH_EVENT__DATA_OUTPUT, newDataOutput,
                    newDataOutput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutputAssociation getDataOutputAssociation() {
        return dataOutputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataOutputAssociation(
            DataOutputAssociation newDataOutputAssociation,
            NotificationChain msgs) {
        DataOutputAssociation oldDataOutputAssociation = dataOutputAssociation;
        dataOutputAssociation = newDataOutputAssociation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION,
                    oldDataOutputAssociation, newDataOutputAssociation);
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
    public void setDataOutputAssociation(
            DataOutputAssociation newDataOutputAssociation) {
        if (newDataOutputAssociation != dataOutputAssociation) {
            NotificationChain msgs = null;
            if (dataOutputAssociation != null)
                msgs = ((InternalEObject) dataOutputAssociation)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION,
                                null, msgs);
            if (newDataOutputAssociation != null)
                msgs = ((InternalEObject) newDataOutputAssociation)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION,
                                null, msgs);
            msgs = basicSetDataOutputAssociation(newDataOutputAssociation, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION,
                    newDataOutputAssociation, newDataOutputAssociation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getEventDefinitionGroup() {
        if (eventDefinitionGroup == null) {
            eventDefinitionGroup = new BasicFeatureMap(this,
                    Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_GROUP);
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
                Bpmn2Package.eINSTANCE.getCatchEvent_EventDefinition());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getEventDefinitionRef() {
        if (eventDefinitionRef == null) {
            eventDefinitionRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REF);
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
        case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
            return basicSetOutputSet(null, msgs);
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT:
            return basicSetDataOutput(null, msgs);
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            return basicSetDataOutputAssociation(null, msgs);
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            return ((InternalEList<?>) getEventDefinitionGroup()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION:
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
        case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
            return getOutputSet();
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT:
            return getDataOutput();
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            return getDataOutputAssociation();
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            if (coreType)
                return getEventDefinitionGroup();
            return ((FeatureMap.Internal) getEventDefinitionGroup())
                    .getWrapper();
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION:
            return getEventDefinition();
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REF:
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
        case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
            setOutputSet((OutputSet) newValue);
            return;
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT:
            setDataOutput((DataOutput) newValue);
            return;
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            setDataOutputAssociation((DataOutputAssociation) newValue);
            return;
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            ((FeatureMap.Internal) getEventDefinitionGroup()).set(newValue);
            return;
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION:
            getEventDefinition().clear();
            getEventDefinition().addAll(
                    (Collection<? extends EventDefinition>) newValue);
            return;
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REF:
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
        case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
            setOutputSet((OutputSet) null);
            return;
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT:
            setDataOutput((DataOutput) null);
            return;
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            setDataOutputAssociation((DataOutputAssociation) null);
            return;
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            getEventDefinitionGroup().clear();
            return;
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION:
            getEventDefinition().clear();
            return;
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REF:
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
        case Bpmn2Package.CATCH_EVENT__OUTPUT_SET:
            return outputSet != null;
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT:
            return dataOutput != null;
        case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
            return dataOutputAssociation != null;
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_GROUP:
            return eventDefinitionGroup != null
                    && !eventDefinitionGroup.isEmpty();
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION:
            return !getEventDefinition().isEmpty();
        case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REF:
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

} //CatchEventImpl
