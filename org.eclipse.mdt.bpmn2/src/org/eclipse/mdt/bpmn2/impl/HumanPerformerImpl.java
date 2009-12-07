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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.HumanPerformer;
import org.eclipse.mdt.bpmn2.PeopleAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.HumanPerformerImpl#getPeopleAssignmentGroup <em>People Assignment Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.HumanPerformerImpl#getPeopleAssignment <em>People Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanPerformerImpl extends PerformerImpl implements HumanPerformer {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getPeopleAssignmentGroup() <em>People Assignment Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeopleAssignmentGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap peopleAssignmentGroup;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HumanPerformerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getHumanPerformer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getPeopleAssignmentGroup() {
        if (peopleAssignmentGroup == null) {
            peopleAssignmentGroup = new BasicFeatureMap(this,
                    Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT_GROUP);
        }
        return peopleAssignmentGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PeopleAssignment getPeopleAssignment() {
        return (PeopleAssignment) getPeopleAssignmentGroup().get(
                Bpmn2Package.eINSTANCE.getHumanPerformer_PeopleAssignment(),
                true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPeopleAssignment(
            PeopleAssignment newPeopleAssignment, NotificationChain msgs) {
        return ((FeatureMap.Internal) getPeopleAssignmentGroup()).basicAdd(
                Bpmn2Package.eINSTANCE.getHumanPerformer_PeopleAssignment(),
                newPeopleAssignment, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPeopleAssignment(PeopleAssignment newPeopleAssignment) {
        ((FeatureMap.Internal) getPeopleAssignmentGroup()).set(
                Bpmn2Package.eINSTANCE.getHumanPerformer_PeopleAssignment(),
                newPeopleAssignment);
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
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT_GROUP:
            return ((InternalEList<?>) getPeopleAssignmentGroup()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT:
            return basicSetPeopleAssignment(null, msgs);
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
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT_GROUP:
            if (coreType)
                return getPeopleAssignmentGroup();
            return ((FeatureMap.Internal) getPeopleAssignmentGroup())
                    .getWrapper();
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT:
            return getPeopleAssignment();
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
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT_GROUP:
            ((FeatureMap.Internal) getPeopleAssignmentGroup()).set(newValue);
            return;
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT:
            setPeopleAssignment((PeopleAssignment) newValue);
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
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT_GROUP:
            getPeopleAssignmentGroup().clear();
            return;
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT:
            setPeopleAssignment((PeopleAssignment) null);
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
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT_GROUP:
            return peopleAssignmentGroup != null
                    && !peopleAssignmentGroup.isEmpty();
        case Bpmn2Package.HUMAN_PERFORMER__PEOPLE_ASSIGNMENT:
            return getPeopleAssignment() != null;
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
        result.append(" (peopleAssignmentGroup: ");
        result.append(peopleAssignmentGroup);
        result.append(')');
        return result.toString();
    }

} //HumanPerformerImpl
