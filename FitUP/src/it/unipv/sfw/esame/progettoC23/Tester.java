package it.unipv.sfw.esame.progettoC23;
import java.text.DateFormat;
import java.util.*;

public class Tester {
	

		public static void main(String[] args) {
			
		Persona p = new Persona ("Rebecca", "Maccagni", "MCCRCC00H45E801D", "05/06/2000");
		Iscrizione g = new Iscrizione (p,TipoAbbonamento.SEMESTRALE);
		g.setCodiceBadge(p);
		System.out.println(g.getCodiceBadge());
		System.out.println("Prima iscrizione: " + g.getPrimaIscrizione().getTime());
		g.setDataRinnovo(TipoAbbonamento.SEMESTRALE);
		System.out.println("La data di rinnovo è: " + g.getDataRinnovo().getTime());
		
		// cose aggiunte da Stefy mercoledì sera
	//	GestionePrenotazioneVisita visitaobb = new GestionePrenotazioneVisita(g,TipoVisita.OBBLIGATORIA);
	//	visitaobb.setAssegnazioneData(g,TipoVisita.OBBLIGATORIA);
	//	System.out.println("La data della visita obbligatoria è: " + visitaobb.getAssegnazioneData());
		
		

	}

}