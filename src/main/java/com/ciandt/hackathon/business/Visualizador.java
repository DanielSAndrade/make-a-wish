package com.ciandt.hackathon.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ciandt.hackathon.dao.ItemDAO;
import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.PontuacaoDAO;
import com.ciandt.hackathon.entity.Item;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pontuacao;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class Visualizador {

	@Inject
	private ItemDAO itemDAO;

	@Inject
	private PontuacaoDAO pontuacaoDAO;

	@Inject
	private MesaDAO mesaDAO;

	private Map<Class<?>, List<?>> cacheList = new HashMap<Class<?>, List<?>>();

	public List<Item> findItens() {
		if (!this.cacheList.containsKey(Item.class)) {
			this.cacheList.put(Item.class, this.itemDAO.findItens());
		}
		return (List<Item>) this.cacheList.get(Item.class);
	}

	public List<Pontuacao> findPontuacoes() {
		if (!this.cacheList.containsKey(Pontuacao.class)) {
			this.cacheList.put(Pontuacao.class,
					this.pontuacaoDAO.findPontuacoes());
		}
		return (List<Pontuacao>) this.cacheList.get(Pontuacao.class);
	}

	public Mesa initialize() {
		return mesaDAO.findMesa(1l);

	}
}
