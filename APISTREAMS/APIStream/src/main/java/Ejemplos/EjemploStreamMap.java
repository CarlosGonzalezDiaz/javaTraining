package Ejemplos;

import Ejemplos.Models.Usuarios;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class EjemploStreamMap {
    public static void main(String[] args) {
        /*Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")
                .map(nombre->{
                    return nombre.toUpperCase();
                });
        nombres.forEach(System.out::println);
        */

        Stream<Usuarios> nombres = Stream.of("Pato Gonzalez","Paco Guzman")
                .map(nombre->new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
                .map(usuario ->
                {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                })
                .map(usuario2 ->
                {
                    String apellido = usuario2.getApellido().toUpperCase();
                    usuario2.setApellido(apellido);
                    return usuario2;
                });


        List<Usuarios> usuarios = nombres.collect(Collectors.toList());
        usuarios.forEach(usuarios1 -> System.out.println(usuarios1.getNombre().concat(" ").concat(usuarios1.getApellido())));

    }
}
