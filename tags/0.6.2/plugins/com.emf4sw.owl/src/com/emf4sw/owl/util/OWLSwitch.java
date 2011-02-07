/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.util;

import com.emf4sw.owl.*;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationAssertion;
import com.emf4sw.owl.AnnotationAxiom;
import com.emf4sw.owl.AnnotationProperty;
import com.emf4sw.owl.AnnotationPropertyDomain;
import com.emf4sw.owl.AnnotationPropertyExpression;
import com.emf4sw.owl.AnnotationPropertyRange;
import com.emf4sw.owl.AnonymousIndividual;
import com.emf4sw.owl.Assertion;
import com.emf4sw.owl.AssymmetricObjectProperty;
import com.emf4sw.owl.Axiom;
import com.emf4sw.owl.ClassAssertion;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.ClassExpressionAxiom;
import com.emf4sw.owl.DataAllValuesFrom;
import com.emf4sw.owl.DataComplementOf;
import com.emf4sw.owl.DataExactCardinality;
import com.emf4sw.owl.DataHasValue;
import com.emf4sw.owl.DataIntersectionOf;
import com.emf4sw.owl.DataMaxCardinality;
import com.emf4sw.owl.DataMinCardinality;
import com.emf4sw.owl.DataOneOf;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataPropertyAssertion;
import com.emf4sw.owl.DataPropertyAxiom;
import com.emf4sw.owl.DataPropertyDomain;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.DataPropertyRange;
import com.emf4sw.owl.DataPropertyRestriction;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.DataSomeValuesFrom;
import com.emf4sw.owl.DataUnionOf;
import com.emf4sw.owl.Datatype;
import com.emf4sw.owl.DatatypeDefinition;
import com.emf4sw.owl.DatatypeRestriction;
import com.emf4sw.owl.Declaration;
import com.emf4sw.owl.DifferentIndividuals;
import com.emf4sw.owl.DisjointClasses;
import com.emf4sw.owl.DisjointDataProperties;
import com.emf4sw.owl.DisjointObjectProperties;
import com.emf4sw.owl.DisjointUnion;
import com.emf4sw.owl.Entity;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.EquivalentClasses;
import com.emf4sw.owl.EquivalentDataProperties;
import com.emf4sw.owl.EquivalentObjectProperties;
import com.emf4sw.owl.FacetRestriction;
import com.emf4sw.owl.FunctionalDataProperty;
import com.emf4sw.owl.FunctionalObjectProperty;
import com.emf4sw.owl.HasKey;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.InverseFunctionalObjectProperty;
import com.emf4sw.owl.InverseObjectProperties;
import com.emf4sw.owl.IrreflexiveObjectProperty;
import com.emf4sw.owl.Literal;
import com.emf4sw.owl.NamedIndividual;
import com.emf4sw.owl.Namespace;
import com.emf4sw.owl.NegativeDataPropertyAssertion;
import com.emf4sw.owl.NegativeObjectPropertyAssertion;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.OWLProperty;
import com.emf4sw.owl.ObjectAllValuesFrom;
import com.emf4sw.owl.ObjectComplementOf;
import com.emf4sw.owl.ObjectExactCardinality;
import com.emf4sw.owl.ObjectHasSelf;
import com.emf4sw.owl.ObjectHasValue;
import com.emf4sw.owl.ObjectIntersectionOf;
import com.emf4sw.owl.ObjectMaxCardinality;
import com.emf4sw.owl.ObjectMinCardinality;
import com.emf4sw.owl.ObjectOneOf;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.ObjectPropertyAssertion;
import com.emf4sw.owl.ObjectPropertyAxiom;
import com.emf4sw.owl.ObjectPropertyChain;
import com.emf4sw.owl.ObjectPropertyDomain;
import com.emf4sw.owl.ObjectPropertyExpression;
import com.emf4sw.owl.ObjectPropertyRange;
import com.emf4sw.owl.ObjectPropertyRestriction;
import com.emf4sw.owl.ObjectSomeValuesFrom;
import com.emf4sw.owl.ObjectUnionOf;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.ReflexiveObjectProperty;
import com.emf4sw.owl.SameIndividual;
import com.emf4sw.owl.SubAnnotationPropertyOf;
import com.emf4sw.owl.SubClassOf;
import com.emf4sw.owl.SubDataPropertyOf;
import com.emf4sw.owl.SubObjectPropertyOf;
import com.emf4sw.owl.SymmetricObjectProperty;
import com.emf4sw.owl.TransitiveObjectProperty;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.emf4sw.owl.OWLPackage
 * @generated
 */
