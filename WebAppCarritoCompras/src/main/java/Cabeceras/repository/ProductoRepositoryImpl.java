package Cabeceras.repository;

import Cabeceras.models.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositoryImpl implements Repository<Producto> {
    private Connection connection;

    public ProductoRepositoryImpl(Connection conn){
        this.connection = conn;
    }

    @Override
    public List<Producto> Listar() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT p.*, c.nombre as categoria FROM productos as p " +
                     "INNER JOIN categorias as c ON (p.categoria_id = c.id)")){
            while (resultSet.next()){
                Producto p = getProducto(resultSet);
                productos.add(p);
            }

        }
        return productos;
    }

    private Producto getProducto(ResultSet resultSet) throws SQLException {
        Producto p = new Producto();
        p.setId(resultSet.getLong("id"));
        p.setNombre(resultSet.getString("nombre"));
        p.setPrecio(resultSet.getInt("precio"));
        p.setTipo(resultSet.getString("categoria"));
        return p;
    }

    @Override
    public Producto porId(Long id) throws SQLException {
        Producto producto = null;
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM productos as p " + "INNER JOIN  categorias as c ON (p.categoria_id = c.id) WHERE p.id = ?")){
            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()){
                    producto = getProducto(resultSet);
                }
            }
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) throws SQLException {

    }

    @Override
    public void eliminar(Long id) throws SQLException {

    }
}
