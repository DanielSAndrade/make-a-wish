package com.ciandt.hackathon.config;

import java.util.logging.Logger;

import com.ciandt.hackathon.api.CommonResource;
import com.ciandt.hackathon.business.ContabilBadge;
import com.ciandt.hackathon.business.ContabilPontuacao;
import com.ciandt.hackathon.business.Visualizador;
import com.ciandt.hackathon.dao.CompraDAO;
import com.ciandt.hackathon.dao.CompraDefaultDAO;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.ItemDAO;
import com.ciandt.hackathon.dao.ItemDefaultDAO;
import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.MesaDefaultDAO;
import com.ciandt.hackathon.dao.ObjectifyGreetingDAO;
import com.ciandt.hackathon.dao.PessoaDAO;
import com.ciandt.hackathon.dao.PessoaDefaultDAO;
import com.ciandt.hackathon.dao.PontuacaoDAO;
import com.ciandt.hackathon.dao.PontuacaoDefaultDAO;
import com.ciandt.hackathon.resources.GuestbookServlet;
import com.ciandt.hackathon.resources.SignGuestbookServlet;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class GuiceServletConfig extends GuiceServletContextListener {

	private static Logger logger = Logger.getLogger(GuiceServletConfig.class
			.toString());

	@Override
	protected Injector getInjector() {
		logger.info("GuiceServletConfig.getInjector()");
		return Guice.createInjector(new CommonModule(), new ServletModule() {
			@Override
			protected void configureServlets() {
				serve("/guestbook").with(GuestbookServlet.class);
				serve("/sign").with(SignGuestbookServlet.class);
				bind(CommonResource.class);
				bind(Visualizador.class);
				bind(ContabilPontuacao.class);
				bind(ContabilBadge.class);
				bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
				bind(ItemDAO.class).to(ItemDefaultDAO.class);
				bind(PessoaDAO.class).to(PessoaDefaultDAO.class);
				bind(CompraDAO.class).to(CompraDefaultDAO.class);
				bind(PontuacaoDAO.class).to(PontuacaoDefaultDAO.class);
				bind(MesaDAO.class).to(MesaDefaultDAO.class);
			}

		});
	}
}
