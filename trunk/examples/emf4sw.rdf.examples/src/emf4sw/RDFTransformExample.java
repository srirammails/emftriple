package emf4sw;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.atl.common.models.Models;
import com.emf4sw.rdf.resource.RDFFormats;
import com.emf4sw.rdf.resource.impl.TTLResourceFactory;
import com.emf4sw.rdf.transform.Model2RDF;
import com.emf4sw.rdf.transform.RDF2Model;
import com.emf4sw.rdf.transform.RDFTransformation;

import emf4sw.network.NetworkFactory;
import emf4sw.network.NetworkPackage;
import emf4sw.network.Person;
import emf4sw.network.SocialNetwork;

/**
 * This is a simple example that demonstrates the use of transformations between Ecore and RDF.
 * 
 */
public class RDFTransformExample {
	public static void main(String[] args) throws IOException {
		// Register Resource Factories
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ttl", new TTLResourceFactory());

		// Register Metamodel
		Models.register(NetworkPackage.eINSTANCE);
		
		// Create EObjects
		SocialNetwork s = NetworkFactory.eINSTANCE.createSocialNetwork();
		s.setName("sc");
		
		Person p1 = NetworkFactory.eINSTANCE.createPerson();
		p1.setFirstName("John");
		p1.setLastName("Smith");
		p1.setId(1);

		Person p2 = NetworkFactory.eINSTANCE.createPerson();
		p2.setFirstName("Paul");
		p2.setLastName("Robert");
		p2.setId(2);
		p2.getKnows().add(p1);
		
		s.getMembers().add(p1);
		s.getMembers().add(p2);
		
		// Add root object to the resource
		Resource resource = new XMIResourceImpl();
		resource.getContents().add(s);

		Map<String, Object> options = new HashMap<String, Object>();
		options.put(RDFTransformation.OPTION_RDF_FORMAT, RDFFormats.TURTLE_FORMAT);
		// Execute Model2RDF
		Model2RDF m2r = new Model2RDF();
		Resource rdf = m2r.transform(resource, options);
		                
		// Save output RDF
		rdf.setURI(URI.createURI("out/model.ttl"));
		rdf.save(null);
		
		// Execute RDF2Model
		RDF2Model r2m = new RDF2Model(NetworkPackage.eINSTANCE);
		Resource model = r2m.transform(rdf);
		
		// Save output XMI
		model.setURI(URI.createURI("out/model.xmi"));
		model.save(null);
	}
}
