/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.owl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.emf4sw.owl.OWLFactory
 * @model kind="package"
 * @generated
 */
public interface OWLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "owl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emf4sw.org/2009/OWL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "owl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OWLPackage eINSTANCE = com.emf4sw.owl.impl.OWLPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.OntologyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__NAMESPACES = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__URI = 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__IMPORTS = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ANNOTATIONS = 3;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__AXIOMS = 4;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.NamespaceImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 5;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AxiomImpl <em>Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AxiomImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAxiom()
	 * @generated
	 */
	int AXIOM = 6;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ClassExpressionAxiomImpl <em>Class Expression Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ClassExpressionAxiomImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassExpressionAxiom()
	 * @generated
	 */
	int CLASS_EXPRESSION_AXIOM = 7;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.SubClassOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSubClassOf()
	 * @generated
	 */
	int SUB_CLASS_OF = 8;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DisjointClassesImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDisjointClasses()
	 * @generated
	 */
	int DISJOINT_CLASSES = 9;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.EquivalentClassesImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEquivalentClasses()
	 * @generated
	 */
	int EQUIVALENT_CLASSES = 10;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DisjointUnionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDisjointUnion()
	 * @generated
	 */
	int DISJOINT_UNION = 11;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyAxiomImpl <em>Object Property Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyAxiomImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyAxiom()
	 * @generated
	 */
	int OBJECT_PROPERTY_AXIOM = 12;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.SubObjectPropertyOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSubObjectPropertyOf()
	 * @generated
	 */
	int SUB_OBJECT_PROPERTY_OF = 13;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyDomainImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyDomain()
	 * @generated
	 */
	int OBJECT_PROPERTY_DOMAIN = 14;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyRangeImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyRange()
	 * @generated
	 */
	int OBJECT_PROPERTY_RANGE = 15;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.EquivalentObjectPropertiesImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEquivalentObjectProperties()
	 * @generated
	 */
	int EQUIVALENT_OBJECT_PROPERTIES = 16;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DisjointObjectPropertiesImpl <em>Disjoint Object Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DisjointObjectPropertiesImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDisjointObjectProperties()
	 * @generated
	 */
	int DISJOINT_OBJECT_PROPERTIES = 17;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.InverseObjectPropertiesImpl <em>Inverse Object Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.InverseObjectPropertiesImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getInverseObjectProperties()
	 * @generated
	 */
	int INVERSE_OBJECT_PROPERTIES = 18;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.FunctionalObjectPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getFunctionalObjectProperty()
	 * @generated
	 */
	int FUNCTIONAL_OBJECT_PROPERTY = 19;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.InverseFunctionalObjectPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getInverseFunctionalObjectProperty()
	 * @generated
	 */
	int INVERSE_FUNCTIONAL_OBJECT_PROPERTY = 20;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.SymmetricObjectPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSymmetricObjectProperty()
	 * @generated
	 */
	int SYMMETRIC_OBJECT_PROPERTY = 21;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ReflexiveObjectPropertyImpl <em>Reflexive Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ReflexiveObjectPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getReflexiveObjectProperty()
	 * @generated
	 */
	int REFLEXIVE_OBJECT_PROPERTY = 22;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.IrreflexiveObjectPropertyImpl <em>Irreflexive Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.IrreflexiveObjectPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getIrreflexiveObjectProperty()
	 * @generated
	 */
	int IRREFLEXIVE_OBJECT_PROPERTY = 23;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.TransitiveObjectPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getTransitiveObjectProperty()
	 * @generated
	 */
	int TRANSITIVE_OBJECT_PROPERTY = 24;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AssymmetricObjectPropertyImpl <em>Assymmetric Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AssymmetricObjectPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAssymmetricObjectProperty()
	 * @generated
	 */
	int ASSYMMETRIC_OBJECT_PROPERTY = 25;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataPropertyAxiomImpl <em>Data Property Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataPropertyAxiomImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyAxiom()
	 * @generated
	 */
	int DATA_PROPERTY_AXIOM = 26;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.SubDataPropertyOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSubDataPropertyOf()
	 * @generated
	 */
	int SUB_DATA_PROPERTY_OF = 27;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DisjointDataPropertiesImpl <em>Disjoint Data Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DisjointDataPropertiesImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDisjointDataProperties()
	 * @generated
	 */
	int DISJOINT_DATA_PROPERTIES = 28;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.EquivalentDataPropertiesImpl <em>Equivalent Data Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.EquivalentDataPropertiesImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEquivalentDataProperties()
	 * @generated
	 */
	int EQUIVALENT_DATA_PROPERTIES = 29;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataPropertyDomainImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyDomain()
	 * @generated
	 */
	int DATA_PROPERTY_DOMAIN = 30;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataPropertyRangeImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyRange()
	 * @generated
	 */
	int DATA_PROPERTY_RANGE = 31;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.FunctionalDataPropertyImpl <em>Functional Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.FunctionalDataPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getFunctionalDataProperty()
	 * @generated
	 */
	int FUNCTIONAL_DATA_PROPERTY = 32;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotationAxiomImpl <em>Annotation Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotationAxiomImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationAxiom()
	 * @generated
	 */
	int ANNOTATION_AXIOM = 33;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotationAssertionImpl <em>Annotation Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotationAssertionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationAssertion()
	 * @generated
	 */
	int ANNOTATION_ASSERTION = 34;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.SubAnnotationPropertyOfImpl <em>Sub Annotation Property Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.SubAnnotationPropertyOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSubAnnotationPropertyOf()
	 * @generated
	 */
	int SUB_ANNOTATION_PROPERTY_OF = 35;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotationPropertyDomainImpl <em>Annotation Property Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotationPropertyDomainImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationPropertyDomain()
	 * @generated
	 */
	int ANNOTATION_PROPERTY_DOMAIN = 36;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotationPropertyRangeImpl <em>Annotation Property Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotationPropertyRangeImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationPropertyRange()
	 * @generated
	 */
	int ANNOTATION_PROPERTY_RANGE = 37;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.HasKeyImpl <em>Has Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.HasKeyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getHasKey()
	 * @generated
	 */
	int HAS_KEY = 38;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataRangeImpl <em>Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataRangeImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataRange()
	 * @generated
	 */
	int DATA_RANGE = 39;

	/**
	 * The number of structural features of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataComplementOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataComplementOf()
	 * @generated
	 */
	int DATA_COMPLEMENT_OF = 40;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataUnionOfImpl <em>Data Union Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataUnionOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataUnionOf()
	 * @generated
	 */
	int DATA_UNION_OF = 41;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataOneOfImpl <em>Data One Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataOneOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataOneOf()
	 * @generated
	 */
	int DATA_ONE_OF = 42;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DatatypeRestrictionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatypeRestriction()
	 * @generated
	 */
	int DATATYPE_RESTRICTION = 43;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.FacetRestrictionImpl <em>Facet Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.FacetRestrictionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getFacetRestriction()
	 * @generated
	 */
	int FACET_RESTRICTION = 44;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataIntersectionOfImpl <em>Data Intersection Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataIntersectionOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataIntersectionOf()
	 * @generated
	 */
	int DATA_INTERSECTION_OF = 45;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DatatypeDefinitionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatypeDefinition()
	 * @generated
	 */
	int DATATYPE_DEFINITION = 46;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DeclarationImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 47;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.EntityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 48;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.OWLClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.OWLClassImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLClass()
	 * @generated
	 */
	int OWL_CLASS = 49;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.OWLPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.OWLPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLProperty()
	 * @generated
	 */
	int OWL_PROPERTY = 50;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectProperty()
	 * @generated
	 */
	int OBJECT_PROPERTY = 51;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataPropertyImpl <em>Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataProperty()
	 * @generated
	 */
	int DATA_PROPERTY = 52;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DatatypeImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 53;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.NamedIndividualImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNamedIndividual()
	 * @generated
	 */
	int NAMED_INDIVIDUAL = 54;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotationPropertyImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationProperty()
	 * @generated
	 */
	int ANNOTATION_PROPERTY = 55;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ClassExpressionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassExpression()
	 * @generated
	 */
	int CLASS_EXPRESSION = 56;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectUnionOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectUnionOf()
	 * @generated
	 */
	int OBJECT_UNION_OF = 57;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectIntersectionOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectIntersectionOf()
	 * @generated
	 */
	int OBJECT_INTERSECTION_OF = 58;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectComplementOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectComplementOf()
	 * @generated
	 */
	int OBJECT_COMPLEMENT_OF = 59;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectOneOfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectOneOf()
	 * @generated
	 */
	int OBJECT_ONE_OF = 60;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyRestrictionImpl <em>Object Property Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyRestrictionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyRestriction()
	 * @generated
	 */
	int OBJECT_PROPERTY_RESTRICTION = 61;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectSomeValuesFromImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectSomeValuesFrom()
	 * @generated
	 */
	int OBJECT_SOME_VALUES_FROM = 62;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectAllValuesFromImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectAllValuesFrom()
	 * @generated
	 */
	int OBJECT_ALL_VALUES_FROM = 63;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectHasValueImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectHasValue()
	 * @generated
	 */
	int OBJECT_HAS_VALUE = 64;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectHasSelfImpl <em>Object Has Self</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectHasSelfImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectHasSelf()
	 * @generated
	 */
	int OBJECT_HAS_SELF = 65;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectExactCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectExactCardinality()
	 * @generated
	 */
	int OBJECT_EXACT_CARDINALITY = 66;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectMaxCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectMaxCardinality()
	 * @generated
	 */
	int OBJECT_MAX_CARDINALITY = 67;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectMinCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectMinCardinality()
	 * @generated
	 */
	int OBJECT_MIN_CARDINALITY = 68;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataPropertyRestrictionImpl <em>Data Property Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataPropertyRestrictionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyRestriction()
	 * @generated
	 */
	int DATA_PROPERTY_RESTRICTION = 69;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataSomeValuesFromImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataSomeValuesFrom()
	 * @generated
	 */
	int DATA_SOME_VALUES_FROM = 70;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataAllValuesFromImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataAllValuesFrom()
	 * @generated
	 */
	int DATA_ALL_VALUES_FROM = 71;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataHasValueImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataHasValue()
	 * @generated
	 */
	int DATA_HAS_VALUE = 72;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataExactCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataExactCardinality()
	 * @generated
	 */
	int DATA_EXACT_CARDINALITY = 73;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataMaxCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataMaxCardinality()
	 * @generated
	 */
	int DATA_MAX_CARDINALITY = 74;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataMinCardinalityImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataMinCardinality()
	 * @generated
	 */
	int DATA_MIN_CARDINALITY = 75;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.IndividualImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 76;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnonymousIndividualImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnonymousIndividual()
	 * @generated
	 */
	int ANONYMOUS_INDIVIDUAL = 77;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.EntityExpressionImpl <em>Entity Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.EntityExpressionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEntityExpression()
	 * @generated
	 */
	int ENTITY_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Entity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXPRESSION_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.IRIEntityExpressionImpl <em>IRI Entity Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.IRIEntityExpressionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getIRIEntityExpression()
	 * @generated
	 */
	int IRI_ENTITY_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_ENTITY_EXPRESSION__IRI = ENTITY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IRI Entity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_ENTITY_EXPRESSION_FEATURE_COUNT = ENTITY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.PrefixEntityExpressionImpl <em>Prefix Entity Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.PrefixEntityExpressionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getPrefixEntityExpression()
	 * @generated
	 */
	int PREFIX_ENTITY_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_ENTITY_EXPRESSION__NAMESPACE = ENTITY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_ENTITY_EXPRESSION__REFERENCE = ENTITY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prefix Entity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_ENTITY_EXPRESSION_FEATURE_COUNT = ENTITY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.NoPrefixEntityExpressionImpl <em>No Prefix Entity Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.NoPrefixEntityExpressionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNoPrefixEntityExpression()
	 * @generated
	 */
	int NO_PREFIX_ENTITY_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PREFIX_ENTITY_EXPRESSION__REFERENCE = ENTITY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Prefix Entity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PREFIX_ENTITY_EXPRESSION_FEATURE_COUNT = ENTITY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__URI = 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__ONTOLOGY = 1;

	/**
	 * The number of structural features of the '<em>Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION_AXIOM__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION_AXIOM__ONTOLOGY = AXIOM__ONTOLOGY;

	/**
	 * The number of structural features of the '<em>Class Expression Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__ANNOTATIONS = CLASS_EXPRESSION_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__ONTOLOGY = CLASS_EXPRESSION_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__SUB_CLASS = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__SUPER_CLASS = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Class Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF_FEATURE_COUNT = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASSES__ANNOTATIONS = CLASS_EXPRESSION_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASSES__ONTOLOGY = CLASS_EXPRESSION_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASSES__EXPRESSION = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASSES__DISJOINT_CLASSES = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disjoint Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_CLASSES_FEATURE_COUNT = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASSES__ANNOTATIONS = CLASS_EXPRESSION_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASSES__ONTOLOGY = CLASS_EXPRESSION_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASSES__EXPRESSION = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASSES__EQUIVALENT_CLASSES = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalent Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_CLASSES_FEATURE_COUNT = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION__ANNOTATIONS = CLASS_EXPRESSION_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION__ONTOLOGY = CLASS_EXPRESSION_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION__EXPRESSION = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION__DISJOINT_CLASSES = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disjoint Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION_FEATURE_COUNT = CLASS_EXPRESSION_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_AXIOM__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_AXIOM__ONTOLOGY = AXIOM__ONTOLOGY;

	/**
	 * The number of structural features of the '<em>Object Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Sub Object Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Object Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Object Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OBJECT_PROPERTY_OF_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN__DOMAIN = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Property Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_DOMAIN_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE__RANGE = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Property Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RANGE_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTIES__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTIES__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTIES__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equivalent Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTIES__EQUIVALENT_PROPERTIES = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalent Object Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_OBJECT_PROPERTIES_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTIES__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTIES__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTIES__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disjoint Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTIES__DISJOINT_PROPERTIES = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disjoint Object Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_OBJECT_PROPERTIES_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTIES__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTIES__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTIES__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inverse Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inverse Object Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_OBJECT_PROPERTIES_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OBJECT_PROPERTY__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OBJECT_PROPERTY__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OBJECT_PROPERTY__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_OBJECT_PROPERTY__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_OBJECT_PROPERTY__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_OBJECT_PROPERTY__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inverse Functional Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FUNCTIONAL_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_OBJECT_PROPERTY__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_OBJECT_PROPERTY__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_OBJECT_PROPERTY__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symmetric Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_OBJECT_PROPERTY__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_OBJECT_PROPERTY__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_OBJECT_PROPERTY__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reflexive Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEXIVE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_OBJECT_PROPERTY__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_OBJECT_PROPERTY__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_OBJECT_PROPERTY__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Irreflexive Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREFLEXIVE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_OBJECT_PROPERTY__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_OBJECT_PROPERTY__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_OBJECT_PROPERTY__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transitive Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSYMMETRIC_OBJECT_PROPERTY__ANNOTATIONS = OBJECT_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSYMMETRIC_OBJECT_PROPERTY__ONTOLOGY = OBJECT_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSYMMETRIC_OBJECT_PROPERTY__PROPERTY = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assymmetric Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSYMMETRIC_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_AXIOM__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_AXIOM__ONTOLOGY = AXIOM__ONTOLOGY;

	/**
	 * The number of structural features of the '<em>Data Property Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF__ONTOLOGY = DATA_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Sub Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Data Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DATA_PROPERTY_OF_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTIES__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTIES__ONTOLOGY = DATA_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTIES__PROPERTY = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disjoint Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTIES__DISJOINT_PROPERTIES = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disjoint Data Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_DATA_PROPERTIES_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTIES__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTIES__ONTOLOGY = DATA_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTIES__PROPERTY = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equivalent Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTIES__EQUIVALENT_PROPERTIES = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalent Data Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_DATA_PROPERTIES_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN__ONTOLOGY = DATA_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN__PROPERTY = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN__DOMAIN = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Property Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_DOMAIN_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE__ONTOLOGY = DATA_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE__PROPERTY = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE__RANGE = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Property Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RANGE_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA_PROPERTY__ANNOTATIONS = DATA_PROPERTY_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA_PROPERTY__ONTOLOGY = DATA_PROPERTY_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA_PROPERTY__PROPERTY = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA_PROPERTY_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_AXIOM__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_AXIOM__ONTOLOGY = AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_AXIOM__PROPERTY = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ASSERTION__ANNOTATIONS = ANNOTATION_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ASSERTION__ONTOLOGY = ANNOTATION_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ASSERTION__PROPERTY = ANNOTATION_AXIOM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ASSERTION__SUBJECT = ANNOTATION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ASSERTION__VALUE = ANNOTATION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ASSERTION_FEATURE_COUNT = ANNOTATION_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ANNOTATION_PROPERTY_OF__ANNOTATIONS = ANNOTATION_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ANNOTATION_PROPERTY_OF__ONTOLOGY = ANNOTATION_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ANNOTATION_PROPERTY_OF__PROPERTY = ANNOTATION_AXIOM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Sub Annotation Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY = ANNOTATION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Annotation Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY = ANNOTATION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Annotation Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ANNOTATION_PROPERTY_OF_FEATURE_COUNT = ANNOTATION_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DOMAIN__ANNOTATIONS = ANNOTATION_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DOMAIN__ONTOLOGY = ANNOTATION_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DOMAIN__PROPERTY = ANNOTATION_AXIOM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DOMAIN__DOMAIN = ANNOTATION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Property Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_DOMAIN_FEATURE_COUNT = ANNOTATION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_RANGE__ANNOTATIONS = ANNOTATION_AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_RANGE__ONTOLOGY = ANNOTATION_AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_RANGE__PROPERTY = ANNOTATION_AXIOM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_RANGE__RANGE = ANNOTATION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Property Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_RANGE_FEATURE_COUNT = ANNOTATION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KEY__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KEY__ONTOLOGY = AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KEY__CLASS_EXPRESSION = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_KEY_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPLEMENT_OF__DATA_RANGE = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Complement Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPLEMENT_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNION_OF__DATA_RANGES = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Union Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNION_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ONE_OF__LITERALS = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ONE_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION__DATATYPE = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION__RESTRICTIONS = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datatype Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_RESTRICTION_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_RESTRICTION__DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_RESTRICTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Facet Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_RESTRICTION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Data Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTERSECTION_OF__DATA_RANGES = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Intersection Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INTERSECTION_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__ONTOLOGY = AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__DATATYPE = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__RESTRICTION = AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datatype Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ONTOLOGY = AXIOM__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ENTITY = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXPRESSIONS = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__NAMESPACE = ENTITY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__EXPRESSIONS = ENTITY__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__NAMESPACE = ENTITY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY__EXPRESSIONS = ENTITY__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__NAME = OWL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__NAMESPACE = OWL_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY__EXPRESSIONS = OWL_PROPERTY__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_FEATURE_COUNT = OWL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__NAME = OWL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__NAMESPACE = OWL_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__EXPRESSIONS = OWL_PROPERTY__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_FEATURE_COUNT = OWL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAMESPACE = ENTITY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__EXPRESSIONS = ENTITY__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__NAMESPACE = ENTITY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL__EXPRESSIONS = ENTITY__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Named Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INDIVIDUAL_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__NAMESPACE = ENTITY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__EXPRESSIONS = ENTITY__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Annotation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Union Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF__UNION_OF = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Union Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_UNION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Intersection Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF__INTERSECTION_OF = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Intersection Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INTERSECTION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complement Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF__COMPLEMENT_OF = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Complement Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPLEMENT_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF__ONE_OF = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ONE_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Property Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__ON_PROPERTY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Some Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SOME_VALUES_FROM_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__ON_PROPERTY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ALL_VALUES_FROM_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__ON_PROPERTY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE__HAS_VALUE = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_VALUE_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF__ON_PROPERTY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Has Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_HAS_SELF_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__ON_PROPERTY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__CARDINALITY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY__ON_CLASS = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXACT_CARDINALITY_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__ON_PROPERTY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__CARDINALITY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY__ON_CLASS = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MAX_CARDINALITY_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__ON_PROPERTY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__CARDINALITY = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY__ON_CLASS = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MIN_CARDINALITY_FEATURE_COUNT = OBJECT_PROPERTY_RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Property Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_RESTRICTION_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__ON_PROPERTIES = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Some Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM__SOME_VALUES_FROM = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Some Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOME_VALUES_FROM_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__ON_PROPERTIES = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Values From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM__ALL_VALUES_FROM = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data All Values From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ALL_VALUES_FROM_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__ON_PROPERTY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE__HAS_VALUE = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_HAS_VALUE_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__ON_PROPERTY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__CARDINALITY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Data Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY__ON_DATA_RANGE = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Exact Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXACT_CARDINALITY_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__ON_PROPERTY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__CARDINALITY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Data Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY__ON_DATA_RANGE = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Max Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAX_CARDINALITY_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__ON_PROPERTY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__CARDINALITY = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Data Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY__ON_DATA_RANGE = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Min Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MIN_CARDINALITY_FEATURE_COUNT = DATA_PROPERTY_RESTRICTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL__NODE_ID = INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anonymous Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_INDIVIDUAL_FEATURE_COUNT = INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyExpressionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyExpression()
	 * @generated
	 */
	int OBJECT_PROPERTY_EXPRESSION = 78;

	/**
	 * The number of structural features of the '<em>Object Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyChainImpl <em>Object Property Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyChainImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyChain()
	 * @generated
	 */
	int OBJECT_PROPERTY_CHAIN = 79;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN__PROPERTIES = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Property Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_CHAIN_FEATURE_COUNT = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataPropertyExpressionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyExpression()
	 * @generated
	 */
	int DATA_PROPERTY_EXPRESSION = 80;

	/**
	 * The number of structural features of the '<em>Data Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotationPropertyExpressionImpl <em>Annotation Property Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotationPropertyExpressionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationPropertyExpression()
	 * @generated
	 */
	int ANNOTATION_PROPERTY_EXPRESSION = 81;

	/**
	 * The number of structural features of the '<em>Annotation Property Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.LiteralImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 82;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Datatype Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__DATATYPE_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AnnotationImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 83;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.AssertionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 84;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ANNOTATIONS = AXIOM__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ONTOLOGY = AXIOM__ONTOLOGY;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.SameIndividualImpl <em>Same Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.SameIndividualImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSameIndividual()
	 * @generated
	 */
	int SAME_INDIVIDUAL = 85;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL__ONTOLOGY = ASSERTION__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL__INDIVIDUALS = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Same Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_INDIVIDUAL_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DifferentIndividualsImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDifferentIndividuals()
	 * @generated
	 */
	int DIFFERENT_INDIVIDUALS = 86;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUALS__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUALS__ONTOLOGY = ASSERTION__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUALS__INDIVIDUALS = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Different Individuals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_INDIVIDUALS_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ClassAssertionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassAssertion()
	 * @generated
	 */
	int CLASS_ASSERTION = 87;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION__ONTOLOGY = ASSERTION__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION__CLASS_EXPRESSION = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION__INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.ObjectPropertyAssertionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyAssertion()
	 * @generated
	 */
	int OBJECT_PROPERTY_ASSERTION = 88;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__ONTOLOGY = ASSERTION__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Object Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.NegativeObjectPropertyAssertionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNegativeObjectPropertyAssertion()
	 * @generated
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION = 89;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__ONTOLOGY = ASSERTION__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Object Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Negative Object Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_OBJECT_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.DataPropertyAssertionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyAssertion()
	 * @generated
	 */
	int DATA_PROPERTY_ASSERTION = 90;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__ONTOLOGY = ASSERTION__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__DATA_PROPERTY = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION__TARGET_VALUE = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.emf4sw.owl.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.owl.impl.NegativeDataPropertyAssertionImpl
	 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNegativeDataPropertyAssertion()
	 * @generated
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION = 91;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__ANNOTATIONS = ASSERTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__ONTOLOGY = ASSERTION__ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Data Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Negative Data Property Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_DATA_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see com.emf4sw.owl.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Ontology#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see com.emf4sw.owl.Ontology#getNamespaces()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Namespaces();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.Ontology#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see com.emf4sw.owl.Ontology#getURI()
	 * @see #getOntology()
	 * @generated
	 */
	EAttribute getOntology_URI();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.Ontology#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see com.emf4sw.owl.Ontology#getImports()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Ontology#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see com.emf4sw.owl.Ontology#getAnnotations()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Ontology#getAxioms <em>Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axioms</em>'.
	 * @see com.emf4sw.owl.Ontology#getAxioms()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Axioms();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see com.emf4sw.owl.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.Namespace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emf4sw.owl.Namespace#getName()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.Namespace#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see com.emf4sw.owl.Namespace#getURI()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_URI();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axiom</em>'.
	 * @see com.emf4sw.owl.Axiom
	 * @generated
	 */
	EClass getAxiom();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Axiom#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see com.emf4sw.owl.Axiom#getAnnotations()
	 * @see #getAxiom()
	 * @generated
	 */
	EReference getAxiom_Annotations();

	/**
	 * Returns the meta object for the container reference '{@link com.emf4sw.owl.Axiom#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ontology</em>'.
	 * @see com.emf4sw.owl.Axiom#getOntology()
	 * @see #getAxiom()
	 * @generated
	 */
	EReference getAxiom_Ontology();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ClassExpressionAxiom <em>Class Expression Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Expression Axiom</em>'.
	 * @see com.emf4sw.owl.ClassExpressionAxiom
	 * @generated
	 */
	EClass getClassExpressionAxiom();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.SubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Class Of</em>'.
	 * @see com.emf4sw.owl.SubClassOf
	 * @generated
	 */
	EClass getSubClassOf();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.SubClassOf#getSubClass <em>Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Class</em>'.
	 * @see com.emf4sw.owl.SubClassOf#getSubClass()
	 * @see #getSubClassOf()
	 * @generated
	 */
	EReference getSubClassOf_SubClass();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.SubClassOf#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Class</em>'.
	 * @see com.emf4sw.owl.SubClassOf#getSuperClass()
	 * @see #getSubClassOf()
	 * @generated
	 */
	EReference getSubClassOf_SuperClass();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DisjointClasses <em>Disjoint Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Classes</em>'.
	 * @see com.emf4sw.owl.DisjointClasses
	 * @generated
	 */
	EClass getDisjointClasses();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DisjointClasses#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.emf4sw.owl.DisjointClasses#getExpression()
	 * @see #getDisjointClasses()
	 * @generated
	 */
	EReference getDisjointClasses_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DisjointClasses#getDisjointClasses <em>Disjoint Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disjoint Classes</em>'.
	 * @see com.emf4sw.owl.DisjointClasses#getDisjointClasses()
	 * @see #getDisjointClasses()
	 * @generated
	 */
	EReference getDisjointClasses_DisjointClasses();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.EquivalentClasses <em>Equivalent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Classes</em>'.
	 * @see com.emf4sw.owl.EquivalentClasses
	 * @generated
	 */
	EClass getEquivalentClasses();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.EquivalentClasses#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.emf4sw.owl.EquivalentClasses#getExpression()
	 * @see #getEquivalentClasses()
	 * @generated
	 */
	EReference getEquivalentClasses_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.EquivalentClasses#getEquivalentClasses <em>Equivalent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equivalent Classes</em>'.
	 * @see com.emf4sw.owl.EquivalentClasses#getEquivalentClasses()
	 * @see #getEquivalentClasses()
	 * @generated
	 */
	EReference getEquivalentClasses_EquivalentClasses();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DisjointUnion <em>Disjoint Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Union</em>'.
	 * @see com.emf4sw.owl.DisjointUnion
	 * @generated
	 */
	EClass getDisjointUnion();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DisjointUnion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.emf4sw.owl.DisjointUnion#getExpression()
	 * @see #getDisjointUnion()
	 * @generated
	 */
	EReference getDisjointUnion_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DisjointUnion#getDisjointClasses <em>Disjoint Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disjoint Classes</em>'.
	 * @see com.emf4sw.owl.DisjointUnion#getDisjointClasses()
	 * @see #getDisjointUnion()
	 * @generated
	 */
	EReference getDisjointUnion_DisjointClasses();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Axiom</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyAxiom
	 * @generated
	 */
	EClass getObjectPropertyAxiom();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Object Property Of</em>'.
	 * @see com.emf4sw.owl.SubObjectPropertyOf
	 * @generated
	 */
	EClass getSubObjectPropertyOf();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.SubObjectPropertyOf#getSubObjectProperty <em>Sub Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Object Property</em>'.
	 * @see com.emf4sw.owl.SubObjectPropertyOf#getSubObjectProperty()
	 * @see #getSubObjectPropertyOf()
	 * @generated
	 */
	EReference getSubObjectPropertyOf_SubObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.SubObjectPropertyOf#getSuperObjectProperty <em>Super Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Object Property</em>'.
	 * @see com.emf4sw.owl.SubObjectPropertyOf#getSuperObjectProperty()
	 * @see #getSubObjectPropertyOf()
	 * @generated
	 */
	EReference getSubObjectPropertyOf_SuperObjectProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectPropertyDomain <em>Object Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Domain</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyDomain
	 * @generated
	 */
	EClass getObjectPropertyDomain();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectPropertyDomain#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyDomain#getProperty()
	 * @see #getObjectPropertyDomain()
	 * @generated
	 */
	EReference getObjectPropertyDomain_Property();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectPropertyDomain#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyDomain#getDomain()
	 * @see #getObjectPropertyDomain()
	 * @generated
	 */
	EReference getObjectPropertyDomain_Domain();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectPropertyRange <em>Object Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Range</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyRange
	 * @generated
	 */
	EClass getObjectPropertyRange();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectPropertyRange#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyRange#getProperty()
	 * @see #getObjectPropertyRange()
	 * @generated
	 */
	EReference getObjectPropertyRange_Property();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectPropertyRange#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyRange#getRange()
	 * @see #getObjectPropertyRange()
	 * @generated
	 */
	EReference getObjectPropertyRange_Range();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Object Properties</em>'.
	 * @see com.emf4sw.owl.EquivalentObjectProperties
	 * @generated
	 */
	EClass getEquivalentObjectProperties();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.EquivalentObjectProperties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.EquivalentObjectProperties#getProperty()
	 * @see #getEquivalentObjectProperties()
	 * @generated
	 */
	EReference getEquivalentObjectProperties_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.EquivalentObjectProperties#getEquivalentProperties <em>Equivalent Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equivalent Properties</em>'.
	 * @see com.emf4sw.owl.EquivalentObjectProperties#getEquivalentProperties()
	 * @see #getEquivalentObjectProperties()
	 * @generated
	 */
	EReference getEquivalentObjectProperties_EquivalentProperties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Object Properties</em>'.
	 * @see com.emf4sw.owl.DisjointObjectProperties
	 * @generated
	 */
	EClass getDisjointObjectProperties();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DisjointObjectProperties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.DisjointObjectProperties#getProperty()
	 * @see #getDisjointObjectProperties()
	 * @generated
	 */
	EReference getDisjointObjectProperties_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DisjointObjectProperties#getDisjointProperties <em>Disjoint Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disjoint Properties</em>'.
	 * @see com.emf4sw.owl.DisjointObjectProperties#getDisjointProperties()
	 * @see #getDisjointObjectProperties()
	 * @generated
	 */
	EReference getDisjointObjectProperties_DisjointProperties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.InverseObjectProperties <em>Inverse Object Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse Object Properties</em>'.
	 * @see com.emf4sw.owl.InverseObjectProperties
	 * @generated
	 */
	EClass getInverseObjectProperties();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.InverseObjectProperties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.InverseObjectProperties#getProperty()
	 * @see #getInverseObjectProperties()
	 * @generated
	 */
	EReference getInverseObjectProperties_Property();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.InverseObjectProperties#getInverseProperty <em>Inverse Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverse Property</em>'.
	 * @see com.emf4sw.owl.InverseObjectProperties#getInverseProperty()
	 * @see #getInverseObjectProperties()
	 * @generated
	 */
	EReference getInverseObjectProperties_InverseProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.FunctionalObjectProperty <em>Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Object Property</em>'.
	 * @see com.emf4sw.owl.FunctionalObjectProperty
	 * @generated
	 */
	EClass getFunctionalObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.FunctionalObjectProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.FunctionalObjectProperty#getProperty()
	 * @see #getFunctionalObjectProperty()
	 * @generated
	 */
	EReference getFunctionalObjectProperty_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse Functional Object Property</em>'.
	 * @see com.emf4sw.owl.InverseFunctionalObjectProperty
	 * @generated
	 */
	EClass getInverseFunctionalObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.InverseFunctionalObjectProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.InverseFunctionalObjectProperty#getProperty()
	 * @see #getInverseFunctionalObjectProperty()
	 * @generated
	 */
	EReference getInverseFunctionalObjectProperty_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symmetric Object Property</em>'.
	 * @see com.emf4sw.owl.SymmetricObjectProperty
	 * @generated
	 */
	EClass getSymmetricObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.SymmetricObjectProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.SymmetricObjectProperty#getProperty()
	 * @see #getSymmetricObjectProperty()
	 * @generated
	 */
	EReference getSymmetricObjectProperty_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflexive Object Property</em>'.
	 * @see com.emf4sw.owl.ReflexiveObjectProperty
	 * @generated
	 */
	EClass getReflexiveObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ReflexiveObjectProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.ReflexiveObjectProperty#getProperty()
	 * @see #getReflexiveObjectProperty()
	 * @generated
	 */
	EReference getReflexiveObjectProperty_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irreflexive Object Property</em>'.
	 * @see com.emf4sw.owl.IrreflexiveObjectProperty
	 * @generated
	 */
	EClass getIrreflexiveObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.IrreflexiveObjectProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.IrreflexiveObjectProperty#getProperty()
	 * @see #getIrreflexiveObjectProperty()
	 * @generated
	 */
	EReference getIrreflexiveObjectProperty_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transitive Object Property</em>'.
	 * @see com.emf4sw.owl.TransitiveObjectProperty
	 * @generated
	 */
	EClass getTransitiveObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.TransitiveObjectProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.TransitiveObjectProperty#getProperty()
	 * @see #getTransitiveObjectProperty()
	 * @generated
	 */
	EReference getTransitiveObjectProperty_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AssymmetricObjectProperty <em>Assymmetric Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assymmetric Object Property</em>'.
	 * @see com.emf4sw.owl.AssymmetricObjectProperty
	 * @generated
	 */
	EClass getAssymmetricObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.AssymmetricObjectProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.AssymmetricObjectProperty#getProperty()
	 * @see #getAssymmetricObjectProperty()
	 * @generated
	 */
	EReference getAssymmetricObjectProperty_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataPropertyAxiom <em>Data Property Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Axiom</em>'.
	 * @see com.emf4sw.owl.DataPropertyAxiom
	 * @generated
	 */
	EClass getDataPropertyAxiom();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Data Property Of</em>'.
	 * @see com.emf4sw.owl.SubDataPropertyOf
	 * @generated
	 */
	EClass getSubDataPropertyOf();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.SubDataPropertyOf#getSubDataProperty <em>Sub Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Data Property</em>'.
	 * @see com.emf4sw.owl.SubDataPropertyOf#getSubDataProperty()
	 * @see #getSubDataPropertyOf()
	 * @generated
	 */
	EReference getSubDataPropertyOf_SubDataProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.SubDataPropertyOf#getSuperDataProperty <em>Super Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Data Property</em>'.
	 * @see com.emf4sw.owl.SubDataPropertyOf#getSuperDataProperty()
	 * @see #getSubDataPropertyOf()
	 * @generated
	 */
	EReference getSubDataPropertyOf_SuperDataProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Data Properties</em>'.
	 * @see com.emf4sw.owl.DisjointDataProperties
	 * @generated
	 */
	EClass getDisjointDataProperties();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DisjointDataProperties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.DisjointDataProperties#getProperty()
	 * @see #getDisjointDataProperties()
	 * @generated
	 */
	EReference getDisjointDataProperties_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DisjointDataProperties#getDisjointProperties <em>Disjoint Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disjoint Properties</em>'.
	 * @see com.emf4sw.owl.DisjointDataProperties#getDisjointProperties()
	 * @see #getDisjointDataProperties()
	 * @generated
	 */
	EReference getDisjointDataProperties_DisjointProperties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Data Properties</em>'.
	 * @see com.emf4sw.owl.EquivalentDataProperties
	 * @generated
	 */
	EClass getEquivalentDataProperties();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.EquivalentDataProperties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.EquivalentDataProperties#getProperty()
	 * @see #getEquivalentDataProperties()
	 * @generated
	 */
	EReference getEquivalentDataProperties_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.EquivalentDataProperties#getEquivalentProperties <em>Equivalent Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equivalent Properties</em>'.
	 * @see com.emf4sw.owl.EquivalentDataProperties#getEquivalentProperties()
	 * @see #getEquivalentDataProperties()
	 * @generated
	 */
	EReference getEquivalentDataProperties_EquivalentProperties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataPropertyDomain <em>Data Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Domain</em>'.
	 * @see com.emf4sw.owl.DataPropertyDomain
	 * @generated
	 */
	EClass getDataPropertyDomain();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataPropertyDomain#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.DataPropertyDomain#getProperty()
	 * @see #getDataPropertyDomain()
	 * @generated
	 */
	EReference getDataPropertyDomain_Property();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataPropertyDomain#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see com.emf4sw.owl.DataPropertyDomain#getDomain()
	 * @see #getDataPropertyDomain()
	 * @generated
	 */
	EReference getDataPropertyDomain_Domain();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataPropertyRange <em>Data Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Range</em>'.
	 * @see com.emf4sw.owl.DataPropertyRange
	 * @generated
	 */
	EClass getDataPropertyRange();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataPropertyRange#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.DataPropertyRange#getProperty()
	 * @see #getDataPropertyRange()
	 * @generated
	 */
	EReference getDataPropertyRange_Property();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataPropertyRange#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see com.emf4sw.owl.DataPropertyRange#getRange()
	 * @see #getDataPropertyRange()
	 * @generated
	 */
	EReference getDataPropertyRange_Range();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.FunctionalDataProperty <em>Functional Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Data Property</em>'.
	 * @see com.emf4sw.owl.FunctionalDataProperty
	 * @generated
	 */
	EClass getFunctionalDataProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.FunctionalDataProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.FunctionalDataProperty#getProperty()
	 * @see #getFunctionalDataProperty()
	 * @generated
	 */
	EReference getFunctionalDataProperty_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AnnotationAxiom <em>Annotation Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Axiom</em>'.
	 * @see com.emf4sw.owl.AnnotationAxiom
	 * @generated
	 */
	EClass getAnnotationAxiom();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.AnnotationAxiom#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.AnnotationAxiom#getProperty()
	 * @see #getAnnotationAxiom()
	 * @generated
	 */
	EReference getAnnotationAxiom_Property();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AnnotationAssertion <em>Annotation Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Assertion</em>'.
	 * @see com.emf4sw.owl.AnnotationAssertion
	 * @generated
	 */
	EClass getAnnotationAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.AnnotationAssertion#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see com.emf4sw.owl.AnnotationAssertion#getSubject()
	 * @see #getAnnotationAssertion()
	 * @generated
	 */
	EReference getAnnotationAssertion_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.AnnotationAssertion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.emf4sw.owl.AnnotationAssertion#getValue()
	 * @see #getAnnotationAssertion()
	 * @generated
	 */
	EReference getAnnotationAssertion_Value();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.SubAnnotationPropertyOf <em>Sub Annotation Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Annotation Property Of</em>'.
	 * @see com.emf4sw.owl.SubAnnotationPropertyOf
	 * @generated
	 */
	EClass getSubAnnotationPropertyOf();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.SubAnnotationPropertyOf#getSubAnnotationProperty <em>Sub Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Annotation Property</em>'.
	 * @see com.emf4sw.owl.SubAnnotationPropertyOf#getSubAnnotationProperty()
	 * @see #getSubAnnotationPropertyOf()
	 * @generated
	 */
	EReference getSubAnnotationPropertyOf_SubAnnotationProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.SubAnnotationPropertyOf#getSuperAnnotationProperty <em>Super Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Annotation Property</em>'.
	 * @see com.emf4sw.owl.SubAnnotationPropertyOf#getSuperAnnotationProperty()
	 * @see #getSubAnnotationPropertyOf()
	 * @generated
	 */
	EReference getSubAnnotationPropertyOf_SuperAnnotationProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AnnotationPropertyDomain <em>Annotation Property Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Property Domain</em>'.
	 * @see com.emf4sw.owl.AnnotationPropertyDomain
	 * @generated
	 */
	EClass getAnnotationPropertyDomain();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.AnnotationPropertyDomain#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see com.emf4sw.owl.AnnotationPropertyDomain#getDomain()
	 * @see #getAnnotationPropertyDomain()
	 * @generated
	 */
	EReference getAnnotationPropertyDomain_Domain();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AnnotationPropertyRange <em>Annotation Property Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Property Range</em>'.
	 * @see com.emf4sw.owl.AnnotationPropertyRange
	 * @generated
	 */
	EClass getAnnotationPropertyRange();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.AnnotationPropertyRange#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see com.emf4sw.owl.AnnotationPropertyRange#getRange()
	 * @see #getAnnotationPropertyRange()
	 * @generated
	 */
	EReference getAnnotationPropertyRange_Range();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.HasKey <em>Has Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Key</em>'.
	 * @see com.emf4sw.owl.HasKey
	 * @generated
	 */
	EClass getHasKey();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.HasKey#getClassExpression <em>Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Expression</em>'.
	 * @see com.emf4sw.owl.HasKey#getClassExpression()
	 * @see #getHasKey()
	 * @generated
	 */
	EReference getHasKey_ClassExpression();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range</em>'.
	 * @see com.emf4sw.owl.DataRange
	 * @generated
	 */
	EClass getDataRange();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataComplementOf <em>Data Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Complement Of</em>'.
	 * @see com.emf4sw.owl.DataComplementOf
	 * @generated
	 */
	EClass getDataComplementOf();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataComplementOf#getDataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Range</em>'.
	 * @see com.emf4sw.owl.DataComplementOf#getDataRange()
	 * @see #getDataComplementOf()
	 * @generated
	 */
	EReference getDataComplementOf_DataRange();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataUnionOf <em>Data Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Union Of</em>'.
	 * @see com.emf4sw.owl.DataUnionOf
	 * @generated
	 */
	EClass getDataUnionOf();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DataUnionOf#getDataRanges <em>Data Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Ranges</em>'.
	 * @see com.emf4sw.owl.DataUnionOf#getDataRanges()
	 * @see #getDataUnionOf()
	 * @generated
	 */
	EReference getDataUnionOf_DataRanges();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataOneOf <em>Data One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data One Of</em>'.
	 * @see com.emf4sw.owl.DataOneOf
	 * @generated
	 */
	EClass getDataOneOf();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DataOneOf#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see com.emf4sw.owl.DataOneOf#getLiterals()
	 * @see #getDataOneOf()
	 * @generated
	 */
	EReference getDataOneOf_Literals();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DatatypeRestriction <em>Datatype Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Restriction</em>'.
	 * @see com.emf4sw.owl.DatatypeRestriction
	 * @generated
	 */
	EClass getDatatypeRestriction();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DatatypeRestriction#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype</em>'.
	 * @see com.emf4sw.owl.DatatypeRestriction#getDatatype()
	 * @see #getDatatypeRestriction()
	 * @generated
	 */
	EReference getDatatypeRestriction_Datatype();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DatatypeRestriction#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restrictions</em>'.
	 * @see com.emf4sw.owl.DatatypeRestriction#getRestrictions()
	 * @see #getDatatypeRestriction()
	 * @generated
	 */
	EReference getDatatypeRestriction_Restrictions();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.FacetRestriction <em>Facet Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet Restriction</em>'.
	 * @see com.emf4sw.owl.FacetRestriction
	 * @generated
	 */
	EClass getFacetRestriction();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.FacetRestriction#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype</em>'.
	 * @see com.emf4sw.owl.FacetRestriction#getDatatype()
	 * @see #getFacetRestriction()
	 * @generated
	 */
	EReference getFacetRestriction_Datatype();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.FacetRestriction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.emf4sw.owl.FacetRestriction#getValue()
	 * @see #getFacetRestriction()
	 * @generated
	 */
	EReference getFacetRestriction_Value();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataIntersectionOf <em>Data Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Intersection Of</em>'.
	 * @see com.emf4sw.owl.DataIntersectionOf
	 * @generated
	 */
	EClass getDataIntersectionOf();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DataIntersectionOf#getDataRanges <em>Data Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Ranges</em>'.
	 * @see com.emf4sw.owl.DataIntersectionOf#getDataRanges()
	 * @see #getDataIntersectionOf()
	 * @generated
	 */
	EReference getDataIntersectionOf_DataRanges();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DatatypeDefinition <em>Datatype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition</em>'.
	 * @see com.emf4sw.owl.DatatypeDefinition
	 * @generated
	 */
	EClass getDatatypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DatatypeDefinition#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype</em>'.
	 * @see com.emf4sw.owl.DatatypeDefinition#getDatatype()
	 * @see #getDatatypeDefinition()
	 * @generated
	 */
	EReference getDatatypeDefinition_Datatype();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DatatypeDefinition#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see com.emf4sw.owl.DatatypeDefinition#getRestriction()
	 * @see #getDatatypeDefinition()
	 * @generated
	 */
	EReference getDatatypeDefinition_Restriction();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see com.emf4sw.owl.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.Declaration#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see com.emf4sw.owl.Declaration#getEntity()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Entity();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.emf4sw.owl.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.Entity#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see com.emf4sw.owl.Entity#getNamespace()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Namespace();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.owl.Entity#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expressions</em>'.
	 * @see com.emf4sw.owl.Entity#getExpressions()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.emf4sw.owl.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.OWLClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see com.emf4sw.owl.OWLClass
	 * @generated
	 */
	EClass getOWLClass();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.OWLProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.emf4sw.owl.OWLProperty
	 * @generated
	 */
	EClass getOWLProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property</em>'.
	 * @see com.emf4sw.owl.ObjectProperty
	 * @generated
	 */
	EClass getObjectProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property</em>'.
	 * @see com.emf4sw.owl.DataProperty
	 * @generated
	 */
	EClass getDataProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see com.emf4sw.owl.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.NamedIndividual <em>Named Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Individual</em>'.
	 * @see com.emf4sw.owl.NamedIndividual
	 * @generated
	 */
	EClass getNamedIndividual();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Property</em>'.
	 * @see com.emf4sw.owl.AnnotationProperty
	 * @generated
	 */
	EClass getAnnotationProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ClassExpression <em>Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Expression</em>'.
	 * @see com.emf4sw.owl.ClassExpression
	 * @generated
	 */
	EClass getClassExpression();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectUnionOf <em>Object Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Union Of</em>'.
	 * @see com.emf4sw.owl.ObjectUnionOf
	 * @generated
	 */
	EClass getObjectUnionOf();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.ObjectUnionOf#getUnionOf <em>Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Of</em>'.
	 * @see com.emf4sw.owl.ObjectUnionOf#getUnionOf()
	 * @see #getObjectUnionOf()
	 * @generated
	 */
	EReference getObjectUnionOf_UnionOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Intersection Of</em>'.
	 * @see com.emf4sw.owl.ObjectIntersectionOf
	 * @generated
	 */
	EClass getObjectIntersectionOf();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.ObjectIntersectionOf#getIntersectionOf <em>Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intersection Of</em>'.
	 * @see com.emf4sw.owl.ObjectIntersectionOf#getIntersectionOf()
	 * @see #getObjectIntersectionOf()
	 * @generated
	 */
	EReference getObjectIntersectionOf_IntersectionOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectComplementOf <em>Object Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Complement Of</em>'.
	 * @see com.emf4sw.owl.ObjectComplementOf
	 * @generated
	 */
	EClass getObjectComplementOf();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectComplementOf#getComplementOf <em>Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complement Of</em>'.
	 * @see com.emf4sw.owl.ObjectComplementOf#getComplementOf()
	 * @see #getObjectComplementOf()
	 * @generated
	 */
	EReference getObjectComplementOf_ComplementOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectOneOf <em>Object One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object One Of</em>'.
	 * @see com.emf4sw.owl.ObjectOneOf
	 * @generated
	 */
	EClass getObjectOneOf();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.ObjectOneOf#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One Of</em>'.
	 * @see com.emf4sw.owl.ObjectOneOf#getOneOf()
	 * @see #getObjectOneOf()
	 * @generated
	 */
	EReference getObjectOneOf_OneOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectPropertyRestriction <em>Object Property Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Restriction</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyRestriction
	 * @generated
	 */
	EClass getObjectPropertyRestriction();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Some Values From</em>'.
	 * @see com.emf4sw.owl.ObjectSomeValuesFrom
	 * @generated
	 */
	EClass getObjectSomeValuesFrom();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectSomeValuesFrom#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.ObjectSomeValuesFrom#getOnProperty()
	 * @see #getObjectSomeValuesFrom()
	 * @generated
	 */
	EReference getObjectSomeValuesFrom_OnProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectSomeValuesFrom#getSomeValuesFrom <em>Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Some Values From</em>'.
	 * @see com.emf4sw.owl.ObjectSomeValuesFrom#getSomeValuesFrom()
	 * @see #getObjectSomeValuesFrom()
	 * @generated
	 */
	EReference getObjectSomeValuesFrom_SomeValuesFrom();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectAllValuesFrom <em>Object All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object All Values From</em>'.
	 * @see com.emf4sw.owl.ObjectAllValuesFrom
	 * @generated
	 */
	EClass getObjectAllValuesFrom();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectAllValuesFrom#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.ObjectAllValuesFrom#getOnProperty()
	 * @see #getObjectAllValuesFrom()
	 * @generated
	 */
	EReference getObjectAllValuesFrom_OnProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectAllValuesFrom#getAllValuesFrom <em>All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Values From</em>'.
	 * @see com.emf4sw.owl.ObjectAllValuesFrom#getAllValuesFrom()
	 * @see #getObjectAllValuesFrom()
	 * @generated
	 */
	EReference getObjectAllValuesFrom_AllValuesFrom();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectHasValue <em>Object Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Has Value</em>'.
	 * @see com.emf4sw.owl.ObjectHasValue
	 * @generated
	 */
	EClass getObjectHasValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectHasValue#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.ObjectHasValue#getOnProperty()
	 * @see #getObjectHasValue()
	 * @generated
	 */
	EReference getObjectHasValue_OnProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectHasValue#getHasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Value</em>'.
	 * @see com.emf4sw.owl.ObjectHasValue#getHasValue()
	 * @see #getObjectHasValue()
	 * @generated
	 */
	EReference getObjectHasValue_HasValue();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectHasSelf <em>Object Has Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Has Self</em>'.
	 * @see com.emf4sw.owl.ObjectHasSelf
	 * @generated
	 */
	EClass getObjectHasSelf();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectHasSelf#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.ObjectHasSelf#getOnProperty()
	 * @see #getObjectHasSelf()
	 * @generated
	 */
	EReference getObjectHasSelf_OnProperty();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Exact Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectExactCardinality
	 * @generated
	 */
	EClass getObjectExactCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectExactCardinality#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.ObjectExactCardinality#getOnProperty()
	 * @see #getObjectExactCardinality()
	 * @generated
	 */
	EReference getObjectExactCardinality_OnProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectExactCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectExactCardinality#getCardinality()
	 * @see #getObjectExactCardinality()
	 * @generated
	 */
	EAttribute getObjectExactCardinality_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectExactCardinality#getOnClass <em>On Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Class</em>'.
	 * @see com.emf4sw.owl.ObjectExactCardinality#getOnClass()
	 * @see #getObjectExactCardinality()
	 * @generated
	 */
	EReference getObjectExactCardinality_OnClass();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Max Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectMaxCardinality
	 * @generated
	 */
	EClass getObjectMaxCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectMaxCardinality#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.ObjectMaxCardinality#getOnProperty()
	 * @see #getObjectMaxCardinality()
	 * @generated
	 */
	EReference getObjectMaxCardinality_OnProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectMaxCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectMaxCardinality#getCardinality()
	 * @see #getObjectMaxCardinality()
	 * @generated
	 */
	EAttribute getObjectMaxCardinality_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectMaxCardinality#getOnClass <em>On Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Class</em>'.
	 * @see com.emf4sw.owl.ObjectMaxCardinality#getOnClass()
	 * @see #getObjectMaxCardinality()
	 * @generated
	 */
	EReference getObjectMaxCardinality_OnClass();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Min Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectMinCardinality
	 * @generated
	 */
	EClass getObjectMinCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectMinCardinality#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.ObjectMinCardinality#getOnProperty()
	 * @see #getObjectMinCardinality()
	 * @generated
	 */
	EReference getObjectMinCardinality_OnProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.ObjectMinCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.ObjectMinCardinality#getCardinality()
	 * @see #getObjectMinCardinality()
	 * @generated
	 */
	EAttribute getObjectMinCardinality_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectMinCardinality#getOnClass <em>On Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Class</em>'.
	 * @see com.emf4sw.owl.ObjectMinCardinality#getOnClass()
	 * @see #getObjectMinCardinality()
	 * @generated
	 */
	EReference getObjectMinCardinality_OnClass();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataPropertyRestriction <em>Data Property Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Restriction</em>'.
	 * @see com.emf4sw.owl.DataPropertyRestriction
	 * @generated
	 */
	EClass getDataPropertyRestriction();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataSomeValuesFrom <em>Data Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Some Values From</em>'.
	 * @see com.emf4sw.owl.DataSomeValuesFrom
	 * @generated
	 */
	EClass getDataSomeValuesFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DataSomeValuesFrom#getOnProperties <em>On Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Properties</em>'.
	 * @see com.emf4sw.owl.DataSomeValuesFrom#getOnProperties()
	 * @see #getDataSomeValuesFrom()
	 * @generated
	 */
	EReference getDataSomeValuesFrom_OnProperties();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataSomeValuesFrom#getSomeValuesFrom <em>Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Some Values From</em>'.
	 * @see com.emf4sw.owl.DataSomeValuesFrom#getSomeValuesFrom()
	 * @see #getDataSomeValuesFrom()
	 * @generated
	 */
	EReference getDataSomeValuesFrom_SomeValuesFrom();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataAllValuesFrom <em>Data All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data All Values From</em>'.
	 * @see com.emf4sw.owl.DataAllValuesFrom
	 * @generated
	 */
	EClass getDataAllValuesFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DataAllValuesFrom#getOnProperties <em>On Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Properties</em>'.
	 * @see com.emf4sw.owl.DataAllValuesFrom#getOnProperties()
	 * @see #getDataAllValuesFrom()
	 * @generated
	 */
	EReference getDataAllValuesFrom_OnProperties();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataAllValuesFrom#getAllValuesFrom <em>All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Values From</em>'.
	 * @see com.emf4sw.owl.DataAllValuesFrom#getAllValuesFrom()
	 * @see #getDataAllValuesFrom()
	 * @generated
	 */
	EReference getDataAllValuesFrom_AllValuesFrom();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataHasValue <em>Data Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Has Value</em>'.
	 * @see com.emf4sw.owl.DataHasValue
	 * @generated
	 */
	EClass getDataHasValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataHasValue#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.DataHasValue#getOnProperty()
	 * @see #getDataHasValue()
	 * @generated
	 */
	EReference getDataHasValue_OnProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataHasValue#getHasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Value</em>'.
	 * @see com.emf4sw.owl.DataHasValue#getHasValue()
	 * @see #getDataHasValue()
	 * @generated
	 */
	EReference getDataHasValue_HasValue();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataExactCardinality <em>Data Exact Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Exact Cardinality</em>'.
	 * @see com.emf4sw.owl.DataExactCardinality
	 * @generated
	 */
	EClass getDataExactCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataExactCardinality#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.DataExactCardinality#getOnProperty()
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	EReference getDataExactCardinality_OnProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.DataExactCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.DataExactCardinality#getCardinality()
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	EAttribute getDataExactCardinality_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataExactCardinality#getOnDataRange <em>On Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Data Range</em>'.
	 * @see com.emf4sw.owl.DataExactCardinality#getOnDataRange()
	 * @see #getDataExactCardinality()
	 * @generated
	 */
	EReference getDataExactCardinality_OnDataRange();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataMaxCardinality <em>Data Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Max Cardinality</em>'.
	 * @see com.emf4sw.owl.DataMaxCardinality
	 * @generated
	 */
	EClass getDataMaxCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataMaxCardinality#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.DataMaxCardinality#getOnProperty()
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	EReference getDataMaxCardinality_OnProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.DataMaxCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.DataMaxCardinality#getCardinality()
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	EAttribute getDataMaxCardinality_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataMaxCardinality#getOnDataRange <em>On Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Data Range</em>'.
	 * @see com.emf4sw.owl.DataMaxCardinality#getOnDataRange()
	 * @see #getDataMaxCardinality()
	 * @generated
	 */
	EReference getDataMaxCardinality_OnDataRange();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataMinCardinality <em>Data Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Min Cardinality</em>'.
	 * @see com.emf4sw.owl.DataMinCardinality
	 * @generated
	 */
	EClass getDataMinCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataMinCardinality#getOnProperty <em>On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Property</em>'.
	 * @see com.emf4sw.owl.DataMinCardinality#getOnProperty()
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	EReference getDataMinCardinality_OnProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.DataMinCardinality#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.emf4sw.owl.DataMinCardinality#getCardinality()
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	EAttribute getDataMinCardinality_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataMinCardinality#getOnDataRange <em>On Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Data Range</em>'.
	 * @see com.emf4sw.owl.DataMinCardinality#getOnDataRange()
	 * @see #getDataMinCardinality()
	 * @generated
	 */
	EReference getDataMinCardinality_OnDataRange();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see com.emf4sw.owl.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AnonymousIndividual <em>Anonymous Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Individual</em>'.
	 * @see com.emf4sw.owl.AnonymousIndividual
	 * @generated
	 */
	EClass getAnonymousIndividual();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.AnonymousIndividual#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see com.emf4sw.owl.AnonymousIndividual#getNodeID()
	 * @see #getAnonymousIndividual()
	 * @generated
	 */
	EAttribute getAnonymousIndividual_NodeID();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.EntityExpression <em>Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Expression</em>'.
	 * @see com.emf4sw.owl.EntityExpression
	 * @generated
	 */
	EClass getEntityExpression();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.IRIEntityExpression <em>IRI Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRI Entity Expression</em>'.
	 * @see com.emf4sw.owl.IRIEntityExpression
	 * @generated
	 */
	EClass getIRIEntityExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.IRIEntityExpression#getIRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IRI</em>'.
	 * @see com.emf4sw.owl.IRIEntityExpression#getIRI()
	 * @see #getIRIEntityExpression()
	 * @generated
	 */
	EAttribute getIRIEntityExpression_IRI();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.PrefixEntityExpression <em>Prefix Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix Entity Expression</em>'.
	 * @see com.emf4sw.owl.PrefixEntityExpression
	 * @generated
	 */
	EClass getPrefixEntityExpression();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.PrefixEntityExpression#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see com.emf4sw.owl.PrefixEntityExpression#getNamespace()
	 * @see #getPrefixEntityExpression()
	 * @generated
	 */
	EReference getPrefixEntityExpression_Namespace();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.PrefixEntityExpression#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see com.emf4sw.owl.PrefixEntityExpression#getReference()
	 * @see #getPrefixEntityExpression()
	 * @generated
	 */
	EReference getPrefixEntityExpression_Reference();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.NoPrefixEntityExpression <em>No Prefix Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Prefix Entity Expression</em>'.
	 * @see com.emf4sw.owl.NoPrefixEntityExpression
	 * @generated
	 */
	EClass getNoPrefixEntityExpression();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.owl.NoPrefixEntityExpression#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see com.emf4sw.owl.NoPrefixEntityExpression#getReference()
	 * @see #getNoPrefixEntityExpression()
	 * @generated
	 */
	EReference getNoPrefixEntityExpression_Reference();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectPropertyExpression <em>Object Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Expression</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyExpression
	 * @generated
	 */
	EClass getObjectPropertyExpression();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectPropertyChain <em>Object Property Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Chain</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyChain
	 * @generated
	 */
	EClass getObjectPropertyChain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.ObjectPropertyChain#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyChain#getProperties()
	 * @see #getObjectPropertyChain()
	 * @generated
	 */
	EReference getObjectPropertyChain_Properties();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataPropertyExpression <em>Data Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Expression</em>'.
	 * @see com.emf4sw.owl.DataPropertyExpression
	 * @generated
	 */
	EClass getDataPropertyExpression();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.AnnotationPropertyExpression <em>Annotation Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Property Expression</em>'.
	 * @see com.emf4sw.owl.AnnotationPropertyExpression
	 * @generated
	 */
	EClass getAnnotationPropertyExpression();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see com.emf4sw.owl.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.owl.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.emf4sw.owl.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.Literal#getDatatypeExpression <em>Datatype Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype Expression</em>'.
	 * @see com.emf4sw.owl.Literal#getDatatypeExpression()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_DatatypeExpression();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see com.emf4sw.owl.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.Annotation#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see com.emf4sw.owl.Annotation#getAnnotations()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Annotations();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.Annotation#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see com.emf4sw.owl.Annotation#getProperty()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Property();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.emf4sw.owl.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see com.emf4sw.owl.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.SameIndividual <em>Same Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same Individual</em>'.
	 * @see com.emf4sw.owl.SameIndividual
	 * @generated
	 */
	EClass getSameIndividual();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.SameIndividual#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individuals</em>'.
	 * @see com.emf4sw.owl.SameIndividual#getIndividuals()
	 * @see #getSameIndividual()
	 * @generated
	 */
	EReference getSameIndividual_Individuals();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DifferentIndividuals <em>Different Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Different Individuals</em>'.
	 * @see com.emf4sw.owl.DifferentIndividuals
	 * @generated
	 */
	EClass getDifferentIndividuals();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.owl.DifferentIndividuals#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individuals</em>'.
	 * @see com.emf4sw.owl.DifferentIndividuals#getIndividuals()
	 * @see #getDifferentIndividuals()
	 * @generated
	 */
	EReference getDifferentIndividuals_Individuals();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ClassAssertion <em>Class Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Assertion</em>'.
	 * @see com.emf4sw.owl.ClassAssertion
	 * @generated
	 */
	EClass getClassAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ClassAssertion#getClassExpression <em>Class Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Expression</em>'.
	 * @see com.emf4sw.owl.ClassAssertion#getClassExpression()
	 * @see #getClassAssertion()
	 * @generated
	 */
	EReference getClassAssertion_ClassExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ClassAssertion#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual</em>'.
	 * @see com.emf4sw.owl.ClassAssertion#getIndividual()
	 * @see #getClassAssertion()
	 * @generated
	 */
	EReference getClassAssertion_Individual();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property Assertion</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyAssertion
	 * @generated
	 */
	EClass getObjectPropertyAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectPropertyAssertion#getObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Property</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyAssertion#getObjectProperty()
	 * @see #getObjectPropertyAssertion()
	 * @generated
	 */
	EReference getObjectPropertyAssertion_ObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Individual</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyAssertion#getSourceIndividual()
	 * @see #getObjectPropertyAssertion()
	 * @generated
	 */
	EReference getObjectPropertyAssertion_SourceIndividual();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Individual</em>'.
	 * @see com.emf4sw.owl.ObjectPropertyAssertion#getTargetIndividual()
	 * @see #getObjectPropertyAssertion()
	 * @generated
	 */
	EReference getObjectPropertyAssertion_TargetIndividual();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Object Property Assertion</em>'.
	 * @see com.emf4sw.owl.NegativeObjectPropertyAssertion
	 * @generated
	 */
	EClass getNegativeObjectPropertyAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.NegativeObjectPropertyAssertion#getObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Property</em>'.
	 * @see com.emf4sw.owl.NegativeObjectPropertyAssertion#getObjectProperty()
	 * @see #getNegativeObjectPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeObjectPropertyAssertion_ObjectProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Individual</em>'.
	 * @see com.emf4sw.owl.NegativeObjectPropertyAssertion#getSourceIndividual()
	 * @see #getNegativeObjectPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeObjectPropertyAssertion_SourceIndividual();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Individual</em>'.
	 * @see com.emf4sw.owl.NegativeObjectPropertyAssertion#getTargetIndividual()
	 * @see #getNegativeObjectPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeObjectPropertyAssertion_TargetIndividual();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.DataPropertyAssertion <em>Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Assertion</em>'.
	 * @see com.emf4sw.owl.DataPropertyAssertion
	 * @generated
	 */
	EClass getDataPropertyAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataPropertyAssertion#getDataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Property</em>'.
	 * @see com.emf4sw.owl.DataPropertyAssertion#getDataProperty()
	 * @see #getDataPropertyAssertion()
	 * @generated
	 */
	EReference getDataPropertyAssertion_DataProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Individual</em>'.
	 * @see com.emf4sw.owl.DataPropertyAssertion#getSourceIndividual()
	 * @see #getDataPropertyAssertion()
	 * @generated
	 */
	EReference getDataPropertyAssertion_SourceIndividual();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.DataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Value</em>'.
	 * @see com.emf4sw.owl.DataPropertyAssertion#getTargetValue()
	 * @see #getDataPropertyAssertion()
	 * @generated
	 */
	EReference getDataPropertyAssertion_TargetValue();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.owl.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Data Property Assertion</em>'.
	 * @see com.emf4sw.owl.NegativeDataPropertyAssertion
	 * @generated
	 */
	EClass getNegativeDataPropertyAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.NegativeDataPropertyAssertion#getDataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Property</em>'.
	 * @see com.emf4sw.owl.NegativeDataPropertyAssertion#getDataProperty()
	 * @see #getNegativeDataPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeDataPropertyAssertion_DataProperty();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.NegativeDataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Individual</em>'.
	 * @see com.emf4sw.owl.NegativeDataPropertyAssertion#getSourceIndividual()
	 * @see #getNegativeDataPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeDataPropertyAssertion_SourceIndividual();

	/**
	 * Returns the meta object for the containment reference '{@link com.emf4sw.owl.NegativeDataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Value</em>'.
	 * @see com.emf4sw.owl.NegativeDataPropertyAssertion#getTargetValue()
	 * @see #getNegativeDataPropertyAssertion()
	 * @generated
	 */
	EReference getNegativeDataPropertyAssertion_TargetValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OWLFactory getOWLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.OntologyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__NAMESPACES = eINSTANCE.getOntology_Namespaces();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY__URI = eINSTANCE.getOntology_URI();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__IMPORTS = eINSTANCE.getOntology_Imports();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__ANNOTATIONS = eINSTANCE.getOntology_Annotations();

		/**
		 * The meta object literal for the '<em><b>Axioms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__AXIOMS = eINSTANCE.getOntology_Axioms();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.NamespaceImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__NAME = eINSTANCE.getNamespace_Name();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__URI = eINSTANCE.getNamespace_URI();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AxiomImpl <em>Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AxiomImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAxiom()
		 * @generated
		 */
		EClass AXIOM = eINSTANCE.getAxiom();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIOM__ANNOTATIONS = eINSTANCE.getAxiom_Annotations();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIOM__ONTOLOGY = eINSTANCE.getAxiom_Ontology();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ClassExpressionAxiomImpl <em>Class Expression Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ClassExpressionAxiomImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassExpressionAxiom()
		 * @generated
		 */
		EClass CLASS_EXPRESSION_AXIOM = eINSTANCE.getClassExpressionAxiom();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.SubClassOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSubClassOf()
		 * @generated
		 */
		EClass SUB_CLASS_OF = eINSTANCE.getSubClassOf();

		/**
		 * The meta object literal for the '<em><b>Sub Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CLASS_OF__SUB_CLASS = eINSTANCE.getSubClassOf_SubClass();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CLASS_OF__SUPER_CLASS = eINSTANCE.getSubClassOf_SuperClass();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DisjointClassesImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDisjointClasses()
		 * @generated
		 */
		EClass DISJOINT_CLASSES = eINSTANCE.getDisjointClasses();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_CLASSES__EXPRESSION = eINSTANCE.getDisjointClasses_Expression();

		/**
		 * The meta object literal for the '<em><b>Disjoint Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_CLASSES__DISJOINT_CLASSES = eINSTANCE.getDisjointClasses_DisjointClasses();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.EquivalentClassesImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEquivalentClasses()
		 * @generated
		 */
		EClass EQUIVALENT_CLASSES = eINSTANCE.getEquivalentClasses();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_CLASSES__EXPRESSION = eINSTANCE.getEquivalentClasses_Expression();

		/**
		 * The meta object literal for the '<em><b>Equivalent Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_CLASSES__EQUIVALENT_CLASSES = eINSTANCE.getEquivalentClasses_EquivalentClasses();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DisjointUnionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDisjointUnion()
		 * @generated
		 */
		EClass DISJOINT_UNION = eINSTANCE.getDisjointUnion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_UNION__EXPRESSION = eINSTANCE.getDisjointUnion_Expression();

		/**
		 * The meta object literal for the '<em><b>Disjoint Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_UNION__DISJOINT_CLASSES = eINSTANCE.getDisjointUnion_DisjointClasses();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyAxiomImpl <em>Object Property Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyAxiomImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyAxiom()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_AXIOM = eINSTANCE.getObjectPropertyAxiom();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.SubObjectPropertyOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSubObjectPropertyOf()
		 * @generated
		 */
		EClass SUB_OBJECT_PROPERTY_OF = eINSTANCE.getSubObjectPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Sub Object Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY = eINSTANCE.getSubObjectPropertyOf_SubObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Super Object Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY = eINSTANCE.getSubObjectPropertyOf_SuperObjectProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyDomainImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyDomain()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_DOMAIN = eINSTANCE.getObjectPropertyDomain();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_DOMAIN__PROPERTY = eINSTANCE.getObjectPropertyDomain_Property();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_DOMAIN__DOMAIN = eINSTANCE.getObjectPropertyDomain_Domain();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyRangeImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyRange()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_RANGE = eINSTANCE.getObjectPropertyRange();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_RANGE__PROPERTY = eINSTANCE.getObjectPropertyRange_Property();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_RANGE__RANGE = eINSTANCE.getObjectPropertyRange_Range();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.EquivalentObjectPropertiesImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEquivalentObjectProperties()
		 * @generated
		 */
		EClass EQUIVALENT_OBJECT_PROPERTIES = eINSTANCE.getEquivalentObjectProperties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_OBJECT_PROPERTIES__PROPERTY = eINSTANCE.getEquivalentObjectProperties_Property();

		/**
		 * The meta object literal for the '<em><b>Equivalent Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_OBJECT_PROPERTIES__EQUIVALENT_PROPERTIES = eINSTANCE.getEquivalentObjectProperties_EquivalentProperties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DisjointObjectPropertiesImpl <em>Disjoint Object Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DisjointObjectPropertiesImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDisjointObjectProperties()
		 * @generated
		 */
		EClass DISJOINT_OBJECT_PROPERTIES = eINSTANCE.getDisjointObjectProperties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_OBJECT_PROPERTIES__PROPERTY = eINSTANCE.getDisjointObjectProperties_Property();

		/**
		 * The meta object literal for the '<em><b>Disjoint Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_OBJECT_PROPERTIES__DISJOINT_PROPERTIES = eINSTANCE.getDisjointObjectProperties_DisjointProperties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.InverseObjectPropertiesImpl <em>Inverse Object Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.InverseObjectPropertiesImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getInverseObjectProperties()
		 * @generated
		 */
		EClass INVERSE_OBJECT_PROPERTIES = eINSTANCE.getInverseObjectProperties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE_OBJECT_PROPERTIES__PROPERTY = eINSTANCE.getInverseObjectProperties_Property();

		/**
		 * The meta object literal for the '<em><b>Inverse Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE_OBJECT_PROPERTIES__INVERSE_PROPERTY = eINSTANCE.getInverseObjectProperties_InverseProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.FunctionalObjectPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getFunctionalObjectProperty()
		 * @generated
		 */
		EClass FUNCTIONAL_OBJECT_PROPERTY = eINSTANCE.getFunctionalObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_OBJECT_PROPERTY__PROPERTY = eINSTANCE.getFunctionalObjectProperty_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.InverseFunctionalObjectPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getInverseFunctionalObjectProperty()
		 * @generated
		 */
		EClass INVERSE_FUNCTIONAL_OBJECT_PROPERTY = eINSTANCE.getInverseFunctionalObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE_FUNCTIONAL_OBJECT_PROPERTY__PROPERTY = eINSTANCE.getInverseFunctionalObjectProperty_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.SymmetricObjectPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSymmetricObjectProperty()
		 * @generated
		 */
		EClass SYMMETRIC_OBJECT_PROPERTY = eINSTANCE.getSymmetricObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMMETRIC_OBJECT_PROPERTY__PROPERTY = eINSTANCE.getSymmetricObjectProperty_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ReflexiveObjectPropertyImpl <em>Reflexive Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ReflexiveObjectPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getReflexiveObjectProperty()
		 * @generated
		 */
		EClass REFLEXIVE_OBJECT_PROPERTY = eINSTANCE.getReflexiveObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFLEXIVE_OBJECT_PROPERTY__PROPERTY = eINSTANCE.getReflexiveObjectProperty_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.IrreflexiveObjectPropertyImpl <em>Irreflexive Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.IrreflexiveObjectPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getIrreflexiveObjectProperty()
		 * @generated
		 */
		EClass IRREFLEXIVE_OBJECT_PROPERTY = eINSTANCE.getIrreflexiveObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRREFLEXIVE_OBJECT_PROPERTY__PROPERTY = eINSTANCE.getIrreflexiveObjectProperty_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.TransitiveObjectPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getTransitiveObjectProperty()
		 * @generated
		 */
		EClass TRANSITIVE_OBJECT_PROPERTY = eINSTANCE.getTransitiveObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITIVE_OBJECT_PROPERTY__PROPERTY = eINSTANCE.getTransitiveObjectProperty_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AssymmetricObjectPropertyImpl <em>Assymmetric Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AssymmetricObjectPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAssymmetricObjectProperty()
		 * @generated
		 */
		EClass ASSYMMETRIC_OBJECT_PROPERTY = eINSTANCE.getAssymmetricObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSYMMETRIC_OBJECT_PROPERTY__PROPERTY = eINSTANCE.getAssymmetricObjectProperty_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataPropertyAxiomImpl <em>Data Property Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataPropertyAxiomImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyAxiom()
		 * @generated
		 */
		EClass DATA_PROPERTY_AXIOM = eINSTANCE.getDataPropertyAxiom();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.SubDataPropertyOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSubDataPropertyOf()
		 * @generated
		 */
		EClass SUB_DATA_PROPERTY_OF = eINSTANCE.getSubDataPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Sub Data Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY = eINSTANCE.getSubDataPropertyOf_SubDataProperty();

		/**
		 * The meta object literal for the '<em><b>Super Data Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY = eINSTANCE.getSubDataPropertyOf_SuperDataProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DisjointDataPropertiesImpl <em>Disjoint Data Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DisjointDataPropertiesImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDisjointDataProperties()
		 * @generated
		 */
		EClass DISJOINT_DATA_PROPERTIES = eINSTANCE.getDisjointDataProperties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_DATA_PROPERTIES__PROPERTY = eINSTANCE.getDisjointDataProperties_Property();

		/**
		 * The meta object literal for the '<em><b>Disjoint Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJOINT_DATA_PROPERTIES__DISJOINT_PROPERTIES = eINSTANCE.getDisjointDataProperties_DisjointProperties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.EquivalentDataPropertiesImpl <em>Equivalent Data Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.EquivalentDataPropertiesImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEquivalentDataProperties()
		 * @generated
		 */
		EClass EQUIVALENT_DATA_PROPERTIES = eINSTANCE.getEquivalentDataProperties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_DATA_PROPERTIES__PROPERTY = eINSTANCE.getEquivalentDataProperties_Property();

		/**
		 * The meta object literal for the '<em><b>Equivalent Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_DATA_PROPERTIES__EQUIVALENT_PROPERTIES = eINSTANCE.getEquivalentDataProperties_EquivalentProperties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataPropertyDomainImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyDomain()
		 * @generated
		 */
		EClass DATA_PROPERTY_DOMAIN = eINSTANCE.getDataPropertyDomain();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_DOMAIN__PROPERTY = eINSTANCE.getDataPropertyDomain_Property();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_DOMAIN__DOMAIN = eINSTANCE.getDataPropertyDomain_Domain();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataPropertyRangeImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyRange()
		 * @generated
		 */
		EClass DATA_PROPERTY_RANGE = eINSTANCE.getDataPropertyRange();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_RANGE__PROPERTY = eINSTANCE.getDataPropertyRange_Property();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_RANGE__RANGE = eINSTANCE.getDataPropertyRange_Range();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.FunctionalDataPropertyImpl <em>Functional Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.FunctionalDataPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getFunctionalDataProperty()
		 * @generated
		 */
		EClass FUNCTIONAL_DATA_PROPERTY = eINSTANCE.getFunctionalDataProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DATA_PROPERTY__PROPERTY = eINSTANCE.getFunctionalDataProperty_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotationAxiomImpl <em>Annotation Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotationAxiomImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationAxiom()
		 * @generated
		 */
		EClass ANNOTATION_AXIOM = eINSTANCE.getAnnotationAxiom();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_AXIOM__PROPERTY = eINSTANCE.getAnnotationAxiom_Property();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotationAssertionImpl <em>Annotation Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotationAssertionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationAssertion()
		 * @generated
		 */
		EClass ANNOTATION_ASSERTION = eINSTANCE.getAnnotationAssertion();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_ASSERTION__SUBJECT = eINSTANCE.getAnnotationAssertion_Subject();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_ASSERTION__VALUE = eINSTANCE.getAnnotationAssertion_Value();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.SubAnnotationPropertyOfImpl <em>Sub Annotation Property Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.SubAnnotationPropertyOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSubAnnotationPropertyOf()
		 * @generated
		 */
		EClass SUB_ANNOTATION_PROPERTY_OF = eINSTANCE.getSubAnnotationPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Sub Annotation Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY = eINSTANCE.getSubAnnotationPropertyOf_SubAnnotationProperty();

		/**
		 * The meta object literal for the '<em><b>Super Annotation Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY = eINSTANCE.getSubAnnotationPropertyOf_SuperAnnotationProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotationPropertyDomainImpl <em>Annotation Property Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotationPropertyDomainImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationPropertyDomain()
		 * @generated
		 */
		EClass ANNOTATION_PROPERTY_DOMAIN = eINSTANCE.getAnnotationPropertyDomain();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_PROPERTY_DOMAIN__DOMAIN = eINSTANCE.getAnnotationPropertyDomain_Domain();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotationPropertyRangeImpl <em>Annotation Property Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotationPropertyRangeImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationPropertyRange()
		 * @generated
		 */
		EClass ANNOTATION_PROPERTY_RANGE = eINSTANCE.getAnnotationPropertyRange();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_PROPERTY_RANGE__RANGE = eINSTANCE.getAnnotationPropertyRange_Range();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.HasKeyImpl <em>Has Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.HasKeyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getHasKey()
		 * @generated
		 */
		EClass HAS_KEY = eINSTANCE.getHasKey();

		/**
		 * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_KEY__CLASS_EXPRESSION = eINSTANCE.getHasKey_ClassExpression();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataRangeImpl <em>Data Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataRangeImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataRange()
		 * @generated
		 */
		EClass DATA_RANGE = eINSTANCE.getDataRange();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataComplementOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataComplementOf()
		 * @generated
		 */
		EClass DATA_COMPLEMENT_OF = eINSTANCE.getDataComplementOf();

		/**
		 * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_COMPLEMENT_OF__DATA_RANGE = eINSTANCE.getDataComplementOf_DataRange();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataUnionOfImpl <em>Data Union Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataUnionOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataUnionOf()
		 * @generated
		 */
		EClass DATA_UNION_OF = eINSTANCE.getDataUnionOf();

		/**
		 * The meta object literal for the '<em><b>Data Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNION_OF__DATA_RANGES = eINSTANCE.getDataUnionOf_DataRanges();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataOneOfImpl <em>Data One Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataOneOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataOneOf()
		 * @generated
		 */
		EClass DATA_ONE_OF = eINSTANCE.getDataOneOf();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ONE_OF__LITERALS = eINSTANCE.getDataOneOf_Literals();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DatatypeRestrictionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatypeRestriction()
		 * @generated
		 */
		EClass DATATYPE_RESTRICTION = eINSTANCE.getDatatypeRestriction();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_RESTRICTION__DATATYPE = eINSTANCE.getDatatypeRestriction_Datatype();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_RESTRICTION__RESTRICTIONS = eINSTANCE.getDatatypeRestriction_Restrictions();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.FacetRestrictionImpl <em>Facet Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.FacetRestrictionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getFacetRestriction()
		 * @generated
		 */
		EClass FACET_RESTRICTION = eINSTANCE.getFacetRestriction();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_RESTRICTION__DATATYPE = eINSTANCE.getFacetRestriction_Datatype();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET_RESTRICTION__VALUE = eINSTANCE.getFacetRestriction_Value();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataIntersectionOfImpl <em>Data Intersection Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataIntersectionOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataIntersectionOf()
		 * @generated
		 */
		EClass DATA_INTERSECTION_OF = eINSTANCE.getDataIntersectionOf();

		/**
		 * The meta object literal for the '<em><b>Data Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INTERSECTION_OF__DATA_RANGES = eINSTANCE.getDataIntersectionOf_DataRanges();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DatatypeDefinitionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatypeDefinition()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION = eINSTANCE.getDatatypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION__DATATYPE = eINSTANCE.getDatatypeDefinition_Datatype();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION__RESTRICTION = eINSTANCE.getDatatypeDefinition_Restriction();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DeclarationImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__ENTITY = eINSTANCE.getDeclaration_Entity();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.EntityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__NAMESPACE = eINSTANCE.getEntity_Namespace();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__EXPRESSIONS = eINSTANCE.getEntity_Expressions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.OWLClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.OWLClassImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLClass()
		 * @generated
		 */
		EClass OWL_CLASS = eINSTANCE.getOWLClass();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.OWLPropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.OWLPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getOWLProperty()
		 * @generated
		 */
		EClass OWL_PROPERTY = eINSTANCE.getOWLProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectProperty()
		 * @generated
		 */
		EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataPropertyImpl <em>Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataProperty()
		 * @generated
		 */
		EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DatatypeImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.NamedIndividualImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNamedIndividual()
		 * @generated
		 */
		EClass NAMED_INDIVIDUAL = eINSTANCE.getNamedIndividual();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotationPropertyImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationProperty()
		 * @generated
		 */
		EClass ANNOTATION_PROPERTY = eINSTANCE.getAnnotationProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ClassExpressionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassExpression()
		 * @generated
		 */
		EClass CLASS_EXPRESSION = eINSTANCE.getClassExpression();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectUnionOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectUnionOf()
		 * @generated
		 */
		EClass OBJECT_UNION_OF = eINSTANCE.getObjectUnionOf();

		/**
		 * The meta object literal for the '<em><b>Union Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_UNION_OF__UNION_OF = eINSTANCE.getObjectUnionOf_UnionOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectIntersectionOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectIntersectionOf()
		 * @generated
		 */
		EClass OBJECT_INTERSECTION_OF = eINSTANCE.getObjectIntersectionOf();

		/**
		 * The meta object literal for the '<em><b>Intersection Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INTERSECTION_OF__INTERSECTION_OF = eINSTANCE.getObjectIntersectionOf_IntersectionOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectComplementOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectComplementOf()
		 * @generated
		 */
		EClass OBJECT_COMPLEMENT_OF = eINSTANCE.getObjectComplementOf();

		/**
		 * The meta object literal for the '<em><b>Complement Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_COMPLEMENT_OF__COMPLEMENT_OF = eINSTANCE.getObjectComplementOf_ComplementOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectOneOfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectOneOf()
		 * @generated
		 */
		EClass OBJECT_ONE_OF = eINSTANCE.getObjectOneOf();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ONE_OF__ONE_OF = eINSTANCE.getObjectOneOf_OneOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyRestrictionImpl <em>Object Property Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyRestrictionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyRestriction()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_RESTRICTION = eINSTANCE.getObjectPropertyRestriction();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectSomeValuesFromImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectSomeValuesFrom()
		 * @generated
		 */
		EClass OBJECT_SOME_VALUES_FROM = eINSTANCE.getObjectSomeValuesFrom();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SOME_VALUES_FROM__ON_PROPERTY = eINSTANCE.getObjectSomeValuesFrom_OnProperty();

		/**
		 * The meta object literal for the '<em><b>Some Values From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SOME_VALUES_FROM__SOME_VALUES_FROM = eINSTANCE.getObjectSomeValuesFrom_SomeValuesFrom();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectAllValuesFromImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectAllValuesFrom()
		 * @generated
		 */
		EClass OBJECT_ALL_VALUES_FROM = eINSTANCE.getObjectAllValuesFrom();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ALL_VALUES_FROM__ON_PROPERTY = eINSTANCE.getObjectAllValuesFrom_OnProperty();

		/**
		 * The meta object literal for the '<em><b>All Values From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ALL_VALUES_FROM__ALL_VALUES_FROM = eINSTANCE.getObjectAllValuesFrom_AllValuesFrom();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectHasValueImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectHasValue()
		 * @generated
		 */
		EClass OBJECT_HAS_VALUE = eINSTANCE.getObjectHasValue();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_HAS_VALUE__ON_PROPERTY = eINSTANCE.getObjectHasValue_OnProperty();

		/**
		 * The meta object literal for the '<em><b>Has Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_HAS_VALUE__HAS_VALUE = eINSTANCE.getObjectHasValue_HasValue();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectHasSelfImpl <em>Object Has Self</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectHasSelfImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectHasSelf()
		 * @generated
		 */
		EClass OBJECT_HAS_SELF = eINSTANCE.getObjectHasSelf();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_HAS_SELF__ON_PROPERTY = eINSTANCE.getObjectHasSelf_OnProperty();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectExactCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectExactCardinality()
		 * @generated
		 */
		EClass OBJECT_EXACT_CARDINALITY = eINSTANCE.getObjectExactCardinality();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXACT_CARDINALITY__ON_PROPERTY = eINSTANCE.getObjectExactCardinality_OnProperty();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getObjectExactCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>On Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXACT_CARDINALITY__ON_CLASS = eINSTANCE.getObjectExactCardinality_OnClass();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectMaxCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectMaxCardinality()
		 * @generated
		 */
		EClass OBJECT_MAX_CARDINALITY = eINSTANCE.getObjectMaxCardinality();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAX_CARDINALITY__ON_PROPERTY = eINSTANCE.getObjectMaxCardinality_OnProperty();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMaxCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>On Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MAX_CARDINALITY__ON_CLASS = eINSTANCE.getObjectMaxCardinality_OnClass();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectMinCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectMinCardinality()
		 * @generated
		 */
		EClass OBJECT_MIN_CARDINALITY = eINSTANCE.getObjectMinCardinality();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MIN_CARDINALITY__ON_PROPERTY = eINSTANCE.getObjectMinCardinality_OnProperty();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMinCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>On Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_MIN_CARDINALITY__ON_CLASS = eINSTANCE.getObjectMinCardinality_OnClass();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataPropertyRestrictionImpl <em>Data Property Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataPropertyRestrictionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyRestriction()
		 * @generated
		 */
		EClass DATA_PROPERTY_RESTRICTION = eINSTANCE.getDataPropertyRestriction();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataSomeValuesFromImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataSomeValuesFrom()
		 * @generated
		 */
		EClass DATA_SOME_VALUES_FROM = eINSTANCE.getDataSomeValuesFrom();

		/**
		 * The meta object literal for the '<em><b>On Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOME_VALUES_FROM__ON_PROPERTIES = eINSTANCE.getDataSomeValuesFrom_OnProperties();

		/**
		 * The meta object literal for the '<em><b>Some Values From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOME_VALUES_FROM__SOME_VALUES_FROM = eINSTANCE.getDataSomeValuesFrom_SomeValuesFrom();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataAllValuesFromImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataAllValuesFrom()
		 * @generated
		 */
		EClass DATA_ALL_VALUES_FROM = eINSTANCE.getDataAllValuesFrom();

		/**
		 * The meta object literal for the '<em><b>On Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ALL_VALUES_FROM__ON_PROPERTIES = eINSTANCE.getDataAllValuesFrom_OnProperties();

		/**
		 * The meta object literal for the '<em><b>All Values From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ALL_VALUES_FROM__ALL_VALUES_FROM = eINSTANCE.getDataAllValuesFrom_AllValuesFrom();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataHasValueImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataHasValue()
		 * @generated
		 */
		EClass DATA_HAS_VALUE = eINSTANCE.getDataHasValue();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_HAS_VALUE__ON_PROPERTY = eINSTANCE.getDataHasValue_OnProperty();

		/**
		 * The meta object literal for the '<em><b>Has Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_HAS_VALUE__HAS_VALUE = eINSTANCE.getDataHasValue_HasValue();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataExactCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataExactCardinality()
		 * @generated
		 */
		EClass DATA_EXACT_CARDINALITY = eINSTANCE.getDataExactCardinality();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXACT_CARDINALITY__ON_PROPERTY = eINSTANCE.getDataExactCardinality_OnProperty();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getDataExactCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>On Data Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXACT_CARDINALITY__ON_DATA_RANGE = eINSTANCE.getDataExactCardinality_OnDataRange();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataMaxCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataMaxCardinality()
		 * @generated
		 */
		EClass DATA_MAX_CARDINALITY = eINSTANCE.getDataMaxCardinality();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAX_CARDINALITY__ON_PROPERTY = eINSTANCE.getDataMaxCardinality_OnProperty();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getDataMaxCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>On Data Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAX_CARDINALITY__ON_DATA_RANGE = eINSTANCE.getDataMaxCardinality_OnDataRange();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataMinCardinalityImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataMinCardinality()
		 * @generated
		 */
		EClass DATA_MIN_CARDINALITY = eINSTANCE.getDataMinCardinality();

		/**
		 * The meta object literal for the '<em><b>On Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MIN_CARDINALITY__ON_PROPERTY = eINSTANCE.getDataMinCardinality_OnProperty();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getDataMinCardinality_Cardinality();

		/**
		 * The meta object literal for the '<em><b>On Data Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MIN_CARDINALITY__ON_DATA_RANGE = eINSTANCE.getDataMinCardinality_OnDataRange();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.IndividualImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnonymousIndividualImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnonymousIndividual()
		 * @generated
		 */
		EClass ANONYMOUS_INDIVIDUAL = eINSTANCE.getAnonymousIndividual();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMOUS_INDIVIDUAL__NODE_ID = eINSTANCE.getAnonymousIndividual_NodeID();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.EntityExpressionImpl <em>Entity Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.EntityExpressionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getEntityExpression()
		 * @generated
		 */
		EClass ENTITY_EXPRESSION = eINSTANCE.getEntityExpression();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.IRIEntityExpressionImpl <em>IRI Entity Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.IRIEntityExpressionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getIRIEntityExpression()
		 * @generated
		 */
		EClass IRI_ENTITY_EXPRESSION = eINSTANCE.getIRIEntityExpression();

		/**
		 * The meta object literal for the '<em><b>IRI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRI_ENTITY_EXPRESSION__IRI = eINSTANCE.getIRIEntityExpression_IRI();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.PrefixEntityExpressionImpl <em>Prefix Entity Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.PrefixEntityExpressionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getPrefixEntityExpression()
		 * @generated
		 */
		EClass PREFIX_ENTITY_EXPRESSION = eINSTANCE.getPrefixEntityExpression();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFIX_ENTITY_EXPRESSION__NAMESPACE = eINSTANCE.getPrefixEntityExpression_Namespace();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFIX_ENTITY_EXPRESSION__REFERENCE = eINSTANCE.getPrefixEntityExpression_Reference();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.NoPrefixEntityExpressionImpl <em>No Prefix Entity Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.NoPrefixEntityExpressionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNoPrefixEntityExpression()
		 * @generated
		 */
		EClass NO_PREFIX_ENTITY_EXPRESSION = eINSTANCE.getNoPrefixEntityExpression();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_PREFIX_ENTITY_EXPRESSION__REFERENCE = eINSTANCE.getNoPrefixEntityExpression_Reference();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyExpressionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyExpression()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyExpression();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyChainImpl <em>Object Property Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyChainImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyChain()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_CHAIN = eINSTANCE.getObjectPropertyChain();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_CHAIN__PROPERTIES = eINSTANCE.getObjectPropertyChain_Properties();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataPropertyExpressionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyExpression()
		 * @generated
		 */
		EClass DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyExpression();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotationPropertyExpressionImpl <em>Annotation Property Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotationPropertyExpressionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotationPropertyExpression()
		 * @generated
		 */
		EClass ANNOTATION_PROPERTY_EXPRESSION = eINSTANCE.getAnnotationPropertyExpression();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.LiteralImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Datatype Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__DATATYPE_EXPRESSION = eINSTANCE.getLiteral_DatatypeExpression();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AnnotationImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATIONS = eINSTANCE.getAnnotation_Annotations();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__PROPERTY = eINSTANCE.getAnnotation_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.AssertionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.SameIndividualImpl <em>Same Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.SameIndividualImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getSameIndividual()
		 * @generated
		 */
		EClass SAME_INDIVIDUAL = eINSTANCE.getSameIndividual();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAME_INDIVIDUAL__INDIVIDUALS = eINSTANCE.getSameIndividual_Individuals();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DifferentIndividualsImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDifferentIndividuals()
		 * @generated
		 */
		EClass DIFFERENT_INDIVIDUALS = eINSTANCE.getDifferentIndividuals();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENT_INDIVIDUALS__INDIVIDUALS = eINSTANCE.getDifferentIndividuals_Individuals();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ClassAssertionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getClassAssertion()
		 * @generated
		 */
		EClass CLASS_ASSERTION = eINSTANCE.getClassAssertion();

		/**
		 * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ASSERTION__CLASS_EXPRESSION = eINSTANCE.getClassAssertion_ClassExpression();

		/**
		 * The meta object literal for the '<em><b>Individual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ASSERTION__INDIVIDUAL = eINSTANCE.getClassAssertion_Individual();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.ObjectPropertyAssertionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getObjectPropertyAssertion()
		 * @generated
		 */
		EClass OBJECT_PROPERTY_ASSERTION = eINSTANCE.getObjectPropertyAssertion();

		/**
		 * The meta object literal for the '<em><b>Object Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY = eINSTANCE.getObjectPropertyAssertion_ObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getObjectPropertyAssertion_SourceIndividual();

		/**
		 * The meta object literal for the '<em><b>Target Individual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = eINSTANCE.getObjectPropertyAssertion_TargetIndividual();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.NegativeObjectPropertyAssertionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNegativeObjectPropertyAssertion()
		 * @generated
		 */
		EClass NEGATIVE_OBJECT_PROPERTY_ASSERTION = eINSTANCE.getNegativeObjectPropertyAssertion();

		/**
		 * The meta object literal for the '<em><b>Object Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY = eINSTANCE.getNegativeObjectPropertyAssertion_ObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getNegativeObjectPropertyAssertion_SourceIndividual();

		/**
		 * The meta object literal for the '<em><b>Target Individual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = eINSTANCE.getNegativeObjectPropertyAssertion_TargetIndividual();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.DataPropertyAssertionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getDataPropertyAssertion()
		 * @generated
		 */
		EClass DATA_PROPERTY_ASSERTION = eINSTANCE.getDataPropertyAssertion();

		/**
		 * The meta object literal for the '<em><b>Data Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_ASSERTION__DATA_PROPERTY = eINSTANCE.getDataPropertyAssertion_DataProperty();

		/**
		 * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getDataPropertyAssertion_SourceIndividual();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_ASSERTION__TARGET_VALUE = eINSTANCE.getDataPropertyAssertion_TargetValue();

		/**
		 * The meta object literal for the '{@link com.emf4sw.owl.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.owl.impl.NegativeDataPropertyAssertionImpl
		 * @see com.emf4sw.owl.impl.OWLPackageImpl#getNegativeDataPropertyAssertion()
		 * @generated
		 */
		EClass NEGATIVE_DATA_PROPERTY_ASSERTION = eINSTANCE.getNegativeDataPropertyAssertion();

		/**
		 * The meta object literal for the '<em><b>Data Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY = eINSTANCE.getNegativeDataPropertyAssertion_DataProperty();

		/**
		 * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getNegativeDataPropertyAssertion_SourceIndividual();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE = eINSTANCE.getNegativeDataPropertyAssertion_TargetValue();

	}

} //OWLPackage
