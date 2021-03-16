package jrout.tutorial.batch35.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// http://localhost:8080/dvdwebapp/hworld

@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/hworld","/helloworld"})
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");

        PrintWriter writer = resp.getWriter();
        String indexHtml = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <title>Bootstrap Example</title>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n" +
                "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
                "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "    <h2>Stacked form</h2>\n" +
                "    <form action=\"/action_page.php\">\n" +
                "        <div class=\"form-group\">\n" +
                "            <label for=\"email\">Email:</label>\n" +
                "            <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\">\n" +
                "        </div>\n" +
                "        <div class=\"form-group\">\n" +
                "            <label for=\"pwd\">Password:</label>\n" +
                "            <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"pswd\">\n" +
                "        </div>\n" +
                "        <div class=\"form-group form-check\">\n" +
                "            <label class=\"form-check-label\">\n" +
                "                <input class=\"form-check-input\" type=\"checkbox\" name=\"remember\"> Remember me\n" +
                "            </label>\n" +
                "        </div>\n" +
                "        <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n" +
                "    </form>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
        writer.println(indexHtml);

    }

    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
