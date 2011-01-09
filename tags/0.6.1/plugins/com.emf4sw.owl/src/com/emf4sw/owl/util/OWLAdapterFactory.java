/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.util;

import com.emf4sw.owl.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.emf4sw.owl.OWLPackage
 * @generated
 */
public class OWLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OWLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OWLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OWLSwitch<Adapter> modelSwitch =
		new OWLSwitch<Adapter>() {
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter caseEntityExpression(EntityExpression object) {
				return createEntityExpressionAdapter();
			}
			@Override
			public Adapter caseIRIEntityExpression(IRIEntityExpression object) {
				return createIRIEntityExpressionAdapter();
			}
			@Override
			public Adapter casePrefixEntityExpression(PrefixEntityExpression object) {
				return createPrefixEntityExpressionAdapter();
			}
			@Override
			public Adapter caseNoPrefixEntityExpression(NoPrefixEntityExpression object) {
				return createNoPrefixEntityExpressionAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseAxiom(Axiom object) {
				return createAxiomAdapter();
			}
			@Override
			public Adapter caseClassExpressionAxiom(ClassExpressionAxiom object) {
				return createClassExpressionAxiomAdapter();
			}
			@Override
			public Adapter caseSubClassOf(SubClassOf object) {
				return createSubClassOfAdapter();
			}
			@Override
			public Adapter caseDisjointClasses(DisjointClasses object) {
				return createDisjointClassesAdapter();
			}
			@Override
			public Adapter caseEquivalentClasses(EquivalentClasses object) {
				return createEquivalentClassesAdapter();
			}
			@Override
			public Adapter caseDisjointUnion(DisjointUnion object) {
				return createDisjointUnionAdapter();
			}
			@Override
			public Adapter caseObjectPropertyAxiom(ObjectPropertyAxiom object) {
				return createObjectPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseSubObjectPropertyOf(SubObjectPropertyOf object) {
				return createSubObjectPropertyOfAdapter();
			}
			@Override
			public Adapter caseObjectPropertyDomain(ObjectPropertyDomain object) {
				return createObjectPropertyDomainAdapter();
			}
			@Override
			public Adapter caseObjectPropertyRange(ObjectPropertyRange object) {
				return createObjectPropertyRangeAdapter();
			}
			@Override
			public Adapter caseEquivalentObjectProperties(EquivalentObjectProperties object) {
				return createEquivalentObjectPropertiesAdapter();
			}
			@Override
			public Adapter caseDisjointObjectProperties(DisjointObjectProperties object) {
				return createDisjointObjectPropertiesAdapter();
			}
			@Override
			public Adapter caseInverseObjectProperties(InverseObjectProperties object) {
				return createInverseObjectPropertiesAdapter();
			}
			@Override
			public Adapter caseFunctionalObjectProperty(FunctionalObjectProperty object) {
				return createFunctionalObjectPropertyAdapter();
			}
			@Override
			public Adapter caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty object) {
				return createInverseFunctionalObjectPropertyAdapter();
			}
			@Override
			public Adapter caseSymmetricObjectProperty(SymmetricObjectProperty object) {
				return createSymmetricObjectPropertyAdapter();
			}
			@Override
			public Adapter caseReflexiveObjectProperty(ReflexiveObjectProperty object) {
				return createReflexiveObjectPropertyAdapter();
			}
			@Override
			public Adapter caseIrreflexiveObjectProperty(IrreflexiveObjectProperty object) {
				return createIrreflexiveObjectPropertyAdapter();
			}
			@Override
			public Adapter caseTransitiveObjectProperty(TransitiveObjectProperty object) {
				return createTransitiveObjectPropertyAdapter();
			}
			@Override
			public Adapter caseAssymmetricObjectProperty(AssymmetricObjectProperty object) {
				return createAssymmetricObjectPropertyAdapter();
			}
			@Override
			public Adapter caseDataPropertyAxiom(DataPropertyAxiom object) {
				return createDataPropertyAxiomAdapter();
			}
			@Override
			public Adapter caseSubDataPropertyOf(SubDataPropertyOf object) {
				return createSubDataPropertyOfAdapter();
			}
			@Override
			public Adapter caseDisjointDataProperties(DisjointDataProperties object) {
				return createDisjointDataPropertiesAdapter();
			}
			@Override
			public Adapter caseEquivalentDataProperties(EquivalentDataProperties object) {
				return createEquivalentDataPropertiesAdapter();
			}
			@Override
			public Adapter caseDataPropertyDomain(DataPropertyDomain object) {
				return createDataPropertyDomainAdapter();
			}
			@Override
			public Adapter caseDataPropertyRange(DataPropertyRange object) {
				return createDataPropertyRangeAdapter();
			}
			@Override
			public Adapter caseFunctionalDataProperty(FunctionalDataProperty object) {
				return createFunctionalDataPropertyAdapter();
			}
			@Override
			public Adapter caseAnnotationAxiom(AnnotationAxiom object) {
				return createAnnotationAxiomAdapter();
			}
			@Override
			public Adapter caseAnnotationAssertion(AnnotationAssertion object) {
				return createAnnotationAssertionAdapter();
			}
			@Override
			public Adapter caseSubAnnotationPropertyOf(SubAnnotationPropertyOf object) {
				return createSubAnnotationPropertyOfAdapter();
			}
			@Override
			public Adapter caseAnnotationPropertyDomain(AnnotationPropertyDomain object) {
				return createAnnotationPropertyDomainAdapter();
			}
			@Override
			public Adapter caseAnnotationPropertyRange(AnnotationPropertyRange object) {
				return createAnnotationPropertyRangeAdapter();
			}
			@Override
			public Adapter caseHasKey(HasKey object) {
				return createHasKeyAdapter();
			}
			@Override
			public Adapter caseDataRange(DataRange object) {
				return createDataRangeAdapter();
			}
			@Override
			public Adapter caseDataComplementOf(DataComplementOf object) {
				return createDataComplementOfAdapter();
			}
			@Override
			public Adapter caseDataUnionOf(DataUnionOf object) {
				return createDataUnionOfAdapter();
			}
			@Override
			public Adapter caseDataOneOf(DataOneOf object) {
				return createDataOneOfAdapter();
			}
			@Override
			public Adapter caseDatatypeRestriction(DatatypeRestriction object) {
				return createDatatypeRestrictionAdapter();
			}
			@Override
			public Adapter caseFacetRestriction(FacetRestriction object) {
				return createFacetRestrictionAdapter();
			}
			@Override
			public Adapter caseDataIntersectionOf(DataIntersectionOf object) {
				return createDataIntersectionOfAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinition(DatatypeDefinition object) {
				return createDatatypeDefinitionAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseOWLClass(OWLClass object) {
				return createOWLClassAdapter();
			}
			@Override
			public Adapter caseOWLProperty(OWLProperty object) {
				return createOWLPropertyAdapter();
			}
			@Override
			public Adapter caseObjectProperty(ObjectProperty object) {
				return createObjectPropertyAdapter();
			}
			@Override
			public Adapter caseDataProperty(DataProperty object) {
				return createDataPropertyAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseNamedIndividual(NamedIndividual object) {
				return createNamedIndividualAdapter();
			}
			@Override
			public Adapter caseAnnotationProperty(AnnotationProperty object) {
				return createAnnotationPropertyAdapter();
			}
			@Override
			public Adapter caseClassExpression(ClassExpression object) {
				return createClassExpressionAdapter();
			}
			@Override
			public Adapter caseObjectUnionOf(ObjectUnionOf object) {
				return createObjectUnionOfAdapter();
			}
			@Override
			public Adapter caseObjectIntersectionOf(ObjectIntersectionOf object) {
				return createObjectIntersectionOfAdapter();
			}
			@Override
			public Adapter caseObjectComplementOf(ObjectComplementOf object) {
				return createObjectComplementOfAdapter();
			}
			@Override
			public Adapter caseObjectOneOf(ObjectOneOf object) {
				return createObjectOneOfAdapter();
			}
			@Override
			public Adapter caseObjectPropertyRestriction(ObjectPropertyRestriction object) {
				return createObjectPropertyRestrictionAdapter();
			}
			@Override
			public Adapter caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
				return createObjectSomeValuesFromAdapter();
			}
			@Override
			public Adapter caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
				return createObjectAllValuesFromAdapter();
			}
			@Override
			public Adapter caseObjectHasValue(ObjectHasValue object) {
				return createObjectHasValueAdapter();
			}
			@Override
			public Adapter caseObjectHasSelf(ObjectHasSelf object) {
				return createObjectHasSelfAdapter();
			}
			@Override
			public Adapter caseObjectExactCardinality(ObjectExactCardinality object) {
				return createObjectExactCardinalityAdapter();
			}
			@Override
			public Adapter caseObjectMaxCardinality(ObjectMaxCardinality object) {
				return createObjectMaxCardinalityAdapter();
			}
			@Override
			public Adapter caseObjectMinCardinality(ObjectMinCardinality object) {
				return createObjectMinCardinalityAdapter();
			}
			@Override
			public Adapter caseDataPropertyRestriction(DataPropertyRestriction object) {
				return createDataPropertyRestrictionAdapter();
			}
			@Override
			public Adapter caseDataSomeValuesFrom(DataSomeValuesFrom object) {
				return createDataSomeValuesFromAdapter();
			}
			@Override
			public Adapter caseDataAllValuesFrom(DataAllValuesFrom object) {
				return createDataAllValuesFromAdapter();
			}
			@Override
			public Adapter caseDataHasValue(DataHasValue object) {
				return createDataHasValueAdapter();
			}
			@Override
			public Adapter caseDataExactCardinality(DataExactCardinality object) {
				return createDataExactCardinalityAdapter();
			}
			@Override
			public Adapter caseDataMaxCardinality(DataMaxCardinality object) {
				return createDataMaxCardinalityAdapter();
			}
			@Override
			public Adapter caseDataMinCardinality(DataMinCardinality object) {
				return createDataMinCardinalityAdapter();
			}
			@Override
			public Adapter caseIndividual(Individual object) {
				return createIndividualAdapter();
			}
			@Override
			public Adapter caseAnonymousIndividual(AnonymousIndividual object) {
				return createAnonymousIndividualAdapter();
			}
			@Override
			public Adapter caseObjectPropertyExpression(ObjectPropertyExpression object) {
				return createObjectPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseObjectPropertyChain(ObjectPropertyChain object) {
				return createObjectPropertyChainAdapter();
			}
			@Override
			public Adapter caseDataPropertyExpression(DataPropertyExpression object) {
				return createDataPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseAnnotationPropertyExpression(AnnotationPropertyExpression object) {
				return createAnnotationPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseSameIndividual(SameIndividual object) {
				return createSameIndividualAdapter();
			}
			@Override
			public Adapter caseDifferentIndividuals(DifferentIndividuals object) {
				return createDifferentIndividualsAdapter();
			}
			@Override
			public Adapter caseClassAssertion(ClassAssertion object) {
				return createClassAssertionAdapter();
			}
			@Override
			public Adapter caseObjectPropertyAssertion(ObjectPropertyAssertion object) {
				return createObjectPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object) {
				return createNegativeObjectPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseDataPropertyAssertion(DataPropertyAssertion object) {
				return createDataPropertyAssertionAdapter();
			}
			@Override
			public Adapter caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object) {
				return createNegativeDataPropertyAssertionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Axiom
	 * @generated
	 */
	public Adapter createAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ClassExpressionAxiom <em>Class Expression Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ClassExpressionAxiom
	 * @generated
	 */
	public Adapter createClassExpressionAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.SubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.SubClassOf
	 * @generated
	 */
	public Adapter createSubClassOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DisjointClasses <em>Disjoint Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DisjointClasses
	 * @generated
	 */
	public Adapter createDisjointClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.EquivalentClasses <em>Equivalent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.EquivalentClasses
	 * @generated
	 */
	public Adapter createEquivalentClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DisjointUnion <em>Disjoint Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DisjointUnion
	 * @generated
	 */
	public Adapter createDisjointUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectPropertyAxiom
	 * @generated
	 */
	public Adapter createObjectPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.SubObjectPropertyOf
	 * @generated
	 */
	public Adapter createSubObjectPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectPropertyDomain <em>Object Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectPropertyDomain
	 * @generated
	 */
	public Adapter createObjectPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectPropertyRange <em>Object Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectPropertyRange
	 * @generated
	 */
	public Adapter createObjectPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.EquivalentObjectProperties
	 * @generated
	 */
	public Adapter createEquivalentObjectPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DisjointObjectProperties
	 * @generated
	 */
	public Adapter createDisjointObjectPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.InverseObjectProperties <em>Inverse Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.InverseObjectProperties
	 * @generated
	 */
	public Adapter createInverseObjectPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.FunctionalObjectProperty <em>Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.FunctionalObjectProperty
	 * @generated
	 */
	public Adapter createFunctionalObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.InverseFunctionalObjectProperty
	 * @generated
	 */
	public Adapter createInverseFunctionalObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.SymmetricObjectProperty
	 * @generated
	 */
	public Adapter createSymmetricObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ReflexiveObjectProperty
	 * @generated
	 */
	public Adapter createReflexiveObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.IrreflexiveObjectProperty
	 * @generated
	 */
	public Adapter createIrreflexiveObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.TransitiveObjectProperty
	 * @generated
	 */
	public Adapter createTransitiveObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.AssymmetricObjectProperty <em>Assymmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.AssymmetricObjectProperty
	 * @generated
	 */
	public Adapter createAssymmetricObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataPropertyAxiom <em>Data Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataPropertyAxiom
	 * @generated
	 */
	public Adapter createDataPropertyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.SubDataPropertyOf
	 * @generated
	 */
	public Adapter createSubDataPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DisjointDataProperties
	 * @generated
	 */
	public Adapter createDisjointDataPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.EquivalentDataProperties
	 * @generated
	 */
	public Adapter createEquivalentDataPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataPropertyDomain <em>Data Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataPropertyDomain
	 * @generated
	 */
	public Adapter createDataPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataPropertyRange <em>Data Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataPropertyRange
	 * @generated
	 */
	public Adapter createDataPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.FunctionalDataProperty <em>Functional Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.FunctionalDataProperty
	 * @generated
	 */
	public Adapter createFunctionalDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.AnnotationAxiom <em>Annotation Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.AnnotationAxiom
	 * @generated
	 */
	public Adapter createAnnotationAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.AnnotationAssertion <em>Annotation Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.AnnotationAssertion
	 * @generated
	 */
	public Adapter createAnnotationAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.SubAnnotationPropertyOf <em>Sub Annotation Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.SubAnnotationPropertyOf
	 * @generated
	 */
	public Adapter createSubAnnotationPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.AnnotationPropertyDomain <em>Annotation Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.AnnotationPropertyDomain
	 * @generated
	 */
	public Adapter createAnnotationPropertyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.AnnotationPropertyRange <em>Annotation Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.AnnotationPropertyRange
	 * @generated
	 */
	public Adapter createAnnotationPropertyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.HasKey <em>Has Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.HasKey
	 * @generated
	 */
	public Adapter createHasKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataRange
	 * @generated
	 */
	public Adapter createDataRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataComplementOf <em>Data Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataComplementOf
	 * @generated
	 */
	public Adapter createDataComplementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataUnionOf <em>Data Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataUnionOf
	 * @generated
	 */
	public Adapter createDataUnionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataOneOf <em>Data One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataOneOf
	 * @generated
	 */
	public Adapter createDataOneOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DatatypeRestriction <em>Datatype Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DatatypeRestriction
	 * @generated
	 */
	public Adapter createDatatypeRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.FacetRestriction <em>Facet Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.FacetRestriction
	 * @generated
	 */
	public Adapter createFacetRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataIntersectionOf <em>Data Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataIntersectionOf
	 * @generated
	 */
	public Adapter createDataIntersectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DatatypeDefinition <em>Datatype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DatatypeDefinition
	 * @generated
	 */
	public Adapter createDatatypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.OWLClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.OWLClass
	 * @generated
	 */
	public Adapter createOWLClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.OWLProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.OWLProperty
	 * @generated
	 */
	public Adapter createOWLPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectProperty
	 * @generated
	 */
	public Adapter createObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataProperty
	 * @generated
	 */
	public Adapter createDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.NamedIndividual <em>Named Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.NamedIndividual
	 * @generated
	 */
	public Adapter createNamedIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.AnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.AnnotationProperty
	 * @generated
	 */
	public Adapter createAnnotationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ClassExpression <em>Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ClassExpression
	 * @generated
	 */
	public Adapter createClassExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectUnionOf <em>Object Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectUnionOf
	 * @generated
	 */
	public Adapter createObjectUnionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectIntersectionOf
	 * @generated
	 */
	public Adapter createObjectIntersectionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectComplementOf <em>Object Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectComplementOf
	 * @generated
	 */
	public Adapter createObjectComplementOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectOneOf <em>Object One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectOneOf
	 * @generated
	 */
	public Adapter createObjectOneOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectPropertyRestriction <em>Object Property Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectPropertyRestriction
	 * @generated
	 */
	public Adapter createObjectPropertyRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectSomeValuesFrom
	 * @generated
	 */
	public Adapter createObjectSomeValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectAllValuesFrom <em>Object All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectAllValuesFrom
	 * @generated
	 */
	public Adapter createObjectAllValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectHasValue <em>Object Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectHasValue
	 * @generated
	 */
	public Adapter createObjectHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectHasSelf <em>Object Has Self</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectHasSelf
	 * @generated
	 */
	public Adapter createObjectHasSelfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectExactCardinality
	 * @generated
	 */
	public Adapter createObjectExactCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectMaxCardinality
	 * @generated
	 */
	public Adapter createObjectMaxCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectMinCardinality
	 * @generated
	 */
	public Adapter createObjectMinCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataPropertyRestriction <em>Data Property Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataPropertyRestriction
	 * @generated
	 */
	public Adapter createDataPropertyRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataSomeValuesFrom <em>Data Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataSomeValuesFrom
	 * @generated
	 */
	public Adapter createDataSomeValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataAllValuesFrom <em>Data All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataAllValuesFrom
	 * @generated
	 */
	public Adapter createDataAllValuesFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataHasValue <em>Data Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataHasValue
	 * @generated
	 */
	public Adapter createDataHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataExactCardinality <em>Data Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataExactCardinality
	 * @generated
	 */
	public Adapter createDataExactCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataMaxCardinality <em>Data Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataMaxCardinality
	 * @generated
	 */
	public Adapter createDataMaxCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataMinCardinality <em>Data Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataMinCardinality
	 * @generated
	 */
	public Adapter createDataMinCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.AnonymousIndividual <em>Anonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.AnonymousIndividual
	 * @generated
	 */
	public Adapter createAnonymousIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.EntityExpression <em>Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.EntityExpression
	 * @generated
	 */
	public Adapter createEntityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.IRIEntityExpression <em>IRI Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.IRIEntityExpression
	 * @generated
	 */
	public Adapter createIRIEntityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.PrefixEntityExpression <em>Prefix Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.PrefixEntityExpression
	 * @generated
	 */
	public Adapter createPrefixEntityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.NoPrefixEntityExpression <em>No Prefix Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.NoPrefixEntityExpression
	 * @generated
	 */
	public Adapter createNoPrefixEntityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectPropertyExpression <em>Object Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectPropertyExpression
	 * @generated
	 */
	public Adapter createObjectPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectPropertyChain <em>Object Property Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectPropertyChain
	 * @generated
	 */
	public Adapter createObjectPropertyChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataPropertyExpression <em>Data Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataPropertyExpression
	 * @generated
	 */
	public Adapter createDataPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.AnnotationPropertyExpression <em>Annotation Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.AnnotationPropertyExpression
	 * @generated
	 */
	public Adapter createAnnotationPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.SameIndividual <em>Same Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.SameIndividual
	 * @generated
	 */
	public Adapter createSameIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DifferentIndividuals <em>Different Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DifferentIndividuals
	 * @generated
	 */
	public Adapter createDifferentIndividualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ClassAssertion <em>Class Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ClassAssertion
	 * @generated
	 */
	public Adapter createClassAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.ObjectPropertyAssertion
	 * @generated
	 */
	public Adapter createObjectPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.NegativeObjectPropertyAssertion
	 * @generated
	 */
	public Adapter createNegativeObjectPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.DataPropertyAssertion <em>Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.DataPropertyAssertion
	 * @generated
	 */
	public Adapter createDataPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.owl.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.owl.NegativeDataPropertyAssertion
	 * @generated
	 */
	public Adapter createNegativeDataPropertyAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OWLAdapterFactory
