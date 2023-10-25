package personas.jdbc;

import java.security.PublicKey;
import java.sql.*;

public class Conexion {
    private static final String JDBC_STRING = "";
    private static final String JDBC_URL = "";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "admin";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(PreparedStatement ps) throws SQLException {
        ps.close();
    }

    public static void close(Connection connection) throws SQLException {
        connection.close();
    }

}
