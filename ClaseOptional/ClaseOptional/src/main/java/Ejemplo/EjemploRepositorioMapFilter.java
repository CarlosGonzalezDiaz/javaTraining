package Ejemplo;

import Ejemplo.models.Computador;
import Ejemplo.models.Fabricante;
import Ejemplo.models.repositorio.ComputadorRepositorio;
import Ejemplo.models.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Fabricante pc = repositorio.filtrar("rog")
                .map(c -> c.getProcesador())
                .map(p -> p.getFabricante()).orElse(null);
        System.out.println("pc = " + pc);

    }
}
