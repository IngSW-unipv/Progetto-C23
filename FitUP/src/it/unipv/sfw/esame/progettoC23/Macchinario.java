package it.unipv.sfw.esame.progettoC23;
import java.util.*;

public class Macchinario {
	
	  private Calendar DataAcquisto; 
	  private TipoMacchinario NomeMacchinario;
	  private String DataUltimaManutenzione;
	  
	  public Macchinario(Calendar dataAcquisto, TipoMacchinario nomeMacchinario, String dataUltimaManutenzione) {
		DataAcquisto = dataAcquisto;
		NomeMacchinario = nomeMacchinario;
		DataUltimaManutenzione = dataUltimaManutenzione;
	}

	  
	public Calendar getDataAcquisto() {
		return DataAcquisto;
	}

	public void setDataAcquisto(Calendar dataAcquisto) {
		DataAcquisto = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	}


	public String getDataUltimaManutenzione() {
		return DataUltimaManutenzione;
	}
	
	
	public void setDataUltimaManutenzione(String dataUltimaManutenzione) {
		DataUltimaManutenzione = "N/A";
	}


	public TipoMacchinario getNomeMacchinario() {
		return NomeMacchinario;
	}
	
	/* discutere degli attributi */

}
