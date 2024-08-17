package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static String DB_URL = "jdbc:mysql://localhost:3306/test_database";
    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD = "31nehate";
    public Connection getConnection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

        } catch (SQLException e) {
            e.getMessage();
            System.out.println("Connection Failed");
        }

        return connection;
    }

}
