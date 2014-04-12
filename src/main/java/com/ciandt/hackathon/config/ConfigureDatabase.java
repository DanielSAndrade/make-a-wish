package com.ciandt.hackathon.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ciandt.hackathon.entity.Greeting;
import com.google.appengine.api.utils.SystemProperty;

public class ConfigureDatabase {

	
	
	public void configure(){
		
		Map<String, String> properties = new HashMap<String, String>();
	    if (SystemProperty.environment.value() ==  SystemProperty.Environment.Value.Production) {
	      properties.put("javax.persistence.jdbc.driver",
	          "com.mysql.jdbc.GoogleDriver");
	      properties.put("javax.persistence.jdbc.url",
	          System.getProperty("cloudsql.url"));
	    } else {
	      properties.put("javax.persistence.jdbc.driver",
	          "com.mysql.jdbc.Driver");
	      properties.put("javax.persistence.jdbc.url",
	          System.getProperty("cloudsql.url.dev"));
	    }

	    EntityManagerFactory emf = Persistence.createEntityManagerFactory(
	        "Demo", properties);
	}

	
}
