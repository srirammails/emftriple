/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emf4sw.rdfizer.atl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.atl.engine.emfvm.lib.AbstractStackFrame;
import org.eclipse.m2m.atl.engine.emfvm.lib.ExecEnv;
import org.eclipse.m2m.atl.engine.emfvm.lib.LibExtension;
import org.eclipse.m2m.atl.engine.emfvm.lib.Operation;

import com.emf4sw.rdf.operations.DatatypeConverter;
import com.emf4sw.rdfizer.impl.IDGenerator;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.5.5	
 */
public class ETripleLibExtension implements LibExtension {

	private IDGenerator generator;

	public ETripleLibExtension() {
		generator = new IDGenerator();
	}

	public ETripleLibExtension(Map<String, Object> options) {
		generator = new IDGenerator((String) options.get(Model2RDF.OPTION_BASE_NAMESPACE));
	}

	@Override
	public void apply(ExecEnv execEnv, Map<String, Object> options) {
		Operation convertToOperation = new Operation(2, "convertTo") {  
			@Override
			public Object exec(AbstractStackFrame frame) {
				Object[] localVars = frame.getLocalVars();

				if (localVars[1] instanceof String) {
					String var1 = (String) localVars[1];

					if (localVars[0] instanceof String) {
						String var2 = (String) localVars[0];
						Object ret = DatatypeConverter.convert(var1, var2);
						if (ret == null) {
							return DatatypeConverter.convert(var1, "");
						}
						return ret;
					}
				}
				return null;
			}
		};
		execEnv.registerOperation(Object.class, convertToOperation);

		Operation asStringOperation = new Operation(2, "asString") {  
			@Override
			public Object exec(AbstractStackFrame frame) {
				Object[] localVars = frame.getLocalVars();
				Object object = localVars[0]; 
				if (localVars[1] instanceof String) {
					return DatatypeConverter.toString((String) localVars[1], object);
				}				
				return localVars[1].toString();
			}
		};
		execEnv.registerOperation(Object.class, asStringOperation);

		Operation getRdfIdOperation = new Operation(1, "getRdfId") {  
			@Override
			public String exec(AbstractStackFrame frame) {
				Object[] localVars = frame.getLocalVars();
				if (localVars[0] instanceof EObject) { 
					return generator.getId((EObject)localVars[0]).toString();			
				}
				throw new IllegalArgumentException("Cannot get URI from " + localVars[0]);
			}
		};
		execEnv.registerOperation(Object.class, getRdfIdOperation);

		Operation inverse = new Operation(1, "inverse") {  
			@SuppressWarnings("unchecked")
			@Override
			public Collection<Object> exec(AbstractStackFrame frame) {
				Object[] localVars = frame.getLocalVars();
				if (localVars[0] instanceof Collection) {
					if ( ((Collection<Object>) localVars[0]).size() > 1) {
						try {
							System.out.println(localVars[0].getClass().getName());
							Collection<Object> col = (Collection<Object>) localVars[0].getClass().newInstance();
							Object[] array = ((Collection<?>)localVars[0]).toArray();
							
							int i=0;
							while (i < array.length) {
								System.out.println("add " + array[array.length - 1 - i]);
								col.add(array[array.length - 1 - i]);
								i++;
							}
							System.out.println(col);
							return col;
						} catch (InstantiationException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						}
					}

					return (Collection<Object>) localVars[0];	
				} else return null;
			}
		};
		execEnv.registerOperation(Collection.class, inverse);

		Operation split_annotation = new Operation(1, "split_annotation") {  
			@Override
			public List<String> exec(AbstractStackFrame frame) {
				Object[] localVars = frame.getLocalVars();
				if (localVars[0] instanceof String) { 
					return split_annotation((String) localVars[0]);			
				}
				throw new IllegalArgumentException("Cannot get URI from " + localVars[0]);
			}

			private List<String> split_annotation(String object) {
				List<String> list = new ArrayList<String>();
				boolean in = false;
				String tmp = "";
				for (int i=0; i < object.length(); i++)
				{
					char c = object.charAt(i);
					if (c == ','&& !in) {
						list.add(tmp);
						tmp = "";
					} else
						if (c == '(') {
							tmp = tmp + c;
							in = true;
						} else
							if (c == ')') {
								tmp = tmp + c;
								in = false;
							} else {
								tmp = tmp + c;
							}
				}
				list.add(tmp);
				return list;
			}
		};
		execEnv.registerOperation(Object.class, split_annotation);

	}


}
