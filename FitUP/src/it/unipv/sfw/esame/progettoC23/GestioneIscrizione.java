package it.unipv.sfw.esame.progettoC23;
import java.util.*;

import java.text.DateFormat; // mettere formato data short!!

public class GestioneIscrizione {
	private String CodiceBadge; 
	private String Rinnovo;
	protected Persona Iscritto;
	protected Calendar PrimaIscrizione;
	protected Calendar DataRinnovo;
	protected TipoAbbonamento Abbonamento; 
	private final String CodicePalestra = "FitUp";
	
	
	public GestioneIscrizione(Persona iscritto,TipoAbbonamento abbonamento) 
	{
	this.Iscritto = iscritto;
	this.PrimaIscrizione =  Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	this.Abbonamento = abbonamento; 
	
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
	
	
	
}
