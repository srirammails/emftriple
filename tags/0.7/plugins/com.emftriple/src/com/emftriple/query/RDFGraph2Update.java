package com.emftriple.query;

import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Triple;
import com.google.common.base.Function;

public abstract class RDFGraph2Update implements Function<RDFGraph, String> {

	public static class InsertData extends RDFGraph2Update { 
		private String graph;

		public InsertData(String graph) {
			this.graph = graph;
		}

		@Override
		public String apply(RDFGraph aGraph) {
			final StringBuffer buffer = new StringBuffer("INSERT { \n");
			if (graph != null) buffer.append("GRAPH <" + graph + "> {\n");
			for (Triple triple: aGraph.getTriples()) {
				buffer.append(triple.toString() + " . \n");
			}
			if (graph != null) buffer.append("}");
			buffer.append("}");
			return buffer.toString();
		}
	}
	
	public static class DeleteData extends RDFGraph2Update {
		@Override
		public String apply(RDFGraph aGraph) {
			final StringBuffer buffer = new StringBuffer("DELETE DATA { \n");
			for (Triple triple: aGraph.getTriples()) {
				buffer.append(triple.toString() + " . \n");
			}
			buffer.append("}");
			return buffer.toString();
		}
		
	}

}
