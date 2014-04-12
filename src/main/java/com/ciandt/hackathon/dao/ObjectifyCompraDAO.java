package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Compra;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyCompraDAO implements CompraDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Compra> findCompras() {
		log.info("Finding all Compras");
		
		//checks if the Compras are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Compra> Compras = (List<Compra>) syncCache.get( "COMPRAS" );
		
		if (Compras == null) {
			log.info("Not found in cache");
			Compras = ofy().load().type(Compra.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (Compras != null) {
	    	log.info("Returning " + Compras.size() + " Compras");
	    }
	    return Compras;
	}
	
	@Override
	public Long insert( Compra Compra ) {
		log.info("Inserting a new Compra");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "COMPRAS" );
		
		Key<Compra> key = ofy().save().entity(Compra).now();
		return key.getId();
		
	}
	
	@Override
	public void delete(Compra Compra) {
		log.info("Deleting a new Compra");
		ofy().delete().entity(Compra).now();
	}

}
