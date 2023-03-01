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
	private JTextField NomeMacchinario;
	private JTextField DataAcquisto;
	public static final int altezza = 400;
	public static final int lunghezza = 700;

	IDMacchinario id = new IDMacchinario();
	
	public MacchinarioView() {
		
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
		
		NuovoMacchinario = new JButton("AGGIUNGI MACCHINARIO");
	    sp.add(NuovoMacchinario);
		
		Cerca = new JButton("CERCA MACCHINARIO");
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
	
	
}
