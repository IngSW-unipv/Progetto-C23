package it.unipv.sfw.esame.progettoC23;
import java.util.*;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;


public class ManutenzioneMacchinario {
	// private String DataAcquisto;
    public String DataAcquisto;
    //private Date format;
    private static Calendar DataManutenzione;
    private String NomeMacchinario;
	private String IDMacchinario;
   // private  LocalDate DAq; 
	public static StatoAttuale Stato;
	
	public ManutenzioneMacchinario(String IDMacchinario, String DataAcquisto) {
		this.IDMacchinario = IDMacchinario;
		this.DataAcquisto = DataAcquisto;
	}	
	
	 public String getDataAcquisto() {
		return DataAcquisto; 
	}

	public void setDataAcquisto() {
	}
	

	public static Calendar getDataManutenzione() {
		
		return DataManutenzione;
	    }

	public static StatoAttuale getStato() {
		return Stato;
	}

	public Calendar setDataManutenzione(StatoAttuale Stato) {
		this.Stato = Stato;
		
		switch(Stato) {
		case FUNZIONANTE:
			 Calendar cal = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy", Locale.ITALY);
				try {
					cal.setTime(sdf.parse(DataAcquisto));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			
	        cal.add(Calendar.MONTH, +6);
			System.out.println("Macchinario funzionante, manutenzione tra sei mesi");
	        return cal;
			
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
