package Ejemplos;

import Ejemplos.Models.Usuarios;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {
        /*Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")
                .map(nombre->{
                    return nombre.toUpperCase();
                });
        nombres.forEach(System.out::println);
        */

        Stream<Usuarios> nombres = Stream.of("Pato Gonzalez","Paco Guzman", "Paco Perez")
                .map(nombre->new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(usuarios -> usuarios.getNombre().equals("Paco"))
                ;


        List<Usuarios> usuarios = nombres.collect(Collectors.toList());
        usuarios.forEach(usuarios1 -> System.out.println(usuarios1.getNombre().concat(" ").concat(usuarios1.getApellido())));

    }
}
