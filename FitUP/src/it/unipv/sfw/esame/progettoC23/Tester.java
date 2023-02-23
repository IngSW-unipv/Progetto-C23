package it.unipv.sfw.esame.progettoC23;
import java.sql.*;
import java.text.DateFormat;
import java.util.*;

import javax.swing.JFrame;

import it.unipv.sfw.esame.progettoC23.controller.IscrittoContoller;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
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


		b1.setCodiceBadge(p1);
		b2.setCodiceBadge(p2);

		//Iscrizione g = new Iscrizione (p.getCF(),p.getNome(),p.getCognome(),p.getDataNascita(), b.getCodiceBadge());
		Rinnovo r = new Rinnovo(b.getCodiceBadge());
		r.setDataRinnovo(TipoAbbonamento.MENSILE);
		//System.out.println("Il rinnovo è previsto per il giorno: "+r.getDataRinnovo().getTime());
		//System.out.println(id.selectAll());
		//System.out.println(id.insertIscritto(g,b));
		

		/*IscrizioneCorso c = new IscrizioneCorso (p.getCF(), TipoCorso.CROSSFIT);
		IscrizioneCorso c1 = new IscrizioneCorso (p1.getCF(), TipoCorso.CROSSFIT);
		System.out.println("Gli iscritti al corso di Crossfit sono: " );
		c.riempiElenco(TipoCorso.CROSSFIT);
		c1.riempiElenco(TipoCorso.CROSSFIT);*/
		
		IscrittoView iv = new IscrittoView();
		IscrittoContoller ic = new IscrittoContoller(r,iv,b);
		iv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iv.setVisible(true);

		IscrizioneCorso c = new IscrizioneCorso ();
		
		/*System.out.println("Gli iscritti al corso di Crossfit sono: " );
		c.riempiElenco(b.getCodiceBadge(), TipoCorso.CROSSFIT);
		c.riempiElenco(b1.getCodiceBadge(), TipoCorso.CROSSFIT);
		c.riempiElenco(b2.getCodiceBadge(), TipoCorso.CROSSFIT);
		
		System.out.println("Il nuovo elenco del corso di Crossfit è: " );
		c.svuotaElenco(b.getCodiceBadge(), TipoCorso.CROSSFIT);*/
		
		
		/*IscrittoView iv = new IscrittoView();
		IscrittoContoller ic = new IscrittoContoller(r,iv,b);
		iv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iv.setVisible(true);*/

		
		
		
		
		
		

	}

}