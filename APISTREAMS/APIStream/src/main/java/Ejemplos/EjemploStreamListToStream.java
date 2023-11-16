package Ejemplos;

import Ejemplos.Models.Usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        List<Usuarios> usuario = new ArrayList<>();
        usuario.add(new Usuarios("Andres", "Guzman"));
        usuario.add(new Usuarios("Carlos", "Gonzalez"));
        usuario.add(new Usuarios("Deniss", "Rodriguez"));
        usuario.add(new Usuarios("Ya'akov", "Gonz"));
        usuario.add(new Usuarios("Cata", "Perez"));

        usuario.stream()
                .map(u->u.getNombre()
                        .toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre->{
                    if (nombre.contains("Gonz".toUpperCase()))
                    {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                        .forEach(System.out::println);
    }
}
