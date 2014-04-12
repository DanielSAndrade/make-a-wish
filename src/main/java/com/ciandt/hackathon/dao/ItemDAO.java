package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Item;

public interface ItemDAO {

	public List<Item> findItens();

	public Long insert(Item item);

	public void delete(Item item);

}
