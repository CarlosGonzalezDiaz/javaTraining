package datos;

import domain.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {
    private static final String SELECT = "SELECT * FROM user.usuario;";
    private static final String UPDATE = "UPDATE user.usuario SET usuario = ?, pass = ? WHERE id_usuario = ?;";
    private static final String CREATE = "INSERT INTO user.usuario (usuario, pass) VALUES (?,?);";
    private static final String DELETE = "DELETE FROM user.usuario WHERE id_usuario = ?";

    public List<Persona> seleccionar(){
        Connection connection = null;
        ResultSet resultSet= null;
        PreparedStatement preparedStatement = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();


        try {
            connection= Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SELECT);
            resultSet= preparedStatement.executeQuery();
            while (resultSet.next())
            {
                int idPersona = resultSet.getInt("id_usuario");
                String usuario = resultSet.getString("usuario");
                String password = resultSet.getString("pass");

                persona = new Persona(idPersona, usuario, password);
                personas.add(persona);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                Conexion.close(resultSet);
                Conexion.close(preparedStatement);
                Conexion.close(connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return personas;
    }

    public int create(Persona persona)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int modificar = 0;

        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement(CREATE);
            preparedStatement.setString(1, persona.getUsuario());
            preparedStatement.setString(2, persona.getPass());
            modificar = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                Conexion.close(preparedStatement);
                Conexion.close(connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return modificar;
    }

}
