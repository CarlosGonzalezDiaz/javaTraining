package Cabeceras.services;

public class ServiceJDBCException extends RuntimeException{

    public ServiceJDBCException(String mensaje){
        super(mensaje);
    }

    public ServiceJDBCException(String mensjae, Throwable cause){
        super(mensjae,cause);
    }

}
