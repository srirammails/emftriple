package com.emftriple.neo4j.util;

import java.util.List;

import org.neo4j.rdf.model.CompleteStatement;
import org.neo4j.rdf.model.Context;
import org.neo4j.rdf.model.Literal;
import org.neo4j.rdf.model.Resource;
import org.neo4j.rdf.model.Uri;

import com.emf4sw.rdf.Datatype;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Triple;
import com.emf4sw.rdf.URIElement;
import com.google.inject.internal.Lists;

public class RDFGraph2Statements {

	public static CompleteStatement[] createStatements(RDFGraph aGraph) {
		return createStatements(aGraph, Context.NULL);
	}
	
	public static CompleteStatement[] createStatements(RDFGraph aGraph, Context context) {
		final List<CompleteStatement> list = Lists.newArrayList();
		
		for (Triple triple: aGraph.getTriples()) 
		{
			Resource sbj = new Uri(((URIElement) triple.getSubject()).getURI());
			Uri prop = new Uri(((URIElement) triple.getPredicate()).getURI());
			
			if (triple.getObject() instanceof URIElement) {
				list.add(new CompleteStatement(sbj, prop, 
						new Uri(((URIElement) triple.getObject()).getURI()),
						context));
			} else {
				String val = ((com.emf4sw.rdf.Literal) triple.getObject()).getLexicalForm();
				Datatype d = ((com.emf4sw.rdf.Literal) triple.getObject()).getDatatype();
//				String lg = ((com.emf4sw.rdf.Literal) triple.getObject()).getLang();
				
				Literal obj;
				if (d != null) {
					obj = new Literal(val, new Uri(d.getURI()));
				} else {
					obj = new Literal(val);
				}
				list.add(new CompleteStatement(sbj, prop, obj, context));
				
			} 
		}
		
		return list.toArray(new CompleteStatement[]{});
	}
}
