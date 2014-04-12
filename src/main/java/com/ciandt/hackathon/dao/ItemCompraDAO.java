package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.ItemCompra;

public interface ItemCompraDAO {

	public List<ItemCompra> findItemCompra();
	
	public Long insert(ItemCompra itemCompra);
}
