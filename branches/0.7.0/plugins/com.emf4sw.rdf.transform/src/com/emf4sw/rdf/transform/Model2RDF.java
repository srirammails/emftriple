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
import static com.atl.common.models.Models.register;
import static com.atl.common.utils.Preconditions.checkArgument;
import static com.atl.common.utils.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.m2m.atl.engine.emfvm.ASM;
import org.eclipse.m2m.atl.engine.emfvm.ASMXMLReader;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;

import com.atl.common.trans.Transformations;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdf.transform.lib.ETripleLibExtension;

/**
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.6.0
 */
public class Model2RDF {

	private static final String asm = "resources/Model2RDF.asm";
	
	private static final String super_asm = "resources/RDF.asm";
	
	private static final String lib = "resources/RDFHelpers.asm";
	
	public static final String OPTION_INCLUDE_ONTOLOGY = "OPTION_INCLUDE_ONTOLOGY"; 
	
	public static final String OPTION_BASE_NAMESPACE = "OPTION_BASE_NAMESPACE";
	
	public static final String OPTION_RDF_FORMAT = "OPTION_RDF_FORMAT"; 
	
	public Model2RDF() {
		register(RDFPackage.eINSTANCE);
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
		
		final RDFFormats format = options.containsKey(OPTION_RDF_FORMAT) ? 
				(RDFFormats) options.get(OPTION_RDF_FORMAT) : 
					RDFFormats.RDF_XML_FORMAT;
		
		checkFactoryIsRegistered(format);
		
		final EPackage aPackage = resource.getContents().get(0).eClass().getEPackage();
		register(aPackage);

		final Map<String, Object> atloptions = new HashMap<String, Object>();
		atloptions.put("extensionObjects", getListExtension(options));
		
		return Transformations.transform( inject(resource, get(aPackage.getNsURI()) ),
				new Transformations.Builder()
				.asm(loadASM(super_asm), loadASM(asm)).lib("RDFHelpers", loadASM(lib))
				.options(atloptions)
				.in(get(aPackage.getNsURI()), "IN", "Model")
				.out(get(RDFPackage.eNS_URI), "OUT", "RDF", RDFFormats.factory(format))
				.buildOneInOneOut()).getResource();
	}
	
	protected ASM loadASM(String location) {
		return new ASMXMLReader().read(this.getClass().getResourceAsStream(location));
	}
	
	private List<LibExtension> getListExtension(Map<String, Object> options) {
		final List<LibExtension> list = new ArrayList<LibExtension>();
		list.add(new ETripleLibExtension( options ));
		
		return list;
	}
	
	private static void checkFactoryIsRegistered(RDFFormats format) {
		if (!Registry.INSTANCE.getExtensionToFactoryMap().containsKey(format.extension())) {
			Registry.INSTANCE.getExtensionToFactoryMap().put(format.extension(), RDFFormats.factory(format));
		}
	}
	
}
