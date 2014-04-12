package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.dao.MesaDAO;
import com.ciandt.hackathon.entity.Mesa;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class RankMesaServlet extends HttpServlet {

    @Inject
    private MesaDAO mesaDao;

    @Inject
    private Logger logger;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        logger.info("Executing Rank da Mesa");

        List<Mesa> listaRank = mesaDao.listarRanking();

        req.setAttribute("rankMesa", listaRank);

        req.setAttribute("rankSize", listaRank == null ? 0 : listaRank.size());

        req.getRequestDispatcher("/rankMesa.jsp").forward(req, resp);
    }

}
