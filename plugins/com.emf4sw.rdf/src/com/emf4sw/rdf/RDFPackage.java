/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf;

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
 * @see com.emf4sw.rdf.RDFFactory
 * @model kind="package"
 * @generated
 */
public interface RDFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emf4sw.org/2008/RDF";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RDF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RDFPackage eINSTANCE = com.emf4sw.rdf.impl.RDFPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.URIElementImpl <em>URI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.URIElementImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getURIElement()
	 * @generated
	 */
	int URI_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_ELEMENT__URI = 0;

	/**
	 * The number of structural features of the '<em>URI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.NamespaceImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__URI = URI_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PREFIX = URI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__GRAPH = URI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = URI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.RDFGraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.RDFGraphImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getRDFGraph()
	 * @generated
	 */
	int RDF_GRAPH = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_GRAPH__URI = URI_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_GRAPH__NODES = URI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_GRAPH__RESOURCES = URI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_GRAPH__PROPERTIES = URI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blank Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_GRAPH__BLANK_NODES = URI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_GRAPH__DATATYPES = URI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_GRAPH__LITERALS = URI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Triples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_GRAPH__TRIPLES = URI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_GRAPH_FEATURE_COUNT = URI_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.DocumentGraphImpl <em>Document Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.DocumentGraphImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getDocumentGraph()
	 * @generated
	 */
	int DOCUMENT_GRAPH = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__URI = RDF_GRAPH__URI;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__NODES = RDF_GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__RESOURCES = RDF_GRAPH__RESOURCES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__PROPERTIES = RDF_GRAPH__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Blank Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__BLANK_NODES = RDF_GRAPH__BLANK_NODES;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__DATATYPES = RDF_GRAPH__DATATYPES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__LITERALS = RDF_GRAPH__LITERALS;

	/**
	 * The feature id for the '<em><b>Triples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__TRIPLES = RDF_GRAPH__TRIPLES;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__NAMESPACES = RDF_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Graphs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH__SUB_GRAPHS = RDF_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_GRAPH_FEATURE_COUNT = RDF_GRAPH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.NamedGraphImpl <em>Named Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.NamedGraphImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getNamedGraph()
	 * @generated
	 */
	int NAMED_GRAPH = 7;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.TripleImpl <em>Triple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.TripleImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getTriple()
	 * @generated
	 */
	int TRIPLE = 4;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE__PREDICATE = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE__OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE__GRAPH = 3;

	/**
	 * The number of structural features of the '<em>Triple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.QuadImpl <em>Quad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.QuadImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getQuad()
	 * @generated
	 */
	int QUAD = 5;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAD__SUBJECT = TRIPLE__SUBJECT;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAD__PREDICATE = TRIPLE__PREDICATE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAD__OBJECT = TRIPLE__OBJECT;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAD__GRAPH = TRIPLE__GRAPH;

	/**
	 * The feature id for the '<em><b>Context Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAD__CONTEXT_GRAPH = TRIPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUAD_FEATURE_COUNT = TRIPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.NodeImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBJECT_OF = 2;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OBJECT_OF = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__URI = RDF_GRAPH__URI;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__NODES = RDF_GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__RESOURCES = RDF_GRAPH__RESOURCES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__PROPERTIES = RDF_GRAPH__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Blank Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__BLANK_NODES = RDF_GRAPH__BLANK_NODES;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__DATATYPES = RDF_GRAPH__DATATYPES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__LITERALS = RDF_GRAPH__LITERALS;

	/**
	 * The feature id for the '<em><b>Triples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__TRIPLES = RDF_GRAPH__TRIPLES;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__LABEL = RDF_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__COMMENT = RDF_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__SUBJECT_OF = RDF_GRAPH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__OBJECT_OF = RDF_GRAPH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH__DOCUMENT = RDF_GRAPH_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Named Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_GRAPH_FEATURE_COUNT = RDF_GRAPH_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.BlankNodeImpl <em>Blank Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.BlankNodeImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getBlankNode()
	 * @generated
	 */
	int BLANK_NODE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_NODE__COMMENT = NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_NODE__SUBJECT_OF = NODE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_NODE__OBJECT_OF = NODE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_NODE__NODE_ID = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_NODE__GRAPH = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Blank Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.TripleNodeImpl <em>Triple Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.TripleNodeImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getTripleNode()
	 * @generated
	 */
	int TRIPLE_NODE = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_NODE__COMMENT = NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_NODE__SUBJECT_OF = NODE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_NODE__OBJECT_OF = NODE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_NODE__URI = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_NODE__TRIPLE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Triple Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.ResourceImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__URI = URI_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LABEL = URI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__COMMENT = URI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SUBJECT_OF = URI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OBJECT_OF = URI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__GRAPH = URI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = URI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.PropertyImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__URI = RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LABEL = RESOURCE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMMENT = RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUBJECT_OF = RESOURCE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OBJECT_OF = RESOURCE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GRAPH = RESOURCE__GRAPH;

	/**
	 * The feature id for the '<em><b>Predicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PREDICATE_OF = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.DatatypeImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 12;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__URI = RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__LABEL = RESOURCE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__COMMENT = RESOURCE__COMMENT;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__SUBJECT_OF = RESOURCE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__OBJECT_OF = RESOURCE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__GRAPH = RESOURCE__GRAPH;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.LiteralImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__COMMENT = NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SUBJECT_OF = NODE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__OBJECT_OF = NODE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Lexical Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LEXICAL_FORM = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LANG = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__DATATYPE = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__GRAPH = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.BagImpl <em>Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.BagImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getBag()
	 * @generated
	 */
	int BAG = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__LABEL = BLANK_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__COMMENT = BLANK_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__SUBJECT_OF = BLANK_NODE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__OBJECT_OF = BLANK_NODE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__NODE_ID = BLANK_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__GRAPH = BLANK_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__ELEMENTS = BLANK_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_FEATURE_COUNT = BLANK_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.AltImpl <em>Alt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.AltImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getAlt()
	 * @generated
	 */
	int ALT = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__LABEL = BLANK_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__COMMENT = BLANK_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__SUBJECT_OF = BLANK_NODE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__OBJECT_OF = BLANK_NODE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__NODE_ID = BLANK_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__GRAPH = BLANK_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT__ELEMENTS = BLANK_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_FEATURE_COUNT = BLANK_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.SeqImpl <em>Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.SeqImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getSeq()
	 * @generated
	 */
	int SEQ = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__LABEL = BLANK_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__COMMENT = BLANK_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__SUBJECT_OF = BLANK_NODE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__OBJECT_OF = BLANK_NODE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__NODE_ID = BLANK_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__GRAPH = BLANK_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__ELEMENTS = BLANK_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FEATURE_COUNT = BLANK_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.emf4sw.rdf.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.emf4sw.rdf.impl.ListImpl
	 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getList()
	 * @generated
	 */
	int LIST = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LABEL = BLANK_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__COMMENT = BLANK_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Subject Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SUBJECT_OF = BLANK_NODE__SUBJECT_OF;

	/**
	 * The feature id for the '<em><b>Object Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OBJECT_OF = BLANK_NODE__OBJECT_OF;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NODE_ID = BLANK_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__GRAPH = BLANK_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__FIRST = BLANK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__REST = BLANK_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = BLANK_NODE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.URIElement <em>URI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URI Element</em>'.
	 * @see com.emf4sw.rdf.URIElement
	 * @generated
	 */
	EClass getURIElement();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.rdf.URIElement#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see com.emf4sw.rdf.URIElement#getURI()
	 * @see #getURIElement()
	 * @generated
	 */
	EAttribute getURIElement_URI();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see com.emf4sw.rdf.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.rdf.Namespace#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.emf4sw.rdf.Namespace#getPrefix()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Prefix();

	/**
	 * Returns the meta object for the container reference '{@link com.emf4sw.rdf.Namespace#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see com.emf4sw.rdf.Namespace#getGraph()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Graph();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.RDFGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see com.emf4sw.rdf.RDFGraph
	 * @generated
	 */
	EClass getRDFGraph();

	/**
	 * Returns the meta object for the attribute list '{@link com.emf4sw.rdf.RDFGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nodes</em>'.
	 * @see com.emf4sw.rdf.RDFGraph#getNodes()
	 * @see #getRDFGraph()
	 * @generated
	 */
	EAttribute getRDFGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.rdf.RDFGraph#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.emf4sw.rdf.RDFGraph#getResources()
	 * @see #getRDFGraph()
	 * @generated
	 */
	EReference getRDFGraph_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.rdf.RDFGraph#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.emf4sw.rdf.RDFGraph#getProperties()
	 * @see #getRDFGraph()
	 * @generated
	 */
	EReference getRDFGraph_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.rdf.RDFGraph#getBlankNodes <em>Blank Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blank Nodes</em>'.
	 * @see com.emf4sw.rdf.RDFGraph#getBlankNodes()
	 * @see #getRDFGraph()
	 * @generated
	 */
	EReference getRDFGraph_BlankNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.rdf.RDFGraph#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see com.emf4sw.rdf.RDFGraph#getDatatypes()
	 * @see #getRDFGraph()
	 * @generated
	 */
	EReference getRDFGraph_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.rdf.RDFGraph#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see com.emf4sw.rdf.RDFGraph#getLiterals()
	 * @see #getRDFGraph()
	 * @generated
	 */
	EReference getRDFGraph_Literals();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.rdf.RDFGraph#getTriples <em>Triples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triples</em>'.
	 * @see com.emf4sw.rdf.RDFGraph#getTriples()
	 * @see #getRDFGraph()
	 * @generated
	 */
	EReference getRDFGraph_Triples();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.DocumentGraph <em>Document Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Graph</em>'.
	 * @see com.emf4sw.rdf.DocumentGraph
	 * @generated
	 */
	EClass getDocumentGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link com.emf4sw.rdf.DocumentGraph#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see com.emf4sw.rdf.DocumentGraph#getNamespaces()
	 * @see #getDocumentGraph()
	 * @generated
	 */
	EReference getDocumentGraph_Namespaces();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.rdf.DocumentGraph#getSubGraphs <em>Sub Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Graphs</em>'.
	 * @see com.emf4sw.rdf.DocumentGraph#getSubGraphs()
	 * @see #getDocumentGraph()
	 * @generated
	 */
	EReference getDocumentGraph_SubGraphs();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.NamedGraph <em>Named Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Graph</em>'.
	 * @see com.emf4sw.rdf.NamedGraph
	 * @generated
	 */
	EClass getNamedGraph();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.rdf.NamedGraph#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see com.emf4sw.rdf.NamedGraph#getDocument()
	 * @see #getNamedGraph()
	 * @generated
	 */
	EReference getNamedGraph_Document();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Triple <em>Triple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triple</em>'.
	 * @see com.emf4sw.rdf.Triple
	 * @generated
	 */
	EClass getTriple();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.rdf.Triple#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see com.emf4sw.rdf.Triple#getSubject()
	 * @see #getTriple()
	 * @generated
	 */
	EReference getTriple_Subject();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.rdf.Triple#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicate</em>'.
	 * @see com.emf4sw.rdf.Triple#getPredicate()
	 * @see #getTriple()
	 * @generated
	 */
	EReference getTriple_Predicate();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.rdf.Triple#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see com.emf4sw.rdf.Triple#getObject()
	 * @see #getTriple()
	 * @generated
	 */
	EReference getTriple_Object();

	/**
	 * Returns the meta object for the container reference '{@link com.emf4sw.rdf.Triple#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see com.emf4sw.rdf.Triple#getGraph()
	 * @see #getTriple()
	 * @generated
	 */
	EReference getTriple_Graph();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Quad <em>Quad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quad</em>'.
	 * @see com.emf4sw.rdf.Quad
	 * @generated
	 */
	EClass getQuad();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.rdf.Quad#getContextGraph <em>Context Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Graph</em>'.
	 * @see com.emf4sw.rdf.Quad#getContextGraph()
	 * @see #getQuad()
	 * @generated
	 */
	EReference getQuad_ContextGraph();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see com.emf4sw.rdf.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.rdf.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.emf4sw.rdf.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.rdf.Node#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.emf4sw.rdf.Node#getComment()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Comment();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.rdf.Node#getSubjectOf <em>Subject Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subject Of</em>'.
	 * @see com.emf4sw.rdf.Node#getSubjectOf()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SubjectOf();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.rdf.Node#getObjectOf <em>Object Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Of</em>'.
	 * @see com.emf4sw.rdf.Node#getObjectOf()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ObjectOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.BlankNode <em>Blank Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blank Node</em>'.
	 * @see com.emf4sw.rdf.BlankNode
	 * @generated
	 */
	EClass getBlankNode();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.rdf.BlankNode#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see com.emf4sw.rdf.BlankNode#getNodeID()
	 * @see #getBlankNode()
	 * @generated
	 */
	EAttribute getBlankNode_NodeID();

	/**
	 * Returns the meta object for the container reference '{@link com.emf4sw.rdf.BlankNode#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see com.emf4sw.rdf.BlankNode#getGraph()
	 * @see #getBlankNode()
	 * @generated
	 */
	EReference getBlankNode_Graph();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.TripleNode <em>Triple Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triple Node</em>'.
	 * @see com.emf4sw.rdf.TripleNode
	 * @generated
	 */
	EClass getTripleNode();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.rdf.TripleNode#getTriple <em>Triple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triple</em>'.
	 * @see com.emf4sw.rdf.TripleNode#getTriple()
	 * @see #getTripleNode()
	 * @generated
	 */
	EReference getTripleNode_Triple();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.emf4sw.rdf.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the container reference '{@link com.emf4sw.rdf.Resource#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see com.emf4sw.rdf.Resource#getGraph()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Graph();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.emf4sw.rdf.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.rdf.Property#getPredicateOf <em>Predicate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predicate Of</em>'.
	 * @see com.emf4sw.rdf.Property#getPredicateOf()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_PredicateOf();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see com.emf4sw.rdf.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see com.emf4sw.rdf.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.rdf.Literal#getLexicalForm <em>Lexical Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lexical Form</em>'.
	 * @see com.emf4sw.rdf.Literal#getLexicalForm()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_LexicalForm();

	/**
	 * Returns the meta object for the attribute '{@link com.emf4sw.rdf.Literal#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see com.emf4sw.rdf.Literal#getLang()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Lang();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.rdf.Literal#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see com.emf4sw.rdf.Literal#getDatatype()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Datatype();

	/**
	 * Returns the meta object for the container reference '{@link com.emf4sw.rdf.Literal#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see com.emf4sw.rdf.Literal#getGraph()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Graph();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag</em>'.
	 * @see com.emf4sw.rdf.Bag
	 * @generated
	 */
	EClass getBag();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.rdf.Bag#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see com.emf4sw.rdf.Bag#getElements()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_Elements();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Alt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt</em>'.
	 * @see com.emf4sw.rdf.Alt
	 * @generated
	 */
	EClass getAlt();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.rdf.Alt#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see com.emf4sw.rdf.Alt#getElements()
	 * @see #getAlt()
	 * @generated
	 */
	EReference getAlt_Elements();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.Seq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq</em>'.
	 * @see com.emf4sw.rdf.Seq
	 * @generated
	 */
	EClass getSeq();

	/**
	 * Returns the meta object for the reference list '{@link com.emf4sw.rdf.Seq#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see com.emf4sw.rdf.Seq#getElements()
	 * @see #getSeq()
	 * @generated
	 */
	EReference getSeq_Elements();

	/**
	 * Returns the meta object for class '{@link com.emf4sw.rdf.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see com.emf4sw.rdf.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.rdf.List#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see com.emf4sw.rdf.List#getFirst()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_First();

	/**
	 * Returns the meta object for the reference '{@link com.emf4sw.rdf.List#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rest</em>'.
	 * @see com.emf4sw.rdf.List#getRest()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Rest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RDFFactory getRDFFactory();

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
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.URIElementImpl <em>URI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.URIElementImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getURIElement()
		 * @generated
		 */
		EClass URI_ELEMENT = eINSTANCE.getURIElement();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_ELEMENT__URI = eINSTANCE.getURIElement_URI();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.NamespaceImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__PREFIX = eINSTANCE.getNamespace_Prefix();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__GRAPH = eINSTANCE.getNamespace_Graph();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.RDFGraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.RDFGraphImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getRDFGraph()
		 * @generated
		 */
		EClass RDF_GRAPH = eINSTANCE.getRDFGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_GRAPH__NODES = eINSTANCE.getRDFGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_GRAPH__RESOURCES = eINSTANCE.getRDFGraph_Resources();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_GRAPH__PROPERTIES = eINSTANCE.getRDFGraph_Properties();

		/**
		 * The meta object literal for the '<em><b>Blank Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_GRAPH__BLANK_NODES = eINSTANCE.getRDFGraph_BlankNodes();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_GRAPH__DATATYPES = eINSTANCE.getRDFGraph_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_GRAPH__LITERALS = eINSTANCE.getRDFGraph_Literals();

		/**
		 * The meta object literal for the '<em><b>Triples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_GRAPH__TRIPLES = eINSTANCE.getRDFGraph_Triples();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.DocumentGraphImpl <em>Document Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.DocumentGraphImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getDocumentGraph()
		 * @generated
		 */
		EClass DOCUMENT_GRAPH = eINSTANCE.getDocumentGraph();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_GRAPH__NAMESPACES = eINSTANCE.getDocumentGraph_Namespaces();

		/**
		 * The meta object literal for the '<em><b>Sub Graphs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_GRAPH__SUB_GRAPHS = eINSTANCE.getDocumentGraph_SubGraphs();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.NamedGraphImpl <em>Named Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.NamedGraphImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getNamedGraph()
		 * @generated
		 */
		EClass NAMED_GRAPH = eINSTANCE.getNamedGraph();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_GRAPH__DOCUMENT = eINSTANCE.getNamedGraph_Document();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.TripleImpl <em>Triple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.TripleImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getTriple()
		 * @generated
		 */
		EClass TRIPLE = eINSTANCE.getTriple();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE__SUBJECT = eINSTANCE.getTriple_Subject();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE__PREDICATE = eINSTANCE.getTriple_Predicate();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE__OBJECT = eINSTANCE.getTriple_Object();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE__GRAPH = eINSTANCE.getTriple_Graph();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.QuadImpl <em>Quad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.QuadImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getQuad()
		 * @generated
		 */
		EClass QUAD = eINSTANCE.getQuad();

		/**
		 * The meta object literal for the '<em><b>Context Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUAD__CONTEXT_GRAPH = eINSTANCE.getQuad_ContextGraph();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.NodeImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__COMMENT = eINSTANCE.getNode_Comment();

		/**
		 * The meta object literal for the '<em><b>Subject Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBJECT_OF = eINSTANCE.getNode_SubjectOf();

		/**
		 * The meta object literal for the '<em><b>Object Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OBJECT_OF = eINSTANCE.getNode_ObjectOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.BlankNodeImpl <em>Blank Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.BlankNodeImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getBlankNode()
		 * @generated
		 */
		EClass BLANK_NODE = eINSTANCE.getBlankNode();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLANK_NODE__NODE_ID = eINSTANCE.getBlankNode_NodeID();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLANK_NODE__GRAPH = eINSTANCE.getBlankNode_Graph();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.TripleNodeImpl <em>Triple Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.TripleNodeImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getTripleNode()
		 * @generated
		 */
		EClass TRIPLE_NODE = eINSTANCE.getTripleNode();

		/**
		 * The meta object literal for the '<em><b>Triple</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_NODE__TRIPLE = eINSTANCE.getTripleNode_Triple();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.ResourceImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__GRAPH = eINSTANCE.getResource_Graph();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.PropertyImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Predicate Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PREDICATE_OF = eINSTANCE.getProperty_PredicateOf();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.DatatypeImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.LiteralImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Lexical Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__LEXICAL_FORM = eINSTANCE.getLiteral_LexicalForm();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__LANG = eINSTANCE.getLiteral_Lang();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__DATATYPE = eINSTANCE.getLiteral_Datatype();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__GRAPH = eINSTANCE.getLiteral_Graph();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.BagImpl <em>Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.BagImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getBag()
		 * @generated
		 */
		EClass BAG = eINSTANCE.getBag();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG__ELEMENTS = eINSTANCE.getBag_Elements();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.AltImpl <em>Alt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.AltImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getAlt()
		 * @generated
		 */
		EClass ALT = eINSTANCE.getAlt();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT__ELEMENTS = eINSTANCE.getAlt_Elements();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.SeqImpl <em>Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.SeqImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getSeq()
		 * @generated
		 */
		EClass SEQ = eINSTANCE.getSeq();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__ELEMENTS = eINSTANCE.getSeq_Elements();

		/**
		 * The meta object literal for the '{@link com.emf4sw.rdf.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.emf4sw.rdf.impl.ListImpl
		 * @see com.emf4sw.rdf.impl.RDFPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__FIRST = eINSTANCE.getList_First();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__REST = eINSTANCE.getList_Rest();

	}

} //RDFPackage
