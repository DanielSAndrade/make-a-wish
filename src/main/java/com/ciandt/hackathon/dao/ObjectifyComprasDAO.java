package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Compras;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyComprasDAO implements ComprasDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Compras> findCompras() {
		log.info("Finding all compras");
		
		//checks if the compras are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Compras> compras = (List<Compras>) syncCache.get("COMPRAS");
		
		if (compras == null) {
			log.info("Not found in cache");
			compras = ofy().load().type(Compras.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (compras != null) {
	    	log.info("Returning " + compras.size() + " compras");
	    }
	    return compras;
	}
	
	@Override
	public Long insert( Compras compras ) {
		log.info("Inserting a new compras");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "COMPRAS" );
		
		Key<Compras> key = ofy().save().entity(compras).now();
		return key.getId();
		
	}
	
	@Override
	public void delete(Compras compras) {
		log.info("Deleting a new compras");
		ofy().delete().entity(compras).now();
	}

}
