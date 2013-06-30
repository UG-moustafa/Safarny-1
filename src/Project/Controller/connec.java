/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AbdelRahman
 */
public class connec {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/travel";
    private static String username = "root";
    private static String password = "root";
    private static Connection connection;
//    static com.mysql.jdbc.Connection ge;

    private static void connect() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            System.out.println("Error in Connection" + ex);
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            connect();
        }
        return connection;
    }

    public static void disconnect() {
        try {
            if (connection != null) {
                connec.connection.close();
            }
        } catch (SQLException ex) {
        }
    }
}