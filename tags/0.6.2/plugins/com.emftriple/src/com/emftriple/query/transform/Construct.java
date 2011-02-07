/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.query.transform;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.emftriple.query.sparql.ConstructQuery;
import com.emftriple.query.sparql.GraphPattern;
import com.emftriple.query.sparql.GroupGraphPattern;
import com.emftriple.query.sparql.IRI;
import com.emftriple.query.sparql.PropertyList;
import com.emftriple.query.sparql.SparqlFactory;
import com.emftriple.query.sparql.TriplesSameSubject;
import com.emftriple.query.sparql.UnNamedVariable;
import com.emftriple.query.sparql.WhereClause;
import com.emftriple.util.ETripleEcoreUtil;
import com.emftriple.util.EntityUtil;
import com.google.common.base.Function;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class Construct implements Function<EClass, ConstructQuery> {

	private static final SparqlFactory factory = SparqlFactory.eINSTANCE;

	@Override
	public ConstructQuery apply(EClass from) {
		final ConstructQuery query = factory.createConstructQuery();
		query.setConstructTemplate(createConstructTemplate(from));
		query.setWhereClause(createWhereClause(from));

		return query;
	}

	/*
	 * class Entity extends Type {
	 * 		attr String name;
	 * 		ref Type[*] types;
	 * }
	 * 
	 * abstract class Type {
	 * 		attr name;
	 * }
	 * 
	 * class DataType extends Type {}
	 * 
	 * 
	 * {
	 * 		<> rdf:type Entity .
	 * 		<> :name ?Entity_name .
	 * 		{ 
	 * 			<> :types ?Entity_types_DataType .
	 * 			?Entity_types_DataType rdf:type DataType .
	 * 			?Entity_types_DataType :name ?Entity_types_DataType_name 
	 * 		}
	 * 		UNION 
	 * 		{
	 * 			<> :types ?Entity_types_Entity .
	 *		}
	 * 		
	 * }
	 * 
	 */
	private GroupGraphPattern createConstructTemplate(EClass from) {
		final GroupGraphPattern pattern = factory.createGroupGraphPattern();

//		for (EAttribute attribute: from.getEAllAttributes()) {
//
//		}
		return pattern;
	}

	@SuppressWarnings("unused")
	private GraphPattern getGraphPattern(EClass eClass, String id) {
		for (EAttribute attribute: eClass.getEAllAttributes()) {
			getGraphPattern(id, attribute);
		}
		for (EReference reference: eClass.getEAllReferences()) {
			getGraphPattern(id, reference);
		}
		return null;
	}

	private GraphPattern getGraphPattern(String subjectId, EAttribute attribute) {
		final TriplesSameSubject graphPattern = factory.createTriplesSameSubject();

		final IRI subject = factory.createIRI();
		subject.setValue(subjectId);

		final IRI predicate = factory.createIRI();
		predicate.setValue(EntityUtil.getEntityURI(attribute).toString());

		final UnNamedVariable object = factory.createUnNamedVariable();
		object.setName(getVariableName(attribute));

		final PropertyList propertyList = factory.createPropertyList();
		propertyList.setProperty(predicate);
		propertyList.setObject(object);

		graphPattern.setSubject(subject);
		graphPattern.getPropertyList().add(propertyList);

		return graphPattern;
	}

	/*
	 *	{   
	 *		<> :types ?Entity_types_DataType .
	 * 		?Entity_types_DataType rdf:type DataType .
	 * 		?Entity_types_DataType :name ?Entity_types_DataType_name 
	 * 	}
	 * 	UNION 
	 * 	{
	 * 		<> :types ?Entity_types_Entity .
	 *	}
	 */
	private GraphPattern getGraphPattern(String subjectId, EReference reference) {
		final Collection<EClass> classes = EcoreUtil.getObjectsByType(
				reference.getEContainingClass().getEPackage().getEClassifiers(), 
				EcorePackage.eINSTANCE.getEClass());

		@SuppressWarnings("unused")
		final EList<EClass> subClasses = 
			ETripleEcoreUtil.getESubClasses((EClass)reference.getEType(), classes);

		return null;

	}

	private String getVariableName(EAttribute attribute) {
		return attribute.getEContainingClass().getName() + "_" + attribute.getName();
	}

	private WhereClause createWhereClause(EClass from) {
		// TODO Auto-generated method stub
		return null;
	}

}
