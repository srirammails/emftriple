/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.emf4sw.rdf.Alt;
import com.emf4sw.rdf.Bag;
import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.List;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.Quad;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Seq;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDFFactoryImpl extends EFactoryImpl implements RDFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RDFFactory init() {
		try {
			RDFFactory theRDFFactory = (RDFFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emf4sw.org/2008/RDF"); 
			if (theRDFFactory != null) {
				return theRDFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RDFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFFactoryImpl() {
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
			case RDFPackage.NAMESPACE: return createNamespace();
			case RDFPackage.DOCUMENT_GRAPH: return createDocumentGraph();
			case RDFPackage.TRIPLE: return createTriple();
			case RDFPackage.QUAD: return createQuad();
			case RDFPackage.NAMED_GRAPH: return createNamedGraph();
			case RDFPackage.BLANK_NODE: return createBlankNode();
			case RDFPackage.TRIPLE_NODE: return createTripleNode();
			case RDFPackage.RESOURCE: return createResource();
			case RDFPackage.PROPERTY: return createProperty();
			case RDFPackage.DATATYPE: return createDatatype();
			case RDFPackage.LITERAL: return createLiteral();
			case RDFPackage.BAG: return createBag();
			case RDFPackage.ALT: return createAlt();
			case RDFPackage.SEQ: return createSeq();
			case RDFPackage.LIST: return createList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public DocumentGraph createDocumentGraph() {
		DocumentGraphImpl documentGraph = new DocumentGraphImpl();
		return documentGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedGraph createNamedGraph() {
		NamedGraphImpl namedGraph = new NamedGraphImpl();
		return namedGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triple createTriple() {
		TripleImpl triple = new TripleImpl();
		return triple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quad createQuad() {
		QuadImpl quad = new QuadImpl();
		return quad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlankNode createBlankNode() {
		BlankNodeImpl blankNode = new BlankNodeImpl();
		return blankNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripleNode createTripleNode() {
		TripleNodeImpl tripleNode = new TripleNodeImpl();
		return tripleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
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
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bag createBag() {
		BagImpl bag = new BagImpl();
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alt createAlt() {
		AltImpl alt = new AltImpl();
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seq createSeq() {
		SeqImpl seq = new SeqImpl();
		return seq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFPackage getRDFPackage() {
		return (RDFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RDFPackage getPackage() {
		return RDFPackage.eINSTANCE;
	}

} //RDFFactoryImpl
