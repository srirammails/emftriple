package com.emf4sw.rdf.transform;

import static com.atl.common.models.Models.register;

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

import com.emf4sw.rdf.RDFPackage;
import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdf.transform.lib.ETripleLibExtension;

/**
 * 
 * 
 * @author <a href=g.hillairet@gmail.com>guillaume hillairet</a>
 * @since 0.7.0
 */
public abstract class AbstractTransformation {
	
	protected AbstractTransformation() {
		register( RDFPackage.eINSTANCE );
	}
	
	/**
	 * ATL Files
	 */
	protected static final String super_asm = "resources/RDF.asm";
	protected static final String lib = "resources/RDFHelpers.asm";
	
	/**
	 * 
	 */
	public static final String OPTION_RDF_FORMAT = "OPTION_RDF_FORMAT";
	
	/**
	 * 
	 */
	public static final String OPTION_BASE_NAMESPACE = "OPTION_BASE_NAMESPACE";
	
	/**
	 * 
	 */
	public static final String OPTION_DIRECT_TYPE_ONLY = "OPTION_DIRECT_TYPE_ONLY";
	
	/**
	 * 
	 */
	public static final String OPTION_NO_ECORE_TYPE = "OPTION_NO_ECORE_TYPE";
	
	protected EPackage registerAndGetPackage(Resource resource) {
		final EPackage ePackage = resource.getContents().get(0).eClass().getEPackage();
		register(ePackage);
		
		return ePackage;
	}
	
	protected Map<String, Object> atloptions() {
		final List<LibExtension> list = new ArrayList<LibExtension>();
		list.add(new ETripleLibExtension());
		
		final Map<String, Object> atloptions = new HashMap<String, Object>();
		atloptions.put("extensionObjects", list);
		
		return atloptions;
	}
	
	protected ASM loadASM(String location) {
		return new ASMXMLReader().read(this.getClass().getResourceAsStream(location));
	}
		
	protected static void checkFactoryIsRegistered(RDFFormats format) {
		if (!Registry.INSTANCE.getExtensionToFactoryMap().containsKey(format.extension())) {
			Registry.INSTANCE.getExtensionToFactoryMap().put(format.extension(), RDFFormats.factory(format));
		}
	}
}
