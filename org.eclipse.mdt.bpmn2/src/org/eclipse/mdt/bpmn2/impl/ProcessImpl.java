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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Auditing;
import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.FlowElement;
import org.eclipse.mdt.bpmn2.LaneSet;
import org.eclipse.mdt.bpmn2.Monitoring;
import org.eclipse.mdt.bpmn2.ProcessRole;
import org.eclipse.mdt.bpmn2.ProcessType;
import org.eclipse.mdt.bpmn2.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ProcessImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ProcessImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ProcessImpl#getProcessRole <em>Process Role</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ProcessImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ProcessImpl#getLaneSet <em>Lane Set</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ProcessImpl#getFlowElementGroup <em>Flow Element Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ProcessImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ProcessImpl#getProcessType <em>Process Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends CallableElementImpl implements
        org.eclipse.mdt.bpmn2.Process {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getAuditing() <em>Auditing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuditing()
     * @generated
     * @ordered
     */
    protected Auditing auditing;

    /**
     * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonitoring()
     * @generated
     * @ordered
     */
    protected Monitoring monitoring;

    /**
     * The cached value of the '{@link #getProcessRole() <em>Process Role</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessRole()
     * @generated
     * @ordered
     */
    protected EList<ProcessRole> processRole;

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected EList<Property> property;

    /**
     * The cached value of the '{@link #getLaneSet() <em>Lane Set</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLaneSet()
     * @generated
     * @ordered
     */
    protected EList<LaneSet> laneSet;

    /**
     * The cached value of the '{@link #getFlowElementGroup() <em>Flow Element Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowElementGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap flowElementGroup;

    /**
     * The default value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessType()
     * @generated
     * @ordered
     */
    protected static final ProcessType PROCESS_TYPE_EDEFAULT = ProcessType.NONE;

    /**
     * The cached value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessType()
     * @generated
     * @ordered
     */
    protected ProcessType processType = PROCESS_TYPE_EDEFAULT;

    /**
     * This is true if the Process Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean processTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getProcess();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Auditing getAuditing() {
        return auditing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuditing(Auditing newAuditing,
            NotificationChain msgs) {
        Auditing oldAuditing = auditing;
        auditing = newAuditing;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, Bpmn2Package.PROCESS__AUDITING,
                    oldAuditing, newAuditing);
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
    public void setAuditing(Auditing newAuditing) {
        if (newAuditing != auditing) {
            NotificationChain msgs = null;
            if (auditing != null)
                msgs = ((InternalEObject) auditing)
                        .eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.PROCESS__AUDITING, null, msgs);
            if (newAuditing != null)
                msgs = ((InternalEObject) newAuditing)
                        .eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.PROCESS__AUDITING, null, msgs);
            msgs = basicSetAuditing(newAuditing, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.PROCESS__AUDITING, newAuditing, newAuditing));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Monitoring getMonitoring() {
        return monitoring;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMonitoring(Monitoring newMonitoring,
            NotificationChain msgs) {
        Monitoring oldMonitoring = monitoring;
        monitoring = newMonitoring;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, Bpmn2Package.PROCESS__MONITORING,
                    oldMonitoring, newMonitoring);
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
    public void setMonitoring(Monitoring newMonitoring) {
        if (newMonitoring != monitoring) {
            NotificationChain msgs = null;
            if (monitoring != null)
                msgs = ((InternalEObject) monitoring).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.PROCESS__MONITORING, null, msgs);
            if (newMonitoring != null)
                msgs = ((InternalEObject) newMonitoring).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - Bpmn2Package.PROCESS__MONITORING, null, msgs);
            msgs = basicSetMonitoring(newMonitoring, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.PROCESS__MONITORING, newMonitoring,
                    newMonitoring));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ProcessRole> getProcessRole() {
        if (processRole == null) {
            processRole = new EObjectContainmentEList<ProcessRole>(
                    ProcessRole.class, this, Bpmn2Package.PROCESS__PROCESS_ROLE);
        }
        return processRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<Property>(Property.class,
                    this, Bpmn2Package.PROCESS__PROPERTY);
        }
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LaneSet> getLaneSet() {
        if (laneSet == null) {
            laneSet = new EObjectContainmentEList<LaneSet>(LaneSet.class, this,
                    Bpmn2Package.PROCESS__LANE_SET);
        }
        return laneSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFlowElementGroup() {
        if (flowElementGroup == null) {
            flowElementGroup = new BasicFeatureMap(this,
                    Bpmn2Package.PROCESS__FLOW_ELEMENT_GROUP);
        }
        return flowElementGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowElement> getFlowElement() {
        return getFlowElementGroup().list(
                Bpmn2Package.eINSTANCE.getProcess_FlowElement());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType getProcessType() {
        return processType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessType(ProcessType newProcessType) {
        ProcessType oldProcessType = processType;
        processType = newProcessType == null ? PROCESS_TYPE_EDEFAULT
                : newProcessType;
        boolean oldProcessTypeESet = processTypeESet;
        processTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.PROCESS__PROCESS_TYPE, oldProcessType,
                    processType, !oldProcessTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetProcessType() {
        ProcessType oldProcessType = processType;
        boolean oldProcessTypeESet = processTypeESet;
        processType = PROCESS_TYPE_EDEFAULT;
        processTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    Bpmn2Package.PROCESS__PROCESS_TYPE, oldProcessType,
                    PROCESS_TYPE_EDEFAULT, oldProcessTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetProcessType() {
        return processTypeESet;
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
        case Bpmn2Package.PROCESS__AUDITING:
            return basicSetAuditing(null, msgs);
        case Bpmn2Package.PROCESS__MONITORING:
            return basicSetMonitoring(null, msgs);
        case Bpmn2Package.PROCESS__PROCESS_ROLE:
            return ((InternalEList<?>) getProcessRole()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.PROCESS__PROPERTY:
            return ((InternalEList<?>) getProperty()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.PROCESS__LANE_SET:
            return ((InternalEList<?>) getLaneSet())
                    .basicRemove(otherEnd, msgs);
        case Bpmn2Package.PROCESS__FLOW_ELEMENT_GROUP:
            return ((InternalEList<?>) getFlowElementGroup()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.PROCESS__FLOW_ELEMENT:
            return ((InternalEList<?>) getFlowElement()).basicRemove(otherEnd,
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
        case Bpmn2Package.PROCESS__AUDITING:
            return getAuditing();
        case Bpmn2Package.PROCESS__MONITORING:
            return getMonitoring();
        case Bpmn2Package.PROCESS__PROCESS_ROLE:
            return getProcessRole();
        case Bpmn2Package.PROCESS__PROPERTY:
            return getProperty();
        case Bpmn2Package.PROCESS__LANE_SET:
            return getLaneSet();
        case Bpmn2Package.PROCESS__FLOW_ELEMENT_GROUP:
            if (coreType)
                return getFlowElementGroup();
            return ((FeatureMap.Internal) getFlowElementGroup()).getWrapper();
        case Bpmn2Package.PROCESS__FLOW_ELEMENT:
            return getFlowElement();
        case Bpmn2Package.PROCESS__PROCESS_TYPE:
            return getProcessType();
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
        case Bpmn2Package.PROCESS__AUDITING:
            setAuditing((Auditing) newValue);
            return;
        case Bpmn2Package.PROCESS__MONITORING:
            setMonitoring((Monitoring) newValue);
            return;
        case Bpmn2Package.PROCESS__PROCESS_ROLE:
            getProcessRole().clear();
            getProcessRole().addAll(
                    (Collection<? extends ProcessRole>) newValue);
            return;
        case Bpmn2Package.PROCESS__PROPERTY:
            getProperty().clear();
            getProperty().addAll((Collection<? extends Property>) newValue);
            return;
        case Bpmn2Package.PROCESS__LANE_SET:
            getLaneSet().clear();
            getLaneSet().addAll((Collection<? extends LaneSet>) newValue);
            return;
        case Bpmn2Package.PROCESS__FLOW_ELEMENT_GROUP:
            ((FeatureMap.Internal) getFlowElementGroup()).set(newValue);
            return;
        case Bpmn2Package.PROCESS__FLOW_ELEMENT:
            getFlowElement().clear();
            getFlowElement().addAll(
                    (Collection<? extends FlowElement>) newValue);
            return;
        case Bpmn2Package.PROCESS__PROCESS_TYPE:
            setProcessType((ProcessType) newValue);
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
        case Bpmn2Package.PROCESS__AUDITING:
            setAuditing((Auditing) null);
            return;
        case Bpmn2Package.PROCESS__MONITORING:
            setMonitoring((Monitoring) null);
            return;
        case Bpmn2Package.PROCESS__PROCESS_ROLE:
            getProcessRole().clear();
            return;
        case Bpmn2Package.PROCESS__PROPERTY:
            getProperty().clear();
            return;
        case Bpmn2Package.PROCESS__LANE_SET:
            getLaneSet().clear();
            return;
        case Bpmn2Package.PROCESS__FLOW_ELEMENT_GROUP:
            getFlowElementGroup().clear();
            return;
        case Bpmn2Package.PROCESS__FLOW_ELEMENT:
            getFlowElement().clear();
            return;
        case Bpmn2Package.PROCESS__PROCESS_TYPE:
            unsetProcessType();
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
        case Bpmn2Package.PROCESS__AUDITING:
            return auditing != null;
        case Bpmn2Package.PROCESS__MONITORING:
            return monitoring != null;
        case Bpmn2Package.PROCESS__PROCESS_ROLE:
            return processRole != null && !processRole.isEmpty();
        case Bpmn2Package.PROCESS__PROPERTY:
            return property != null && !property.isEmpty();
        case Bpmn2Package.PROCESS__LANE_SET:
            return laneSet != null && !laneSet.isEmpty();
        case Bpmn2Package.PROCESS__FLOW_ELEMENT_GROUP:
            return flowElementGroup != null && !flowElementGroup.isEmpty();
        case Bpmn2Package.PROCESS__FLOW_ELEMENT:
            return !getFlowElement().isEmpty();
        case Bpmn2Package.PROCESS__PROCESS_TYPE:
            return isSetProcessType();
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
        result.append(" (flowElementGroup: ");
        result.append(flowElementGroup);
        result.append(", processType: ");
        if (processTypeESet)
            result.append(processType);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ProcessImpl
