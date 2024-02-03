package Cabeceras.controllers;

import Cabeceras.models.Producto;
import Cabeceras.services.ProductoServiceImp;
import Cabeceras.services.ProductoServicer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet({"/productos.xls", "/productos.html"})
public class ProductoXlsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoServicer servicer = new ProductoServiceImp();
        List<Producto> productos = servicer.listar();
        resp.setContentType("text/html;charset=UTF-8");

        String servletPath = req.getServletPath();
        boolean esXls = servletPath.endsWith(".xls");
        if (esXls){
            resp.setContentType("application/vnd.ms-excel");
            resp.setHeader("Content-Disposition", "attachment;filename=productos.xls");
        }
        try (PrintWriter out = resp.getWriter()) {
            if (!esXls)
            {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print(" <head>");
            out.print("     <meta charset\"UTF-8\">");
            out.print("     <title>Listado de productos</title>");
            out.print(" </head>");
            out.print(" <body>");
            out.print("     <h1>Listado de productos</h1>");

            }
            out.print("<table>");
            out.print("<tr>");
            out.print("<th>id");
            out.print("<th>nombre");
            out.print("<th>departamento");
            out.print("<th>precio");
            out.print("</tr>");
            productos.forEach(producto -> {
                out.print("<tr>");
                out.print("<td>"+producto.getId()+"</td>");
                out.print("<td>"+producto.getNombre()+"</td>");
                out.print("<td>"+producto.getTipo()+"</td>");
                out.print("<td>"+producto.getPrecio()+"</td>");
                out.print("</tr>");
            });
            out.print("</table>");
            out.print("<p>");
            if (!esXls) {
                out.print("<a href=\"" +req.getContextPath()+"/productos.xls" + "\"> exportar a xls&nbsp;</a>");
                out.print("<a href=\"" +req.getContextPath()+"/productos.json" + "\"> listar como json</a>");
                out.print("<br/>");
                out.print("<a href=\"" +req.getContextPath()+"/" + "\"> volver</a>");
                out.print(" </body>");
                out.print("</html>");
            }
        }
    }
}
