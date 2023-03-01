package it.unipv.sfw.esame.progettoC23.controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;
import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.Macchinario;
import it.unipv.sfw.esame.progettoC23.model.ManutenzioneMacchinario;
import it.unipv.sfw.esame.progettoC23.view.MacchinarioView;
import javax.swing.JOptionPane;
import java.util.*;

public class MacchinarioController {
	private final ManutenzioneMacchinario dataAcquisto;
	private final MacchinarioView view;
	private final IDMacchinario idMacchinario;
	
	public MacchinarioController(ManutenzioneMacchinario dataAcquisto, MacchinarioView view, IDMacchinario idMacchinario) {
	
		this.dataAcquisto = dataAcquisto;
		this.view = view;
		this.idMacchinario = idMacchinario;
	
		/*Scanner scanner = new Scanner(System.in);
		NomeMacchinario = scanner.nextLine();
		
		Scanner scanner1 = new Scanner(System.in);
		dataAcquisto = scanner1.nextLine();*/
		
		setListeners();
	}

	private void setListeners() {
		view.getNuovoMacchinario().addActionListener(new ActionListener() {
			//private String NomeMacchinario, dataAcquisto; 
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
				if (idMacchinario != null) {
				view.uscita1.setText("Macchinario già esistente");
			} else {
				view.setNuovoMacchinario(getIDMacchinario());
			}
			}

			private GestioneMacchinario getIDMacchinario() {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
		
		view.getCerca().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
				if (idMacchinario != null) {
				view.setDataManutenzione(dataAcquisto);
				} else {
					view.uscita1.setText("Macchinario non trovato");
				}
			}
		});
	}	
}
