package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/javacurso?serverTimezone=America/Mexico_City";
    private static final String USERNAME = "root";
    private static final String PASS = "admin";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection==null){
            connection= DriverManager.getConnection(URL,USERNAME,PASS);
        }
        return connection;
    }
}
