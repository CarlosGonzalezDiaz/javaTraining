package Cabeceras.controllers;

import Cabeceras.models.Carro;
import Cabeceras.models.ItemCarro;
import Cabeceras.models.Producto;
import Cabeceras.services.ProductoServiceImp;
import Cabeceras.services.ProductoServicer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/carro/eliminar")
public class DeleteCarroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        ProductoServicer servicer = new ProductoServiceImp();
        Optional<Producto> producto = servicer.findId(id);
        if (producto.isPresent()){
            ItemCarro itemCarro = new ItemCarro(1,producto.get());
            Carro carro;
            HttpSession session = req.getSession();
            if (session.getAttribute("carro")==null){
                carro = new Carro();
                session.setAttribute("carro", carro);
            }
            else {
                carro = (Carro) session.getAttribute("carro");
            }
            carro.deleteItemCarro(itemCarro);
        }
        resp.sendRedirect(req.getContextPath()+"/carro/ver");
    }
}
