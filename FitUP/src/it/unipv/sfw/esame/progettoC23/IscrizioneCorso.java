package it.unipv.sfw.esame.progettoC23;

import java.util.Date;

public class IscrizioneCorso extends Iscrizione{
	private Corso CorsoScelto;
	// se il corso scelto serve ad incrementare corso al massimo mettere getter and setter, se l'incremento
	// o decremento del corso lo faccio in questa classe lascio l'attributo privato.
	public IscrizioneCorso(Iscrizione iscritto, Corso CorsoScelto){
		super();
		this.CodiceBadge=CodiceBadge;
		this.CorsoScelto=CorsoScelto;
	} 
	

}
