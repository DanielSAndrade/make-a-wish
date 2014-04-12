package com.ciandt.hackathon.config;

import java.util.HashMap;
import java.util.Map;

import com.ciandt.hackathon.api.CommonResource;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyGreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyWishDAO;
import com.ciandt.hackathon.dao.WishDAO;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class CommonModule extends ServletModule {

	@Override
	protected void configureServlets() {
		
		Map<String, String> initParams = new HashMap<String, String>();
		
		bind(CommonResource.class);
		bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
		bind(WishDAO.class).to(ObjectifyWishDAO.class);
		
		filter("/api/*").through(GuiceContainer.class, initParams);
	}
}
