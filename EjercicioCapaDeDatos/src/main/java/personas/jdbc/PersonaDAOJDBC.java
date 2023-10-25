package personas.jdbc;

import personas.dto.PersonaDTO;

import java.util.List;

public class PersonaDAOJDBC implements IPersonaDAO{

    private final String SQL_SELECT = "SELECT * from ;";
    private final String SQL_INSERT = "INSERT INTO  (nombre, apellido) VALUES (?,?)";
    private final String SQL_UPDATE = "UPDATE   SET nombre = ?, apellido = ? WHERE id_persona = ?";
    private final String SQL_DELETE = "DELETE FROM  WHERE id_persona = ?;";

    @Override
    public int insert(PersonaDTO personaDTO) {
        return 0;
    }

    @Override
    public int update(PersonaDTO personaDTO) {
        return 0;
    }

    @Override
    public int delete(PersonaDTO personaDTO) {
        return 0;
    }

    @Override
    public List<PersonaDTO> select() {
        return null;
    }

    public PersonaDAOJDBC(){}




}
