package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.entity.Greeting;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {

	private static final Logger logger = Logger.getLogger(CommonResource.class);

	private final GreetingDAO greetingDAO;

	@Inject
	public CommonResource(GreetingDAO greetingDAO) {
		super();
		this.greetingDAO = greetingDAO;
	}

	@GET
	@Path("/listGreetings")
	public List<Greeting> listGreetings(@Context HttpServletRequest request) {
		List<Greeting> listGreetings = greetingDAO.findGreetings();
		return listGreetings;
	}

	@GET
	@Path("/order/register/{orderId}")
	public void orderRegister(@Context HttpServletRequest request,
			String orderId) {
		logger.info("orderId=" + orderId);
	}

}
