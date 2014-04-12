package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.MesaDoacao;

public interface MesaDoacaoDAO {

	public List<MesaDoacao> findDoacoes();

	public Long insert(MesaDoacao doacao);
}
