package it.unipv.sfw.esame.progettoC23;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.*;

import it.unipv.sfw.esame.progettoC23.Connessione;
import it.unipv.sfw.esame.progettoC23.Iscrizione;
import it.unipv.sfw.esame.progettoC23.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.Persona;


public class Tester {
	

		public static void main(String[] args) throws SQLException {
			
		
		
		//System.out.println("Prima iscrizione: " + g.getPrimaIscrizione().getTime());
		//g.setDataRinnovo(TipoAbbonamento.SEMESTRALE);
		//System.out.println("La data di rinnovo è: " + g.getDataRinnovo().getTime());
	
		
		//IscrizioneDAO id = new IscrizioneDAO();
		Persona p = new Persona ("Rebecca", "Maccagni", "E801D", "05/06/2000");
		Persona p1 = new Persona ("Denise", "Vaccarella", "A302B", "11/09/2001");
	
		Iscrizione g = new Iscrizione (p.getCF(),p.getNome());
		Iscrizione g1 = new Iscrizione (p1.getCF(), p1.getNome());

		//System.out.println(id.selectAll());
		//System.out.println(id.insertIscritto(g));
		
		g.setCodiceBadge(p);
		g1.setCodiceBadge(p1);		
		
		IscrizioneCorso c = new IscrizioneCorso (g.getCodiceBadge(), TipoCorso.CROSSFIT);
		IscrizioneCorso c1 = new IscrizioneCorso (g1.getCodiceBadge(), TipoCorso.CROSSFIT);
		

		System.out.println("Gli iscritti al corso di Crossfit sono: " );
		c.riempiElenco(TipoCorso.CROSSFIT);
		c1.riempiElenco(TipoCorso.CROSSFIT);
		
		System.out.println("L'elenco aggiornato è: " );
		c.svuotaElenco(TipoCorso.CROSSFIT);
		
		
		
		
		
		

	}

}