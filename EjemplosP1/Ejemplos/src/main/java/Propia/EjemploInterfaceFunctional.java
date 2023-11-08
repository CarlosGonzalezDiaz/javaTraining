package Propia;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
        Aritmetica suma = (a, b)->a+b;
        Aritmetica resta = (a,b)->a-b;

        System.out.println(suma.operacion(10,5));
        System.out.println(resta.operacion(10,5));

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.computar(7,5,suma));

    }
}
