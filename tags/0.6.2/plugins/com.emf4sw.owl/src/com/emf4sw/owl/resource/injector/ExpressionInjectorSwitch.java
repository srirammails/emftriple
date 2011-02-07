package com.emf4sw.owl.resource.injector;

import static com.atl.common.utils.Preconditions.checkNotNull;
import static com.emf4sw.owl.resource.injector.OWLInjectorUtil.getNamespace;

import java.util.HashMap;
import java.util.Map;

import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.AnnotationProperty;
import com.emf4sw.owl.AnnotationPropertyExpression;
import com.emf4sw.owl.ClassExpression;
import com.emf4sw.owl.DataAllValuesFrom;
import com.emf4sw.owl.DataExactCardinality;
import com.emf4sw.owl.DataHasValue;
import com.emf4sw.owl.DataMaxCardinality;
import com.emf4sw.owl.DataMinCardinality;
import com.emf4sw.owl.DataPropertyExpression;
import com.emf4sw.owl.DataRange;
import com.emf4sw.owl.DataSomeValuesFrom;
import com.emf4sw.owl.Datatype;
import com.emf4sw.owl.Declaration;
import com.emf4sw.owl.Entity;
import com.emf4sw.owl.Individual;
import com.emf4sw.owl.Literal;
import com.emf4sw.owl.NamedIndividual;
import com.emf4sw.owl.Namespace;
import com.emf4sw.owl.OWLFactory;
import com.emf4sw.owl.ObjectAllValuesFrom;
import com.emf4sw.owl.ObjectComplementOf;
import com.emf4sw.owl.ObjectExactCardinality;
import com.emf4sw.owl.ObjectHasValue;
import com.emf4sw.owl.ObjectIntersectionOf;
import com.emf4sw.owl.ObjectMaxCardinality;
import com.emf4sw.owl.ObjectMinCardinality;
import com.emf4sw.owl.ObjectOneOf;
import com.emf4sw.owl.ObjectPropertyExpression;
import com.emf4sw.owl.ObjectSomeValuesFrom;
import com.emf4sw.owl.ObjectUnionOf;
import com.emf4sw.owl.PrefixEntityExpression;
import com.emf4sw.owl.jena.utils.OntModelSwitch;
import com.emf4sw.rdf.vocabulary.RDFS;
import com.hp.hpl.jena.ontology.AllValuesFromRestriction;
import com.hp.hpl.jena.ontology.CardinalityQRestriction;
import com.hp.hpl.jena.ontology.CardinalityRestriction;
import com.hp.hpl.jena.ontology.ComplementClass;
import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.EnumeratedClass;
import com.hp.hpl.jena.ontology.HasValueRestriction;
import com.hp.hpl.jena.ontology.IntersectionClass;
import com.hp.hpl.jena.ontology.MaxCardinalityQRestriction;
import com.hp.hpl.jena.ontology.MaxCardinalityRestriction;
import com.hp.hpl.jena.ontology.MinCardinalityQRestriction;
import com.hp.hpl.jena.ontology.MinCardinalityRestriction;
import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.ontology.SomeValuesFromRestriction;
import com.hp.hpl.jena.ontology.UnionClass;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.vocabulary.DC;

