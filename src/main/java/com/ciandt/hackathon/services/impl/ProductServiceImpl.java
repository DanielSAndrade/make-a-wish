package com.ciandt.hackathon.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.dao.ProductDAO;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.services.ProductService;
import com.google.inject.Inject;

public class ProductServiceImpl implements ProductService {

	private String[] productName = { "Conhecer Parque Harry Porter",
			"Guitarra", "PS3", "PS4","Guitarra", "SmartPhone", "NoteBook pelo Dentinho", "Disney", "Comer um peixe beira mar", "Trabalhar na CIT" };

	@Inject
	private ProductDAO productDAO;

	@Override
	public List<Product> listProducts() {

		List<Product> listProducts = productDAO.findProduct();

		if (listProducts == null || listProducts.size() == 0) {
			listProducts = this.loadProduct();
		}

		return listProducts;
	}

	/**
	 * 
	 */
	private List<Product> loadProduct() {
		List<Product> listProducts = new ArrayList<Product>();
		for (int i = 0; i < 10; i++) {
			Product product = new Product();
			product.setDescription("Este produto faz uma crianca feliz " + productName[i]);
			product.setId((long) i);
			product.setName(productName[i]);
			product.setValue((long) (Math.random() * 1000));
			product.setWeight((long) (Math.random() * 10));
			listProducts.add(product);
		}

		return listProducts;
	}

}
