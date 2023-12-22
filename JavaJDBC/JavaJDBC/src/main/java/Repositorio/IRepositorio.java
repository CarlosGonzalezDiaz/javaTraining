package Repositorio;

import modelo.Producto;

import java.util.List;

public interface IRepositorio <T> {

    List<T> listar();

    T porId(Long id);
    void guardar(Producto producto);
    void eliminar(Long id);





}
