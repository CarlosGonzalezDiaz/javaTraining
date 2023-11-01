package sets;

import model.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> alumno = new ArrayList<>();

        System.out.println("Está vacia? = " + alumno.isEmpty());
        alumno.add(new Alumno("Carlos", 90));
        alumno.add(new Alumno("Deniss", 100));
        alumno.add(new Alumno("Yaakov", 88));
        alumno.add(new Alumno("Mili", 100));

        alumno.forEach(alumno1 -> System.out.println(alumno1));
        System.out.println("tamaño de la lista = " + alumno.size());
        System.out.println("Está vacia? = " + alumno.isEmpty());
        boolean contains = alumno.contains(new Alumno("Deniss", 100));
        System.out.println(contains);

    }
}
