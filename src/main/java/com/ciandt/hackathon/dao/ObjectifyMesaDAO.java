package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Mesa;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyMesaDAO implements MesaDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Mesa> findMesas() {
		log.info("Finding all Mesa");
		
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Mesa> doacoes = (List<Mesa>) syncCache.get( "MESA" );
		
		if (doacoes == null) {
			log.info("Not found in cache");
			doacoes = ofy().load().type(Mesa.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (doacoes != null) {
	    	log.info("Returning " + doacoes.size() + " mesa");
	    }
	    return doacoes;
	}
	
	@Override
	public Long insert( Mesa mesa ) {
		log.info("Inserting a new Mesa");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "MESA" );
		
		Key<Mesa> key = ofy().save().entity(mesa).now();
		return key.getId();
		
	}
	
}
