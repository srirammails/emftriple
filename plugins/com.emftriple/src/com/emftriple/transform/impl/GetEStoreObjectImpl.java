package com.emftriple.transform.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;

import com.emf4sw.rdf.RDFGraph;
import com.emftriple.Mapping;
import com.emftriple.datasources.EntityDataSourceManager;
import com.emftriple.resource.ETripleObject;
import com.emftriple.transform.GetObject;
import com.emftriple.util.Functions;
import com.emftriple.validation.TypeResolver;

public class GetEStoreObjectImpl extends AbstractGetObject implements GetObject {

	private final EStore eStore;
	
	public GetEStoreObjectImpl(Mapping mapping, EntityDataSourceManager dataSourceManager, EStore eStore) {
		super(mapping, dataSourceManager);
		this.eStore = eStore;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(Class<T> entityClass, URI key) {
		final RDFGraph aGraph = getGraph(entityClass, key);
		final EClass aClass = Functions.transform(key, new TypeResolver(entityClass, mapping, aGraph));
		
		EObject obj = (aClass == null) ? null : eStore.create(aClass);
		if (obj != null) {
			((ETripleObject)obj).eSetURI(key);
		}
		
		return  (T) obj;
	}

}