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

import javax.xml.namespace.QName;

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.CatchEvent;
import org.eclipse.bpmn.DataOutput;
import org.eclipse.bpmn.DataOutputAssociation;
import org.eclipse.bpmn.EventDefinition;
import org.eclipse.bpmn.OutputSet;

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
 * An implementation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.CatchEventImpl#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CatchEventImpl#getDataOutputAssociations <em>Data Output Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CatchEventImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CatchEventImpl#getEventDefinitionGroups <em>Event Definition Groups</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CatchEventImpl#getEventDefinitions <em>Event Definitions</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CatchEventImpl#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.CatchEventImpl#isParallelMultiple <em>Parallel Multiple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CatchEventImpl extends EventImpl implements CatchEvent {
    /**
     * The cached value of the '{@link #getDataOutputs() <em>Data Outputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutputs()
     * @generated
     * @ordered
     */
    protected EList<DataOutput> dataOutputs;

    /**
     * The cached value of the '{@link #getDataOutputAssociations() <em>Data Output Associations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataOutputAssociations()
     * @generated
     * @ordered
     */
    protected EList<DataOutputAssociation> dataOutputAssociations;

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
     * The cached value of the '{@link #getEventDefinitionGroups() <em>Event Definition Groups</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventDefinitionGroups()
     * @generated
     * @ordered
     */
    protected FeatureMap eventDefinitionGroups;

    /**
     * The cached value of the '{@link #getEventDefinitionRefs() <em>Event Definition Refs</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventDefinitionRefs()
     * @generated
     * @ordered
     */
    protected EList<QName> eventDefinitionRefs;

    /**
     * The default value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isParallelMultiple()
     * @generated
     * @ordered
     */
    protected static final boolean PARALLEL_MULTIPLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isParallelMultiple()
     * @generated
     * @ordered
     */
    protected boolean parallelMultiple = PARALLEL_MULTIPLE_EDEFAULT;

    /**
     * This is true if the Parallel Multiple attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean parallelMultipleESet;

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
        return BpmnPackage.eINSTANCE.getCatchEvent();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataOutput> getDataOutputs() {
        if (dataOutputs == null) {
            dataOutputs = new EObjectContainmentEList<DataOutput>(
                    DataOutput.class, this,
                    BpmnPackage.CATCH_EVENT__DATA_OUTPUTS);
        }
        return dataOutputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataOutputAssociation> getDataOutputAssociations() {
        if (dataOutputAssociations == null) {
            dataOutputAssociations = new EObjectContainmentEList<DataOutputAssociation>(
                    DataOutputAssociation.class, this,
                    BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATIONS);
        }
        return dataOutputAssociations;
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
                    Notification.SET, BpmnPackage.CATCH_EVENT__OUTPUT_SET,
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
                                - BpmnPackage.CATCH_EVENT__OUTPUT_SET, null,
                        msgs);
            if (newOutputSet != null)
                msgs = ((InternalEObject) newOutputSet).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.CATCH_EVENT__OUTPUT_SET, null,
                        msgs);
            msgs = basicSetOutputSet(newOutputSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CATCH_EVENT__OUTPUT_SET, newOutputSet,
                    newOutputSet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getEventDefinitionGroups() {
        if (eventDefinitionGroups == null) {
            eventDefinitionGroups = new BasicFeatureMap(this,
                    BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUPS);
        }
        return eventDefinitionGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EventDefinition> getEventDefinitions() {
        return getEventDefinitionGroups().list(
                BpmnPackage.eINSTANCE.getCatchEvent_EventDefinitions());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getEventDefinitionRefs() {
        if (eventDefinitionRefs == null) {
            eventDefinitionRefs = new EDataTypeEList<QName>(QName.class, this,
                    BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REFS);
        }
        return eventDefinitionRefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isParallelMultiple() {
        return parallelMultiple;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParallelMultiple(boolean newParallelMultiple) {
        boolean oldParallelMultiple = parallelMultiple;
        parallelMultiple = newParallelMultiple;
        boolean oldParallelMultipleESet = parallelMultipleESet;
        parallelMultipleESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE,
                    oldParallelMultiple, parallelMultiple,
                    !oldParallelMultipleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetParallelMultiple() {
        boolean oldParallelMultiple = parallelMultiple;
        boolean oldParallelMultipleESet = parallelMultipleESet;
        parallelMultiple = PARALLEL_MULTIPLE_EDEFAULT;
        parallelMultipleESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE,
                    oldParallelMultiple, PARALLEL_MULTIPLE_EDEFAULT,
                    oldParallelMultipleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetParallelMultiple() {
        return parallelMultipleESet;
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUTS:
            return ((InternalEList<?>) getDataOutputs()).basicRemove(otherEnd,
                    msgs);
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATIONS:
            return ((InternalEList<?>) getDataOutputAssociations())
                    .basicRemove(otherEnd, msgs);
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            return basicSetOutputSet(null, msgs);
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUPS:
            return ((InternalEList<?>) getEventDefinitionGroups()).basicRemove(
                    otherEnd, msgs);
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITIONS:
            return ((InternalEList<?>) getEventDefinitions()).basicRemove(
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUTS:
            return getDataOutputs();
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATIONS:
            return getDataOutputAssociations();
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            return getOutputSet();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUPS:
            if (coreType)
                return getEventDefinitionGroups();
            return ((FeatureMap.Internal) getEventDefinitionGroups())
                    .getWrapper();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITIONS:
            return getEventDefinitions();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REFS:
            return getEventDefinitionRefs();
        case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
            return isParallelMultiple();
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUTS:
            getDataOutputs().clear();
            getDataOutputs()
                    .addAll((Collection<? extends DataOutput>) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATIONS:
            getDataOutputAssociations().clear();
            getDataOutputAssociations().addAll(
                    (Collection<? extends DataOutputAssociation>) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            setOutputSet((OutputSet) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUPS:
            ((FeatureMap.Internal) getEventDefinitionGroups()).set(newValue);
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITIONS:
            getEventDefinitions().clear();
            getEventDefinitions().addAll(
                    (Collection<? extends EventDefinition>) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REFS:
            getEventDefinitionRefs().clear();
            getEventDefinitionRefs().addAll(
                    (Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
            setParallelMultiple((Boolean) newValue);
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUTS:
            getDataOutputs().clear();
            return;
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATIONS:
            getDataOutputAssociations().clear();
            return;
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            setOutputSet((OutputSet) null);
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUPS:
            getEventDefinitionGroups().clear();
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITIONS:
            getEventDefinitions().clear();
            return;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REFS:
            getEventDefinitionRefs().clear();
            return;
        case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
            unsetParallelMultiple();
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
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUTS:
            return dataOutputs != null && !dataOutputs.isEmpty();
        case BpmnPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATIONS:
            return dataOutputAssociations != null
                    && !dataOutputAssociations.isEmpty();
        case BpmnPackage.CATCH_EVENT__OUTPUT_SET:
            return outputSet != null;
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_GROUPS:
            return eventDefinitionGroups != null
                    && !eventDefinitionGroups.isEmpty();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITIONS:
            return !getEventDefinitions().isEmpty();
        case BpmnPackage.CATCH_EVENT__EVENT_DEFINITION_REFS:
            return eventDefinitionRefs != null
                    && !eventDefinitionRefs.isEmpty();
        case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
            return isSetParallelMultiple();
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
        result.append(" (eventDefinitionGroups: "); //$NON-NLS-1$
        result.append(eventDefinitionGroups);
        result.append(", eventDefinitionRefs: "); //$NON-NLS-1$
        result.append(eventDefinitionRefs);
        result.append(", parallelMultiple: "); //$NON-NLS-1$
        if (parallelMultipleESet)
            result.append(parallelMultiple);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(')');
        return result.toString();
    }

} //CatchEventImpl
