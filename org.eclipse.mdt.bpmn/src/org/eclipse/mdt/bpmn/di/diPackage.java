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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.mdt.bpmn.di.DIFactory
 * @model kind="package"
 * @generated
 */
public interface DIPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "di"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.com/di/1.0.0"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "di"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DIPackage eINSTANCE = org.eclipse.mdt.bpmn.di.impl.DIPackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.di.impl.BendpointImpl <em>Bendpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.di.impl.BendpointImpl
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getBendpoint()
     * @generated
     */
    int BENDPOINT = 0;

    /**
     * The feature id for the '<em><b>Source X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BENDPOINT__SOURCE_X = 0;

    /**
     * The feature id for the '<em><b>Source Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BENDPOINT__SOURCE_Y = 1;

    /**
     * The feature id for the '<em><b>Target X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BENDPOINT__TARGET_X = 2;

    /**
     * The feature id for the '<em><b>Target Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BENDPOINT__TARGET_Y = 3;

    /**
     * The number of structural features of the '<em>Bendpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BENDPOINT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.di.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.di.impl.ViewImpl
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getView()
     * @generated
     */
    int VIEW = 6;

    /**
     * The feature id for the '<em><b>Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__STYLE = 0;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__CHILD = 1;

    /**
     * The feature id for the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__CONTEXT = 2;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__DEFINITION = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__ID = 4;

    /**
     * The feature id for the '<em><b>Source Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__SOURCE_CONNECTOR = 5;

    /**
     * The feature id for the '<em><b>Target Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__TARGET_CONNECTOR = 6;

    /**
     * The number of structural features of the '<em>View</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.di.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.di.impl.ConnectorImpl
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getConnector()
     * @generated
     */
    int CONNECTOR = 1;

    /**
     * The feature id for the '<em><b>Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__STYLE = VIEW__STYLE;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__CHILD = VIEW__CHILD;

    /**
     * The feature id for the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__CONTEXT = VIEW__CONTEXT;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__DEFINITION = VIEW__DEFINITION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__ID = VIEW__ID;

    /**
     * The feature id for the '<em><b>Source Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__SOURCE_CONNECTOR = VIEW__SOURCE_CONNECTOR;

    /**
     * The feature id for the '<em><b>Target Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__TARGET_CONNECTOR = VIEW__TARGET_CONNECTOR;

    /**
     * The feature id for the '<em><b>Bendpoint</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__BENDPOINT = VIEW_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__SOURCE = VIEW_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__TARGET = VIEW_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.di.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.di.impl.DiagramImpl
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getDiagram()
     * @generated
     */
    int DIAGRAM = 2;

    /**
     * The feature id for the '<em><b>Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__STYLE = VIEW__STYLE;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__CHILD = VIEW__CHILD;

    /**
     * The feature id for the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__CONTEXT = VIEW__CONTEXT;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__DEFINITION = VIEW__DEFINITION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__ID = VIEW__ID;

    /**
     * The feature id for the '<em><b>Source Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__SOURCE_CONNECTOR = VIEW__SOURCE_CONNECTOR;

    /**
     * The feature id for the '<em><b>Target Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__TARGET_CONNECTOR = VIEW__TARGET_CONNECTOR;

    /**
     * The feature id for the '<em><b>Connector</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__CONNECTOR = VIEW_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.di.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.di.impl.DocumentRootImpl
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 3;

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
     * The feature id for the '<em><b>Bendpoint</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BENDPOINT = 3;

    /**
     * The feature id for the '<em><b>Connector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONNECTOR = 4;

    /**
     * The feature id for the '<em><b>View</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__VIEW = 5;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__DIAGRAM = 6;

    /**
     * The feature id for the '<em><b>Node</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NODE = 7;

    /**
     * The feature id for the '<em><b>Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__STYLE = 8;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 9;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.di.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.di.impl.NodeImpl
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getNode()
     * @generated
     */
    int NODE = 4;

    /**
     * The feature id for the '<em><b>Style</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__STYLE = VIEW__STYLE;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__CHILD = VIEW__CHILD;

    /**
     * The feature id for the '<em><b>Context</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__CONTEXT = VIEW__CONTEXT;

    /**
     * The feature id for the '<em><b>Definition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__DEFINITION = VIEW__DEFINITION;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__ID = VIEW__ID;

    /**
     * The feature id for the '<em><b>Source Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__SOURCE_CONNECTOR = VIEW__SOURCE_CONNECTOR;

    /**
     * The feature id for the '<em><b>Target Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__TARGET_CONNECTOR = VIEW__TARGET_CONNECTOR;

    /**
     * The number of structural features of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.mdt.bpmn.di.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.mdt.bpmn.di.impl.StyleImpl
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getStyle()
     * @generated
     */
    int STYLE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__VALUE = 1;

    /**
     * The number of structural features of the '<em>Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '<em>Definition Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getDefinitionType()
     * @generated
     */
    int DEFINITION_TYPE = 7;

    /**
     * The meta object id for the '<em>Source Connector Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getSourceConnectorType()
     * @generated
     */
    int SOURCE_CONNECTOR_TYPE = 8;

    /**
     * The meta object id for the '<em>Target Connector Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getTargetConnectorType()
     * @generated
     */
    int TARGET_CONNECTOR_TYPE = 9;

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.di.Bendpoint <em>Bendpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bendpoint</em>'.
     * @see org.eclipse.mdt.bpmn.di.Bendpoint
     * @generated
     */
    EClass getBendpoint();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceX <em>Source X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source X</em>'.
     * @see org.eclipse.mdt.bpmn.di.Bendpoint#getSourceX()
     * @see #getBendpoint()
     * @generated
     */
    EAttribute getBendpoint_SourceX();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getSourceY <em>Source Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Y</em>'.
     * @see org.eclipse.mdt.bpmn.di.Bendpoint#getSourceY()
     * @see #getBendpoint()
     * @generated
     */
    EAttribute getBendpoint_SourceY();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetX <em>Target X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target X</em>'.
     * @see org.eclipse.mdt.bpmn.di.Bendpoint#getTargetX()
     * @see #getBendpoint()
     * @generated
     */
    EAttribute getBendpoint_TargetX();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.Bendpoint#getTargetY <em>Target Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Y</em>'.
     * @see org.eclipse.mdt.bpmn.di.Bendpoint#getTargetY()
     * @see #getBendpoint()
     * @generated
     */
    EAttribute getBendpoint_TargetY();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.di.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector</em>'.
     * @see org.eclipse.mdt.bpmn.di.Connector
     * @generated
     */
    EClass getConnector();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.di.Connector#getBendpoint <em>Bendpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Bendpoint</em>'.
     * @see org.eclipse.mdt.bpmn.di.Connector#getBendpoint()
     * @see #getConnector()
     * @generated
     */
    EReference getConnector_Bendpoint();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.Connector#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.eclipse.mdt.bpmn.di.Connector#getSource()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_Source();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.Connector#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target</em>'.
     * @see org.eclipse.mdt.bpmn.di.Connector#getTarget()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_Target();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.di.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram</em>'.
     * @see org.eclipse.mdt.bpmn.di.Diagram
     * @generated
     */
    EClass getDiagram();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.di.Diagram#getConnector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connector</em>'.
     * @see org.eclipse.mdt.bpmn.di.Diagram#getConnector()
     * @see #getDiagram()
     * @generated
     */
    EReference getDiagram_Connector();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.di.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.mdt.bpmn.di.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.eclipse.mdt.bpmn.di.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.eclipse.mdt.bpmn.di.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.di.DocumentRoot#getBendpoint <em>Bendpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bendpoint</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot#getBendpoint()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Bendpoint();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.di.DocumentRoot#getConnector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connector</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot#getConnector()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Connector();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.di.DocumentRoot#getView <em>View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>View</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot#getView()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_View();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.di.DocumentRoot#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Diagram</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot#getDiagram()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Diagram();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.di.DocumentRoot#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Node</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot#getNode()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Node();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.mdt.bpmn.di.DocumentRoot#getStyle <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Style</em>'.
     * @see org.eclipse.mdt.bpmn.di.DocumentRoot#getStyle()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Style();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.di.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node</em>'.
     * @see org.eclipse.mdt.bpmn.di.Node
     * @generated
     */
    EClass getNode();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.di.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Style</em>'.
     * @see org.eclipse.mdt.bpmn.di.Style
     * @generated
     */
    EClass getStyle();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.Style#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.mdt.bpmn.di.Style#getName()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.Style#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.eclipse.mdt.bpmn.di.Style#getValue()
     * @see #getStyle()
     * @generated
     */
    EAttribute getStyle_Value();

    /**
     * Returns the meta object for class '{@link org.eclipse.mdt.bpmn.di.View <em>View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>View</em>'.
     * @see org.eclipse.mdt.bpmn.di.View
     * @generated
     */
    EClass getView();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.di.View#getStyle <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Style</em>'.
     * @see org.eclipse.mdt.bpmn.di.View#getStyle()
     * @see #getView()
     * @generated
     */
    EReference getView_Style();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.mdt.bpmn.di.View#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Child</em>'.
     * @see org.eclipse.mdt.bpmn.di.View#getChild()
     * @see #getView()
     * @generated
     */
    EReference getView_Child();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.View#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Context</em>'.
     * @see org.eclipse.mdt.bpmn.di.View#getContext()
     * @see #getView()
     * @generated
     */
    EAttribute getView_Context();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.View#getDefinition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Definition</em>'.
     * @see org.eclipse.mdt.bpmn.di.View#getDefinition()
     * @see #getView()
     * @generated
     */
    EAttribute getView_Definition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.View#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.eclipse.mdt.bpmn.di.View#getId()
     * @see #getView()
     * @generated
     */
    EAttribute getView_Id();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.View#getSourceConnector <em>Source Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Connector</em>'.
     * @see org.eclipse.mdt.bpmn.di.View#getSourceConnector()
     * @see #getView()
     * @generated
     */
    EAttribute getView_SourceConnector();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.mdt.bpmn.di.View#getTargetConnector <em>Target Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Connector</em>'.
     * @see org.eclipse.mdt.bpmn.di.View#getTargetConnector()
     * @see #getView()
     * @generated
     */
    EAttribute getView_TargetConnector();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Definition Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Definition Type</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='definition_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
     * @generated
     */
    EDataType getDefinitionType();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Source Connector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Source Connector Type</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='sourceConnector_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
     * @generated
     */
    EDataType getSourceConnectorType();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Target Connector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Target Connector Type</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List"
     *        extendedMetaData="name='targetConnector_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
     * @generated
     */
    EDataType getTargetConnectorType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DIFactory getDIFactory();

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
         * The meta object literal for the '{@link org.eclipse.mdt.bpmn.di.impl.BendpointImpl <em>Bendpoint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.mdt.bpmn.di.impl.BendpointImpl
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getBendpoint()
         * @generated
         */
        EClass BENDPOINT = eINSTANCE.getBendpoint();

        /**
         * The meta object literal for the '<em><b>Source X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BENDPOINT__SOURCE_X = eINSTANCE.getBendpoint_SourceX();

        /**
         * The meta object literal for the '<em><b>Source Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BENDPOINT__SOURCE_Y = eINSTANCE.getBendpoint_SourceY();

        /**
         * The meta object literal for the '<em><b>Target X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BENDPOINT__TARGET_X = eINSTANCE.getBendpoint_TargetX();

        /**
         * The meta object literal for the '<em><b>Target Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BENDPOINT__TARGET_Y = eINSTANCE.getBendpoint_TargetY();

        /**
         * The meta object literal for the '{@link org.eclipse.mdt.bpmn.di.impl.ConnectorImpl <em>Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.mdt.bpmn.di.impl.ConnectorImpl
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getConnector()
         * @generated
         */
        EClass CONNECTOR = eINSTANCE.getConnector();

        /**
         * The meta object literal for the '<em><b>Bendpoint</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR__BENDPOINT = eINSTANCE.getConnector_Bendpoint();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__TARGET = eINSTANCE.getConnector_Target();

        /**
         * The meta object literal for the '{@link org.eclipse.mdt.bpmn.di.impl.DiagramImpl <em>Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.mdt.bpmn.di.impl.DiagramImpl
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getDiagram()
         * @generated
         */
        EClass DIAGRAM = eINSTANCE.getDiagram();

        /**
         * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM__CONNECTOR = eINSTANCE.getDiagram_Connector();

        /**
         * The meta object literal for the '{@link org.eclipse.mdt.bpmn.di.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.mdt.bpmn.di.impl.DocumentRootImpl
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getDocumentRoot()
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
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE
                .getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE
                .getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Bendpoint</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BENDPOINT = eINSTANCE
                .getDocumentRoot_Bendpoint();

        /**
         * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONNECTOR = eINSTANCE
                .getDocumentRoot_Connector();

        /**
         * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__VIEW = eINSTANCE.getDocumentRoot_View();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__DIAGRAM = eINSTANCE.getDocumentRoot_Diagram();

        /**
         * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__NODE = eINSTANCE.getDocumentRoot_Node();

        /**
         * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__STYLE = eINSTANCE.getDocumentRoot_Style();

        /**
         * The meta object literal for the '{@link org.eclipse.mdt.bpmn.di.impl.NodeImpl <em>Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.mdt.bpmn.di.impl.NodeImpl
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getNode()
         * @generated
         */
        EClass NODE = eINSTANCE.getNode();

        /**
         * The meta object literal for the '{@link org.eclipse.mdt.bpmn.di.impl.StyleImpl <em>Style</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.mdt.bpmn.di.impl.StyleImpl
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getStyle()
         * @generated
         */
        EClass STYLE = eINSTANCE.getStyle();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__NAME = eINSTANCE.getStyle_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE__VALUE = eINSTANCE.getStyle_Value();

        /**
         * The meta object literal for the '{@link org.eclipse.mdt.bpmn.di.impl.ViewImpl <em>View</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.mdt.bpmn.di.impl.ViewImpl
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getView()
         * @generated
         */
        EClass VIEW = eINSTANCE.getView();

        /**
         * The meta object literal for the '<em><b>Style</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VIEW__STYLE = eINSTANCE.getView_Style();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VIEW__CHILD = eINSTANCE.getView_Child();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VIEW__CONTEXT = eINSTANCE.getView_Context();

        /**
         * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VIEW__DEFINITION = eINSTANCE.getView_Definition();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VIEW__ID = eINSTANCE.getView_Id();

        /**
         * The meta object literal for the '<em><b>Source Connector</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VIEW__SOURCE_CONNECTOR = eINSTANCE.getView_SourceConnector();

        /**
         * The meta object literal for the '<em><b>Target Connector</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VIEW__TARGET_CONNECTOR = eINSTANCE.getView_TargetConnector();

        /**
         * The meta object literal for the '<em>Definition Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getDefinitionType()
         * @generated
         */
        EDataType DEFINITION_TYPE = eINSTANCE.getDefinitionType();

        /**
         * The meta object literal for the '<em>Source Connector Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getSourceConnectorType()
         * @generated
         */
        EDataType SOURCE_CONNECTOR_TYPE = eINSTANCE.getSourceConnectorType();

        /**
         * The meta object literal for the '<em>Target Connector Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see org.eclipse.mdt.bpmn.di.impl.DIPackageImpl#getTargetConnectorType()
         * @generated
         */
        EDataType TARGET_CONNECTOR_TYPE = eINSTANCE.getTargetConnectorType();

    }

} //DIPackage
