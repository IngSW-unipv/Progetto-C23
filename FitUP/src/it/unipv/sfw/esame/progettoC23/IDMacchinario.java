package it.unipv.sfw.esame.progettoC23;

import java.time.LocalDate;

public class IDMacchinario {
	private String IDMacchinario;
	private String DataAcquisto;
	
	public IDMacchinario() {
	}
	
	public void setDataAcquisto(Macchinario M) {
	}
	
	public String getDataAcquisto(Macchinario M) {
		return DataAcquisto;
	}

	public void setIDMacchinario(Macchinario M) {
	
		IDMacchinario = M.getNomeMacchinario() +  M.DataAcquisto.replace("/","");
	    }
	
	public String getIDMacchinario() {
		return IDMacchinario;
	}

}
