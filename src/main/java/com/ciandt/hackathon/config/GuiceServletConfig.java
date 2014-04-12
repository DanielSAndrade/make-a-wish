package com.ciandt.hackathon.config;

import java.util.logging.Logger;

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
import com.ciandt.hackathon.resources.GuestbookServlet;
import com.ciandt.hackathon.resources.LoadServlet;
import com.ciandt.hackathon.resources.SignGuestbookServlet;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class GuiceServletConfig extends GuiceServletContextListener {
	
	private static Logger logger = Logger.getLogger(GuiceServletConfig.class.toString());

	@Override
	protected Injector getInjector() {
		logger.info("GuiceServletConfig.getInjector()");
		return Guice.createInjector(new CommonModule(), new ServletModule() {
			@Override
		    protected void configureServlets() {
				serve("/guestbook").with(GuestbookServlet.class);
				serve("/sign").with(SignGuestbookServlet.class);
				serve("/load").with(LoadServlet.class);
				bind(CommonResource.class);
				bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
				bind(BadgeDAO.class).to(ObjectifyBadgeDAO.class);
				bind(DoadorDao.class).to(ObjectityDoadorDao.class);
				bind(DoadorProdutoDao.class).to(ObjectifyDoadorProdutoDao.class);
				bind(MesaDAO.class).to(ObjectifyMesaDAO.class);
				bind(ProdutoDao.class).to(ObjectifyProdutoDao.class);
				bind(SonhoDAO.class).to(ObjectifySonhoDAO.class);
				
		    }
			
		});
	}
}
