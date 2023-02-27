package it.unipv.sfw.esame.progettoC23;
import java.util.*;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;


public class ManutenzioneMacchinario {
    public String DataAcquisto;
    private String DataManutenzione;
    private String NomeMacchinario;
	private String IDMacchinario;
	public static StatoAttuale Stato;
	
	public ManutenzioneMacchinario(String IDMacchinario, String DataAcquisto) {
		this.IDMacchinario = IDMacchinario;
		this.DataAcquisto = DataAcquisto;
	}	
	
	 public String getDataAcquisto() {
		return DataAcquisto; 
	}

	public String setDataAcquisto(GestioneMacchinario GM) {
		return DataAcquisto;
	}
	

	public String getDataManutenzione() {
		return DataManutenzione;
	    }

	public static StatoAttuale getStato() {
		return Stato;
	}

	public String setDataManutenzione(StatoAttuale Stato) {
		this.Stato = Stato;
		
		switch(Stato) {
		case FUNZIONANTE:
			String arr[];
			int mese, anno;
			if (DataManutenzione == null) {
				arr = DataAcquisto.split("/");
				 mese = Integer.parseInt(arr[1]);
				 anno = Integer.parseInt(arr[2]);
				
				mese+=6;
				
				if (mese > 12) {
					mese-=12;
					anno++;
				}
			} else {
					 arr = DataManutenzione.split("/");
					 mese = Integer.parseInt(arr[1]);
					 anno = Integer.parseInt(arr[2]);
					
					mese+=6;
					
					if (mese > 12) {
						mese-=12;
						anno++; 
						}
			} 
			DataManutenzione = arr[0] +"/" + mese + "/" + anno;
			break;
			
		case GUASTO:
			System.out.println( "Macchinario guasto, chiamare l'assistenza");
			DataManutenzione = "Da definire";
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
