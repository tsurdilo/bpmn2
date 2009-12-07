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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.ParameterBinding;
import org.eclipse.mdt.bpmn2.PeopleAssignmentPeopleGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>People Assignment People Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.PeopleAssignmentPeopleGroupImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.PeopleAssignmentPeopleGroupImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeopleAssignmentPeopleGroupImpl extends PeopleAssignmentImpl
        implements PeopleAssignmentPeopleGroup {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
    protected EList<ParameterBinding> parameter;

    /**
     * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinition()
     * @generated
     * @ordered
     */
    protected static final QName DEFINITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinition()
     * @generated
     * @ordered
     */
    protected QName definition = DEFINITION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PeopleAssignmentPeopleGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getPeopleAssignmentPeopleGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParameterBinding> getParameter() {
        if (parameter == null) {
            parameter = new EObjectContainmentEList<ParameterBinding>(
                    ParameterBinding.class, this,
                    Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__PARAMETER);
        }
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getDefinition() {
        return definition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefinition(QName newDefinition) {
        QName oldDefinition = definition;
        definition = newDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__DEFINITION,
                    oldDefinition, definition));
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
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__PARAMETER:
            return ((InternalEList<?>) getParameter()).basicRemove(otherEnd,
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
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__PARAMETER:
            return getParameter();
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__DEFINITION:
            return getDefinition();
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
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__PARAMETER:
            getParameter().clear();
            getParameter().addAll(
                    (Collection<? extends ParameterBinding>) newValue);
            return;
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__DEFINITION:
            setDefinition((QName) newValue);
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
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__PARAMETER:
            getParameter().clear();
            return;
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__DEFINITION:
            setDefinition(DEFINITION_EDEFAULT);
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
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__PARAMETER:
            return parameter != null && !parameter.isEmpty();
        case Bpmn2Package.PEOPLE_ASSIGNMENT_PEOPLE_GROUP__DEFINITION:
            return DEFINITION_EDEFAULT == null ? definition != null
                    : !DEFINITION_EDEFAULT.equals(definition);
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
        result.append(" (definition: ");
        result.append(definition);
        result.append(')');
        return result.toString();
    }

} //PeopleAssignmentPeopleGroupImpl
