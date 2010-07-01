/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.bpmn2.bpmn2di.impl;

import org.eclipse.bpmn2.bpmn2di.BPMNDiagram;
import org.eclipse.bpmn2.bpmn2di.BPMNEdge;
import org.eclipse.bpmn2.bpmn2di.BPMNLabel;
import org.eclipse.bpmn2.bpmn2di.BPMNLabelStyle;
import org.eclipse.bpmn2.bpmn2di.BPMNPlane;
import org.eclipse.bpmn2.bpmn2di.BPMNShape;
import org.eclipse.bpmn2.bpmn2di.Bpmn2DiPackage;
import org.eclipse.bpmn2.bpmn2di.DocumentRoot;

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
 *   <li>{@link org.eclipse.bpmn2.bpmn2di.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmn2di.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmn2di.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmn2di.impl.DocumentRootImpl#getBPMNDiagram <em>BPMN Diagram</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmn2di.impl.DocumentRootImpl#getBPMNEdge <em>BPMN Edge</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmn2di.impl.DocumentRootImpl#getBPMNLabel <em>BPMN Label</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmn2di.impl.DocumentRootImpl#getBPMNLabelStyle <em>BPMN Label Style</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmn2di.impl.DocumentRootImpl#getBPMNPlane <em>BPMN Plane</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.bpmn2di.impl.DocumentRootImpl#getBPMNShape <em>BPMN Shape</em>}</li>
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
		return Bpmn2DiPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Bpmn2DiPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Bpmn2DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Bpmn2DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNDiagram getBPMNDiagram() {
		return (BPMNDiagram)getMixed().get(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNDiagram(BPMNDiagram newBPMNDiagram, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_DIAGRAM, newBPMNDiagram, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPMNDiagram(BPMNDiagram newBPMNDiagram) {
		((FeatureMap.Internal)getMixed()).set(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_DIAGRAM, newBPMNDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEdge getBPMNEdge() {
		return (BPMNEdge)getMixed().get(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_EDGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNEdge(BPMNEdge newBPMNEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_EDGE, newBPMNEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPMNEdge(BPMNEdge newBPMNEdge) {
		((FeatureMap.Internal)getMixed()).set(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_EDGE, newBPMNEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabel getBPMNLabel() {
		return (BPMNLabel)getMixed().get(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNLabel(BPMNLabel newBPMNLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL, newBPMNLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPMNLabel(BPMNLabel newBPMNLabel) {
		((FeatureMap.Internal)getMixed()).set(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL, newBPMNLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabelStyle getBPMNLabelStyle() {
		return (BPMNLabelStyle)getMixed().get(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNLabelStyle(BPMNLabelStyle newBPMNLabelStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL_STYLE, newBPMNLabelStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPMNLabelStyle(BPMNLabelStyle newBPMNLabelStyle) {
		((FeatureMap.Internal)getMixed()).set(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_LABEL_STYLE, newBPMNLabelStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNPlane getBPMNPlane() {
		return (BPMNPlane)getMixed().get(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_PLANE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNPlane(BPMNPlane newBPMNPlane, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_PLANE, newBPMNPlane, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPMNPlane(BPMNPlane newBPMNPlane) {
		((FeatureMap.Internal)getMixed()).set(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_PLANE, newBPMNPlane);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNShape getBPMNShape() {
		return (BPMNShape)getMixed().get(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPMNShape(BPMNShape newBPMNShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_SHAPE, newBPMNShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPMNShape(BPMNShape newBPMNShape) {
		((FeatureMap.Internal)getMixed()).set(Bpmn2DiPackage.Literals.DOCUMENT_ROOT__BPMN_SHAPE, newBPMNShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpmn2DiPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Bpmn2DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Bpmn2DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_DIAGRAM:
				return basicSetBPMNDiagram(null, msgs);
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_EDGE:
				return basicSetBPMNEdge(null, msgs);
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL:
				return basicSetBPMNLabel(null, msgs);
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL_STYLE:
				return basicSetBPMNLabelStyle(null, msgs);
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_PLANE:
				return basicSetBPMNPlane(null, msgs);
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_SHAPE:
				return basicSetBPMNShape(null, msgs);
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
			case Bpmn2DiPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Bpmn2DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Bpmn2DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_DIAGRAM:
				return getBPMNDiagram();
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_EDGE:
				return getBPMNEdge();
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL:
				return getBPMNLabel();
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL_STYLE:
				return getBPMNLabelStyle();
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_PLANE:
				return getBPMNPlane();
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_SHAPE:
				return getBPMNShape();
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
			case Bpmn2DiPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_DIAGRAM:
				setBPMNDiagram((BPMNDiagram)newValue);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_EDGE:
				setBPMNEdge((BPMNEdge)newValue);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL:
				setBPMNLabel((BPMNLabel)newValue);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL_STYLE:
				setBPMNLabelStyle((BPMNLabelStyle)newValue);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_PLANE:
				setBPMNPlane((BPMNPlane)newValue);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_SHAPE:
				setBPMNShape((BPMNShape)newValue);
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
			case Bpmn2DiPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_DIAGRAM:
				setBPMNDiagram((BPMNDiagram)null);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_EDGE:
				setBPMNEdge((BPMNEdge)null);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL:
				setBPMNLabel((BPMNLabel)null);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL_STYLE:
				setBPMNLabelStyle((BPMNLabelStyle)null);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_PLANE:
				setBPMNPlane((BPMNPlane)null);
				return;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_SHAPE:
				setBPMNShape((BPMNShape)null);
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
			case Bpmn2DiPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Bpmn2DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Bpmn2DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_DIAGRAM:
				return getBPMNDiagram() != null;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_EDGE:
				return getBPMNEdge() != null;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL:
				return getBPMNLabel() != null;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_LABEL_STYLE:
				return getBPMNLabelStyle() != null;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_PLANE:
				return getBPMNPlane() != null;
			case Bpmn2DiPackage.DOCUMENT_ROOT__BPMN_SHAPE:
				return getBPMNShape() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
