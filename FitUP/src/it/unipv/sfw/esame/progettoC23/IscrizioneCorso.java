package it.unipv.sfw.esame.progettoC23;

import java.util.*;

public class IscrizioneCorso {
	
	private String CF;
	private TipoCorso CorsoScelto;
	private int N_Iscritti = 0;
	
	
	public IscrizioneCorso (String CF, TipoCorso CorsoScelto) {
		
		this.CF = CF;
		this.CorsoScelto = CorsoScelto;
	} 
	
	List <String> ElencoCrossfit = new ArrayList <String> (30);
	List <String> ElencoYoga = new ArrayList <String> (30);
	List <String> ElencoZumba= new ArrayList <String> (30);
	List <String> ElencoPilates = new ArrayList <String> (30);
	
	
	public void riempiElenco (TipoCorso CorsoScelto) {
		
		this.CorsoScelto = CorsoScelto;
		
		switch (CorsoScelto) {
		
		case CROSSFIT:
			N_Iscritti = ++ N_Iscritti;
			ElencoCrossfit.add(CF);	
			
			if (ElencoCrossfit.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(N_Iscritti + ")");
			System.out.println(CF);
			
			break;
			
		case YOGA:
			ElencoYoga.add(CF);
			
			if (ElencoYoga.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println("Gli iscritti al corso di Yoga sono: " + CF);
			break;
		
		case ZUMBA:
			ElencoZumba.add(CF);
			
			if (ElencoZumba.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println("Gli iscritti al corso di Zumba sono: " + CF);
			break;
		
		case PILATES:
			ElencoPilates.add(CF);
			
			if (ElencoPilates.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println("Gli iscritti al corso di Pilates sono: " + CF);
			break;
			
		}
		
	}

}
