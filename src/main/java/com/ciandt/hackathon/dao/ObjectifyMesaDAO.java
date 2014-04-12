package com.ciandt.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Produto;

public class ObjectifyMesaDAO implements MesaDAO {

	@Override
	public List<Mesa> obterMesas() {
		List<Mesa> mesas = new ArrayList<Mesa>();
		for(int i = 1; i < 11; i++){
			mesas.add(ObterMesa(i));
		}
		return mesas;
	}
	
	private Mesa ObterMesa(int numeroMesa){
		Mesa mesa = new Mesa();
		mesa.setNumero(numeroMesa);
		
		ProdutoDAO pDao = new ObjectfyProdutoDAO();
		List<Produto> produtosMesa = pDao.obterProdutosMesa(numeroMesa);
		mesa.setProdutos(produtosMesa);
		mesa.setPontuacao(0);
		if(produtosMesa != null && produtosMesa.size() > 0)
		{
			int pontuacao = 0;
			for (Produto produto : produtosMesa) {
				pontuacao+=produto.getPeso();
			}
			mesa.setPontuacao(pontuacao);
		}
		
		return mesa;
	}
}
