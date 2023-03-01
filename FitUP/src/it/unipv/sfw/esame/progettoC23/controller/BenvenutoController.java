package it.unipv.sfw.esame.progettoC23.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.model.Badge;
import it.unipv.sfw.esame.progettoC23.model.IscrizioneCorso;
import it.unipv.sfw.esame.progettoC23.model.Persona;
import it.unipv.sfw.esame.progettoC23.model.Rinnovo;
import it.unipv.sfw.esame.progettoC23.view.BenvenutoView;

public class BenvenutoController {
	
	private  Rinnovo rinnovo;
	private  BenvenutoView view;
	private  Badge badge;
	private IscrizioneCorso p;
	private Calendar PrimaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	public BenvenutoController (BenvenutoView view, Badge badge, Rinnovo rinnovo, IscrizioneCorso p) {
		
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
		
		view.getElenco().addActionListener(new ActionListener() {
			
	        public void actionPerformed(ActionEvent event) {

	            int selezione = view.Elenco.getSelectedIndex();
	            
	            
	            switch (selezione) {
	            
	                case 0:
	                	p.riempiElenco(view.getCf(), "CROSSFIT");
	                	view.StampaLista(p.stampaCrossfit());
	                	break;
	                	
	                case 1:
	                	p.riempiElenco(view.getCf(), "YOGA");
	                	view.StampaLista(p.stampaYoga());
	                    break;

	                case 2:
	                	p.riempiElenco(view.getCf(), "ZUMBA");
	                	view.StampaLista(p.stampaZumba());
	                    break;
	                    
	                case 3:
	                	p.riempiElenco(view.getCf(), "PILATES");
	                	view.StampaLista(p.stampaPilates());
	                	break;
	            }
	        }
	    });	
	}
		


		
		
		
		
		
	
	
		
		
	


}
