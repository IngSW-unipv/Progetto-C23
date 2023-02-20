package it.unipv.sfw.esame.progettoC23;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class IscrittoContoller {
	
	private final Rinnovo rinnovo;
	private final IscrittoView view;
	private final Badge badge;
	
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
				
				
			//JOptionPane.showInputDialog(rinnovo.getDataRinnovo().getTime(), "Ecco la data del tuo rinnovo!")	;
			
			view.setRinnovo(rinnovo.getDataRinnovo());
			
					
				
			}
		});
		
		view.getVediBadge().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
				
				view.setBadge(badge.getCodiceBadge());
					
			}
			
		});
	}
	

}
