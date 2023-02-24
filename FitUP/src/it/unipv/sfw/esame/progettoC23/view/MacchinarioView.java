package it.unipv.sfw.esame.progettoC23.view;
import java.awt.*;
import java.sql.Date;
import java.util.Calendar;

import javax.swing.*;

public class MacchinarioView extends JFrame {
	private JButton Aggiungi;
	private JButton Visualizza;
	public static final int altezza = 150;
	public static final int lunghezza = 100;
	public static final int altezzab = 150;
	public static final int lunghezzab = 100;
	
	public MacchinarioView() {
		setLayout(new FlowLayout());
		setSize(altezza, lunghezza);
		setTitle("Macchinari");
		
		Container c = getContentPane(); 
	}
	
	
}
