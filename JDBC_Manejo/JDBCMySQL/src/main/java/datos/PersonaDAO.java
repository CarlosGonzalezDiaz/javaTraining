package datos;

import domain.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaDAO {

    private static final String SELECT = "SELECT * FROM test.persona;";

    public List<Persona> seleccionar(){
        //Driver para conexion a la base de datos con la interfaz de SQL
        Connection conexion = null;
        //se refiere al comando de SQL que se va a ejecutar
        PreparedStatement preparedStatement = null;
        //es el resultado de una ejecucion del querty que se ejecuto
        ResultSet resultSet = null;
        //la clase manda a llamar la info guardada en la clase
        Persona persona = null;
        //al ser mas de 1 resultado generamos un listado de la informacion almacenada
        List<Persona> personas = new ArrayList<>();

        try {
            //asignamos la conexion del Driver de SQL
            conexion = Conexion.getConnection();
            //ejecutamos el Querty de SQL
            preparedStatement = conexion.prepareStatement(SELECT);
            //mandamos a llamar el resultado del QUerty
            resultSet= preparedStatement.executeQuery();
            //al ser mas de 1 resultados mientras allá iformacion va a traer el resultado
            while (resultSet.next())
            {
                int idPersona = resultSet.getInt("id_persona");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("telefono");
                //
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                //
                //agregamos la persona al listado que se va a mostrar
                personas.add(persona);

            }
            //Excepciones de SQL
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                //cerramos las conexiones
                Conexion.close(resultSet);
                Conexion.close(preparedStatement);
                Conexion.close(conexion);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //regresamos el listado
        return personas;
    }

    private static final String UPDATE = "UPDATE test.persona SET nombre =?, apellido=?, email=?, telefono=? WHERE id_Persona=?;";
    public int actualizar(Persona persona){
        Connection conexion = null;
        PreparedStatement preparedStatement = null;
        int actualiza=0;

        try {
            conexion=Conexion.getConnection();
            preparedStatement= conexion.prepareStatement(UPDATE);
            preparedStatement.setString(1, persona.getNombre());
            preparedStatement.setString(2, persona.getApellido());
            preparedStatement.setString(3, persona.getEmail());
            preparedStatement.setString(4, persona.getTelefono());
            preparedStatement.setInt(5,persona.getIdPersona());
            actualiza= preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return actualiza;
    }

    private static final String CREATE = "INSERT INTO test.persona (nombre, apellido, email, telefono) VALUES (?,?,?,?);";

    public int create(Persona persona){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int agregado=0;
        try {
            connection=Conexion.getConnection();
            preparedStatement= connection.prepareStatement(CREATE);
            preparedStatement.setString(1, persona.getNombre());
            preparedStatement.setString(2, persona.getApellido());
            preparedStatement.setString(3, persona.getEmail());
            preparedStatement.setString(4, persona.getTelefono());

            //ExecuteUpdate hace una actualizacion con la base de datos no con la sentencia
            //y se utiliza para sentencias de INSERT, UPDATE y DELETE
            agregado = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                Conexion.close(preparedStatement);
                Conexion.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return agregado;
    }

    private static final String DELETE = "DELETE FROM test.persona WHERE id_persona = ?;";
    public int delete(Persona persona){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int eliminar = 0;

        try {
            connection=Conexion.getConnection();
            preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, persona.getIdPersona());
            eliminar= preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                Conexion.close(preparedStatement);
                Conexion.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return eliminar;
    }



}
