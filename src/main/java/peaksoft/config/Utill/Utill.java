package peaksoft.config.Utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utill {
    private final static String url="jdbc:postgresql://localhost:5432/file2";
    private final static String username="postgres";
    private final static String password = "postgres";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }





}
