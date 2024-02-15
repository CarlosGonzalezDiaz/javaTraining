package Cabeceras.controllers;

import Cabeceras.models.Producto;
import Cabeceras.services.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

@WebServlet("/productos.html")
public class ProductoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoServicer servicer = new ProductoServiceImp();
        List<Producto> productos = servicer.listar();

        LoginService auth = new LoginServiceSessionImp();
        Optional<String> usernameOptional = auth.getUsername(req);

        resp.setContentType("text/html;charset=UTF-8");

        String servletPath = req.getServletPath();
        try (PrintWriter out = resp.getWriter()) {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print(" <head>");
            out.print("     <meta charset\"UTF-8\">");
            out.print("     <title>Listado de productos</title>");
            out.print(" </head>");
            out.print(" <body>");
            out.print("     <h1>Listado de productos</h1>");
            if (usernameOptional.isPresent()) {
                out.print("<h3>Hola " + usernameOptional.get() + "</h3>");
            }
            out.print("<table>");
            out.print("<tr>");
            out.print("<th>id");
            out.print("<th>nombre");
            out.print("<th>departamento");
            if (usernameOptional.isPresent()) {
                out.print("<th>precio");
            }
            out.print("</tr>");
            productos.forEach(producto -> {
                out.print("<tr>");
                out.print("<td>" + producto.getId() + "</td>");
                out.print("<td>" + producto.getNombre() + "</td>");
                out.print("<td>" + producto.getTipo() + "</td>");
                if (usernameOptional.isPresent()) {
                    out.print("<td>" + producto.getPrecio() + "</td>");
                }
                out.print("</tr>");
            });
            out.print("</table>");
            out.print("<p>");
            out.print("<a href=\"" + req.getContextPath() + "/productos.xls" + "\"> exportar a xls&nbsp;</a>");
            out.print("<a href=\"" + req.getContextPath() + "/productos.json" + "\"> listar como json</a>");
            out.print("<br/>");
            out.print("<a href=\"" + req.getContextPath() + "/" + "\"> volver</a>");
            out.print(" </body>");
            out.print("</html>");
        }
    }
}
