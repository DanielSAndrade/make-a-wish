package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.ProdutoDAO;
import com.ciandt.hackathon.entity.Produto;
import com.ciandt.hackathon.service.MesaService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class ListaComprasServlet {

    @Inject
    private ProdutoDAO produtoDAO;	

    @Inject
    private MesaService mesaService;

    @Inject
    private Logger logger;    

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        logger.info("Executando Lista de Compras");

        List<Produto> produtos = produtoDAO.listarProdutos();

        req.setAttribute("produtos", produtos);

        req.setAttribute("mesa", mesaService.getMesa());
        
        req.setAttribute("produtosSize", produtos == null ? 0 : produtos.size());

        req.getRequestDispatcher("/rankMesa.jsp").forward(req, resp);
    }    
    
}
