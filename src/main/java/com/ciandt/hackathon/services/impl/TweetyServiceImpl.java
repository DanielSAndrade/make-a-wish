package com.ciandt.hackathon.services.impl;

import java.util.List;

import com.ciandt.hackathon.dao.TweetyDAO;
import com.ciandt.hackathon.entity.Tweety;
import com.ciandt.hackathon.services.TweetyService;
import com.google.inject.Inject;

public class TweetyServiceImpl implements TweetyService {
	
	@Inject
	private TweetyDAO tweetyDao;

	@Override
	public List<Tweety> listTweety() {
		
		return tweetyDao.findTweety();
	
	}

}