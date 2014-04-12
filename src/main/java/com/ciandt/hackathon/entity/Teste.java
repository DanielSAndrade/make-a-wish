package com.ciandt.hackathon.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.google.appengine.api.utils.SystemProperty;

public class Teste {

	@Test
	public void configure() {

		Map<String, String> properties = new HashMap<String, String>();
			properties.put("javax.persistence.jdbc.driver",
					"com.mysql.jdbc.GoogleDriver");
			properties
					.put("javax.persistence.jdbc.url",
							System.getProperty("jdbc:google:mysql://make-a-wish-bicicleta:dinner/makeawish?user=root"));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(
				"make-a-wish", properties);
		
		
	    EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    Mesa a = new Mesa();
	    a.setId((long) 1);
	    a.setNome("Teste");
	    em.persist(a);
	    em.getTransaction().commit();
	    em.close();

	}

}
