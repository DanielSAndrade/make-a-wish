package com.ciandt.hackathon.resources;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciandt.hackathon.service.MesaService;
import com.ciandt.hackathon.vo.Ranking;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("serial")
@Singleton
public class RankMesaServlet extends HttpServlet {

    @Inject
    private MesaService mesaService;

    @Inject
    private Logger logger;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        logger.info("Executing Rank da Mesa");

        List<Ranking> listaRank = mesaService.listaRanking();

        req.setAttribute("rankMesa", listaRank);

        req.setAttribute("rankSize", listaRank == null ? 0 : listaRank.size());

        req.getRequestDispatcher("/rankMesa.jsp").forward(req, resp);
    }

}
