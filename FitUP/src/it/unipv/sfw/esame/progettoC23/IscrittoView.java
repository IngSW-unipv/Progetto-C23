package it.unipv.sfw.esame.progettoC23;
import java.awt.*;
import java.sql.Date;
import java.util.Calendar;

import javax.swing.*;

public class IscrittoView extends JFrame {
	
	private JButton Vedi;
	private JButton VediBadge;
	private JLabel uscita1;
	private JLabel uscita2;
	public static final int altezza = 300;
	public static final int lunghezza = 200;
	public static final int altezzab = 150;
	public static final int lunghezzab = 100;
	
	public IscrittoView() {
		
		setLayout(new FlowLayout());
		setSize(altezza,lunghezza);
		setTitle("Informazioni su di te");
		//JPanel p = new JPanel();
		Container c=getContentPane();
		//c.add(p);
		
		uscita1 = new JLabel();
		c.add(uscita1);
		
		uscita2 = new JLabel();
		c.add(uscita2);
		
		Vedi = new JButton("RINNOVO");
		Vedi.setPreferredSize(new Dimension(altezzab,lunghezzab));
		Vedi.setActionCommand("Vedi qui data del rinnovo");
		c.add(Vedi);
		
		VediBadge = new JButton("BADGE");
		VediBadge.setPreferredSize(new Dimension(altezzab,lunghezzab));
		VediBadge.setActionCommand("Vedi qui il tuo codice badge");
		c.add(VediBadge);
	}

	public JButton getVedi() {
		
		return Vedi;
	}
	
	public JButton getVediBadge() {
		
		return VediBadge;
	}
	
	public void setRinnovo(Calendar data) {
		uscita1.setText("Questa è la data del rinnovo: "+data.getTime());
		
	}
	
	public void setBadge(String bad) {
		uscita2.setText("Questo è il codice badge: "+bad);
		
	}
	
	

}
