package it.unipv.sfw.esame.progettoC23.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connessione {


    private static String username;
    private static String password;
    //private static String DbDriver;
    private static String DbURL;
    private static Connessione conn;


    public static Connection startConnection(Connection connDB, String schema) {

        //DbDriver = "com.mysql.cj.jdbc.Driver";
        DbURL = "jdbc:mysql://34.154.46.196:3306/" + schema;
        username = "root";
        password = "";

        if (isOpen(connDB))
            closeConnection(connDB);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connDB = DriverManager.getConnection(DbURL, username, password);
        } catch (Exception e) {

            e.printStackTrace();
            return null;

        }
        return connDB;


    }

    private static boolean isOpen(Connection conn) {
        if (conn == null)
            return false;
        else
            return true;
    }

    public static Connection closeConnection(Connection conn) {
        if (!isOpen(conn))
            return null;
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return conn;

    }


}
