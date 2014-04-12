package com.ciandt.hackathon.resources;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by rjfonseca on 12/04/14.
 */
@SuppressWarnings("serial")
@Singleton
public class RankingServlet extends HttpServlet {

    @Inject
    private Logger logger;

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        logger.info("Ranking page");

        req.getRequestDispatcher("/ranking.jsp").forward(req, resp);
    }
}
