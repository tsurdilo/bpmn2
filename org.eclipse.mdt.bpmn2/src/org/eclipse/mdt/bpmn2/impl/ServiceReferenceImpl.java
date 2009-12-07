/**
 * Copyright (c) 2009, Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Intalio Inc. - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.mdt.bpmn2.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn2.Bpmn2Package;
import org.eclipse.mdt.bpmn2.ServiceImplementation;
import org.eclipse.mdt.bpmn2.ServiceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ServiceReferenceImpl#getInterfaceRef <em>Interface Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ServiceReferenceImpl#getEndPointRef <em>End Point Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ServiceReferenceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn2.impl.ServiceReferenceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceReferenceImpl extends RootElementImpl implements
        ServiceReference {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2009, Intalio Inc.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n \nContributors:\n   Intalio Inc. - initial API and implementation\n";

    /**
     * The default value of the '{@link #getInterfaceRef() <em>Interface Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaceRef()
     * @generated
     * @ordered
     */
    protected static final QName INTERFACE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInterfaceRef() <em>Interface Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaceRef()
     * @generated
     * @ordered
     */
    protected QName interfaceRef = INTERFACE_REF_EDEFAULT;

    /**
     * The cached value of the '{@link #getEndPointRef() <em>End Point Ref</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndPointRef()
     * @generated
     * @ordered
     */
    protected EList<QName> endPointRef;

    /**
     * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementation()
     * @generated
     * @ordered
     */
    protected static final ServiceImplementation IMPLEMENTATION_EDEFAULT = ServiceImplementation.WEB_SERVICE;

    /**
     * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementation()
     * @generated
     * @ordered
     */
    protected ServiceImplementation implementation = IMPLEMENTATION_EDEFAULT;

    /**
     * This is true if the Implementation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean implementationESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.eINSTANCE.getServiceReference();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getInterfaceRef() {
        return interfaceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterfaceRef(QName newInterfaceRef) {
        QName oldInterfaceRef = interfaceRef;
        interfaceRef = newInterfaceRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.SERVICE_REFERENCE__INTERFACE_REF,
                    oldInterfaceRef, interfaceRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getEndPointRef() {
        if (endPointRef == null) {
            endPointRef = new EDataTypeEList<QName>(QName.class, this,
                    Bpmn2Package.SERVICE_REFERENCE__END_POINT_REF);
        }
        return endPointRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceImplementation getImplementation() {
        return implementation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImplementation(ServiceImplementation newImplementation) {
        ServiceImplementation oldImplementation = implementation;
        implementation = newImplementation == null ? IMPLEMENTATION_EDEFAULT
                : newImplementation;
        boolean oldImplementationESet = implementationESet;
        implementationESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.SERVICE_REFERENCE__IMPLEMENTATION,
                    oldImplementation, implementation, !oldImplementationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetImplementation() {
        ServiceImplementation oldImplementation = implementation;
        boolean oldImplementationESet = implementationESet;
        implementation = IMPLEMENTATION_EDEFAULT;
        implementationESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    Bpmn2Package.SERVICE_REFERENCE__IMPLEMENTATION,
                    oldImplementation, IMPLEMENTATION_EDEFAULT,
                    oldImplementationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetImplementation() {
        return implementationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.SERVICE_REFERENCE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.SERVICE_REFERENCE__INTERFACE_REF:
            return getInterfaceRef();
        case Bpmn2Package.SERVICE_REFERENCE__END_POINT_REF:
            return getEndPointRef();
        case Bpmn2Package.SERVICE_REFERENCE__IMPLEMENTATION:
            return getImplementation();
        case Bpmn2Package.SERVICE_REFERENCE__NAME:
            return getName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case Bpmn2Package.SERVICE_REFERENCE__INTERFACE_REF:
            setInterfaceRef((QName) newValue);
            return;
        case Bpmn2Package.SERVICE_REFERENCE__END_POINT_REF:
            getEndPointRef().clear();
            getEndPointRef().addAll((Collection<? extends QName>) newValue);
            return;
        case Bpmn2Package.SERVICE_REFERENCE__IMPLEMENTATION:
            setImplementation((ServiceImplementation) newValue);
            return;
        case Bpmn2Package.SERVICE_REFERENCE__NAME:
            setName((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case Bpmn2Package.SERVICE_REFERENCE__INTERFACE_REF:
            setInterfaceRef(INTERFACE_REF_EDEFAULT);
            return;
        case Bpmn2Package.SERVICE_REFERENCE__END_POINT_REF:
            getEndPointRef().clear();
            return;
        case Bpmn2Package.SERVICE_REFERENCE__IMPLEMENTATION:
            unsetImplementation();
            return;
        case Bpmn2Package.SERVICE_REFERENCE__NAME:
            setName(NAME_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case Bpmn2Package.SERVICE_REFERENCE__INTERFACE_REF:
            return INTERFACE_REF_EDEFAULT == null ? interfaceRef != null
                    : !INTERFACE_REF_EDEFAULT.equals(interfaceRef);
        case Bpmn2Package.SERVICE_REFERENCE__END_POINT_REF:
            return endPointRef != null && !endPointRef.isEmpty();
        case Bpmn2Package.SERVICE_REFERENCE__IMPLEMENTATION:
            return isSetImplementation();
        case Bpmn2Package.SERVICE_REFERENCE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
                    .equals(name);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (interfaceRef: ");
        result.append(interfaceRef);
        result.append(", endPointRef: ");
        result.append(endPointRef);
        result.append(", implementation: ");
        if (implementationESet)
            result.append(implementation);
        else
            result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ServiceReferenceImpl
