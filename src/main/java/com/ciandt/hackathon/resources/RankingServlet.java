package com.ciandt.hackathon.resources;

import com.ciandt.hackathon.MyStorage;
import com.ciandt.hackathon.entity.Table;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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

        List<Table> tables = new ArrayList<>();
        tables.addAll(MyStorage.getInstance().tableMap.values());

        Collections.sort(tables, new Comparator<Table>() {
            @Override
            public int compare(Table o, Table o2) {
                return (o.getScore() < o2.getScore() )? 1:-1;
            }
        });

        req.setAttribute("tables", tables);

        req.getRequestDispatcher("/ranking.jsp").forward(req, resp);
    }
}
