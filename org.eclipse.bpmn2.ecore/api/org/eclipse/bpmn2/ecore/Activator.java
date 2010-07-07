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
package org.eclipse.bpmn2.ecore;

import org.eclipse.bpmn2.ecore.BPMN20.BPMN20Package;
import org.eclipse.bpmn2.ecore.BPMNDI.BPMNDIPackage;
import org.eclipse.bpmn2.ecore.DC.DCPackage;
import org.eclipse.bpmn2.ecore.DI.DIPackage;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	public Activator() {}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);

		// register also the non-XMI namespaces, as they are needed to read XML files
		registerNonXMINamespace(BPMN20Package.eINSTANCE);
		registerNonXMINamespace(BPMNDIPackage.eINSTANCE);
		registerNonXMINamespace(DIPackage.eINSTANCE);
		registerNonXMINamespace(DCPackage.eINSTANCE);

	}

	private void registerNonXMINamespace(EPackage pack) {
		String ns = pack.getNsURI();
		ExtendedMetaData.INSTANCE.putPackage(ns.substring(0, ns.length() - 4), pack);
	}

}
