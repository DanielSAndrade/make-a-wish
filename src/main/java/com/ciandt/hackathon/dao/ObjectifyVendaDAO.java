package com.ciandt.hackathon.dao;

import static com.ciandt.hackathon.dao.OfyService.ofy;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Venda;
import com.googlecode.objectify.Key;

public class ObjectifyVendaDAO implements VendaDAO {

	@Override
	public List<Venda> findVendas() {
		List<Venda> vendas = ofy().load().type(Venda.class).list();
		return vendas;
	}

	@Override
	public Long insert(Venda venda) {
		Key<Venda> key = ofy().save().entity(venda).now();
		return key.getId();
	}

	@Override
	public List<Venda> findVendasByMesa(Long idMesa) {
		List<Venda> vendas = ofy().load().type(Venda.class).list();

		List<Venda> minhasVendas = ofy().load().type(Venda.class)
				.filter("numeroMesa", idMesa).list();

		// Collections.sort();

		for (Venda v : vendas) {
			v.getProduto().getPreco();
		}

		return vendas;
	}

	@Override
	public List<Mesa> getTop5VendasByMesa() {
		List<Mesa> topMesa = new ArrayList<Mesa>();
		topMesa.add(new Mesa(15, 150.0));
		topMesa.add(new Mesa(22, 202.0));
		topMesa.add(new Mesa(55, 350.0));
		topMesa.add(new Mesa(33, 500.0));
		topMesa.add(new Mesa(86, 1590.0));
		return topMesa;
	}

	@Override
	public Double totalVendasByMesa(Long idMesa) {
		List<Venda> vendas = ofy().load().type(Venda.class)
				.filter("numeroMesa", idMesa).list();
		return this.totalVendas(vendas);
	}

	private Double totalVendas(List<Venda> vendas) {
		Double total = 0.0;
		for (Venda v : vendas)
			total += v.getProduto().getPreco();
		return total;
	}

}
