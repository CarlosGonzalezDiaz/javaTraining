import datos.PersonaDAO;
import domain.Persona;

import java.util.List;
import java.util.Scanner;

public class TestManejoPersonas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PersonaDAO personaDAO = new PersonaDAO();

        /*Persona personaInsert = new Persona();
        System.out.println("Agrega el nombre = ");
        personaInsert.setNombre(scanner.nextLine());
        System.out.println("Agrega el apellido = ");
        personaInsert.setApellido(scanner.nextLine());
        System.out.println("Agrega el email = ");
        personaInsert.setEmail(scanner.nextLine());
        System.out.println("Agrega el telefono = ");
        personaInsert.setTelefono(scanner.nextLine());
        personaDAO.create(personaInsert);
         */



        /*Persona personaUpdate = new Persona();
        System.out.println("Agrega el nombre que quieres cambiar = ");
        personaUpdate.setNombre(scanner.nextLine());
        System.out.println("Agrega el apellido que quieres cambiar = ");
        personaUpdate.setApellido(scanner.nextLine());
        System.out.println("Agrega el email que quieres cambiar= ");
        personaUpdate.setEmail(scanner.nextLine());
        System.out.println("Agrega el telefono que quieres cambiar =");
        personaUpdate.setTelefono(scanner.nextLine());
        System.out.println("de que ID quieres cambiarlo?");
        personaUpdate.setIdPersona(scanner.nextInt());
        personaDAO.actualizar(personaUpdate);

         */

        /*Persona personaDelete = new Persona();
        System.out.println("cual es el ID del registro que quieres eliminar? = ");
        personaDelete.setIdPersona(scanner.nextInt());
        personaDAO.delete(personaDelete);
        */


        List<Persona> personas = personaDAO.seleccionar();
        for (Persona persona : personas){
            System.out.println(persona);
        }

    }
}
