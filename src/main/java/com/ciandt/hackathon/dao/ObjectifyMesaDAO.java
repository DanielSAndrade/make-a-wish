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
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Mesa> mesa = (List<Mesa>) syncCache.get("MESA");

		if (mesa == null) {
			log.info("Not found in cache");
			mesa = ofy().load().type(Mesa.class).list();
		} else {
			log.info("Using cache!");
		}

		if (mesa != null) {
			log.info("Returning " + mesa.size() + " mesa");
		}
		return mesa;
	}

	@Override
	public Mesa find(Long id) {
		log.info("Finding Mesa");

		Mesa mesa = ofy().load().type(Mesa.class).id(id).now();

		if (mesa != null) {
			log.info("Returning mesa [" + mesa.getNome() + "]");
		}
		return mesa;
	}

	@Override
	public Long insert(Mesa mesa) {
		log.info("Inserting a new Mesa");

		// invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete("MESA");

		Key<Mesa> key = ofy().save().entity(mesa).now();
		return key.getId();

	}

}
