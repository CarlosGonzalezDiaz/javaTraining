package Ejemplo;

import Ejemplo.models.Computador;
import Ejemplo.models.repositorio.ComputadorRepositorio;
import Ejemplo.models.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Optional<Computador> pc = repositorio.filtrar("asus");
        pc.ifPresent(System.out::println);


    }
}
