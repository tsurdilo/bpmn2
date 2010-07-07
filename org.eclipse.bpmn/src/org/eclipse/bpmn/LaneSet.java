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

import java.util.List;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.LaneSet#getLane <em>Lane</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpmn.BpmnPackage#getLaneSet()
 * @model extendedMetaData="name='tLaneSet' kind='elementOnly'"
 * @generated
 */
public interface LaneSet extends BaseElement {
    /**
     * Returns the value of the '<em><b>Lane</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.bpmn.Lane}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lane</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lane</em>' containment reference list.
     * @see org.eclipse.bpmn.BpmnPackage#getLaneSet_Lane()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='lane' namespace='##targetNamespace'"
     * @generated
     */
    List<Lane> getLane();

} // LaneSet
