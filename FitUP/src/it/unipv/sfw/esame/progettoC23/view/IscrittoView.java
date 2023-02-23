package it.unipv.sfw.esame.progettoC23.view;
import java.awt.*;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.*;

import it.unipv.sfw.esame.progettoC23.Badge;
import it.unipv.sfw.esame.progettoC23.TipoAbbonamento;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;

public class IscrittoView extends JFrame {
	
	private JButton Vedi;
	private JButton VediBadge;
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
	
	Badge b = new Badge();
	
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
		
		Vedi = new JButton("RINNOVO");
		Vedi.setPreferredSize(new Dimension(altezzab,lunghezzab));
		//Vedi.setActionCommand("Vedi qui data del rinnovo");
		sp.add(Vedi);
		
		VediBadge = new JButton("BADGE");
		VediBadge.setPreferredSize(new Dimension(altezzab,lunghezzab));
		//VediBadge.setActionCommand("Vedi qui il tuo codice badge");
		sp.add(VediBadge);
	}

	public JButton getVedi() {
		
		return Vedi;
	}
	
	public JButton getVediBadge() {
		
		return VediBadge;
	}
	
	public String getCf() {
		
		return cf.getText();
	}
	
	public String getRinnovo() {
		
		return rinnovo.getText();
	}
	
	
	
	
	public void setBadge(String codice) {
		uscita2.setText("Questo è il codice badge: "+ codice + "FitUp");
		
	}

	public void setRinnovo(Object add) {
		uscita1.setText("Questa è la data del rinnovo: "+add);
		
	}

	
	
	
	
	
	
	

}
