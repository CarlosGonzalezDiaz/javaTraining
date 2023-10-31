import Modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> alumno = new TreeSet<>();
        alumno.add(new Alumno("Carlos", 90));
        alumno.add(new Alumno("Deniss", 100));
        alumno.add(new Alumno("Yaakov", 88));
        alumno.add(new Alumno("Mili", 100));

        System.out.println(alumno);
    }
}
