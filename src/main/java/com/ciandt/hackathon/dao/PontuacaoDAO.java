package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pontuacao;

public interface PontuacaoDAO {

	List<Pontuacao> findPontuacoes();

	Pontuacao findPontuacaoPorMesa(Mesa mesa);

	void insert(Pontuacao pontuacao);
}
