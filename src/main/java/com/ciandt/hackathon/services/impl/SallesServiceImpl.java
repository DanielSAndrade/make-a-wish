package com.ciandt.hackathon.services.impl;

import java.util.List;

import com.ciandt.hackathon.dao.BuyDAO;
import com.ciandt.hackathon.dao.ProductDAO;
import com.ciandt.hackathon.dao.TweetyDAO;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.entity.Tweety;
import com.ciandt.hackathon.services.SallesService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

public class SallesServiceImpl implements SallesService {
	
	@Inject
	private BuyDAO buyDao;
	
	@Inject
	private ProductDAO productDao;
	
	private TweetyDAO tweetyDao;

	@Override
	public void save(String name, Product product) {
		
		//Refresh the user points
		Table t = buyDao.findTable(name);
		t.setScore(product.getWeight());
		
		buyDao.inserTable(t);
		
		//Save salle
		buyDao.insertBuy(product, name);
		
		//Publish the twitty
		
		Tweety tweety = new Tweety();
		tweety.setId((long)Long.valueOf(System.currentTimeMillis()).hashCode());
		tweety.setMessage("@" + product.getName() + " vendido à @" + name + ". Parabéns!!!");
		tweety.setTable(name);
		
		tweetyDao.insert(tweety);
		
	}

	@Override
	public List<Product> sallesByTable(String table) {
		
		return productDao.findByTable(table);
		
	}

}