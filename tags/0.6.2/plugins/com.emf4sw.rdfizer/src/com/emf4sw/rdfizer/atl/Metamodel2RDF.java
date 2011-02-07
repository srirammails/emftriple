package com.emf4sw.rdfizer.atl;

import static com.atl.common.models.Models.get;
import static com.atl.common.models.Models.inject;
import static com.atl.common.models.Models.register;
import static com.atl.common.utils.Preconditions.checkArgument;
import static com.atl.common.utils.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.m2m.atl.engine.emfvm.ASM;
import org.eclipse.m2m.atl.engine.emfvm.ASMXMLReader;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;

import com.atl.common.models.Models;
import com.atl.common.trans.Transformations;
import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.resource.RDFFormats;

public class Metamodel2RDF {
	
	private static final String asm = "resources/Metamodel2RDF.asm";
	
	private static final String super_asm = "resources/RDF.asm";
	
	private static final String lib = "resources/RDFHelpers.asm";
	
	public static final String OPTION_RDF_FORMAT = "OPTION_RDF_FORMAT";
	
	public Metamodel2RDF() {
		register(RDFPackage.eINSTANCE);
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
		
//		final EPackage aPackage = resource.getContents().get(0).eClass().getEPackage();
//		register(aPackage);

		final Map<String, Object> atloptions = new HashMap<String, Object>();
		atloptions.put("extensionObjects", getListExtension(options));
		
		return Transformations.transform( inject(resource, Models.ecore() ),
				new Transformations.Builder()
				.asm(loadASM(super_asm), loadASM(asm))
				.lib("RDFHelpers", loadASM(lib))
				.options(atloptions)
				.in(Models.ecore(), "IN", "Model")
				.out(get(RDFPackage.eNS_URI), "OUT", "RDF", format.factory())
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
			Registry.INSTANCE.getExtensionToFactoryMap().put(format.extension(), format.factory());
		}
	}
}
