package it.unipv.sfw.esame.progettoC23.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;
import it.unipv.sfw.esame.progettoC23.model.corso.IscrizioneCorso;
import it.unipv.sfw.esame.progettoC23.model.iscrizione.Badge;
import it.unipv.sfw.esame.progettoC23.model.iscrizione.Rinnovo;
import it.unipv.sfw.esame.progettoC23.model.macchinario.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.macchinario.Macchinario;
import it.unipv.sfw.esame.progettoC23.view.BenvenutoView;
import it.unipv.sfw.esame.progettoC23.view.CercaVisiteView;
import it.unipv.sfw.esame.progettoC23.view.InserisciVisitaView;
import it.unipv.sfw.esame.progettoC23.view.MacchinarioView;
import it.unipv.sfw.esame.progettoC23.view.OpenView;
import it.unipv.sfw.esame.progettoC23.view.VisitaView;

public class OpenController {
	
	private OpenView view;
	
	public OpenController(OpenView view) {
		
		this.view=view;
		
		setListeners();
	}
	
	public void setListeners() {
		
	view.getScelta().addActionListener(new ActionListener() {
			
	        public void actionPerformed(ActionEvent event) {

	            int selezione = view.scelte.getSelectedIndex();
	            
	            switch (selezione) {
	            
	                case 0:
	                	
	                	Badge b = new Badge();
	            		Rinnovo r = new Rinnovo();
	            		IscrizioneCorso p= new IscrizioneCorso();
	            		
	                	BenvenutoView bv = new BenvenutoView();
	            		BenvenutoController bc = new BenvenutoController(bv,b,r,p);
	            		bv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            		bv.setVisible(true);
	                	
	                	break;
	                	
	                case 1:
	                	
	                	InserisciVisitaView ivv = new InserisciVisitaView();
	                	InserisciVisitaController ivc = new InserisciVisitaController(ivv);
	                	ivv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            		ivv.setVisible(true);
	                	
	                    break;
	                    
	                case 2:
	                	
	                	CercaVisiteView cvv = new CercaVisiteView();
	                	CercaVisiteController cvc = new CercaVisiteController(cvv);
	                	cvv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                	cvv.setVisible(true);
	                	
	                    break;

	                case 3:
	                	
	                	Macchinario m = new Macchinario();
	                	IDMacchinario idm = new IDMacchinario();
	                	MacchinarioView mv = new MacchinarioView();
	                	MacchinarioController mc = new MacchinarioController(mv,m,idm);
	                	mv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            		mv.setVisible(true);

	                	
	                    break;
	                    
	                
	            }
	        }
	    });	
	}
	
	

}
