package com.ciandt.hackathon.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import com.ciandt.hackathon.comparator.PontosMesaComparator;
import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pessoa;
import com.ciandt.hackathon.vo.Ranking;
import com.google.inject.Inject;

public class MesaService {

    @Inject
    private Logger logger;
    
	private MesaDAO mesaDAO = new MesaDAO();
	
	// Mesa do tablet
	private Mesa mesa = new Mesa();	
	
	public Mesa getMesa() {
		if (mesa == null) {
			mesa = new Mesa();
			mesa.setNome("Aquario");
		}
		return mesa;
	}
	
	public void adicionaPessoa(Pessoa pessoa) {
		mesa.adicionarPessoa(pessoa);
	}	
	
	/**
	 * @return
	 */
	public List<Ranking> listaRanking() {
		
		List<Mesa> mesas = mesaDAO.getMesas();
		
		List<Ranking> rankingList = new ArrayList<Ranking>();

		Collections.sort((List<Mesa>) mesas, new PontosMesaComparator());
		
		int i=0;
		
		// Como a lista ja estara ordenada, este trecho soh precisa adicionar a posicao no ranking
		for (Mesa mesa : mesas) {
			i++;
			Ranking ranking = new Ranking();
			ranking.setPosicao(i);
			ranking.setMesa(mesa);
			rankingList.add(ranking);
			logger.info("Pontos da mesa: " + mesa + ": " + mesa.getPontos());
		}
		
		return rankingList;
	}
	
}
