package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Donator;

public interface DonatorDAO {
	
	public List<Donator>findDonators(); 
	public Long insert( Donator donator );
	public void delete(Donator donator); 
	public void update(Donator donator); 
	
//	public void markAsIntended( Wish wish); 
//	public void realize(Wish wish);
//	public void dontRealize(Wish wish); 

}
