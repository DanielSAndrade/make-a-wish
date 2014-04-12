package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.services.SallesService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/sallesApi")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class SallesApi {

	private final SallesService sallesService;

	@Inject
	public SallesApi(SallesService sallesService) {
		super();
		this.sallesService = sallesService;
	}

	@GET
	@Path("/salle")
	public String listGreetings(@Context HttpServletRequest request) {
		
		String table = request.getParameter("table");
		
		Product product = new Product();
		product.setDescription(request.getParameter("description"));
		product.setId(Long.valueOf(request.getParameter("id")));
		product.setName(request.getParameter("name"));
		product.setValue(Long.valueOf(request.getParameter("value")));
		product.setWeight(Long.valueOf(request.getParameter("weight")));
		
		sallesService.save(table, product);
		
		return "SUCCESS";
	}

	@GET
	@Path("/productsByTable")
	public List<Product> productsByTable(@Context HttpServletRequest request) {
		
		return sallesService.sallesByTable(request.getParameter("table"));
		
	}
	
}