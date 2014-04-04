package com.ciandt.hackathon.domain.model;

import static org.junit.Assert.fail;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

import com.ciandt.hackathon.configuration.AbstractTestClass;
import com.ciandt.hackathon.infrastructure.persistence.ObjectifyFooRepository;
import com.googlecode.objectify.Key;

public class FooRepositoryTest extends AbstractTestClass {

	private FooRepository repository;

	@Test
	public void testPut() {
		final Foo foo = gimmeFoo();
		final Key<Foo> savedKey = repository.put(foo);
		Assert.assertNotNull(savedKey);
		Assert.assertNotNull(foo.getId());
	}

	@Test
	public void testGet() {
		final Foo foo = gimmeFoo();
		final Key<Foo> k = repository.put(foo);
		final Foo savedFoo = repository.get(k.getString());
		Assert.assertEquals(foo, savedFoo);
	}

	@Test
	public void testDelete() {
		final Foo foo = gimmeFoo();
		final Key<Foo> k = repository.put(foo);
		final Foo savedFoo = repository.get(k.getString());

		Assert.assertNotNull(savedFoo.getId());

		repository.delete(savedFoo);

		final Foo deletedFoo = repository.get(k.getString());

		Assert.assertNull(deletedFoo);

	}

	@Test
	public void testList() {
		
		for (int i = 0; i < 10; i++) {
			repository.put(gimmeFoo());
		}

		List<Foo> foos = repository.list();
		Assert.assertEquals(10, foos.size());
	}

	@Override
	public void setup() {
		repository = new ObjectifyFooRepository();
	}

	private Foo gimmeFoo() {

		Fixture.of(Foo.class).addTemplate("valid", new Rule() {
			{
				add("name", random(String.class, "Google", "CI&T"));

			}
		});

		return Fixture.from(Foo.class).gimme("valid");

	}

}
