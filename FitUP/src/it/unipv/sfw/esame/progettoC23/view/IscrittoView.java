package it.unipv.sfw.esame.progettoC23.view;
import java.awt.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.*;

import it.unipv.sfw.esame.progettoC23.Badge;
import it.unipv.sfw.esame.progettoC23.TipoAbbonamento;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;

public class IscrittoView extends JFrame {
	
	private JButton VediRinnovo;
	private JButton VediBadge;
	private JButton AggiungiIscritto;
	private JLabel uscita1;
	private JLabel uscita2;
	private JTextField cf;
	private JTextField nome;
	private JTextField cognome;
	private JTextField datadinascita;
	private JTextField rinnovo;
	public static final int altezza = 300;
	public static final int lunghezza = 200;
	public static final int altezzab = 150;
	public static final int lunghezzab = 100;
	private Calendar PrimaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	
	
	public IscrittoView() {
		
		setLayout(new BorderLayout());
		setSize(altezza,lunghezza);
		setTitle("Iscriviti alla FitUP!");
		JPanel sp = new JPanel();
		sp.setBackground(new Color(255,0,0));
		add(sp, BorderLayout.SOUTH);
		JPanel cp = new JPanel();
		cp.setBackground(new Color(255,0,0));
		add(cp, BorderLayout.CENTER);
		JPanel np= new JPanel();
		np.setBackground(new Color(255,0,0));
		add(np, BorderLayout.NORTH);
		//Container c=getContentPane();
		//c.add(p);
		
		uscita1 = new JLabel();
		cp.add(uscita1);
		
		uscita2 = new JLabel();
		cp.add(uscita2);
		
		cf = new JTextField ();
		np.add(cf);
		cf.setColumns(20);
		
		nome = new JTextField ();
		np.add(nome);
		nome.setColumns(20);
		
		cognome = new JTextField ();
		np.add(cognome);
		cognome.setColumns(20);
		
		datadinascita = new JTextField ();
		np.add(datadinascita);
		datadinascita.setColumns(20);
		
		rinnovo = new JTextField ();
		np.add(rinnovo);
		rinnovo.setColumns(20);
		
		VediRinnovo = new JButton("RINNOVO");
		VediRinnovo.setPreferredSize(new Dimension(altezzab,lunghezzab));
		sp.add(VediRinnovo);
		
		VediBadge = new JButton("BADGE");
		VediBadge.setPreferredSize(new Dimension(altezzab,lunghezzab));
		sp.add(VediBadge);
		
		AggiungiIscritto = new JButton("ISCRIVI");
		AggiungiIscritto.setPreferredSize(new Dimension(altezzab,lunghezzab));
		sp.add(AggiungiIscritto);
		
		
	}

	public JButton getVediRinnovo() {
		
		return VediRinnovo;
	}
	
	public JButton getVediBadge() {
		
		return VediBadge;
	}
	
	public JButton getAggiungiIscritto() {
		
		return AggiungiIscritto;
	}
	
	public String getCf() {
		
		return cf.getText();
	}
	
	public String getNome() {
		
		return nome.getText();
	}
	
	public String getCognome() {
		
		return cognome.getText();
	}
	
	public String getDatadiNascita() {
		
		return datadinascita.getText();
	}
	
	
	public String getRinnovo() {
		
		return rinnovo.getText();
	} 
	
	
	public void setBadge(String codice) {
		uscita2.setText("Questo è il codice badge: "+ codice + "FitUp");
		
	}

	public void setRinnovo(String rinn) {
		
		switch (rinn) {
		case "MENSILE":	
			PrimaIscrizione.add(Calendar.MONTH, +1);
			uscita2.setText("Questa è la data del rinnovo: "+ PrimaIscrizione.getTime());
			break;
		case "SEMESTRALE":
			PrimaIscrizione.add(Calendar.MONTH, +6);
			uscita2.setText("Questa è la data del rinnovo: "+ PrimaIscrizione.getTime());
			break;
		case "ANNUALE":
			PrimaIscrizione.add(Calendar.YEAR, +1);
			uscita2.setText("Questa è la data del rinnovo: "+ PrimaIscrizione.getTime());
			break;
				
		}
		
	
		
		
	}
	public void setPopolaVettore() {
		
		
		
		
		
	}
	
	


	
	
	
	
	
	
	

}
