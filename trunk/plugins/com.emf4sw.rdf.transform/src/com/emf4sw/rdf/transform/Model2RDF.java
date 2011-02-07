/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdf.transform;

import static com.atl.common.models.Models.get;
import static com.atl.common.models.Models.inject;
import static com.atl.common.models.Models.setOf;
import static com.atl.common.utils.Preconditions.checkArgument;
import static com.atl.common.utils.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import com.atl.common.models.Properties;
import com.atl.common.trans.MultiInOneOutTransformation;
import com.atl.common.trans.Transformations;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.resource.RDFFormats;

/**
 * 
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.6.0
 */
public class Model2RDF extends RDFTransformation {

	/**
	 * ATL Files
	 */
	private static final String asm = "resources/Model2RDF.asm";	
	
	public Model2RDF() {
		super();
	}	
	
	public Resource transform(Resource resource) {
		return transform(resource, null);
	}
	
	public Resource transform(Resource resource, Map<String, Object> options) {
		checkNotNull(resource);
		checkArgument(!resource.getContents().isEmpty());
		
		if (options == null) {
			options = new HashMap<String, Object>();
		}
		
		final EPackage ePackage = registerAndGetPackage(resource);
		
		checkNotNull(ePackage, "EPackage cannot be found for resource " + resource);
		checkNotNull(ePackage.getNsURI(), "EPackage nsURI should be set");
		
		if (!options.containsKey(OPTION_BASE_NAMESPACE)) {
			options.put(OPTION_BASE_NAMESPACE, ePackage.getNsURI().endsWith("/") ? 
					ePackage.getNsURI() : ePackage.getNsURI() + "#");
		}
		
		final RDFFormats format = options.containsKey(OPTION_RDF_FORMAT) ? 
				(RDFFormats) options.get(OPTION_RDF_FORMAT) : 
					RDFFormats.RDF_XML_FORMAT;
		
		checkFactoryIsRegistered(format);
		
		final Properties<String, Object> properties = Properties.createProperties(options);		
		final EMFModel propertiesModel = inject(properties.serialize(), Properties.getReferenceModel());
		
		return Transformations.transform( setOf(inject(resource, get(ePackage.getNsURI())), propertiesModel), 
				transformation(ePackage, format, options)).getResource();
	}

	private MultiInOneOutTransformation transformation(EPackage ePackage, RDFFormats format, Map<String, Object> options) {
		return new Transformations.Builder()
				.asm(loadASM(super_asm), loadASM(asm))
				.lib("RDFHelpers", loadASM(lib))
				.lib("PropertiesHelpers", Properties.getHelpers())
				.options(atloptions())
				.in(get(ePackage.getNsURI()), "IN", "Model")
				.in(Properties.getReferenceModel(), "IN2", "Properties")
				.out(get(RDFPackage.eNS_URI), "OUT", "RDF", RDFFormats.factory(format))
				.buildMultiInOneOut();
	}
	
}
