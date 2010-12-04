package com.emftriple.impl;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import com.emftriple.Mapping;
import com.emftriple.config.annotations.EntityMapping;
import com.emftriple.config.persistence.Property;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class FileMapping extends AbstractMapping implements Mapping {

	FileMapping(Resource resource, List<Property> properties) {
		super(getPackages(resource), properties);
		
	}

	private static List<EPackage> getPackages(Resource resource) {
		checkIsEntityMapping( resource.getContents().get(0) );
		EntityMapping em = (EntityMapping)resource.getContents().get(0);
		em.getPackage();
		
		return null;
	}

	private static void checkIsEntityMapping(EObject object) {
		if (!(object instanceof EntityMapping)) {
			throw new IllegalArgumentException("Mapping root document should be an entity-mapping declaration");
		}		
	}

	@Override
	public EClass getEClass(Class<?> aClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EClass getEClassWithRdfType(String URI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getRdfType(EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getRdfType(EStructuralFeature eFeature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMappedClass(Class<?> aClass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> URI getNamedGraph(Class<T> aClass) {
		// TODO Auto-generated method stub
		return null;
	}

}
