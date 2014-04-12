package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;

import com.ciandt.hackathon.entity.Badge;
import com.googlecode.objectify.Key;

public class ObjectifyBadgeDAO implements BadgeDAO {

	@Override
	public Long insert(Badge badge) {
		Key<Badge> key = ofy().save().entity(badge).now();
		return key.getId();
	}

	@Override
	public void delete(Badge badge) {
		ofy().delete().entity(badge).now();
	}

	@Override
	public List<Badge> findByPontuacao(Long pontuacao) {
		return ofy().load().type(Badge.class)
			.filter("pontuacao <", pontuacao).list();
	}

	@Override
	public List<Badge> findAll() {
		return ofy().load().type(Badge.class).list();
	}

}