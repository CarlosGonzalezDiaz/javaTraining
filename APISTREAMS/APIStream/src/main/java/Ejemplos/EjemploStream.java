package Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        /*Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        nombres.forEach(System.out::println);*/
        /*String[] arreglo = {"Pato", "Paco", "Pepa", "Pepe"};
        nombres = Arrays.stream(arreglo);
        nombres.forEach(e-> System.out.println(e));*/

        /*Stream<String> nombres = Stream.<String>builder()
                .add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();
        nombres.forEach(System.out::println);*/

        /*List<String> names = new ArrayList<>();
        names.add("Pato");
        names.add("Paco");
        names.add("Pepa");
        names.add("Pepe");

        //Stream<String> nombres = names.stream();
        //nombres.forEach(System.out::println);

        names.stream().forEach(System.out::println);*/



    }


}
