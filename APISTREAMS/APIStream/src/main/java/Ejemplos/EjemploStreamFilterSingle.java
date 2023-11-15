package Ejemplos;

import Ejemplos.Models.Usuarios;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Usuarios usuario = Stream.of("Pato Gonzalez","Paco Guzman", "Paco Perez")
                .map(nombre->new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(usuarios -> usuarios.getId().equals(3))
                .findFirst().get()
                ;
        System.out.println(usuario);



    }
}
