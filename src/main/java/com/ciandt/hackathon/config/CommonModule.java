package com.ciandt.hackathon.config;

import java.util.HashMap;
import java.util.Map;

import com.ciandt.hackathon.api.CommonResource;
import com.ciandt.hackathon.dao.BadgeDAO;
import com.ciandt.hackathon.dao.DoadorDao;
import com.ciandt.hackathon.dao.DoadorProdutoDao;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.ObjectifyBadgeDAO;
import com.ciandt.hackathon.dao.ObjectifyDoadorProdutoDao;
import com.ciandt.hackathon.dao.ObjectifyGreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyMesaDAO;
import com.ciandt.hackathon.dao.ObjectifyProdutoDao;
import com.ciandt.hackathon.dao.ObjectifySonhoDAO;
import com.ciandt.hackathon.dao.ObjectityDoadorDao;
import com.ciandt.hackathon.dao.ProdutoDao;
import com.ciandt.hackathon.dao.SonhoDAO;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class CommonModule extends ServletModule {

	@Override
	protected void configureServlets() {
		
		Map<String, String> initParams = new HashMap<String, String>();
		
		bind(CommonResource.class);
		bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
		bind(BadgeDAO.class).to(ObjectifyBadgeDAO.class);
		bind(DoadorDao.class).to(ObjectityDoadorDao.class);
		bind(DoadorProdutoDao.class).to(ObjectifyDoadorProdutoDao.class);
		bind(MesaDAO.class).to(ObjectifyMesaDAO.class);
		bind(ProdutoDao.class).to(ObjectifyProdutoDao.class);
		bind(SonhoDAO.class).to(ObjectifySonhoDAO.class);
		
		bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
		
		filter("/api/*").through(GuiceContainer.class, initParams);
	}
}
