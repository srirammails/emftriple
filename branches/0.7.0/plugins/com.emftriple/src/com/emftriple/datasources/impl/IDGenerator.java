package com.emftriple.datasources.impl;

import static com.emftriple.util.EntityUtil.getETripleAnnotation;
import static com.emftriple.util.Functions.transform;

import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.emftriple.resource.ETripleObject;
import com.emftriple.util.EntityUtil;
import com.google.common.base.Function;

final class IDGenerator {
	
//	private static final String TYPE = "type";

	private static final String ID = "Id";

	public static final String BASE = "base";

//	private static final String GENERATED_ID = "GeneratedId";

	private static final String COMPOSITE_ID = "CompositeId";
	
	public static URI getId(Object object) {
		EntityUtil.checkState(object);
		
		return getId((EObject)object);
	}
	
	/**
	 * Return the value of object id.
	 */
	public static URI getId(EObject object) {
		if (object instanceof ETripleObject) {
			return ((ETripleObject)object).eGetURI();
		}
		
		EAttribute attrId = EntityUtil.getId(object.eClass());
		if (isURI(attrId)) {
			return EntityUtil.URI(valueOf(object, attrId));
		} else {
			return EntityUtil.URI(processId(object, attrId));
		} 
	}

	private static boolean isURI(final EAttribute id) {
		return (id != null && id.getName() != null) ? id.getName().equals("URI") : false;
	}

	/**
	 * Return the value of object id.
	 */
	private static String processId(EObject object, EAttribute id) throws IllegalArgumentException {
		String value = null;

		if (id == null) 
		{
			if (getETripleAnnotation(object.eClass(), COMPOSITE_ID) != null) 
			{
				return processCompositeId(object);
			} 
			else
			{
				throw new IllegalArgumentException("Object of type " + object.eClass() + " must declare an Id attribute");
			}
		}

		final EAnnotation eAnnotation = EntityUtil.getETripleAnnotation(id, ID);
		final Boolean annotatedId = eAnnotation != null;
		final Boolean hasBase = annotatedId ? eAnnotation.getDetails().containsKey(BASE) : false;

//		final Boolean hasType = annotatedId ? eAnnotation.getDetails().containsKey(TYPE) : false;
		final Boolean conExpr = hasBase ? containsExpr(eAnnotation) : false;

		if (!annotatedId) {
			value = EntityUtil.namespace(object) + valueOf(object, id).toString();
		}

		if (hasBase) 
		{
			final String base;
			if (conExpr) 
			{
				base = transform(eAnnotation.getDetails().get(BASE), new IdParser(object, object.eClass()));
			} 
			else 
			{
				base = eAnnotation.getDetails().get(BASE);
			}
//			if (hasType)
//			{
//				if (eAnnotation.getDetails().get(TYPE).equals(GENERATED_ID)) {
//					
//				}
//			} else {
				Object val = valueOf(object, id);
				value = val == null ? null : 
					transform(base + val.toString(), new EntityUtil.URIValidator());
//			}
		}

		return value; // == null ? processGeneratedId(object) : value;
	}

	private static Object valueOf(EObject object, EAttribute attr) { 
		return object.eGet(attr); 
	}

//	private static Map<EClass, Long> generatedIds;
	
//	private static Map<EClass, Long> getGeneratedIds() {
//		if (generatedIds == null) {
//			generatedIds = new HashMap<EClass, Long>();
//		}
//		return generatedIds;
//	}
	
	public static String processCompositeId(EObject object) {
		final String namespace;
		
		if (EntityUtil.getETripleAnnotation(object.eClass(), COMPOSITE_ID).getDetails().containsKey(BASE)) 
		{
			namespace = EntityUtil.getETripleAnnotation(object.eClass(), COMPOSITE_ID).getDetails().get(BASE);
		} 
		else
		{
			namespace = EntityUtil.namespace(object);
		}
		
		return new IdParser(object, object.eClass()).apply(namespace);
	}
	
//	public static String processGeneratedId(EObject object) {
//		String value = null;
//		final String namespace;
//
//		if (EntityUtil.getETripleAnnotation(object.eClass(), GENERATED_ID) != null &&
//				EntityUtil.getETripleAnnotation(object.eClass(), GENERATED_ID).getDetails().containsKey(BASE)) 
//		{
//				namespace = EntityUtil.getETripleAnnotation(object.eClass(), GENERATED_ID).getDetails().get(BASE);
//		} 
//		else 
//		{
//			namespace = EntityUtil.namespace(object);
//		}
//
//		if (getGeneratedIds().containsKey(object.eClass())) 
//		{
//			final Long number = getGeneratedIds().get(object.eClass()) + 1;
//			value = namespace + number.toString();
//			getGeneratedIds().put(object.eClass(), number);
//		} 
//		else 
//		{
//			final Long number = 1l;
//			value = namespace + number.toString();
//			getGeneratedIds().put(object.eClass(), number);
//		}
//
//		return value;
//	}

	private static boolean containsExpr(EAnnotation eAnnotation) {
		return eAnnotation.getDetails().containsKey(BASE) ? 
				eAnnotation.getDetails().get(BASE).indexOf("[") > -1 : false;
	}

	private static class IdParser implements Function<String, String> {
		final EClass eClass;
		private EObject eObject;
		final String[] properties;
		
		IdParser(EObject eObject, EClass eClass) {
			this.eClass = eClass;
			this.eObject = eObject;
			this.properties = properties(eClass);
		}
		
		String[] properties(EClass eClass) {
			String[] props = new String[20];
			int i = 0;
			for (EStructuralFeature feature: eClass.getEAllStructuralFeatures())
			{
				if (i < props.length) {
					props[i++] = feature.getName();
				}
			}
			return props;
		}
		
		@Override
		public String apply(String from) {
			Pattern pattern = Pattern.compile("\\[");
			
			if (pattern.matcher(from).find()) 
			{
				for (String str: properties)
				{
					if (str != null) 
					{
						pattern = Pattern.compile("\\[" + str + "\\]");
						if (pattern.matcher(from).find())
						{
							from = from.replaceAll("\\[" + str + "\\]", 
									eObject.eGet(eClass.getEStructuralFeature(str)).toString().toLowerCase());		
						}
						else
						{
							pattern = Pattern.compile("\\[" + str.toLowerCase() + "\\]");
							if (pattern.matcher(from).find())
							{
								from = from.replaceAll("\\[" + str.toLowerCase() + "\\]", 
										eObject.eGet(eClass.getEStructuralFeature(str)).toString().toLowerCase());
							}
						}
					}
				}
				from = from.replaceAll("\\[Class\\]", eClass.getName().toLowerCase());
			}
			
			return from;
		}
	}

}