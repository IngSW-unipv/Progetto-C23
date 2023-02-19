package it.unipv.sfw.esame.progettoC23;
import java.util.*;
import java.sql.Date;

import java.text.DateFormat;
import java.time.LocalDateTime; 

public class Iscrizione{
	protected String CF;
	protected String Nome;
	protected String Cognome;
	protected String DatadiNascita;
	protected String CodiceBadge;
	private String Rinnovo;
	protected Calendar PrimaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	protected Calendar DataRinnovo;
	protected TipoAbbonamento Abbonamento; 
	
	public Iscrizione(String CF, String Nome, String Cognome, String DatadiNascita, String CodiceBadge) {
	
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
	
	

	public Calendar getPrimaIscrizione () {
		return PrimaIscrizione;
	}

	
	public void setDataRinnovo(TipoAbbonamento Abbonamento) {
		
	this.Abbonamento = Abbonamento;
	//this.PrimaIscrizione = PrimaIscrizione;
		
		
		switch (Abbonamento) {
		case MENSILE:	
			PrimaIscrizione.add(Calendar.MONTH, +1);
			break;
		case SEMESTRALE:
			PrimaIscrizione.add(Calendar.MONTH, +6);
			break;
		case ANNUALE:
			PrimaIscrizione.add(Calendar.YEAR, +1);
			break;
			
		}
	}
	
	public Calendar getDataRinnovo() {
		return PrimaIscrizione;
	}
	
	@Override
	public String toString() {
		return "Iscritto: ("+CF+", "+Nome+", "+Cognome+", "+DatadiNascita+", "+CodiceBadge+")" + "\n";
	}
	
	
	
}
