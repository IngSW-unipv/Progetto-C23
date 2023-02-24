package it.unipv.sfw.esame.progettoC23.jdbc.bean;
import java.util.*;

import it.unipv.sfw.esame.progettoC23.Macchinario;
import it.unipv.sfw.esame.progettoC23.StatoAttuale;
import it.unipv.sfw.esame.progettoC23.TipoMacchinario;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;

public class GestioneMacchinario {
    private String NomeMacchinario;
    private String DataAcquisto;
    private LocalDate DAq; 
    private String ManutenzioneMacchinario;
    private String IDMacchinario;
    private LocalDate DataManutenzione;
    private StatoAttuale Stato;
	public LocalDate getDataAcquisto;
	   

public GestioneMacchinario(String nomeMacchinario, String iDMacchinario, String dataAcquisto) {
	this.NomeMacchinario = nomeMacchinario;
	this.DataAcquisto = dataAcquisto;
	//this.IDMacchinario = iDMacchinario; 
}

public String getDataAcquisto() {
	return DataAcquisto; 
}

public LocalDate setDataAcquisto(Macchinario M) {
    LocalTime.parse(DataAcquisto);
	return getDataAcquisto;
}


public String getNomeMacchinario() {
	return NomeMacchinario;
}


public void setNomeMacchinario(String nomeMacchinario) {
	NomeMacchinario = nomeMacchinario;
}

public String getIDMacchinario() {
	// TODO Auto-generated method stub
	return null;
}

public void setDataManutenzione(StatoAttuale Stato) {
	this.Stato = Stato;
	
	switch(Stato) {
	case FUNZIONANTE:
		DAq.plusMonths(6);
		break;
		
	case GUASTO:
		System.out.println( "Macchinario guasto, chiamare l'assistenza");
		break;
	    }
    }


public  LocalDate getDataManutenzione() {
	return DAq; 
}

@Override
public String toString() {
	//DataManutenzione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	return "Macchinario: ("+NomeMacchinario+", "+IDMacchinario+", "+DataAcquisto+")" +"\n";
}

}