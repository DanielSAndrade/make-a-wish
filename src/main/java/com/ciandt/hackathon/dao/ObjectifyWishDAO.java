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
	public List<Wish> findWishes(String table, Wish.Status status) {
		log.info("Finding wishes by table and status");
		
		//checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Wish> wishes = (List<Wish>) syncCache.get( "WISHES" );
		
		if (wishes == null) {
			log.info("Not found in cache");
			wishes = ofy().load().type(Wish.class).filter("tableName !=", table).filter("status = ", status).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (wishes != null) {
	    	log.info("Returning " + wishes.size() + " wishes");
	    }
	    return wishes;
	}
	
	
	@Override
	public List<Wish> findWishes(Wish.Status status) {
		log.info("Finding wishes by status");
		
		//checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Wish> wishes = (List<Wish>) syncCache.get( "WISHES" );
		
		if (wishes == null) {
			log.info("Not found in cache");
			//wishes = ofy().load().type(Wish.class).filter("status = ", status).list();
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
	public List<Wish> findWishes(String table) {
		log.info("Finding wishes by table");
		
		//checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Wish> wishes = (List<Wish>) syncCache.get( "WISHES" );
		
		if (wishes == null) {
			log.info("Not found in cache");
			wishes = ofy().load().type(Wish.class).filter("tableName !=", table).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (wishes != null) {
	    	log.info("Returning " + wishes.size() + " wishes");
	    }
	    return wishes;
	}
	
	@Override
	public Wish getWishAvailableById(Long wishId) {
		log.info("Finding all wishes");
		
		//checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		Wish wish = (Wish) syncCache.get( "WISHES" );
		
		if (wish == null) {
			log.info("Not found in cache");
			wish = ofy().load().type(Wish.class).filter("status != ", Wish.Status.REALIZED).filter("id =", wishId).first().now();
		} else {
			log.info("Using cache!");
		}
		
	    if (wish != null) {
	    	log.info("Returning wish " + wish );
	    }
	    return wish;
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
	
	public void markAsIntended( Wish wish ) {
		log.info("Mark as intended a wish");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "WISHES" );
		
		wish.setStatus(Wish.Status.INTENDED);
		ofy().save().entity(wish).now();
		
	}
	
	public void unmarkAsIntended( String table ) {
		log.info("Mark as intended a wish");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "WISHES" );
		
		List<Wish> wishList = findWishes(table);
		
		for (Wish wish : wishList) {
			wish.setStatus(Wish.Status.AVAILABLE);
			ofy().save().entity(wish).now();
		}
		
	}
	
	@Override
	public void delete(Wish wish) {
		log.info("Deleting a wish");
		ofy().delete().entity(wish).now();
	}
	
	public void update(Wish wish) {
		log.info("Update wish");
		ofy().save().entity(wish).now();
	}

}
