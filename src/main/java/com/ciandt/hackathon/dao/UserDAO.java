package com.ciandt.hackathon.dao;

import com.ciandt.hackathon.entity.PurchaseProduct;
import com.ciandt.hackathon.entity.User;

public interface UserDAO {
	
	public void saveOrUpdate(User user);
	
	public User findById(Long id);
	
	public void deleteAll();
	
	public void savePurchaseProduct(PurchaseProduct pp);

}
