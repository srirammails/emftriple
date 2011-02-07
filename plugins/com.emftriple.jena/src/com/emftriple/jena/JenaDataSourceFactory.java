/**
 * Copyright (c) 2009 L3i ( http://l3i.univ-larochelle.fr ).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package com.emftriple.jena;

import static com.emftriple.util.Functions.transform;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import com.emftriple.config.persistence.DataSourceConfig;
import com.emftriple.config.persistence.Properties;
import com.emftriple.config.persistence.Property;
import com.emftriple.datasources.DataSource;
import com.emftriple.datasources.DataSourceException;
import com.emftriple.datasources.DataSourceFactory;
import com.emftriple.datasources.impl.AbstractDataSourceFactory;
import com.google.common.base.Function;
import com.google.inject.internal.Lists;
import com.google.inject.internal.Maps;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFReader;
import com.hp.hpl.jena.sdb.SDBFactory;
import com.hp.hpl.jena.sdb.Store;
import com.hp.hpl.jena.sdb.StoreDesc;
import com.hp.hpl.jena.sdb.sql.JDBC;
import com.hp.hpl.jena.sdb.sql.SDBConnection;
import com.hp.hpl.jena.sdb.store.DatabaseType;
import com.hp.hpl.jena.sdb.store.LayoutType;

/**
 * Factory class for Jena based {@link DataSource}.
 * 
 * @author <a href="mailto:g.hillairet at gmail.com">Guillaume Hillairet</a>
 *
 */
public class JenaDataSourceFactory extends AbstractDataSourceFactory implements DataSourceFactory {

	public static final String JENA_FILE_CLASS_NAME = JenaFile.class.getName();
	
	public static final String JENA_TDB_CLASS_NAME = JenaTDB.class.getName();
	
	public static final String JENA_SDB_CLASS_NAME = JenaSDB.class.getName();
	
	public static final String JENA_SERVICE_CLASS_NAME = JenaService.class.getName();
	
	private Map<DataSourceConfig, DataSource> descriptors;

	JenaDataSourceFactory() {
		descriptors = Maps.newHashMap();
	}

	@Override
	public boolean canCreate(DataSourceConfig config) {
		if (config.getClass_().equals(JENA_FILE_CLASS_NAME)) {
			return canCreateJenaFile(config);
		}
		else if (config.getClass_().equals(JENA_SDB_CLASS_NAME)) {
			return canCreateJenaSDB(config);
		}
		else if (config.getClass_().equals(JENA_TDB_CLASS_NAME)) {
			return canCreateJenaTDB(config);
		}
		else if (config.getClass_().equals(JENA_SERVICE_CLASS_NAME)) {
			return canCreateJenaService(config);
		}
		return Boolean.FALSE;
	}
	
	private boolean canCreateJenaService(DataSourceConfig config) {
		return config.getUrl() != null;
	}

	private boolean canCreateJenaTDB(DataSourceConfig config) {
		return config.getUrl() != null;
	}

	private boolean canCreateJenaSDB(DataSourceConfig config) {
		final String aDbType = getSDBType(config.getProperty());
		final String aURL = config.getUrl();
		final String aPassword = getPassword(config.getProperty());
		final String aUser = getUser(config.getProperty());
		
		return aDbType != null && aURL != null && aPassword != null && aUser != null;
	}

	private String getUser(Properties property) {
		return transform(property.getProperties(), new Find(JenaSDB.JENA_SDB_OPTION_USER));
	}

	private String getPassword(Properties property) {
		return transform(property.getProperties(), new Find(JenaSDB.JENA_SDB_OPTION_PASS));
	}

	private String getSDBType(Properties property) {
		return transform(property.getProperties(), new Find(JenaSDB.JENA_SDB_OPTION_TYPE));
	}

	private class Find implements Function<List<Property>, String> {

		private String value;

		public Find(String value) {
			this.value = value;
		}
		
		@Override
		public String apply(List<Property> from) {
			for (Property prop: from)
				if (prop.getName().equals(value))
					return prop.getValue();
			return null;
		}
		
	}
	
	private boolean canCreateJenaFile(DataSourceConfig config) {
		return config.getUrl() != null;
	}

	@Override
	public DataSource create(DataSourceConfig config) {
		return descriptors.containsKey(config) ? descriptors.get(config) : doCreate(config);
	}

