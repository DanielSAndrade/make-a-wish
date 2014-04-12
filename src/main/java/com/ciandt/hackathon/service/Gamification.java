package com.ciandt.hackathon.service;

import java.math.BigDecimal;
import java.util.Collection;

import com.ciandt.hackathon.entity.Product;

public class Gamification {

	public int getTotalPoints(Collection<Product> products){
		
		int points = 0;
		
		BigDecimal totalAmount = new BigDecimal(0);
		for (Product product : products) {
			
			
			//Converte o valor total gasto em pontos
			if(product.getPrice() != null){
				BigDecimal price = new BigDecimal( product.getPrice() );
				totalAmount = totalAmount.add( price );
			}
			
			//Analisa se todos da mesma compraram um mesmo produto
			
			
			//Analisa se a mesa comprou um produto de cada tipo
			
			
		}
		
		points = totalAmount.intValue();
		
		return points;
	}
	
	
}
