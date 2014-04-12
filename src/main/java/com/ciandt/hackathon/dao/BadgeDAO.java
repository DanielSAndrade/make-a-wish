package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Badge;

public interface BadgeDAO {
	
	/**
	 * List all greetings
	 * @return All greetings
	 */
	public List<Badge> findBadges();
	
	/**
	 * Insert a new greeting into datastore
	 * @param greeting Greeting to be inserted
	 * @return the generated id
	 */
	public Long insert( Badge badge );
	
	/**
	 * Remove a specific greeting from the datastore
	 * @param Greeting to be removed
	 */
	public void delete( Badge badge );

}
