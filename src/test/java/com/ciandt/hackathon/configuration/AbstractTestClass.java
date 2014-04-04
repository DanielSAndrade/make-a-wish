package com.ciandt.hackathon.configuration;

import org.junit.After;
import org.junit.Before;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalMemcacheServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.google.appengine.tools.development.testing.LocalTaskQueueTestConfig;

/**
 * Abstract Test
 * 
 * @author fabioap
 *
 */
public abstract class AbstractTestClass {
	
	final LocalServiceTestHelper helper = new LocalServiceTestHelper(
			new LocalDatastoreServiceTestConfig(),
			new LocalMemcacheServiceTestConfig());
	@Before
	public void helperSetup() {
		helper.setUp();
	}

	@After
	public void helperTearDown() {
		helper.tearDown();
	}
	
	@Before
	public abstract void setup();
		

}
