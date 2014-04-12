package com.ciandt.hackathon.entity;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private List<Produto> produtos = new ArrayList<Produto>();

	private Pessoa pessoa;
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
