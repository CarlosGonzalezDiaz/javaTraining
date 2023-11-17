package Hilos.Ejemplo.ClaseThread;

import Hilos.Ejemplo.Thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) {
        Thread thread = new NombreThread("Jhon Doe");

        thread.start();
        Thread thread2 = new NombreThread("Carlos");
        thread2.start();
        System.out.println(thread.getState());
    }
}
