package it.unipv.sfw.esame.progettoC23.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import it.unipv.sfw.esame.progettoC23.model.GestioneVisite;
import it.unipv.sfw.esame.progettoC23.model.Visita;
import it.unipv.sfw.esame.progettoC23.view.CercaVisiteView;


public class CercaVisiteController {
	private final CercaVisiteView cercaVisiteView;
	private GestioneVisite gestioneVisite;

	public CercaVisiteController(CercaVisiteView cercaVisiteView) {
		this.cercaVisiteView = cercaVisiteView;
		this.gestioneVisite = GestioneVisite.getInstance();
		setListeners();
	}
	public void setListeners() {
		cercaVisiteView.getCerca().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Calendar c= cercaVisiteView.getData();
				ArrayList<Visita> myList=gestioneVisite.elencoGiornaliero(c.get(Calendar.DATE), c.get(Calendar.MONTH), c.get(Calendar.YEAR));
				for (int i = 0; i < myList.size(); i++) {
					cercaVisiteView.getModelRisultati().add(i,myList.get(i));
				}
				
				// array of visits
				
			}
		});
		
		cercaVisiteView.getRisultati().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				cercaVisiteView.getEliminaButton().setEnabled(true);
				}
		});
		
		cercaVisiteView.getEliminaButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
				Visita v =cercaVisiteView.getRisultati().getSelectedValue();
				gestioneVisite.cancellaVisitaPerData(v.getDay_visit());
				cercaVisiteView.getModelRisultati().removeElement(v);
				JOptionPane.showMessageDialog(cercaVisiteView, "Visita eliminata correttamente");
			}
		});
		
		cercaVisiteView.getRicercaPerCFButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ArrayList<Visita> myList=gestioneVisite.cercaVisitaPerCf(cercaVisiteView.getCfInserito());
				for (int i = 0; i < myList.size(); i++) {
					cercaVisiteView.getModelRisultati().add(i,myList.get(i));	
				}
				
			}
		});
		
		
		
		
		
		
	}


}
