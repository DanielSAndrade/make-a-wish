package com.ciandt.hackathon.infrastructure.web;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ciandt.hackathon.domain.model.Foo;
import com.ciandt.hackathon.domain.model.FooRepository;
import com.google.appengine.repackaged.org.apache.http.annotation.ThreadSafe;
import com.google.inject.Inject;
import com.googlecode.objectify.Key;

@Path("/")
@ThreadSafe
public class CommonResource {

	private final FooRepository fooRepository;

	@Inject
	public CommonResource(FooRepository fooRepository) {
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