package com.ciandt.hackathon.infrastructure.persistence;

import static com.ciandt.hackathon.infrastructure.persistence.OfyService.ofy;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ciandt.hackathon.domain.model.Foo;
import com.ciandt.hackathon.domain.model.FooRepository;
import com.googlecode.objectify.Key;

public class ObjectifyFooRepository implements FooRepository {

	private static final Logger LOGGER = Logger
			.getLogger(ObjectifyFooRepository.class.getName());

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
