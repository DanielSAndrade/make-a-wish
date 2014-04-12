package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Greeting;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.User;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Inject;
import com.googlecode.objectify.Key;

public class ObjectfyProductDAO implements ProductDAO {

	@Inject
	private Logger log;

	@Override
	public List<Product> findProduct() {
		log.info("Finding all products");

		// checks if the greetings are in the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		@SuppressWarnings("unchecked")
		List<Product> products = (List<Product>) syncCache.get("PRODUCTS");

		if (products == null) {
			log.info("Not found in cache");
			products = ofy().load().type(Product.class).list();
		} else {
			log.info("Using cache!");
		}

		if (products != null) {
			log.info("Returning " + products.size() + " greetings");
		}
		return products;
	}

	@Override
	public Long insert(Product product) {
		log.info("Inserting a new product");

		// invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete("PRODUCTS");

		Key<Product> key = ofy().save().entity(product).now();
		return key.getId();

	}

	@Override
	public void delete(Product product) {
		log.info("Deleting a new products");
		ofy().delete().entity(product).now();
	}

	@Override
	public List<Product> findByTable(String tableName) {
	
		log.info("Finding all greetings");

		// checks if the gretings are in the cache
//		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
//		syncCache.setErrorHandler(ErrorHandlers
//				.getConsistentLogAndContinue(Level.INFO));
//		@SuppressWarnings("unchecked")
//		Table table = (Table) syncCache.get("TABLES");
		User table = null;

		if (table == null) {
			log.info("Not found in cache");
			
			List<User>  tables = ofy().load().type(User.class).filter("name", tableName).list();
			if(tables != null  && tables.size() >0 ){
				table = tables.get(0);
			}
		} 

		if (table != null) {
			log.info("table not exists");
		}
		return table.getSalesList();	
	}

}
