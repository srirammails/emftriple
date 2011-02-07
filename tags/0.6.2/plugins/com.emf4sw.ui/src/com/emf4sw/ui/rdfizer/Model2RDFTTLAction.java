package com.emf4sw.ui.rdfizer;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IObjectActionDelegate;

import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdf.resource.RDFTurtleResourceFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class Model2RDFTTLAction extends AbstractModel2RDFAction implements IObjectActionDelegate {

	public Model2RDFTTLAction() {
		super(RDFFormats.TURTLE_FORMAT);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new RDFTurtleResourceFactory());
	}

}
