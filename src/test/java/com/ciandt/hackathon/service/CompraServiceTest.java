package com.ciandt.hackathon.service;

import junit.framework.Assert;

import org.junit.Test;

import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.entity.Mesa;
import com.ciandt.hackathon.entity.Produto;

public class CompraServiceTest {

    @Test
    public void compraSimples() {

        CompraService service = new CompraService();
        
        service.setMesaDAO(new MesaDAO());
        ProdutoDAO produtoDAO = new ProdutoDAO();
        service.setProdutoDAO(produtoDAO);

        Produto produto = new Produto();
        Mesa mesa = new Mesa();

        produto.setDisponivel(true);

        String nomeProduto = "Um mundo distante";
        service.comprarProduto("mesa", nomeProduto);

        Assert.assertTrue("Produto não deveria estar disponivel", !produtoDAO.findById(nomeProduto).getDisponivel());

        Assert.assertEquals("", mesa.getPontos(), Long.valueOf(produto.getPontos()));

    }

}
