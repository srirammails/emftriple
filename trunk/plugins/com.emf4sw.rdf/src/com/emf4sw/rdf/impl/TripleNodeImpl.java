/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;
import com.emf4sw.rdf.URIElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triple Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.TripleNodeImpl#getURI <em>URI</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.TripleNodeImpl#getTriple <em>Triple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TripleNodeImpl extends NodeImpl implements TripleNode {
	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriple() <em>Triple</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriple()
	 * @generated
	 * @ordered
	 */
	protected Triple triple;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripleNodeImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.TRIPLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.TRIPLE_NODE__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triple getTriple() {
		if (triple != null && triple.eIsProxy()) {
			InternalEObject oldTriple = (InternalEObject)triple;
			triple = (Triple)eResolveProxy(oldTriple);
			if (triple != oldTriple) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDFPackage.TRIPLE_NODE__TRIPLE, oldTriple, triple));
			}
		}
		return triple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triple basicGetTriple() {
		return triple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriple(Triple newTriple) {
		Triple oldTriple = triple;
		triple = newTriple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.TRIPLE_NODE__TRIPLE, oldTriple, triple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDFPackage.TRIPLE_NODE__URI:
				return getURI();
			case RDFPackage.TRIPLE_NODE__TRIPLE:
				if (resolve) return getTriple();
				return basicGetTriple();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RDFPackage.TRIPLE_NODE__URI:
				setURI((String)newValue);
				return;
			case RDFPackage.TRIPLE_NODE__TRIPLE:
				setTriple((Triple)newValue);
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
			case RDFPackage.TRIPLE_NODE__URI:
				setURI(URI_EDEFAULT);
				return;
			case RDFPackage.TRIPLE_NODE__TRIPLE:
				setTriple((Triple)null);
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
			case RDFPackage.TRIPLE_NODE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case RDFPackage.TRIPLE_NODE__TRIPLE:
				return triple != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == URIElement.class) {
			switch (derivedFeatureID) {
				case RDFPackage.TRIPLE_NODE__URI: return RDFPackage.URI_ELEMENT__URI;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == URIElement.class) {
			switch (baseFeatureID) {
				case RDFPackage.URI_ELEMENT__URI: return RDFPackage.TRIPLE_NODE__URI;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		result.append('<');
		result.append(uri);
		result.append('>');
		
		return result.toString();
	}

} //TripleNodeImpl
