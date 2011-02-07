/**
 * 
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 */
package com.emf4sw.owl.resource.extractor;

import static com.atl.common.utils.Preconditions.checkArgument;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationProperty;
import com.emf4sw.owl.Assertion;
import com.emf4sw.owl.Axiom;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.ClassExpressionAxiom;
import com.emf4sw.owl.DataProperty;
import com.emf4sw.owl.DataPropertyAxiom;
import com.emf4sw.owl.Datatype;
import com.emf4sw.owl.DatatypeDefinition;
import com.emf4sw.owl.Declaration;
import com.emf4sw.owl.EntityExpression;
import com.emf4sw.owl.HasKey;
import com.emf4sw.owl.NamedIndividual;
import com.emf4sw.owl.Namespace;
import com.emf4sw.owl.OWLClass;
import com.emf4sw.owl.ObjectProperty;
import com.emf4sw.owl.ObjectPropertyAxiom;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.OWLResource;
import com.emf4sw.owl.util.OWLSwitch;
import com.emf4sw.owl.vocabulary.OWL2;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Statement;

/**
 * {@link OntologyExtractor}
 * 
 * <p>
 * Extractor class for Ontology.
 * </p>
 * <p>
 * OntologyExtractor extracts a {@link Ontology} or a {@link Resource} containing a {@link Ontology} in 
 * a {@link OntModel}. This latter is used for the serialization of the {@link Ontology} into different 
 * OWL formats. Serialization is generally done by the different kinds of {@link OWLResource}.
 * </p>
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class OntologyExtractor {

	private final Ontology ontology;

	public OntologyExtractor(Resource resource) {
		checkValidResource(resource);

		this.ontology = (Ontology) resource.getContents().get(0);
	}

	public OntologyExtractor(Ontology ontology) {
		checkArgument(ontology != null);

		this.ontology = ontology;
	}

	/**
	 * 
	 * @return {@link OntModel} containing a {@link Ontology}.
	 */
	public OntModel extract() {
		return doExtract(ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM) );
	}

	/**
	 * 
	 * @param target model.
	 * @return {@link OntModel} taken as input after adding in a {@link Ontology}.
	 */
	public OntModel extract(final OntModel target) {
		return doExtract( target );
	}

	private OntModel doExtract(final OntModel model) {
		createOntology( ontology, model );

		for (Ontology imports: ontology.getImports()) {
			model.getOntology( ontology.getURI() ).addImport( model.createResource(imports.getURI()) );
		}
		return model;
	}

	private void createOntology(Ontology ontology, OntModel model) {
		com.hp.hpl.jena.ontology.Ontology theOntology = model.createOntology( ontology.getURI() );
		doNamespaces(ontology, model);
		for (Annotation annotation: ontology.getAnnotations()) {
			theOntology.addProperty(
						model.getProperty(((EntityExpression) annotation.getProperty()).getEntity().getURI()), 
					annotation.getValue().getValue());
		}

		final AxiomVisitorExtractor visitor = new AxiomVisitorExtractor(model);
		for (Axiom axiom: ontology.getAxioms()) {
			visitor.doSwitch(axiom);
		}
	}
		
	private void doNamespaces(Ontology ontology, OntModel model) {
		final Map<String, String> ns_map = new HashMap<String, String>();
		for (Namespace namespace: ontology.getNamespaces()) {
			ns_map.put(((Namespace) namespace).getName(), namespace.getURI());
		}
		model.setNsPrefixes(ns_map);
	}

	static Statement createStatement(OntResource subject, 
			String property, com.hp.hpl.jena.rdf.model.Resource resource, OntModel model) {
		return 
			model.createStatement(subject, model.createOntProperty( property ),resource);
	}

	static Statement createStatement(OntResource subject, String property, String object, OntModel model) {
		return 
			model.createStatement(subject, model.createOntProperty( property ), model.createResource( object ));
	}

	static Statement createStatement(OntResource subject, String property, Literal literal, OntModel model) {
		return 
			model.createStatement(subject, model.createOntProperty( property ), literal);
	}

	boolean isThing(ClassExpression ce) {
		return (ce instanceof OWLClass) ?
				OWL2.Thing.equals(((OWLClass) ce).getURI()) : 
					false;
	}

	com.hp.hpl.jena.rdf.model.Resource thing(OntModel model) {
		return model.getResource(OWL2.Thing);
	}

	private static void checkValidResource(Resource resource) {
		checkArgument(!resource.getContents().isEmpty(), 
				"Cannot extract empty resource.");
		checkArgument(resource.getContents().get(0) instanceof Ontology, 
				"Not a valid OWL Resource, root element is not an Ontology element");
	}
	
	/**
	 *
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.5.5
	 */
	protected class EntityVisitorExtractor extends OWLSwitch<Object> {

		private final OntModel model;

		protected EntityVisitorExtractor(OntModel model) {
			this.model = model;			
		}
		
		@Override
		public Object caseOWLClass(OWLClass entity) {
			return model.createClass( entity.getURI() );
		}

		@Override
		public Object caseObjectProperty(ObjectProperty entity) {
			return model.createObjectProperty( entity.getURI() );
		}

		@Override
		public Object caseDataProperty(DataProperty entity) {
			return model.createDatatypeProperty( entity.getURI() );
		}

		@Override
		public Object caseNamedIndividual(NamedIndividual entity) {
			return model.createIndividual( entity.getURI(), null );
		}

		@Override
		public Object caseDatatype(Datatype entity) {
			return model.createResource(entity.getURI());
		}

		@Override
		public Object caseAnnotationProperty(AnnotationProperty entity) {
			return model.createProperty(entity.getURI());
		}

	}
	
	/**
	 *
	 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
	 * @since 0.5.5
	 */
	protected class AxiomVisitorExtractor extends OWLSwitch<Object> {

		private final OntModel model;
		
		protected AxiomVisitorExtractor(OntModel model) {
			this.model = model;			
		}
		
		@Override
		public Object caseHasKey(HasKey axiom) {
			throw new UnsupportedOperationException();
		}

		@Override
		public Object caseDatatypeDefinition(DatatypeDefinition axiom) {
			return DataRangeExtractor.createDatatypeDefinition(axiom, model);
		}

		@Override
		public Object caseDeclaration(Declaration axiom) {
			com.hp.hpl.jena.rdf.model.Resource resource = 
				axiom.getEntity() == null ? null : 
					(com.hp.hpl.jena.rdf.model.Resource) new EntityVisitorExtractor(model).doSwitch(axiom.getEntity());
			if (resource != null) {
				for (Annotation annotation: axiom.getAnnotations()) {
					AnnotationExtractor.extractAnnotation(annotation, resource, model);
				}
			}
			return resource;
		}
		
		@Override
		public Object caseClassExpressionAxiom(ClassExpressionAxiom axiom) {
			return new ClassExpressionExtractor.ClassAxiomVisitorExtractor(model).doSwitch(axiom);
		}
		
		@Override
		public Object caseObjectPropertyAxiom(ObjectPropertyAxiom axiom) {
			return new ObjectPropertyExpressionExtractor.ObjectPropertyAxiomVisitorExtractor(model).doSwitch(axiom);
		}
		
		@Override
		public Object caseDataPropertyAxiom(DataPropertyAxiom axiom) {
			return new DataPropertyExpressionExtractor.DataPropertyAxiomVisitorExtractor(model).doSwitch(axiom);
		}
		
		@Override
		public Object caseAssertion(Assertion axiom) {
			return new AssertionExtractor.AssertionVisitorExtractor(model).doSwitch(axiom);
		}

	}

}
