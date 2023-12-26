package Repositorio;

import modelo.Categoria;
import modelo.Producto;
import util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements IRepositorio{

    @Override
    public List listar() {

        List<Producto> productos = new ArrayList<>();
        try(Connection connection = getConnection();
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT p.*, c.nombre as categoria FROM productos as p inner join categorias as c ON (p.categoria_id = c.id)")
        ) {
            while (resultSet.next()){
                Producto producto = crearProducto(resultSet);
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    @Override
    public Object porId(Long id) {
        Producto producto = null;
        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection
                .prepareStatement("SELECT p.*, c.nombre as categoria FROM productos as p inner join categorias as c ON (p.categoria_id = c.id) WHERE p.id = ?")){
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    producto = crearProducto(resultSet);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) {
        String sql;
        if (producto.getId()!=null && producto.getId()>0)
        {
            sql = "UPDATE productos SET nombre = ?, precio = ?, categoria_id = ? ; WHERE id = ?";
        }
        else
        {
            sql = "INSERT INTO javacurso.productos (nombre, precio, categoria_id , fecha_registro) values (?,?,?,?);";
        }
        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,producto.getNombre());
            preparedStatement.setInt(2, producto.getPrecio());
            preparedStatement.setLong(3, producto.getCategoria().getId());

            if (producto.getId()!=null && producto.getId()>0) {
                preparedStatement.setLong(4, producto.getId());
            }
            else {
                preparedStatement.setDate(4, new Date(producto.getFechaRegistro().getTime()));
            }
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(Long id) {
        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE from productos WHERE id = ?")){
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection getConnection() throws SQLException {
        return ConexionBD.getConnection();
    }

    private Producto crearProducto(ResultSet resultSet) throws SQLException {
        Producto producto = new Producto();
        producto.setId(resultSet.getLong("id"));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getInt("precio"));
        producto.setFechaRegistro(resultSet.getDate("fecha_registro"));
        Categoria categoria = new Categoria();
        categoria.setId(resultSet.getLong("categoria_id"));
        categoria.setNombre(resultSet.getString("categoria"));
        producto.setCategoria(categoria);
        return producto;
    }

}
