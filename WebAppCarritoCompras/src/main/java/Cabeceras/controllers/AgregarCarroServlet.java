package Cabeceras.controllers;

import Cabeceras.models.Carro;
import Cabeceras.models.ItemCarro;
import Cabeceras.models.Producto;
import Cabeceras.services.ProductoServiceImp;
import Cabeceras.services.ProductoServiceJdbcImpl;
import Cabeceras.services.ProductoServicer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.util.Optional;

@WebServlet("/carro/agregar")
public class AgregarCarroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        Connection connection = (Connection) req.getAttribute("conn");
        ProductoServicer servicer = new ProductoServiceJdbcImpl(connection);
        Optional<Producto> producto = servicer.findId(id);
        if (producto.isPresent()){
            ItemCarro itemCarro = new ItemCarro(1, producto.get());
            HttpSession session = req.getSession();
            Carro carro= (Carro) session.getAttribute("carro");
            carro.addItemCarro(itemCarro);
            }
        resp.sendRedirect(req.getContextPath()+"/carro/ver");
    }
}
