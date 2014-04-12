package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Participante;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyParticipanteDAO implements ParticipanteDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Participante> findParticipantes() {
		log.info("Finding all Participante");
		
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Participante> doacoes = (List<Participante>) syncCache.get( "PARTICIPANTE" );
		
		if (doacoes == null) {
			log.info("Not found in cache");
			doacoes = ofy().load().type(Participante.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (doacoes != null) {
	    	log.info("Returning " + doacoes.size() + " participante");
	    }
	    return doacoes;
	}
	
	@Override
	public Long insert( Participante participante ) {
		log.info("Inserting a new Participante");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "PARTICIPANTE" );
		
		Key<Participante> key = ofy().save().entity(participante).now();
		return key.getId();
		
	}
	
}
