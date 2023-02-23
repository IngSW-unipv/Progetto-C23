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
	private CorsoView cv;
	
	public CorsoController (CorsoView view) {
		
		this.view = view;
		
		setListeners();
		
	}

	private void setListeners() {
		
		view.getElenco().addActionListener(new ActionListener() {
			
	        public void actionPerformed(ActionEvent event) {

	            int selezione = view.Elenco.getSelectedIndex();
	            
	            switch (selezione) {
	            
	                case 0:
	                	view.StampaLista(IscrizioneCorso.StampaCrossfit());
	                	break;
	                	
	                case 1:
	                	view.StampaLista(IscrizioneCorso.StampaYoga());
	                    break;

	                case 2:
	                	view.StampaLista(IscrizioneCorso.StampaZumba());
	                    break;
	                    
	                case 3:
	                	view.StampaLista(IscrizioneCorso.StampaPilates());
	                	break;
	            }
	        }
	    });	
	}
}
