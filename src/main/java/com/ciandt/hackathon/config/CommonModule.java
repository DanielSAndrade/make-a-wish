package com.ciandt.hackathon.config;

import java.util.HashMap;
import java.util.Map;

import com.ciandt.hackathon.api.ProductsApi;
import com.ciandt.hackathon.api.SallesApi;
import com.ciandt.hackathon.api.TweetyApi;
import com.ciandt.hackathon.dao.BuyDAO;
import com.ciandt.hackathon.dao.ObjectfyBuyDAO;
import com.ciandt.hackathon.dao.ObjectfyProductDAO;
import com.ciandt.hackathon.dao.ObjectfyTweetyDAO;
import com.ciandt.hackathon.dao.ProductDAO;
import com.ciandt.hackathon.dao.TweetyDAO;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.services.ProductService;
import com.ciandt.hackathon.services.SallesService;
import com.ciandt.hackathon.services.TweetyService;
import com.ciandt.hackathon.services.impl.ProductServiceImpl;
import com.ciandt.hackathon.services.impl.SallesServiceImpl;
import com.ciandt.hackathon.services.impl.TweetyServiceImpl;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class CommonModule extends ServletModule {
	


	@Override
	protected void configureServlets() {

		Map<String, String> initParams = new HashMap<String, String>();

		bind(SallesApi.class);
		bind(TweetyApi.class);
		bind(ProductsApi.class);

		bind(BuyDAO.class).to(ObjectfyBuyDAO.class);
		bind(ProductDAO.class).to(ObjectfyProductDAO.class);
		bind(TweetyDAO.class).to(ObjectfyTweetyDAO.class);

		bind(ProductService.class).to(ProductServiceImpl.class);
		bind(SallesService.class).to(SallesServiceImpl.class);
		bind(TweetyService.class).to(TweetyServiceImpl.class);

		filter("/tweetyApi/*").through(GuiceContainer.class, initParams);
		filter("/sallesApi/*").through(GuiceContainer.class, initParams);
		filter("/productsApi/*").through(GuiceContainer.class, initParams);	
		
		
		

	}
	
	
	
	
}
