package it.unipv.sfw.esame.progettoC23.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import it.unipv.sfw.esame.progettoC23.model.Badge;
import it.unipv.sfw.esame.progettoC23.model.IscrizioneCorso;
import it.unipv.sfw.esame.progettoC23.model.Rinnovo;
import it.unipv.sfw.esame.progettoC23.view.BenvenutoView;
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
	                	
	                	VisitaView vv = new VisitaView();
	                	VisitaController vc = new VisitaController(vv);
	                	vv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            		vv.setVisible(true);
	                	
	                    break;

	                case 2:
	                	
	                	MacchinarioView mv = new MacchinarioView();
	                	MacchinarioController mc = new MacchinarioController(mv);
	                	mv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            		mv.setVisible(true);

	                	
	                    break;
	                    
	                
	            }
	        }
	    });	
	}
	
	

}