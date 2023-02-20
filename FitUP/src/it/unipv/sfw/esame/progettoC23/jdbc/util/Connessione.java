package it.unipv.sfw.esame.progettoC23.jdbc.util;
import java.sql.*;
import java.io.FileInputStream;

public class Connessione {
	
	
	private static String username;
	private static String password;
	//private static String DbDriver;
	private static String DbURL;
	private static Connessione conn;
	
	
	public static Connection startConnection(Connection conn, String schema) {
		
		//DbDriver = "com.mysql.cj.jdbc.Driver";
		DbURL = "jdbc:mysql://34.154.156.117:3306/"+schema;
		username = "root";
		password = "";
		
		if (isOpen(conn))
			closeConnection(conn);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(DbURL, username, password);
		}
		catch (Exception e) {
			
			e.printStackTrace();
			return null;
			
		}
		return conn;
		
		
	}

	private static boolean isOpen(Connection conn) {
		if (conn == null)
			return false;
		else
			return true;
	}

	static Connection closeConnection(Connection conn) {
		if (!isOpen (conn))
			return null;
		try {
			conn.close();
			conn = null;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		return conn;
		
	}

	public static Connessione startConnection(Connessione conn, String schema) {
		
		return null;
	}
	
	

}