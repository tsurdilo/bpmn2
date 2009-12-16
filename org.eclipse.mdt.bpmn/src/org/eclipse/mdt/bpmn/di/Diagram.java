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
 * $Id$
 */
package org.eclipse.mdt.bpmn.di;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.di.Diagram#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.di.diPackage#getDiagram()
 * @model extendedMetaData="name='Diagram' kind='elementOnly'"
 * @generated
 */
public interface Diagram extends View {
    /**
     * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.di.Connector}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connector</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.di.diPackage#getDiagram_Connector()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace'"
     * @generated
     */
    EList<Connector> getConnector();

} // Diagram
