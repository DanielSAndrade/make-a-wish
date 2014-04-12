package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Donator;
import com.ciandt.hackathon.entity.Table;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyDonatorDAO implements DonatorDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Donator> findDonators() {
		log.info("Finding all donators");
		
		//checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Donator> donators = (List<Donator>) syncCache.get( "DONATOR" );
		
		if (donators == null) {
			log.info("Not found in cache");
			donators = ofy().load().type(Donator.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (donators != null) {
	    	log.info("Returning " + donators.size() + " donators");
	    }
	    return donators;
	}
	
	@Override
	public Long insert( Donator donator ) {
		log.info("Inserting a new donator");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "DONATORS" );
		
		Key<Donator> key = ofy().save().entity(donator).now();
		return key.getId();
		
	}
	
	@Override
	public void delete(Donator donator) {
		log.info("Deleting a wish");
		ofy().delete().entity(donator).now();
	}
	
	public void deleteAll() {
		List<Key<Donator>> keys = ofy().load().type(Donator.class).keys().list();
		ofy().delete().keys(keys).now();
	}

	
	public void update(Donator donator) {
		log.info("Update wish");
		ofy().save().entity(donator).now();
	}

}
