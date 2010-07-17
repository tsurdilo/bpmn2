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
 * $Id: //bpem/bpem.metamodels/dev/src/_org.eclipse.bpmn2.ecore/ecp/api/org/eclipse/bpmn2/ecore/QNameURIHandler.java#2 $
 */
package org.eclipse.bpmn2.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;

/**
 * This simple XMLResource URI Handler converts between the QName-based reference model in BPMN 2.0 and the URI based model in EMF.
 * 
 * Currently only local references are implemented. Finally a cross-file reference in BPMN is a QName. The prefix can be resolved using the
 * prefix declaration in the file, then going to the "imports" element, searching for a fitting import and taking this file as baseURI.
 * 
 * @author d023588
 */
public class QNameURIHandler extends URIHandlerImpl {

    /**
     * 
     */
    public QNameURIHandler() {
    }

    @Override
    public URI resolve(URI uri) {
        // In the local case we receive the pure ID as URI. In EMF this must be an URI with the ID as fragment.
        return super.resolve(URI.createURI("#" + uri.toString()));
    }

    @Override
    public URI deresolve(URI uri) {
        URI deresolved = super.deresolve(uri);
        String deresolvedString = deresolved.toString();
        if (deresolvedString.startsWith("#")) // pure fragment
        {
            return URI.createURI(deresolvedString.substring(1)); // cut off "#"
        }
        return deresolved;
    }

}
