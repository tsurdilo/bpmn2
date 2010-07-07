/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpmn2.ecore.BPMN20.util;

import org.eclipse.bpmn2.ecore.OnlyContainmentTypeInfo;
import org.eclipse.bpmn2.ecore.QNameURIHandler;
import org.eclipse.bpmn2.ecore.XmlExtendedMetadata;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the package. <!-- end-user-doc -->
 * 
 * @see org.eclipse.bpmn2.ecore.BPMN20.util.BPMN20ResourceImpl
 * @generated
 */
public class BPMN20ResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BPMN20ResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Resource createResource(URI uri) {
		XMLResource result = new BPMN20ResourceImpl(uri);
		ExtendedMetaData extendedMetadata = new XmlExtendedMetadata();
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetadata);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetadata);

		result.getDefaultSaveOptions().put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, new OnlyContainmentTypeInfo());

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_URI_HANDLER, new QNameURIHandler());
		result.getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER, new QNameURIHandler());

		result.getDefaultSaveOptions().put(XMLResource.OPTION_ELEMENT_HANDLER, new ElementHandlerImpl(true));

		return result;
	}
} // BPMN20ResourceFactoryImpl
