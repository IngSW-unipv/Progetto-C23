package it.unipv.sfw.esame.progettoC23.controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import it.unipv.sfw.esame.progettoC23.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.Macchinario;
import it.unipv.sfw.esame.progettoC23.ManutenzioneMacchinario;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;
import it.unipv.sfw.esame.progettoC23.view.MacchinarioView;
import javax.swing.JOptionPane;

public class MacchinarioController {
	private final ManutenzioneMacchinario dataAcquisto;
	private final MacchinarioView view;
	private final IDMacchinario idMacchinario;
	
	public MacchinarioController(ManutenzioneMacchinario dataAcquisto, MacchinarioView view, IDMacchinario idMacchinario) {
	
		this.dataAcquisto = dataAcquisto;
		this.view = view;
		this.idMacchinario = idMacchinario;
		
		setListeners();
	}

	private void setListeners() {
		view.getNuovoMacchinario().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent e) {
				view.setIDMacchinario(getIDMacchinario());
			}
			
		});
		
		view.getCerca().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent e) {
				view.setDataManutenzione(dataAcquisto);
				
			/*@Override
			public void actionPerformed (ActionEvent e) {
				view.get
			}*/
			}
		});
	}

	protected IDMacchinario getIDMacchinario() {
		// TODO Auto-generated method stub
		return idMacchinario;
	} 		
}
