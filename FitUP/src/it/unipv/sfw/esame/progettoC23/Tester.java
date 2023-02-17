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
			
		
		//g.setCodiceBadge(p);
		//System.out.println(g.getCodiceBadge());
		//System.out.println("Prima iscrizione: " + g.getPrimaIscrizione().getTime());
		//g.setDataRinnovo(TipoAbbonamento.SEMESTRALE);
		//System.out.println("La data di rinnovo è: " + g.getDataRinnovo().getTime());
	
		
		IscrizioneDAO id = new IscrizioneDAO();
		Persona p = new Persona ("Rebecca", "Maccagni", "E801D", "05/06/2000");
		Iscrizione g = new Iscrizione (p.getCF(),p.getNome());
		System.out.println(id.selectAll());
		System.out.println(id.insertIscritto(g));
		
		
		

	}

}