public class OWLSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OWLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLSwitch() {
		if (modelPackage == null) {
			modelPackage = OWLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OWLPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ENTITY_EXPRESSION: {
				EntityExpression entityExpression = (EntityExpression)theEObject;
				T result = caseEntityExpression(entityExpression);
				if (result == null) result = caseDataRange(entityExpression);
				if (result == null) result = caseClassExpression(entityExpression);
				if (result == null) result = caseIndividual(entityExpression);
				if (result == null) result = caseObjectPropertyExpression(entityExpression);
				if (result == null) result = caseDataPropertyExpression(entityExpression);
				if (result == null) result = caseAnnotationPropertyExpression(entityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.IRI_ENTITY_EXPRESSION: {
				IRIEntityExpression iriEntityExpression = (IRIEntityExpression)theEObject;
				T result = caseIRIEntityExpression(iriEntityExpression);
				if (result == null) result = caseEntityExpression(iriEntityExpression);
				if (result == null) result = caseDataRange(iriEntityExpression);
				if (result == null) result = caseClassExpression(iriEntityExpression);
				if (result == null) result = caseIndividual(iriEntityExpression);
				if (result == null) result = caseObjectPropertyExpression(iriEntityExpression);
				if (result == null) result = caseDataPropertyExpression(iriEntityExpression);
				if (result == null) result = caseAnnotationPropertyExpression(iriEntityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.PREFIX_ENTITY_EXPRESSION: {
				PrefixEntityExpression prefixEntityExpression = (PrefixEntityExpression)theEObject;
				T result = casePrefixEntityExpression(prefixEntityExpression);
				if (result == null) result = caseEntityExpression(prefixEntityExpression);
				if (result == null) result = caseDataRange(prefixEntityExpression);
				if (result == null) result = caseClassExpression(prefixEntityExpression);
				if (result == null) result = caseIndividual(prefixEntityExpression);
				if (result == null) result = caseObjectPropertyExpression(prefixEntityExpression);
				if (result == null) result = caseDataPropertyExpression(prefixEntityExpression);
				if (result == null) result = caseAnnotationPropertyExpression(prefixEntityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.NO_PREFIX_ENTITY_EXPRESSION: {
				NoPrefixEntityExpression noPrefixEntityExpression = (NoPrefixEntityExpression)theEObject;
				T result = caseNoPrefixEntityExpression(noPrefixEntityExpression);
				if (result == null) result = caseEntityExpression(noPrefixEntityExpression);
				if (result == null) result = caseDataRange(noPrefixEntityExpression);
				if (result == null) result = caseClassExpression(noPrefixEntityExpression);
				if (result == null) result = caseIndividual(noPrefixEntityExpression);
				if (result == null) result = caseObjectPropertyExpression(noPrefixEntityExpression);
				if (result == null) result = caseDataPropertyExpression(noPrefixEntityExpression);
				if (result == null) result = caseAnnotationPropertyExpression(noPrefixEntityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.AXIOM: {
				Axiom axiom = (Axiom)theEObject;
				T result = caseAxiom(axiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.CLASS_EXPRESSION_AXIOM: {
				ClassExpressionAxiom classExpressionAxiom = (ClassExpressionAxiom)theEObject;
				T result = caseClassExpressionAxiom(classExpressionAxiom);
				if (result == null) result = caseAxiom(classExpressionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.SUB_CLASS_OF: {
				SubClassOf subClassOf = (SubClassOf)theEObject;
				T result = caseSubClassOf(subClassOf);
				if (result == null) result = caseClassExpressionAxiom(subClassOf);
				if (result == null) result = caseAxiom(subClassOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DISJOINT_CLASSES: {
				DisjointClasses disjointClasses = (DisjointClasses)theEObject;
				T result = caseDisjointClasses(disjointClasses);
				if (result == null) result = caseClassExpressionAxiom(disjointClasses);
				if (result == null) result = caseAxiom(disjointClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.EQUIVALENT_CLASSES: {
				EquivalentClasses equivalentClasses = (EquivalentClasses)theEObject;
				T result = caseEquivalentClasses(equivalentClasses);
				if (result == null) result = caseClassExpressionAxiom(equivalentClasses);
				if (result == null) result = caseAxiom(equivalentClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DISJOINT_UNION: {
				DisjointUnion disjointUnion = (DisjointUnion)theEObject;
				T result = caseDisjointUnion(disjointUnion);
				if (result == null) result = caseClassExpressionAxiom(disjointUnion);
				if (result == null) result = caseAxiom(disjointUnion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY_AXIOM: {
				ObjectPropertyAxiom objectPropertyAxiom = (ObjectPropertyAxiom)theEObject;
				T result = caseObjectPropertyAxiom(objectPropertyAxiom);
				if (result == null) result = caseAxiom(objectPropertyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.SUB_OBJECT_PROPERTY_OF: {
				SubObjectPropertyOf subObjectPropertyOf = (SubObjectPropertyOf)theEObject;
				T result = caseSubObjectPropertyOf(subObjectPropertyOf);
				if (result == null) result = caseObjectPropertyAxiom(subObjectPropertyOf);
				if (result == null) result = caseAxiom(subObjectPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY_DOMAIN: {
				ObjectPropertyDomain objectPropertyDomain = (ObjectPropertyDomain)theEObject;
				T result = caseObjectPropertyDomain(objectPropertyDomain);
				if (result == null) result = caseObjectPropertyAxiom(objectPropertyDomain);
				if (result == null) result = caseAxiom(objectPropertyDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY_RANGE: {
				ObjectPropertyRange objectPropertyRange = (ObjectPropertyRange)theEObject;
				T result = caseObjectPropertyRange(objectPropertyRange);
				if (result == null) result = caseObjectPropertyAxiom(objectPropertyRange);
				if (result == null) result = caseAxiom(objectPropertyRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES: {
				EquivalentObjectProperties equivalentObjectProperties = (EquivalentObjectProperties)theEObject;
				T result = caseEquivalentObjectProperties(equivalentObjectProperties);
				if (result == null) result = caseObjectPropertyAxiom(equivalentObjectProperties);
				if (result == null) result = caseAxiom(equivalentObjectProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES: {
				DisjointObjectProperties disjointObjectProperties = (DisjointObjectProperties)theEObject;
				T result = caseDisjointObjectProperties(disjointObjectProperties);
				if (result == null) result = caseObjectPropertyAxiom(disjointObjectProperties);
				if (result == null) result = caseAxiom(disjointObjectProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.INVERSE_OBJECT_PROPERTIES: {
				InverseObjectProperties inverseObjectProperties = (InverseObjectProperties)theEObject;
				T result = caseInverseObjectProperties(inverseObjectProperties);
				if (result == null) result = caseObjectPropertyAxiom(inverseObjectProperties);
				if (result == null) result = caseAxiom(inverseObjectProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.FUNCTIONAL_OBJECT_PROPERTY: {
				FunctionalObjectProperty functionalObjectProperty = (FunctionalObjectProperty)theEObject;
				T result = caseFunctionalObjectProperty(functionalObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(functionalObjectProperty);
				if (result == null) result = caseAxiom(functionalObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: {
				InverseFunctionalObjectProperty inverseFunctionalObjectProperty = (InverseFunctionalObjectProperty)theEObject;
				T result = caseInverseFunctionalObjectProperty(inverseFunctionalObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(inverseFunctionalObjectProperty);
				if (result == null) result = caseAxiom(inverseFunctionalObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.SYMMETRIC_OBJECT_PROPERTY: {
				SymmetricObjectProperty symmetricObjectProperty = (SymmetricObjectProperty)theEObject;
				T result = caseSymmetricObjectProperty(symmetricObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(symmetricObjectProperty);
				if (result == null) result = caseAxiom(symmetricObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.REFLEXIVE_OBJECT_PROPERTY: {
				ReflexiveObjectProperty reflexiveObjectProperty = (ReflexiveObjectProperty)theEObject;
				T result = caseReflexiveObjectProperty(reflexiveObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(reflexiveObjectProperty);
				if (result == null) result = caseAxiom(reflexiveObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.IRREFLEXIVE_OBJECT_PROPERTY: {
				IrreflexiveObjectProperty irreflexiveObjectProperty = (IrreflexiveObjectProperty)theEObject;
				T result = caseIrreflexiveObjectProperty(irreflexiveObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(irreflexiveObjectProperty);
				if (result == null) result = caseAxiom(irreflexiveObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.TRANSITIVE_OBJECT_PROPERTY: {
				TransitiveObjectProperty transitiveObjectProperty = (TransitiveObjectProperty)theEObject;
				T result = caseTransitiveObjectProperty(transitiveObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(transitiveObjectProperty);
				if (result == null) result = caseAxiom(transitiveObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ASSYMMETRIC_OBJECT_PROPERTY: {
				AssymmetricObjectProperty assymmetricObjectProperty = (AssymmetricObjectProperty)theEObject;
				T result = caseAssymmetricObjectProperty(assymmetricObjectProperty);
				if (result == null) result = caseObjectPropertyAxiom(assymmetricObjectProperty);
				if (result == null) result = caseAxiom(assymmetricObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_PROPERTY_AXIOM: {
				DataPropertyAxiom dataPropertyAxiom = (DataPropertyAxiom)theEObject;
				T result = caseDataPropertyAxiom(dataPropertyAxiom);
				if (result == null) result = caseAxiom(dataPropertyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.SUB_DATA_PROPERTY_OF: {
				SubDataPropertyOf subDataPropertyOf = (SubDataPropertyOf)theEObject;
				T result = caseSubDataPropertyOf(subDataPropertyOf);
				if (result == null) result = caseDataPropertyAxiom(subDataPropertyOf);
				if (result == null) result = caseAxiom(subDataPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DISJOINT_DATA_PROPERTIES: {
				DisjointDataProperties disjointDataProperties = (DisjointDataProperties)theEObject;
				T result = caseDisjointDataProperties(disjointDataProperties);
				if (result == null) result = caseDataPropertyAxiom(disjointDataProperties);
				if (result == null) result = caseAxiom(disjointDataProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.EQUIVALENT_DATA_PROPERTIES: {
				EquivalentDataProperties equivalentDataProperties = (EquivalentDataProperties)theEObject;
				T result = caseEquivalentDataProperties(equivalentDataProperties);
				if (result == null) result = caseDataPropertyAxiom(equivalentDataProperties);
				if (result == null) result = caseAxiom(equivalentDataProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_PROPERTY_DOMAIN: {
				DataPropertyDomain dataPropertyDomain = (DataPropertyDomain)theEObject;
				T result = caseDataPropertyDomain(dataPropertyDomain);
				if (result == null) result = caseDataPropertyAxiom(dataPropertyDomain);
				if (result == null) result = caseAxiom(dataPropertyDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_PROPERTY_RANGE: {
				DataPropertyRange dataPropertyRange = (DataPropertyRange)theEObject;
				T result = caseDataPropertyRange(dataPropertyRange);
				if (result == null) result = caseDataPropertyAxiom(dataPropertyRange);
				if (result == null) result = caseAxiom(dataPropertyRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.FUNCTIONAL_DATA_PROPERTY: {
				FunctionalDataProperty functionalDataProperty = (FunctionalDataProperty)theEObject;
				T result = caseFunctionalDataProperty(functionalDataProperty);
				if (result == null) result = caseDataPropertyAxiom(functionalDataProperty);
				if (result == null) result = caseAxiom(functionalDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATION_AXIOM: {
				AnnotationAxiom annotationAxiom = (AnnotationAxiom)theEObject;
				T result = caseAnnotationAxiom(annotationAxiom);
				if (result == null) result = caseAxiom(annotationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATION_ASSERTION: {
				AnnotationAssertion annotationAssertion = (AnnotationAssertion)theEObject;
				T result = caseAnnotationAssertion(annotationAssertion);
				if (result == null) result = caseAnnotationAxiom(annotationAssertion);
				if (result == null) result = caseAxiom(annotationAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF: {
				SubAnnotationPropertyOf subAnnotationPropertyOf = (SubAnnotationPropertyOf)theEObject;
				T result = caseSubAnnotationPropertyOf(subAnnotationPropertyOf);
				if (result == null) result = caseAnnotationAxiom(subAnnotationPropertyOf);
				if (result == null) result = caseAxiom(subAnnotationPropertyOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATION_PROPERTY_DOMAIN: {
				AnnotationPropertyDomain annotationPropertyDomain = (AnnotationPropertyDomain)theEObject;
				T result = caseAnnotationPropertyDomain(annotationPropertyDomain);
				if (result == null) result = caseAnnotationAxiom(annotationPropertyDomain);
				if (result == null) result = caseAxiom(annotationPropertyDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATION_PROPERTY_RANGE: {
				AnnotationPropertyRange annotationPropertyRange = (AnnotationPropertyRange)theEObject;
				T result = caseAnnotationPropertyRange(annotationPropertyRange);
				if (result == null) result = caseAnnotationAxiom(annotationPropertyRange);
				if (result == null) result = caseAxiom(annotationPropertyRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.HAS_KEY: {
				HasKey hasKey = (HasKey)theEObject;
				T result = caseHasKey(hasKey);
				if (result == null) result = caseAxiom(hasKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_RANGE: {
				DataRange dataRange = (DataRange)theEObject;
				T result = caseDataRange(dataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_COMPLEMENT_OF: {
				DataComplementOf dataComplementOf = (DataComplementOf)theEObject;
				T result = caseDataComplementOf(dataComplementOf);
				if (result == null) result = caseDataRange(dataComplementOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_UNION_OF: {
				DataUnionOf dataUnionOf = (DataUnionOf)theEObject;
				T result = caseDataUnionOf(dataUnionOf);
				if (result == null) result = caseDataRange(dataUnionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_ONE_OF: {
				DataOneOf dataOneOf = (DataOneOf)theEObject;
				T result = caseDataOneOf(dataOneOf);
				if (result == null) result = caseDataRange(dataOneOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATATYPE_RESTRICTION: {
				DatatypeRestriction datatypeRestriction = (DatatypeRestriction)theEObject;
				T result = caseDatatypeRestriction(datatypeRestriction);
				if (result == null) result = caseDataRange(datatypeRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.FACET_RESTRICTION: {
				FacetRestriction facetRestriction = (FacetRestriction)theEObject;
				T result = caseFacetRestriction(facetRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_INTERSECTION_OF: {
				DataIntersectionOf dataIntersectionOf = (DataIntersectionOf)theEObject;
				T result = caseDataIntersectionOf(dataIntersectionOf);
				if (result == null) result = caseDataRange(dataIntersectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATATYPE_DEFINITION: {
				DatatypeDefinition datatypeDefinition = (DatatypeDefinition)theEObject;
				T result = caseDatatypeDefinition(datatypeDefinition);
				if (result == null) result = caseAxiom(datatypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseAxiom(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OWL_CLASS: {
				OWLClass owlClass = (OWLClass)theEObject;
				T result = caseOWLClass(owlClass);
				if (result == null) result = caseEntity(owlClass);
				if (result == null) result = caseClassExpression(owlClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OWL_PROPERTY: {
				OWLProperty owlProperty = (OWLProperty)theEObject;
				T result = caseOWLProperty(owlProperty);
				if (result == null) result = caseEntity(owlProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY: {
				ObjectProperty objectProperty = (ObjectProperty)theEObject;
				T result = caseObjectProperty(objectProperty);
				if (result == null) result = caseOWLProperty(objectProperty);
				if (result == null) result = caseEntity(objectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_PROPERTY: {
				DataProperty dataProperty = (DataProperty)theEObject;
				T result = caseDataProperty(dataProperty);
				if (result == null) result = caseOWLProperty(dataProperty);
				if (result == null) result = caseEntity(dataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseEntity(datatype);
				if (result == null) result = caseDataRange(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.NAMED_INDIVIDUAL: {
				NamedIndividual namedIndividual = (NamedIndividual)theEObject;
				T result = caseNamedIndividual(namedIndividual);
				if (result == null) result = caseEntity(namedIndividual);
				if (result == null) result = caseIndividual(namedIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATION_PROPERTY: {
				AnnotationProperty annotationProperty = (AnnotationProperty)theEObject;
				T result = caseAnnotationProperty(annotationProperty);
				if (result == null) result = caseOWLProperty(annotationProperty);
				if (result == null) result = caseEntity(annotationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.CLASS_EXPRESSION: {
				ClassExpression classExpression = (ClassExpression)theEObject;
				T result = caseClassExpression(classExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_UNION_OF: {
				ObjectUnionOf objectUnionOf = (ObjectUnionOf)theEObject;
				T result = caseObjectUnionOf(objectUnionOf);
				if (result == null) result = caseClassExpression(objectUnionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_INTERSECTION_OF: {
				ObjectIntersectionOf objectIntersectionOf = (ObjectIntersectionOf)theEObject;
				T result = caseObjectIntersectionOf(objectIntersectionOf);
				if (result == null) result = caseClassExpression(objectIntersectionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_COMPLEMENT_OF: {
				ObjectComplementOf objectComplementOf = (ObjectComplementOf)theEObject;
				T result = caseObjectComplementOf(objectComplementOf);
				if (result == null) result = caseClassExpression(objectComplementOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_ONE_OF: {
				ObjectOneOf objectOneOf = (ObjectOneOf)theEObject;
				T result = caseObjectOneOf(objectOneOf);
				if (result == null) result = caseClassExpression(objectOneOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY_RESTRICTION: {
				ObjectPropertyRestriction objectPropertyRestriction = (ObjectPropertyRestriction)theEObject;
				T result = caseObjectPropertyRestriction(objectPropertyRestriction);
				if (result == null) result = caseClassExpression(objectPropertyRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_SOME_VALUES_FROM: {
				ObjectSomeValuesFrom objectSomeValuesFrom = (ObjectSomeValuesFrom)theEObject;
				T result = caseObjectSomeValuesFrom(objectSomeValuesFrom);
				if (result == null) result = caseObjectPropertyRestriction(objectSomeValuesFrom);
				if (result == null) result = caseClassExpression(objectSomeValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_ALL_VALUES_FROM: {
				ObjectAllValuesFrom objectAllValuesFrom = (ObjectAllValuesFrom)theEObject;
				T result = caseObjectAllValuesFrom(objectAllValuesFrom);
				if (result == null) result = caseObjectPropertyRestriction(objectAllValuesFrom);
				if (result == null) result = caseClassExpression(objectAllValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_HAS_VALUE: {
				ObjectHasValue objectHasValue = (ObjectHasValue)theEObject;
				T result = caseObjectHasValue(objectHasValue);
				if (result == null) result = caseObjectPropertyRestriction(objectHasValue);
				if (result == null) result = caseClassExpression(objectHasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_HAS_SELF: {
				ObjectHasSelf objectHasSelf = (ObjectHasSelf)theEObject;
				T result = caseObjectHasSelf(objectHasSelf);
				if (result == null) result = caseObjectPropertyRestriction(objectHasSelf);
				if (result == null) result = caseClassExpression(objectHasSelf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_EXACT_CARDINALITY: {
				ObjectExactCardinality objectExactCardinality = (ObjectExactCardinality)theEObject;
				T result = caseObjectExactCardinality(objectExactCardinality);
				if (result == null) result = caseObjectPropertyRestriction(objectExactCardinality);
				if (result == null) result = caseClassExpression(objectExactCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_MAX_CARDINALITY: {
				ObjectMaxCardinality objectMaxCardinality = (ObjectMaxCardinality)theEObject;
				T result = caseObjectMaxCardinality(objectMaxCardinality);
				if (result == null) result = caseObjectPropertyRestriction(objectMaxCardinality);
				if (result == null) result = caseClassExpression(objectMaxCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_MIN_CARDINALITY: {
				ObjectMinCardinality objectMinCardinality = (ObjectMinCardinality)theEObject;
				T result = caseObjectMinCardinality(objectMinCardinality);
				if (result == null) result = caseObjectPropertyRestriction(objectMinCardinality);
				if (result == null) result = caseClassExpression(objectMinCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_PROPERTY_RESTRICTION: {
				DataPropertyRestriction dataPropertyRestriction = (DataPropertyRestriction)theEObject;
				T result = caseDataPropertyRestriction(dataPropertyRestriction);
				if (result == null) result = caseClassExpression(dataPropertyRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_SOME_VALUES_FROM: {
				DataSomeValuesFrom dataSomeValuesFrom = (DataSomeValuesFrom)theEObject;
				T result = caseDataSomeValuesFrom(dataSomeValuesFrom);
				if (result == null) result = caseDataPropertyRestriction(dataSomeValuesFrom);
				if (result == null) result = caseClassExpression(dataSomeValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_ALL_VALUES_FROM: {
				DataAllValuesFrom dataAllValuesFrom = (DataAllValuesFrom)theEObject;
				T result = caseDataAllValuesFrom(dataAllValuesFrom);
				if (result == null) result = caseDataPropertyRestriction(dataAllValuesFrom);
				if (result == null) result = caseClassExpression(dataAllValuesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_HAS_VALUE: {
				DataHasValue dataHasValue = (DataHasValue)theEObject;
				T result = caseDataHasValue(dataHasValue);
				if (result == null) result = caseDataPropertyRestriction(dataHasValue);
				if (result == null) result = caseClassExpression(dataHasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_EXACT_CARDINALITY: {
				DataExactCardinality dataExactCardinality = (DataExactCardinality)theEObject;
				T result = caseDataExactCardinality(dataExactCardinality);
				if (result == null) result = caseDataPropertyRestriction(dataExactCardinality);
				if (result == null) result = caseClassExpression(dataExactCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_MAX_CARDINALITY: {
				DataMaxCardinality dataMaxCardinality = (DataMaxCardinality)theEObject;
				T result = caseDataMaxCardinality(dataMaxCardinality);
				if (result == null) result = caseDataPropertyRestriction(dataMaxCardinality);
				if (result == null) result = caseClassExpression(dataMaxCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_MIN_CARDINALITY: {
				DataMinCardinality dataMinCardinality = (DataMinCardinality)theEObject;
				T result = caseDataMinCardinality(dataMinCardinality);
				if (result == null) result = caseDataPropertyRestriction(dataMinCardinality);
				if (result == null) result = caseClassExpression(dataMinCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANONYMOUS_INDIVIDUAL: {
				AnonymousIndividual anonymousIndividual = (AnonymousIndividual)theEObject;
				T result = caseAnonymousIndividual(anonymousIndividual);
				if (result == null) result = caseIndividual(anonymousIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY_EXPRESSION: {
				ObjectPropertyExpression objectPropertyExpression = (ObjectPropertyExpression)theEObject;
				T result = caseObjectPropertyExpression(objectPropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY_CHAIN: {
				ObjectPropertyChain objectPropertyChain = (ObjectPropertyChain)theEObject;
				T result = caseObjectPropertyChain(objectPropertyChain);
				if (result == null) result = caseObjectPropertyExpression(objectPropertyChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_PROPERTY_EXPRESSION: {
				DataPropertyExpression dataPropertyExpression = (DataPropertyExpression)theEObject;
				T result = caseDataPropertyExpression(dataPropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATION_PROPERTY_EXPRESSION: {
				AnnotationPropertyExpression annotationPropertyExpression = (AnnotationPropertyExpression)theEObject;
				T result = caseAnnotationPropertyExpression(annotationPropertyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseAxiom(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.SAME_INDIVIDUAL: {
				SameIndividual sameIndividual = (SameIndividual)theEObject;
				T result = caseSameIndividual(sameIndividual);
				if (result == null) result = caseAssertion(sameIndividual);
				if (result == null) result = caseAxiom(sameIndividual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DIFFERENT_INDIVIDUALS: {
				DifferentIndividuals differentIndividuals = (DifferentIndividuals)theEObject;
				T result = caseDifferentIndividuals(differentIndividuals);
				if (result == null) result = caseAssertion(differentIndividuals);
				if (result == null) result = caseAxiom(differentIndividuals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.CLASS_ASSERTION: {
				ClassAssertion classAssertion = (ClassAssertion)theEObject;
				T result = caseClassAssertion(classAssertion);
				if (result == null) result = caseAssertion(classAssertion);
				if (result == null) result = caseAxiom(classAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.OBJECT_PROPERTY_ASSERTION: {
				ObjectPropertyAssertion objectPropertyAssertion = (ObjectPropertyAssertion)theEObject;
				T result = caseObjectPropertyAssertion(objectPropertyAssertion);
				if (result == null) result = caseAssertion(objectPropertyAssertion);
				if (result == null) result = caseAxiom(objectPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: {
				NegativeObjectPropertyAssertion negativeObjectPropertyAssertion = (NegativeObjectPropertyAssertion)theEObject;
				T result = caseNegativeObjectPropertyAssertion(negativeObjectPropertyAssertion);
				if (result == null) result = caseAssertion(negativeObjectPropertyAssertion);
				if (result == null) result = caseAxiom(negativeObjectPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.DATA_PROPERTY_ASSERTION: {
				DataPropertyAssertion dataPropertyAssertion = (DataPropertyAssertion)theEObject;
				T result = caseDataPropertyAssertion(dataPropertyAssertion);
				if (result == null) result = caseAssertion(dataPropertyAssertion);
				if (result == null) result = caseAxiom(dataPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OWLPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: {
				NegativeDataPropertyAssertion negativeDataPropertyAssertion = (NegativeDataPropertyAssertion)theEObject;
				T result = caseNegativeDataPropertyAssertion(negativeDataPropertyAssertion);
				if (result == null) result = caseAssertion(negativeDataPropertyAssertion);
				if (result == null) result = caseAxiom(negativeDataPropertyAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxiom(Axiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Expression Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Expression Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassExpressionAxiom(ClassExpressionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubClassOf(SubClassOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointClasses(DisjointClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentClasses(EquivalentClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointUnion(DisjointUnion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyAxiom(ObjectPropertyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Object Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Object Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubObjectPropertyOf(SubObjectPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyDomain(ObjectPropertyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyRange(ObjectPropertyRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Object Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Object Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentObjectProperties(EquivalentObjectProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Object Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Object Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointObjectProperties(DisjointObjectProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Object Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Object Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseObjectProperties(InverseObjectProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalObjectProperty(FunctionalObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Functional Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Functional Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetricObjectProperty(SymmetricObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflexive Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflexive Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflexiveObjectProperty(ReflexiveObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irreflexive Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irreflexive Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrreflexiveObjectProperty(IrreflexiveObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transitive Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transitive Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitiveObjectProperty(TransitiveObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assymmetric Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assymmetric Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssymmetricObjectProperty(AssymmetricObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyAxiom(DataPropertyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Data Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Data Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubDataPropertyOf(SubDataPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Data Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Data Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointDataProperties(DisjointDataProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalent Data Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalent Data Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalentDataProperties(EquivalentDataProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyDomain(DataPropertyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyRange(DataPropertyRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDataProperty(FunctionalDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationAxiom(AnnotationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationAssertion(AnnotationAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Annotation Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Annotation Property Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubAnnotationPropertyOf(SubAnnotationPropertyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationPropertyDomain(AnnotationPropertyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationPropertyRange(AnnotationPropertyRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasKey(HasKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRange(DataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Complement Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataComplementOf(DataComplementOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Union Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataUnionOf(DataUnionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data One Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data One Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOneOf(DataOneOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeRestriction(DatatypeRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetRestriction(FacetRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Intersection Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataIntersectionOf(DataIntersectionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinition(DatatypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLClass(OWLClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLProperty(OWLProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectProperty(ObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProperty(DataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedIndividual(NamedIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationProperty(AnnotationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassExpression(ClassExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectUnionOf(ObjectUnionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIntersectionOf(ObjectIntersectionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectComplementOf(ObjectComplementOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object One Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object One Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOneOf(ObjectOneOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyRestriction(ObjectPropertyRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectHasValue(ObjectHasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Has Self</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Has Self</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectHasSelf(ObjectHasSelf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectExactCardinality(ObjectExactCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectMaxCardinality(ObjectMaxCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectMinCardinality(ObjectMinCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyRestriction(DataPropertyRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSomeValuesFrom(DataSomeValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAllValuesFrom(DataAllValuesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataHasValue(DataHasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExactCardinality(DataExactCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMaxCardinality(DataMaxCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataMinCardinality(DataMinCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousIndividual(AnonymousIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityExpression(EntityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRI Entity Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRI Entity Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRIEntityExpression(IRIEntityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Entity Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Entity Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixEntityExpression(PrefixEntityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Prefix Entity Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Prefix Entity Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoPrefixEntityExpression(NoPrefixEntityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyExpression(ObjectPropertyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyChain(ObjectPropertyChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyExpression(DataPropertyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationPropertyExpression(AnnotationPropertyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameIndividual(SameIndividual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Different Individuals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Different Individuals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferentIndividuals(DifferentIndividuals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAssertion(ClassAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyAssertion(ObjectPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Object Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Object Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyAssertion(DataPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Data Property Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Data Property Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //OWLSwitch
