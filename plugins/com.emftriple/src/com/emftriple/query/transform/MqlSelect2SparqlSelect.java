/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.query.transform;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.Mapping;
import com.emftriple.query.mql.AliasAttributeExpression;
import com.emftriple.query.mql.AndExpression;
import com.emftriple.query.mql.BooleanExpression;
import com.emftriple.query.mql.Expression;
import com.emftriple.query.mql.FromClass;
import com.emftriple.query.mql.FromCollection;
import com.emftriple.query.mql.FromEntry;
import com.emftriple.query.mql.FromJoin;
import com.emftriple.query.mql.IntegerExpression;
import com.emftriple.query.mql.Join;
import com.emftriple.query.mql.OperatorExpression;
import com.emftriple.query.mql.OrExpression;
import com.emftriple.query.mql.ParameterExpression;
import com.emftriple.query.mql.SelectClause;
import com.emftriple.query.mql.SelectExpression;
import com.emftriple.query.mql.SelectStatement;
import com.emftriple.query.mql.StringExpression;
import com.emftriple.query.mql.VariableDeclaration;
import com.emftriple.query.mql.util.MqlSwitch;
import com.emftriple.query.sparql.ExpressionFilterExpression;
import com.emftriple.query.sparql.FilterPattern;
import com.emftriple.query.sparql.GraphNode;
import com.emftriple.query.sparql.GraphPattern;
import com.emftriple.query.sparql.GroupGraphPatternSub;
import com.emftriple.query.sparql.IRI;
import com.emftriple.query.sparql.IntegerValue;
import com.emftriple.query.sparql.Operator;
import com.emftriple.query.sparql.Parameter;
import com.emftriple.query.sparql.PropertyList;
import com.emftriple.query.sparql.SelectQuery;
import com.emftriple.query.sparql.SparqlFactory;
import com.emftriple.query.sparql.StringValue;
import com.emftriple.query.sparql.TriplesSameSubject;
import com.emftriple.query.sparql.UnNamedVariable;
import com.emftriple.query.sparql.Value;
import com.emftriple.query.sparql.Variable;
import com.emftriple.query.sparql.WhereClause;
import com.emftriple.util.EntityUtil;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.hp.hpl.jena.reasoner.IllegalParameterException;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class MqlSelect2SparqlSelect implements Function<SelectStatement, SelectQuery> {

	private static final SparqlFactory factory = SparqlFactory.eINSTANCE;

	private Mapping mapping;

	public MqlSelect2SparqlSelect(Mapping mapping) {
		this.mapping = mapping;
	}

	@Override
	public SelectQuery apply(SelectStatement from) {
		final SelectQuery out = factory.createSelectQuery();
		final SelectClause select = from.getSelectFromClause().getSelectClause();
		if (select == null) {
			out.setAll(true);
		} else {
			for (SelectExpression entry: select.getExpressions()) {
				out.getVariables().add(transform(entry));
			}
		}
		out.setWhereClause(transform(from));

		return out;
	}

	private Variable transform(SelectExpression entry) {
		if (entry instanceof AliasAttributeExpression) {
			final UnNamedVariable variable = factory.createUnNamedVariable();
			variable.setName(((AliasAttributeExpression) entry).getAlias().getName());

			return variable;
		}
		throw new IllegalParameterException(entry.getClass().getName() + " are not yet suppported");
	}

	private WhereClause transform(SelectStatement from) {
		final WhereClause out = factory.createWhereClause();
		final GroupGraphPatternSub group = factory.createGroupGraphPatternSub();

		for (FromEntry entry: from.getSelectFromClause().getFromClause().getFromEntries()) {
			group.getGraphPatterns().addAll(transform(entry));
		}

		if (from.getWhereClause() != null) {
			final List<GraphPattern> patterns = new WhereSwitch(this).doSwitch(from.getWhereClause().getWhereEntry());
			group.getGraphPatterns().addAll(patterns);
		}

		out.setGroupGraphPattern(group);

		return out;
	}

	private List<GraphPattern> transform(FromEntry from) {
		if (from instanceof FromClass) {
			return transformFromClass((FromClass)from);
		} else {
			return transformFromCollection((FromCollection)from);
		}
	}
	
	private List<GraphPattern> transformFromCollection(FromCollection from) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<GraphPattern> transformFromClass(FromClass from) {
		final EClass eClass = getEClass(from);
		if (eClass == null) {
			throw new IllegalArgumentException("Cannot find EClass named " + from.getType());
		}

		final List<GraphPattern> patterns = new BasicEList<GraphPattern>();
		
		// Create Types
		final TriplesSameSubject triples = factory.createTriplesSameSubject();
		triples.setSubject(createUnNamedVariable( from.getVariable().getName() ));

		final PropertyList list = factory.createPropertyList();
		list.setObject( createIRI( EntityUtil.getEntityURI(eClass).toString() ));
		list.setProperty( createIRI(RDF.type) );
		triples.getPropertyList().add( list );

		patterns.add(triples);

		// Create Expressions If Joins
		if (!from.getJoins().isEmpty())
		{
			for (FromJoin join: from.getJoins())
			{
				patterns.addAll( pathToTriples(join.getPath(), join.getVariable().getName()) );
			}
		}
		
		return patterns;
	}
	
	private List<TriplesSameSubject> pathToTriples(AliasAttributeExpression path, String last) {
		final List<TriplesSameSubject> triples = new BasicEList<TriplesSameSubject>();
		
		String current = path.getAlias().getName();
		EClass startContext = getEClass( (FromClass) path.getAlias().eContainer() ); // danger
		
		int i=0;
		for (String attr: path.getAttributes())
		{
			TriplesSameSubject tr = factory.createTriplesSameSubject();
			Variable sbj = factory.createUnNamedVariable();
			sbj.setName(current);
			
			EStructuralFeature cuurentFeature = startContext.getEStructuralFeature(attr);
			if (cuurentFeature == null)
			{
				throw new IllegalArgumentException("cannot find feature named " + attr);
			}
			IRI pred = createIRI(cuurentFeature);
			PropertyList pl = factory.createPropertyList();
			pl.setProperty(pred);
			tr.getPropertyList().add(pl);
			
			if (path.getAttributes().size() > i+1) {
				UnNamedVariable obj = factory.createUnNamedVariable();
				obj.setName(current + "_" + attr);
				current = current + "_" + attr;
				pl.setProperty(obj);
				if (cuurentFeature instanceof EReference)
				{	
					startContext = (EClass) cuurentFeature.getEType();	
				}
			} else {
				UnNamedVariable obj = factory.createUnNamedVariable();
				obj.setName(last);
				pl.setProperty(obj);
			}
			i++;
		}
		
		return triples;
	}

	protected static UnNamedVariable createUnNamedVariable(String name) {
		final UnNamedVariable obj = factory.createUnNamedVariable();
		obj.setName(name);

		return obj;
	}

	protected static IRI createIRI(String name) {
		final IRI iri = factory.createIRI();
		iri.setValue(name);

		return iri;
	}

	protected static IRI createIRI(EStructuralFeature feature) {
		final IRI iri = factory.createIRI();
		iri.setValue( EntityUtil.getEntityURI(feature).toString() );

		return iri;
	}

	protected static UnNamedVariable createUnNamedVariable(String alias, String attr) {
		final UnNamedVariable obj = factory.createUnNamedVariable();
		obj.setName(alias.toLowerCase() + '_' + attr.toLowerCase());

		return obj;
	}

	private static final Map<String, EClass> classes = Maps.newHashMap();

	private EClass getEClass(FromClass from) {
		if (classes.containsKey(from.getType())) 
		{
			return classes.get(from.getType());
		}

		for (EClass eClass: mapping.getEClasses()) 
		{
			classes.put(eClass.getName(), eClass);
		}
		return classes.get(from.getType());
	}

	private EStructuralFeature getEFeature(VariableDeclaration from, String featureName) {
		EObject container = from.eContainer();
		if (container instanceof FromClass)
		{
			return getEClass((FromClass) container).getEStructuralFeature(featureName);	
		} else if (container instanceof Join)
		{

		}
		return null;		
	}

	//	SELECT a FROM Author a WHERE :lastName IS NULL OR LOWER(a.lastName) = :lastName;
	//	SELECT e, a FROM Entity AS e JOIN e.features AS a WHERE a.name = 'name'

	//	SELECT ?a WHERE { ?a a :Author . ?a :lastName ?a_lastName . FILTER(?n = %value%) }
	//	SELECT ?a WHERE { ?a a :Attribute . ?e a Entity . ?a :name ?a_name . ?e features ?a }
	//	DESCRIBE ?a WHERE { ?a a :Author . ?a :lastName ?n . FILTER(?n = %value%) }

	private static class WhereSwitch extends MqlSwitch<List<GraphPattern>> {

		private MqlSelect2SparqlSelect trans;

		public WhereSwitch(MqlSelect2SparqlSelect trans) {
			this.trans = trans;
		}

		@Override
		public List<GraphPattern> caseOperatorExpression(OperatorExpression object) {
			final com.emftriple.query.mql.Variable lhs = object.getLhs();
			EStructuralFeature feature = null;

			if (lhs instanceof AliasAttributeExpression)
			{
				AliasAttributeExpression aae = (AliasAttributeExpression)lhs;
				if (!aae.getAttributes().isEmpty()) 
				{
					feature = trans.getEFeature( aae.getAlias(), aae.getAttributes().get(0) ); // TODO allow many features

					if (feature == null) {
						throw new IllegalArgumentException("Cannot find feature named " + aae.getAttributes().get(0));
					}
				}
				final Expression rhs = object.getRhs();

				if (seqOps.contains(object.getOperator())) {
					return createSequenceExpression(aae, rhs);
				} else {
					return createValueExpression(operator(object.getOperator()), aae, rhs, feature);
				}
			} 
			else if (lhs instanceof Value)
			{

			}
			return null;
		}

		protected List<GraphPattern> createSequenceExpression(AliasAttributeExpression lhs, Expression rhs) {
			final List<GraphPattern> patterns = new BasicEList<GraphPattern>();

			if (rhs instanceof AliasAttributeExpression) {
				FromClass entry = (FromClass)((AliasAttributeExpression) rhs).getAlias();
				String attr = ((AliasAttributeExpression) rhs).getAttributes().get(0);
				EStructuralFeature feature = trans.getEFeature( entry.getVariable(), attr );

				if (feature == null) {
					throw new IllegalArgumentException("Cannot find feature named " + lhs.getAttributes().get(0));
				}

				final TriplesSameSubject triples = factory.createTriplesSameSubject();
				final PropertyList list = factory.createPropertyList();

				list.setProperty(createIRI(feature));
				list.setObject(createUnNamedVariable(lhs.getAlias().getName()));
				triples.getPropertyList().add(list);
				triples.setSubject(createUnNamedVariable(entry.getVariable().getName()));

				patterns.add(triples);
			}

			return patterns;
		}

		protected List<GraphPattern> createValueExpression(Operator operator, AliasAttributeExpression lhs, Expression rhs, EStructuralFeature feature) {
			final List<GraphPattern> patterns = new BasicEList<GraphPattern>();
			final TriplesSameSubject triples = factory.createTriplesSameSubject();
			final PropertyList list = factory.createPropertyList();

			VariableDeclaration var = lhs.getAlias();


			triples.setSubject(createUnNamedVariable( var.getName()) );	
			list.setProperty(createIRI(feature));
			list.setObject(createUnNamedVariable( var.getName(), lhs.getAttributes().get(0)));


			triples.getPropertyList().add(list);
			patterns.add(triples);

			if (feature instanceof EAttribute) {
				final FilterPattern filter = factory.createFilterPattern();
				final ExpressionFilterExpression expression = factory.createExpressionFilterExpression();
				expression.setOperator(operator);

				expression.setLeft(createUnNamedVariable(lhs.getAlias().getName(), lhs.getAttributes().get(0)));

				final GraphNode val = new ValueSwitch().doSwitch(rhs);
				if (val != null) {
					expression.setRight(val);
				}

				filter.setExpression(expression);
				patterns.add(filter);
			}

			return patterns;
		}

		@Override
		public List<GraphPattern> caseAndExpression(AndExpression object) {
			final List<GraphPattern> patterns = new BasicEList<GraphPattern>();
			for (Expression entry: object.getEntries()) {
				List<GraphPattern> ret = this.doSwitch(entry);
				if (ret != null) {
					patterns.addAll( this.doSwitch(entry) );
				}
			}
			return patterns;
		}

		@Override
		public List<GraphPattern> caseOrExpression(OrExpression object) {
			final List<GraphPattern> patterns = new BasicEList<GraphPattern>();
			for (Expression entry: object.getEntries()) {
				List<GraphPattern> ret = this.doSwitch(entry);
				if (ret != null) {
					patterns.addAll( this.doSwitch(entry) );
				}
			}
			return patterns;
		}

	}

	private static class ValueSwitch extends MqlSwitch<GraphNode> {
		@Override
		public Value caseStringExpression(StringExpression object) {
			checkNotNull(object);

			StringValue val = factory.createStringValue();
			val.setValue(object.getValue());

			return val;
		}
		@Override
		public Value caseIntegerExpression(IntegerExpression object) {
			checkNotNull(object);

			IntegerValue val = factory.createIntegerValue();
			val.setValue(object.getValue());

			return val;
		}
		@Override
		public Value caseBooleanExpression(BooleanExpression object) {
			checkNotNull(object);

			StringValue val = factory.createStringValue();
			val.setValue(object.toString());

			return val;
		}
		@Override
		public GraphNode caseParameterExpression(ParameterExpression object) {
			Parameter param = SparqlFactory.eINSTANCE.createParameter();
			param.setName(object.getName());

			return param;
		}
	}

	protected static final List<com.emftriple.query.mql.Operator> seqOps = 
		Lists.asList( 
				//				com.emftriple.query.mql.Operator.IN, 
				//				com.emftriple.query.mql.Operator.NOT_IN,
				null,
				new com.emftriple.query.mql.Operator[] {}
		);

	protected static Operator operator(com.emftriple.query.mql.Operator operator) {
		switch (operator) {
		case EQUAL:
			return Operator.EQUAL;
		case GREATER_EQUAL:
			return Operator.GREATER_EQUAL;
		case LESS_EQUAL:
			return Operator.LESS_EQUAL;
		case NOT_EQUAL:
			return Operator.NOT_EQUAL;
		case GREATER_THEN:
			return Operator.GREATER_THEN;
		case LESS_THEN:
			return Operator.LESS_THEN;
		default:
			break;
		}
		return null;
	}

}
