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
		log.info("Finding all greetings");
		
		//checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Participante> participantes = (List<Participante>) syncCache.get( "Participante" );
		
		if (participantes == null) {
			log.info("Not found in cache");
			participantes = ofy().load().type(Participante.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (participantes != null) {
	    	log.info("Returning " + participantes.size() + " greetings");
	    }
	    return participantes;
	}
	
	@Override
	public Long insert( Participante participante ) {
		log.info("Inserting a new Participante");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "Participante" );
		
		Key<Participante> key = ofy().save().entity(participante).now();
		return key.getId();
		
	}
	
	@Override
	public void delete(Participante participante) {
		log.info("Deleting a new greeting");
		ofy().delete().entity(participante).now();
	}
	
	@Override
	public Participante find(Long id) {
		return ofy().load().type(Participante.class).id(id).now();
	}
	
	@Override
	public void update(Participante participante) {
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "Participante" );
		
		Key<Participante> key = ofy().save().entity(participante).now();
	}

}
