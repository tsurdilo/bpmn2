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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.CorrelationSet#getFormalExpression <em>Formal Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getCorrelationSet()
 * @model extendedMetaData="name='tCorrelationSet' kind='elementOnly'"
 * @generated
 */
public interface CorrelationSet extends BaseElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * Returns the value of the '<em><b>Formal Expression</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn2.FormalExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formal Expression</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Formal Expression</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn2.Bpmn2Package#getCorrelationSet_FormalExpression()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='formalExpression' namespace='##targetNamespace'"
     * @generated
     */
    EList<FormalExpression> getFormalExpression();

} // CorrelationSet
