package it.unipv.sfw.esame.progettoC23.jdbc.bean;
import it.unipv.sfw.esame.progettoC23.model.Macchinario;
import it.unipv.sfw.esame.progettoC23.model.StatoAttuale;



public class GestioneMacchinario {
	public String DataAcquisto;
    private String NomeMacchinario; 
    private String IDMacchinario;
	   

public GestioneMacchinario(String nomeMacchinario,String dataAcquisto) {
	this.NomeMacchinario = nomeMacchinario;
	this.DataAcquisto = dataAcquisto;
}

public String getDataAcquisto() {
	return DataAcquisto; 
}

public String setDataAcquisto(Macchinario M) {
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

public void setIDMacchinario(Macchinario M) {
	IDMacchinario = M.getNomeMacchinario() +  M.dataAcquisto.replace("/", "");
    }

@Override
public String toString() {
	return "Macchinario: ("+NomeMacchinario+", "+DataAcquisto+")" +"\n";
    }

}