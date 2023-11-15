package Ejemplos;

import Ejemplos.Models.Usuarios;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream.of("Pato Gonzalez","Paco Guzman", "Paco Perez")
                .map(nombre->new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
                .anyMatch(usuarios -> usuarios.getId().equals(1))
                ;
        System.out.println(existe);



    }
}
