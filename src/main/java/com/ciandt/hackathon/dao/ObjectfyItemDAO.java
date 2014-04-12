package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Item;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectfyItemDAO implements ItemDAO {

	@Inject
	private Logger log;

	@Override
	public List<Item> findItens() {
		log.info("Finding all greetings");

		// checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));

		@SuppressWarnings("unchecked")
		List<Item> itens = (List<Item>) syncCache.get("ITEM");

		if (itens == null) {
			log.info("Not found in cache");
			itens = ofy().load().type(Item.class).list();
		} else {
			log.info("Using cache!");
		}

		if (itens != null) {
			log.info("Returning " + itens.size() + " itens");
		}
		return itens;
	}

	@Override
	public Long insert(Item item) {
		log.info("Inserting a new itens");

		// invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete("ITEM");

		Key<Item> key = ofy().save().entity(item).now();
		return key.getId();
	}

	@Override
	public void delete(Item item) {
		log.info("Deleting a new item");
		ofy().delete().entity(item).now();

	}

}
