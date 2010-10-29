/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.Axiom;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.Datatype;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.NamedIndividual;
import com.emf4sw.owl.Namespace;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.atl.OWLCollections;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getURI <em>URI</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.emf4sw.owl.impl.OntologyImpl#getAxioms <em>Axioms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends MinimalEObjectImpl.Container implements Ontology {
	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespaces;

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
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Ontology> imports;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getAxioms() <em>Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<Axiom> axioms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLPackage.Literals.ONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EObjectContainmentEList<Namespace>(Namespace.class, this, OWLPackage.ONTOLOGY__NAMESPACES);
		}
		return namespaces;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OWLPackage.ONTOLOGY__URI, oldURI, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ontology> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<Ontology>(Ontology.class, this, OWLPackage.ONTOLOGY__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, OWLPackage.ONTOLOGY__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Axiom> getAxioms() {
		if (axioms == null) {
			axioms = new EObjectContainmentWithInverseEList<Axiom>(Axiom.class, this, OWLPackage.ONTOLOGY__AXIOMS, OWLPackage.AXIOM__ONTOLOGY);
		}
		return axioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ClassExpression> listClassExpressions() {
		return OWLCollections.getExpressionsByType(this, ClassExpression.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<OWLClass> listClasses() {	
		return OWLCollections.getEntitiesByType(this, OWLClass.class); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ObjectProperty> listObjectProperties() {
		return OWLCollections.getEntitiesByType(this, ObjectProperty.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DataProperty> listDataProperties() {
		return OWLCollections.getEntitiesByType(this, DataProperty.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Individual> listIndividuals() {
		return OWLCollections.getEntitiesByType(this, Individual.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<NamedIndividual> listNamedIndividuals() {
		return OWLCollections.getEntitiesByType(this, NamedIndividual.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Datatype> listDatatypes() {
		return OWLCollections.getEntitiesByType(this, Datatype.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public DataProperty getDataProperty(String aURI) {
		for (DataProperty aProperty: listDataProperties()) {
			if (aProperty.getURI().equals(aURI)) {
				return aProperty;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public OWLClass getOWLClass(String aURI) {
		for (OWLClass aProperty: listClasses()) {
			if (aProperty.getURI().equals(aURI)) {
				return aProperty;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Namespace getNamespace(String aPrefix) {
		for (Namespace aNamespace: getNamespaces()) {
			if (aNamespace.getName().equals(aPrefix)) {
				return aNamespace;
			}
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Annotation getAnnotation(String aURI) {
		for (Annotation annotation: getAnnotations()) {
			if (((EntityExpression) annotation.getProperty()).getEntity().getURI().equals(aURI)) {
				return annotation;
			}
		}
		return null;
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
			case OWLPackage.ONTOLOGY__AXIOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAxioms()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ObjectProperty getObjectProperty(String aURI) {
		for (ObjectProperty aProperty: listObjectProperties()) {
			if (aProperty.getURI().equals(aURI)) {
				return aProperty;
			}
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NamedIndividual getNamedIndividual(String aURI) {
		for (NamedIndividual aIndividual: listNamedIndividuals()) {
			if (aIndividual.getURI().equals(aURI)) {
				return aIndividual;
			}
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLPackage.ONTOLOGY__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case OWLPackage.ONTOLOGY__AXIOMS:
				return ((InternalEList<?>)getAxioms()).basicRemove(otherEnd, msgs);
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
			case OWLPackage.ONTOLOGY__NAMESPACES:
				return getNamespaces();
			case OWLPackage.ONTOLOGY__URI:
				return getURI();
			case OWLPackage.ONTOLOGY__IMPORTS:
				return getImports();
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				return getAnnotations();
			case OWLPackage.ONTOLOGY__AXIOMS:
				return getAxioms();
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
			case OWLPackage.ONTOLOGY__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends Namespace>)newValue);
				return;
			case OWLPackage.ONTOLOGY__URI:
				setURI((String)newValue);
				return;
			case OWLPackage.ONTOLOGY__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Ontology>)newValue);
				return;
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OWLPackage.ONTOLOGY__AXIOMS:
				getAxioms().clear();
				getAxioms().addAll((Collection<? extends Axiom>)newValue);
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
			case OWLPackage.ONTOLOGY__NAMESPACES:
				getNamespaces().clear();
				return;
			case OWLPackage.ONTOLOGY__URI:
				setURI(URI_EDEFAULT);
				return;
			case OWLPackage.ONTOLOGY__IMPORTS:
				getImports().clear();
				return;
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OWLPackage.ONTOLOGY__AXIOMS:
				getAxioms().clear();
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
			case OWLPackage.ONTOLOGY__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case OWLPackage.ONTOLOGY__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case OWLPackage.ONTOLOGY__IMPORTS:
				return imports != null && !imports.isEmpty();
			case OWLPackage.ONTOLOGY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OWLPackage.ONTOLOGY__AXIOMS:
				return axioms != null && !axioms.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (URI: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //OntologyImpl
