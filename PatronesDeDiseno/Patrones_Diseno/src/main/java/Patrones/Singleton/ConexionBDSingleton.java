package Patrones.Singleton;

public class ConexionBDSingleton {

    private ConexionBDSingleton(){
        System.out.println("Conectandose algun motor de BD");
    }

    private static ConexionBDSingleton instancia;

    public static ConexionBDSingleton getInstance(){
        if (instancia == null) {
            instancia= new ConexionBDSingleton();
        }
        return instancia;
    }
}
