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
package org.eclipse.bpmn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Script Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.GlobalScriptTask#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.bpmn.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getGlobalScriptTask()
 * @model extendedMetaData="name='tGlobalScriptTask' kind='elementOnly'"
 * @generated
 */
public interface GlobalScriptTask extends GlobalTask {
    /**
     * Returns the value of the '<em><b>Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script</em>' containment reference.
     * @see #setScript(Script)
     * @see org.eclipse.bpmn.BpmnPackage#getGlobalScriptTask_Script()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace'"
     * @generated
     */
    Script getScript();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.GlobalScriptTask#getScript <em>Script</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script</em>' containment reference.
     * @see #getScript()
     * @generated
     */
    void setScript(Script value);

    /**
     * Returns the value of the '<em><b>Script Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script Language</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script Language</em>' attribute.
     * @see #setScriptLanguage(String)
     * @see org.eclipse.bpmn.BpmnPackage#getGlobalScriptTask_ScriptLanguage()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='scriptLanguage'"
     * @generated
     */
    String getScriptLanguage();

    /**
     * Sets the value of the '{@link org.eclipse.bpmn.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script Language</em>' attribute.
     * @see #getScriptLanguage()
     * @generated
     */
    void setScriptLanguage(String value);

} // GlobalScriptTask
