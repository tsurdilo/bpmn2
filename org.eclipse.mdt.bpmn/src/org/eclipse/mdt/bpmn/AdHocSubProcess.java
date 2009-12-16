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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ad Hoc Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.AdHocSubProcess#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mdt.bpmn.bpmnPackage#getAdHocSubProcess()
 * @model extendedMetaData="name='tAdHocSubProcess' kind='elementOnly'"
 * @generated
 */
public interface AdHocSubProcess extends SubProcess {
    /**
     * Returns the value of the '<em><b>Completion Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Completion Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Completion Condition</em>' containment reference.
     * @see #setCompletionCondition(Expression)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getAdHocSubProcess_CompletionCondition()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='completionCondition' namespace='##targetNamespace'"
     * @generated
     */
    Expression getCompletionCondition();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Completion Condition</em>' containment reference.
     * @see #getCompletionCondition()
     * @generated
     */
    void setCompletionCondition(Expression value);

    /**
     * Returns the value of the '<em><b>Cancel Remaining Instances</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cancel Remaining Instances</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cancel Remaining Instances</em>' attribute.
     * @see #isSetCancelRemainingInstances()
     * @see #unsetCancelRemainingInstances()
     * @see #setCancelRemainingInstances(boolean)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getAdHocSubProcess_CancelRemainingInstances()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='cancelRemainingInstances'"
     * @generated
     */
    boolean isCancelRemainingInstances();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancel Remaining Instances</em>' attribute.
     * @see #isSetCancelRemainingInstances()
     * @see #unsetCancelRemainingInstances()
     * @see #isCancelRemainingInstances()
     * @generated
     */
    void setCancelRemainingInstances(boolean value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCancelRemainingInstances()
     * @see #isCancelRemainingInstances()
     * @see #setCancelRemainingInstances(boolean)
     * @generated
     */
    void unsetCancelRemainingInstances();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cancel Remaining Instances</em>' attribute is set.
     * @see #unsetCancelRemainingInstances()
     * @see #isCancelRemainingInstances()
     * @see #setCancelRemainingInstances(boolean)
     * @generated
     */
    boolean isSetCancelRemainingInstances();

    /**
     * Returns the value of the '<em><b>Ordering</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipse.mdt.bpmn.AdHocOrdering}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ordering</em>' attribute.
     * @see org.eclipse.mdt.bpmn.AdHocOrdering
     * @see #isSetOrdering()
     * @see #unsetOrdering()
     * @see #setOrdering(AdHocOrdering)
     * @see org.eclipse.mdt.bpmn.bpmnPackage#getAdHocSubProcess_Ordering()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='ordering'"
     * @generated
     */
    AdHocOrdering getOrdering();

    /**
     * Sets the value of the '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#getOrdering <em>Ordering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ordering</em>' attribute.
     * @see org.eclipse.mdt.bpmn.AdHocOrdering
     * @see #isSetOrdering()
     * @see #unsetOrdering()
     * @see #getOrdering()
     * @generated
     */
    void setOrdering(AdHocOrdering value);

    /**
     * Unsets the value of the '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#getOrdering <em>Ordering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOrdering()
     * @see #getOrdering()
     * @see #setOrdering(AdHocOrdering)
     * @generated
     */
    void unsetOrdering();

    /**
     * Returns whether the value of the '{@link org.eclipse.mdt.bpmn.AdHocSubProcess#getOrdering <em>Ordering</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ordering</em>' attribute is set.
     * @see #unsetOrdering()
     * @see #getOrdering()
     * @see #setOrdering(AdHocOrdering)
     * @generated
     */
    boolean isSetOrdering();

} // AdHocSubProcess
