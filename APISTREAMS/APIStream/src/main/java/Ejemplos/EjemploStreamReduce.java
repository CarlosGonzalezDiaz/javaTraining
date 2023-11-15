package Ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Gonzalez","Pato Gonzalez", "Pato Gonzalez", "Pato Gonzalez", "Paco Perez")
                .distinct()
                ;
        String resultado = nombres.reduce("nombres = ",(a,b)->a+", " +b);
        System.out.println(resultado);





    }
}
