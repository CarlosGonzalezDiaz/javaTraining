package datos;

import java.sql.*;

public class Conexion {

    private static final String URL= "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "admin";

    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(URL,JDBC_USER, JDBC_PASS);
    }

    public static void close(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

    public static void close(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    public static void close(Connection connection) throws SQLException {
        connection.close();
    }

}
