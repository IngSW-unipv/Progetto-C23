package it.unipv.sfw.esame.progettoC23;
import java.sql.*;
import java.text.DateFormat;
import java.util.*;


public class Tester {
	

		public static void main(String[] args) throws SQLException {
			
		
		//g.setCodiceBadge(p);
		//System.out.println(g.getCodiceBadge());
		//System.out.println("Prima iscrizione: " + g.getPrimaIscrizione().getTime());
		//g.setDataRinnovo(TipoAbbonamento.SEMESTRALE);
		//System.out.println("La data di rinnovo è: " + g.getDataRinnovo().getTime());
	
		
		IscrizioneDAO id = new IscrizioneDAO();
		Persona p = new Persona ("LUCA", "ROSSI", "RSSLCC", "01/01/2000");
		Persona p1 = new Persona ("MARIO", "VERDI", "VRDMRR", "01/01/2002");
		Badge b = new Badge();
		b.setCodiceBadge(p);
		Iscrizione g = new Iscrizione (p.getCF(),p.getNome(),p.getCognome(),p.getDataNascita(), b.getCodiceBadge());
		System.out.println(id.selectAll());
		System.out.println(id.insertIscritto(g,b));
		
		//IscrizioneCorso c = new IscrizioneCorso (p.getCF(), TipoCorso.CROSSFIT);
		//IscrizioneCorso c1 = new IscrizioneCorso (p1.getCF(), TipoCorso.CROSSFIT);
		//System.out.println("Gli iscritti al corso di Crossfit sono: " );
		//c.riempiElenco(TipoCorso.CROSSFIT);
		//c1.riempiElenco(TipoCorso.CROSSFIT);
		
		
		
		
		

	}

}