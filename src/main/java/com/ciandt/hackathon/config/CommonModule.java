package com.ciandt.hackathon.config;

import com.ciandt.hackathon.dao.FooDAO;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.dao.ObjectifyFooDAO;
import com.ciandt.hackathon.dao.ObjectifyGreetingDAO;
import com.ciandt.hackathon.entity.Greeting;
import com.google.inject.servlet.ServletModule;
import com.googlecode.objectify.ObjectifyService;

public class CommonModule extends ServletModule {
	
	// Registering objectify classes
    static {
        ObjectifyService.register(Greeting.class);
    }

	@Override
	protected void configureServlets() {

		/*
		Map<String, String> initParams = new HashMap<String, String>();
		initParams.put(ResourceConfig.FEATURE_TRACE, "true");
		initParams.put(GuiceContainer.JSP_TEMPLATES_BASE_PATH, "/WEB-INF/jsp");
		initParams.put(GuiceContainer.PROPERTY_WEB_PAGE_CONTENT_REGEX,
						"(/(_ah|appstats|mapreduce)/?.*)|(/.*\\.jsp)|(/WEB-INF/.*\\.jsp)|(/favicon\\.ico)");

		filterRegex("/(?!_ah).*").through(GuiceContainer.class, initParams);
		*/
		
		bind(CommonResource.class);
		bind(FooDAO.class).to(ObjectifyFooDAO.class);
		bind(GreetingDAO.class).to(ObjectifyGreetingDAO.class);
		
	}
}
