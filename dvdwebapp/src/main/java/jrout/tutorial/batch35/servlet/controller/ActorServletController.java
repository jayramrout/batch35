package jrout.tutorial.batch35.servlet.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jrout.tutorial.batch35.servlet.controller.dao.ActorDAO;
import jrout.tutorial.batch35.servlet.controller.domain.Actor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// http://localhost:8080/dvdwebapp/hworld

@WebServlet(name = "ActorController", urlPatterns = {"/actorcontroller"})
public class ActorServletController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        ActorDAO actorDAO = new ActorDAO();
        List<Actor> actors = actorDAO.findActor(name);
        Collections.sort(actors, (o1, o2) -> o1.getFname().compareTo(o2.getLname()));
        req.setAttribute("actors",actors);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("actorresult.jsp");
        requestDispatcher.forward(req,resp);

    }


}
