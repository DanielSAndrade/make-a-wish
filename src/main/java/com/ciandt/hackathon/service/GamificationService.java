package com.ciandt.hackathon.service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;

import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.ProductType;
import com.ciandt.hackathon.entity.PurchaseProduct;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.entity.User;

public class GamificationService {
	
	public Table analyze(Table table){

		//Converte dinheiro para pontos
		convertMoneyToPoints(table);
		
		//Analisa se todos da mesa compraram um mesmo produto
		analizeAllBuyTheSameProducts(table);
		
		
		//Analisa se a mesa comprou um produto de cada tipo
		analizeBuyAllTypeOfProducts( table );
		
		
		//Analisa badges
		
		return table;
	}

	private void analizeBuyAllTypeOfProducts(Table table) {
		
		boolean buyAllTypeOfProducts = false;
		
		Collection<User> users = table.getUsers();
		for (ProductType productType : ProductType.values()) {
			boolean purchasedProduct = false;
			for (User user : users) {
				purchasedProduct = getTypeOfProductsPurchased(user).contains(productType);
				if(purchasedProduct){
					//Se alguem já comprou o produto pula para o próximo produto
					break;
				}
			}
			
			if(!purchasedProduct){
				//Se ninguem comprou o produto
				buyAllTypeOfProducts = true;
			}
		}
		
		if(buyAllTypeOfProducts){
			//Se todos os tipos de produtos foram comprados
			table.addBadge(Badge.BUY_ALL_TYPE_OF_PRODUCTS);
		}
	}




	private void analizeAllBuyTheSameProducts(Table table) {
		
		Collection<User> users = table.getUsers();
		for (ProductType productType : ProductType.values()) {
			//Verifica se cada usuário da mesa comprou todos o mesmo tipo de produ
			
			boolean allBuyThisTypeOfProduct = false;
			for (User user : users) {
				
				Collection<ProductType> userProductsType = getTypeOfProductsPurchased(user);
				
				allBuyThisTypeOfProduct = userProductsType.contains(productType);
				if(!allBuyThisTypeOfProduct){
					break;
				}
			}
			
			if(allBuyThisTypeOfProduct){
				//Seta nova pontuação da mesa
				table.addPoints(20);
				
				//Da um badge
				table.addBadge(Badge.ALL_BUY_THE_SEME_PRODUCT);
			}
		}
		
	}

	private Collection<ProductType> getTypeOfProductsPurchased(User user) {
		Collection<ProductType> userProductsType = new HashSet<ProductType>();
		Collection<PurchaseProduct> products = user.getProducts();
		for (PurchaseProduct purchaseProduct : products) {
			Product product = purchaseProduct.getProduct();
			ProductType productPurchaseType = product.getProductType();
			userProductsType.add(productPurchaseType);
		}
		return userProductsType;
	}

	private void convertMoneyToPoints(Table table) {
		BigDecimal totalPoints = new BigDecimal(0);
		final Collection<User> users = table.getUsers();
		for (final User user : users) {
			
			final Collection<PurchaseProduct> purchaseProducts = user.getProducts();
			for (final PurchaseProduct purchaseProduct : purchaseProducts) {
				
				final Product product = purchaseProduct.getProduct();
				
				//Converte o valor total gasto em pontos
				if(product.getPrice() != null){
					final BigDecimal price = new BigDecimal( product.getPrice() );
					totalPoints = totalPoints.add( price );
				}
			}
		}
		
		table.addPoints( totalPoints.intValue() );
	}
}
