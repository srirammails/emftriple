/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.query.transform;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.query.sparql.AskQuery;
import com.emftriple.query.sparql.GroupGraphPatternSub;
import com.emftriple.query.sparql.IRI;
import com.emftriple.query.sparql.PropertyList;
import com.emftriple.query.sparql.SparqlFactory;
import com.emftriple.query.sparql.TriplesSameSubject;
import com.emftriple.query.sparql.WhereClause;
import com.emftriple.util.EntityUtil;
import com.google.common.base.Function;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class Ask implements Function<URI, AskQuery> {

	private final SparqlFactory factory = SparqlFactory.eINSTANCE;
	
	private final EClass eClass;
	
	public Ask(EClass eClass) {
		this.eClass = eClass;
	}
	
	@Override
	public AskQuery apply(URI from) {
		AskQuery query = factory.createAskQuery();
		query.setWhereClause(createWhereClause(from));
		
		return query;
	}

	private WhereClause createWhereClause(URI from) {
		final WhereClause where = factory.createWhereClause();
		final GroupGraphPatternSub group = factory.createGroupGraphPatternSub();
		final TriplesSameSubject pattern = factory.createTriplesSameSubject();
		final IRI subject = factory.createIRI();
		subject.setValue(from.toString());
		
		final PropertyList list = factory.createPropertyList();
		final IRI predicate = factory.createIRI();
		predicate.setValue(RDF.type);
		
		final IRI object = factory.createIRI();
		object.setValue(EntityUtil.getEntityURI(eClass).toString());
		list.setProperty(predicate);
		list.setObject(object);
		pattern.setSubject(subject);
		pattern.getPropertyList().add(list);
		group.getGraphPatterns().add(pattern);

		where.setGroupGraphPattern(group);
		
		return where;
	}

}
