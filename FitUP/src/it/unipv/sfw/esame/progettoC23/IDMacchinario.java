package it.unipv.sfw.esame.progettoC23;

import java.time.LocalDate;

public class IDMacchinario {
	private String IDMacchinario ;
	private int count = 00;
	
	public IDMacchinario() {
	}

	public String setIDMacchinario(Macchinario Macchinario) {
		
		for (int count = 00; count <= 03; count++) {
			IDMacchinario = Macchinario.getNomeMacchinario() + String.format("%02d",count);
			count++;
			break;
	        }
		//count++;
		return null;
    }

	public String getIDMacchinario() {
		return IDMacchinario;
	}

}
