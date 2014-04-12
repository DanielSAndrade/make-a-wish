package com.ciandt.hackathon.config;

import java.util.logging.Logger;

import com.ciandt.hackathon.api.CommonResource;
import com.ciandt.hackathon.dao.BadgeDAO;
import com.ciandt.hackathon.dao.DonatorDAO;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyBadgeDAO;
import com.ciandt.hackathon.dao.ObjectifyDonatorDAO;
import com.ciandt.hackathon.dao.ObjectifyGreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyTableDAO;
import com.ciandt.hackathon.dao.ObjectifyWishDAO;
import com.ciandt.hackathon.dao.TableDAO;
import com.ciandt.hackathon.dao.WishDAO;
import com.ciandt.hackathon.resources.GuestbookServlet;
import com.ciandt.hackathon.resources.PopulateTablesServlet;
import com.ciandt.hackathon.resources.PopulateWishesServlet;
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
				serve("/populateWishes").with(PopulateWishesServlet.class);
				serve("/populateTables").with(PopulateTablesServlet.class);
				bind(CommonResource.class);
				bind(BadgeDAO.class).to(ObjectifyBadgeDAO.class);
				bind(DonatorDAO.class).to(ObjectifyDonatorDAO.class);
				bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
				bind(TableDAO.class).to(ObjectifyTableDAO.class);
				bind(WishDAO.class).to(ObjectifyWishDAO.class);
		    }
			
		});
	}
}
