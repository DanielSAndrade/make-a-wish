package com.ciandt.hackathon.services.impl;

import java.util.List;

import com.ciandt.hackathon.dao.ProductDAO;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.services.ProductService;


public class ProductServiceImpl implements ProductService {
	
	
	private ProductDAO productDAO;

	@Override
	public List<Product> listProducts() {
		
		List<Product> listProducts =  productDAO.findProduct();	
		
		if(listProducts == null || listProducts.size() == 0){
			this.loadProduct();
		}
		
		
		return listProducts;
	}
	
	/**
	 * 
	 */
	private void loadProduct() {
		for (int i = 0; i <= 100; i++) {
			Product product = new Product();
			product.setDescription("product product product product product productproduct product productproduct product product" + i);
			product.setId((long) i);
			product.setName("product");
			product.setValue((long) (Math.random() * 1000));
			product.setValue((long) (Math.random() * 10));
			productDAO.insert(product);

		}
	}

}
