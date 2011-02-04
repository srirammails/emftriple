package com.emftriple.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.emf4sw.rdf.resource.impl.TTLResourceFactory;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.sparql.resultset.XMLInput;
import com.hp.hpl.jena.update.GraphStore;
import com.hp.hpl.jena.update.GraphStoreFactory;
import com.hp.hpl.jena.update.UpdateAction;

public class RDFGraph2UpdateTest {

	public static void main(String[] args) throws IOException {
		Resource res = new TTLResourceFactory().createResource(URI.createURI("src/data.ttl"));
		res.load(null);
		
		String query = "INSERT { " +
//"GRAPH <http://localhost:2020/sparql>" +
//" { " +
"<http://www.semweb.com/jobboard#1> <http://www.semweb.com/jobs#vacancywith> <http://dbpedia.org/resource/IBM> . " + 
"<http://www.semweb.com/jobboard#1> <http://www.semweb.com/jobs#description> \"Finance my ass\" . " +
"<http://www.semweb.com/jobboard#1> <http://www.semweb.com/jobboard#location> <http://dbpedia.org/resource/Los_Angeles> . " + 
"<http://www.semweb.com/jobboard#1> <http://purl.org/dc/elements/1.1/title> \"Financial Analyst\" . " +
"<http://www.semweb.com/jobboard#1> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://www.semweb.com/jobs#Vacancy> . " + 
"<http://www.semweb.com/jobboard#4> <http://www.semweb.com/jobs#vacancywith> <http://dbpedia.org/resource/Ericsson> . " + 
"<http://www.semweb.com/jobboard#4> <http://www.semweb.com/jobs#description> \"Become a radio engineer\" . } WHERE {}";
		
//		Functions.transform((RDFGraph)res.getContents().get(0), new InsertData("http://localhost:2020/sparql"));
		
//		Model model = ModelFactory.createDefaultModel();
		XMLInput.fromXML("");
		
		QueryExecutionFactory.create(query).execSelect().getResourceModel();
		
		System.out.println(query);
		GraphStore qe = GraphStoreFactory.create(DatasetFactory.create("http://localhost:2020/sparql"));
		UpdateAction.parseExecute(query, qe);
	}
}
