package personas.jdbc;

import personas.dto.PersonaDTO;

import java.sql.SQLException;
import java.util.List;

public class PersonaDAOJDBC implements IPersonaDAO{

    private final String SQL_SELECT = "SELECT * from ;";
    private final String SQL_INSERT = "INSERT INTO  (nombre, apellido) VALUES (?,?)";
    private final String SQL_UPDATE = "UPDATE   SET nombre = ?, apellido = ? WHERE id_persona = ?";
    private final String SQL_DELETE = "DELETE FROM  WHERE id_persona = ?;";

    public PersonaDAOJDBC(){}


    @Override
    public int insert(PersonaDTO personaDTO) throws SQLException {
        return 0;
    }

    @Override
    public int update(PersonaDTO personaDTO) throws SQLException {
        return 0;
    }

    @Override
    public int delete(PersonaDTO personaDTO) throws SQLException {
        return 0;
    }

    @Override
    public List<PersonaDTO> select() throws SQLException {
        return null;
    }
}
