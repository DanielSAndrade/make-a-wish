package com.ciandt.hackathon.config;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ciandt.hackathon.dao.FooDAO;
import com.ciandt.hackathon.entity.Foo;
import com.google.inject.Inject;
import com.googlecode.objectify.Key;

@Path("/")
@ThreadSafe
public class CommonResource {

	private final FooDAO fooRepository;

	@Inject
	public CommonResource(FooDAO fooRepository) {
		super();
		this.fooRepository = fooRepository;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello(@Context HttpServletRequest request) {
		final String key = createNewFoo();
		final Foo foo = fooRepository.get(key);
		return Response.ok(foo).build();
	}

	private String createNewFoo() {
		final Foo foo = new Foo("CI&T - Google Hackathon");
		Key<Foo> key = fooRepository.put(foo);
		return key.getString();
	}

}
