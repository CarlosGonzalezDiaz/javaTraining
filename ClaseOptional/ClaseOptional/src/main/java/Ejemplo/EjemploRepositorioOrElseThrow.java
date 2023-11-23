package Ejemplo;

import Ejemplo.models.Computador;
import Ejemplo.models.repositorio.ComputadorRepositorio;
import Ejemplo.models.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioOrElseThrow {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println("pc = " + pc);
/*
        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a->a.contains("."))
                .map(a->a.substring(archivo.lastIndexOf(".")+1));*/
       // System.out.println("extension = " + extension);


    }
}
