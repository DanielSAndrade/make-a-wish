package com.ciandt.hackathon.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.MyStorage;
import com.ciandt.hackathon.dao.GreetingDAO;
import com.ciandt.hackathon.entity.Greeting;
import com.google.gson.Gson;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/api")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class CommonResource {

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
    @Path("/storage")
    public Map<Object, Object> storage(@Context HttpServletRequest request){
        Map<Object, Object> response = new HashMap<>();
        response.put("Tables", MyStorage.getInstance().tableMap);
        response.put("Products", MyStorage.getInstance().productMap);
        response.put("Purchases", MyStorage.getInstance().purchases);
        return response;
    }
}
