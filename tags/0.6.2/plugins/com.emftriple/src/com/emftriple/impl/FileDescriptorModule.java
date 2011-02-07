package com.emftriple.impl;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

import com.emftriple.config.persistence.PersistenceConfig;
import com.emftriple.config.persistence.PersistencePackage;
import com.emftriple.config.persistence.util.PersistenceResourceFactoryImpl;

public class FileDescriptorModule extends ETripleModule {
	
	private static Factory factory = new PersistenceResourceFactoryImpl();
	
	public FileDescriptorModule() {
		super( getConfigFromFile() );
	}

	static {
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", factory);
		EPackage.Registry.INSTANCE.put(PersistencePackage.eNS_URI, PersistencePackage.eINSTANCE);
	}
	
	private static PersistenceConfig getConfigFromFile() {
		final ClassLoader loader = Thread.currentThread().getContextClassLoader();
		final URL fileUrl = loader.getResource("META-INF/persistence.xml");
		if (fileUrl == null) {
			throw new IllegalArgumentException("Fail to load persistence.xml from META-INF folder");
		}
		final Resource resource = factory.createResource(URI.createFileURI("persistence.xml"));
		try {
			resource.load(fileUrl.openStream(), null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return getConfiguration(resource);
	}

	private static PersistenceConfig getConfiguration(Resource resource) {
		checkIsPersistence(resource);
		
		return (PersistenceConfig) resource.getContents().get(0);
	}

	private static void checkIsPersistence(Resource resource) {
		checkNotNull(resource);
		checkArgument(resource.getContents().size() == 1);
		checkArgument(resource.getContents().get(0) instanceof PersistenceConfig);
	}

}
