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
import java.util.Optional;

@WebServlet("/Buscar-Producto")
public class BuscarProductoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoServicer productoServicer = new ProductoServiceImp();
        String nombreProducto = req.getParameter("producto");
        Optional <Producto> encontrado = productoServicer.listar().stream().filter(producto -> producto.getNombre().contains(nombreProducto)).findFirst();
        if (encontrado.isPresent())
        {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print(" <head>");
                out.print("     <meta charset\"UTF-8\">");
                out.print("     <title>Producto encontrado</title>");
                out.print(" </head>");
                out.print(" <body>");
                out.print("     <h1>Producto encontrado</h1>");
                out.print("     <h3> producto"+ encontrado.get().getNombre() + " encontrado</h3><br>" +
                        "<h3>el precio es de $"+ encontrado.get().getPrecio() +"</h3>");
                out.print("<a href=\"" +req.getContextPath()+"/"+ "\">" + "volver" + "</a>");
                out.print(" </body>");
                out.print("</html>");
            }
        }
        else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND,"producto no encontrado");
        }
    }
}
