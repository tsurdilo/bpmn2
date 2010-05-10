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
package org.eclipse.bpmn.di.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.bpmn.di.DIPackage;
import org.eclipse.bpmn.di.Node;
import org.eclipse.bpmn.di.Style;
import org.eclipse.bpmn.di.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.di.impl.ViewImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.ViewImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.ViewImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.ViewImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.ViewImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.ViewImpl#getSourceConnector <em>Source Connector</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.ViewImpl#getTargetConnector <em>Target Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ViewImpl extends EObjectImpl implements View {
    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected EList<Style> style;

    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected EList<Node> child;

    /**
     * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected String context = CONTEXT_EDEFAULT;

    /**
     * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinition()
     * @generated
     * @ordered
     */
    protected static final List<QName> DEFINITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefinition()
     * @generated
     * @ordered
     */
    protected List<QName> definition = DEFINITION_EDEFAULT;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getSourceConnector() <em>Source Connector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceConnector()
     * @generated
     * @ordered
     */
    protected static final List<String> SOURCE_CONNECTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceConnector() <em>Source Connector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceConnector()
     * @generated
     * @ordered
     */
    protected List<String> sourceConnector = SOURCE_CONNECTOR_EDEFAULT;

    /**
     * The default value of the '{@link #getTargetConnector() <em>Target Connector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetConnector()
     * @generated
     * @ordered
     */
    protected static final List<String> TARGET_CONNECTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetConnector() <em>Target Connector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetConnector()
     * @generated
     * @ordered
     */
    protected List<String> targetConnector = TARGET_CONNECTOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ViewImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DIPackage.Literals.VIEW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Style> getStyle() {
        if (style == null) {
            style = new EObjectContainmentEList<Style>(Style.class, this,
                    DIPackage.VIEW__STYLE);
        }
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Node> getChild() {
        if (child == null) {
            child = new EObjectContainmentEList<Node>(Node.class, this,
                    DIPackage.VIEW__CHILD);
        }
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContext() {
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContext(String newContext) {
        String oldContext = context;
        context = newContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DIPackage.VIEW__CONTEXT, oldContext, context));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<QName> getDefinition() {
        return definition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefinition(List<QName> newDefinition) {
        List<QName> oldDefinition = definition;
        definition = newDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DIPackage.VIEW__DEFINITION, oldDefinition, definition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DIPackage.VIEW__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getSourceConnector() {
        return sourceConnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceConnector(List<String> newSourceConnector) {
        List<String> oldSourceConnector = sourceConnector;
        sourceConnector = newSourceConnector;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DIPackage.VIEW__SOURCE_CONNECTOR, oldSourceConnector,
                    sourceConnector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> getTargetConnector() {
        return targetConnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetConnector(List<String> newTargetConnector) {
        List<String> oldTargetConnector = targetConnector;
        targetConnector = newTargetConnector;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DIPackage.VIEW__TARGET_CONNECTOR, oldTargetConnector,
                    targetConnector));
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
        case DIPackage.VIEW__STYLE:
            return ((InternalEList<?>) getStyle()).basicRemove(otherEnd, msgs);
        case DIPackage.VIEW__CHILD:
            return ((InternalEList<?>) getChild()).basicRemove(otherEnd, msgs);
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
        case DIPackage.VIEW__STYLE:
            return getStyle();
        case DIPackage.VIEW__CHILD:
            return getChild();
        case DIPackage.VIEW__CONTEXT:
            return getContext();
        case DIPackage.VIEW__DEFINITION:
            return getDefinition();
        case DIPackage.VIEW__ID:
            return getId();
        case DIPackage.VIEW__SOURCE_CONNECTOR:
            return getSourceConnector();
        case DIPackage.VIEW__TARGET_CONNECTOR:
            return getTargetConnector();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DIPackage.VIEW__STYLE:
            getStyle().clear();
            getStyle().addAll((Collection<? extends Style>) newValue);
            return;
        case DIPackage.VIEW__CHILD:
            getChild().clear();
            getChild().addAll((Collection<? extends Node>) newValue);
            return;
        case DIPackage.VIEW__CONTEXT:
            setContext((String) newValue);
            return;
        case DIPackage.VIEW__DEFINITION:
            setDefinition((List<QName>) newValue);
            return;
        case DIPackage.VIEW__ID:
            setId((String) newValue);
            return;
        case DIPackage.VIEW__SOURCE_CONNECTOR:
            setSourceConnector((List<String>) newValue);
            return;
        case DIPackage.VIEW__TARGET_CONNECTOR:
            setTargetConnector((List<String>) newValue);
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
        case DIPackage.VIEW__STYLE:
            getStyle().clear();
            return;
        case DIPackage.VIEW__CHILD:
            getChild().clear();
            return;
        case DIPackage.VIEW__CONTEXT:
            setContext(CONTEXT_EDEFAULT);
            return;
        case DIPackage.VIEW__DEFINITION:
            setDefinition(DEFINITION_EDEFAULT);
            return;
        case DIPackage.VIEW__ID:
            setId(ID_EDEFAULT);
            return;
        case DIPackage.VIEW__SOURCE_CONNECTOR:
            setSourceConnector(SOURCE_CONNECTOR_EDEFAULT);
            return;
        case DIPackage.VIEW__TARGET_CONNECTOR:
            setTargetConnector(TARGET_CONNECTOR_EDEFAULT);
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
        case DIPackage.VIEW__STYLE:
            return style != null && !style.isEmpty();
        case DIPackage.VIEW__CHILD:
            return child != null && !child.isEmpty();
        case DIPackage.VIEW__CONTEXT:
            return CONTEXT_EDEFAULT == null ? context != null
                    : !CONTEXT_EDEFAULT.equals(context);
        case DIPackage.VIEW__DEFINITION:
            return DEFINITION_EDEFAULT == null ? definition != null
                    : !DEFINITION_EDEFAULT.equals(definition);
        case DIPackage.VIEW__ID:
            return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
        case DIPackage.VIEW__SOURCE_CONNECTOR:
            return SOURCE_CONNECTOR_EDEFAULT == null ? sourceConnector != null
                    : !SOURCE_CONNECTOR_EDEFAULT.equals(sourceConnector);
        case DIPackage.VIEW__TARGET_CONNECTOR:
            return TARGET_CONNECTOR_EDEFAULT == null ? targetConnector != null
                    : !TARGET_CONNECTOR_EDEFAULT.equals(targetConnector);
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
        result.append(" (context: "); //$NON-NLS-1$
        result.append(context);
        result.append(", definition: "); //$NON-NLS-1$
        result.append(definition);
        result.append(", id: "); //$NON-NLS-1$
        result.append(id);
        result.append(", sourceConnector: "); //$NON-NLS-1$
        result.append(sourceConnector);
        result.append(", targetConnector: "); //$NON-NLS-1$
        result.append(targetConnector);
        result.append(')');
        return result.toString();
    }

} //ViewImpl
