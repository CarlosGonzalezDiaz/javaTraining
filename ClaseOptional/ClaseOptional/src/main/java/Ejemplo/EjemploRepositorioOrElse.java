package Ejemplo;

import Ejemplo.models.Computador;
import Ejemplo.models.repositorio.ComputadorRepositorio;
import Ejemplo.models.repositorio.Repositorio;

public class EjemploRepositorioOrElse {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador pc = repositorio.filtrar("rog").orElse(valorPorDefecto());
        System.out.println("pc = " + pc);

        pc = repositorio.filtrar("mac").orElseGet(EjemploRepositorioOrElse::valorPorDefecto);
        System.out.println("pc = " + pc);

        
        

    }
    public static Computador valorPorDefecto(){
        System.out.println("Valor por defecto ");
        return new Computador("HP","LA001");
    }
}
