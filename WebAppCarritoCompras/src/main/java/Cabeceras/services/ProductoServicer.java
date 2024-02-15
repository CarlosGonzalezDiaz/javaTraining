package Cabeceras.services;

import Cabeceras.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoServicer {
    List<Producto> listar();
    Optional<Producto> findId(Long id);

}
