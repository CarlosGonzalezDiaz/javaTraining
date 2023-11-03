package sets;

import model.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> alumno = new LinkedList<>();

        System.out.println("Está vacia? = " + alumno.isEmpty());
        alumno.add(new Alumno("Carlos", 90));
        alumno.add(new Alumno("Deniss", 99));
        alumno.add(new Alumno("Yaakov", 88));
        alumno.add(new Alumno("Mili", 100));


        System.out.println("tamaño de la lista = " + alumno.size());
        alumno.addFirst(new Alumno("Zeus",87));
        alumno.addLast(new Alumno("Atenea",93));


        alumno.forEach(alumno1 -> System.out.println(alumno1));

        //si queremos imprimir el ultimo o primer elemento, LinkedList nos agrega los metodos
        System.out.println(alumno.getFirst());
        System.out.println(alumno.getLast());

        //o el de algun indice
        System.out.println(alumno.get(2));

        //algunos metodos similares que no mandan excepciones en caso de que la lista esté vacia son
        System.out.println(alumno.peekFirst());
        System.out.println(alumno.peekLast());

        //si queremos eliminar algun registro tenemos los metodos
        alumno.removeFirst();
        alumno.removeLast();

        for(Alumno alumno1 :alumno){
            System.out.println(alumno1);
        }
    }
}
