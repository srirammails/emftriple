package com.emftriple.datasources;

import java.util.Collection;
import java.util.Iterator;

import com.emf4sw.rdf.Node;
import com.emftriple.datasources.ResultSet.Solution;

/**
 * 
 * @author ehilgui
 *
 */
public interface ResultSet extends Iterator<Solution> {

	Collection<String> getVarNames();
	
	public static interface Solution {
		
		Node get(String varName);
		
	}
	
}
