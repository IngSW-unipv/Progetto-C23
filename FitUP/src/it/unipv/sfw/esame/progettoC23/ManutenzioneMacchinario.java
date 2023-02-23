package it.unipv.sfw.esame.progettoC23;
import java.util.*;
import java.time.*;
import java.text.*;


public class ManutenzioneMacchinario {
   // private String DataAcquisto;
    private String DataAcquisto;
    private LocalDate DataManutenzione;
	private String IDMacchinario;
    private  LocalDate DAq; 
	private StatoAttuale Stato;
	
	public ManutenzioneMacchinario(String IDMacchinario, String DataAcquisto) {
		this.DataAcquisto = DataAcquisto;
	}	
	
	public String getDataAcquisto() {
		return DataAcquisto; 
	}

	public String setDataAcquisto(Macchinario M) {
	    LocalTime.parse(DataAcquisto);
		return DataAcquisto;
	}


	public void setDataManutenzione(StatoAttuale Stato) {
		this.Stato = Stato;
		
		switch(Stato) {
		case FUNZIONANTE:
			DAq.plusMonths(6);
			break;
			
		case GUASTO:
			System.out.println( "Macchinario guasto, chiamare l'assistenza");
			
			break;
		    }
	    }
	
	public LocalDate getDataManutenzione() {
		return DataManutenzione; 
	}


	/*

	public void setDataManutenzione(StatoAttuale Stato) {
		this.Stato = Stato;
		
		switch(Stato) {
		case FUNZIONANTE:
			DataManutenzione = LocalDate.plusMonths(6);
			break;
			
		case GUASTO:
			System.out.println("Macchinario guasto, chiamare l'assistenza");
			// DataManutenzione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
			break;
		    }
	    }
	
	public void setDataManutenzione(LocalDate dataManutenzione) {
		DataManutenzione = dataManutenzione;
	}

*/
	
}
