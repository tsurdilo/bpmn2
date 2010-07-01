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
package org.eclipse.dc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.dc.DcFactory
 * @model kind="package"
 * @generated
 */
public interface DcPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "dc";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/DD/20100524/DC-XMI";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dc";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DcPackage eINSTANCE = org.eclipse.dc.impl.DcPackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipse.dc.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dc.impl.DocumentRootImpl
     * @see org.eclipse.dc.impl.DcPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BOUNDS = 3;

    /**
     * The feature id for the '<em><b>Font</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FONT = 4;

    /**
     * The feature id for the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__POINT = 5;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.eclipse.dc.impl.BoundsImpl <em>Bounds</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dc.impl.BoundsImpl
     * @see org.eclipse.dc.impl.DcPackageImpl#getBounds()
     * @generated
     */
    int BOUNDS = 1;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__HEIGHT = 0;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__WIDTH = 1;

    /**
     * The feature id for the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__X = 2;

    /**
     * The feature id for the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS__Y = 3;

    /**
     * The number of structural features of the '<em>Bounds</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.eclipse.dc.impl.FontImpl <em>Font</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dc.impl.FontImpl
     * @see org.eclipse.dc.impl.DcPackageImpl#getFont()
     * @generated
     */
    int FONT = 2;

    /**
     * The feature id for the '<em><b>Is Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__IS_BOLD = 0;

    /**
     * The feature id for the '<em><b>Is Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__IS_ITALIC = 1;

    /**
     * The feature id for the '<em><b>Is Strike Through</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__IS_STRIKE_THROUGH = 2;

    /**
     * The feature id for the '<em><b>Is Underline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__IS_UNDERLINE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__NAME = 4;

    /**
     * The feature id for the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT__SIZE = 5;

    /**
     * The number of structural features of the '<em>Font</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FONT_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.eclipse.dc.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dc.impl.PointImpl
     * @see org.eclipse.dc.impl.DcPackageImpl#getPoint()
     * @generated
     */
    int POINT = 3;

    /**
     * The feature id for the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT__X = 0;

    /**
     * The feature id for the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT__Y = 1;

    /**
     * The number of structural features of the '<em>Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_FEATURE_COUNT = 2;

    /**
     * Returns the meta object for class '{@link org.eclipse.dc.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.eclipse.dc.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.dc.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.dc.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.eclipse.dc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.eclipse.dc.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.eclipse.dc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.eclipse.dc.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.dc.DocumentRoot#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see org.eclipse.dc.DocumentRoot#getBounds()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Bounds();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.dc.DocumentRoot#getFont <em>Font</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Font</em>'.
     * @see org.eclipse.dc.DocumentRoot#getFont()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Font();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.dc.DocumentRoot#getPoint <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Point</em>'.
     * @see org.eclipse.dc.DocumentRoot#getPoint()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Point();

    /**
     * Returns the meta object for class '{@link org.eclipse.dc.Bounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bounds</em>'.
     * @see org.eclipse.dc.Bounds
     * @generated
     */
    EClass getBounds();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Bounds#getHeight <em>Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Height</em>'.
     * @see org.eclipse.dc.Bounds#getHeight()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Height();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Bounds#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Width</em>'.
     * @see org.eclipse.dc.Bounds#getWidth()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Width();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Bounds#getX <em>X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X</em>'.
     * @see org.eclipse.dc.Bounds#getX()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_X();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Bounds#getY <em>Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y</em>'.
     * @see org.eclipse.dc.Bounds#getY()
     * @see #getBounds()
     * @generated
     */
    EAttribute getBounds_Y();

    /**
     * Returns the meta object for class '{@link org.eclipse.dc.Font <em>Font</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Font</em>'.
     * @see org.eclipse.dc.Font
     * @generated
     */
    EClass getFont();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Font#isIsBold <em>Is Bold</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Bold</em>'.
     * @see org.eclipse.dc.Font#isIsBold()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_IsBold();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Font#isIsItalic <em>Is Italic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Italic</em>'.
     * @see org.eclipse.dc.Font#isIsItalic()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_IsItalic();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Font#isIsStrikeThrough <em>Is Strike Through</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Strike Through</em>'.
     * @see org.eclipse.dc.Font#isIsStrikeThrough()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_IsStrikeThrough();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Font#isIsUnderline <em>Is Underline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Underline</em>'.
     * @see org.eclipse.dc.Font#isIsUnderline()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_IsUnderline();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Font#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.dc.Font#getName()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Font#getSize <em>Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size</em>'.
     * @see org.eclipse.dc.Font#getSize()
     * @see #getFont()
     * @generated
     */
    EAttribute getFont_Size();

    /**
     * Returns the meta object for class '{@link org.eclipse.dc.Point <em>Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Point</em>'.
     * @see org.eclipse.dc.Point
     * @generated
     */
    EClass getPoint();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Point#getX <em>X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X</em>'.
     * @see org.eclipse.dc.Point#getX()
     * @see #getPoint()
     * @generated
     */
    EAttribute getPoint_X();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dc.Point#getY <em>Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y</em>'.
     * @see org.eclipse.dc.Point#getY()
     * @see #getPoint()
     * @generated
     */
    EAttribute getPoint_Y();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DcFactory getDcFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.eclipse.dc.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dc.impl.DocumentRootImpl
         * @see org.eclipse.dc.impl.DcPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BOUNDS = eINSTANCE.getDocumentRoot_Bounds();

        /**
         * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FONT = eINSTANCE.getDocumentRoot_Font();

        /**
         * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__POINT = eINSTANCE.getDocumentRoot_Point();

        /**
         * The meta object literal for the '{@link org.eclipse.dc.impl.BoundsImpl <em>Bounds</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dc.impl.BoundsImpl
         * @see org.eclipse.dc.impl.DcPackageImpl#getBounds()
         * @generated
         */
        EClass BOUNDS = eINSTANCE.getBounds();

        /**
         * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

        /**
         * The meta object literal for the '<em><b>X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

        /**
         * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

        /**
         * The meta object literal for the '{@link org.eclipse.dc.impl.FontImpl <em>Font</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dc.impl.FontImpl
         * @see org.eclipse.dc.impl.DcPackageImpl#getFont()
         * @generated
         */
        EClass FONT = eINSTANCE.getFont();

        /**
         * The meta object literal for the '<em><b>Is Bold</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__IS_BOLD = eINSTANCE.getFont_IsBold();

        /**
         * The meta object literal for the '<em><b>Is Italic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__IS_ITALIC = eINSTANCE.getFont_IsItalic();

        /**
         * The meta object literal for the '<em><b>Is Strike Through</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__IS_STRIKE_THROUGH = eINSTANCE.getFont_IsStrikeThrough();

        /**
         * The meta object literal for the '<em><b>Is Underline</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__IS_UNDERLINE = eINSTANCE.getFont_IsUnderline();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__NAME = eINSTANCE.getFont_Name();

        /**
         * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FONT__SIZE = eINSTANCE.getFont_Size();

        /**
         * The meta object literal for the '{@link org.eclipse.dc.impl.PointImpl <em>Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dc.impl.PointImpl
         * @see org.eclipse.dc.impl.DcPackageImpl#getPoint()
         * @generated
         */
        EClass POINT = eINSTANCE.getPoint();

        /**
         * The meta object literal for the '<em><b>X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POINT__X = eINSTANCE.getPoint_X();

        /**
         * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POINT__Y = eINSTANCE.getPoint_Y();

    }

} //DcPackage
