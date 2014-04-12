package com.ciandt.hackathon.api;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.ciandt.hackathon.entity.Tweety;
import com.ciandt.hackathon.services.TweetyService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Path("/tweetyApi")
@ThreadSafe
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Singleton
public class TweetyApi {

	private final TweetyService tweetyService;

	@Inject
	public TweetyApi(TweetyService tweetyService) {
		super();
		this.tweetyService = tweetyService;
	}

	@GET
	@Path("/listTweety")
	public List<Tweety> listTweety(@Context HttpServletRequest request) {
		
		return tweetyService.listTweety();
		
	}

}