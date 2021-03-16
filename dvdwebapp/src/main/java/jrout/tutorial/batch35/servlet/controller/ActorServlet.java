package jrout.tutorial.batch35.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jrout.tutorial.batch35.servlet.controller.dao.ActorDAO;
import jrout.tutorial.batch35.servlet.controller.domain.Actor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

// http://localhost:8080/dvdwebapp/hworld

@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/actor"})
public class ActorServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");

        PrintWriter writer = resp.getWriter();
        // make db calls...
        ActorDAO actorDAO = new ActorDAO();
        List<Actor> actors = actorDAO.findActor(name);
        StringBuilder sb = new StringBuilder();

        for(Actor actor1 : actors) {
            sb.append("      <tr>\n" +
                    "        <td>"+actor1.getFname()+"</td>\n" +
                    "        <td>"+actor1.getLname()+"</td>\n" +
                    "        <td>"+actor1.getId()+"</td>\n" +
                    "      </tr>\n");
        }

        String response = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <title>Bootstrap Example</title>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n" +
                "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n" +
                "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
                "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "  <h2>Striped Rows</h2>\n" +
                "  <p>The .table-striped class adds zebra-stripes to a table:</p>            \n" +
                "  <table class=\"table table-striped\">\n" +
                "    <thead>\n" +
                "      <tr>\n" +
                "        <th>Firstname</th>\n" +
                "        <th>Lastname</th>\n" +
                "        <th>Id</th>\n" +
                "      </tr>\n" +
                "    </thead>\n" +
                "    <tbody>\n" +
                sb.toString()
                +
                "    </tbody>\n" +
                "  </table>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";

        writer.println(response);

    }

    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
