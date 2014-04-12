package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Wish;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyWishDAO implements WishDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Wish> findWishes() {
		log.info("Finding all wishes");
		
		//checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Wish> wishes = (List<Wish>) syncCache.get( "WISHES" );
		
		if (wishes == null) {
			log.info("Not found in cache");
			wishes = ofy().load().type(Wish.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (wishes != null) {
	    	log.info("Returning " + wishes.size() + " wishes");
	    }
	    return wishes;
	}
	
	@Override
	public Long insert( Wish wish ) {
		log.info("Inserting a new wish");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "WISHES" );
		
		Key<Wish> key = ofy().save().entity(wish).now();
		return key.getId();
		
	}
	
	@Override
	public void delete(Wish wish) {
		log.info("Deleting a wish");
		ofy().delete().entity(wish).now();
	}
	
	public void update(Wish wish) {
		log.info("Update wish");
	}

}
