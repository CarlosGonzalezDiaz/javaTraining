package Ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceEnteros {
    public static void main(String[] args) {

        Stream<Integer> nombres = Stream.of(5,10,15,20);

        Integer resultado = nombres.reduce(0, Integer::sum);
        System.out.println(resultado);





    }
}
