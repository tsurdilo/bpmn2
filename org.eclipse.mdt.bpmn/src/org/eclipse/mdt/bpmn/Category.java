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
package org.eclipse.mdt.bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.Category#getCategoryValue <em>Category Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getCategory()
 * @model extendedMetaData="name='tCategory' kind='elementOnly'"
 * @generated
 */
public interface Category extends RootElement {
    /**
     * Returns the value of the '<em><b>Category Value</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.mdt.bpmn.CategoryValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category Value</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Value</em>' containment reference list.
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getCategory_CategoryValue()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='categoryValue' namespace='##targetNamespace'"
     * @generated
     */
    EList<CategoryValue> getCategoryValue();

} // Category
