package it.unipv.sfw.esame.progettoC23;

import java.text.DateFormat;

public class Persona {
	private String Nome,Cognome,CF, DataNascita;
	
	public Persona(String Nome, String Cognome, String CF, String DataNascita) {
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

	

}
