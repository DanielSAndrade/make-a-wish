package com.ciandt.hackathon.service;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Product;
import com.ciandt.hackathon.entity.ProductType;
import com.ciandt.hackathon.entity.PurchaseProduct;
import com.ciandt.hackathon.entity.Table;
import com.ciandt.hackathon.entity.User;

public class GamificationServiceTest {

	private Table table;
	
	public void setUp(){
		
		this.table = new Table();
		
		Product balao = new Product(1L, "balão", 10D, ProductType.BALLONS);
		Product livro = new Product(2L, "livro", 50D, ProductType.BOOK);
		Product sonhoDisney = new Product(3L, "Sonho: Disney", 1200D, ProductType.DREAM);
		Product sonhoCelular = new Product(4L, "Sonho: Celular", 600D, ProductType.DREAM);
		
		Collection<PurchaseProduct> produtosPedro = new HashSet<PurchaseProduct>();
		produtosPedro.add( new PurchaseProduct(1L, balao, 1) );
		
		
		Collection<PurchaseProduct> produtosRafael = new HashSet<PurchaseProduct>();
		produtosRafael.add( new PurchaseProduct(2L, balao, 1) );
		produtosRafael.add( new PurchaseProduct(4L, sonhoDisney, 1) );
		
		Collection<PurchaseProduct> produtosMaria = new HashSet<PurchaseProduct>();
		produtosMaria.add( new PurchaseProduct(3L, balao, 1) );
		produtosMaria.add( new PurchaseProduct(5L, livro, 1) );
		
		User pedro = new User(1L, this.table, produtosPedro);
		pedro.setProducts(produtosPedro);
		
		User rafael = new User(2L, this.table, produtosRafael);
		rafael.setProducts(produtosRafael);
		
		User maria = new User(3L, this.table, produtosMaria);
		maria.setProducts(produtosMaria);
		
		Collection<User> users = new HashSet<User>();
		users.add(pedro);
		users.add(rafael);
		users.add(maria);
		
		this.table.setUsers(users);
		
	}
	
	
	@Test
	public void convertMoneyToPoints(){
		
		
		GamificationService gamificationService = new GamificationService();
		gamificationService.convertMoneyToPoints(this.table);
		
		int points = this.table.getPoints();
		Collection<Badge> badges = this.table.getBadges();
		
		Assert.assertNotNull(badges);
	}
	
	
}
