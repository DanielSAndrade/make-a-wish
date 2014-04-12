package com.ciandt.hackathon.config;

import java.util.logging.Logger;

import com.ciandt.hackathon.api.CommonResource;
import com.ciandt.hackathon.dao.CompraDAO;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyCompraDAO;
import com.ciandt.hackathon.dao.ObjectifyGreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyParticipanteDAO;
import com.ciandt.hackathon.dao.ParticipanteDAO;
import com.ciandt.hackathon.resources.EfetuarCompraServlet;
import com.ciandt.hackathon.resources.GuestbookServlet;
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
				serve("/efetuarCompra").with(EfetuarCompraServlet.class);
				bind(CommonResource.class);
				bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
				bind(CompraDAO.class).to(ObjectifyCompraDAO.class);
				bind(ParticipanteDAO.class).to(ObjectifyParticipanteDAO.class);
		    }
			
		});
	}
}
