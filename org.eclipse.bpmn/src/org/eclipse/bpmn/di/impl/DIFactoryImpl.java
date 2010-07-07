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

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.namespace.QName;

import org.eclipse.bpmn.di.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DIFactoryImpl extends EFactoryImpl implements DIFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DIFactory init() {
        try {
            DIFactory theDIFactory = (DIFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.omg.com/di/1.0.0"); //$NON-NLS-1$ 
            if (theDIFactory != null) {
                return theDIFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DIFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DIFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case DIPackage.BENDPOINT:
            return createBendpoint();
        case DIPackage.CONNECTOR:
            return createConnector();
        case DIPackage.DIAGRAM:
            return createDiagram();
        case DIPackage.DOCUMENT_ROOT:
            return createDocumentRoot();
        case DIPackage.NODE:
            return createNode();
        case DIPackage.STYLE:
            return createStyle();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case DIPackage.DEFINITION_TYPE:
            return createDefinitionTypeFromString(eDataType, initialValue);
        case DIPackage.SOURCE_CONNECTOR_TYPE:
            return createSourceConnectorTypeFromString(eDataType, initialValue);
        case DIPackage.TARGET_CONNECTOR_TYPE:
            return createTargetConnectorTypeFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case DIPackage.DEFINITION_TYPE:
            return convertDefinitionTypeToString(eDataType, instanceValue);
        case DIPackage.SOURCE_CONNECTOR_TYPE:
            return convertSourceConnectorTypeToString(eDataType, instanceValue);
        case DIPackage.TARGET_CONNECTOR_TYPE:
            return convertTargetConnectorTypeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bendpoint createBendpoint() {
        BendpointImpl bendpoint = new BendpointImpl();
        return bendpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connector createConnector() {
        ConnectorImpl connector = new ConnectorImpl();
        return connector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram createDiagram() {
        DiagramImpl diagram = new DiagramImpl();
        return diagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node createNode() {
        NodeImpl node = new NodeImpl();
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style createStyle() {
        StyleImpl style = new StyleImpl();
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<QName> createDefinitionTypeFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null)
            return null;
        List<QName> result = new ArrayList<QName>();
        for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens();) {
            String item = stringTokenizer.nextToken();
            result.add((QName) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDefinitionTypeToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null)
            return null;
        List<?> list = (List<?>) instanceValue;
        if (list.isEmpty())
            return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> createSourceConnectorTypeFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null)
            return null;
        List<String> result = new ArrayList<String>();
        for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens();) {
            String item = stringTokenizer.nextToken();
            result.add((String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSourceConnectorTypeToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null)
            return null;
        List<?> list = (List<?>) instanceValue;
        if (list.isEmpty())
            return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<String> createTargetConnectorTypeFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null)
            return null;
        List<String> result = new ArrayList<String>();
        for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens();) {
            String item = stringTokenizer.nextToken();
            result.add((String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTargetConnectorTypeToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null)
            return null;
        List<?> list = (List<?>) instanceValue;
        if (list.isEmpty())
            return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DIPackage getDIPackage() {
        return (DIPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DIPackage getPackage() {
        return DIPackage.eINSTANCE;
    }

} //DIFactoryImpl
