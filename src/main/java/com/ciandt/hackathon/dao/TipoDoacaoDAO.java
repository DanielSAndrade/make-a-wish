package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.TipoDoacao;

public interface TipoDoacaoDAO {

	public List<TipoDoacao> findTipoDoacoes();

	public TipoDoacao find(Long id);

	public Long insert(TipoDoacao tipoDoacao);
}
