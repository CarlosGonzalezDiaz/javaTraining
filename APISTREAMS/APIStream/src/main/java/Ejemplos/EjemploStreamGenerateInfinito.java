package Ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamGenerateInfinito {
    public static void main(String[] args) {
        Stream.generate(()->{
                try {
                    TimeUnit.SECONDS.sleep(2);
                }
                catch (InterruptedException w){
                    w.printStackTrace();
                }
                return "Hola Mundo";
                })
                .limit(28)
                .forEach(System.out::println);
    }
}
