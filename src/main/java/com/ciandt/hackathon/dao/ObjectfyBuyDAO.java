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
import com.google.inject.Singleton;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;

@Singleton
public class ObjectfyBuyDAO implements BuyDAO {

	@Inject
	private Logger log;

	@Override
	public Long insertBuy(Product product, String tableName) {
		log.info("Inserting a new greeting");

		// find table
		User table = this.findTable(tableName);
		if(table == null){
			this.inserTable(table);
		}

		// invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete("TABLES");

		Key<User> key = ofy().save().entity(table).now();
		return key.getId();

	}

	@Override
	public User findTable(String tableName) {
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
		return table;
	}

	@Override
	public Long inserTable(User table) {
		log.info("Inserting a table");		

		// invalidates the cache
		MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
		syncCache.setErrorHandler(ErrorHandlers
				.getConsistentLogAndContinue(Level.INFO));
		syncCache.delete("TABLES");
		
		Key<User> key = ofy().save().entity(table).now();
		return key.getId();
	}

}
