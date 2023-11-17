package Hilos.Ejemplo;

import Hilos.Ejemplo.InterfaceRunneable.ViajeTarea;

public class EjemploRunneable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Japon")).start();
        new Thread(new ViajeTarea("Cancun")).start();
        new Thread(new ViajeTarea("Vallarta")).start();

    }
}
