package Cabeceras.controllers;

import Cabeceras.services.LoginService;
import Cabeceras.services.LoginServiceImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;

@WebServlet({"/login", "/login.html"})
public class LoginServlet extends HttpServlet {
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginServiceImp();
        Optional<String> cookieOptional = auth.getUsername(req);

        if (cookieOptional.isPresent())
        {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print(" <head>");
                out.print("     <meta charset\"UTF-8\">");
                out.print("     <title>Hola " + cookieOptional.get() + "</title>");
                out.print(" </head>");
                out.print(" <body>");
                out.print("     <h1>"+cookieOptional.get() + " </h1>");
                out.print("<br/>");
                out.print("<a href=\"" + req.getContextPath() + "/" + "\"> volver&nbsp;&nbsp;&nbsp;</a>");
                out.print("<a href=\"" + req.getContextPath() + "/logout" + "\"> logout</a>");
                out.print(" </body>");
                out.print(" </body>");
                out.print("</html>");
            }
        }
        else {
            getServletContext().getRequestDispatcher("/login.jsp").forward(req,resp);
        }
        getServletContext().getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password))
        {
            Cookie usernameCookie = new Cookie("username",username);
            resp.addCookie(usernameCookie);

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
                out.print("<a href=\"" + req.getContextPath() + "/" + "\"> volver&nbsp;&nbsp;&nbsp;</a>");
                out.print("<a href=\"" + req.getContextPath() + "/logout" + "\"> logout</a>");
                out.print(" </body>");
                out.print("</html>");
            }
        }
        else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "No esta autorizado");
        }
    }
}
