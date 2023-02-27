package it.unipv.sfw.esame.progettoC23;

import java.util.*;
import java.util.function.Consumer;

public class IscrizioneCorso {
	
	private String CodiceBadge;
	private TipoCorso CorsoScelto;
	
	
	public IscrizioneCorso () {
		
	} 
	
	static List <String> ElencoCrossfit = new ArrayList <String> (30);
	static List <String> ElencoYoga = new ArrayList <String> (30);
	static List <String> ElencoZumba= new ArrayList <String> (30);
	static List <String> ElencoPilates = new ArrayList <String> (30);
	
	
	public void riempiElenco (String CodiceBadge, TipoCorso CorsoScelto) {
		
		this.CodiceBadge = CodiceBadge;
		this.CorsoScelto = CorsoScelto;
		
		switch (CorsoScelto) {
		
		case CROSSFIT:
			
			ElencoCrossfit.add(CodiceBadge);	
			
			if (ElencoCrossfit.size() >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(CodiceBadge);
			
			break;
			
		case YOGA:
			
			ElencoYoga.add(CodiceBadge);
			
			if (ElencoYoga.size() >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(CodiceBadge);
			
			break;
		
		case ZUMBA:
			
			ElencoZumba.add(CodiceBadge);
			
			if (ElencoZumba.size() >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(CodiceBadge);
			// System.out.println(ElencoZumba);
			
			break;
		
		case PILATES:
			
			ElencoPilates.add(CodiceBadge);
			
			if (ElencoPilates.size() >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(CodiceBadge);
			
			break;
			
		}		
	}
	
	public void svuotaElenco (String CodiceBadge, TipoCorso CorsoScelto) {
		
		this.CodiceBadge = CodiceBadge;
		this.CorsoScelto = CorsoScelto;
		
		switch (CorsoScelto) {
		
		case CROSSFIT:
			
			ElencoCrossfit.remove(CodiceBadge);	
			System.out.println(ElencoCrossfit);
			break;
			
		case YOGA:
			
			ElencoYoga.remove(CodiceBadge);	
			System.out.println(ElencoYoga);
			break;
		
		case ZUMBA:
			
			ElencoZumba.remove(CodiceBadge);	
			System.out.println(ElencoZumba);
			break;
		
		case PILATES:
			
			ElencoPilates.remove(CodiceBadge);	
			System.out.println(ElencoPilates);
			break;
			
		}
	}
	
	public static List<String> StampaCrossfit () {
		
		return ElencoCrossfit;
	}
	
	public static List<String> StampaYoga () {
		
		return ElencoYoga;
	}
	
	public static List<String> StampaZumba () {
		
		return ElencoZumba;
	}

	public static List<String> StampaPilates () {
	
		return ElencoPilates;
	}	
}