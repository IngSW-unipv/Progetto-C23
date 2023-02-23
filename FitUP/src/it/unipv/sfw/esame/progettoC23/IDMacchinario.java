package it.unipv.sfw.esame.progettoC23;

import java.time.LocalDate;

public class IDMacchinario {
	private String IDMacchinario ;
	private int count = 00;
	
	public IDMacchinario() {
	}


	public String setIDMacchinario(Macchinario Macchinario) {
		
		for (int i = 00; i < 20 ; i++) {
			IDMacchinario = Macchinario.getNomeMacchinario() + String.valueOf(count);
			//System.out.println("ID Macchinario: " + IDMacchinario);
			count++;
			
	        }
		//count++;
		//System.out.println(IDMacchinario);
		return IDMacchinario;
    }


	public String getIDMacchinario() {
		return IDMacchinario;
	}

}
