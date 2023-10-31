import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicadoConHash {

    public static void main(String[] args) {
        String[] peces = {"Corvina", "Robalo", "Atun", "Lenguado", "Pejerrey", "Lenguado", "Corvina"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez : peces)
        {
            if (!unicos.add(pez)){
                duplicados.add(pez);

            }
        }
        System.out.println("el elemento duplicado es = " + duplicados);
        unicos.removeAll(duplicados);
        System.out.println(unicos.size() + " elementos no duplicados = " + unicos);
    }
}
