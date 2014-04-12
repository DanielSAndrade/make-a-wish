package com.ciandt.hackathon.service;

import java.math.BigDecimal;
import java.util.Collection;

import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.PurchaseProduct;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.entity.User;

public class GamificationService {
	
	private Table table;

	public void analyze(Table table){
		this.table = table;
		
		
		BigDecimal totalAmount = new BigDecimal(0);
		Collection<User> users = table.getUsers();
		for (User user : users) {
			
			Collection<PurchaseProduct> products = user.getProducts();
			BigDecimal totalAmount = new BigDecimal(0);
			for (PurchaseProduct product : products) {
				
				
				//Converte o valor total gasto em pontos
				if(product.getProduct().getPrice() != null){
					BigDecimal price = new BigDecimal( product.getProduct().getPrice() );
					totalAmount = totalAmount.add( price );
				}
				
				//Analisa se todos da mesma compraram um mesmo produto
				
				
				//Analisa se a mesa comprou um produto de cada tipo
				
				
			}
			
		}
		
	}
	
	
	
	
	public int getPoints(){		
		return table.getPoints();
	}
	
	public Collection<Badge> getBadge(){		
		return table.getBadge();
	}
	
	
}
