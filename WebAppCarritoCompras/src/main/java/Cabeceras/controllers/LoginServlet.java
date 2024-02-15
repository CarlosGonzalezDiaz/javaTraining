package Cabeceras.controllers;

import Cabeceras.services.LoginService;
import Cabeceras.services.LoginServiceCookieImp;
import Cabeceras.services.LoginServiceSessionImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet({"/login", "/login.html"})
public class LoginServlet extends HttpServlet {
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginServiceSessionImp();
        Optional<String> usernameOptional = auth.getUsername(req);

        if (usernameOptional.isPresent())
        {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print(" <head>");
                out.print("     <meta charset\"UTF-8\">");
                out.print("     <title>Hola " + usernameOptional.get() + "</title>");
                out.print(" </head>");
                out.print(" <body>");
                out.print("     <h1>"+usernameOptional.get() + " </h1>");
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
            /*
            Cookie usernameCookie = new Cookie("username",username);
            resp.addCookie(usernameCookie);
             */

            HttpSession session = req.getSession();
            session.setAttribute("username","username");

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
