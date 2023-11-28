package Ejemplos;

import Ejemplos.procesador.JsonSerializador;
import Models.Producto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto producto = new Producto();
        producto.setFecha(LocalDate.now());
        producto.setNombre("mesa de centro de RoblE");
        producto.setPrecio(1000L);

        System.out.println("Json = " + JsonSerializador.convertirJson(producto));

    }
}
