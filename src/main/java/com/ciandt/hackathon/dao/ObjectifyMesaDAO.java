package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Participante;
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
		log.info("Finding all greetings");
		
		//checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Mesa> mesas= (List<Mesa>) syncCache.get( "Mesa" );
		
		if (mesas == null) {
			log.info("Not found in cache");
			mesas = ofy().load().type(Mesa.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (mesas != null) {
	    	log.info("Returning " + mesas.size() + " greetings");
	    }
	    return mesas;
	}
	
	@Override
	public Long insert( Mesa mesa ) {
		log.info("Inserting a new Mesa");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "Participante" );
		
		Key<Mesa> key = ofy().save().entity(mesa).now();
		return key.getId();
		
	}
	
	@Override
	public void delete(Mesa mesa) {
		log.info("Deleting a new mesa");
		ofy().delete().entity(mesa).now();
	}

	@Override
	public Mesa find(Long idMesa) {		
		return  ofy().load().type(Mesa.class).id(idMesa).now();
	}

}
