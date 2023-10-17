import jdk.nashorn.internal.ir.WhileNode;

import java.sql.*;

public class test {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String select = "SELECT id_persona, nombre, apellido, telefono, email FROM test.persona ";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL,"root", "admin");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(select);
            while (resultSet.next())
            {
                System.out.print("ID = " + resultSet.getInt("id_persona"));
                System.out.print(", nombre = " + resultSet.getString("nombre"));
                System.out.print(", apellido = " + resultSet.getString("apellido"));
                System.out.print(", telefono = " + resultSet.getString("telefono"));
                System.out.println(", email = " + resultSet.getString("email"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
