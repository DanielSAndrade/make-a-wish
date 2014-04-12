package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Produto;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;

@Singleton
public class ObjectifyProdutoDAO implements ProdutoDAO {
	
	@Inject
	private Logger log;
	
	@Override
	public List<Produto> findProdutos() {
		log.info("Finding all produtos");
		
		//checks if the Compras are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Produto> produtos = (List<Produto>) syncCache.get( "Produtos" );
		
		if (produtos == null) {
			log.info("Not found in cache");
			produtos = ofy().load().type(Produto.class).list();
		} else {
			log.info("Using cache!");
		}
		
	    if (produtos != null) {
	    	log.info("Returning " + produtos.size() + " Produtos");
	    }
	    return produtos;
	}
	
	@Override
	public Long insert( Produto produtos ) {
		log.info("Inserting a new produtos");
		
		//invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete( "Produtos" );
		
		Key<Produto> key = ofy().save().entity(produtos).now();
		return key.getId();
		
	}
	
	@Override
	public void delete(Produto protudo) {
		log.info("Deleting a new produto");
		ofy().delete().entity(protudo).now();
	}

}
