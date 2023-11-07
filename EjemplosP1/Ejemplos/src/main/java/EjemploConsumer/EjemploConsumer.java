package EjemploConsumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = saludo -> System.out.println(saludo);

        Supplier<String> supplier = ()->{
            return "hola mundo suppplier";
        };

        System.out.println(supplier.get());


    }
}
