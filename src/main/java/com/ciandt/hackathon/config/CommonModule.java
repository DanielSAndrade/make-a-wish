package com.ciandt.hackathon.config;

import java.util.HashMap;
import java.util.Map;

import com.ciandt.hackathon.api.CommonResource;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.ObjectifyGreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyMesaDAO;
import com.ciandt.hackathon.dao.ObjectifyParticipanteDAO;
import com.ciandt.hackathon.dao.ObjectifyParticipanteDoacaoDAO;
import com.ciandt.hackathon.dao.ObjectifySonhoDAO;
import com.ciandt.hackathon.dao.ObjectifyTipoDoacaoDAO;
import com.ciandt.hackathon.dao.ParticipanteDAO;
import com.ciandt.hackathon.dao.ParticipanteDoacaoDAO;
import com.ciandt.hackathon.dao.SonhoDAO;
import com.ciandt.hackathon.dao.TipoDoacaoDAO;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class CommonModule extends ServletModule {

	@Override
	protected void configureServlets() {
		
		Map<String, String> initParams = new HashMap<String, String>();
		
		bind(CommonResource.class);
		bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
		bind(SonhoDAO.class).to(ObjectifySonhoDAO.class);
		bind(MesaDAO.class).to(ObjectifyMesaDAO.class);
		bind(ParticipanteDAO.class).to(ObjectifyParticipanteDAO.class);
		bind(ParticipanteDoacaoDAO.class).to(ObjectifyParticipanteDoacaoDAO.class);
		bind(TipoDoacaoDAO.class).to(ObjectifyTipoDoacaoDAO.class);
		
		filter("/api/*").through(GuiceContainer.class, initParams);
	}
}
