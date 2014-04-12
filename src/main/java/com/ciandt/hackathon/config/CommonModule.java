package com.ciandt.hackathon.config;

import java.util.HashMap;
import java.util.Map;

import com.ciandt.hackathon.api.CommonResource;
import com.ciandt.hackathon.api.VendaResource;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyGreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyProdutoDAO;
import com.ciandt.hackathon.dao.ObjectifyVendaDAO;
import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.dao.VendaDAO;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class CommonModule extends ServletModule {

	@Override
	protected void configureServlets() {
		
		Map<String, String> initParams = new HashMap<String, String>();
		
		initParams
		.put(GuiceContainer.PROPERTY_WEB_PAGE_CONTENT_REGEX,

				"(/(_ah|appstats|mapreduce)/?.*)|(/.*\\.jsp)|(/WEB-INF/.*\\.jsp)|(/favicon\\.ico)");
		
//		filter("/api/*").through(GuiceContainer.class, initParams);
		filterRegex("/(?!_ah).*").through(GuiceContainer.class, initParams);
		bind(CommonResource.class);
		bind(VendaResource.class)	;
		bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
		bind(VendaDAO.class).to(ObjectifyVendaDAO.class);
		bind(ProdutoDAO.class).to(ObjectifyProdutoDAO.class);
	
		
		
	}
}
