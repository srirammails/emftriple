package com.emftriple.query;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.NoResultException;
import javax.persistence.Parameter;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import org.eclipse.emf.common.util.URI;

import com.emf4sw.rdf.Node;
import com.emf4sw.rdf.RDFGraph;
import com.emf4sw.rdf.Resource;
import com.emftriple.datasources.IEntityDataSourceManager;
import com.emftriple.datasources.IResultSet;
import com.emftriple.datasources.IResultSet.Solution;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * 
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 * @since 0.7.0
 */
public class NativeQueryImpl implements Query {

	private String query;
	
	@SuppressWarnings("unused")
	private Map<Object, Object> properties;

	private Map<Object, Object> parameters;

	private int maxResults;

	private FlushModeType flushMode;

	private final IEntityDataSourceManager dataSourceManager;

	private Map<String, Object> hints;
	
	private final TYPE type;
	
	private enum TYPE {
		SELECT, CONSTRUCT, ASK, DESCRIBE, UPDATE;
	}
	
	public NativeQueryImpl(IEntityDataSourceManager dataSourceManager, String queryString) {
		this.dataSourceManager = dataSourceManager;
		this.query = queryString;
		this.properties = Maps.newHashMap();
		this.parameters = Maps.newHashMap();
		this.hints = Maps.newHashMap();
		this.type = typeOf(queryString);
	}
	
	private TYPE typeOf(String queryString) {
		if (queryString.contains("select") || queryString.contains("SELECT")) {
			return TYPE.SELECT;
		} else if (queryString.contains("CONSTRUCT") || queryString.contains("construct")) {
			return TYPE.CONSTRUCT;
		} else if (queryString.contains("DESCRIBE") || queryString.contains("describe")) {
			return TYPE.DESCRIBE;
		} else if (queryString.contains("ASK") || queryString.contains("ask")) {
			return TYPE.ASK;
		}
		throw new IllegalArgumentException("This kind of query is not supported");
	}

	NativeQueryImpl(IEntityDataSourceManager dataSourceManager, String queryString, Map<Object, Object> properties,
			Map<Object, Object> parameters, Map<String, Object> hints, int maxResults) {
		this.dataSourceManager = dataSourceManager;
		this.query = queryString;
		this.properties = properties;
		this.parameters = parameters;
		this.maxResults = maxResults;
		this.hints = hints;
		this.type = typeOf(queryString);
	}
	
	private IEntityDataSourceManager getDataSourceManager() {
		return dataSourceManager;
	}
	
	@Override
	public int executeUpdate() {
		return getDataSourceManager().executeUpdateQuery(query);
	}

	@Override
	public int getFirstResult() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FlushModeType getFlushMode() {
		return flushMode;
	}

	@Override
	public Map<String, Object> getHints() {
		return hints;
	}

	@Override
	public LockModeType getLockMode() {
		return LockModeType.NONE;
	}

	@Override
	public int getMaxResults() {
		return maxResults;
	}

	@Override
	public Parameter<?> getParameter(String arg0) {
		return null;
	}

	@Override
	public Parameter<?> getParameter(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Parameter<T> getParameter(String arg0, Class<T> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Parameter<T> getParameter(int arg0, Class<T> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getParameterValue(Parameter<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParameterValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParameterValue(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Parameter<?>> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getResultList() {
		if (type.equals(TYPE.SELECT))
		{
			return doExecuteSelectQuery(query);
		}
		else if (type.equals(TYPE.CONSTRUCT)) 
		{
			final List<? extends Node> subjects = doExecuteConstructQuery(query);
			
			return subjects == null ? Lists.newArrayList() : getDataSourceManager().findNodes(subjects);	
		}
		else
		{
			return Lists.newArrayList();
		}
	}

	@Override
	public Object getSingleResult() {
		final List<?> results = getResultList();

		if (results == null || results.isEmpty()) {
			throw new NoResultException();
		}

//		if (results.size() > 1) {
//			throw new NonUniqueResultException();
//		}

		return results.get(0);
	}

	@Override
	public boolean isBound(Parameter<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Query setFirstResult(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query setFlushMode(FlushModeType flushMode) {
		this.flushMode = flushMode;
		return this;
	}

	@Override
	public Query setHint(String arg0, Object arg1) {
		this.hints.put(arg0, arg1);
		return this;
	}

	@Override
	public Query setLockMode(LockModeType arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query setMaxResults(int arg0) {
		this.maxResults = arg0;
		return this;
	}

	@Override
	public <T> Query setParameter(Parameter<T> arg0, T arg1) {
		this.parameters.put(arg0, arg1);
		return this;
	}

	@Override
	public Query setParameter(String arg0, Object arg1) {
		this.parameters.put(arg0, arg1);
		return this;
	}

	@Override
	public Query setParameter(int arg0, Object arg1) {
		this.parameters.put(arg0, arg1);
		return this;
	}

	@Override
	public Query setParameter(Parameter<Calendar> arg0, Calendar arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query setParameter(Parameter<Date> arg0, Date arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query setParameter(String arg0, Calendar arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query setParameter(String arg0, Date arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query setParameter(int arg0, Calendar arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query setParameter(int arg0, Date arg1, TemporalType arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<? extends Node> doExecuteConstructQuery(String query) {
		final String queryFinal = finalize(query, parameters, maxResults);
		final RDFGraph resultGraph = getDataSourceManager().executeConctructQuery(queryFinal);

		if (resultGraph == null || resultGraph.getTriples().isEmpty()) 
		{
			return null;
		}

		return resultGraph.listSubjects();
	}
	
	private List<?> doExecuteSelectQuery(String query) {
		final List<Object> list = Lists.newArrayList();
		final String queryFinal = finalize(query, parameters, maxResults);
		final IResultSet resultSet = getDataSourceManager().executeSelectQuery(queryFinal);

		if (resultSet == null)
			return list;
		
		for (;resultSet.hasNext();) 
		{
			final Solution sol = resultSet.next();
			for (String var: resultSet.getVarNames()) 
			{

				if (sol.isResource(var)) {
					final Resource res = sol.getResource(var);
					final Object obj = getDataSourceManager().findNode(URI.createURI(res.getURI()));
					if (obj != null) 
					{
						list.add(obj);
					}
				}
			}
		}

		return list;
	}

	private static String assignParameters(String queryString, Map<Object, Object> parameters) {
		for (Object param: parameters.keySet())
		{
			queryString = queryString.replaceAll("\\?:" + param, "\"" + parameters.get(param).toString() + "\"");
		}
		
		return queryString;
	}

	public static String finalize(String query, Map<Object, Object> parameters, int maxResults) {
		String queryString = query;
		if (!parameters.keySet().isEmpty())
		{
			queryString = assignParameters(query, parameters);	
		}
		if (maxResults != 0)
		{
			queryString = queryString == null ? query : queryString;
			queryString = queryString + " LIMIT " + maxResults;
		}
		
		return queryString;
	}
}
