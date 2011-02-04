/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple;

import static com.emftriple.util.Functions.transform;

import java.util.Arrays;

import javax.persistence.spi.PersistenceProvider;

import org.eclipse.emf.ecore.resource.Resource;

import com.emftriple.config.persistence.PersistenceMetaData;
import com.emftriple.impl.ETripleModule;
import com.emftriple.impl.FileDescriptorModule;
import com.emftriple.resource.ETripleResourceSet;
import com.emftriple.util.Functions;
import com.google.common.base.Function;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * 
 * ETriple
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.6.0
 */
public class ETriple {

	private static Injector injector;

	private static boolean initialized = false;

	private static ETriple INSTANCE;

	private static PersistenceMetaData configuration;
	
	private static Module[] modules;

	private ETriple() {
	}

	static {
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put("emftriple", new ETripleResourceSet());
	}
	
	public static ETriple getInstance() {
		if (INSTANCE == null) {
			if (!initialized) {
				ETriple.init(new FileDescriptorModule());
			} else {
				Module[] copy = Arrays.copyOf(modules, modules.length + 1);
				copy[copy.length - 1] = new FileDescriptorModule();
				ETriple.modules = copy;
			}
			injector = Guice.createInjector( modules );
			INSTANCE = new ETriple();
		}
		return INSTANCE;
	}

	public static synchronized void init(Module... modules) {
		if (initialized)
			return;
		
		ETriple.modules = modules;
		initialized = true;
	}
	
	public static synchronized void init(PersistenceMetaData config, Module... modules) {
		if (initialized)
			return;
		
		ETriple.configuration = config;
		ETriple.modules = modules;
		
		if (null == transform(ETripleModule.class, new ModuleFinder())) {
			Module[] copy = Arrays.copyOf(modules, modules.length + 1);
			copy[copy.length - 1] = new ETripleModule(configuration);
			ETriple.modules = copy;
		}

		initialized = true;
	}

	public PersistenceProvider getPersistenceProvider() {
		return injector.getInstance(PersistenceProvider.class);
	}

	public <T> T instance(Class<T> aClass) {
		return injector.getInstance(aClass);
	}

	private static class ModuleFinder implements Function<Class<? extends Module>, Module> {

		public ModuleFinder() {}

		@Override
		public Module apply(Class<? extends Module> aClass) {
			for (Module module: modules) {
				if (aClass.isInstance(module)) {
					return module;
				}
			}
			return null;
		}
	}

	public static Module get(Class<? extends Module> aClass) {
		return Functions.transform(aClass, new ETriple.ModuleFinder());
	}
}
