package it.unipv.sfw.esame.progettoC23.controller;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JOptionPane;

import it.unipv.sfw.esame.progettoC23.Badge;
import it.unipv.sfw.esame.progettoC23.Rinnovo;
import it.unipv.sfw.esame.progettoC23.TipoAbbonamento;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.view.IscrittoView;

public class IscrittoContoller {
	
	private final Rinnovo rinnovo;
	private final IscrittoView view;
	private final Badge badge;
	private Calendar PrimaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	
	public IscrittoContoller (Rinnovo rinnovo, IscrittoView view, Badge badge) {
		
		this.rinnovo=rinnovo;
		this.view=view;
		this.badge=badge;
		
		setListeners();
	}
	
	public void setListeners() {
		
			
		view.getVedi().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent e) {
			
			
			switch (view.getRinnovo()) {
			case "MENSILE":	
			PrimaIscrizione.add(Calendar.MONTH, +1);
			view.setRinnovo(PrimaIscrizione.add(Calendar.MONTH, +1));
			break;
			case "SEMESTRALE":
			PrimaIscrizione.add(Calendar.MONTH, +6);
			view.setRinnovo(PrimaIscrizione.add(Calendar.MONTH, +6));
			break;
			case "ANNUALE":
			PrimaIscrizione.add(Calendar.YEAR, +1);
			view.setRinnovo(PrimaIscrizione.add(Calendar.MONTH, +12));
			break;
						
				}
			
			
					
				
			}
		});
		
		view.getVediBadge().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
				
			view.setBadge(view.getCf());
					
			}
			
		});
		
		
		
		
	}
	

}
