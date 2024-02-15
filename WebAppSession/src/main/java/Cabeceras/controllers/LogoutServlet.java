package Cabeceras.controllers;

import Cabeceras.services.LoginService;
import Cabeceras.services.LoginServiceCookieImp;
import Cabeceras.services.LoginServiceSessionImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginServiceSessionImp();
        Optional<String> username = auth.getUsername(req);

        if (username.isPresent())
        {
            HttpSession session = req.getSession();
            session.setAttribute("username","username");
            session.invalidate();
        }
        resp.sendRedirect(req.getContextPath()+"/login.jsp");
    }
}