/**
 *  
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class ExpressionInjectorSwitch extends OntModelSwitch<Object> {

	private final static OWLFactory factory = OWLFactory.eINSTANCE;

	private final OntModel ontModel;

	private final Map<OntResource, Object> registry;

	private final Ontology ontology;

	private AnnotationProperty labelAnnotation;

	private AnnotationProperty commentAnnotation;

	private AnnotationProperty seeAlsoAnnotation;

	private final Map<Property, AnnotationProperty> properties;

	public ExpressionInjectorSwitch(OntModel ontModel, Ontology ontology) {
		super();
		checkNotNull(ontModel);
		checkNotNull(ontology);

		this.ontModel = ontModel;
		this.ontology = ontology;
		this.registry = new HashMap<OntResource, Object>();
		this.properties = new HashMap<Property, AnnotationProperty>();
	}

	@Override
	public Object caseOntology(Ontology object) {
		final com.emf4sw.owl.Ontology ontology;
		if (registry.containsKey(object)) {
			ontology = (com.emf4sw.owl.Ontology) registry.get(object);
		} else {
			ontology = factory.createOntology();
			ontology.setURI( object.getURI() );

			for (String aKey: ontModel.getNsPrefixMap().keySet()) {
				final Namespace aNamespace = factory.createNamespace();
				aNamespace.setName(aKey);
				aNamespace.setURI(ontModel.getNsPrefixMap().get(aKey));
				ontology.getNamespaces().add(aNamespace);
			}

			registry.put(object, ontology);
		}

		return ontology;
	}

	@Override
	public Object caseOntClass(OntClass object) {
		final Entity entity;
		if (registry.containsKey(object)) {
			entity = (Entity) registry.get(object);
		} else {
			entity = factory.createOWLClass();
			declareAndRegisterEntity(object, entity);
		}

		return getPrefixEntityExpression(entity);
	}

	@Override
	public Object caseUnionClass(UnionClass object) {
		final ClassExpression expression;
		if (registry.containsKey(object)) {
			expression = (ClassExpression) registry.get(object);
		} else {
			expression = factory.createObjectUnionOf();
			final ExtendedIterator<? extends OntClass> it = object.listOperands();
			for(;it.hasNext();) {
				final OntClass ontClass = it.next();
				try {
					final Object switched = this.doSwitch(ontClass);
					if (switched instanceof ClassExpression) {
						((ObjectUnionOf) expression).getUnionOf().add( (ClassExpression) switched );
					}
				} catch (ClassCastException e) {
					e.printStackTrace();
				}
			}
		}
		return expression;
	}

	@Override
	public Object caseIntersectionClass(IntersectionClass object) {
		final ClassExpression expression;
		if (registry.containsKey(object)) {
			expression = (ClassExpression) registry.get(object);
		} else {
			expression = factory.createObjectIntersectionOf();
			final ExtendedIterator<? extends OntClass> it = object.listOperands();
			for(;it.hasNext();) {
				final OntClass ontClass = it.next();
				try {
					final Object switched = this.doSwitch(ontClass);
					if (switched instanceof ClassExpression) {
						((ObjectIntersectionOf) expression).getIntersectionOf().add( (ClassExpression) switched );
					}
				} catch (ClassCastException e) {
					e.printStackTrace();
				}
			}
		}
		return expression;
	}

	@Override
	public Object caseComplementClass(ComplementClass object) {
		final ClassExpression expression;
		if (registry.containsKey(object)) {
			expression = (ClassExpression) registry.get(object);
		} else {
			expression = factory.createObjectComplementOf();
			if (object.getOperand().canAs(OntClass.class)) {
				Object operand = caseOntClass(object.as(OntClass.class));
				((ObjectComplementOf) expression).setComplementOf((ClassExpression) operand);
			}
			registry.put(object, expression);
		}
		return expression;
	}
	
	@Override
	public Object caseEnumeratedClass(EnumeratedClass object) {
		final ObjectOneOf expression;
		if (registry.containsKey(object)) {
			expression = (ObjectOneOf) registry.get(object);
		} else {
			expression = factory.createObjectOneOf();
			
			for (ExtendedIterator<RDFNode> it = object.getOneOf().iterator(); it.hasNext();) {
				Object node = doSwitch(it.next());
				if (node instanceof Individual) {
					expression.getOneOf().add((Individual) node);
				}
			}
			registry.put(object, expression);
		}
		
		return expression;
	}

	@Override
	public Object caseCardinalityRestriction(CardinalityRestriction object) {
		ClassExpression aExpression = null;
		Object switchedP = doSwitch( object.getOnProperty() );
		int card = object.getCardinality();
		if (switchedP instanceof DataPropertyExpression) {
			aExpression = factory.createDataExactCardinality();
			((DataExactCardinality) aExpression).setCardinality( card );
			((DataExactCardinality) aExpression).setOnProperty((DataPropertyExpression) switchedP);
		} else if (switchedP instanceof ObjectPropertyExpression) {
			aExpression = factory.createObjectExactCardinality();
			((ObjectExactCardinality) aExpression).setCardinality( card );
			((ObjectExactCardinality) aExpression).setOnProperty((ObjectPropertyExpression) switchedP);
		}
		return aExpression;
	}
	
	@Override
	public Object caseCardinalityQRestriction(CardinalityQRestriction object) {
		ClassExpression aExpression = null;
		Object switchedQ = doSwitch( object.getHasClassQ() );
		Object switchedP = doSwitch( object.getOnProperty() );
		int card = object.getCardinalityQ();
		if (switchedP instanceof DataPropertyExpression) {
			aExpression = factory.createDataExactCardinality();
			((DataExactCardinality) aExpression).setCardinality( card );
			((DataExactCardinality) aExpression).setOnProperty((DataPropertyExpression) switchedP);
			if (switchedQ instanceof DataRange) {
				((DataExactCardinality) aExpression).setOnDataRange((DataRange) switchedQ);
			}
		} else if (switchedP instanceof ObjectPropertyExpression) {
			aExpression = factory.createObjectExactCardinality();
			((ObjectExactCardinality) aExpression).setCardinality( card );
			((ObjectExactCardinality) aExpression).setOnProperty((ObjectPropertyExpression) switchedP);
			if (switchedQ instanceof ClassExpression) {
				((ObjectExactCardinality) aExpression).setOnClass((ClassExpression) switchedQ);	
			}
		}
		return aExpression;
	}
	
	@Override
	public Object caseMinCardinalityRestriction(MinCardinalityRestriction object) {
		ClassExpression aExpression = null;
		Object switchedP = doSwitch( object.getOnProperty() );
		int card = object.getMinCardinality();
		if (switchedP instanceof DataPropertyExpression) {
			aExpression = factory.createDataMinCardinality();
			((DataMinCardinality) aExpression).setCardinality( card );
			((DataMinCardinality) aExpression).setOnProperty((DataPropertyExpression) switchedP);
		} else if (switchedP instanceof ObjectPropertyExpression) {
			aExpression = factory.createObjectMinCardinality();
			((ObjectMinCardinality) aExpression).setCardinality( card );
			((ObjectMinCardinality) aExpression).setOnProperty((ObjectPropertyExpression) switchedP);
		}
		return aExpression;
	}
	
	@Override
	public Object caseMinCardinalityQRestriction(MinCardinalityQRestriction object) {
		ClassExpression aExpression = null;
		Object switchedQ = doSwitch( object.getHasClassQ() );
		Object switchedP = doSwitch( object.getOnProperty() );
		int card = object.getMinCardinalityQ();
		if (switchedP instanceof DataPropertyExpression) {
			aExpression = factory.createDataMinCardinality();
			((DataMinCardinality) aExpression).setCardinality( card );
			((DataMinCardinality) aExpression).setOnProperty((DataPropertyExpression) switchedP);
			if (switchedQ instanceof DataRange) {
				((DataMinCardinality) aExpression).setOnDataRange((DataRange) switchedQ);
			}
		} else if (switchedP instanceof ObjectPropertyExpression) {
			aExpression = factory.createObjectMinCardinality();
			((ObjectMinCardinality) aExpression).setCardinality( card );
			((ObjectMinCardinality) aExpression).setOnProperty((ObjectPropertyExpression) switchedP);
			if (switchedQ instanceof ClassExpression) {
				((ObjectMinCardinality) aExpression).setOnClass((ClassExpression) switchedQ);	
			}
		}
		return aExpression;
	}
	
	@Override
	public Object caseMaxCardinalityRestriction(MaxCardinalityRestriction object) {
		ClassExpression aExpression = null;
		Object switchedP = doSwitch( object.getOnProperty() );
		int card = object.getMaxCardinality();
		if (switchedP instanceof DataPropertyExpression) {
			aExpression = factory.createDataMaxCardinality();
			((DataMaxCardinality) aExpression).setCardinality( card );
			((DataMaxCardinality) aExpression).setOnProperty((DataPropertyExpression) switchedP);
		} else if (switchedP instanceof ObjectPropertyExpression) {
			aExpression = factory.createObjectMaxCardinality();
			((ObjectMaxCardinality) aExpression).setCardinality( card );
			((ObjectMaxCardinality) aExpression).setOnProperty((ObjectPropertyExpression) switchedP);
		}
		return aExpression;
	}
	
	@Override
	public Object caseMaxCardinalityQRestriction(MaxCardinalityQRestriction object) {
		ClassExpression aExpression = null;
		Object switchedQ = doSwitch( object.getHasClassQ() );
		Object switchedP = doSwitch( object.getOnProperty() );
		int card = object.getMaxCardinalityQ();
		if (switchedP instanceof DataPropertyExpression) {
			aExpression = factory.createDataMaxCardinality();
			((DataMaxCardinality) aExpression).setCardinality( card );
			((DataMaxCardinality) aExpression).setOnProperty((DataPropertyExpression) switchedP);
			if (switchedQ instanceof DataRange) {
				((DataMaxCardinality) aExpression).setOnDataRange((DataRange) switchedQ);
			}
		} else if (switchedP instanceof ObjectPropertyExpression) {
			aExpression = factory.createObjectMaxCardinality();
			((ObjectMaxCardinality) aExpression).setCardinality( card );
			((ObjectMaxCardinality) aExpression).setOnProperty((ObjectPropertyExpression) switchedP);
			if (switchedQ instanceof ClassExpression) {
				((ObjectMaxCardinality) aExpression).setOnClass((ClassExpression) switchedQ);	
			}
		}
		return aExpression;
	}
	
	@Override
	public Object caseAllValuesFromRestriction(AllValuesFromRestriction object) {
		ClassExpression all = null;
		OntProperty property = object.getOnProperty();
		if (property.isObjectProperty()) {
			all = createObjectAllValuesFrom(object);
		} else if (property.isDatatypeProperty()) {
			all = createDataAllValuesFrom(object);
		}
		
		return all;
	}

	private ClassExpression createDataAllValuesFrom(AllValuesFromRestriction object) {
		final DataAllValuesFrom all = factory.createDataAllValuesFrom();

		Object switched = doSwitch(object.getOnProperty());
		if (switched instanceof DataPropertyExpression) {
			all.getOnProperties().add((DataPropertyExpression) switched);
			Object aExpression = doSwitch(object.getAllValuesFrom());
			if (aExpression instanceof DataRange) {
				all.setAllValuesFrom((DataRange) aExpression);	
			}
		}

		return all;
	}

	private ClassExpression createObjectAllValuesFrom(AllValuesFromRestriction object) {
		final ObjectAllValuesFrom all = factory.createObjectAllValuesFrom();

		Object switched = doSwitch(object.getOnProperty());
		if (switched instanceof ObjectPropertyExpression) {
			all.setOnProperty((ObjectPropertyExpression) switched);
			Object aExpression = doSwitch(object.getAllValuesFrom());
			if (aExpression instanceof ClassExpression) {
				all.setAllValuesFrom((ClassExpression) aExpression);	
			}
		}

		return all;
	}

	@Override
	public Object caseSomeValuesFromRestriction(SomeValuesFromRestriction object) {
		ClassExpression some = null;
		OntProperty property = object.getOnProperty();
		if (property.isObjectProperty()) {
			some = createObjectSomeValuesFrom(object);
		} else if (property.isDatatypeProperty()) {
			some = createDataSomeValuesFrom(object);
		}
		
		return some;
	}

	private ObjectSomeValuesFrom createObjectSomeValuesFrom(SomeValuesFromRestriction restriction) {
		final ObjectSomeValuesFrom some = factory.createObjectSomeValuesFrom();

		Object switched = doSwitch(restriction.getOnProperty());
		if (switched instanceof ObjectPropertyExpression) {
			some.setOnProperty((ObjectPropertyExpression) switched);	
			Object aExpression = doSwitch(restriction.getSomeValuesFrom());
			if (aExpression instanceof ClassExpression) {
				some.setSomeValuesFrom((ClassExpression) aExpression);
			}
		}
		return some;
	}

	private DataSomeValuesFrom createDataSomeValuesFrom(SomeValuesFromRestriction restriction) {
		final DataSomeValuesFrom some = factory.createDataSomeValuesFrom();

		Object switched = doSwitch(restriction.getOnProperty());
		if (switched instanceof DataPropertyExpression) {
			some.getOnProperties().add((DataPropertyExpression) switched);
			Object aExpression = doSwitch(restriction.getSomeValuesFrom());
			if (aExpression instanceof DataRange) {
				some.setSomeValuesFrom((DataRange) aExpression);
			}
		}

		return some;
	}

	@Override
	public Object caseHasValueRestriction(HasValueRestriction object) {
		ClassExpression has = null;
		OntProperty property = object.getOnProperty();
		if (property.isObjectProperty()) {
			has = createObjectHasValue(object);
		} else if (property.isDatatypeProperty()) {
			has = createDataHasValue(object);
		}
		
		return has;
	}

	private ClassExpression createDataHasValue(HasValueRestriction object) {
		final DataHasValue has = factory.createDataHasValue();
		Object switched = doSwitch(object.getOnProperty());
		if (switched instanceof DataPropertyExpression) {
			has.setOnProperty((DataPropertyExpression) switched);
			Object aValue = doSwitch(object.getHasValue());
			if (aValue instanceof Literal) {
				has.setHasValue((Literal) aValue);
			}
		}

		return has;
	}

	private ClassExpression createObjectHasValue(HasValueRestriction object) {
		final ObjectHasValue has = factory.createObjectHasValue();
		Object switched = doSwitch(object.getOnProperty());
		if (switched instanceof ObjectPropertyExpression) {
			has.setOnProperty((ObjectPropertyExpression) switched);
			Object aValue = doSwitch(object.getHasValue());
			if (aValue instanceof Individual) {
				has.setHasValue((Individual) aValue);	
			}
		}

		return has;
	}

	@Override
	public Object caseDatatypeProperty(DatatypeProperty object) {
		final Entity entity;
		if (registry.containsKey(object)) {
			entity = (Entity) registry.get(object);
		} else {
			entity = factory.createDataProperty();
			declareAndRegisterEntity(object, entity);
		}

		return getPrefixEntityExpression(entity);
	}

	@Override
	public Object caseObjectProperty(ObjectProperty object) {
		final Entity entity;
		if (registry.containsKey(object)) {
			entity = (Entity) registry.get(object);
		} else {
			entity = factory.createObjectProperty();
			declareAndRegisterEntity(object, entity);
		}

		return getPrefixEntityExpression(entity);
	}

	@Override
	public Object caseIndividual(com.hp.hpl.jena.ontology.Individual object) {
		final Individual aIndividual;
		if (registry.containsKey(object)) {
			aIndividual = (Individual) registry.get(object);
		} else if (object.isURIResource()) {
			aIndividual = factory.createNamedIndividual();
			declareAndRegisterEntity(object, (Entity) aIndividual);
		} else {
			aIndividual = factory.createAnonymousIndividual();
			registry.put(object, aIndividual);
		}
		return aIndividual instanceof NamedIndividual ? getPrefixEntityExpression((Entity) aIndividual) : aIndividual;
	}
	
	@Override
	public Object caseDatatype(com.hp.hpl.jena.ontology.DataRange object) {
		DataRange aDataRange = null;
		if (registry.containsKey(object)) {
			aDataRange = (DataRange) registry.get(object);
		} else {
			if (object.isURIResource()) {
				aDataRange = factory.createDatatype();
				declareAndRegisterEntity(object, (Entity) aDataRange);
			}
		}
		return aDataRange instanceof Datatype ? getPrefixEntityExpression((Entity) aDataRange) : aDataRange;
	}
	
	private Entity declareAndRegisterEntity(OntResource resource, Entity entity) {
		checkNotNull(resource);
		checkNotNull(entity);

		entity.setName( resource.getLocalName() );
		entity.setNamespace(getNamespace(resource, (com.emf4sw.owl.Ontology) doSwitch(ontology)));

		final Declaration declaration = factory.createDeclaration();
		declaration.setEntity(entity);
		declaration.setOntology((com.emf4sw.owl.Ontology) doSwitch(ontology));

		doAnnotations(resource, declaration);

		registry.put(resource, entity);

		return entity;
	}

	private PrefixEntityExpression getPrefixEntityExpression(Entity entity) {
		final PrefixEntityExpression expression = factory.createPrefixEntityExpression();
		expression.setReference(entity);
		expression.setNamespace(entity.getNamespace());

		return expression;
	}

	private void doAnnotations(OntResource resource, Declaration declaration) {
		for (ExtendedIterator<RDFNode> it = resource.listLabels(null); it.hasNext();) {
			RDFNode node = it.next();
			final Annotation annotation = factory.createAnnotation();
			annotation.setProperty(getLabelProperty());
			annotation.setValue(LiteralInjector.create(node));
			declaration.getAnnotations().add(annotation);
		}
		for (ExtendedIterator<RDFNode> it = resource.listComments(null); it.hasNext();) {
			RDFNode node = it.next();
			final Annotation annotation = factory.createAnnotation();
			annotation.setProperty(getCommentProperty());
			annotation.setValue(LiteralInjector.create(node));
			declaration.getAnnotations().add(annotation);
		}
		for (ExtendedIterator<RDFNode> it = resource.listSeeAlso(); it.hasNext();) {
			RDFNode node = it.next();
			final Annotation annotation = factory.createAnnotation();
			annotation.setProperty(getSeeAlsoProperty());
			annotation.setValue(LiteralInjector.create(node));
			declaration.getAnnotations().add(annotation);
		}
		for (StmtIterator it = resource.listProperties(); it.hasNext();) {
			Statement stmt = it.next();
			if (stmt.getPredicate().canAs(com.hp.hpl.jena.ontology.AnnotationProperty.class)) {
				if (!(stmt.getPredicate().getURI().equals(RDFS.label) || 
						stmt.getPredicate().getURI().equals(RDFS.comment) ||
						stmt.getPredicate().getURI().equals(RDFS.seeAlso))) {
					final Annotation annotation = factory.createAnnotation();
					annotation.setProperty(getAnnotation(resource, stmt));
					annotation.setValue(LiteralInjector.create(stmt.getObject()));
					declaration.getAnnotations().add(annotation);
				}
			} else if (stmt.getPredicate().getNameSpace().equals(DC.NS)) {
				final Annotation annotation = factory.createAnnotation();
				annotation.setProperty(getAnnotation(resource, stmt));
				annotation.setValue(LiteralInjector.create(stmt.getObject()));
				declaration.getAnnotations().add(annotation);
			}
		}
	}

	private AnnotationPropertyExpression getAnnotation(OntResource resource, Statement stmt) {
		final com.emf4sw.owl.Ontology target = (com.emf4sw.owl.Ontology) doSwitch(ontology);
		final Property property = stmt.getPredicate();
		final AnnotationProperty annotation;
		if (properties.containsKey(property)) {
			annotation = factory.createAnnotationProperty();
			annotation.setName(property.getLocalName());
			annotation.setNamespace(target.getNamespace(resource.getOntModel().getNsURIPrefix(property.getNameSpace())));
			final Declaration declaration = factory.createDeclaration();
			declaration.setEntity(annotation);
			declaration.setOntology(target);
			properties.put(property, annotation);
		} else {
			annotation = properties.get(property);
		}
		final PrefixEntityExpression expression = factory.createPrefixEntityExpression();
		expression.setReference(annotation);
		expression.setNamespace(target.getNamespace(resource.getOntModel().getNsURIPrefix(property.getNameSpace())));

		return expression;
	}

	private AnnotationPropertyExpression getSeeAlsoProperty() {
		final com.emf4sw.owl.Ontology target = (com.emf4sw.owl.Ontology) doSwitch(ontology);
		if (seeAlsoAnnotation == null) {
			seeAlsoAnnotation = factory.createAnnotationProperty();
			seeAlsoAnnotation.setName("seeAlso");
			seeAlsoAnnotation.setNamespace(target.getNamespace("rdfs"));
			final Declaration declaration = factory.createDeclaration();
			declaration.setEntity(seeAlsoAnnotation);
			declaration.setOntology(target);
		}
		final PrefixEntityExpression expression = factory.createPrefixEntityExpression();
		expression.setReference(seeAlsoAnnotation);
		expression.setNamespace(target.getNamespace("rdfs"));

		return expression;
	}

	private AnnotationPropertyExpression getCommentProperty() {
		final com.emf4sw.owl.Ontology target = (com.emf4sw.owl.Ontology) doSwitch(ontology);
		if (commentAnnotation == null) {
			commentAnnotation = factory.createAnnotationProperty();
			commentAnnotation.setName("comment");
			commentAnnotation.setNamespace(target.getNamespace("rdfs"));
			final Declaration declaration = factory.createDeclaration();
			declaration.setEntity(commentAnnotation);
			declaration.setOntology(target);
		}
		final PrefixEntityExpression expression = factory.createPrefixEntityExpression();
		expression.setReference(commentAnnotation);
		expression.setNamespace(target.getNamespace("rdfs"));

		return expression;
	}

	private AnnotationPropertyExpression getLabelProperty() {
		final com.emf4sw.owl.Ontology target = (com.emf4sw.owl.Ontology) doSwitch(ontology);
		if (labelAnnotation == null) {
			labelAnnotation = factory.createAnnotationProperty();
			labelAnnotation.setName("label");
			labelAnnotation.setNamespace(target.getNamespace("rdfs"));
			final Declaration declaration = factory.createDeclaration();
			declaration.setEntity(labelAnnotation);
			declaration.setOntology(target);
		}
		final PrefixEntityExpression expression = factory.createPrefixEntityExpression();
		expression.setReference(labelAnnotation);
		expression.setNamespace(target.getNamespace("rdfs"));

		return expression;
	}

}
