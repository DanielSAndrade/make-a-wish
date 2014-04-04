package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.entity.Foo;
import com.googlecode.objectify.Key;

public class ObjectifyFooDAO implements FooDAO {

	private static final Logger LOGGER = Logger
			.getLogger(ObjectifyFooDAO.class.getName());

	@Override
	public Key<Foo> put(Foo foo) {
		LOGGER.log(Level.INFO, "Saving Entity {0}", foo.toString());
		return ofy().save().entity(foo).now();
	}

	@Override
	public Foo get(String webSafeKey) {
		final Key<Foo> k = Key.create(webSafeKey);
		return ofy().load().key(k).now();
	}

	@Override
	public void delete(Foo foo) {
		ofy().delete().entity(foo).now();
	}

	@Override
	public List<Foo> list() {
		return ofy().load().type(Foo.class).list();
	}

}
