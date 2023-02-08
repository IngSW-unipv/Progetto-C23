package it.unipv.sfw.esame.progettoC23;
import java.text.DateFormat;
import java.util.Date;

public class Macchinario {
	

	  private int IDMacchinario; 
	  private Date DataAcquisto; 
	  private String NomeMacchinario;
	  private Date DataUltimaManutenzione;
	  
	public Macchinario(int iDMacchinario, Date dataAcquisto, String nomeMacchinario) {
		IDMacchinario = iDMacchinario;
		DataAcquisto = dataAcquisto;
		NomeMacchinario = nomeMacchinario;
		//this.DataUltimaManutenzione = 00/00/0000;
	}
}
