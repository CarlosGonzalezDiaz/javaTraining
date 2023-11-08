package EjemploPredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate = param -> param.isEmpty();
        System.out.println(predicate.test("Hola"));

        Predicate<Integer> predicate1 = num->num<10;
        System.out.println(predicate1.test(5));

        BiPredicate<String, String> predicate2 = (a,b)-> a.equals(b);
        System.out.println(predicate2.test("carlos","Carlos"));


    }
}
