package sets;

import model.Alumno;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<Alumno> alumno = new TreeSet<>();
        alumno.add(new Alumno("Carlos", 90));
        alumno.add(new Alumno("Deniss", 100));
        alumno.add(new Alumno("Yaakov", 88));
        alumno.add(new Alumno("Mili", 100));

        //System.out.println(alumno);
        System.out.println("Iterando con foreach");
        for(Alumno al : alumno)
        {
            System.out.println(al);
        }

        System.out.println("iterando con While y con Iterator");
        Iterator<Alumno> iterator = alumno.iterator();
        while (iterator.hasNext())
        {
            Alumno al = iterator.next();
            System.out.println(al);
        }

        System.out.println("imprimiendo por lambda");
        alumno.forEach(alumnoLambda -> System.out.println(alumnoLambda));

    }
}
