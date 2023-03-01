package it.unipv.sfw.esame.progettoC23.view;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CorsoView extends JFrame {
	
	private JLabel l;
	private JLabel l1;
	private JComboBox Elenco;
	public static final int altezza = 200;
	public static final int lunghezza = 350;
	public static final int lunghezza_e = 200;
	public static final int altezza_e = 20;
	
	public CorsoView() {
		setLayout(new FlowLayout());
		setSize(lunghezza,altezza);
		setTitle("Elenco dei corsi:");
		Container c = getContentPane();
		
		l = new JLabel("Seleziona il corso di cui vuoi visualizzare l'elenco:");
		l.setForeground(Color.black);
		c.add(l);
		

		l1 = new JLabel();
		l1.setForeground(Color.black);
		c.add(l1);
		
		String s[] = {"Elenco di Crossfit", "Elenco di Yoga", "Elenco di Zumba", "Elenco di Pilates" };
		
		Elenco = new JComboBox(s);
		Elenco.setPreferredSize(new Dimension(lunghezza_e,altezza_e));
		c.add(Elenco);

		
	}
	
	
	public JComboBox getElenco() {
		return Elenco;
	}
	
	public void stampaLista(List<String> list) {
		
		l.setText("L'elenco agli iscritti a questo corso è: ");
		l1.setText("\n" + list);
		
	}
	
}