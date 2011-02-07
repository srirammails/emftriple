package com.emf4sw.ui.ecore2owl;

import org.eclipse.ui.IObjectActionDelegate;

import com.emf4sw.owl.Annotation;
import com.emf4sw.owl.Ontology;
import com.emf4sw.owl.resource.OWLFormats;
import com.emf4sw.rdf.vocabulary.RDFS;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.0
 */
public class Ecore2FunctionalAction extends AbstractEcore2OWLFileAction implements IObjectActionDelegate {

	public Ecore2FunctionalAction() {
		super();
	}
	
	@Override
	protected OWLFormats getFormat() {
		return OWLFormats.OFN;
	}

	@Override
	protected String getName(Ontology ontology) {
		Annotation aLabel = ontology.getAnnotation(RDFS.label);
		String name = null;
		if (aLabel != null) {
			name = aLabel.getValue().getValue();
		}
		return name + ".ofn";
	}

}
