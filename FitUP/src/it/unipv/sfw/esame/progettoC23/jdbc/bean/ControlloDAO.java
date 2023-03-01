package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import it.unipv.sfw.esame.progettoC23.jdbc.util.Connessione;

public class ControlloDAO {
	
	private Connection connDB;
	private String schema;
	ArrayList<Iscrizione> iscr;
	
	public ControlloDAO() {
		super();
		this.schema = "palestra";	
		
	}
	

	
	
	
}
