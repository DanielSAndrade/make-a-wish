package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.TipoDoacao;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyTipoDoacaoDAO implements TipoDoacaoDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<TipoDoacao> findTipoDoacoes() {
		log.info("Finding all TipoDoacao");
		
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<TipoDoacao> doacoes = (List<TipoDoacao>) syncCache.get( "TIPO_DOACAO" );
		
		if (doacoes == null) {
			log.info("Not found in cache");
			doacoes = ofy().load().type(TipoDoacao.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (doacoes != null) {
	    	log.info("Returning " + doacoes.size() + " tipo doacao");
	    }
	    return doacoes;
	}
	

	@Override
	public TipoDoacao find(Long id) {
		log.info("Finding TipoDoacao");

		TipoDoacao tipoDoacao = ofy().load().type(TipoDoacao.class).id(id).now();

		if (tipoDoacao != null) {
			log.info("Returning tipo doacao [" + tipoDoacao.getNome() + "]");
		}
		return tipoDoacao;
	}


	@Override
	public Long insert( TipoDoacao doacao ) {
		log.info("Inserting a new TipoDoacao");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "TIPO_DOACAO" );
		
		Key<TipoDoacao> key = ofy().save().entity(doacao).now();
		return key.getId();
		
	}
	
}
