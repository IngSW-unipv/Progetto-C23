package it.unipv.sfw.esame.progettoC23;
import java.sql.*;
import java.text.DateFormat;
import java.util.*;

import javax.swing.JFrame;

import it.unipv.sfw.esame.progettoC23.controller.CorsoController;
import it.unipv.sfw.esame.progettoC23.controller.IscrittoContoller;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.view.CorsoView;
import it.unipv.sfw.esame.progettoC23.view.IscrittoView;


public class Tester {
	

		public static void main(String[] args) throws SQLException {
			
		
		//System.out.println("Prima iscrizione: " + g.getPrimaIscrizione().getTime());
		//g.setDataRinnovo(TipoAbbonamento.SEMESTRALE);
		//System.out.println("La data di rinnovo è: " + g.getDataRinnovo().getTime());
	
		
		//IscrizioneDAO id = new IscrizioneDAO();
		Persona p = new Persona ("LUCA", "ROSSI", "RSSLCC", "01/01/2000");
		Persona p1 = new Persona ("MARIO", "VERDI", "VRDMRR", "01/01/2002");
		Persona p2 = new Persona ("LUIGI", "BIANCHI", "BNCLGG", "01/02/2000");
		
		Badge b = new Badge();
		Badge b1 = new Badge();
		Badge b2 = new Badge ();
		
		b.setCodiceBadge(p);

		Badge b1 = new Badge();
		b1.setCodiceBadge(p1);


		//Iscrizione g = new Iscrizione (p.getCF(),p.getNome(),p.getCognome(),p.getDataNascita(), b.getCodiceBadge());
		//Rinnovo r = new Rinnovo(b.getCodiceBadge());
		//r.setDataRinnovo(TipoAbbonamento.MENSILE);
		//System.out.println("Il rinnovo è previsto per il giorno: "+r.getDataRinnovo().getTime());
		//System.out.println(id.selectAll());
		//System.out.println(id.insertIscritto(g,b));
		
		IscrizioneCorso c = new IscrizioneCorso ();
		

/*		IscrittoView iv = new IscrittoView();

		System.out.println("Gli iscritti al corso di Crossfit sono: " );
		c.riempiElenco(b.getCodiceBadge(), TipoCorso.CROSSFIT);
		
		System.out.println("Gli iscritti al corso di Yoga sono: " );
		c.riempiElenco(b1.getCodiceBadge(), TipoCorso.YOGA);
		
		System.out.println("Gli iscritti al corso di Zumba sono: " );
		c.riempiElenco(b2.getCodiceBadge(), TipoCorso.ZUMBA);
		
		// System.out.println(c.StampaYoga());
		
		/* System.out.println("Il nuovo elenco del corso di Crossfit è: " );
		c.svuotaElenco(b.getCodiceBadge(), TipoCorso.CROSSFIT); */
		
		
		
		
		/*IscrittoView iv = new IscrittoView();

		IscrittoContoller ic = new IscrittoContoller(r,iv,b);
		iv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iv.setVisible(true);
		

*/	
		try {
		Calendar c =Calendar.getInstance();
		c.set(2023,02,28,12, 0);
		Visita visit= new Visita(b, TipoVisita.OBBLIGATORIA ,c);
		Calendar c1 =Calendar.getInstance();
		c1.set(2023,02,19,15, 0);
		Visita visit1= new Visita(b1, TipoVisita.OBBLIGATORIA ,c1);
		GestioneVisite pren= new GestioneVisite();
		pren.inserisciVisita(visit);
		pren.inserisciVisita(visit1);

		Calendar c2 =Calendar.getInstance();
		c2.set(2023,02,28,11, 0);



		Visita visit2= new Visita(b1, TipoVisita.OSTEOPATICA ,c2);
		pren.inserisciVisita(visit2);

		Calendar c3 =Calendar.getInstance();
		c3.set(2023,02,20,11, 0);

		Visita visit3= new Visita(b1, TipoVisita.OSTEOPATICA ,c3);
		pren.inserisciVisita(visit3);
		pren.cancellaVisitaPerData(c3);
		System.out.println(pren.cercaVisitaPerBadge("RSSLCCFitUp").toString());
		} catch( Exception e){
			System.out.println(e.getMessage());
		}
	//	 System.out.println(pren.getElencoVisite().toString());
//cercaVisitaPerBadge("RSSLCCFitUp").toString()
		
}
	
}
