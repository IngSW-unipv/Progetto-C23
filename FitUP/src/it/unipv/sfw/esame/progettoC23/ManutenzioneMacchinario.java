package it.unipv.sfw.esame.progettoC23;
import java.util.*;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;


public class ManutenzioneMacchinario {
    public String DataAcquisto;
    private static LocalDate DataManutenzione;
    private String NomeMacchinario;
	private String IDMacchinario;
    private  LocalDate DAq; 
	public static StatoAttuale Stato;
	
	public ManutenzioneMacchinario(String IDMacchinario, String DataAcquisto) {
		this.IDMacchinario = IDMacchinario;
		this.DataAcquisto = DataAcquisto;
	}	
	
	 public String getDataAcquisto() {
		return DataAcquisto; 
	}

	public LocalDate setDataAcquisto(GestioneMacchinario GM) {
		this.DAq = LocalDate.parse(GM.getDataAcquisto());
		return DAq;
	}
	

	public static LocalDate getDataManutenzione() {
		return DataManutenzione;
	    }

	public static StatoAttuale getStato() {
		return Stato;
	}

	public LocalDate setDataManutenzione(StatoAttuale Stato) {
		this.Stato = Stato;
		//this.DAq = LocalDate.parse(getDataAcquisto());
		
		switch(Stato) {
		case FUNZIONANTE:
			//DAq.plusMonths(6);
			break;
			
		case GUASTO:
			System.out.println( "Macchinario guasto, chiamare l'assistenza");
		    }
		return DataManutenzione;
	}

	public String getNomeMacchinario() {
		// TODO Auto-generated method stub
		return NomeMacchinario;
	}

	public String getIDMacchinario() {
		// TODO Auto-generated method stub
		return IDMacchinario;
	}
	
}
