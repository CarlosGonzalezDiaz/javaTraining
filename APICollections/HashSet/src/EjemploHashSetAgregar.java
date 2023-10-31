import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("uno");
        hashSet.add("dos");
        hashSet.add("tres");
        hashSet.add("cuatro");
        hashSet.add("cinco");

        List <String> list = new ArrayList<>(hashSet);

        System.out.println("hashSet = " + hashSet);





        System.out.println("ordenamos la lista");

        Collections.sort(list);
        //al ser string lo ordena alfabeticamente
        System.out.println("list = " + list);
    }
}
