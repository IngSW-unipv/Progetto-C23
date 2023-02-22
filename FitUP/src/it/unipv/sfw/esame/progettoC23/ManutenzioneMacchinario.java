package it.unipv.sfw.esame.progettoC23;
import java.util.*;

public class ManutenzioneMacchinario {
	private Calendar DataAcquisto;
	private Calendar DataUltimaManutenzione;
	private StatoAttuale Stato;
	
	public ManutenzioneMacchinario(String IDMacchinario) {
	}

	public void setDataUltimaManutenzione(StatoAttuale Stato) {
		this.Stato = Stato;
		
		switch(Stato) {
		case FUNZIONANTE:
			DataUltimaManutenzione.add(Calendar.MONTH, +6);
			break;
			
		case GUASTO:
			System.out.println(GestioneMacchinario.getIDMacchinario() + "è guasto: Chiamare l'assistenza");
			break;
		    }
	    }
	
	public Calendar getDataUltimaManutenzione() {
		return DataAcquisto;
	}
	
}
