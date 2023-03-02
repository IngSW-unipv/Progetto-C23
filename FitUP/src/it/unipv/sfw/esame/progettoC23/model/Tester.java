package it.unipv.sfw.esame.progettoC23.model;

import java.sql.*;

import javax.swing.JFrame;

import it.unipv.sfw.esame.progettoC23.controller.OpenController;
import it.unipv.sfw.esame.progettoC23.view.OpenView;



import it.unipv.sfw.esame.progettoC23.controller.BenvenutoController;
import it.unipv.sfw.esame.progettoC23.view.BenvenutoView;


import javax.swing.*;
import java.sql.SQLException;


public class Tester {


		public static void main(String[] args) throws SQLException {
		
		OpenView ov = new OpenView();
		OpenController oc= new OpenController(ov);
		ov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ov.setVisible(true);
			

		/*Testing Macchinario
		Macchinario m = new Macchinario ("PANCA", "30/12/1995");
		Macchinario m1 = new Macchinario ("LEGPRESS", "15/04/2012");
		
		IDMacchinario id = new IDMacchinario();
		IDMacchinario id1 = new IDMacchinario();
		id.setIDMacchinario(m);
	    id1.setIDMacchinario(m1);
		
		GestioneMacchinario g = new GestioneMacchinario (m.getNomeMacchinario(), id.getIDMacchinario(), m.getDataAcquisto());
		GestioneMacchinario g1 = new GestioneMacchinario (m1.getNomeMacchinario(), id1.getIDMacchinario(), m1.getDataAcquisto());
		ManutenzioneMacchinario s = new ManutenzioneMacchinario (g.getIDMacchinario(), g.getDataAcquisto());
		ManutenzioneMacchinario s1 = new ManutenzioneMacchinario (g1.getIDMacchinario(), g1.getDataAcquisto());
		
		s.setDataManutenzione(StatoAttuale.FUNZIONANTE); 
		System.out.println("ID Macchinario: " + g.getIDMacchinario() + "\n" + "Data Acquisto: " + g.getDataAcquisto());
		System.out.println("Manutenzione prevista: " + s.getDataManutenzione());
		System.out.println("Stato Macchinario: " + s.Stato);
		System.out.println("");
		s1.setDataManutenzione(StatoAttuale.GUASTO);
		System.out.println("ID Macchinario: " + g1.getIDMacchinario() + "\n" +"Data Acquisto: " + g1.getDataAcquisto());
		System.out.println("Manutenzione prevista: " + s1.getDataManutenzione());
		System.out.println("Stato Macchinario: " + s1.Stato);
		
		/*GestioneMacchinarioDAO gm = new GestioneMacchinarioDAO();
		System.out.println(gm.selectAll());
		System.out.println(gm.insertMacchinario(g, id)); */
	
	/*MacchinarioView M = new MacchinarioView(m);
	MacchinarioView M1 = new MacchinarioView(m1);
	MacchinarioController mc = new MacchinarioController(s, M, id);
	MacchinarioController mc1 = new MacchinarioController(s1, M1, id1);
	M.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	M.setVisible(true); */
        
			
        
    }

}