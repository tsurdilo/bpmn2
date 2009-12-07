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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.Participant;
import org.eclipse.mdt.bpmn2.ParticipantMultiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ParticipantImpl#getInterfaceRef <em>Interface Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ParticipantImpl#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ParticipantImpl#getEntityRef <em>Entity Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ParticipantImpl#getProcessRef <em>Process Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ParticipantImpl#getRoleRef <em>Role Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantImpl extends RootElementImpl implements Participant {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getInterfaceRef() <em>Interface Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaceRef()
     * @generated
     * @ordered
     */
    protected EList<QName> interfaceRef;

    /**
     * The cached value of the '{@link #getParticipantMultiplicity() <em>Participant Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantMultiplicity()
     * @generated
     * @ordered
     */
    protected ParticipantMultiplicity participantMultiplicity;

    /**
     * The default value of the '{@link #getEntityRef() <em>Entity Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityRef()
     * @generated
     * @ordered
     */
    protected static final QName ENTITY_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEntityRef() <em>Entity Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityRef()
     * @generated
     * @ordered
     */
    protected QName entityRef = ENTITY_REF_EDEFAULT;

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
     * The default value of the '{@link #getProcessRef() <em>Process Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessRef()
     * @generated
     * @ordered
     */
    protected static final QName PROCESS_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessRef() <em>Process Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessRef()
     * @generated
     * @ordered
     */
    protected QName processRef = PROCESS_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getRoleRef() <em>Role Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleRef()
     * @generated
     * @ordered
     */
    protected static final QName ROLE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRoleRef() <em>Role Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleRef()
     * @generated
     * @ordered
     */
    protected QName roleRef = ROLE_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParticipantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getParticipant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getInterfaceRef() {
        if (interfaceRef == null) {
            interfaceRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.PARTICIPANT__INTERFACE_REF);
        }
        return interfaceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantMultiplicity getParticipantMultiplicity() {
        return participantMultiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipantMultiplicity(
            ParticipantMultiplicity newParticipantMultiplicity,
            NotificationChain msgs) {
        ParticipantMultiplicity oldParticipantMultiplicity = participantMultiplicity;
        participantMultiplicity = newParticipantMultiplicity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
                    oldParticipantMultiplicity, newParticipantMultiplicity);
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
    public void setParticipantMultiplicity(
            ParticipantMultiplicity newParticipantMultiplicity) {
        if (newParticipantMultiplicity != participantMultiplicity) {
            NotificationChain msgs = null;
            if (participantMultiplicity != null)
                msgs = ((InternalEObject) participantMultiplicity)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
                                null, msgs);
            if (newParticipantMultiplicity != null)
                msgs = ((InternalEObject) newParticipantMultiplicity)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
                                null, msgs);
            msgs = basicSetParticipantMultiplicity(newParticipantMultiplicity,
                    msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY,
                    newParticipantMultiplicity, newParticipantMultiplicity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getEntityRef() {
        return entityRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityRef(QName newEntityRef) {
        QName oldEntityRef = entityRef;
        entityRef = newEntityRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.PARTICIPANT__ENTITY_REF, oldEntityRef,
                    entityRef));
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
                    Bpmn2Package.PARTICIPANT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getProcessRef() {
        return processRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessRef(QName newProcessRef) {
        QName oldProcessRef = processRef;
        processRef = newProcessRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.PARTICIPANT__PROCESS_REF, oldProcessRef,
                    processRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getRoleRef() {
        return roleRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoleRef(QName newRoleRef) {
        QName oldRoleRef = roleRef;
        roleRef = newRoleRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.PARTICIPANT__ROLE_REF, oldRoleRef, roleRef));
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
        case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            return basicSetParticipantMultiplicity(null, msgs);
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
        case Bpmn2Package.PARTICIPANT__INTERFACE_REF:
            return getInterfaceRef();
        case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            return getParticipantMultiplicity();
        case Bpmn2Package.PARTICIPANT__ENTITY_REF:
            return getEntityRef();
        case Bpmn2Package.PARTICIPANT__NAME:
            return getName();
        case Bpmn2Package.PARTICIPANT__PROCESS_REF:
            return getProcessRef();
        case Bpmn2Package.PARTICIPANT__ROLE_REF:
            return getRoleRef();
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
        case Bpmn2Package.PARTICIPANT__INTERFACE_REF:
            getInterfaceRef().clear();
            getInterfaceRef().addAll((Collection<? extends QName>) newValue);
            return;
        case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            setParticipantMultiplicity((ParticipantMultiplicity) newValue);
            return;
        case Bpmn2Package.PARTICIPANT__ENTITY_REF:
            setEntityRef((QName) newValue);
            return;
        case Bpmn2Package.PARTICIPANT__NAME:
            setName((String) newValue);
            return;
        case Bpmn2Package.PARTICIPANT__PROCESS_REF:
            setProcessRef((QName) newValue);
            return;
        case Bpmn2Package.PARTICIPANT__ROLE_REF:
            setRoleRef((QName) newValue);
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
        case Bpmn2Package.PARTICIPANT__INTERFACE_REF:
            getInterfaceRef().clear();
            return;
        case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            setParticipantMultiplicity((ParticipantMultiplicity) null);
            return;
        case Bpmn2Package.PARTICIPANT__ENTITY_REF:
            setEntityRef(ENTITY_REF_EDEFAULT);
            return;
        case Bpmn2Package.PARTICIPANT__NAME:
            setName(NAME_EDEFAULT);
            return;
        case Bpmn2Package.PARTICIPANT__PROCESS_REF:
            setProcessRef(PROCESS_REF_EDEFAULT);
            return;
        case Bpmn2Package.PARTICIPANT__ROLE_REF:
            setRoleRef(ROLE_REF_EDEFAULT);
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
        case Bpmn2Package.PARTICIPANT__INTERFACE_REF:
            return interfaceRef != null && !interfaceRef.isEmpty();
        case Bpmn2Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
            return participantMultiplicity != null;
        case Bpmn2Package.PARTICIPANT__ENTITY_REF:
            return ENTITY_REF_EDEFAULT == null ? entityRef != null
                    : !ENTITY_REF_EDEFAULT.equals(entityRef);
        case Bpmn2Package.PARTICIPANT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
        case Bpmn2Package.PARTICIPANT__PROCESS_REF:
            return PROCESS_REF_EDEFAULT == null ? processRef != null
                    : !PROCESS_REF_EDEFAULT.equals(processRef);
        case Bpmn2Package.PARTICIPANT__ROLE_REF:
            return ROLE_REF_EDEFAULT == null ? roleRef != null
                    : !ROLE_REF_EDEFAULT.equals(roleRef);
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
        result.append(" (interfaceRef: ");
        result.append(interfaceRef);
        result.append(", entityRef: ");
        result.append(entityRef);
        result.append(", name: ");
        result.append(name);
        result.append(", processRef: ");
        result.append(processRef);
        result.append(", roleRef: ");
        result.append(roleRef);
        result.append(')');
        return result.toString();
    }

} //ParticipantImpl
