package Ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "Carlos";

        Optional<String> optional = Optional.of(nombre);
        System.out.println(optional);
        System.out.println(optional.isPresent());
        if (optional.isPresent())
        {
            System.out.println("Hola " + optional.get() );
        }

        optional.ifPresent(p-> System.out.println("Hola Valor"));

        nombre=null;
        optional = Optional.ofNullable(nombre);
        System.out.println(optional);
        System.out.println(optional.isPresent());
        optional.ifPresent(i-> System.out.println(i));

        //Optional Vacio
        Optional<String> optional1 = Optional.empty();
        System.out.println(optional1);
        System.out.println(optional1.isPresent());
    }
}
