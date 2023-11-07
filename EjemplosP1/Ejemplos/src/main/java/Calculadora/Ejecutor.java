package Calculadora;

public class Ejecutor {
    public static void main(String[] args) {
        /*Calculadora.ICalculcadora calculcadora = (a)-> System.out.println(a+" Bienvenido a las expresiones Lambda");
        calculcadora.mensaje("Carlos");

         */

        ICalculcadora calculcadora = (a, b)-> {
            double resultado = a + b;
            System.out.println(resultado);
        };
        calculcadora.operacion(3,3);


    }
}
