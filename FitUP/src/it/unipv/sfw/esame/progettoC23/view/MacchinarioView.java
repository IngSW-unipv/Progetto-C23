package it.unipv.sfw.esame.progettoC23.view;

import it.unipv.sfw.esame.progettoC23.model.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.model.Macchinario;
import it.unipv.sfw.esame.progettoC23.model.ManutenzioneMacchinario;

import javax.swing.*;
import java.awt.*;

public class MacchinarioView extends JFrame {
	
	private JButton NuovoMacchinario;
	private JButton Cerca;
	private JTextField NomeMacchinario;
	private JTextField DataAcquisto;
	private IDMacchinario id;
	
	public MacchinarioView() {
		
		this.setLayout(new BorderLayout());
		setSize(500, 500);
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
		np.add(NomeM);
		
		NomeMacchinario = new JTextField();
		NomeMacchinario.setColumns(30);
		np.add(NomeMacchinario);
		
		JLabel DataA = new JLabel ("       Data Acquisto:");
		cp.add(DataA);
		
		DataAcquisto = new JTextField();
		DataAcquisto.setColumns(30);
		cp.add(DataAcquisto); 
		
		NuovoMacchinario = new JButton("AGGIUNGI MACCHINARIO");
		NuovoMacchinario.setBackground(new Color(255,255,255));
	    sp.add(NuovoMacchinario);
		
		Cerca = new JButton("CERCA MACCHINARIO");
		Cerca.setBackground(new Color(255,255,255));
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
