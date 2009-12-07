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
package org.eclipse.mdt.bpmn2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.Definitions;
import org.eclipse.mdt.bpmn2.Extension;
import org.eclipse.mdt.bpmn2.Import;
import org.eclipse.mdt.bpmn2.Relationship;
import org.eclipse.mdt.bpmn2.RootElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DefinitionsImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DefinitionsImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DefinitionsImpl#getRootElementGroup <em>Root Element Group</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DefinitionsImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DefinitionsImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DefinitionsImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.DefinitionsImpl#getTypeLanguage <em>Type Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends BaseElementImpl implements Definitions {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImport()
     * @generated
     * @ordered
     */
    protected EList<Import> import_;

    /**
     * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtension()
     * @generated
     * @ordered
     */
    protected EList<Extension> extension;

    /**
     * The cached value of the '{@link #getRootElementGroup() <em>Root Element Group</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootElementGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap rootElementGroup;

    /**
     * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationship()
     * @generated
     * @ordered
     */
    protected EList<Relationship> relationship;

    /**
     * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionLanguage()
     * @generated
     * @ordered
     */
    protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "http://www.w3.org/1999/XPath";

    /**
     * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressionLanguage()
     * @generated
     * @ordered
     */
    protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

    /**
     * This is true if the Expression Language attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean expressionLanguageESet;

    /**
     * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected static final String TARGET_NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeLanguage()
     * @generated
     * @ordered
     */
    protected static final String TYPE_LANGUAGE_EDEFAULT = "http://www.w3.org/2001/XMLSchema";

    /**
     * The cached value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeLanguage()
     * @generated
     * @ordered
     */
    protected String typeLanguage = TYPE_LANGUAGE_EDEFAULT;

    /**
     * This is true if the Type Language attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeLanguageESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefinitionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getDefinitions();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Import> getImport() {
        if (import_ == null) {
            import_ = new EObjectContainmentEList<Import>(Import.class, this,
                    Bpmn2Package.DEFINITIONS__IMPORT);
        }
        return import_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Extension> getExtension() {
        if (extension == null) {
            extension = new EObjectContainmentEList<Extension>(Extension.class,
                    this, Bpmn2Package.DEFINITIONS__EXTENSION);
        }
        return extension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getRootElementGroup() {
        if (rootElementGroup == null) {
            rootElementGroup = new BasicFeatureMap(this,
                    Bpmn2Package.DEFINITIONS__ROOT_ELEMENT_GROUP);
        }
        return rootElementGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RootElement> getRootElement() {
        return getRootElementGroup().list(
                Bpmn2Package.eINSTANCE.getDefinitions_RootElement());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Relationship> getRelationship() {
        if (relationship == null) {
            relationship = new EObjectContainmentEList<Relationship>(
                    Relationship.class, this,
                    Bpmn2Package.DEFINITIONS__RELATIONSHIP);
        }
        return relationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpressionLanguage(String newExpressionLanguage) {
        String oldExpressionLanguage = expressionLanguage;
        expressionLanguage = newExpressionLanguage;
        boolean oldExpressionLanguageESet = expressionLanguageESet;
        expressionLanguageESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE,
                    oldExpressionLanguage, expressionLanguage,
                    !oldExpressionLanguageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExpressionLanguage() {
        String oldExpressionLanguage = expressionLanguage;
        boolean oldExpressionLanguageESet = expressionLanguageESet;
        expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;
        expressionLanguageESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE,
                    oldExpressionLanguage, EXPRESSION_LANGUAGE_EDEFAULT,
                    oldExpressionLanguageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExpressionLanguage() {
        return expressionLanguageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetNamespace(String newTargetNamespace) {
        String oldTargetNamespace = targetNamespace;
        targetNamespace = newTargetNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE,
                    oldTargetNamespace, targetNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTypeLanguage() {
        return typeLanguage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypeLanguage(String newTypeLanguage) {
        String oldTypeLanguage = typeLanguage;
        typeLanguage = newTypeLanguage;
        boolean oldTypeLanguageESet = typeLanguageESet;
        typeLanguageESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE, oldTypeLanguage,
                    typeLanguage, !oldTypeLanguageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTypeLanguage() {
        String oldTypeLanguage = typeLanguage;
        boolean oldTypeLanguageESet = typeLanguageESet;
        typeLanguage = TYPE_LANGUAGE_EDEFAULT;
        typeLanguageESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE, oldTypeLanguage,
                    TYPE_LANGUAGE_EDEFAULT, oldTypeLanguageESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTypeLanguage() {
        return typeLanguageESet;
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
        case Bpmn2Package.DEFINITIONS__IMPORT:
            return ((InternalEList<?>) getImport()).basicRemove(otherEnd, msgs);
        case Bpmn2Package.DEFINITIONS__EXTENSION:
            return ((InternalEList<?>) getExtension()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT_GROUP:
            return ((InternalEList<?>) getRootElementGroup()).basicRemove(
                    otherEnd, msgs);
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT:
            return ((InternalEList<?>) getRootElement()).basicRemove(otherEnd,
                    msgs);
        case Bpmn2Package.DEFINITIONS__RELATIONSHIP:
            return ((InternalEList<?>) getRelationship()).basicRemove(otherEnd,
                    msgs);
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
        case Bpmn2Package.DEFINITIONS__IMPORT:
            return getImport();
        case Bpmn2Package.DEFINITIONS__EXTENSION:
            return getExtension();
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT_GROUP:
            if (coreType)
                return getRootElementGroup();
            return ((FeatureMap.Internal) getRootElementGroup()).getWrapper();
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT:
            return getRootElement();
        case Bpmn2Package.DEFINITIONS__RELATIONSHIP:
            return getRelationship();
        case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
            return getExpressionLanguage();
        case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
            return getTargetNamespace();
        case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
            return getTypeLanguage();
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
        case Bpmn2Package.DEFINITIONS__IMPORT:
            getImport().clear();
            getImport().addAll((Collection<? extends Import>) newValue);
            return;
        case Bpmn2Package.DEFINITIONS__EXTENSION:
            getExtension().clear();
            getExtension().addAll((Collection<? extends Extension>) newValue);
            return;
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT_GROUP:
            ((FeatureMap.Internal) getRootElementGroup()).set(newValue);
            return;
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT:
            getRootElement().clear();
            getRootElement().addAll(
                    (Collection<? extends RootElement>) newValue);
            return;
        case Bpmn2Package.DEFINITIONS__RELATIONSHIP:
            getRelationship().clear();
            getRelationship().addAll(
                    (Collection<? extends Relationship>) newValue);
            return;
        case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
            setExpressionLanguage((String) newValue);
            return;
        case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
            setTargetNamespace((String) newValue);
            return;
        case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
            setTypeLanguage((String) newValue);
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
        case Bpmn2Package.DEFINITIONS__IMPORT:
            getImport().clear();
            return;
        case Bpmn2Package.DEFINITIONS__EXTENSION:
            getExtension().clear();
            return;
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT_GROUP:
            getRootElementGroup().clear();
            return;
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT:
            getRootElement().clear();
            return;
        case Bpmn2Package.DEFINITIONS__RELATIONSHIP:
            getRelationship().clear();
            return;
        case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
            unsetExpressionLanguage();
            return;
        case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
            setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
            return;
        case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
            unsetTypeLanguage();
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
        case Bpmn2Package.DEFINITIONS__IMPORT:
            return import_ != null && !import_.isEmpty();
        case Bpmn2Package.DEFINITIONS__EXTENSION:
            return extension != null && !extension.isEmpty();
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT_GROUP:
            return rootElementGroup != null && !rootElementGroup.isEmpty();
        case Bpmn2Package.DEFINITIONS__ROOT_ELEMENT:
            return !getRootElement().isEmpty();
        case Bpmn2Package.DEFINITIONS__RELATIONSHIP:
            return relationship != null && !relationship.isEmpty();
        case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
            return isSetExpressionLanguage();
        case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
            return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null
                    : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
        case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
            return isSetTypeLanguage();
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
        result.append(" (rootElementGroup: ");
        result.append(rootElementGroup);
        result.append(", expressionLanguage: ");
        if (expressionLanguageESet)
            result.append(expressionLanguage);
        else
            result.append("<unset>");
        result.append(", targetNamespace: ");
        result.append(targetNamespace);
        result.append(", typeLanguage: ");
        if (typeLanguageESet)
            result.append(typeLanguage);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DefinitionsImpl
