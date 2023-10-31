import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>((a,b) -> b.compareTo(a));
        treeSet.add("uno");
        treeSet.add("dos");
        treeSet.add("tres");
        treeSet.add("tres");
        treeSet.add("cuatro");
        treeSet.add("cinco");

        Set<Integer> ts = new TreeSet<>(Comparator.reverseOrder());


        System.out.println("treeSet = " + treeSet);

        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);

        System.out.println("ts = " + ts);
    }
}
