package it.unipv.sfw.esame.progettoC23;
import java.sql.*;
import java.util.*;

public class IscrizioneDAO {
	
	private Connection connDB;
	private String schema;
	ArrayList<Iscrizione> iscr;
	
	public IscrizioneDAO() {
		
		iscr= new ArrayList<>();
		
	}
	
	public ArrayList<Iscrizione> selectAll(){
	
			connDB = Connessione.startConnection(connDB, schema);
			Statement st1;
			ResultSet rs1;
			
			try
			{
				st1= connDB.createStatement();
				String query= "SELECT * from palestra.iscritto";
				rs1=st1.executeQuery(query);
				
				while(rs1.next())
				{
					Iscrizione i = new Iscrizione(rs1.getString(1));
					iscr.add(i);
				}
			}catch (Exception e) {e.printStackTrace();}
			return iscr;
	}
	
	public boolean insertIscritto(Iscrizione i) {
		
		connDB = Connessione.startConnection(connDB, schema);
		PreparedStatement st1;
		
		boolean esito = true;
		
		try
		{
			String query= "palestra.iscritto(CF) VALUES (?)";
			st1=connDB.prepareStatement(query);
			st1.setString(1, i.getCF());
			
			st1.executeUpdate(query);
					
		}catch (Exception e) {
			e.printStackTrace();
			esito=false;
		}
		
		Connessione.closeConnection(connDB);
		return esito;
	}

}
