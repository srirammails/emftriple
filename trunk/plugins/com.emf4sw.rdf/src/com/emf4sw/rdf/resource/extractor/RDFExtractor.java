/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.rdf.resource.extractor;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emf4sw.rdf.BlankNode;
import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.DocumentGraph;
import com.emf4sw.rdf.Literal;
import com.emf4sw.rdf.NamedGraph;
import com.emf4sw.rdf.Namespace;
import com.emf4sw.rdf.Property;
import com.emf4sw.rdf.RDFFactory;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.TripleNode;
import com.emf4sw.rdf.util.RDFSwitch;
import com.emf4sw.rdf.vocabulary.RDFS;
import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.datatypes.TypeMapper;
import com.hp.hpl.jena.graph.NodeVisitor;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Statement;

/**
 * {@link RDFExtractor}
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class RDFExtractor {

	private final RDFGraph graph;

	public RDFExtractor(DocumentGraph graph) {
		this.graph = graph;
	}

	public RDFExtractor(Resource resource) {
		if (resource.getContents().size() == 1) {
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof RDFGraph) {
				graph = (RDFGraph) eObject;
			} else {
				throw new IllegalArgumentException();
			}
		} else {
			DocumentGraph aGraph = 
				(DocumentGraph) EcoreUtil.getObjectByType(resource.getContents(), RDFPackage.eINSTANCE.getDocumentGraph());
			if (aGraph == null) {
				aGraph = RDFFactory.eINSTANCE.createDocumentGraph();
			}
			for (EObject eObject: resource.getContents()) {
				if (eObject instanceof NamedGraph) {
					aGraph.add((NamedGraph) eObject);
				}
			}
			graph = aGraph;
		}
	}

	public RDFExtractor(RDFGraph graph) {
		this.graph = graph;
		new HashMap<BlankNode, RDFNode>();
	}

	public Model extract() {
		return extract(graph, ModelFactory.createDefaultModel());
	}

	public Model extract(Model model) {
		return extract(graph, model);
	}

	private Model extract(RDFGraph graph, Model model) {
		if (graph instanceof DocumentGraph) {
			return doExtractDocument((DocumentGraph)graph, model);
		} else {
			return doExtractGraph((NamedGraph)graph, model);
		}
	}

	private Model doExtractGraph(NamedGraph graph, Model model) {
		for(com.emf4sw.rdf.Triple triple : graph.getTriples()) 
		{
			Statement stmt = extract( triple, model );
			if (stmt != null) 
			{
				model.add(stmt);
			}
		}
		return model;
	}

	private Model doExtractDocument(DocumentGraph graph, Model model)
	{
		for(Namespace namespace: graph.getNamespaces()) {
			model.setNsPrefix(namespace.getPrefix(), namespace.getURI());
		}
		for(com.emf4sw.rdf.Triple triple : graph.listAllTriples()) {
			if (!(triple.getSubject() instanceof NamedGraph)) {
				Statement stmt = extract( triple, model );
				if (stmt != null) {
					model.add(stmt);
				}
			}
		}
		return model;
	}

	private com.hp.hpl.jena.rdf.model.Statement extract(Triple triple, Model model) {
		if ( triple.getSubject() == null || 
				triple.getPredicate() == null || 
				triple.getObject() == null ) {
			return null;
		}
		
		NodeSwitchExtractor visitor = new NodeSwitchExtractor(model);
		
		final com.hp.hpl.jena.rdf.model.RDFNode subject = 
			visitor.doSwitch(triple.getSubject());
		final com.hp.hpl.jena.rdf.model.Property predicate = 
			(com.hp.hpl.jena.rdf.model.Property) visitor.doSwitch(triple.getPredicate());
		final com.hp.hpl.jena.rdf.model.RDFNode object = 
			visitor.doSwitch(triple.getObject());

		if (subject == null || predicate == null || object == null) {
			return null;
		}

		return model.createStatement((com.hp.hpl.jena.rdf.model.Resource) subject, predicate, object);
	}

	/**
	 * Implements the {@link NodeVisitor} interface.
	 * 
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 *
	 */
	public static class NodeSwitchExtractor extends RDFSwitch<RDFNode> {

		private final Model model;

		public NodeSwitchExtractor(Model model) {
			this.model = model;
		}

		@Override
		public RDFNode caseBlankNode(BlankNode object) {
			return model.createResource(
					object.getNodeID() != null ?
							AnonId.create(object.getNodeID()) :
								AnonId.create() 
			);
		}
		
		@Override
		public RDFNode caseResource(com.emf4sw.rdf.Resource object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getResource( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createResource( uri );
				}
			} else {
				resultinNode = model.createResource(AnonId.create());
			}
			return resultinNode;
		}

		@Override
		public RDFNode caseProperty(Property object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getProperty( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createProperty( uri );
				}
			}
			return resultinNode;
		}

		@Override
		public RDFNode caseNamedGraph(NamedGraph object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getResource( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createResource( uri );
				}
			}		
			return resultinNode;
		}
		
		@Override
		public RDFNode caseTripleNode(TripleNode object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getResource( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createResource( uri );
				}
			}		
			return resultinNode;
		}

		@Override
		public RDFNode caseDatatype(Datatype object) {
			RDFNode resultinNode = null;
			if (object.getURI() != null) {
				final String uri = object.getURI().replaceAll("[\\s]+", "_");
				resultinNode = model.getResource( uri );
				if (resultinNode == null) 
				{
					resultinNode = model.createResource( uri );
				}
			}		
			return resultinNode;
		}

		@Override
		public RDFNode caseLiteral(Literal object) {
			RDFNode resultinNode = null;
			if (object.getLang() != null && !object.getLang().trim().isEmpty()) {
				resultinNode = model.createLiteral( object.getLexicalForm(), object.getLang() );
			} else {
				final RDFDatatype dType = object.getDatatype() == null ? null :
					TypeMapper.getInstance().getSafeTypeByName( object.getDatatype().getURI() );

				resultinNode = dType != null ?
						model.createTypedLiteral( object.getLexicalForm(), dType ) :
							model.createTypedLiteral( object.getLexicalForm(), 
									TypeMapper.getInstance().getSafeTypeByName( RDFS.Literal ) );
			}

			return resultinNode;
		}

	}
}
