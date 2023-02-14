package it.unipv.sfw.esame.progettoC23;
import java.util.*;

public class GestioneManutenzioneMacchinario {
private Macchinario NomeMacchinario;
private String IDMacchinario; 
private Calendar DataUltimaManutenzione;
private Macchinario DataAcquisto;
private int count = 00;

public GestioneManutenzioneMacchinario(Macchinario nomeMacchinario, Macchinario DataAcquisto) {
	    DataAcquisto = DataAcquisto;
	    NomeMacchinario = nomeMacchinario;
	    count++;
	}
	   
public void setIDMacchinario(Macchinario Macchinario) {
	IDMacchinario = Macchinario.getNomeMacchinario() +  String.valueOf(count);
}


public void setDataUltimaManutenzione(Macchinario dataUltimaManutenzione) {
	DataUltimaManutenzione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY); 
}

}
