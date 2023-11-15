package Ejemplos;

import Ejemplos.Models.Usuarios;

import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        long count = Stream.of("Pato Gonzalez","", "", "Paco Perez")
                .filter(String::isEmpty)
                .count()
                ;
        System.out.println(count);



    }
}
