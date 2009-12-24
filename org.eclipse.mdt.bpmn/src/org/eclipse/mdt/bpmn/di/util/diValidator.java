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
package org.eclipse.mdt.bpmn.di.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.mdt.bpmn.di.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdt.bpmn.di.DIPackage
 * @generated
 */
public class DIValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final DIValidator INSTANCE = new DIValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.eclipse.mdt.bpmn.di"; //$NON-NLS-1$

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * The cached base package validator.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMLTypeValidator xmlTypeValidator;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DIValidator() {
        super();
        xmlTypeValidator = XMLTypeValidator.INSTANCE;
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return DIPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
        case DIPackage.BENDPOINT:
            return validateBendpoint((Bendpoint) value, diagnostics, context);
        case DIPackage.CONNECTOR:
            return validateConnector((Connector) value, diagnostics, context);
        case DIPackage.DIAGRAM:
            return validateDiagram((Diagram) value, diagnostics, context);
        case DIPackage.DOCUMENT_ROOT:
            return validateDocumentRoot((DocumentRoot) value, diagnostics,
                    context);
        case DIPackage.NODE:
            return validateNode((Node) value, diagnostics, context);
        case DIPackage.STYLE:
            return validateStyle((Style) value, diagnostics, context);
        case DIPackage.VIEW:
            return validateView((View) value, diagnostics, context);
        case DIPackage.DEFINITION_TYPE:
            return validateDefinitionType((List<?>) value, diagnostics, context);
        case DIPackage.SOURCE_CONNECTOR_TYPE:
            return validateSourceConnectorType((List<?>) value, diagnostics,
                    context);
        case DIPackage.TARGET_CONNECTOR_TYPE:
            return validateTargetConnectorType((List<?>) value, diagnostics,
                    context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBendpoint(Bendpoint bendpoint,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(bendpoint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConnector(Connector connector,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(connector, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDiagram(Diagram diagram,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(diagram, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDocumentRoot(DocumentRoot documentRoot,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(documentRoot, diagnostics,
                context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNode(Node node, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(node, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateStyle(Style style, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(style, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateView(View view, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(view, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDefinitionType(List<?> definitionType,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateDefinitionType_ItemType(definitionType,
                diagnostics, context);
        return result;
    }

    /**
     * Validates the ItemType constraint of '<em>Definition Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDefinitionType_ItemType(List<?> definitionType,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = true;
        for (Iterator<?> i = definitionType.iterator(); i.hasNext()
                && (result || diagnostics != null);) {
            Object item = i.next();
            if (XMLTypePackage.Literals.QNAME.isInstance(item)) {
                result &= xmlTypeValidator.validateQName((QName) item,
                        diagnostics, context);
            } else {
                result = false;
                reportDataValueTypeViolation(XMLTypePackage.Literals.QNAME,
                        item, diagnostics, context);
            }
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSourceConnectorType(List<?> sourceConnectorType,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateSourceConnectorType_ItemType(
                sourceConnectorType, diagnostics, context);
        return result;
    }

    /**
     * Validates the ItemType constraint of '<em>Source Connector Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSourceConnectorType_ItemType(
            List<?> sourceConnectorType, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        boolean result = true;
        for (Iterator<?> i = sourceConnectorType.iterator(); i.hasNext()
                && (result || diagnostics != null);) {
            Object item = i.next();
            if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
                result &= xmlTypeValidator.validateAnyURI((String) item,
                        diagnostics, context);
            } else {
                result = false;
                reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI,
                        item, diagnostics, context);
            }
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTargetConnectorType(List<?> targetConnectorType,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateTargetConnectorType_ItemType(
                targetConnectorType, diagnostics, context);
        return result;
    }

    /**
     * Validates the ItemType constraint of '<em>Target Connector Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTargetConnectorType_ItemType(
            List<?> targetConnectorType, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        boolean result = true;
        for (Iterator<?> i = targetConnectorType.iterator(); i.hasNext()
                && (result || diagnostics != null);) {
            Object item = i.next();
            if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
                result &= xmlTypeValidator.validateAnyURI((String) item,
                        diagnostics, context);
            } else {
                result = false;
                reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI,
                        item, diagnostics, context);
            }
        }
        return result;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //DIValidator
