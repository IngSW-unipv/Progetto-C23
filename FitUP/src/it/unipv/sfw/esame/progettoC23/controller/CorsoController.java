package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.sfw.esame.progettoC23.IscrizioneCorso;
import it.unipv.sfw.esame.progettoC23.TipoCorso;
import it.unipv.sfw.esame.progettoC23.view.CorsoView;
import it.unipv.sfw.esame.progettoC23.view.IscrittoView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CorsoController {
	
	private final CorsoView view;
		
	String s[] = {"Elenco di Crossfit", "Elenco di Yoga", "Elenco di Zumba", "Elenco di Pilates" } ;
	
	JComboBox Elenco = new JComboBox(s);
	
	public CorsoController (CorsoView view) {
		
		this.view = view;
		
		setListeners();
		
	}

	private void setListeners() {
		
		view.getElenco().addActionListener(new ActionListener() {
			
	        public void actionPerformed(ActionEvent event) {

	            int selezione = Elenco.getSelectedIndex();
	            
	            switch (selezione) {
	            
	                case 0:

	                	view.StampaLista(IscrizioneCorso.Stampa());
	                	
	                    break;
	                case 1:
	                	
	                    
	                    break;

	                case 2:
	                    break;
	                    
	                case 3:
	                	break;
	            }
	        }
	    });
		
		
	}
}
