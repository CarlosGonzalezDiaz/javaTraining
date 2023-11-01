package sets;

import model.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> alumno = new ArrayList<>();
        alumno.add(new Alumno("Carlos", 90));
        alumno.add(new Alumno("Deniss", 100));
        alumno.add(new Alumno("Yaakov", 88));
        alumno.add(new Alumno("Mili", 100));

        //Collections.sort(alumno, (a,b)->a.getNombre().compareTo(b.getNombre()));
        alumno.sort(Comparator.comparing((Alumno a)->a.getNota()).reversed());

        System.out.println("imprimiendo por lambda");
        alumno.forEach(alumnoLambda -> System.out.println(alumnoLambda));

    }
}
