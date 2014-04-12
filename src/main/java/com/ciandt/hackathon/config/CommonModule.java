package com.ciandt.hackathon.config;

import java.util.HashMap;
import java.util.Map;

import com.ciandt.hackathon.api.CommonResource;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyGreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyVendaDAO;
import com.ciandt.hackathon.dao.VendaDAO;
import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.entity.Venda;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class CommonModule extends ServletModule {

	@Override
	protected void configureServlets() {
		
		Map<String, String> initParams = new HashMap<String, String>();
		
		bind(CommonResource.class);
		bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
		bind(VendaDAO.class).to(ObjectifyVendaDAO.class);
	
		
		filter("/api/*").through(GuiceContainer.class, initParams);
	}
}
