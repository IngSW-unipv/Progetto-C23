package it.unipv.sfw.esame.progettoC23.jdbc.bean;
import java.util.*;

import it.unipv.sfw.esame.progettoC23.Macchinario;
import it.unipv.sfw.esame.progettoC23.StatoAttuale;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;

public class GestioneMacchinario {
    private String NomeMacchinario;
    public String DataAcquisto;
    private LocalDate DAq; 
    private String ManutenzioneMacchinario;
    private String IDMacchinario;
    private LocalDate DataManutenzione;
    private static StatoAttuale Stato;
	   

public GestioneMacchinario(String nomeMacchinario, String iDMacchinario, String dataAcquisto) {
	this.NomeMacchinario = nomeMacchinario;
	this.DataAcquisto = dataAcquisto;
	//this.IDMacchinario = iDMacchinario; 
}

public String getDataAcquisto() {
	return DataAcquisto; 
}

public String setDataAcquisto(Macchinario M) {
    LocalDate.parse(M.DataAcquisto);
	return DataAcquisto;
}


public String getNomeMacchinario() {
	return NomeMacchinario;
}


public void setNomeMacchinario(String nomeMacchinario) {
	NomeMacchinario = nomeMacchinario;
}

public String getIDMacchinario() {
	return IDMacchinario;
}

public static StatoAttuale getStato() {
	return Stato;
}

public void setDataManutenzione(StatoAttuale Stato) {
	this.Stato = Stato;
	
	switch(Stato) {
	case FUNZIONANTE:
		getDataAcquisto.plusMonths(6);
		break;
		
	case GUASTO:
		System.out.println( "Macchinario guasto, chiamare l'assistenza");
		break;
	    }
    }


public  String getDataManutenzione() {
	return DataAcquisto; 
}

@Override
public String toString() {
	//DataManutenzione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	return "Macchinario: ("+NomeMacchinario+", "+IDMacchinario+", "+DataAcquisto+")" +"\n";
    }

}