package Cabeceras.services;

import Cabeceras.models.Producto;
import Cabeceras.repository.ProductoRepositoryImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProductoServiceJdbcImpl implements ProductoServicer{
    private ProductoRepositoryImpl repositoryJdbc;

    public ProductoServiceJdbcImpl(Connection connection){
        this.repositoryJdbc = new ProductoRepositoryImpl(connection);
    }

    @Override
    public List<Producto> listar() {
        try {
            return repositoryJdbc.Listar();
        } catch (SQLException e) {
            throw new ServiceJDBCException(e.getMessage(),e.getCause());
        }
    }

    @Override
    public Optional<Producto> findId(Long id) {
        try {
            return Optional.ofNullable(repositoryJdbc.porId(id));
        } catch (SQLException e) {
            throw new ServiceJDBCException(e.getMessage(),e.getCause());
        }
    }
}
