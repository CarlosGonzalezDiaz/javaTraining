import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/registro")
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String pais = req.getParameter("pais");
        String[] lenguajes = req.getParameterValues("lenguajes");
        String[] roles = req.getParameterValues("roles");
        String idioma = req.getParameter("idioma");
        String secreto = req.getParameter("secreto");
        String habilitar = req.getParameter("habilitar");

        Map<String,String> errores = new HashMap<>();
        if (username == null|| username.isEmpty())
        {
            errores.put("username","El username es requerido");
        }
        if (password==null || password.isEmpty())
        {
            errores.put("password","El password es requerido");
        }
        if (email==null || email.isEmpty())
        {
            errores.put("email","el email es requerido");
        }
        if (pais == null || pais.isEmpty())
        {
            errores.put("pais","el pais es requerido");
        }
        if (lenguajes == null|| lenguajes.length==0)
        {
            errores.put("lenguajes","tienes que seleccionar al menos 1 lenguaje");
        }
        if (roles == null|| roles.length==0)
        {
            errores.put("roles","tienes que seleccionar al menos 1 rol");
        }
        if (idioma==null|| idioma.isEmpty())
        {
            errores.put("idioma","tienes que seleccionar al menos 1 idioma");
        }

        if (errores.isEmpty()) {
            try (PrintWriter out = resp.getWriter()) {
                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print(" <head>");
                out.print("     <meta charset\"UTF-8\">");
                out.print("     <title>resultado form</title>");
                out.print(" </head>");
                out.print(" <body>");
                out.print("     <h1>resultado form</h1>");
                out.println("   <ul>");
                out.println("       <li>Username: " + username + "</li>");
                out.println("       <li>Password: " + password + "</li>");
                out.println("       <li>Email: " + email + "</li>");
                out.println("       <li>Selecciona Pais: " + pais + "</li>");
                out.println("       <li><ul>");
                Arrays.asList(lenguajes).forEach(lenguaje -> {
                    out.println("       <li>" + lenguaje + "</li>");
                });
                Arrays.asList(roles).forEach(rol -> {
                    out.println("       <li>" + rol + "</li>");
                });
                out.println("       </ul></li>");
                out.println("       <li>Idioma: " + idioma + "</li>");
                out.println("       <li>Habilitado: " + habilitar + "</li>");
                out.println("       <li>secreto: " + secreto + "</li>");

                out.println("   </ul>");
                out.print(" </body>");
                out.print("</html>");
            }
        }
        else {
                /*errores.forEach(error -> {
                    out.println("<li>" + error + "</li>");
                });
                out.println("<p><a href=\"/webapp-form/index.jsp\">volver</a>");*/
                req.setAttribute("errores", errores);
                getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
        }
    }
}
