package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Table;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyTableDAO implements TableDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Table> findTables() {
		log.info("Finding all tables");

		List<Table> tables = (List<Table>) ofy().load().type(Table.class).order("-points").list();
	    return tables;
	}

	@Override
	public Long insert( Table table ) {
		log.info("Inserting a new table");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "tableS" );
		
		Key<Table> key = ofy().save().entity(table).now();
		return key.getId();
		
	}
	
	@Override
	public void delete(Table table) {
		log.info("Deleting a table");
		ofy().delete().entity(table).now();
	}
	
	public void deleteAll() {
		List<Key<Table>> keys = ofy().load().type(Table.class).keys().list();
		ofy().delete().keys(keys).now();
	}

	
	public void update(Table table) {
		log.info("Update Table");
	}

}
