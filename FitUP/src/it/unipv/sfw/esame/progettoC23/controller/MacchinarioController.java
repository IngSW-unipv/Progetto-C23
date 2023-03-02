package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;

import it.unipv.sfw.esame.progettoC23.model.ManutenzioneMacchinario;
import it.unipv.sfw.esame.progettoC23.view.MacchinarioView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinarioDAO;


public class MacchinarioController {
	
	private  MacchinarioView view;
	private GestioneMacchinario gm;

	
	public MacchinarioController(MacchinarioView view) {
	
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
		
		view.getCerca().addActionListener(new ActionListener() {
		
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
				//GestioneMacchinario m= new GestioneMacchinario (view.getNomeMacchinario(),view.getDataAcquisto());
						
				GestioneMacchinarioDAO md = new GestioneMacchinarioDAO();
				GestioneMacchinario g = new GestioneMacchinario (view.getNomeMacchinario(),view.getDataAcquisto());
				System.out.println(md.selectMacchinario(g));
				
			}
			
		});
		
	
		
	
	}
}

