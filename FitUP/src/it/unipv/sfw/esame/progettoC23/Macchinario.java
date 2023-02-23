package it.unipv.sfw.esame.progettoC23;
import java.util.*;

public class Macchinario {
	
	private String NomeMacchinario;
	public String DataAcquisto;
	  
	 public Macchinario(String nomeMacchinario, String DataAcquisto) {
	  NomeMacchinario = nomeMacchinario;
	  this.DataAcquisto = DataAcquisto;
	}

	  
	 public String getDataAcquisto() {
		return DataAcquisto;
	}
	 

	public void setDataAcquisto(String dataAcquisto) {
		DataAcquisto = dataAcquisto;
	}


	public String getNomeMacchinario() {
		return NomeMacchinario;
	}
	
	@Override
	public String toString() {
		return "Macchinario: ("+NomeMacchinario+", "+DataAcquisto+")" + "\n";
	}

}
