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

import java.util.Map;
import org.eclipse.bpmn.di.Bendpoint;
import org.eclipse.bpmn.di.Connector;
import org.eclipse.bpmn.di.DIPackage;
import org.eclipse.bpmn.di.Diagram;
import org.eclipse.bpmn.di.DocumentRoot;
import org.eclipse.bpmn.di.Node;
import org.eclipse.bpmn.di.Style;
import org.eclipse.bpmn.di.View;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn.di.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.DocumentRootImpl#getBendpoint <em>Bendpoint</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.DocumentRootImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.DocumentRootImpl#getView <em>View</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.DocumentRootImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.bpmn.di.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DIPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, DIPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
                    DIPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap.map();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
                    DIPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation.map();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bendpoint getBendpoint() {
        return (Bendpoint) getMixed().get(DIPackage.Literals.DOCUMENT_ROOT__BENDPOINT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBendpoint(Bendpoint newBendpoint, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(DIPackage.Literals.DOCUMENT_ROOT__BENDPOINT, newBendpoint, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBendpoint(Bendpoint newBendpoint) {
        ((FeatureMap.Internal) getMixed()).set(DIPackage.Literals.DOCUMENT_ROOT__BENDPOINT, newBendpoint);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connector getConnector() {
        return (Connector) getMixed().get(DIPackage.Literals.DOCUMENT_ROOT__CONNECTOR, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(DIPackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnector(Connector newConnector) {
        ((FeatureMap.Internal) getMixed()).set(DIPackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public View getView() {
        return (View) getMixed().get(DIPackage.Literals.DOCUMENT_ROOT__VIEW, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetView(View newView, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(DIPackage.Literals.DOCUMENT_ROOT__VIEW, newView, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setView(View newView) {
        ((FeatureMap.Internal) getMixed()).set(DIPackage.Literals.DOCUMENT_ROOT__VIEW, newView);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram getDiagram() {
        return (Diagram) getMixed().get(DIPackage.Literals.DOCUMENT_ROOT__DIAGRAM, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(DIPackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagram(Diagram newDiagram) {
        ((FeatureMap.Internal) getMixed()).set(DIPackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node getNode() {
        return (Node) getMixed().get(DIPackage.Literals.DOCUMENT_ROOT__NODE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(DIPackage.Literals.DOCUMENT_ROOT__NODE, newNode, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode(Node newNode) {
        ((FeatureMap.Internal) getMixed()).set(DIPackage.Literals.DOCUMENT_ROOT__NODE, newNode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style getStyle() {
        return (Style) getMixed().get(DIPackage.Literals.DOCUMENT_ROOT__STYLE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStyle(Style newStyle, NotificationChain msgs) {
        return ((FeatureMap.Internal) getMixed()).basicAdd(DIPackage.Literals.DOCUMENT_ROOT__STYLE, newStyle, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyle(Style newStyle) {
        ((FeatureMap.Internal) getMixed()).set(DIPackage.Literals.DOCUMENT_ROOT__STYLE, newStyle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DIPackage.DOCUMENT_ROOT__MIXED:
            return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
        case DIPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return ((InternalEList<?>) ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap()).basicRemove(otherEnd, msgs);
        case DIPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return ((InternalEList<?>) ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap()).basicRemove(otherEnd, msgs);
        case DIPackage.DOCUMENT_ROOT__BENDPOINT:
            return basicSetBendpoint(null, msgs);
        case DIPackage.DOCUMENT_ROOT__CONNECTOR:
            return basicSetConnector(null, msgs);
        case DIPackage.DOCUMENT_ROOT__VIEW:
            return basicSetView(null, msgs);
        case DIPackage.DOCUMENT_ROOT__DIAGRAM:
            return basicSetDiagram(null, msgs);
        case DIPackage.DOCUMENT_ROOT__NODE:
            return basicSetNode(null, msgs);
        case DIPackage.DOCUMENT_ROOT__STYLE:
            return basicSetStyle(null, msgs);
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
        case DIPackage.DOCUMENT_ROOT__MIXED:
            if (coreType)
                return getMixed();
            return ((FeatureMap.Internal) getMixed()).getWrapper();
        case DIPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            if (coreType)
                return ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap();
            else
                return getXMLNSPrefixMap();
        case DIPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            if (coreType)
                return ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap();
            else
                return getXSISchemaLocation();
        case DIPackage.DOCUMENT_ROOT__BENDPOINT:
            return getBendpoint();
        case DIPackage.DOCUMENT_ROOT__CONNECTOR:
            return getConnector();
        case DIPackage.DOCUMENT_ROOT__VIEW:
            return getView();
        case DIPackage.DOCUMENT_ROOT__DIAGRAM:
            return getDiagram();
        case DIPackage.DOCUMENT_ROOT__NODE:
            return getNode();
        case DIPackage.DOCUMENT_ROOT__STYLE:
            return getStyle();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DIPackage.DOCUMENT_ROOT__MIXED:
            ((FeatureMap.Internal) getMixed()).set(newValue);
            return;
        case DIPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            ((EStructuralFeature.Setting) ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap()).set(newValue);
            return;
        case DIPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            ((EStructuralFeature.Setting) ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap()).set(newValue);
            return;
        case DIPackage.DOCUMENT_ROOT__BENDPOINT:
            setBendpoint((Bendpoint) newValue);
            return;
        case DIPackage.DOCUMENT_ROOT__CONNECTOR:
            setConnector((Connector) newValue);
            return;
        case DIPackage.DOCUMENT_ROOT__VIEW:
            setView((View) newValue);
            return;
        case DIPackage.DOCUMENT_ROOT__DIAGRAM:
            setDiagram((Diagram) newValue);
            return;
        case DIPackage.DOCUMENT_ROOT__NODE:
            setNode((Node) newValue);
            return;
        case DIPackage.DOCUMENT_ROOT__STYLE:
            setStyle((Style) newValue);
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
        case DIPackage.DOCUMENT_ROOT__MIXED:
            getMixed().clear();
            return;
        case DIPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            getXMLNSPrefixMap().clear();
            return;
        case DIPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            getXSISchemaLocation().clear();
            return;
        case DIPackage.DOCUMENT_ROOT__BENDPOINT:
            setBendpoint((Bendpoint) null);
            return;
        case DIPackage.DOCUMENT_ROOT__CONNECTOR:
            setConnector((Connector) null);
            return;
        case DIPackage.DOCUMENT_ROOT__VIEW:
            setView((View) null);
            return;
        case DIPackage.DOCUMENT_ROOT__DIAGRAM:
            setDiagram((Diagram) null);
            return;
        case DIPackage.DOCUMENT_ROOT__NODE:
            setNode((Node) null);
            return;
        case DIPackage.DOCUMENT_ROOT__STYLE:
            setStyle((Style) null);
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
        case DIPackage.DOCUMENT_ROOT__MIXED:
            return mixed != null && !mixed.isEmpty();
        case DIPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
            return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
        case DIPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
            return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
        case DIPackage.DOCUMENT_ROOT__BENDPOINT:
            return getBendpoint() != null;
        case DIPackage.DOCUMENT_ROOT__CONNECTOR:
            return getConnector() != null;
        case DIPackage.DOCUMENT_ROOT__VIEW:
            return getView() != null;
        case DIPackage.DOCUMENT_ROOT__DIAGRAM:
            return getDiagram() != null;
        case DIPackage.DOCUMENT_ROOT__NODE:
            return getNode() != null;
        case DIPackage.DOCUMENT_ROOT__STYLE:
            return getStyle() != null;
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
        result.append(" (mixed: "); //$NON-NLS-1$
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
