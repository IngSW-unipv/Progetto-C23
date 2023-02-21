package it.unipv.sfw.esame.progettoC23;
import java.util.*;

public class GestioneManutenzioneMacchinario extends Macchinario {
private Macchinario NomeMacchinario;
private String IDMacchinario; 
private Macchinario DataUltimaManutenzione;
private Macchinario DataAcquisto;
private int count = 00;
	   

public GestioneManutenzioneMacchinario(String dataAcquisto, TipoMacchinario nomeMacchinario, String DataUltimaManutenzione) {
	super(dataAcquisto, nomeMacchinario, DataUltimaManutenzione);
	count++;
}

public Macchinario getNomeMacchinario() {
	return NomeMacchinario;
}

public void setNomeMacchinario(Macchinario nomeMacchinario) {
	NomeMacchinario = nomeMacchinario;
}

public void setIDMacchinario(Macchinario Macchinario) {
	IDMacchinario = Macchinario.getNomeMacchinario() + String.valueOf(count);
}

public Macchinario getDataAcquisto() {
	return DataAcquisto; 
}

public Macchinario getDataUltimaManutenzione() {
	return DataUltimaManutenzione;
}


}
