package Ejemplos;

import Ejemplos.Models.Usuarios;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDisctinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream.of("Pato Gonzalez","Paco Guzman", "Paco Perez","Pato Gonzalez","Pato Gonzalez")
                .map(nombre->new Usuarios(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u->u.toString().length())
                ;
        IntSummaryStatistics summaryStatistics = largoNombres.summaryStatistics();
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());

    }
}
