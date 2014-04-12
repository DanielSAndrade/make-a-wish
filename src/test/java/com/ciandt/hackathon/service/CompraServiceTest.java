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
        service.setProdutoDAO(new ProdutoDAO());

        Produto produto = new Produto();
        Mesa mesa = new Mesa();

//        produto.setDisponivel(true);

        service.comprarProduto("mesa", "produto");

//        Assert.assertTrue("Produto não deveria estar disponivel", !produto.getDisponivel());

        Assert.assertEquals("", mesa.getPontos(), Long.valueOf(produto.getPontos()));

    }

}
