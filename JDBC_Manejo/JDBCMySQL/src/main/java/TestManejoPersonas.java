import datos.PersonaDAO;
import domain.Persona;

import java.util.List;
import java.util.Scanner;

public class TestManejoPersonas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PersonaDAO personaDAO = new PersonaDAO();

        Persona personaInsert = new Persona();
        System.out.println("Agrega el nombre = ");
        personaInsert.setNombre(scanner.nextLine());
        System.out.println("Agrega el apellido = ");
        personaInsert.setApellido(scanner.nextLine());
        System.out.println("Agrega el email = ");
        personaInsert.setEmail(scanner.nextLine());
        System.out.println("Agrega el telefono");
        personaInsert.setTelefono(scanner.nextLine());
        personaDAO.create(personaInsert);

        Persona personaUpdate = new Persona();
        


        List<Persona> personas = personaDAO.seleccionar();
        for (Persona persona : personas){
            System.out.println(persona);
        }

    }
}
