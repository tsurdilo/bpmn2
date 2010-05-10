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

import org.eclipse.bpmn.BpmnPackage;
import org.eclipse.bpmn.Script;
import org.eclipse.bpmn.ScriptTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.impl.ScriptTaskImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.bpmn.impl.ScriptTaskImpl#getScriptLanguage <em>Script Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptTaskImpl extends TaskImpl implements ScriptTask {
    /**
     * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScript()
     * @generated
     * @ordered
     */
    protected Script script;

    /**
     * The default value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptLanguage()
     * @generated
     * @ordered
     */
    protected static final String SCRIPT_LANGUAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptLanguage()
     * @generated
     * @ordered
     */
    protected String scriptLanguage = SCRIPT_LANGUAGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScriptTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getScriptTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getScript() {
        return script;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScript(Script newScript,
            NotificationChain msgs) {
        Script oldScript = script;
        script = newScript;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET, BpmnPackage.SCRIPT_TASK__SCRIPT,
                    oldScript, newScript);
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
    public void setScript(Script newScript) {
        if (newScript != script) {
            NotificationChain msgs = null;
            if (script != null)
                msgs = ((InternalEObject) script).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.SCRIPT_TASK__SCRIPT, null, msgs);
            if (newScript != null)
                msgs = ((InternalEObject) newScript).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - BpmnPackage.SCRIPT_TASK__SCRIPT, null, msgs);
            msgs = basicSetScript(newScript, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.SCRIPT_TASK__SCRIPT, newScript, newScript));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getScriptLanguage() {
        return scriptLanguage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScriptLanguage(String newScriptLanguage) {
        String oldScriptLanguage = scriptLanguage;
        scriptLanguage = newScriptLanguage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.SCRIPT_TASK__SCRIPT_LANGUAGE,
                    oldScriptLanguage, scriptLanguage));
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
        case BpmnPackage.SCRIPT_TASK__SCRIPT:
            return basicSetScript(null, msgs);
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
        case BpmnPackage.SCRIPT_TASK__SCRIPT:
            return getScript();
        case BpmnPackage.SCRIPT_TASK__SCRIPT_LANGUAGE:
            return getScriptLanguage();
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
        case BpmnPackage.SCRIPT_TASK__SCRIPT:
            setScript((Script) newValue);
            return;
        case BpmnPackage.SCRIPT_TASK__SCRIPT_LANGUAGE:
            setScriptLanguage((String) newValue);
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
        case BpmnPackage.SCRIPT_TASK__SCRIPT:
            setScript((Script) null);
            return;
        case BpmnPackage.SCRIPT_TASK__SCRIPT_LANGUAGE:
            setScriptLanguage(SCRIPT_LANGUAGE_EDEFAULT);
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
        case BpmnPackage.SCRIPT_TASK__SCRIPT:
            return script != null;
        case BpmnPackage.SCRIPT_TASK__SCRIPT_LANGUAGE:
            return SCRIPT_LANGUAGE_EDEFAULT == null ? scriptLanguage != null
                    : !SCRIPT_LANGUAGE_EDEFAULT.equals(scriptLanguage);
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
        result.append(" (scriptLanguage: "); //$NON-NLS-1$
        result.append(scriptLanguage);
        result.append(')');
        return result.toString();
    }

} //ScriptTaskImpl
