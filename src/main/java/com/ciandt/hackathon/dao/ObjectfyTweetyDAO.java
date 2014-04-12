package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Tweety;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.googlecode.objectify.Key;

public class ObjectfyTweetyDAO implements TweetyDAO {

	@Inject
	private Logger log;

	@Override
	public Long insert(Tweety tweety) {

		log.info("Inserting a new Tweety");

		// invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete("TWEETIES");

		Key<Tweety> key = ofy().save().entity(tweety).now();
		return key.getId();
	}

	@Override
	public void delete(Tweety tweety) {
		log.info("Deleting a new Tweety");
		ofy().delete().entity(tweety).now();
	}

	@Override
	public List<Tweety> findTweety() {
		log.info("Finding all tweety");

		// checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Tweety> tweeties = (List<Tweety>) syncCache.get("TWEETIES");

		if (tweeties == null) {
			log.info("Not found in cache");
			tweeties = ofy().load().type(Tweety.class).list();
		} else {
			log.info("Using cache!");
		}

		if (tweeties != null) {
			log.info("Returning " + tweeties.size() + " tweeties");
		}
		return tweeties;
	}

}
