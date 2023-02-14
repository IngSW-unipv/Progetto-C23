package it.unipv.sfw.esame.progettoC23;
import java.util.*;

public class Macchinario {
	
	  private Calendar DataAcquisto; 
	  private TipoMacchinario NomeMacchinario;
	  private String DataUltimaManutenzione;
	 
	  
	public Macchinario(String dataAcquisto, TipoMacchinario nomeMacchinario, String DataUltimaManutenzione) {
		DataAcquisto = DataAcquisto;
		NomeMacchinario = nomeMacchinario;
		this.DataUltimaManutenzione = "N/A"; //data non ancora disponibile visto che la prima manutenzione
		                                     // non è ancora avvenuta
	}


	public TipoMacchinario getNomeMacchinario() {
		return NomeMacchinario;
	}

	//public void getDataUltimaManutenzione(Calendar dataUltimaManutenzione) {
		//DataUltimaManutenzione = DataAcquisto;
	//}
	

}
