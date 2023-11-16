package Ejemplos;

import Ejemplos.Models.Factura;
import Ejemplos.Models.Usuarios;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuarios usuario = new Usuarios("Jhon", "Doe");
        Usuarios usuario2 = new Usuarios("Carlos", "Gonzalez");
        Usuarios usuario3 = new Usuarios("Deniss", "Rodriguez");

        usuario.addFacturas(new Factura("compras"));
    }
}
