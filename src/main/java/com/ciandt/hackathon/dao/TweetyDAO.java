package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Tweety;

public interface TweetyDAO {

	public Long insert(Tweety tweety);

	public void delete(Tweety product);

	public List<Tweety> findTweety();

}
