package com.emf4sw.owl.atl;

import static com.atl.common.models.Models.ecore;
import static com.atl.common.models.Models.inject;
import static com.atl.common.trans.Transformations.transform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.trans.Transformation;
import com.emf4sw.owl.Ontology;

/**
 * {@link EPackage2Ontology}
 * 
 * Transformation taking as input a {@link EPackage}. This {@link EPackage} has to be the sole 
 * {@link EPackage} in his containing {@link Resource}. Result as a single {@link Ontology}. 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class EPackage2Ontology implements Transformation<EPackage, Ontology> {

	@Override
	public Ontology apply(EPackage from) {
		return getOntology( transform( inject(from.eResource(), ecore()), new Ecore2OWL() ) );
	}

	private Ontology getOntology(EMFModel aModel) {
		Ontology aOntology = null;
		if (aModel != null && aModel.getResource() != null && 
				!aModel.getResource().getContents().isEmpty()) {
			final EObject aObject = aModel.getResource().getContents().get(0);
			if (aObject instanceof Ontology) {
				aOntology = (Ontology) aObject;
			}
		}
		return aOntology;
	}
}
