package com.ciandt.hackathon.api;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.services.ProductService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/productsApi")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class ProductsApi {

	private ProductService productService;

	@Inject
	public ProductsApi(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GET
	@Path("/products")
	public List<Product> listProducts(@Context HttpServletRequest request) {
		List<Product> listProducts = productService.listProducts();

		

		return listProducts;
	}
	
	/**
	 * 
	 */
	private List<Product> loadProduct() {
		List<Product> listProduct = new ArrayList<Product>();
		for (int i = 0; i <= 100; i++) {
			Product product = new Product();
			product.setDescription("product product product product product productproduct product productproduct product product" + i);
			product.setId((long) i);
			product.setName("product");
			product.setValue((long) (Math.random() * 1000));
			product.setValue((long) (Math.random() * 10));
			listProduct.add(product);
		}
		
		return listProduct;
	}
}