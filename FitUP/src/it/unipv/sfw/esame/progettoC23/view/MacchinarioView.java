package it.unipv.sfw.esame.progettoC23.view;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Date;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.font.*;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;
import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.Macchinario;
import it.unipv.sfw.esame.progettoC23.model.ManutenzioneMacchinario;
import it.unipv.sfw.esame.progettoC23.model.StatoAttuale;

public class MacchinarioView extends JFrame {
	
	private JButton NuovoMacchinario;
	private JButton Cerca;
	public JLabel uscita1;
	private JLabel uscita2;
	private JLabel uscita3;
	private JTextField NomeMacchinario;
	private JTextField DataAcquisto;
	public static final int altezza = 400;
	public static final int lunghezza = 700;

	
	IDMacchinario id = new IDMacchinario();
	
	public MacchinarioView(Macchinario M) {
		this.setLayout(new BorderLayout());
		setSize(lunghezza, altezza);
		setTitle("Macchinari");
		
		JPanel sp = new JPanel();
		sp.setBackground(new Color(255,0,0));
		add(sp, BorderLayout.SOUTH);
		JPanel cp = new JPanel();
		cp.setBackground(new Color(255,0,0));
		add(cp, BorderLayout.CENTER);
		JPanel np= new JPanel();
		np.setBackground(new Color(255,0,0));
		add(np, BorderLayout.NORTH);
		
		ImageIcon img = new ImageIcon("Logo/Logo FitUP.png");
		setIconImage(img.getImage());
		
		uscita1 = new JLabel();
		sp.add(uscita1);
		
		uscita2 = new JLabel();
		sp.add(uscita2);
		
		uscita3 = new JLabel();
		sp.add(uscita3);
		
      JPanel centerpanel = new JPanel(new BorderLayout());
      
      centerpanel.setAutoscrolls(true);
		
		
		JLabel NomeM = new JLabel("Nome Macchinario: ");
		NomeM.setFont( new Font("Arial", Font.BOLD, 16));
		np.add(NomeM);
		JTextField NomeMacchinario = new JTextField();
		NomeMacchinario.setColumns(30);
		np.add(NomeMacchinario);
		
		
		JLabel DataA = new JLabel ("       Data Acquisto:");
		DataA.setFont( new Font("Arial", Font.BOLD, 16));
		cp.add(DataA);
		DataAcquisto = new JTextField();
		DataAcquisto.setColumns(30);
		cp.add(DataAcquisto); 
		
		
		NuovoMacchinario = new JButton("Aggiungi Macchinario");
	    sp.add(NuovoMacchinario);
		
		Cerca = new JButton("Cerca Macchinario");
		sp.add(Cerca);
		
			
	}

	public JButton getNuovoMacchinario() {
		return NuovoMacchinario;
	}


	public JButton getCerca() {
		return Cerca;
	}

	public String getNomeMacchinario() {
		return NomeMacchinario.getText();
	}
	
	public String getDataAcquisto() {
		return DataAcquisto.getText();
	}
	
	public void setNuovoMacchinario (GestioneMacchinario Macchinario) {
       uscita1.setText("IDMacchinario: " + Macchinario.getNomeMacchinario() + Macchinario.DataAcquisto.replace("/","") + "\n");
	}
	
	public String getIDMacchinario() {
		return null;
		
	}
	
	public void setDataManutenzione (ManutenzioneMacchinario M) {
		uscita1.setText("IDMacchinario: " + IDMacchinario.getIDMacchinario() + "  " + "Data Acquisto: " + M.DataAcquisto);
		uscita2.setText("  DataManutenzione: " + ManutenzioneMacchinario.getDataManutenzione() + "\n");
		uscita3.setText("  Stato: " + ManutenzioneMacchinario.getStato() + "\n");
	}
	
}
