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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.CorrelationProperty#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getCorrelationProperty()
 * @model extendedMetaData="name='tCorrelationProperty' kind='elementOnly'"
 * @generated
 */
public interface CorrelationProperty extends RootElement {
    /**
     * Returns the value of the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.CorrelationPropertyRetrievalExpression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Correlation Property Retrieval Expression</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Correlation Property Retrieval Expression</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getCorrelationProperty_CorrelationPropertyRetrievalExpression()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='correlationPropertyRetrievalExpression' namespace='##targetNamespace'"
     * @generated
     */
    EList<CorrelationPropertyRetrievalExpression> getCorrelationPropertyRetrievalExpression();

} // CorrelationProperty
