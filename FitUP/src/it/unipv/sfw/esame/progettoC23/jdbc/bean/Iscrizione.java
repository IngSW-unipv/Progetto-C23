package it.unipv.sfw.esame.progettoC23.jdbc.bean;
import java.util.*;

import it.unipv.sfw.esame.progettoC23.TipoAbbonamento;

//DA SISTEMARE PER RISPETTARE PATTERN DAO
import java.sql.Date;

import java.text.DateFormat;
import java.time.LocalDateTime; 

public class Iscrizione{
	protected String CF;
	protected String Nome;
	protected String Cognome;
	protected String DatadiNascita;
	protected String CodiceBadge;
	
	public Iscrizione(String CF, String Nome, String Cognome, String DatadiNascita) {
	
	this.CF = CF;
	this.Nome=Nome;
	this.Cognome=Cognome;
	this.DatadiNascita = DatadiNascita;
	
	}
	
	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}

	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getDatadiNascita() {
		return DatadiNascita;
	}

	public void setDatadiNascita(String datadiNascita) {
		DatadiNascita = datadiNascita;
	}
	
	@Override
	public String toString() {
		return "Iscritto: ("+CF+", "+Nome+", "+Cognome+", "+DatadiNascita+")" + "\n";
	}
	
	
	
}
