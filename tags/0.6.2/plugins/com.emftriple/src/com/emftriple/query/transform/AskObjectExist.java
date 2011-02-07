package com.emftriple.query.transform;

import org.eclipse.emf.ecore.EObject;

import com.emf4sw.rdf.vocabulary.RDF;
import com.emftriple.datasources.DataSource;
import com.emftriple.util.EntityUtil;
import com.google.common.base.Function;

public class AskObjectExist implements Function<EObject, Boolean> {

	public AskObjectExist(DataSource dataSource) {
		
	}

	@Override
	public Boolean apply(EObject from) {
		String aQuery = "ASK WHERE { ?s <" + RDF.type + "> <";
		aQuery += EntityUtil.getEntityURI(from.eClass()) + "> . ";
//		for (EStructuralFeature aFeature: from.eClass().getEAllStructuralFeatures())
//		{
//			
//		}
		return null;
	}
}
