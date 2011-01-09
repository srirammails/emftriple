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

import com.emf4sw.rdf.Quad;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.QuadImpl#getContextGraph <em>Context Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuadImpl extends TripleImpl implements Quad {
	/**
	 * The cached value of the '{@link #getContextGraph() <em>Context Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextGraph()
	 * @generated
	 * @ordered
	 */
	protected RDFGraph contextGraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.QUAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFGraph getContextGraph() {
		if (contextGraph != null && contextGraph.eIsProxy()) {
			InternalEObject oldContextGraph = (InternalEObject)contextGraph;
			contextGraph = (RDFGraph)eResolveProxy(oldContextGraph);
			if (contextGraph != oldContextGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDFPackage.QUAD__CONTEXT_GRAPH, oldContextGraph, contextGraph));
			}
		}
		return contextGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFGraph basicGetContextGraph() {
		return contextGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextGraph(RDFGraph newContextGraph) {
		RDFGraph oldContextGraph = contextGraph;
		contextGraph = newContextGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.QUAD__CONTEXT_GRAPH, oldContextGraph, contextGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDFPackage.QUAD__CONTEXT_GRAPH:
				if (resolve) return getContextGraph();
				return basicGetContextGraph();
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
			case RDFPackage.QUAD__CONTEXT_GRAPH:
				setContextGraph((RDFGraph)newValue);
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
			case RDFPackage.QUAD__CONTEXT_GRAPH:
				setContextGraph((RDFGraph)null);
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
			case RDFPackage.QUAD__CONTEXT_GRAPH:
				return contextGraph != null;
		}
		return super.eIsSet(featureID);
	}

} //QuadImpl
