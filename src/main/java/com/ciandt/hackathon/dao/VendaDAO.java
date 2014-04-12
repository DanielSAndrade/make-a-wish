package com.ciandt.hackathon.dao;

import java.util.List;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Venda;

public interface VendaDAO {

	public List<Venda> findVendas();

	public Long insert(Venda venda);

	public List<Venda> findVendasByMesa(Long idMesa);

	public List<Mesa> getTop5VendasByMesa();

	public Double totalVendasByMesa(Long idMesa);

}
