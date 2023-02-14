package it.unipv.sfw.esame.progettoC23;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// classe che va cretata per consentire la connessione con un db

public class Connessione {
	
	public static Connection iniziaConnessione(Connection conn, String schema) {
		
		String DbDriver = null;
		String DbURL = null;
		String username = null;
		String password = null;
		
		DbDriver = "com.mysql.jdbc.Driver";
		DbURL = "jdbc:mysql://jdbc:mysql://localhost:3306/?user=root/"+schema;
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

	private static Connection closeConnection(Connection conn) {
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
