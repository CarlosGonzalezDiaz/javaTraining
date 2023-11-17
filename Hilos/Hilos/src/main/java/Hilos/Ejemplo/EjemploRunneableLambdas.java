package Hilos.Ejemplo;

import Hilos.Ejemplo.InterfaceRunneable.ViajeTarea;

public class EjemploRunneableLambdas {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
        Runnable viaje = ()->{

                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
            System.out.println(main.getState());
        };

        //Join espera a que termine la ejecucion por su nombre une su Thread al principal


        Thread v1 = new Thread( viaje, "Japon");
        Thread v2 = new Thread( viaje, "Cancun");
        Thread v3 = new Thread( viaje, "Vallarta");

        v1.start();
        v2.start();
        v3.start();

        v1.join();
        v2.join();
        v3.join();

        //Thread.sleep(6000);
        System.out.println("continuando con la ejecucion : " + main.getName());



    }
}
