/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationAssertion;
import com.emf4sw.owl.AnnotationAxiom;
import com.emf4sw.owl.AnnotationProperty;
import com.emf4sw.owl.AnnotationPropertyDomain;
import com.emf4sw.owl.AnnotationPropertyExpression;
import com.emf4sw.owl.AnnotationPropertyRange;
import com.emf4sw.owl.AnonymousIndividual;
import com.emf4sw.owl.AssymmetricObjectProperty;
import com.emf4sw.owl.ClassAssertion;
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
import com.emf4sw.owl.DataPropertyDomain;
import com.emf4sw.owl.DataPropertyRange;
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
import com.emf4sw.owl.EquivalentClasses;
import com.emf4sw.owl.EquivalentDataProperties;
import com.emf4sw.owl.EquivalentObjectProperties;
import com.emf4sw.owl.FacetRestriction;
import com.emf4sw.owl.FunctionalDataProperty;
import com.emf4sw.owl.FunctionalObjectProperty;
import com.emf4sw.owl.HasKey;
import com.emf4sw.owl.IRIEntityExpression;
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
import com.emf4sw.owl.ObjectPropertyChain;
import com.emf4sw.owl.ObjectPropertyDomain;
import com.emf4sw.owl.ObjectPropertyRange;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLFactoryImpl extends EFactoryImpl implements OWLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OWLFactory init() {
		try {
			OWLFactory theOWLFactory = (OWLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emf4sw.org/2009/OWL"); 
			if (theOWLFactory != null) {
				return theOWLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OWLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OWLPackage.ONTOLOGY: return createOntology();
			case OWLPackage.IRI_ENTITY_EXPRESSION: return createIRIEntityExpression();
			case OWLPackage.PREFIX_ENTITY_EXPRESSION: return createPrefixEntityExpression();
			case OWLPackage.NO_PREFIX_ENTITY_EXPRESSION: return createNoPrefixEntityExpression();
			case OWLPackage.NAMESPACE: return createNamespace();
			case OWLPackage.SUB_CLASS_OF: return createSubClassOf();
			case OWLPackage.DISJOINT_CLASSES: return createDisjointClasses();
			case OWLPackage.EQUIVALENT_CLASSES: return createEquivalentClasses();
			case OWLPackage.DISJOINT_UNION: return createDisjointUnion();
			case OWLPackage.SUB_OBJECT_PROPERTY_OF: return createSubObjectPropertyOf();
			case OWLPackage.OBJECT_PROPERTY_DOMAIN: return createObjectPropertyDomain();
			case OWLPackage.OBJECT_PROPERTY_RANGE: return createObjectPropertyRange();
			case OWLPackage.EQUIVALENT_OBJECT_PROPERTIES: return createEquivalentObjectProperties();
			case OWLPackage.DISJOINT_OBJECT_PROPERTIES: return createDisjointObjectProperties();
			case OWLPackage.INVERSE_OBJECT_PROPERTIES: return createInverseObjectProperties();
			case OWLPackage.FUNCTIONAL_OBJECT_PROPERTY: return createFunctionalObjectProperty();
			case OWLPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: return createInverseFunctionalObjectProperty();
			case OWLPackage.SYMMETRIC_OBJECT_PROPERTY: return createSymmetricObjectProperty();
			case OWLPackage.REFLEXIVE_OBJECT_PROPERTY: return createReflexiveObjectProperty();
			case OWLPackage.IRREFLEXIVE_OBJECT_PROPERTY: return createIrreflexiveObjectProperty();
			case OWLPackage.TRANSITIVE_OBJECT_PROPERTY: return createTransitiveObjectProperty();
			case OWLPackage.ASSYMMETRIC_OBJECT_PROPERTY: return createAssymmetricObjectProperty();
			case OWLPackage.SUB_DATA_PROPERTY_OF: return createSubDataPropertyOf();
			case OWLPackage.DISJOINT_DATA_PROPERTIES: return createDisjointDataProperties();
			case OWLPackage.EQUIVALENT_DATA_PROPERTIES: return createEquivalentDataProperties();
			case OWLPackage.DATA_PROPERTY_DOMAIN: return createDataPropertyDomain();
			case OWLPackage.DATA_PROPERTY_RANGE: return createDataPropertyRange();
			case OWLPackage.FUNCTIONAL_DATA_PROPERTY: return createFunctionalDataProperty();
			case OWLPackage.ANNOTATION_AXIOM: return createAnnotationAxiom();
			case OWLPackage.ANNOTATION_ASSERTION: return createAnnotationAssertion();
			case OWLPackage.SUB_ANNOTATION_PROPERTY_OF: return createSubAnnotationPropertyOf();
			case OWLPackage.ANNOTATION_PROPERTY_DOMAIN: return createAnnotationPropertyDomain();
			case OWLPackage.ANNOTATION_PROPERTY_RANGE: return createAnnotationPropertyRange();
			case OWLPackage.HAS_KEY: return createHasKey();
			case OWLPackage.DATA_COMPLEMENT_OF: return createDataComplementOf();
			case OWLPackage.DATA_UNION_OF: return createDataUnionOf();
			case OWLPackage.DATA_ONE_OF: return createDataOneOf();
			case OWLPackage.DATATYPE_RESTRICTION: return createDatatypeRestriction();
			case OWLPackage.FACET_RESTRICTION: return createFacetRestriction();
			case OWLPackage.DATA_INTERSECTION_OF: return createDataIntersectionOf();
			case OWLPackage.DATATYPE_DEFINITION: return createDatatypeDefinition();
			case OWLPackage.DECLARATION: return createDeclaration();
			case OWLPackage.OWL_CLASS: return createOWLClass();
			case OWLPackage.OBJECT_PROPERTY: return createObjectProperty();
			case OWLPackage.DATA_PROPERTY: return createDataProperty();
			case OWLPackage.DATATYPE: return createDatatype();
			case OWLPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
			case OWLPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
			case OWLPackage.OBJECT_UNION_OF: return createObjectUnionOf();
			case OWLPackage.OBJECT_INTERSECTION_OF: return createObjectIntersectionOf();
			case OWLPackage.OBJECT_COMPLEMENT_OF: return createObjectComplementOf();
			case OWLPackage.OBJECT_ONE_OF: return createObjectOneOf();
			case OWLPackage.OBJECT_SOME_VALUES_FROM: return createObjectSomeValuesFrom();
			case OWLPackage.OBJECT_ALL_VALUES_FROM: return createObjectAllValuesFrom();
			case OWLPackage.OBJECT_HAS_VALUE: return createObjectHasValue();
			case OWLPackage.OBJECT_HAS_SELF: return createObjectHasSelf();
			case OWLPackage.OBJECT_EXACT_CARDINALITY: return createObjectExactCardinality();
			case OWLPackage.OBJECT_MAX_CARDINALITY: return createObjectMaxCardinality();
			case OWLPackage.OBJECT_MIN_CARDINALITY: return createObjectMinCardinality();
			case OWLPackage.DATA_SOME_VALUES_FROM: return createDataSomeValuesFrom();
			case OWLPackage.DATA_ALL_VALUES_FROM: return createDataAllValuesFrom();
			case OWLPackage.DATA_HAS_VALUE: return createDataHasValue();
			case OWLPackage.DATA_EXACT_CARDINALITY: return createDataExactCardinality();
			case OWLPackage.DATA_MAX_CARDINALITY: return createDataMaxCardinality();
			case OWLPackage.DATA_MIN_CARDINALITY: return createDataMinCardinality();
			case OWLPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
			case OWLPackage.OBJECT_PROPERTY_CHAIN: return createObjectPropertyChain();
			case OWLPackage.ANNOTATION_PROPERTY_EXPRESSION: return createAnnotationPropertyExpression();
			case OWLPackage.LITERAL: return createLiteral();
			case OWLPackage.ANNOTATION: return createAnnotation();
			case OWLPackage.SAME_INDIVIDUAL: return createSameIndividual();
			case OWLPackage.DIFFERENT_INDIVIDUALS: return createDifferentIndividuals();
			case OWLPackage.CLASS_ASSERTION: return createClassAssertion();
			case OWLPackage.OBJECT_PROPERTY_ASSERTION: return createObjectPropertyAssertion();
			case OWLPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: return createNegativeObjectPropertyAssertion();
			case OWLPackage.DATA_PROPERTY_ASSERTION: return createDataPropertyAssertion();
			case OWLPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: return createNegativeDataPropertyAssertion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRIEntityExpression createIRIEntityExpression() {
		IRIEntityExpressionImpl iriEntityExpression = new IRIEntityExpressionImpl();
		return iriEntityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixEntityExpression createPrefixEntityExpression() {
		PrefixEntityExpressionImpl prefixEntityExpression = new PrefixEntityExpressionImpl();
		return prefixEntityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoPrefixEntityExpression createNoPrefixEntityExpression() {
		NoPrefixEntityExpressionImpl noPrefixEntityExpression = new NoPrefixEntityExpressionImpl();
		return noPrefixEntityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubClassOf createSubClassOf() {
		SubClassOfImpl subClassOf = new SubClassOfImpl();
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointClasses createDisjointClasses() {
		DisjointClassesImpl disjointClasses = new DisjointClassesImpl();
		return disjointClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentClasses createEquivalentClasses() {
		EquivalentClassesImpl equivalentClasses = new EquivalentClassesImpl();
		return equivalentClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointUnion createDisjointUnion() {
		DisjointUnionImpl disjointUnion = new DisjointUnionImpl();
		return disjointUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubObjectPropertyOf createSubObjectPropertyOf() {
		SubObjectPropertyOfImpl subObjectPropertyOf = new SubObjectPropertyOfImpl();
		return subObjectPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyDomain createObjectPropertyDomain() {
		ObjectPropertyDomainImpl objectPropertyDomain = new ObjectPropertyDomainImpl();
		return objectPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyRange createObjectPropertyRange() {
		ObjectPropertyRangeImpl objectPropertyRange = new ObjectPropertyRangeImpl();
		return objectPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentObjectProperties createEquivalentObjectProperties() {
		EquivalentObjectPropertiesImpl equivalentObjectProperties = new EquivalentObjectPropertiesImpl();
		return equivalentObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointObjectProperties createDisjointObjectProperties() {
		DisjointObjectPropertiesImpl disjointObjectProperties = new DisjointObjectPropertiesImpl();
		return disjointObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseObjectProperties createInverseObjectProperties() {
		InverseObjectPropertiesImpl inverseObjectProperties = new InverseObjectPropertiesImpl();
		return inverseObjectProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalObjectProperty createFunctionalObjectProperty() {
		FunctionalObjectPropertyImpl functionalObjectProperty = new FunctionalObjectPropertyImpl();
		return functionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseFunctionalObjectProperty createInverseFunctionalObjectProperty() {
		InverseFunctionalObjectPropertyImpl inverseFunctionalObjectProperty = new InverseFunctionalObjectPropertyImpl();
		return inverseFunctionalObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricObjectProperty createSymmetricObjectProperty() {
		SymmetricObjectPropertyImpl symmetricObjectProperty = new SymmetricObjectPropertyImpl();
		return symmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflexiveObjectProperty createReflexiveObjectProperty() {
		ReflexiveObjectPropertyImpl reflexiveObjectProperty = new ReflexiveObjectPropertyImpl();
		return reflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrreflexiveObjectProperty createIrreflexiveObjectProperty() {
		IrreflexiveObjectPropertyImpl irreflexiveObjectProperty = new IrreflexiveObjectPropertyImpl();
		return irreflexiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitiveObjectProperty createTransitiveObjectProperty() {
		TransitiveObjectPropertyImpl transitiveObjectProperty = new TransitiveObjectPropertyImpl();
		return transitiveObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssymmetricObjectProperty createAssymmetricObjectProperty() {
		AssymmetricObjectPropertyImpl assymmetricObjectProperty = new AssymmetricObjectPropertyImpl();
		return assymmetricObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubDataPropertyOf createSubDataPropertyOf() {
		SubDataPropertyOfImpl subDataPropertyOf = new SubDataPropertyOfImpl();
		return subDataPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointDataProperties createDisjointDataProperties() {
		DisjointDataPropertiesImpl disjointDataProperties = new DisjointDataPropertiesImpl();
		return disjointDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentDataProperties createEquivalentDataProperties() {
		EquivalentDataPropertiesImpl equivalentDataProperties = new EquivalentDataPropertiesImpl();
		return equivalentDataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyDomain createDataPropertyDomain() {
		DataPropertyDomainImpl dataPropertyDomain = new DataPropertyDomainImpl();
		return dataPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyRange createDataPropertyRange() {
		DataPropertyRangeImpl dataPropertyRange = new DataPropertyRangeImpl();
		return dataPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDataProperty createFunctionalDataProperty() {
		FunctionalDataPropertyImpl functionalDataProperty = new FunctionalDataPropertyImpl();
		return functionalDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationAxiom createAnnotationAxiom() {
		AnnotationAxiomImpl annotationAxiom = new AnnotationAxiomImpl();
		return annotationAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationAssertion createAnnotationAssertion() {
		AnnotationAssertionImpl annotationAssertion = new AnnotationAssertionImpl();
		return annotationAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubAnnotationPropertyOf createSubAnnotationPropertyOf() {
		SubAnnotationPropertyOfImpl subAnnotationPropertyOf = new SubAnnotationPropertyOfImpl();
		return subAnnotationPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationPropertyDomain createAnnotationPropertyDomain() {
		AnnotationPropertyDomainImpl annotationPropertyDomain = new AnnotationPropertyDomainImpl();
		return annotationPropertyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationPropertyRange createAnnotationPropertyRange() {
		AnnotationPropertyRangeImpl annotationPropertyRange = new AnnotationPropertyRangeImpl();
		return annotationPropertyRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasKey createHasKey() {
		HasKeyImpl hasKey = new HasKeyImpl();
		return hasKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataComplementOf createDataComplementOf() {
		DataComplementOfImpl dataComplementOf = new DataComplementOfImpl();
		return dataComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnionOf createDataUnionOf() {
		DataUnionOfImpl dataUnionOf = new DataUnionOfImpl();
		return dataUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOneOf createDataOneOf() {
		DataOneOfImpl dataOneOf = new DataOneOfImpl();
		return dataOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRestriction createDatatypeRestriction() {
		DatatypeRestrictionImpl datatypeRestriction = new DatatypeRestrictionImpl();
		return datatypeRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetRestriction createFacetRestriction() {
		FacetRestrictionImpl facetRestriction = new FacetRestrictionImpl();
		return facetRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataIntersectionOf createDataIntersectionOf() {
		DataIntersectionOfImpl dataIntersectionOf = new DataIntersectionOfImpl();
		return dataIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinition createDatatypeDefinition() {
		DatatypeDefinitionImpl datatypeDefinition = new DatatypeDefinitionImpl();
		return datatypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLClass createOWLClass() {
		OWLClassImpl owlClass = new OWLClassImpl();
		return owlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty createObjectProperty() {
		ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty createDataProperty() {
		DataPropertyImpl dataProperty = new DataPropertyImpl();
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividual createNamedIndividual() {
		NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty createAnnotationProperty() {
		AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnionOf createObjectUnionOf() {
		ObjectUnionOfImpl objectUnionOf = new ObjectUnionOfImpl();
		return objectUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIntersectionOf createObjectIntersectionOf() {
		ObjectIntersectionOfImpl objectIntersectionOf = new ObjectIntersectionOfImpl();
		return objectIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComplementOf createObjectComplementOf() {
		ObjectComplementOfImpl objectComplementOf = new ObjectComplementOfImpl();
		return objectComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOneOf createObjectOneOf() {
		ObjectOneOfImpl objectOneOf = new ObjectOneOfImpl();
		return objectOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSomeValuesFrom createObjectSomeValuesFrom() {
		ObjectSomeValuesFromImpl objectSomeValuesFrom = new ObjectSomeValuesFromImpl();
		return objectSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAllValuesFrom createObjectAllValuesFrom() {
		ObjectAllValuesFromImpl objectAllValuesFrom = new ObjectAllValuesFromImpl();
		return objectAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHasValue createObjectHasValue() {
		ObjectHasValueImpl objectHasValue = new ObjectHasValueImpl();
		return objectHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHasSelf createObjectHasSelf() {
		ObjectHasSelfImpl objectHasSelf = new ObjectHasSelfImpl();
		return objectHasSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExactCardinality createObjectExactCardinality() {
		ObjectExactCardinalityImpl objectExactCardinality = new ObjectExactCardinalityImpl();
		return objectExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMaxCardinality createObjectMaxCardinality() {
		ObjectMaxCardinalityImpl objectMaxCardinality = new ObjectMaxCardinalityImpl();
		return objectMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMinCardinality createObjectMinCardinality() {
		ObjectMinCardinalityImpl objectMinCardinality = new ObjectMinCardinalityImpl();
		return objectMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSomeValuesFrom createDataSomeValuesFrom() {
		DataSomeValuesFromImpl dataSomeValuesFrom = new DataSomeValuesFromImpl();
		return dataSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAllValuesFrom createDataAllValuesFrom() {
		DataAllValuesFromImpl dataAllValuesFrom = new DataAllValuesFromImpl();
		return dataAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataHasValue createDataHasValue() {
		DataHasValueImpl dataHasValue = new DataHasValueImpl();
		return dataHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExactCardinality createDataExactCardinality() {
		DataExactCardinalityImpl dataExactCardinality = new DataExactCardinalityImpl();
		return dataExactCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMaxCardinality createDataMaxCardinality() {
		DataMaxCardinalityImpl dataMaxCardinality = new DataMaxCardinalityImpl();
		return dataMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMinCardinality createDataMinCardinality() {
		DataMinCardinalityImpl dataMinCardinality = new DataMinCardinalityImpl();
		return dataMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIndividual createAnonymousIndividual() {
		AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyChain createObjectPropertyChain() {
		ObjectPropertyChainImpl objectPropertyChain = new ObjectPropertyChainImpl();
		return objectPropertyChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationPropertyExpression createAnnotationPropertyExpression() {
		AnnotationPropertyExpressionImpl annotationPropertyExpression = new AnnotationPropertyExpressionImpl();
		return annotationPropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameIndividual createSameIndividual() {
		SameIndividualImpl sameIndividual = new SameIndividualImpl();
		return sameIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentIndividuals createDifferentIndividuals() {
		DifferentIndividualsImpl differentIndividuals = new DifferentIndividualsImpl();
		return differentIndividuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAssertion createClassAssertion() {
		ClassAssertionImpl classAssertion = new ClassAssertionImpl();
		return classAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyAssertion createObjectPropertyAssertion() {
		ObjectPropertyAssertionImpl objectPropertyAssertion = new ObjectPropertyAssertionImpl();
		return objectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion() {
		NegativeObjectPropertyAssertionImpl negativeObjectPropertyAssertion = new NegativeObjectPropertyAssertionImpl();
		return negativeObjectPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyAssertion createDataPropertyAssertion() {
		DataPropertyAssertionImpl dataPropertyAssertion = new DataPropertyAssertionImpl();
		return dataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeDataPropertyAssertion createNegativeDataPropertyAssertion() {
		NegativeDataPropertyAssertionImpl negativeDataPropertyAssertion = new NegativeDataPropertyAssertionImpl();
		return negativeDataPropertyAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLPackage getOWLPackage() {
		return (OWLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OWLPackage getPackage() {
		return OWLPackage.eINSTANCE;
	}

} //OWLFactoryImpl
