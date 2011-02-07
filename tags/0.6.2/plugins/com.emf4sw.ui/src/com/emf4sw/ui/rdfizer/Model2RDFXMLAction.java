package com.emf4sw.ui.rdfizer;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IObjectActionDelegate;

import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdf.resource.RDFXMLResourceFactory;

/**
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5
 */
public class Model2RDFXMLAction extends AbstractModel2RDFAction implements IObjectActionDelegate {

	public Model2RDFXMLAction() {
		super(RDFFormats.RDF_XML_FORMAT);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("rdf", new RDFXMLResourceFactory());
	}
}
