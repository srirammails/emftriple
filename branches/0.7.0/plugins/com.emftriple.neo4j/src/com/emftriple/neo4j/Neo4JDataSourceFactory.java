package com.emftriple.neo4j;

import java.io.File;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.index.lucene.LuceneIndexService;
import org.neo4j.kernel.EmbeddedGraphDatabase;
import org.neo4j.rdf.fulltext.FulltextIndex;
import org.neo4j.rdf.fulltext.SimpleFulltextIndex;
import org.neo4j.rdf.store.RdfStore;
import org.neo4j.rdf.store.VerboseQuadStore;

import com.emftriple.config.persistence.DataSourceBuilder;
import com.emftriple.datasources.IDataSource;
import com.emftriple.datasources.IDataSourceFactory;

public class Neo4JDataSourceFactory implements IDataSourceFactory {
	
	@Override
	public boolean canCreate(DataSourceBuilder descriptor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IDataSource create(DataSourceBuilder descriptor) {
		GraphDatabaseService graphDb = new EmbeddedGraphDatabase( "target/var/examples" );
		LuceneIndexService indexService = new LuceneIndexService( graphDb );
		FulltextIndex fulltextIndex = new SimpleFulltextIndex( graphDb,
		        new File( "target/var/examples/fulltext-index" ) );
		RdfStore store = new VerboseQuadStore( graphDb, indexService, null, fulltextIndex );
		
		return new Neo4JDataStore("", store);
	}
	
}
