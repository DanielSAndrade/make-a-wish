package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pontuacao;

public class PontuacaoDefaultDAO implements PontuacaoDAO {

	private List<Pontuacao> cachePontuacoes;

	@Override
	public List<Pontuacao> findPontuacoes() {
		if (cachePontuacoes == null) {
			cachePontuacoes = this.createPontuacao();
		}
		return this.cachePontuacoes;
	}

	private List<Pontuacao> createPontuacao() {
		Mesa mesa1 = new Mesa();
		Mesa mesa2 = new Mesa();
		Mesa mesa3 = new Mesa();

		List<Pontuacao> pontuacoes = new ArrayList<Pontuacao>();
		Pontuacao pontuacao = new Pontuacao();
		pontuacao.setMesa(mesa1);
		pontuacao.setNumeroPontos(0l);
		pontuacoes.add(pontuacao);

		Pontuacao pontuacao2 = new Pontuacao();
		pontuacao2.setMesa(mesa2);
		pontuacao2.setNumeroPontos(0l);
		pontuacoes.add(pontuacao2);

		Pontuacao pontuacao3 = new Pontuacao();
		pontuacao3.setMesa(mesa3);
		pontuacao3.setNumeroPontos(0l);
		pontuacoes.add(pontuacao3);
		return pontuacoes;
	}

	@Override
	public Pontuacao findPontuacaoPorMesa(Mesa mesa) {
		for (Pontuacao pontuacao : this.cachePontuacoes) {
			if (pontuacao.getMesa() != null && pontuacao.getMesa().equals(mesa)) {
				return pontuacao;
			}
		}
		return null;
	}

	@Override
	public void insert(Pontuacao pontuacao) {
		this.cachePontuacoes.add(pontuacao);
	}

}
