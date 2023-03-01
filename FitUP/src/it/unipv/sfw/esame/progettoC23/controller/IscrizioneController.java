package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.sfw.esame.progettoC23.Persona;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.view.IscrittoView;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JOptionPane;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.jdbc.util.*;
import it.unipv.sfw.esame.progettoC23.model.Badge;
import it.unipv.sfw.esame.progettoC23.model.IscrizioneCorso;
import it.unipv.sfw.esame.progettoC23.model.IscrizioneCorsoP;
import it.unipv.sfw.esame.progettoC23.model.Persona;
import it.unipv.sfw.esame.progettoC23.model.Rinnovo;
import it.unipv.sfw.esame.progettoC23.view.BenvenutoView;
import it.unipv.sfw.esame.progettoC23.view.IscrizioneView;

public class IscrizioneController {
	
	private  Rinnovo rinnovo;
	private  BenvenutoView view;
	private  Badge badge;
	private IscrizioneCorsoP p;
	private Calendar PrimaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	public IscrizioneController (BenvenutoView view, Badge badge, Rinnovo rinnovo, IscrizioneCorsoP p) {
		
		this.rinnovo=rinnovo;
		this.view=view;
		this.badge=badge;
		this.p=p;
		
		setListeners();
	}
	
	public void setListeners() {
		
		view.getVediRinnovo().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent e) {
		
			rinnovo.setDataRinnovo(view.getRinnovo());
			view.setRinnovo(rinnovo.getDataRinnovo());
			
			
			
			}
		});

		
		view.getVediBadge().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
			
			badge.setCodiceBadge(view.getCf());	
			view.setBadge(badge.getCodiceBadge());
	
					
			}
			
		});
		
		view.getAggiungiIscritto().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			Persona p = new Persona (view.getCf(),view.getNome(),
			view.getCognome(),view.getDatadiNascita());
			
			IscrizioneDAO id = new IscrizioneDAO();
			Iscrizione g = new Iscrizione (p.getCF(),p.getNome(),p.getCognome(),p.getDataNascita());
			System.out.println(id.selectAll());
			System.out.println(id.insertIscritto(g));
			
			
			
				
				
			}

		});
		


		
		
		
		
		
	}
	
	
		
		
	


}
