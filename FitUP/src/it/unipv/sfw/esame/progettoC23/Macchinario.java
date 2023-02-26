package it.unipv.sfw.esame.progettoC23;
import java.time.LocalDate;
import java.util.*;

public class Macchinario {
	
	public String NomeMacchinario;
	public String DataAcquisto;
	  
	 public Macchinario(String nomeMacchinario, String DataAcquisto) {
	  NomeMacchinario = nomeMacchinario;
	  this.DataAcquisto = DataAcquisto;
	}

	  
	 public String getDataAcquisto() {
		return DataAcquisto;
	}


	public String getNomeMacchinario() {
		return NomeMacchinario;
	}
	
	@Override
	public String toString() {
		return "Macchinario: ("+NomeMacchinario+", "+DataAcquisto+")" + "\n";
	}

}
