package Hilos.Ejemplo;

import Hilos.Ejemplo.InterfaceRunneable.ImprimirFreases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new ImprimirFreases("Hoola ", "Que tal")).start();
        new Thread(new ImprimirFreases("Quien eres ", "tu")).start();
        new Thread(new ImprimirFreases("muchas gracias ", "amigo mio")).start();
        Thread.sleep(100);
        Thread fraseNuea = new Thread(new ImprimirFreases("adios ", "amigo"));
        fraseNuea.start();
        Thread.sleep(100);
        System.out.println(fraseNuea.getState());

    }
    public synchronized static void ImprimirFrases(String frase1, String frase2)
    {
        System.out.print(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
