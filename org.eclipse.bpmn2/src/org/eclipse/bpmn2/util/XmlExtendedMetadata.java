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
 * $Id: //bpem/bpem.metamodels/dev/src/_org.eclipse.bpmn2.ecore/ecp/api/org/eclipse/bpmn2/ecore/XmlExtendedMetadata.java#1 $
 */
package org.eclipse.bpmn2.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;

public class XmlExtendedMetadata extends BasicExtendedMetaData {

    /**
     * 
     */
    public XmlExtendedMetadata() {
    }

    @Override
    public String getNamespace(EPackage ePackage) {
        /*
         * Unfortunately XMLSaveImpl.addNamespaceDeclarations does not consider the XML namespaces that are declared on features to
         * calculate correct prefixes. Instead it calls this method for all packages and assumes that namespace and prefix of the package is
         * correct. In our case the namespace of the package is different to the namespace of all features. We correct this my returning the
         * namespace of a "typical" feature.
         */
        EClass docRoot = getDocumentRoot(ePackage);
        if (docRoot != null) {
            for (EStructuralFeature feature : docRoot.getEStructuralFeatures()) {
                String namespace = getNamespace(feature);
                if (namespace != null && !namespace.equals(ePackage.getNsURI()))
                    return namespace;
            }
        }

        return super.getNamespace(ePackage);
    }
}
