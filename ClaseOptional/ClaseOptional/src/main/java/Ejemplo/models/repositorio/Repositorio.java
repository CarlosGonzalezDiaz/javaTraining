package Ejemplo.models.repositorio;

import Ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);

}
