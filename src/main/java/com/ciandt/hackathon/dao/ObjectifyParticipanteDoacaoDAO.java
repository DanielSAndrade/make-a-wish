package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.ParticipanteDoacao;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyParticipanteDoacaoDAO implements ParticipanteDoacaoDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<ParticipanteDoacao> findDoacoes() {
		log.info("Finding all MesaDoacao");
		
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<ParticipanteDoacao> doacoes = (List<ParticipanteDoacao>) syncCache.get( "MESA_DOACAO" );
		
		if (doacoes == null) {
			log.info("Not found in cache");
			doacoes = ofy().load().type(ParticipanteDoacao.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (doacoes != null) {
	    	log.info("Returning " + doacoes.size() + " mesa doacao");
	    }
	    return doacoes;
	}
	
	@Override
	public Long insert( ParticipanteDoacao doacao ) {
		log.info("Inserting a new MesaDoacao");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "MESA_DOACAO" );
		
		Key<ParticipanteDoacao> key = ofy().save().entity(doacao).now();
		return key.getId();
		
	}
	
}
