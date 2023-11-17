package Ejemplos;

import Ejemplos.Models.Factura;
import Ejemplos.Models.Usuarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuarios usuario = new Usuarios("Jhon", "Doe");
        Usuarios usuario2 = new Usuarios("Carlos", "Gonzalez");
        Usuarios usuario3 = new Usuarios("Deniss", "Rodriguez");

        usuario.addFacturas(new Factura("compra tecnologia"));
        usuario2.addFacturas(new Factura("compra muebles"));
        usuario3.addFacturas(new Factura("compra carro"));

        List<Usuarios> usuarios = Arrays.asList(usuario,usuario2,usuario3);
        usuarios.stream()
                .map(Usuarios::getFacturas)
                .flatMap(List::stream)
                .forEach(factura -> System.out.println(factura.getUsuarios().getNombre().concat(" = ").concat(factura.getDescripcion())));


                /*
                .flatMap(us->us.getFacturas().stream())
                .forEach(factura -> System.out.println(factura.getUsuarios().getNombre()
                        .concat(" = ")
                        .concat(factura.getDescripcion())));
                 */

        /*
        for (Usuarios usuarios1 :usuarios)
        {
            for (Factura factura: usuarios1.getFacturas())
            {
                System.out.println(usuarios1.getNombre() + " = " + factura.getDescripcion());
            }
        }

         */
    }
}
