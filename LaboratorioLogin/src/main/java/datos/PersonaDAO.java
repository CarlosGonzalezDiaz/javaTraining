package datos;

import domain.Persona;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {
    private static final String SELECT = "SELECT * FROM test.usuario";
    private static final String UPDATE = "UPDATE test.usuario SET usuario = ?, pass = ? WHERE id_usuario = ?;";
    private static final String CREATE = "INSERT into test.usuario (usuario, pass) VALUES (?,?)";
    private static final String DELETE = "DELETE FROM test.usuario WHERE id_usuario = ?";

    public List<Persona> seleccionar(){
        Connection connection = null;
        List<Persona> personas = new ArrayList<>();
        return personas;
    }

}
