/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.emf4sw.rdf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.Alt;
import com.emf4sw.rdf.Bag;
import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.List;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.Quad;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Resource;
import com.emf4sw.rdf.Seq;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;
import com.emf4sw.rdf.URIElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.emf4sw.rdf.RDFPackage
 * @generated
 */
public class RDFAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RDFPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RDFPackage.eINSTANCE;
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
	protected RDFSwitch<Adapter> modelSwitch =
		new RDFSwitch<Adapter>() {
			@Override
			public Adapter caseURIElement(URIElement object) {
				return createURIElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseRDFGraph(RDFGraph object) {
				return createRDFGraphAdapter();
			}
			@Override
			public Adapter caseDocumentGraph(DocumentGraph object) {
				return createDocumentGraphAdapter();
			}
			@Override
			public Adapter caseTriple(Triple object) {
				return createTripleAdapter();
			}
			@Override
			public Adapter caseQuad(Quad object) {
				return createQuadAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseNamedGraph(NamedGraph object) {
				return createNamedGraphAdapter();
			}
			@Override
			public Adapter caseBlankNode(BlankNode object) {
				return createBlankNodeAdapter();
			}
			@Override
			public Adapter caseTripleNode(TripleNode object) {
				return createTripleNodeAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseBag(Bag object) {
				return createBagAdapter();
			}
			@Override
			public Adapter caseAlt(Alt object) {
				return createAltAdapter();
			}
			@Override
			public Adapter caseSeq(Seq object) {
				return createSeqAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.URIElement <em>URI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.URIElement
	 * @generated
	 */
	public Adapter createURIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.RDFGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.RDFGraph
	 * @generated
	 */
	public Adapter createRDFGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.DocumentGraph <em>Document Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.DocumentGraph
	 * @generated
	 */
	public Adapter createDocumentGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.NamedGraph <em>Named Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.NamedGraph
	 * @generated
	 */
	public Adapter createNamedGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Triple <em>Triple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Triple
	 * @generated
	 */
	public Adapter createTripleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Quad <em>Quad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Quad
	 * @generated
	 */
	public Adapter createQuadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.BlankNode <em>Blank Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.BlankNode
	 * @generated
	 */
	public Adapter createBlankNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.TripleNode <em>Triple Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.TripleNode
	 * @generated
	 */
	public Adapter createTripleNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Bag
	 * @generated
	 */
	public Adapter createBagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Alt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Alt
	 * @generated
	 */
	public Adapter createAltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.Seq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.Seq
	 * @generated
	 */
	public Adapter createSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.emf4sw.rdf.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.emf4sw.rdf.List
	 * @generated
	 */
	public Adapter createListAdapter() {
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

} //RDFAdapterFactory
