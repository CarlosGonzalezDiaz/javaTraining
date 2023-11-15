package Ejemplos;

import java.util.stream.Stream;

public class EjemploStreamDisctint {
    public static void main(String[] args) {

        Stream.of("Pato Gonzalez","Pato Gonzalez", "Pato Gonzalez", "Pato Gonzalez", "Paco Perez")
                .distinct()
                .forEach(System.out::println)
                ;




    }
}
