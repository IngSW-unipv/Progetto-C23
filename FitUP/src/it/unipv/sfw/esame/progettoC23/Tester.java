package it.unipv.sfw.esame.progettoC23;
import java.sql.*;
import java.text.DateFormat;
import java.util.*;

import javax.swing.JFrame;

import it.unipv.sfw.esame.progettoC23.controller.IscrittoContoller;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinarioDAO;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.view.IscrittoView;
import it.unipv.sfw.esame.progettoC23.ManutenzioneMacchinario;


public class Tester {
	

		public static void main(String[] args) throws SQLException {
			
		
		//System.out.println("Prima iscrizione: " + g.getPrimaIscrizione().getTime());
		//g.setDataRinnovo(TipoAbbonamento.SEMESTRALE);
		//System.out.println("La data di rinnovo è: " + g.getDataRinnovo().getTime());
	
		
		/* IscrizioneDAO id = new IscrizioneDAO();
		Persona p = new Persona ("LUCA", "ROSSI", "RSSLCC", "01/01/2000");
		Persona p1 = new Persona ("MARIO", "VERDI", "VRDMRR", "01/01/2002");
		Persona p2 = new Persona ("LUIGI", "BIANCHI", "BNCLGG", "01/02/2000");
		
		Badge b = new Badge();
		Badge b1 = new Badge();
		Badge b2 = new Badge ();
		
		b.setCodiceBadge(p);

		b1.setCodiceBadge(p1);
		b2.setCodiceBadge(p2);

		Iscrizione g = new Iscrizione (p.getCF(),p.getNome(),p.getCognome(),p.getDataNascita(), b.getCodiceBadge());
		Rinnovo r = new Rinnovo(b.getCodiceBadge());
		//r.setDataRinnovo(TipoAbbonamento.MENSILE);
		//System.out.println("Il rinnovo è previsto per il giorno: "+r.getDataRinnovo().getTime());
		//System.out.println(id.selectAll());
		//System.out.println(id.insertIscritto(g,b));
		

		//IscrizioneCorso c = new IscrizioneCorso (p.getCF(), TipoCorso.CROSSFIT);
		//IscrizioneCorso c1 = new IscrizioneCorso (p1.getCF(), TipoCorso.CROSSFIT);
		System.out.println("Gli iscritti al corso di Crossfit sono: " );
		//c.riempiElenco(TipoCorso.CROSSFIT);
		//c1.riempiElenco(TipoCorso.CROSSFIT);*/
		
		//IscrittoView iv = new IscrittoView();
		//IscrittoContoller ic = new IscrittoContoller(r,iv,b);
		//iv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//iv.setVisible(true);

		/* IscrizioneCorso c = new IscrizioneCorso ();
		
		System.out.println("Gli iscritti al corso di Crossfit sono: " );
		c.riempiElenco(b.getCodiceBadge(), TipoCorso.CROSSFIT);
		

		System.out.println("Gli iscritti al corso di Yoga sono: " );
		c.riempiElenco(b1.getCodiceBadge(), TipoCorso.YOGA);
		
		System.out.println("Gli iscritti al corso di Zumba sono: " );
		c.riempiElenco(b2.getCodiceBadge(), TipoCorso.ZUMBA);
		
		 System.out.println(c.StampaYoga());
		
		System.out.println("Il nuovo elenco del corso di Crossfit è: " );
		c.svuotaElenco(b.getCodiceBadge(), TipoCorso.CROSSFIT);
		
		

		 System.out.println("Il nuovo elenco del corso di Crossfit è: " );
		c.svuotaElenco(b.getCodiceBadge(), TipoCorso.CROSSFIT);

		
		
		IscrittoView iv = new IscrittoView();
		IscrittoContoller ic = new IscrittoContoller(r,iv,b);
		iv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iv.setVisible(true); */

	
		/* CorsoView cv = new CorsoView();
		CorsoController cc = new CorsoController(cv);
		cv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cv.setVisible(true); */
			
			//Testing Macchinario
			/*Macchinario m = new Macchinario ("PANCHE", "23/02/2023");
			Macchinario m1 = new Macchinario ("PANCHE", "15/04/2012");
			
			IDMacchinario id = new IDMacchinario();
			IDMacchinario id1 = new IDMacchinario();
			id.setIDMacchinario(m);
			id1.setIDMacchinario(m1);
			
			GestioneMacchinario g = new GestioneMacchinario (m.getNomeMacchinario(), id.getIDMacchinario(), m.getDataAcquisto());
			GestioneMacchinario g1 = new GestioneMacchinario (m1.getNomeMacchinario(), id1.getIDMacchinario(), m1.getDataAcquisto());
			ManutenzioneMacchinario s = new ManutenzioneMacchinario (g.getIDMacchinario(), g.getDataAcquisto());
			s.setDataManutenzione(StatoAttuale.FUNZIONANTE); 
			
	
			System.out.println("ID Macchinario: " + id.getIDMacchinario() + "\n" + "Data Acquisto: " + g.getDataAcquisto());
			System.out.println("ID Macchinario: " + id1.getIDMacchinario() + "\n" +"Data Acquisto: " + g1.getDataAcquisto());

			
			
			System.out.println("Manutenzione prevista: " + s.getDataManutenzione());
			
			GestioneMacchinarioDAO gm = new GestioneMacchinarioDAO();
			System.out.println(gm.selectAll());
			System.out.println(gm.insertMacchinario(g, id)); */

		
		
		
		
		

	}
		

}