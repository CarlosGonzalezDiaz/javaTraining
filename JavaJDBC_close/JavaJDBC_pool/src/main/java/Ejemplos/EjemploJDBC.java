package Ejemplos;

import Repositorio.IRepositorio;
import Repositorio.ProductoRepositorioImpl;
import modelo.Categoria;
import modelo.Producto;
import util.ConexionBD;

import java.sql.*;
import java.util.Date;

public class EjemploJDBC {
    public static void main(String[] args) {

            IRepositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("============Listar===========");
            repositorio.listar().forEach(System.out::println);
            System.out.println("============Buscar por ID===========");
            System.out.println(repositorio.porId(1L));
            System.out.println("============Agregar===========");
            Producto producto = new Producto();
            producto.setNombre("Patines");
            producto.setPrecio(450);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(1L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            repositorio.listar().forEach(System.out::println);

            System.out.println("============Eliminar===========");
            repositorio.eliminar(8L);
            repositorio.eliminar(9L);
            repositorio.listar().forEach(System.out::println);


    }
}
