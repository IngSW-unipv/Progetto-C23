package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import it.unipv.sfw.esame.progettoC23.jdbc.util.Connessione;
import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;

public class GestioneMacchinarioDAO<Connection> implements IGestioneMacchinarioDAO {
	private Connection connDB;
	private String schema;
	ArrayList<GestioneMacchinario> gm;
	
	public GestioneMacchinarioDAO() {
		super();
		this.schema = "palestra";	
		
	}
	
	@Override
	public ArrayList<GestioneMacchinario> selectAll() {
		
			gm= new ArrayList<>();	
			connDB = Connessione.startConnection(connDB, schema);
			Statement st1;
			ResultSet rs1;
			
			try
			{
				st1= connDB.createStatement();
				String query= "SELECT * from MACCHINARIO";
				rs1=st1.executeQuery(query);
				
				while(rs1.next())
				{
					GestioneMacchinario gest = new GestioneMacchinario(rs1.getString(1), rs1.getString(2));
					gm.add(gest);
				}
			}catch (Exception e) {e.printStackTrace();}
			return gm;
	}
	
	
	@Override
	public boolean insertMacchinario(GestioneMacchinario gm)   {
		
		connDB = Connessione.startConnection(connDB, schema);
		PreparedStatement st1;
		
		boolean esito = true;
		
		try
		{
			String query= "INSERT INTO MACCHINARIO(NOME,DATAACQUISTO) VALUES(?,?)";
			
			st1=connDB.prepareStatement(query);
			st1.setString(1, gm.getNomeMacchinario());
			st1.setString(2, gm.getDataAcquisto());

			st1.executeUpdate();
			
					
		}catch (Exception e) {
			e.printStackTrace();
			esito=false;
		}
		
		
		Connessione.closeConnection(connDB);
		return esito;
	}

}
