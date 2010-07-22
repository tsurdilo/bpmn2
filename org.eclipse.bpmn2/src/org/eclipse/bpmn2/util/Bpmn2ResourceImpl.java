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
package org.eclipse.bpmn2.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl
 * @generated
 */
public class Bpmn2ResourceImpl extends XMLResourceImpl {
    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated
     */
    public Bpmn2ResourceImpl(URI uri) {
        super(uri);
    }

    // This method is called by all save methods - save(Document,...), doSave(Writer/OutputStream, ...) - in superclasses.
    @Override
    protected XMLSave createXMLSave() {
        prepareSave();
        return super.createXMLSave();
    }

    /**
     * Prepares this resource for saving.
     * 
     * Sets all ID attributes, that are not set, to a generated UUID.
     */
    protected void prepareSave() {
        EObject cur;
        for (Iterator<EObject> iter = getAllContents(); iter.hasNext();) {
            cur = iter.next();

            EStructuralFeature idAttr = cur.eClass().getEIDAttribute();
            if (idAttr != null && !cur.eIsSet(idAttr)) {
                cur.eSet(idAttr, EcoreUtil.generateUUID());
            }
        }
    }

} //Bpmn2ResourceImpl
