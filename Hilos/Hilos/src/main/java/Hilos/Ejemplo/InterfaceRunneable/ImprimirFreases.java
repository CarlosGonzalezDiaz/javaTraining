package Hilos.Ejemplo.InterfaceRunneable;

import Hilos.Ejemplo.EjemploSincronizacionThread;

import static Hilos.Ejemplo.EjemploSincronizacionThread.ImprimirFrases;

public class ImprimirFreases implements Runnable{


    private String frase1;
    private String frase2;

    public ImprimirFreases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }
    @Override
    public void run() {
        ImprimirFrases(this.frase1, this.frase2);
    }
}
