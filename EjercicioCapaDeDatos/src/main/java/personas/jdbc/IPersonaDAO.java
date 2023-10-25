package personas.jdbc;

import personas.dto.PersonaDTO;

import java.util.List;

public interface IPersonaDAO {
    int insert(PersonaDTO personaDTO);
    int update(PersonaDTO personaDTO);
    int delete(PersonaDTO personaDTO);
    List<PersonaDTO> select();

}
