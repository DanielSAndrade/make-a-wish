package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import com.ciandt.hackathon.entity.User;
import com.google.inject.Singleton;

@Singleton
public class ObjectifyUserDAO implements UserDAO {

	@Override
	public void saveOrUpdate(User user) {
		ofy().save().entities(user);
	}

	@Override
	public User findById(Long id) {
		return (User) ofy().load().filterKey(id);
	}
}
