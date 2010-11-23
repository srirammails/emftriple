/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Triple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.TripleImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.TripleImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.TripleImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.TripleImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TripleImpl extends MinimalEObjectImpl.Container implements Triple {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Node subject;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected Property predicate;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected Node object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.TRIPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Node)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDFPackage.TRIPLE__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Node newSubject, NotificationChain msgs) {
		Node oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFPackage.TRIPLE__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Node newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, RDFPackage.NODE__SUBJECT_OF, Node.class, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, RDFPackage.NODE__SUBJECT_OF, Node.class, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.TRIPLE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPredicate() {
		if (predicate != null && predicate.eIsProxy()) {
			InternalEObject oldPredicate = (InternalEObject)predicate;
			predicate = (Property)eResolveProxy(oldPredicate);
			if (predicate != oldPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDFPackage.TRIPLE__PREDICATE, oldPredicate, predicate));
			}
		}
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate(Property newPredicate, NotificationChain msgs) {
		Property oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFPackage.TRIPLE__PREDICATE, oldPredicate, newPredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Property newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null)
				msgs = ((InternalEObject)predicate).eInverseRemove(this, RDFPackage.PROPERTY__PREDICATE_OF, Property.class, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, RDFPackage.PROPERTY__PREDICATE_OF, Property.class, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.TRIPLE__PREDICATE, newPredicate, newPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (Node)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDFPackage.TRIPLE__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(Node newObject, NotificationChain msgs) {
		Node oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDFPackage.TRIPLE__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(Node newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, RDFPackage.NODE__OBJECT_OF, Node.class, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, RDFPackage.NODE__OBJECT_OF, Node.class, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.TRIPLE__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFGraph getGraph() {
		if (eContainerFeatureID() != RDFPackage.TRIPLE__GRAPH) return null;
		return (RDFGraph)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraph(RDFGraph newGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGraph, RDFPackage.TRIPLE__GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(RDFGraph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != RDFPackage.TRIPLE__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, RDFPackage.RDF_GRAPH__TRIPLES, RDFGraph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.TRIPLE__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDFPackage.TRIPLE__SUBJECT:
				if (subject != null)
					msgs = ((InternalEObject)subject).eInverseRemove(this, RDFPackage.NODE__SUBJECT_OF, Node.class, msgs);
				return basicSetSubject((Node)otherEnd, msgs);
			case RDFPackage.TRIPLE__PREDICATE:
				if (predicate != null)
					msgs = ((InternalEObject)predicate).eInverseRemove(this, RDFPackage.PROPERTY__PREDICATE_OF, Property.class, msgs);
				return basicSetPredicate((Property)otherEnd, msgs);
			case RDFPackage.TRIPLE__OBJECT:
				if (object != null)
					msgs = ((InternalEObject)object).eInverseRemove(this, RDFPackage.NODE__OBJECT_OF, Node.class, msgs);
				return basicSetObject((Node)otherEnd, msgs);
			case RDFPackage.TRIPLE__GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraph((RDFGraph)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDFPackage.TRIPLE__SUBJECT:
				return basicSetSubject(null, msgs);
			case RDFPackage.TRIPLE__PREDICATE:
				return basicSetPredicate(null, msgs);
			case RDFPackage.TRIPLE__OBJECT:
				return basicSetObject(null, msgs);
			case RDFPackage.TRIPLE__GRAPH:
				return basicSetGraph(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RDFPackage.TRIPLE__GRAPH:
				return eInternalContainer().eInverseRemove(this, RDFPackage.RDF_GRAPH__TRIPLES, RDFGraph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDFPackage.TRIPLE__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case RDFPackage.TRIPLE__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
			case RDFPackage.TRIPLE__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case RDFPackage.TRIPLE__GRAPH:
				return getGraph();
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
			case RDFPackage.TRIPLE__SUBJECT:
				setSubject((Node)newValue);
				return;
			case RDFPackage.TRIPLE__PREDICATE:
				setPredicate((Property)newValue);
				return;
			case RDFPackage.TRIPLE__OBJECT:
				setObject((Node)newValue);
				return;
			case RDFPackage.TRIPLE__GRAPH:
				setGraph((RDFGraph)newValue);
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
			case RDFPackage.TRIPLE__SUBJECT:
				setSubject((Node)null);
				return;
			case RDFPackage.TRIPLE__PREDICATE:
				setPredicate((Property)null);
				return;
			case RDFPackage.TRIPLE__OBJECT:
				setObject((Node)null);
				return;
			case RDFPackage.TRIPLE__GRAPH:
				setGraph((RDFGraph)null);
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
			case RDFPackage.TRIPLE__SUBJECT:
				return subject != null;
			case RDFPackage.TRIPLE__PREDICATE:
				return predicate != null;
			case RDFPackage.TRIPLE__OBJECT:
				return object != null;
			case RDFPackage.TRIPLE__GRAPH:
				return getGraph() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		
		return getSubject() + " " + getPredicate() + " " + getObject();
	}
} //TripleImpl
