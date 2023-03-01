package it.unipv.sfw.esame.progettoC23.model;

import java.sql.Date;
import java.text.DateFormat;

public class Persona {
	private String Nome,Cognome,CF;
	private String DataNascita;
	
	public Persona(String CF, String Nome, String Cognome, String DataNascita) {
		this.Nome = Nome;
		this.Cognome = Cognome;
		this.CF = CF;
		this.DataNascita = DataNascita;
	}

	public String getCF() {
		return CF;
	}

	public String getNome() {
		return Nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public String getDataNascita() {
		return DataNascita;
	}
	
	@Override
	public String toString() {
		return "Persona: ("+CF+", "+Nome+", "+Cognome+", "+DataNascita+")" + "\n";
	}
	

	
	
	
	
	

	

}
