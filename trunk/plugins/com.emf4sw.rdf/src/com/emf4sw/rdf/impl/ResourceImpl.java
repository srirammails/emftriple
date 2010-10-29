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
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.rdf.impl.ResourceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.ResourceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.ResourceImpl#getSubjectOf <em>Subject Of</em>}</li>
 *   <li>{@link com.emf4sw.rdf.impl.ResourceImpl#getObjectOf <em>Object Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends URIElementImpl implements Resource {
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
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDFPackage.Literals.RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.RESOURCE__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RDFPackage.RESOURCE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triple> getSubjectOf() {
		if (subjectOf == null) {
			subjectOf = new EObjectWithInverseResolvingEList<Triple>(Triple.class, this, RDFPackage.RESOURCE__SUBJECT_OF, RDFPackage.TRIPLE__SUBJECT);
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
			objectOf = new EObjectWithInverseResolvingEList<Triple>(Triple.class, this, RDFPackage.RESOURCE__OBJECT_OF, RDFPackage.TRIPLE__OBJECT);
		}
		return objectOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	 * @generated NOT
	 */
	public EList<Node> getTypes() {
		final EList<Node> types = new BasicEList<Node>();
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
	 * @generated NOT
	 */
	public String getStringValue(String uri) {
		final Literal aLiteral = 
			(Literal) EcoreUtil.getObjectByType(getValues(uri), RDFPackage.eINSTANCE.getLiteral());
		return aLiteral != null ? aLiteral.getLexicalForm() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getValues(String uri) {
		final EList<Node> aList = new BasicEList<Node>();
		for (Triple aTriple: this.getSubjectOf()) {
			if (aTriple.getPredicate().getURI().equals(uri)) {
				aList.add(aTriple.getObject());
			}
		}
		return aList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getURIValues(String uri) {
		final EList<String> aList = new BasicEList<String>();
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
	 * @generated NOT
	 */
	public EList<Node> getObject(String uri) {
		final EList<Node> objects = new BasicEList<Node>();
		for (Triple triple: getSubjectOf()) {
			if (triple.getPredicate().getURI().equals(uri)) {
				objects.add( triple.getObject() );
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
			case RDFPackage.RESOURCE__SUBJECT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubjectOf()).basicAdd(otherEnd, msgs);
			case RDFPackage.RESOURCE__OBJECT_OF:
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
			case RDFPackage.RESOURCE__SUBJECT_OF:
				return ((InternalEList<?>)getSubjectOf()).basicRemove(otherEnd, msgs);
			case RDFPackage.RESOURCE__OBJECT_OF:
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
			case RDFPackage.RESOURCE__LABEL:
				return getLabel();
			case RDFPackage.RESOURCE__COMMENT:
				return getComment();
			case RDFPackage.RESOURCE__SUBJECT_OF:
				return getSubjectOf();
			case RDFPackage.RESOURCE__OBJECT_OF:
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
			case RDFPackage.RESOURCE__LABEL:
				setLabel((String)newValue);
				return;
			case RDFPackage.RESOURCE__COMMENT:
				setComment((String)newValue);
				return;
			case RDFPackage.RESOURCE__SUBJECT_OF:
				getSubjectOf().clear();
				getSubjectOf().addAll((Collection<? extends Triple>)newValue);
				return;
			case RDFPackage.RESOURCE__OBJECT_OF:
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
			case RDFPackage.RESOURCE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case RDFPackage.RESOURCE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RDFPackage.RESOURCE__SUBJECT_OF:
				getSubjectOf().clear();
				return;
			case RDFPackage.RESOURCE__OBJECT_OF:
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
			case RDFPackage.RESOURCE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case RDFPackage.RESOURCE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RDFPackage.RESOURCE__SUBJECT_OF:
				return subjectOf != null && !subjectOf.isEmpty();
			case RDFPackage.RESOURCE__OBJECT_OF:
				return objectOf != null && !objectOf.isEmpty();
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
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case RDFPackage.RESOURCE__LABEL: return RDFPackage.NODE__LABEL;
				case RDFPackage.RESOURCE__COMMENT: return RDFPackage.NODE__COMMENT;
				case RDFPackage.RESOURCE__SUBJECT_OF: return RDFPackage.NODE__SUBJECT_OF;
				case RDFPackage.RESOURCE__OBJECT_OF: return RDFPackage.NODE__OBJECT_OF;
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
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case RDFPackage.NODE__LABEL: return RDFPackage.RESOURCE__LABEL;
				case RDFPackage.NODE__COMMENT: return RDFPackage.RESOURCE__COMMENT;
				case RDFPackage.NODE__SUBJECT_OF: return RDFPackage.RESOURCE__SUBJECT_OF;
				case RDFPackage.NODE__OBJECT_OF: return RDFPackage.RESOURCE__OBJECT_OF;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
