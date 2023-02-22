package it.unipv.sfw.esame.progettoC23;
import java.util.*;

public class GestioneMacchinario {
	private Calendar DataAcquisto = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
    private TipoMacchinario NomeMacchinario;
    private Calendar DataUltimaManutenzione;
    private static String IDMacchinario; 
    private StatoAttuale Stato;
    private int count = 00;
	   

public GestioneMacchinario(TipoMacchinario nomeMacchinario, String iDMacchinario,
		Calendar dataUltimaManutenzione, Calendar dataAcquisto, StatoAttuale stato, int count) {

	this.NomeMacchinario = nomeMacchinario;
	GestioneMacchinario.IDMacchinario = iDMacchinario;
	this.DataUltimaManutenzione = dataUltimaManutenzione;
	this.DataAcquisto = dataAcquisto;
	this.Stato = stato;
	this.count = count++;
}


public Calendar getDataAcquisto() {
	return DataAcquisto;
}


public void setDataAcquisto(Calendar dataAcquisto) {
	DataAcquisto = dataAcquisto;
}



public TipoMacchinario getNomeMacchinario() {
	return NomeMacchinario;
}


public void setNomeMacchinario(TipoMacchinario nomeMacchinario) {
	NomeMacchinario = nomeMacchinario;
}


public void setIDMacchinario(Macchinario Macchinario, int count) {
	IDMacchinario = Macchinario.getNomeMacchinario() + String.valueOf(count);
}

public static String getIDMacchinario() {
	return IDMacchinario;
}


public void setDataUltimaManutenzione(StatoAttuale Stato) {
	this.Stato = Stato;
	
	switch(Stato) {
	case FUNZIONANTE:
		DataUltimaManutenzione.add(Calendar.MONTH, +6);
		break;
		
	case GUASTO:
		System.out.println(GestioneMacchinario.getIDMacchinario() + "è guasto: Chiamare l'assistenza");
		break;
	    }
    }
@Override
public String toString() {
DataUltimaManutenzione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
return null;
}

}