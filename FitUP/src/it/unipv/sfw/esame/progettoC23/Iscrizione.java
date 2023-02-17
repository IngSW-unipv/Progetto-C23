package it.unipv.sfw.esame.progettoC23;
import java.util.*;

import java.text.DateFormat; // mettere formato data short!!

public class Iscrizione {
	protected String CodiceBadge; 
	protected String CF;
	protected String Nome;
	private String Rinnovo;
	//protected Persona Iscritto; per ora non serve, ho deciso di usare solo CF nel costruttore
	protected Calendar PrimaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	protected Calendar DataRinnovo;
	protected TipoAbbonamento Abbonamento; 
	private final String CodicePalestra = "FitUp";
	
	
	public Iscrizione(String CF, String Nome) {
	this.CF = CF;
	this.Nome=Nome;
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

	public Calendar getPrimaIscrizione () {
		return PrimaIscrizione;
	}

	public void setCodiceBadge(Persona iscritto) {
		CodiceBadge = iscritto.getCF() + CodicePalestra ;
	}


	public String getCodiceBadge() {
		return CodiceBadge;
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
		return "Iscritto: ("+CF+", "+Nome+")";
	}
	
	
	
}
