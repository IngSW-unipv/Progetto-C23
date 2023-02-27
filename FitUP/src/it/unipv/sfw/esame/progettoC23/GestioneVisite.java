package it.unipv.sfw.esame.progettoC23;
import it.unipv.ingsfw.esame.progettoC23.exception.*;
import java.util.*;

public class GestioneVisite {

	/*  I assume that the visits last one hour and
	 *  that the working day goes from 10 to 17 and from 13 to 14 there is a lunch break,
	 *  so I can have 6 visits per day at most. 
	 *  Visits are not possible on Sundays
	 */
	
	private static final int GIORNO_FESTIVO =Calendar.SUNDAY;
	private static final int INIZIO_GIORNATA = 10;
	private static final int ULTIMO_GIORNATA = 16;
	private static final int PAUSA_PRANZO = 13;

	private ArrayList<Visita> elencoVisite;

	public GestioneVisite() {
		elencoVisite = new ArrayList<>();
	}

	// To be entered, the visit must:
	// do not start before 10 and not after 16 and not be at 13
	// do not overlap with other visits already entered
	public boolean inserisciVisita(Visita v) throws HourException, DayException {
		Calendar day0,day1;
		int day = v.getGiornoSett();
		int inizio = v.getInizio();
		day0 = v.getDay_visit();
		
		// Control over working hours and day
		if (inizio < INIZIO_GIORNATA || inizio > ULTIMO_GIORNATA || inizio == PAUSA_PRANZO) {
			throw new  HourException();
			
		}else if( day == GIORNO_FESTIVO) {
			throw new  DayException();
		}else {
			// NO OVERLAP OF VIEWS
			for (Visita v1 : elencoVisite) {
				day1 = v1.getDay_visit();
				if(day0.compareTo(day1)==0) {
				   System.out.println("visita non disponibile");
				   return false;
				}
			}
			// the visit is entered since there are no others on that date and time
			elencoVisite.add(v);
			return true;
		}
    }

// Search for a visit by Badge
	public ArrayList<Visita> cercaVisitaPerBadge(String codicebadge) {
		ArrayList<Visita> tmp = new ArrayList<>();
		for (Visita v1 : elencoVisite) {
			String badgeTrovato = v1.getPaziente().getCodiceBadge();
			if (badgeTrovato.equals(codicebadge)) {
				tmp.add(v1);
			}
		}
		return tmp;
		//toString in the tester to print
	}

//Canceling a visit
	public boolean cancellaVisitaPerData(Calendar date) {
		for (Visita v1 : elencoVisite) {
			Calendar dataTrovata = v1.getDay_visit();
			if (dataTrovata.compareTo(date)==0) {
				elencoVisite.remove(v1);//cancel the visit on that date and time
				return true;
			}
		}
		return false;
	}

//Search visits of a specific day and month
	public ArrayList<Visita> elencoGiornaliero(int giorno,int mese,int anno) { 
		ArrayList<Visita> estratto = new ArrayList<>();
		for (Visita v1 : elencoVisite) {
			int giorno1=v1.getDay_visit().get(Calendar.DATE);
			int mese1=v1.getDay_visit().get(Calendar.MONTH);
			int anno1=v1.getDay_visit().get(Calendar.YEAR);
			if(giorno==giorno1 && mese==mese1 && anno==anno1) {
				estratto.add(v1);
			}
		}
		System.out.println("Le visite in data:"+ giorno+ "-"+ mese+"-"+ anno+" sono in tot->"+ estratto.size());
		return estratto;
			
	}
	

	public ArrayList<Visita> getElencoVisite() {
		return elencoVisite;
	}

	@Override
	public String toString() {
		return "GestioneVisite\nElencoVisite=\n" + elencoVisite.toString() +"\nNumero_Visite=" + elencoVisite.size();
	}
	

}
