package com.ciandt.hackathon.service;

import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.entity.Produto;
import com.google.inject.Inject;

public class CompraService {

    @Inject
    ProdutoDAO produtoDAO;
    
    @Inject
    MesaDAO mesaDAO;
    
    public ProdutoDAO getProdutoDAO() {
        return produtoDAO;
    }

    public void setProdutoDAO(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public MesaDAO getMesaDAO() {
        return mesaDAO;
    }

    public void setMesaDAO(MesaDAO mesaDAO) {
        this.mesaDAO = mesaDAO;
    }

    public void comprarProduto(String mesa, String produto) { 
        
        Produto comprado = produtoDAO.findById(produto);
        
        long pontos = comprado.getPontos();
        
        produtoDAO.darBaixa(produto);
        
        mesaDAO.addCompra(mesa, comprado);
        
    }

}
