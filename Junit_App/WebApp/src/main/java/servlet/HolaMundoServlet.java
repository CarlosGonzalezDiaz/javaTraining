package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hola-mundo")
public class HolaMundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print(" <head>");
        out.print("     <meta charset\"UTF-8\">");
        out.print("     <title>Hola Mundo Servlet</title>");
        out.print(" </head>");
        out.print(" <body>");
        out.print("     <h1>Hola Mundo</h1>");
        out.print(" </body>");
        out.print("</html>");
    }
}
