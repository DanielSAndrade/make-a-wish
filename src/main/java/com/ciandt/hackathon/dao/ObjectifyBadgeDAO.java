package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Badge;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyBadgeDAO implements BadgeDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Badge> findBadges() {
		log.info("Finding all badges");
		
		//checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Badge> badges = (List<Badge>) syncCache.get( "BADGES" );
		
		if (badges == null) {
			log.info("Not found in cache");
			badges = ofy().load().type(Badge.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (badges != null) {
	    	log.info("Returning " + badges.size() + " badges");
	    }
	    return badges;
	}
	
	@Override
	public Long insert( Badge badge ) {
		log.info("Inserting a new badge");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "BADGES" );
		
		Key<Badge> key = ofy().save().entity(badge).now();
		return key.getId();
		
	}
	
	@Override
	public void delete(Badge badge) {
		log.info("Deleting a new badge");
		ofy().delete().entity(badge).now();
	}

}
