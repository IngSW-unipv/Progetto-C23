package it.unipv.sfw.esame.progettoC23;

import java.util.*;

public class IscrizioneCorso {
	
	private String CodiceBadge;
	private TipoCorso CorsoScelto;
	private int N_Iscritti = 0;
	
	
	public IscrizioneCorso () {
		
	//	this.CodiceBadge = CodiceBadge;
	//	this.CorsoScelto = CorsoScelto;
	} 
	
	List <String> ElencoCrossfit = new ArrayList <String> (30);
	List <String> ElencoYoga = new ArrayList <String> (30);
	List <String> ElencoZumba= new ArrayList <String> (30);
	List <String> ElencoPilates = new ArrayList <String> (30);
	
	
	public void riempiElenco (String CodiceBadge, TipoCorso CorsoScelto) {
		
		this.CodiceBadge = CodiceBadge;
		this.CorsoScelto = CorsoScelto;
		
		switch (CorsoScelto) {
		
		case CROSSFIT:
			
			ElencoCrossfit.add(CodiceBadge);
			N_Iscritti = N_Iscritti + 1;
			
			if (N_Iscritti >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(N_Iscritti + ")" + CodiceBadge);
			
			break;
			
		case YOGA:
			
			ElencoYoga.add(CodiceBadge);
			N_Iscritti = N_Iscritti + 1;
			
			System.out.println(ElencoYoga);
			
			if (N_Iscritti >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(N_Iscritti + ")" + CodiceBadge);
			
			break;
		
		case ZUMBA:
			
			ElencoZumba.add(CodiceBadge);
			N_Iscritti = N_Iscritti + 1;
			
			System.out.println(ElencoZumba);
			
			if (N_Iscritti >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(N_Iscritti + ")" + CodiceBadge);
			
			break;
		
		case PILATES:
			
			ElencoPilates.add(CodiceBadge);
			N_Iscritti = N_Iscritti + 1;
			
			System.out.println(ElencoPilates);
			
			if (N_Iscritti >= 30) {
				
				throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
			}
			
			System.out.println(N_Iscritti + ")" + CodiceBadge);
			
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
			
			N_Iscritti = N_Iscritti - 1;
			System.out.println("Il nuovo numero di iscritti è: " + N_Iscritti);
			
			break;
			
		case YOGA:
			
			ElencoYoga.remove(CodiceBadge);	
			System.out.println(ElencoYoga);
			
			N_Iscritti = N_Iscritti - 1;
			System.out.println("Il nuovo numero di iscritti è: " + N_Iscritti);
			
			break;
		
		case ZUMBA:
			
			ElencoZumba.remove(CodiceBadge);	
			System.out.println(ElencoZumba);
			
			N_Iscritti = N_Iscritti - 1;
			System.out.println("Il nuovo numero di iscritti è: " + N_Iscritti);
			
			break;
		
		case PILATES:
			
			ElencoPilates.remove(CodiceBadge);	
			System.out.println(ElencoPilates);
			
			N_Iscritti = N_Iscritti - 1;
			System.out.println("Il nuovo numero di iscritti è: " + N_Iscritti);
			
			break;
			
		}
	}
}
