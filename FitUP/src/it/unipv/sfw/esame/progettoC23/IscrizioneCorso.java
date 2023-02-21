package it.unipv.sfw.esame.progettoC23;

import java.util.*;

public class IscrizioneCorso {
	
	private String CodiceBadge;
	private TipoCorso CorsoScelto;
	private int N_Iscritti = 0;
	
	
	public IscrizioneCorso (String CodiceBadge, TipoCorso CorsoScelto) {
		
		this.CodiceBadge = CodiceBadge;
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
			
			ElencoCrossfit.add(CodiceBadge);
			
			System.out.println(CodiceBadge);
			
			System.out.println(ElencoCrossfit);
			
			if (ElencoCrossfit.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			break;
			
		case YOGA:
			ElencoYoga.add(CodiceBadge);
			
			System.out.println(ElencoYoga);
			
			if (ElencoYoga.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			break;
		
		case ZUMBA:
			ElencoZumba.add(CodiceBadge);
			
			System.out.println(ElencoZumba);
			
			if (ElencoZumba.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			break;
		
		case PILATES:
			ElencoPilates.add(CodiceBadge);
			
			System.out.println(ElencoPilates);
			
			if (ElencoPilates.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			break;
			
		}
		
	}
	
	public void svuotaElenco (TipoCorso CorsoScelto) {
		
		this.CorsoScelto = CorsoScelto;
		
		switch (CorsoScelto) {
		
		case CROSSFIT:
			
			ElencoCrossfit.remove(CodiceBadge);	
			
			System.out.println(ElencoCrossfit);
			
			if (ElencoCrossfit.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			break;
			
		case YOGA:
			
			ElencoYoga.remove(CodiceBadge);	
			
			System.out.println(ElencoYoga);
			
			if (ElencoYoga.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			break;
		
		case ZUMBA:
			
			ElencoZumba.remove(CodiceBadge);	
			
			System.out.println(ElencoZumba);
			
			if (ElencoZumba.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			break;
		
		case PILATES:
			
			ElencoPilates.remove(CodiceBadge);	
			
			System.out.println(ElencoPilates);
			
			if (ElencoPilates.size() >= 30) {
				
				throw new IllegalArgumentException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			break;
			
		}
	}

}
