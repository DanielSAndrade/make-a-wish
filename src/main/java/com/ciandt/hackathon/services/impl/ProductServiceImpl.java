package com.ciandt.hackathon.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.dao.ProductDAO;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.services.ProductService;
import com.google.inject.Inject;


public class ProductServiceImpl implements ProductService {
	
	@Inject
	private ProductDAO productDAO;

	@Override
	public List<Product> listProducts() {
		
		List<Product> listProducts =  productDAO.findProduct();	
		
		if(listProducts == null || listProducts.size() == 0){
			listProducts = this.loadProduct();
		}
		
		
		return listProducts;
	}
	
	/**
	 * 
	 */
	private List<Product> loadProduct() {
		List<Product> listProducts =  new ArrayList<Product>();
		for (int i = 0; i <= 100; i++) {
			Product product = new Product();
			product.setDescription("product product product product product productproduct product productproduct product product" + i);
			product.setId((long) i);
			product.setName("product");
			product.setValue((long) (Math.random() * 1000));
			product.setWeight((long) (Math.random() * 10));
			listProducts.add(product);
		}
		
		return listProducts;
	}

}
