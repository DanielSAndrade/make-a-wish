package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.MesaDoacao;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyMesaDoacaoDAO implements MesaDoacaoDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<MesaDoacao> findDoacoes() {
		log.info("Finding all MesaDoacao");
		
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<MesaDoacao> doacoes = (List<MesaDoacao>) syncCache.get( "MESA_DOACAO" );
		
		if (doacoes == null) {
			log.info("Not found in cache");
			doacoes = ofy().load().type(MesaDoacao.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (doacoes != null) {
	    	log.info("Returning " + doacoes.size() + " mesa doacao");
	    }
	    return doacoes;
	}
	
	@Override
	public Long insert( MesaDoacao doacao ) {
		log.info("Inserting a new MesaDoacao");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "MESA_DOACAO" );
		
		Key<MesaDoacao> key = ofy().save().entity(doacao).now();
		return key.getId();
		
	}
	
}
