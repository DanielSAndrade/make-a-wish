package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Item;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Pontuacao;

public interface PontuacaoDAO {

	List<Item> findPontuacoes();

	Pontuacao findPontuacaoPorMesa(Mesa mesa);
}
