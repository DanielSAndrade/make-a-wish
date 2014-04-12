package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.service.CompraService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class FinalizaCompraServlet extends HttpServlet{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;


    @Inject
    CompraService compraService;
    

    @Inject
    private Logger log;
    
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        
        String nomeProduto = req.getParameter("idProduto");
        
        String mesa = "Aquario";
        
        log.info("Mesa: " + mesa + " idProduto " + nomeProduto);
        
        compraService.comprarProduto(mesa, nomeProduto); 
        
        resp.sendRedirect("/produtos");
                
    }

}
