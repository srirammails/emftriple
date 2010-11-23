/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.URIElement;
import com.emf4sw.rdf.vocabulary.RDF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.NodeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.NodeImpl#getSubjectOf <em>Subject Of</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.NodeImpl#getObjectOf <em>Object Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubjectOf() <em>Subject Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Triple> subjectOf;

	/**
	 * The cached value of the '{@link #getObjectOf() <em>Object Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Triple> objectOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.NODE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.NODE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triple> getSubjectOf() {
		if (subjectOf == null) {
			subjectOf = new EObjectWithInverseResolvingEList<Triple>(Triple.class, this, RDFPackage.NODE__SUBJECT_OF, RDFPackage.TRIPLE__SUBJECT);
		}
		return subjectOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triple> getObjectOf() {
		if (objectOf == null) {
			objectOf = new EObjectWithInverseResolvingEList<Triple>(Triple.class, this, RDFPackage.NODE__OBJECT_OF, RDFPackage.TRIPLE__OBJECT);
		}
		return objectOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean isTypeOf(String uri) {
		for (Node resource: getTypes()) {
			if (resource instanceof Resource && 
					uri.equals( ((Resource)resource).getURI())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Node> getTypes() {
		EList<Node> types = new BasicEList<Node>();
		for (Triple triple: getSubjectOf()) {
			if (triple.getPredicate().getURI().equals(RDF.type)) {
						types.add((Resource) triple.getObject());
				}
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public String getStringValue(String uri) {
		Literal aLiteral = 
			(Literal) EcoreUtil.getObjectByType(getValues(uri), RDFPackage.eINSTANCE.getLiteral());
		return aLiteral != null ? aLiteral.getLexicalForm() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Node> getValues(String uri) {
		EList<Node> aList = new BasicEList<Node>();
		for (Node aNode: getObject(uri)) {
			aList.add(aNode);
		}
		return aList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<String> getURIValues(String uri) {
		EList<String> aList = new BasicEList<String>();
		for (Node aNode: getObject(uri)) {
			if (aNode instanceof URIElement) {
				aList.add(((URIElement) aNode).getURI());
			}
		}
		return aList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public EList<Node> getObject(String uri) {
		EList<Node> objects = new BasicEList<Node>();
		for (Triple triple: getSubjectOf()) {
			if (triple.getPredicate().getURI().equals(uri)) {
				objects.add(triple.getObject());
			}
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getStringValues(String uri) {
		final EList<String> values = new BasicEList<String>();
		final Collection<Literal> literals = 
			EcoreUtil.getObjectsByType(getValues(uri), RDFPackage.eINSTANCE.getLiteral());
		
		for (Literal literal: literals) {
			values.add(literal.getLexicalForm());
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDFPackage.NODE__SUBJECT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubjectOf()).basicAdd(otherEnd, msgs);
			case RDFPackage.NODE__OBJECT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectOf()).basicAdd(otherEnd, msgs);
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
			case RDFPackage.NODE__SUBJECT_OF:
				return ((InternalEList<?>)getSubjectOf()).basicRemove(otherEnd, msgs);
			case RDFPackage.NODE__OBJECT_OF:
				return ((InternalEList<?>)getObjectOf()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDFPackage.NODE__LABEL:
				return getLabel();
			case RDFPackage.NODE__COMMENT:
				return getComment();
			case RDFPackage.NODE__SUBJECT_OF:
				return getSubjectOf();
			case RDFPackage.NODE__OBJECT_OF:
				return getObjectOf();
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
			case RDFPackage.NODE__LABEL:
				setLabel((String)newValue);
				return;
			case RDFPackage.NODE__COMMENT:
				setComment((String)newValue);
				return;
			case RDFPackage.NODE__SUBJECT_OF:
				getSubjectOf().clear();
				getSubjectOf().addAll((Collection<? extends Triple>)newValue);
				return;
			case RDFPackage.NODE__OBJECT_OF:
				getObjectOf().clear();
				getObjectOf().addAll((Collection<? extends Triple>)newValue);
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
			case RDFPackage.NODE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case RDFPackage.NODE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RDFPackage.NODE__SUBJECT_OF:
				getSubjectOf().clear();
				return;
			case RDFPackage.NODE__OBJECT_OF:
				getObjectOf().clear();
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
			case RDFPackage.NODE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case RDFPackage.NODE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RDFPackage.NODE__SUBJECT_OF:
				return subjectOf != null && !subjectOf.isEmpty();
			case RDFPackage.NODE__OBJECT_OF:
				return objectOf != null && !objectOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
//		if (eIsProxy()) 
		return super.toString();

//		StringBuffer result = new StringBuffer(super.toString());
//		result.append(" (label: ");
//		result.append(label);
//		result.append(", comment: ");
//		result.append(comment);
//		result.append(')');
//		return result.toString();
	}

} //NodeImpl
