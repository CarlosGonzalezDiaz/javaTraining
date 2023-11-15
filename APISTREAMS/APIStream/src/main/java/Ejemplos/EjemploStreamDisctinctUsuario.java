package Ejemplos;

import Ejemplos.Models.Usuarios;

import java.util.stream.Stream;

public class EjemploStreamDisctinctUsuario {
    public static void main(String[] args) {

        Stream<Usuarios> usuario = Stream.of("Pato Gonzalez","Paco Guzman", "Paco Perez","Pato Gonzalez","Pato Gonzalez")
                .map(nombre->new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct()
                ;
        usuario.forEach(System.out::println);
    }
}
