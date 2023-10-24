package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;
import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args) {

        PersonaDAO personaDAO = new PersonaDAO();


        /*List<Persona> personas = personaDAO.seleccionar();


        for (Persona persona : personas)
        {
            System.out.println(persona);
        }

         */

        Persona personaCreate = new Persona("Deniss", "DRodriguez");
        personaDAO.create(personaCreate);
    }
}
