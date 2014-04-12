package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Sonho;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifySonhoDAO implements SonhoDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Sonho> findSonhos() {
		log.info("Finding all Sonho");
		
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Sonho> sonhos = (List<Sonho>) syncCache.get( "SONHOS" );
		
		if (sonhos == null) {
			log.info("Not found in cache");
			sonhos = ofy().load().type(Sonho.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (sonhos != null) {
	    	log.info("Returning " + sonhos.size() + " tipo doacao");
	    }
	    return sonhos;
	}
	
	@Override
	public Long insert( Sonho sonho ) {
		log.info("Inserting a new Sonho");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "SONHOS" );
		
		Key<Sonho> key = ofy().save().entity(sonho).now();
		return key.getId();
		
	}
	
}
