package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.ManutenzioneMacchinario;
import it.unipv.sfw.esame.progettoC23.view.MacchinarioView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinarioDAO;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.Macchinario;
import it.unipv.sfw.esame.progettoC23.model.ManutenzioneMacchinario;
import it.unipv.sfw.esame.progettoC23.model.Persona;
import it.unipv.sfw.esame.progettoC23.view.MacchinarioView;
import javax.swing.JOptionPane;
import java.util.*;

public class MacchinarioController {
	
	private  MacchinarioView view;
	

    public MacchinarioController(ManutenzioneMacchinario dataAcquisto, MacchinarioView view, IDMacchinario idMacchinario) {

        this.dataAcquisto = dataAcquisto;
        this.view = view;
        this.idMacchinario = idMacchinario;

	
	public MacchinarioController(MacchinarioView view) {
	
		
		this.view = view;
		

		
		setListeners();
	}

	private void setListeners() {
		
		view.getNuovoMacchinario().addActionListener(new ActionListener() {
		
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
				GestioneMacchinario m= new GestioneMacchinario (view.getNomeMacchinario(),view.getDataAcquisto());
						
						GestioneMacchinarioDAO md = new GestioneMacchinarioDAO();
						GestioneMacchinario g = new GestioneMacchinario (m.getNomeMacchinario(),m.getDataAcquisto());
						System.out.println(md.insertMacchinario(g));
				
			}
			
		});
		
	
	}	

