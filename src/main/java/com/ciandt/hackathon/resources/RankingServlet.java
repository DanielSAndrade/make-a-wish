package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.CompraDAO;
import com.ciandt.hackathon.entity.Badge;
import com.ciandt.hackathon.entity.Compra;
import com.ciandt.hackathon.entity.Ranking;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class RankingServlet extends HttpServlet {
	
	@Inject 
	private CompraDAO compraDao;
	
	@Inject
	private Logger logger;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		logger.info( "Executing RankingServlet" );
		
		System.out.println("Listando compras....");
		List<Compra> compras = compraDao.findCompras();
		
		
		HashMap<Long, Double> comprasMesa = new HashMap<Long, Double>();
		
		if(compras != null) {
			for (Compra compra : compras) {
				Long idMesa = compra.getIdMesa();
				
				if(comprasMesa.containsKey(idMesa)) {
					Double compraMesa = comprasMesa.get(idMesa);
					compraMesa += compra.getValor(); 
				} else {
					comprasMesa.put(idMesa, compra.getValor());
				}
			}
			
			Set<Long> mesas = comprasMesa.keySet();
			List<Ranking> finalRanking = new ArrayList<Ranking>();
			for (Long idMesa : mesas) {
				Ranking entradaRanking = new Ranking();
				entradaRanking.setMesa(idMesa);
				entradaRanking.setPontos(comprasMesa.get(idMesa));
				entradaRanking.setBadges(new ArrayList<Badge>());
				
				if(entradaRanking.getPontos() > 100.00) {
					Badge badge = new Badge();
					badge.setName("Coração de Bronze");
					entradaRanking.getBadges().add(badge);
				} 
				if (entradaRanking.getPontos() > 500.00) {
					Badge badge = new Badge();
					badge.setName("Coração de Prata");
					entradaRanking.getBadges().add(badge);
				} 
				if(entradaRanking.getPontos() > 1000.00) {
					Badge badge = new Badge();
					badge.setName("Coração de Ouro");
					entradaRanking.getBadges().add(badge);
				}
				
				finalRanking.add(entradaRanking);
			}
			
			
		}
		
	}
}
