package it.unipv.sfw.esame.progettoC23;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;


public class ManutenzioneMacchinario {
	// private String DataAcquisto;
    private String DataAcquisto;
    //private Date format;
    private Calendar DataManutenzione;
	private String IDMacchinario;
   // private  LocalDate DAq; 
	private StatoAttuale Stato;
	
	public ManutenzioneMacchinario(String IDMacchinario, String DataAcquisto) {
		this.IDMacchinario = IDMacchinario;
		this.DataAcquisto = DataAcquisto;
	}	
	
	 public String getDataAcquisto() {
		/*  Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy", Locale.ITALY);
			try {
				cal.setTime(sdf.parse(DataAcquisto));
			} catch (ParseException e) {
				e.printStackTrace();
			} */
		return DataAcquisto; 
	}

	public void setDataAcquisto() {
	}
	

	public Calendar getDataManutenzione() {
		
		return DataManutenzione;
	    }

	public Calendar setDataManutenzione(StatoAttuale Stato) {
		
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
	
}
