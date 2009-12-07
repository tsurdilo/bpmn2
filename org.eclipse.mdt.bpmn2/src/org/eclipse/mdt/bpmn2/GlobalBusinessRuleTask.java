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
package org.eclipse.mdt.bpmn2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Business Rule Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.GlobalBusinessRuleTask#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getGlobalBusinessRuleTask()
 * @model extendedMetaData="name='tGlobalBusinessRuleTask' kind='elementOnly'"
 * @generated
 */
public interface GlobalBusinessRuleTask extends GlobalTask {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rule</em>' containment reference.
     * @see #setRule(Expression)
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getGlobalBusinessRuleTask_Rule()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
     * @generated
     */
    Expression getRule();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn2.GlobalBusinessRuleTask#getRule <em>Rule</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rule</em>' containment reference.
     * @see #getRule()
     * @generated
     */
    void setRule(Expression value);

} // GlobalBusinessRuleTask
