package it.unipv.sfw.esame.progettoC23.view;
import java.awt.*;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.*;

public class IscrittoView extends JFrame {
	
	private JButton Vedi;
	private JButton VediBadge;
	private JLabel uscita1;
	private JLabel uscita2;
	private JTextField cf;
	public static final int altezza = 300;
	public static final int lunghezza = 200;
	public static final int altezzab = 150;
	public static final int lunghezzab = 100;
	
	public IscrittoView() {
		
		setLayout(new BorderLayout());
		setSize(altezza,lunghezza);
		setTitle("Informazioni su di te");
		JPanel sp = new JPanel();
		sp.setBackground(new Color(255,0,0));
		add(sp, BorderLayout.SOUTH);
		JPanel cp = new JPanel();
		cp.setBackground(new Color(255,0,0));
		add(cp, BorderLayout.CENTER);
		//Container c=getContentPane();
		//c.add(p);
		
		uscita1 = new JLabel();
		cp.add(uscita1);
		
		uscita2 = new JLabel();
		cp.add(uscita2);
		
		cf = new JTextField ("Inserire codice fiscale");
		cp.add(cf);
		
		Vedi = new JButton("RINNOVO");
		Vedi.setPreferredSize(new Dimension(altezzab,lunghezzab));
		Vedi.setActionCommand("Vedi qui data del rinnovo");
		sp.add(Vedi);
		
		VediBadge = new JButton("BADGE");
		VediBadge.setPreferredSize(new Dimension(altezzab,lunghezzab));
		VediBadge.setActionCommand("Vedi qui il tuo codice badge");
		sp.add(VediBadge);
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
	
	public JTextField getCf() {
		
		return cf;
	}
	
	
	
	

}
