package it.unipv.sfw.esame.progettoC23;
import java.util.*;

public class Macchinario {
	
	  private Calendar DataAcquisto; 
	  private TipoMacchinario NomeMacchinario;
	  private String DataUltimaManutenzione;
	 
	  
	  public Macchinario(String dataAcquisto, TipoMacchinario nomeMacchinario, String dataUltimaManutenzione) {
		DataAcquisto = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
		NomeMacchinario = nomeMacchinario;
		this.DataUltimaManutenzione = "N/A"; //data non ancora disponibile visto che la prima manutenzione
		                                     // non è ancora avvenuta
	}


	public String getDataUltimaManutenzione() {
		return DataUltimaManutenzione;
	}
	
	public void setDataUltimaManutenzione(String dataUltimaManutenzione) {
		Calendar DataUltimaManutenzione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	}


	public String getNomeMacchinario() {
		// TODO Auto-generated method stub
		return null;
	}


}
