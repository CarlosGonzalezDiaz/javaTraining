package EjemploFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        Function<String, String> function = (param)->"Hola que tal "+ param;
        System.out.println(function.apply("Carlos"));

        Function<String, String> function2 = (param)->param.toUpperCase();
        System.out.println(function2.apply("Carlos"));

        BiFunction<String,String,String> function3 = (a,b)-> {
                return a.toUpperCase().concat(b.toUpperCase());
            };
        System.out.println(function3.apply("Carlos","Gonzalez"));


        BiFunction<String, String, Integer> function4 = (a,b)->a.compareTo(b);
        System.out.println(function4.apply("carlos","carlos"));
    }
}
