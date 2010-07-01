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
 * $Id: //bpem/bpem.metamodels/dev/src/_org.eclipse.bpmn2.ecore/ecp/api/org/eclipse/bpmn2/ecore/Activator.java#2 $
 */
package org.eclipse.bpmn2.util;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.bpmn2di.Bpmn2DiPackage;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.dc.DcPackage;
import org.eclipse.di.DiPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	public Activator() {}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);

		// register also the non-XMI namespaces, as they are needed to read XML files
		registerNonXMINamespace(Bpmn2Package.eINSTANCE);
		registerNonXMINamespace(Bpmn2DiPackage.eINSTANCE);
		registerNonXMINamespace(DiPackage.eINSTANCE);
		registerNonXMINamespace(DcPackage.eINSTANCE);

	}

	private void registerNonXMINamespace(EPackage pack) {
		String ns = pack.getNsURI();
		ExtendedMetaData.INSTANCE.putPackage(ns.substring(0, ns.length() - 4), pack);
	}

}
