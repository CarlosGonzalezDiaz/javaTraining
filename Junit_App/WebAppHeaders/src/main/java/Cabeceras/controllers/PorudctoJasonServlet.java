package Cabeceras.controllers;

import Cabeceras.models.Producto;
import Cabeceras.services.ProductoServiceImp;
import Cabeceras.services.ProductoServicer;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static java.lang.System.out;

@WebServlet("/productos.json")
public class PorudctoJasonServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ServletInputStream jsonStream = req.getInputStream();
        Producto producto = objectMapper.readValue(jsonStream,Producto.class);

        try (PrintWriter out = resp.getWriter()) {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print(" <head>");
            out.print("     <meta charset\"UTF-8\">");
            out.print("     <title>Detalles productos desde Json</title>");
            out.print(" </head>");
            out.print(" <body>");
            out.print("<ul>");
            out.print(" <li>ID: "+ producto.getId()+"</li>");
            out.print(" <li>Nombre: "+ producto.getNombre()+"</li>");
            out.print(" <li>Tipo: "+ producto.getTipo()+"</li>");
            out.print(" <li>Precio: "+ producto.getPrecio()+"</li>");
            out.print("</ul>");
            out.print("<br/>");
            out.print("<a href=\"" +req.getContextPath()+"/" + "\"> volver</a>");
            out.print(" </body>");
            out.print("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoServicer productoServicer = new ProductoServiceImp();
        List<Producto> productos = productoServicer.listar();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(productos);
        resp.setContentType("application/json");
        resp.getWriter().write(json);
        resp.setContentType("text/html;charset=UTF-8");





    }
}
