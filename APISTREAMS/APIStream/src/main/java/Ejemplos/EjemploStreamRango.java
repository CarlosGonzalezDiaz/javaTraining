package Ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRango {
    public static void main(String[] args) {

        IntStream num = IntStream.range(5,20)
                .peek(System.out::println);


        //Integer resultado = nombres.reduce(0, Integer::sum);

        IntSummaryStatistics statistics = num.summaryStatistics();
        System.out.println("max = " + statistics.getMax());
        System.out.println("min = " + statistics.getMin());
        System.out.println("suma = " + statistics.getSum());
        System.out.println("promedio = " + statistics.getAverage());
        System.out.println("elementos " +  statistics.getCount());





    }
}
