package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.Product;
import com.google.inject.Singleton;

@Singleton
public class ObjectifyProductDAO implements ProductDAO {
	
	@Override
	public List<Product> findAllProducts() {
		return ofy().load().type(Product.class).list();
	}

	@Override
	public void insert(Product product) {
		ofy().save().entities(product);
	}

	@Override
	public Product findById(Long id) {
		return (Product) ofy().load().filterKey(id);
	}

	@Override
	public void deleteAll() {
		ofy().delete().entities(findAllProducts());
	}
	
	
}
