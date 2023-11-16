package Ejemplos;

import Ejemplos.Models.Usuarios;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterFlatmap {
    public static void main(String[] args) {


        Stream<Usuarios> nombres = Stream.of("Pato Gonzalez","Paco Guzman", "Paco Perez")
                .map(nombre->new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(user->{
                    if(user.getNombre().equalsIgnoreCase("Paco")) {
                        return Stream.of(user);
                    }
                    return Stream.empty();
                })
                ;
        nombres.forEach(System.out::println);
    }
}
