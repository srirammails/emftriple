/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import com.emf4sw.owl.IRIEntityExpression;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.InverseFunctionalObjectProperty;
import com.emf4sw.owl.InverseObjectProperties;
import com.emf4sw.owl.IrreflexiveObjectProperty;
import com.emf4sw.owl.Literal;
import com.emf4sw.owl.NamedIndividual;
import com.emf4sw.owl.Namespace;
import com.emf4sw.owl.NegativeDataPropertyAssertion;
import com.emf4sw.owl.NegativeObjectPropertyAssertion;
import com.emf4sw.owl.NoPrefixEntityExpression;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.OWLFactory;
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
import com.emf4sw.owl.PrefixEntityExpression;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLPackageImpl extends EPackageImpl implements OWLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classExpressionAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subClassOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointUnionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subObjectPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentObjectPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointObjectPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseObjectPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseFunctionalObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflexiveObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irreflexiveObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitiveObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assymmetricObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subDataPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointDataPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalentDataPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subAnnotationPropertyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataComplementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUnionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectUnionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIntersectionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectComplementOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectOneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHasSelfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSomeValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAllValuesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataHasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExactCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMaxCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataMinCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iriEntityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixEntityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noPrefixEntityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differentIndividualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeObjectPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeDataPropertyAssertionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.emf4sw.owl.OWLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OWLPackageImpl() {
		super(eNS_URI, OWLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OWLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OWLPackage init() {
		if (isInited) return (OWLPackage)EPackage.Registry.INSTANCE.getEPackage(OWLPackage.eNS_URI);

		// Obtain or create and register package
		OWLPackageImpl theOWLPackage = (OWLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OWLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OWLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOWLPackage.createPackageContents();

		// Initialize created meta-data
		theOWLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOWLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OWLPackage.eNS_URI, theOWLPackage);
		return theOWLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntology() {
		return ontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Namespaces() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOntology_URI() {
		return (EAttribute)ontologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Imports() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Annotations() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Axioms() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Name() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_URI() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxiom() {
		return axiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxiom_Annotations() {
		return (EReference)axiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxiom_Ontology() {
		return (EReference)axiomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassExpressionAxiom() {
		return classExpressionAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubClassOf() {
		return subClassOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_SubClass() {
		return (EReference)subClassOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubClassOf_SuperClass() {
		return (EReference)subClassOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointClasses() {
		return disjointClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_Expression() {
		return (EReference)disjointClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointClasses_DisjointClasses() {
		return (EReference)disjointClassesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentClasses() {
		return equivalentClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_Expression() {
		return (EReference)equivalentClassesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentClasses_EquivalentClasses() {
		return (EReference)equivalentClassesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointUnion() {
		return disjointUnionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_Expression() {
		return (EReference)disjointUnionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnion_DisjointClasses() {
		return (EReference)disjointUnionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyAxiom() {
		return objectPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubObjectPropertyOf() {
		return subObjectPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjectPropertyOf_SubObjectProperty() {
		return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubObjectPropertyOf_SuperObjectProperty() {
		return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyDomain() {
		return objectPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_Property() {
		return (EReference)objectPropertyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyDomain_Domain() {
		return (EReference)objectPropertyDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyRange() {
		return objectPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_Property() {
		return (EReference)objectPropertyRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyRange_Range() {
		return (EReference)objectPropertyRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentObjectProperties() {
		return equivalentObjectPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentObjectProperties_Property() {
		return (EReference)equivalentObjectPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentObjectProperties_EquivalentProperties() {
		return (EReference)equivalentObjectPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointObjectProperties() {
		return disjointObjectPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointObjectProperties_Property() {
		return (EReference)disjointObjectPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointObjectProperties_DisjointProperties() {
		return (EReference)disjointObjectPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseObjectProperties() {
		return inverseObjectPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseObjectProperties_Property() {
		return (EReference)inverseObjectPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseObjectProperties_InverseProperty() {
		return (EReference)inverseObjectPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalObjectProperty() {
		return functionalObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalObjectProperty_Property() {
		return (EReference)functionalObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseFunctionalObjectProperty() {
		return inverseFunctionalObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseFunctionalObjectProperty_Property() {
		return (EReference)inverseFunctionalObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetricObjectProperty() {
		return symmetricObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymmetricObjectProperty_Property() {
		return (EReference)symmetricObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflexiveObjectProperty() {
		return reflexiveObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReflexiveObjectProperty_Property() {
		return (EReference)reflexiveObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrreflexiveObjectProperty() {
		return irreflexiveObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrreflexiveObjectProperty_Property() {
		return (EReference)irreflexiveObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitiveObjectProperty() {
		return transitiveObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitiveObjectProperty_Property() {
		return (EReference)transitiveObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssymmetricObjectProperty() {
		return assymmetricObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssymmetricObjectProperty_Property() {
		return (EReference)assymmetricObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyAxiom() {
		return dataPropertyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubDataPropertyOf() {
		return subDataPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDataPropertyOf_SubDataProperty() {
		return (EReference)subDataPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubDataPropertyOf_SuperDataProperty() {
		return (EReference)subDataPropertyOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointDataProperties() {
		return disjointDataPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointDataProperties_Property() {
		return (EReference)disjointDataPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointDataProperties_DisjointProperties() {
		return (EReference)disjointDataPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalentDataProperties() {
		return equivalentDataPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentDataProperties_Property() {
		return (EReference)equivalentDataPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquivalentDataProperties_EquivalentProperties() {
		return (EReference)equivalentDataPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyDomain() {
		return dataPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_Property() {
		return (EReference)dataPropertyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyDomain_Domain() {
		return (EReference)dataPropertyDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyRange() {
		return dataPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_Property() {
		return (EReference)dataPropertyRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyRange_Range() {
		return (EReference)dataPropertyRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDataProperty() {
		return functionalDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDataProperty_Property() {
		return (EReference)functionalDataPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAxiom() {
		return annotationAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAxiom_Property() {
		return (EReference)annotationAxiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationAssertion() {
		return annotationAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_Subject() {
		return (EReference)annotationAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationAssertion_Value() {
		return (EReference)annotationAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubAnnotationPropertyOf() {
		return subAnnotationPropertyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAnnotationPropertyOf_SubAnnotationProperty() {
		return (EReference)subAnnotationPropertyOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAnnotationPropertyOf_SuperAnnotationProperty() {
		return (EReference)subAnnotationPropertyOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationPropertyDomain() {
		return annotationPropertyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyDomain_Domain() {
		return (EReference)annotationPropertyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationPropertyRange() {
		return annotationPropertyRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyRange_Range() {
		return (EReference)annotationPropertyRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasKey() {
		return hasKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasKey_ClassExpression() {
		return (EReference)hasKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRange() {
		return dataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataComplementOf() {
		return dataComplementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataComplementOf_DataRange() {
		return (EReference)dataComplementOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUnionOf() {
		return dataUnionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnionOf_DataRanges() {
		return (EReference)dataUnionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOneOf() {
		return dataOneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOneOf_Literals() {
		return (EReference)dataOneOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeRestriction() {
		return datatypeRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeRestriction_Datatype() {
		return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeRestriction_Restrictions() {
		return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetRestriction() {
		return facetRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetRestriction_Datatype() {
		return (EReference)facetRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetRestriction_Value() {
		return (EReference)facetRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataIntersectionOf() {
		return dataIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataIntersectionOf_DataRanges() {
		return (EReference)dataIntersectionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinition() {
		return datatypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_Datatype() {
		return (EReference)datatypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinition_Restriction() {
		return (EReference)datatypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_Entity() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Namespace() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Expressions() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLClass() {
		return owlClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLProperty() {
		return owlPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectProperty() {
		return objectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProperty() {
		return dataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedIndividual() {
		return namedIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationProperty() {
		return annotationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassExpression() {
		return classExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectUnionOf() {
		return objectUnionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnionOf_UnionOf() {
		return (EReference)objectUnionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIntersectionOf() {
		return objectIntersectionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIntersectionOf_IntersectionOf() {
		return (EReference)objectIntersectionOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectComplementOf() {
		return objectComplementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectComplementOf_ComplementOf() {
		return (EReference)objectComplementOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectOneOf() {
		return objectOneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectOneOf_OneOf() {
		return (EReference)objectOneOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyRestriction() {
		return objectPropertyRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSomeValuesFrom() {
		return objectSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_OnProperty() {
		return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSomeValuesFrom_SomeValuesFrom() {
		return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAllValuesFrom() {
		return objectAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_OnProperty() {
		return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectAllValuesFrom_AllValuesFrom() {
		return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHasValue() {
		return objectHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_OnProperty() {
		return (EReference)objectHasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasValue_HasValue() {
		return (EReference)objectHasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHasSelf() {
		return objectHasSelfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHasSelf_OnProperty() {
		return (EReference)objectHasSelfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExactCardinality() {
		return objectExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_OnProperty() {
		return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectExactCardinality_Cardinality() {
		return (EAttribute)objectExactCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExactCardinality_OnClass() {
		return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMaxCardinality() {
		return objectMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_OnProperty() {
		return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMaxCardinality_Cardinality() {
		return (EAttribute)objectMaxCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMaxCardinality_OnClass() {
		return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMinCardinality() {
		return objectMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_OnProperty() {
		return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectMinCardinality_Cardinality() {
		return (EAttribute)objectMinCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectMinCardinality_OnClass() {
		return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyRestriction() {
		return dataPropertyRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSomeValuesFrom() {
		return dataSomeValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_OnProperties() {
		return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSomeValuesFrom_SomeValuesFrom() {
		return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAllValuesFrom() {
		return dataAllValuesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_OnProperties() {
		return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAllValuesFrom_AllValuesFrom() {
		return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataHasValue() {
		return dataHasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_OnProperty() {
		return (EReference)dataHasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataHasValue_HasValue() {
		return (EReference)dataHasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExactCardinality() {
		return dataExactCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_OnProperty() {
		return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataExactCardinality_Cardinality() {
		return (EAttribute)dataExactCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExactCardinality_OnDataRange() {
		return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMaxCardinality() {
		return dataMaxCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_OnProperty() {
		return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMaxCardinality_Cardinality() {
		return (EAttribute)dataMaxCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMaxCardinality_OnDataRange() {
		return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataMinCardinality() {
		return dataMinCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_OnProperty() {
		return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataMinCardinality_Cardinality() {
		return (EAttribute)dataMinCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataMinCardinality_OnDataRange() {
		return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousIndividual() {
		return anonymousIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymousIndividual_NodeID() {
		return (EAttribute)anonymousIndividualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityExpression() {
		return entityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRIEntityExpression() {
		return iriEntityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRIEntityExpression_IRI() {
		return (EAttribute)iriEntityExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefixEntityExpression() {
		return prefixEntityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefixEntityExpression_Namespace() {
		return (EReference)prefixEntityExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefixEntityExpression_Reference() {
		return (EReference)prefixEntityExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoPrefixEntityExpression() {
		return noPrefixEntityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoPrefixEntityExpression_Reference() {
		return (EReference)noPrefixEntityExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyExpression() {
		return objectPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyChain() {
		return objectPropertyChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyChain_Properties() {
		return (EReference)objectPropertyChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyExpression() {
		return dataPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationPropertyExpression() {
		return annotationPropertyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteral_DatatypeExpression() {
		return (EReference)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Annotations() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Property() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Value() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameIndividual() {
		return sameIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSameIndividual_Individuals() {
		return (EReference)sameIndividualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifferentIndividuals() {
		return differentIndividualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentIndividuals_Individuals() {
		return (EReference)differentIndividualsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAssertion() {
		return classAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_ClassExpression() {
		return (EReference)classAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassAssertion_Individual() {
		return (EReference)classAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectPropertyAssertion() {
		return objectPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_ObjectProperty() {
		return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_SourceIndividual() {
		return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectPropertyAssertion_TargetIndividual() {
		return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeObjectPropertyAssertion() {
		return negativeObjectPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_ObjectProperty() {
		return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_SourceIndividual() {
		return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeObjectPropertyAssertion_TargetIndividual() {
		return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyAssertion() {
		return dataPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_DataProperty() {
		return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_SourceIndividual() {
		return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyAssertion_TargetValue() {
		return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeDataPropertyAssertion() {
		return negativeDataPropertyAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_DataProperty() {
		return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_SourceIndividual() {
		return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeDataPropertyAssertion_TargetValue() {
		return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLFactory getOWLFactory() {
		return (OWLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ontologyEClass = createEClass(ONTOLOGY);
		createEReference(ontologyEClass, ONTOLOGY__NAMESPACES);
		createEAttribute(ontologyEClass, ONTOLOGY__URI);
		createEReference(ontologyEClass, ONTOLOGY__IMPORTS);
		createEReference(ontologyEClass, ONTOLOGY__ANNOTATIONS);
		createEReference(ontologyEClass, ONTOLOGY__AXIOMS);

		entityExpressionEClass = createEClass(ENTITY_EXPRESSION);

		iriEntityExpressionEClass = createEClass(IRI_ENTITY_EXPRESSION);
		createEAttribute(iriEntityExpressionEClass, IRI_ENTITY_EXPRESSION__IRI);

		prefixEntityExpressionEClass = createEClass(PREFIX_ENTITY_EXPRESSION);
		createEReference(prefixEntityExpressionEClass, PREFIX_ENTITY_EXPRESSION__NAMESPACE);
		createEReference(prefixEntityExpressionEClass, PREFIX_ENTITY_EXPRESSION__REFERENCE);

		noPrefixEntityExpressionEClass = createEClass(NO_PREFIX_ENTITY_EXPRESSION);
		createEReference(noPrefixEntityExpressionEClass, NO_PREFIX_ENTITY_EXPRESSION__REFERENCE);

		namespaceEClass = createEClass(NAMESPACE);
		createEAttribute(namespaceEClass, NAMESPACE__NAME);
		createEAttribute(namespaceEClass, NAMESPACE__URI);

		axiomEClass = createEClass(AXIOM);
		createEReference(axiomEClass, AXIOM__ANNOTATIONS);
		createEReference(axiomEClass, AXIOM__ONTOLOGY);

		classExpressionAxiomEClass = createEClass(CLASS_EXPRESSION_AXIOM);

		subClassOfEClass = createEClass(SUB_CLASS_OF);
		createEReference(subClassOfEClass, SUB_CLASS_OF__SUB_CLASS);
		createEReference(subClassOfEClass, SUB_CLASS_OF__SUPER_CLASS);

		disjointClassesEClass = createEClass(DISJOINT_CLASSES);
		createEReference(disjointClassesEClass, DISJOINT_CLASSES__EXPRESSION);
		createEReference(disjointClassesEClass, DISJOINT_CLASSES__DISJOINT_CLASSES);

		equivalentClassesEClass = createEClass(EQUIVALENT_CLASSES);
		createEReference(equivalentClassesEClass, EQUIVALENT_CLASSES__EXPRESSION);
		createEReference(equivalentClassesEClass, EQUIVALENT_CLASSES__EQUIVALENT_CLASSES);

		disjointUnionEClass = createEClass(DISJOINT_UNION);
		createEReference(disjointUnionEClass, DISJOINT_UNION__EXPRESSION);
		createEReference(disjointUnionEClass, DISJOINT_UNION__DISJOINT_CLASSES);

		objectPropertyAxiomEClass = createEClass(OBJECT_PROPERTY_AXIOM);

		subObjectPropertyOfEClass = createEClass(SUB_OBJECT_PROPERTY_OF);
		createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY);
		createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY);

		objectPropertyDomainEClass = createEClass(OBJECT_PROPERTY_DOMAIN);
		createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__PROPERTY);
		createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__DOMAIN);

		objectPropertyRangeEClass = createEClass(OBJECT_PROPERTY_RANGE);
		createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__PROPERTY);
		createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__RANGE);

		equivalentObjectPropertiesEClass = createEClass(EQUIVALENT_OBJECT_PROPERTIES);
		createEReference(equivalentObjectPropertiesEClass, EQUIVALENT_OBJECT_PROPERTIES__PROPERTY);
		createEReference(equivalentObjectPropertiesEClass, EQUIVALENT_OBJECT_PROPERTIES__EQUIVALENT_PROPERTIES);

		disjointObjectPropertiesEClass = createEClass(DISJOINT_OBJECT_PROPERTIES);
		createEReference(disjointObjectPropertiesEClass, DISJOINT_OBJECT_PROPERTIES__PROPERTY);
		createEReference(disjointObjectPropertiesEClass, DISJOINT_OBJECT_PROPERTIES__DISJOINT_PROPERTIES);

		inverseObjectPropertiesEClass = createEClass(INVERSE_OBJECT_PROPERTIES);
		createEReference(inverseObjectPropertiesEClass, INVERSE_OBJECT_PROPERTIES__PROPERTY);
		createEReference(inverseObjectPropertiesEClass, INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY);

		functionalObjectPropertyEClass = createEClass(FUNCTIONAL_OBJECT_PROPERTY);
		createEReference(functionalObjectPropertyEClass, FUNCTIONAL_OBJECT_PROPERTY__PROPERTY);

		inverseFunctionalObjectPropertyEClass = createEClass(INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
		createEReference(inverseFunctionalObjectPropertyEClass, INVERSE_FUNCTIONAL_OBJECT_PROPERTY__PROPERTY);

		symmetricObjectPropertyEClass = createEClass(SYMMETRIC_OBJECT_PROPERTY);
		createEReference(symmetricObjectPropertyEClass, SYMMETRIC_OBJECT_PROPERTY__PROPERTY);

		reflexiveObjectPropertyEClass = createEClass(REFLEXIVE_OBJECT_PROPERTY);
		createEReference(reflexiveObjectPropertyEClass, REFLEXIVE_OBJECT_PROPERTY__PROPERTY);

		irreflexiveObjectPropertyEClass = createEClass(IRREFLEXIVE_OBJECT_PROPERTY);
		createEReference(irreflexiveObjectPropertyEClass, IRREFLEXIVE_OBJECT_PROPERTY__PROPERTY);

		transitiveObjectPropertyEClass = createEClass(TRANSITIVE_OBJECT_PROPERTY);
		createEReference(transitiveObjectPropertyEClass, TRANSITIVE_OBJECT_PROPERTY__PROPERTY);

		assymmetricObjectPropertyEClass = createEClass(ASSYMMETRIC_OBJECT_PROPERTY);
		createEReference(assymmetricObjectPropertyEClass, ASSYMMETRIC_OBJECT_PROPERTY__PROPERTY);

		dataPropertyAxiomEClass = createEClass(DATA_PROPERTY_AXIOM);

		subDataPropertyOfEClass = createEClass(SUB_DATA_PROPERTY_OF);
		createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY);
		createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY);

		disjointDataPropertiesEClass = createEClass(DISJOINT_DATA_PROPERTIES);
		createEReference(disjointDataPropertiesEClass, DISJOINT_DATA_PROPERTIES__PROPERTY);
		createEReference(disjointDataPropertiesEClass, DISJOINT_DATA_PROPERTIES__DISJOINT_PROPERTIES);

		equivalentDataPropertiesEClass = createEClass(EQUIVALENT_DATA_PROPERTIES);
		createEReference(equivalentDataPropertiesEClass, EQUIVALENT_DATA_PROPERTIES__PROPERTY);
		createEReference(equivalentDataPropertiesEClass, EQUIVALENT_DATA_PROPERTIES__EQUIVALENT_PROPERTIES);

		dataPropertyDomainEClass = createEClass(DATA_PROPERTY_DOMAIN);
		createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__PROPERTY);
		createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__DOMAIN);

		dataPropertyRangeEClass = createEClass(DATA_PROPERTY_RANGE);
		createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__PROPERTY);
		createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__RANGE);

		functionalDataPropertyEClass = createEClass(FUNCTIONAL_DATA_PROPERTY);
		createEReference(functionalDataPropertyEClass, FUNCTIONAL_DATA_PROPERTY__PROPERTY);

		annotationAxiomEClass = createEClass(ANNOTATION_AXIOM);
		createEReference(annotationAxiomEClass, ANNOTATION_AXIOM__PROPERTY);

		annotationAssertionEClass = createEClass(ANNOTATION_ASSERTION);
		createEReference(annotationAssertionEClass, ANNOTATION_ASSERTION__SUBJECT);
		createEReference(annotationAssertionEClass, ANNOTATION_ASSERTION__VALUE);

		subAnnotationPropertyOfEClass = createEClass(SUB_ANNOTATION_PROPERTY_OF);
		createEReference(subAnnotationPropertyOfEClass, SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY);
		createEReference(subAnnotationPropertyOfEClass, SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY);

		annotationPropertyDomainEClass = createEClass(ANNOTATION_PROPERTY_DOMAIN);
		createEReference(annotationPropertyDomainEClass, ANNOTATION_PROPERTY_DOMAIN__DOMAIN);

		annotationPropertyRangeEClass = createEClass(ANNOTATION_PROPERTY_RANGE);
		createEReference(annotationPropertyRangeEClass, ANNOTATION_PROPERTY_RANGE__RANGE);

		hasKeyEClass = createEClass(HAS_KEY);
		createEReference(hasKeyEClass, HAS_KEY__CLASS_EXPRESSION);

		dataRangeEClass = createEClass(DATA_RANGE);

		dataComplementOfEClass = createEClass(DATA_COMPLEMENT_OF);
		createEReference(dataComplementOfEClass, DATA_COMPLEMENT_OF__DATA_RANGE);

		dataUnionOfEClass = createEClass(DATA_UNION_OF);
		createEReference(dataUnionOfEClass, DATA_UNION_OF__DATA_RANGES);

		dataOneOfEClass = createEClass(DATA_ONE_OF);
		createEReference(dataOneOfEClass, DATA_ONE_OF__LITERALS);

		datatypeRestrictionEClass = createEClass(DATATYPE_RESTRICTION);
		createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__DATATYPE);
		createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__RESTRICTIONS);

		facetRestrictionEClass = createEClass(FACET_RESTRICTION);
		createEReference(facetRestrictionEClass, FACET_RESTRICTION__DATATYPE);
		createEReference(facetRestrictionEClass, FACET_RESTRICTION__VALUE);

		dataIntersectionOfEClass = createEClass(DATA_INTERSECTION_OF);
		createEReference(dataIntersectionOfEClass, DATA_INTERSECTION_OF__DATA_RANGES);

		datatypeDefinitionEClass = createEClass(DATATYPE_DEFINITION);
		createEReference(datatypeDefinitionEClass, DATATYPE_DEFINITION__DATATYPE);
		createEReference(datatypeDefinitionEClass, DATATYPE_DEFINITION__RESTRICTION);

		declarationEClass = createEClass(DECLARATION);
		createEReference(declarationEClass, DECLARATION__ENTITY);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEReference(entityEClass, ENTITY__NAMESPACE);
		createEReference(entityEClass, ENTITY__EXPRESSIONS);

		owlClassEClass = createEClass(OWL_CLASS);

		owlPropertyEClass = createEClass(OWL_PROPERTY);

		objectPropertyEClass = createEClass(OBJECT_PROPERTY);

		dataPropertyEClass = createEClass(DATA_PROPERTY);

		datatypeEClass = createEClass(DATATYPE);

		namedIndividualEClass = createEClass(NAMED_INDIVIDUAL);

		annotationPropertyEClass = createEClass(ANNOTATION_PROPERTY);

		classExpressionEClass = createEClass(CLASS_EXPRESSION);

		objectUnionOfEClass = createEClass(OBJECT_UNION_OF);
		createEReference(objectUnionOfEClass, OBJECT_UNION_OF__UNION_OF);

		objectIntersectionOfEClass = createEClass(OBJECT_INTERSECTION_OF);
		createEReference(objectIntersectionOfEClass, OBJECT_INTERSECTION_OF__INTERSECTION_OF);

		objectComplementOfEClass = createEClass(OBJECT_COMPLEMENT_OF);
		createEReference(objectComplementOfEClass, OBJECT_COMPLEMENT_OF__COMPLEMENT_OF);

		objectOneOfEClass = createEClass(OBJECT_ONE_OF);
		createEReference(objectOneOfEClass, OBJECT_ONE_OF__ONE_OF);

		objectPropertyRestrictionEClass = createEClass(OBJECT_PROPERTY_RESTRICTION);

		objectSomeValuesFromEClass = createEClass(OBJECT_SOME_VALUES_FROM);
		createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__ON_PROPERTY);
		createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM);

		objectAllValuesFromEClass = createEClass(OBJECT_ALL_VALUES_FROM);
		createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__ON_PROPERTY);
		createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM);

		objectHasValueEClass = createEClass(OBJECT_HAS_VALUE);
		createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__ON_PROPERTY);
		createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__HAS_VALUE);

		objectHasSelfEClass = createEClass(OBJECT_HAS_SELF);
		createEReference(objectHasSelfEClass, OBJECT_HAS_SELF__ON_PROPERTY);

		objectExactCardinalityEClass = createEClass(OBJECT_EXACT_CARDINALITY);
		createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__ON_PROPERTY);
		createEAttribute(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CARDINALITY);
		createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__ON_CLASS);

		objectMaxCardinalityEClass = createEClass(OBJECT_MAX_CARDINALITY);
		createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__ON_PROPERTY);
		createEAttribute(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CARDINALITY);
		createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__ON_CLASS);

		objectMinCardinalityEClass = createEClass(OBJECT_MIN_CARDINALITY);
		createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__ON_PROPERTY);
		createEAttribute(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CARDINALITY);
		createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__ON_CLASS);

		dataPropertyRestrictionEClass = createEClass(DATA_PROPERTY_RESTRICTION);

		dataSomeValuesFromEClass = createEClass(DATA_SOME_VALUES_FROM);
		createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__ON_PROPERTIES);
		createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__SOME_VALUES_FROM);

		dataAllValuesFromEClass = createEClass(DATA_ALL_VALUES_FROM);
		createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__ON_PROPERTIES);
		createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__ALL_VALUES_FROM);

		dataHasValueEClass = createEClass(DATA_HAS_VALUE);
		createEReference(dataHasValueEClass, DATA_HAS_VALUE__ON_PROPERTY);
		createEReference(dataHasValueEClass, DATA_HAS_VALUE__HAS_VALUE);

		dataExactCardinalityEClass = createEClass(DATA_EXACT_CARDINALITY);
		createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__ON_PROPERTY);
		createEAttribute(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__CARDINALITY);
		createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__ON_DATA_RANGE);

		dataMaxCardinalityEClass = createEClass(DATA_MAX_CARDINALITY);
		createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__ON_PROPERTY);
		createEAttribute(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__CARDINALITY);
		createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__ON_DATA_RANGE);

		dataMinCardinalityEClass = createEClass(DATA_MIN_CARDINALITY);
		createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__ON_PROPERTY);
		createEAttribute(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__CARDINALITY);
		createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__ON_DATA_RANGE);

		individualEClass = createEClass(INDIVIDUAL);

		anonymousIndividualEClass = createEClass(ANONYMOUS_INDIVIDUAL);
		createEAttribute(anonymousIndividualEClass, ANONYMOUS_INDIVIDUAL__NODE_ID);

		objectPropertyExpressionEClass = createEClass(OBJECT_PROPERTY_EXPRESSION);

		objectPropertyChainEClass = createEClass(OBJECT_PROPERTY_CHAIN);
		createEReference(objectPropertyChainEClass, OBJECT_PROPERTY_CHAIN__PROPERTIES);

		dataPropertyExpressionEClass = createEClass(DATA_PROPERTY_EXPRESSION);

		annotationPropertyExpressionEClass = createEClass(ANNOTATION_PROPERTY_EXPRESSION);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__VALUE);
		createEReference(literalEClass, LITERAL__DATATYPE_EXPRESSION);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__ANNOTATIONS);
		createEReference(annotationEClass, ANNOTATION__PROPERTY);
		createEReference(annotationEClass, ANNOTATION__VALUE);

		assertionEClass = createEClass(ASSERTION);

		sameIndividualEClass = createEClass(SAME_INDIVIDUAL);
		createEReference(sameIndividualEClass, SAME_INDIVIDUAL__INDIVIDUALS);

		differentIndividualsEClass = createEClass(DIFFERENT_INDIVIDUALS);
		createEReference(differentIndividualsEClass, DIFFERENT_INDIVIDUALS__INDIVIDUALS);

		classAssertionEClass = createEClass(CLASS_ASSERTION);
		createEReference(classAssertionEClass, CLASS_ASSERTION__CLASS_EXPRESSION);
		createEReference(classAssertionEClass, CLASS_ASSERTION__INDIVIDUAL);

		objectPropertyAssertionEClass = createEClass(OBJECT_PROPERTY_ASSERTION);
		createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY);
		createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
		createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

		negativeObjectPropertyAssertionEClass = createEClass(NEGATIVE_OBJECT_PROPERTY_ASSERTION);
		createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY);
		createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
		createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

		dataPropertyAssertionEClass = createEClass(DATA_PROPERTY_ASSERTION);
		createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__DATA_PROPERTY);
		createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
		createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__TARGET_VALUE);

		negativeDataPropertyAssertionEClass = createEClass(NEGATIVE_DATA_PROPERTY_ASSERTION);
		createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY);
		createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
		createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityExpressionEClass.getESuperTypes().add(this.getDataRange());
		entityExpressionEClass.getESuperTypes().add(this.getClassExpression());
		entityExpressionEClass.getESuperTypes().add(this.getIndividual());
		entityExpressionEClass.getESuperTypes().add(this.getObjectPropertyExpression());
		entityExpressionEClass.getESuperTypes().add(this.getDataPropertyExpression());
		entityExpressionEClass.getESuperTypes().add(this.getAnnotationPropertyExpression());
		iriEntityExpressionEClass.getESuperTypes().add(this.getEntityExpression());
		prefixEntityExpressionEClass.getESuperTypes().add(this.getEntityExpression());
		noPrefixEntityExpressionEClass.getESuperTypes().add(this.getEntityExpression());
		classExpressionAxiomEClass.getESuperTypes().add(this.getAxiom());
		subClassOfEClass.getESuperTypes().add(this.getClassExpressionAxiom());
		disjointClassesEClass.getESuperTypes().add(this.getClassExpressionAxiom());
		equivalentClassesEClass.getESuperTypes().add(this.getClassExpressionAxiom());
		disjointUnionEClass.getESuperTypes().add(this.getClassExpressionAxiom());
		objectPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
		subObjectPropertyOfEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		objectPropertyDomainEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		objectPropertyRangeEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		equivalentObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		disjointObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		inverseObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		functionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		inverseFunctionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		symmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		reflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		irreflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		transitiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		assymmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
		dataPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
		subDataPropertyOfEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		disjointDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		equivalentDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		dataPropertyDomainEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		dataPropertyRangeEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		functionalDataPropertyEClass.getESuperTypes().add(this.getDataPropertyAxiom());
		annotationAxiomEClass.getESuperTypes().add(this.getAxiom());
		annotationAssertionEClass.getESuperTypes().add(this.getAnnotationAxiom());
		subAnnotationPropertyOfEClass.getESuperTypes().add(this.getAnnotationAxiom());
		annotationPropertyDomainEClass.getESuperTypes().add(this.getAnnotationAxiom());
		annotationPropertyRangeEClass.getESuperTypes().add(this.getAnnotationAxiom());
		hasKeyEClass.getESuperTypes().add(this.getAxiom());
		dataComplementOfEClass.getESuperTypes().add(this.getDataRange());
		dataUnionOfEClass.getESuperTypes().add(this.getDataRange());
		dataOneOfEClass.getESuperTypes().add(this.getDataRange());
		datatypeRestrictionEClass.getESuperTypes().add(this.getDataRange());
		dataIntersectionOfEClass.getESuperTypes().add(this.getDataRange());
		datatypeDefinitionEClass.getESuperTypes().add(this.getAxiom());
		declarationEClass.getESuperTypes().add(this.getAxiom());
		owlClassEClass.getESuperTypes().add(this.getEntity());
		owlClassEClass.getESuperTypes().add(this.getClassExpression());
		owlPropertyEClass.getESuperTypes().add(this.getEntity());
		objectPropertyEClass.getESuperTypes().add(this.getOWLProperty());
		dataPropertyEClass.getESuperTypes().add(this.getOWLProperty());
		datatypeEClass.getESuperTypes().add(this.getEntity());
		datatypeEClass.getESuperTypes().add(this.getDataRange());
		namedIndividualEClass.getESuperTypes().add(this.getEntity());
		namedIndividualEClass.getESuperTypes().add(this.getIndividual());
		annotationPropertyEClass.getESuperTypes().add(this.getEntity());
		annotationPropertyEClass.getESuperTypes().add(this.getOWLProperty());
		objectUnionOfEClass.getESuperTypes().add(this.getClassExpression());
		objectIntersectionOfEClass.getESuperTypes().add(this.getClassExpression());
		objectComplementOfEClass.getESuperTypes().add(this.getClassExpression());
		objectOneOfEClass.getESuperTypes().add(this.getClassExpression());
		objectPropertyRestrictionEClass.getESuperTypes().add(this.getClassExpression());
		objectSomeValuesFromEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectAllValuesFromEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectHasValueEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectHasSelfEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectExactCardinalityEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectMaxCardinalityEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		objectMinCardinalityEClass.getESuperTypes().add(this.getObjectPropertyRestriction());
		dataPropertyRestrictionEClass.getESuperTypes().add(this.getClassExpression());
		dataSomeValuesFromEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataAllValuesFromEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataHasValueEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataExactCardinalityEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataMaxCardinalityEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		dataMinCardinalityEClass.getESuperTypes().add(this.getDataPropertyRestriction());
		anonymousIndividualEClass.getESuperTypes().add(this.getIndividual());
		objectPropertyChainEClass.getESuperTypes().add(this.getObjectPropertyExpression());
		assertionEClass.getESuperTypes().add(this.getAxiom());
		sameIndividualEClass.getESuperTypes().add(this.getAssertion());
		differentIndividualsEClass.getESuperTypes().add(this.getAssertion());
		classAssertionEClass.getESuperTypes().add(this.getAssertion());
		objectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		negativeObjectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		dataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
		negativeDataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());

		// Initialize classes and features; add operations and parameters
		initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntology_Namespaces(), this.getNamespace(), null, "namespaces", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOntology_URI(), ecorePackage.getEString(), "URI", null, 0, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_Imports(), this.getOntology(), null, "imports", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_Axioms(), this.getAxiom(), this.getAxiom_Ontology(), "axioms", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ontologyEClass, this.getClassExpression(), "listClassExpressions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ontologyEClass, this.getOWLClass(), "listClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ontologyEClass, this.getObjectProperty(), "listObjectProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ontologyEClass, this.getDataProperty(), "listDataProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ontologyEClass, this.getIndividual(), "listIndividuals", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ontologyEClass, this.getNamedIndividual(), "listNamedIndividuals", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ontologyEClass, this.getDatatype(), "listDatatypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(ontologyEClass, this.getOWLClass(), "getOWLClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "aURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ontologyEClass, this.getObjectProperty(), "getObjectProperty", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "aURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ontologyEClass, this.getDataProperty(), "getDataProperty", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "aURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ontologyEClass, this.getNamedIndividual(), "getNamedIndividual", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "aURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ontologyEClass, this.getNamespace(), "getNamespace", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "aPrefix", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ontologyEClass, this.getAnnotation(), "getAnnotation", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "aURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityExpressionEClass, EntityExpression.class, "EntityExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityExpressionEClass, this.getEntity(), "getEntity", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iriEntityExpressionEClass, IRIEntityExpression.class, "IRIEntityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRIEntityExpression_IRI(), ecorePackage.getEString(), "IRI", null, 1, 1, IRIEntityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prefixEntityExpressionEClass, PrefixEntityExpression.class, "PrefixEntityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrefixEntityExpression_Namespace(), this.getNamespace(), null, "namespace", null, 1, 1, PrefixEntityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefixEntityExpression_Reference(), this.getEntity(), null, "reference", null, 1, 1, PrefixEntityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noPrefixEntityExpressionEClass, NoPrefixEntityExpression.class, "NoPrefixEntityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNoPrefixEntityExpression_Reference(), this.getEntity(), null, "reference", null, 1, 1, NoPrefixEntityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespace_URI(), ecorePackage.getEString(), "URI", null, 1, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axiomEClass, Axiom.class, "Axiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxiom_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Axiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxiom_Ontology(), this.getOntology(), this.getOntology_Axioms(), "ontology", null, 1, 1, Axiom.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(axiomEClass, ecorePackage.getEJavaObject(), "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(classExpressionAxiomEClass, ClassExpressionAxiom.class, "ClassExpressionAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subClassOfEClass, SubClassOf.class, "SubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubClassOf_SubClass(), this.getClassExpression(), null, "subClass", null, 0, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubClassOf_SuperClass(), this.getClassExpression(), null, "superClass", null, 0, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjointClassesEClass, DisjointClasses.class, "DisjointClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointClasses_Expression(), this.getClassExpression(), null, "expression", null, 0, 1, DisjointClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisjointClasses_DisjointClasses(), this.getClassExpression(), null, "disjointClasses", null, 0, -1, DisjointClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentClassesEClass, EquivalentClasses.class, "EquivalentClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentClasses_Expression(), this.getClassExpression(), null, "expression", null, 0, 1, EquivalentClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentClasses_EquivalentClasses(), this.getClassExpression(), null, "equivalentClasses", null, 0, -1, EquivalentClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjointUnionEClass, DisjointUnion.class, "DisjointUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointUnion_Expression(), this.getClassExpression(), null, "expression", null, 0, 1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisjointUnion_DisjointClasses(), this.getClassExpression(), null, "disjointClasses", null, 0, -1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyAxiomEClass, ObjectPropertyAxiom.class, "ObjectPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subObjectPropertyOfEClass, SubObjectPropertyOf.class, "SubObjectPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubObjectPropertyOf_SubObjectProperty(), this.getObjectPropertyExpression(), null, "subObjectProperty", null, 0, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubObjectPropertyOf_SuperObjectProperty(), this.getObjectPropertyExpression(), null, "superObjectProperty", null, 0, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyDomainEClass, ObjectPropertyDomain.class, "ObjectPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyDomain_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 0, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyRangeEClass, ObjectPropertyRange.class, "ObjectPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyRange_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectPropertyRange_Range(), this.getClassExpression(), null, "range", null, 0, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentObjectPropertiesEClass, EquivalentObjectProperties.class, "EquivalentObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentObjectProperties_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, EquivalentObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentObjectProperties_EquivalentProperties(), this.getObjectPropertyExpression(), null, "equivalentProperties", null, 0, -1, EquivalentObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjointObjectPropertiesEClass, DisjointObjectProperties.class, "DisjointObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointObjectProperties_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, DisjointObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisjointObjectProperties_DisjointProperties(), this.getObjectPropertyExpression(), null, "disjointProperties", null, 0, -1, DisjointObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inverseObjectPropertiesEClass, InverseObjectProperties.class, "InverseObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverseObjectProperties_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, InverseObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverseObjectProperties_InverseProperty(), this.getObjectPropertyExpression(), null, "inverseProperty", null, 0, 1, InverseObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalObjectPropertyEClass, FunctionalObjectProperty.class, "FunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalObjectProperty_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, FunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inverseFunctionalObjectPropertyEClass, InverseFunctionalObjectProperty.class, "InverseFunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverseFunctionalObjectProperty_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, InverseFunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symmetricObjectPropertyEClass, SymmetricObjectProperty.class, "SymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymmetricObjectProperty_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, SymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflexiveObjectPropertyEClass, ReflexiveObjectProperty.class, "ReflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReflexiveObjectProperty_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, ReflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(irreflexiveObjectPropertyEClass, IrreflexiveObjectProperty.class, "IrreflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIrreflexiveObjectProperty_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, IrreflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitiveObjectPropertyEClass, TransitiveObjectProperty.class, "TransitiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitiveObjectProperty_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, TransitiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assymmetricObjectPropertyEClass, AssymmetricObjectProperty.class, "AssymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssymmetricObjectProperty_Property(), this.getObjectPropertyExpression(), null, "property", null, 0, 1, AssymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyAxiomEClass, DataPropertyAxiom.class, "DataPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subDataPropertyOfEClass, SubDataPropertyOf.class, "SubDataPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubDataPropertyOf_SubDataProperty(), this.getDataPropertyExpression(), null, "subDataProperty", null, 0, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubDataPropertyOf_SuperDataProperty(), this.getDataPropertyExpression(), null, "superDataProperty", null, 0, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjointDataPropertiesEClass, DisjointDataProperties.class, "DisjointDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjointDataProperties_Property(), this.getDataPropertyExpression(), null, "property", null, 0, 1, DisjointDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisjointDataProperties_DisjointProperties(), this.getDataPropertyExpression(), null, "disjointProperties", null, 0, -1, DisjointDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalentDataPropertiesEClass, EquivalentDataProperties.class, "EquivalentDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquivalentDataProperties_Property(), this.getDataPropertyExpression(), null, "property", null, 0, 1, EquivalentDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquivalentDataProperties_EquivalentProperties(), this.getDataPropertyExpression(), null, "equivalentProperties", null, 0, -1, EquivalentDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyDomainEClass, DataPropertyDomain.class, "DataPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyDomain_Property(), this.getDataPropertyExpression(), null, "property", null, 0, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 0, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyRangeEClass, DataPropertyRange.class, "DataPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyRange_Property(), this.getDataPropertyExpression(), null, "property", null, 0, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyRange_Range(), this.getDataRange(), null, "range", null, 0, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalDataPropertyEClass, FunctionalDataProperty.class, "FunctionalDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalDataProperty_Property(), this.getDataPropertyExpression(), null, "property", null, 0, 1, FunctionalDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationAxiomEClass, AnnotationAxiom.class, "AnnotationAxiom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationAxiom_Property(), this.getAnnotationPropertyExpression(), null, "property", null, 0, 1, AnnotationAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationAssertionEClass, AnnotationAssertion.class, "AnnotationAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationAssertion_Subject(), this.getEntityExpression(), null, "subject", null, 0, 1, AnnotationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationAssertion_Value(), this.getLiteral(), null, "value", null, 0, 1, AnnotationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subAnnotationPropertyOfEClass, SubAnnotationPropertyOf.class, "SubAnnotationPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubAnnotationPropertyOf_SubAnnotationProperty(), this.getAnnotationPropertyExpression(), null, "subAnnotationProperty", null, 0, 1, SubAnnotationPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubAnnotationPropertyOf_SuperAnnotationProperty(), this.getAnnotationPropertyExpression(), null, "superAnnotationProperty", null, 0, 1, SubAnnotationPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationPropertyDomainEClass, AnnotationPropertyDomain.class, "AnnotationPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationPropertyDomain_Domain(), this.getEntityExpression(), null, "domain", null, 0, 1, AnnotationPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationPropertyRangeEClass, AnnotationPropertyRange.class, "AnnotationPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationPropertyRange_Range(), this.getEntityExpression(), null, "range", null, 0, 1, AnnotationPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasKeyEClass, HasKey.class, "HasKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasKey_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRangeEClass, DataRange.class, "DataRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataComplementOfEClass, DataComplementOf.class, "DataComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataComplementOf_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataUnionOfEClass, DataUnionOf.class, "DataUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataUnionOf_DataRanges(), this.getDataRange(), null, "dataRanges", null, 0, -1, DataUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataOneOfEClass, DataOneOf.class, "DataOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOneOf_Literals(), this.getLiteral(), null, "literals", null, 0, -1, DataOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeRestrictionEClass, DatatypeRestriction.class, "DatatypeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeRestriction_Datatype(), this.getDataRange(), null, "datatype", null, 0, 1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeRestriction_Restrictions(), this.getFacetRestriction(), null, "restrictions", null, 0, -1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetRestrictionEClass, FacetRestriction.class, "FacetRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacetRestriction_Datatype(), this.getDataRange(), null, "datatype", null, 0, 1, FacetRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetRestriction_Value(), this.getLiteral(), null, "value", null, 0, 1, FacetRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataIntersectionOfEClass, DataIntersectionOf.class, "DataIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataIntersectionOf_DataRanges(), this.getDataRange(), null, "dataRanges", null, 0, -1, DataIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeDefinitionEClass, DatatypeDefinition.class, "DatatypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeDefinition_Datatype(), this.getDataRange(), null, "datatype", null, 0, 1, DatatypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeDefinition_Restriction(), this.getDatatypeRestriction(), null, "restriction", null, 0, 1, DatatypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaration_Entity(), this.getEntity(), null, "entity", null, 1, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Namespace(), this.getNamespace(), null, "namespace", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Expressions(), this.getEntityExpression(), null, "expressions", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(entityEClass, this.getOntology(), "getOntology", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(entityEClass, ecorePackage.getEString(), "getURI", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(owlClassEClass, OWLClass.class, "OWLClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlPropertyEClass, OWLProperty.class, "OWLProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(objectPropertyEClass, ecorePackage.getEBooleanObject(), "isInverseFunctional", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, ecorePackage.getEBooleanObject(), "isTransitive", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, ecorePackage.getEBooleanObject(), "isSymmteric", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, ecorePackage.getEBooleanObject(), "isAssymmteric", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, ecorePackage.getEBooleanObject(), "isReflexive", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, ecorePackage.getEBooleanObject(), "isIrreflexive", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, ecorePackage.getEBooleanObject(), "isFunctional", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, this.getClassExpression(), "listDomains", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, this.getClassExpression(), "listRanges", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, this.getObjectProperty(), "listSubProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, this.getObjectProperty(), "listSuperProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, this.getObjectProperty(), "listInverseProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, this.getObjectProperty(), "listEquivalentProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectPropertyEClass, this.getObjectProperty(), "listDisjointProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(dataPropertyEClass, ecorePackage.getEBooleanObject(), "isFunctional", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataPropertyEClass, this.getClassExpression(), "listDomains", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataPropertyEClass, this.getDataRange(), "listRanges", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataPropertyEClass, this.getDataProperty(), "listSubProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataPropertyEClass, this.getDataProperty(), "listSuperProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataPropertyEClass, this.getDataProperty(), "listEquivalentProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataPropertyEClass, this.getDataProperty(), "listDisjointProperties", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedIndividualEClass, NamedIndividual.class, "NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationPropertyEClass, AnnotationProperty.class, "AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classExpressionEClass, ClassExpression.class, "ClassExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(classExpressionEClass, this.getClassExpression(), "listSubClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classExpressionEClass, this.getClassExpression(), "listSuperClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classExpressionEClass, this.getClassExpression(), "listEquivalentClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classExpressionEClass, this.getClassExpression(), "listDisjointClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classExpressionEClass, this.getIndividual(), "listInstances", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classExpressionEClass, ecorePackage.getEJavaObject(), "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectUnionOfEClass, ObjectUnionOf.class, "ObjectUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectUnionOf_UnionOf(), this.getClassExpression(), null, "unionOf", null, 0, -1, ObjectUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectIntersectionOfEClass, ObjectIntersectionOf.class, "ObjectIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectIntersectionOf_IntersectionOf(), this.getClassExpression(), null, "intersectionOf", null, 0, -1, ObjectIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectComplementOfEClass, ObjectComplementOf.class, "ObjectComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectComplementOf_ComplementOf(), this.getClassExpression(), null, "complementOf", null, 0, 1, ObjectComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectOneOfEClass, ObjectOneOf.class, "ObjectOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectOneOf_OneOf(), this.getIndividual(), null, "oneOf", null, 0, -1, ObjectOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyRestrictionEClass, ObjectPropertyRestriction.class, "ObjectPropertyRestriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectSomeValuesFromEClass, ObjectSomeValuesFrom.class, "ObjectSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSomeValuesFrom_OnProperty(), this.getObjectPropertyExpression(), null, "onProperty", null, 0, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectSomeValuesFrom_SomeValuesFrom(), this.getClassExpression(), null, "someValuesFrom", null, 0, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectAllValuesFromEClass, ObjectAllValuesFrom.class, "ObjectAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectAllValuesFrom_OnProperty(), this.getObjectPropertyExpression(), null, "onProperty", null, 0, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectAllValuesFrom_AllValuesFrom(), this.getClassExpression(), null, "allValuesFrom", null, 0, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectHasValueEClass, ObjectHasValue.class, "ObjectHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectHasValue_OnProperty(), this.getObjectPropertyExpression(), null, "onProperty", null, 0, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectHasValue_HasValue(), this.getIndividual(), null, "hasValue", null, 0, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectHasSelfEClass, ObjectHasSelf.class, "ObjectHasSelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectHasSelf_OnProperty(), this.getObjectPropertyExpression(), null, "onProperty", null, 0, 1, ObjectHasSelf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectExactCardinalityEClass, ObjectExactCardinality.class, "ObjectExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectExactCardinality_OnProperty(), this.getObjectPropertyExpression(), null, "onProperty", null, 0, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectExactCardinality_OnClass(), this.getClassExpression(), null, "onClass", null, 0, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectMaxCardinalityEClass, ObjectMaxCardinality.class, "ObjectMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectMaxCardinality_OnProperty(), this.getObjectPropertyExpression(), null, "onProperty", null, 0, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectMaxCardinality_OnClass(), this.getClassExpression(), null, "onClass", null, 0, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectMinCardinalityEClass, ObjectMinCardinality.class, "ObjectMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectMinCardinality_OnProperty(), this.getObjectPropertyExpression(), null, "onProperty", null, 0, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectMinCardinality_OnClass(), this.getClassExpression(), null, "onClass", null, 0, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyRestrictionEClass, DataPropertyRestriction.class, "DataPropertyRestriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSomeValuesFromEClass, DataSomeValuesFrom.class, "DataSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSomeValuesFrom_OnProperties(), this.getDataPropertyExpression(), null, "onProperties", null, 0, -1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSomeValuesFrom_SomeValuesFrom(), this.getDataRange(), null, "someValuesFrom", null, 0, 1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAllValuesFromEClass, DataAllValuesFrom.class, "DataAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataAllValuesFrom_OnProperties(), this.getDataPropertyExpression(), null, "onProperties", null, 0, -1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAllValuesFrom_AllValuesFrom(), this.getDataRange(), null, "allValuesFrom", null, 0, 1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataHasValueEClass, DataHasValue.class, "DataHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataHasValue_OnProperty(), this.getDataPropertyExpression(), null, "onProperty", null, 0, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataHasValue_HasValue(), this.getLiteral(), null, "hasValue", null, 0, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataExactCardinalityEClass, DataExactCardinality.class, "DataExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataExactCardinality_OnProperty(), this.getDataPropertyExpression(), null, "onProperty", null, 0, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataExactCardinality_OnDataRange(), this.getDataRange(), null, "onDataRange", null, 0, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMaxCardinalityEClass, DataMaxCardinality.class, "DataMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataMaxCardinality_OnProperty(), this.getDataPropertyExpression(), null, "onProperty", null, 0, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMaxCardinality_OnDataRange(), this.getDataRange(), null, "onDataRange", null, 0, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataMinCardinalityEClass, DataMinCardinality.class, "DataMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataMinCardinality_OnProperty(), this.getDataPropertyExpression(), null, "onProperty", null, 0, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataMinCardinality_OnDataRange(), this.getDataRange(), null, "onDataRange", null, 0, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(individualEClass, this.getClassExpression(), "listTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(anonymousIndividualEClass, AnonymousIndividual.class, "AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnonymousIndividual_NodeID(), ecorePackage.getEString(), "nodeID", null, 0, 1, AnonymousIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyExpressionEClass, ObjectPropertyExpression.class, "ObjectPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectPropertyChainEClass, ObjectPropertyChain.class, "ObjectPropertyChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyChain_Properties(), this.getObjectPropertyExpression(), null, "properties", null, 0, -1, ObjectPropertyChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyExpressionEClass, DataPropertyExpression.class, "DataPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationPropertyExpressionEClass, AnnotationPropertyExpression.class, "AnnotationPropertyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiteral_DatatypeExpression(), this.getEntityExpression(), null, "datatypeExpression", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Property(), this.getAnnotationPropertyExpression(), null, "property", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Value(), this.getLiteral(), null, "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sameIndividualEClass, SameIndividual.class, "SameIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSameIndividual_Individuals(), this.getIndividual(), null, "individuals", null, 0, -1, SameIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(differentIndividualsEClass, DifferentIndividuals.class, "DifferentIndividuals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferentIndividuals_Individuals(), this.getIndividual(), null, "individuals", null, 0, -1, DifferentIndividuals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classAssertionEClass, ClassAssertion.class, "ClassAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassAssertion_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassAssertion_Individual(), this.getIndividual(), null, "individual", null, 0, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectPropertyAssertionEClass, ObjectPropertyAssertion.class, "ObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectPropertyAssertion_ObjectProperty(), this.getObjectPropertyExpression(), null, "objectProperty", null, 0, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 0, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 0, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negativeObjectPropertyAssertionEClass, NegativeObjectPropertyAssertion.class, "NegativeObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegativeObjectPropertyAssertion_ObjectProperty(), this.getObjectPropertyExpression(), null, "objectProperty", null, 0, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegativeObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 0, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegativeObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 0, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyAssertionEClass, DataPropertyAssertion.class, "DataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPropertyAssertion_DataProperty(), this.getDataPropertyExpression(), null, "dataProperty", null, 0, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 0, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyAssertion_TargetValue(), this.getLiteral(), null, "targetValue", null, 0, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negativeDataPropertyAssertionEClass, NegativeDataPropertyAssertion.class, "NegativeDataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegativeDataPropertyAssertion_DataProperty(), this.getDataPropertyExpression(), null, "dataProperty", null, 0, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegativeDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 0, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNegativeDataPropertyAssertion_TargetValue(), this.getLiteral(), null, "targetValue", null, 0, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OWLPackageImpl
