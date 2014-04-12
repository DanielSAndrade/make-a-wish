package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import com.ciandt.hackathon.entity.Item;

public class ItemDefaultDAO implements ItemDAO {

	@Override
	public List<Item> findItens() {
		return this.listGreetings();
	}

	public List<Item> listGreetings() {
		List<Item> listItens = new ArrayList<Item>();

		listItens.add(this.createMockItem(1L, "Bicicleta", new Double(200),
				"Descrição da bicicleta", "/bicicleta.jpg"));
		listItens.add(this.createMockItem(2L, "PlayStation", new Double(4000),
				"Descrição do playstation", "/playstation.jpg"));
		listItens.add(this.createMockItem(3L, "Disney", new Double(3000),
				"Descrição da Disney", "/disney.jpg"));

		return listItens;
	}


	private Item createMockItem(Long id, String nome, Double preco,
			String descricao, String path) {
		Item item = new Item();
		item.setId(id);
		item.setNome(nome);
		item.setPreco(preco);
		item.setDescricao(descricao);
		item.setPath(path);
		return item;
	}


	@Override
	public Item findItem(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
