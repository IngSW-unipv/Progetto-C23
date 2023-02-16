package it.unipv.sfw.esame.progettoC23;

import java.util.*;

public class IscrizioneCorso {
	
	private TipoCorso CorsoScelto;
	private Iscrizione CodiceBadge;
	private Corso setN_Iscritti;
	
	// se il corso scelto serve ad incrementare corso al massimo mettere getter and setter, se l'incremento
	// o decremento del corso lo faccio in questa classe lascio l'attributo privato.
	
	public IscrizioneCorso (Iscrizione CodiceBadge, TipoCorso CorsoScelto) {
		
		this.CodiceBadge = CodiceBadge;
		this.CorsoScelto = CorsoScelto;
		
	} 
	
	public void SceltaCorso (Iscrizione CodiceBadge, TipoCorso CorsoScelto) {
		
		switch (CorsoScelto) {
		
		case CROSSFIT:
			// Aggiungo l'iscritto al corso di crossfit 
		
		case YOGA:
		
		case ZUMBA:
		
		case PILATES:
		}
	}
	

}
