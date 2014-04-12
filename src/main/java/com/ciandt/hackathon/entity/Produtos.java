package com.ciandt.hackathon.entity;

import java.util.Hashtable;
import java.util.Map;

public class Produtos {

	private static Map<Long, Produto> lista = new Hashtable<Long, Produto>();
	
	static {
		lista.put(1L, new Produto(1, "Livro", "Descrição", 12.00));
	}
	
	public static Produto get(long id) {
		return lista.get(id);
	}
}
