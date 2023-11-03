package Maps;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("email", "jhon.doe@mail.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        System.out.println(persona.get("apellido"));

        //eliminar en Map
        //elimina todo
        //persona.clear();



    }
}
