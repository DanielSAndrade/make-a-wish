package com.ciandt.hackathon.api;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.services.ProductService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/productsApi")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class ProductsApi {

	private final ProductService productService;

	@Inject
	public ProductsApi(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GET
	@Path("/products")
	public String listProducts(@Context HttpServletRequest request) {
		
		
		return "SUCCESS";
	}
}