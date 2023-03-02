package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.Macchinario;
import it.unipv.sfw.esame.progettoC23.model.ManutenzioneMacchinario;
import it.unipv.sfw.esame.progettoC23.view.MacchinarioView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinarioDAO;


public class MacchinarioController {
	
	private  MacchinarioView view;
	private GestioneMacchinario gm;
	private Macchinario m;
	private IDMacchinario idm;

	
	public MacchinarioController(MacchinarioView view, Macchinario m, IDMacchinario idm) {
		
		this.m=m;
		this.idm=idm;
		this.view = view;
				
		setListeners();
	}

	private void setListeners() {
		
		view.getNuovoMacchinario().addActionListener(new ActionListener() {
		
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
				//GestioneMacchinario m= new GestioneMacchinario (view.getNomeMacchinario(),view.getDataAcquisto());
						
				GestioneMacchinarioDAO md = new GestioneMacchinarioDAO();
				GestioneMacchinario gm = new GestioneMacchinario (view.getNomeMacchinario(),view.getDataAcquisto());
				System.out.println(md.insertMacchinario(gm));
				
			}
			
		});
		
		view.getID().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				m.setNomeMacchinario(view.getNomeMacchinario());
				m.setDataAcquisto(view.getDataAcquisto());
				idm.setIDMacchinario(m);
				view.setID(idm.getIDMacchinario());
				
				
			}
		});
		
	
		
	
	}
}

