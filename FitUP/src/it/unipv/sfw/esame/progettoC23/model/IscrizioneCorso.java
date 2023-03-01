package it.unipv.sfw.esame.progettoC23.model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.function.Consumer;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.util.Connessione;

public class IscrizioneCorso {
	
	private String CF;
	private String CorsoScelto;
	
	
	public IscrizioneCorso () {
		
	} 
	
	static List <String> ElencoCrossfit = new ArrayList <String> (30);
	static List <String> ElencoYoga = new ArrayList <String> (30);
	static List <String> ElencoZumba= new ArrayList <String> (30);
	static List <String> ElencoPilates = new ArrayList <String> (30);
	
	
	public void riempiElenco (String CF, String CorsoScelto) {
		
		this.CF = CF;
		this.CorsoScelto = CorsoScelto;
		
		switch (CorsoScelto) {
		
		case "CROSSFIT":
			
			ElencoCrossfit.add(CF);	
			
			if (ElencoCrossfit.size() >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(CF);
			// System.out.println(ElencoCrossfit);
			
			break;
			
		case "YOGA":
			
			ElencoYoga.add(CF);
			
			if (ElencoYoga.size() >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(CF);
			
			break;
		
		case "ZUMBA":
			
			ElencoZumba.add(CF);
			
			if (ElencoZumba.size() >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(CF);
			// System.out.println(ElencoZumba);
			
			break;
		
		case "PILATES":
			
			ElencoPilates.add(CF);
			
			if (ElencoPilates.size() >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(CF);
			
			break;
			
		}		
	}
	
	
	public   List<String> StampaCrossfit () {
		
		return ElencoCrossfit;
	}
	
	public   List<String> StampaYoga () {
		
		return ElencoYoga;
	}
	
	public   List<String> StampaZumba () {
		
		return ElencoZumba;
	}

	public   List<String> StampaPilates () {
	
		return ElencoPilates;
	}	
	

}