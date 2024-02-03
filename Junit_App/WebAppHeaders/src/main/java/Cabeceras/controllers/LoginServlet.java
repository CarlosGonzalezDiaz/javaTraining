package Cabeceras.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password))
        {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print(" <head>");
                out.print("     <meta charset\"UTF-8\">");
                out.print("     <title>Bienvenido</title>");
                out.print(" </head>");
                out.print(" <body>");
                out.print("     <h1>Login Correcto Bienvenido: " + username + "</h1>");
                out.print(" </body>");
                out.print("</html>");
            }
        }
        else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "No esta autorizado");
        }
    }
}
