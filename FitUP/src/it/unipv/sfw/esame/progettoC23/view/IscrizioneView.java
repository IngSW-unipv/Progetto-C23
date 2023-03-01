package it.unipv.sfw.esame.progettoC23.view;
import java.awt.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.*;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.model.Badge;
import it.unipv.sfw.esame.progettoC23.model.TipoAbbonamento;

public class IscrizioneView extends JFrame {
	
	private JButton VediRinnovo;
	private JButton VediBadge;
	private JButton AggiungiIscritto;
	private JButton AggiungiZumba;
	private JButton AggiungiPilates;
	private JLabel uscita1;
	private JLabel uscita2;
	private JLabel uscita3;
	private JTextField corso;
	private JTextField cf;
	private JTextField nome;
	private JTextField cognome;
	private JTextField datadinascita;
	private JTextField rinnovo;
	public static final int altezza = 300;
	public static final int lunghezza = 200;
	public static final int altezzab = 150;
	public static final int lunghezzab = 100;	
	
	public IscrizioneView() {
		
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
		
		uscita1 = new JLabel();
		cp.add(uscita1);
		
		uscita2 = new JLabel();
		cp.add(uscita2);
		
		uscita3 = new JLabel();
		cp.add(uscita3);
		
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
		
		corso = new JTextField ();
		np.add(corso);
		corso.setColumns(20);
		
		VediRinnovo = new JButton("RINNOVO");
		VediRinnovo.setPreferredSize(new Dimension(altezzab,lunghezzab));
		sp.add(VediRinnovo);
		
		VediBadge = new JButton("BADGE");
		VediBadge.setPreferredSize(new Dimension(altezzab,lunghezzab));
		sp.add(VediBadge);
		
		AggiungiIscritto = new JButton("ISCRIVI");
		AggiungiIscritto.setPreferredSize(new Dimension(altezzab,lunghezzab));
		sp.add(AggiungiIscritto);
		
		AggiungiZumba = new JButton("ZUMBA");
		AggiungiZumba.setPreferredSize(new Dimension(altezzab,lunghezzab));
		sp.add(AggiungiZumba);
		
		AggiungiPilates = new JButton("PILATES");
		AggiungiPilates.setPreferredSize(new Dimension(altezzab,lunghezzab));
		sp.add(AggiungiPilates);
		
		
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
	
	public JButton getAggiungiZumba() {
		
		return AggiungiZumba;
	}
	
	public JButton getAggiungiPilates() {
		
		return AggiungiPilates;
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
	
	public String getCorso() {
		
		return corso.getText();
	}
	
	public void setBadge(String codice) {
		
		uscita2.setText("Questo è il codice badge: "+ codice);
		
	}

	public void setRinnovo(Calendar rinn) {
		
		uscita1.setText("Questa è la data del rinnovo: " + rinn.getTime());
		
	}
	
	public void setCorsoZumba(List<String> list) {
		
		uscita3.setText("Questo è l'elenco degli iscritti a Zumba: " + list);
		
	}
	
	public void setCorsoPilates(List<String> list) {
		
		uscita3.setText("Questo è l'elenco degli iscritti a Pilates: " + list);
		
	}
	
	public void setCorsoYoga(List<String> list) {
		
		uscita3.setText("Questo è l'elenco degli iscritti a Yoga: " + list);
		
	}
	
	public void setCorsoCrossfit(List<String> list) {
		
		uscita3.setText("Questo è l'elenco degli iscritti a Crossfit: " + list);
		
	}
	

		
		
		
}
