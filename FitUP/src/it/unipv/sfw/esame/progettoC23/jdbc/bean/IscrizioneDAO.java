package it.unipv.sfw.esame.progettoC23.jdbc.bean;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import it.unipv.sfw.esame.progettoC23.Badge;
import it.unipv.sfw.esame.progettoC23.jdbc.util.Connessione;

public class IscrizioneDAO implements IIscrizioneDAO {
	
	private Connection connDB;
	private String schema;
	ArrayList<Iscrizione> iscr;
	
	public IscrizioneDAO() {
		super();
		this.schema = "palestra";	
		
	}
	
	@Override
	public ArrayList<Iscrizione> selectAll() {
		
			iscr= new ArrayList<>();	
			connDB = Connessione.startConnection(connDB, schema);
			Statement st1;
			ResultSet rs1;
			
			try
			{
				st1= connDB.createStatement();
				String query= "SELECT * from ISCRITTO";
				rs1=st1.executeQuery(query);
				
				while(rs1.next())
				{
					Iscrizione i = new Iscrizione(rs1.getString(1), rs1.getString(2), rs1.getString(3),rs1.getString(4));
					iscr.add(i);
				}
			}catch (Exception e) {e.printStackTrace();}
			return iscr;
	}
	
	
	@Override
	public boolean insertIscritto(Iscrizione i)   {
		
		connDB = Connessione.startConnection(connDB, schema);
		PreparedStatement st1;
		
		boolean esito = true;
		
		try
		{
			String query= "INSERT INTO ISCRITTO(CF,NOME,COGNOME,DATADINASCITA) VALUES(?,?,?,?)";
			
			st1=connDB.prepareStatement(query);
			st1.setString(1, i.getCF());
			st1.setString(2, i.getNome());
			st1.setString(3, i.getCognome());
			st1.setString(4, i.getDatadiNascita());

			st1.executeUpdate();
			
					
		}catch (Exception e) {
			e.printStackTrace();
			esito=false;
		}
		
		
		Connessione.closeConnection(connDB);
		return esito;
	}

}
