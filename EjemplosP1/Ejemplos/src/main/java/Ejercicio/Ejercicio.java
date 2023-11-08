package Ejercicio;

public class Ejercicio {

    public static void main(String[] args) {
        IEjercicio frase = f -> f.replaceAll(" ","").replaceAll(",","").replace(".","").toUpperCase();
        System.out.println(frase.frase("Hola Mundo ,,,y..saludos CArlos"));

        IEjercicio frase2 = String::toUpperCase;
        System.out.println(frase2.frase("Hola Mundo ,,,y..saludos CArlos").replaceAll(" ","").replaceAll(",","").replace(".",""));

    }

}