	private DataSource doCreate(DataSourceConfig config) {
		DataSource dataSource = null;
		if (config.getClass_().equals(JENA_FILE_CLASS_NAME)) {
			dataSource = createJenaFile(config);
		}
		else if (config.getClass_().equals(JENA_SDB_CLASS_NAME)) {
			dataSource = createJenaSDB(config);
		}
		else if (config.getClass_().equals(JENA_TDB_CLASS_NAME)) {
			dataSource = createJenaTDB(config);
		}
		else if (config.getClass_().equals(JENA_SERVICE_CLASS_NAME)) {
			dataSource = createJenaService(config);
		}
		descriptors.put(config, dataSource);
		
		return dataSource;
	}

	private DataSource createJenaService(DataSourceConfig config) {
		return new JenaService(
				URI.createURI(config.getUrl()), 
				config.getUrl(), getGraphs(config));
	}

	private DataSource createJenaTDB(DataSourceConfig config) {
		return new JenaTDB( 
				URI.createURI(config.getUrl()),
				config.getUrl(),
				getGraphs(config) );
	}

	private DataSource createJenaSDB(DataSourceConfig config) {
		final String aDbType = getSDBType(config.getProperty());
		final String aURL = config.getUrl();
		final String aPassword = getPassword(config.getProperty());
		final String aUser = getUser(config.getProperty());

		final StoreDesc storeDesc = new StoreDesc(
				LayoutType.LayoutTripleNodesHash, 
				dbTypes.get(aDbType)) ;
		
		loadDriver( dbTypes.get(aDbType) );

		// String jdbcURL = "jdbc:derby:DB/SDB2";
		final SDBConnection conn = new SDBConnection(aURL, aUser, aPassword) ; 
		final Store store = SDBFactory.connectStore(conn, storeDesc) ;
		final List<URI> graphs = getGraphs(config);
		
		return new JenaSDB(URI.createURI(aURL), graphs, store);
	}

	private DataSource createJenaFile(DataSourceConfig config) {
		final Model model = ModelFactory.createDefaultModel();
		final File file = new File(config.getUrl());

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		String fileFormat = "RDF/XML-ABBREV";
		RDFReader reader = model.getReader();
		reader.setProperty("WARN_REDEFINITION_OF_ID","EM_IGNORE");
		try {
			reader.read(model, new FileInputStream(file), "");
		} catch (Exception e1) {
			reader = model.getReader("N3");
			reader.setProperty("WARN_REDEFINITION_OF_ID","EM_IGNORE");
			try {
				reader.read(model, new FileInputStream(file), "N3");
				fileFormat = "N3";
			} catch (Exception e2) {
				reader = model.getReader("N-TRIPLES");
				reader.setProperty("WARN_REDEFINITION_OF_ID","EM_IGNORE");
				try {
					reader.read(model, new FileInputStream(file), "N-TRIPLES");
					fileFormat = "N-TRIPLES";
				} catch (Exception e3) {
					throw new DataSourceException(e1);
				}
			}
		}

		return new JenaFile(URI.createURI(config.getUrl()), model, config.getUrl(), fileFormat);
	}

	private List<URI> getGraphs(DataSourceConfig config) {
		final List<URI> uris = Lists.newArrayList();
		for (String g: config.getGraphs()) {
			uris.add(URI.createURI(g));
		}
		return uris;
	}
	
	private static final Map<String, DatabaseType> dbTypes = new HashMap<String, DatabaseType>();

	static {
		dbTypes.put("DB2", DatabaseType.DB2);
		dbTypes.put("H2", DatabaseType.H2);
		dbTypes.put("HSQLDB", DatabaseType.HSQLDB);
		dbTypes.put("MySQL", DatabaseType.MySQL);
		dbTypes.put("Oracle", DatabaseType.Oracle);
		dbTypes.put("PostgreSQL", DatabaseType.PostgreSQL);
		dbTypes.put("SQLServer", DatabaseType.SQLServer);
		dbTypes.put("Derby", DatabaseType.Derby);
	}
	
	private void loadDriver(final DatabaseType dbType) {
		if (dbType.equals(DatabaseType.DB2)) {
			JDBC.loadDriverDB2();
		}
		else if (dbType.equals(DatabaseType.Derby)) {
			JDBC.loadDriverDerby();
		}
		else if (dbType.equals(DatabaseType.H2)) {
			JDBC.loadDriverH2();
		}
		else if (dbType.equals(DatabaseType.HSQLDB)) {
			JDBC.loadDriverHSQL();
		}
		else if (dbType.equals(DatabaseType.MySQL)) {
			JDBC.loadDriverMySQL();
		}
		else if (dbType.equals(DatabaseType.Oracle)) {
			JDBC.loadDriverOracle();
		}
		else if (dbType.equals(DatabaseType.PostgreSQL)) {
			JDBC.loadDriverPGSQL();
		}
		else if (dbType.equals(DatabaseType.SQLServer)) {
			JDBC.loadDriverSQLServer();
		}
	}

}
