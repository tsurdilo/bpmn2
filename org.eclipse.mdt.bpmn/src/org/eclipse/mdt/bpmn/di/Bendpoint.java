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
package org.eclipse.mdt.bpmn.di;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bendpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceX <em>Source X</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceY <em>Source Y</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetX <em>Target X</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetY <em>Target Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.di.DIPackage#getBendpoint()
 * @model extendedMetaData="name='Bendpoint' kind='empty'"
 * @generated
 */
public interface Bendpoint extends EObject {
    /**
     * Returns the value of the '<em><b>Source X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source X</em>' attribute.
     * @see #isSetSourceX()
     * @see #unsetSourceX()
     * @see #setSourceX(int)
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getBendpoint_SourceX()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='sourceX'"
     * @generated
     */
    int getSourceX();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceX <em>Source X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source X</em>' attribute.
     * @see #isSetSourceX()
     * @see #unsetSourceX()
     * @see #getSourceX()
     * @generated
     */
    void setSourceX(int value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceX <em>Source X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSourceX()
     * @see #getSourceX()
     * @see #setSourceX(int)
     * @generated
     */
    void unsetSourceX();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceX <em>Source X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Source X</em>' attribute is set.
     * @see #unsetSourceX()
     * @see #getSourceX()
     * @see #setSourceX(int)
     * @generated
     */
    boolean isSetSourceX();

    /**
     * Returns the value of the '<em><b>Source Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Y</em>' attribute.
     * @see #isSetSourceY()
     * @see #unsetSourceY()
     * @see #setSourceY(int)
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getBendpoint_SourceY()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='sourceY'"
     * @generated
     */
    int getSourceY();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceY <em>Source Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Y</em>' attribute.
     * @see #isSetSourceY()
     * @see #unsetSourceY()
     * @see #getSourceY()
     * @generated
     */
    void setSourceY(int value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceY <em>Source Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSourceY()
     * @see #getSourceY()
     * @see #setSourceY(int)
     * @generated
     */
    void unsetSourceY();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceY <em>Source Y</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Source Y</em>' attribute is set.
     * @see #unsetSourceY()
     * @see #getSourceY()
     * @see #setSourceY(int)
     * @generated
     */
    boolean isSetSourceY();

    /**
     * Returns the value of the '<em><b>Target X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target X</em>' attribute.
     * @see #isSetTargetX()
     * @see #unsetTargetX()
     * @see #setTargetX(int)
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getBendpoint_TargetX()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='targetX'"
     * @generated
     */
    int getTargetX();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetX <em>Target X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target X</em>' attribute.
     * @see #isSetTargetX()
     * @see #unsetTargetX()
     * @see #getTargetX()
     * @generated
     */
    void setTargetX(int value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetX <em>Target X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetX()
     * @see #getTargetX()
     * @see #setTargetX(int)
     * @generated
     */
    void unsetTargetX();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetX <em>Target X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target X</em>' attribute is set.
     * @see #unsetTargetX()
     * @see #getTargetX()
     * @see #setTargetX(int)
     * @generated
     */
    boolean isSetTargetX();

    /**
     * Returns the value of the '<em><b>Target Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Y</em>' attribute.
     * @see #isSetTargetY()
     * @see #unsetTargetY()
     * @see #setTargetY(int)
     * @see org.eclipse.mdt.bpmn.di.DIPackage#getBendpoint_TargetY()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='targetY'"
     * @generated
     */
    int getTargetY();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetY <em>Target Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Y</em>' attribute.
     * @see #isSetTargetY()
     * @see #unsetTargetY()
     * @see #getTargetY()
     * @generated
     */
    void setTargetY(int value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetY <em>Target Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetY()
     * @see #getTargetY()
     * @see #setTargetY(int)
     * @generated
     */
    void unsetTargetY();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetY <em>Target Y</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Y</em>' attribute is set.
     * @see #unsetTargetY()
     * @see #getTargetY()
     * @see #setTargetY(int)
     * @generated
     */
    boolean isSetTargetY();

} // Bendpoint
