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
	public static final int altezza = 400;
	public static final int lunghezza = 700;
	private IDMacchinario id;
	
	public MacchinarioView() {
		
		this.setLayout(new BorderLayout());
		setSize(lunghezza, altezza);
		setTitle("Macchinari");
		
		id = new IDMacchinario();
		
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
	
	



/*    public void setNuovoMacchinario(GestioneMacchinario macchinario) {
        uscita1.setText("IDMacchinario: " + macchinario.getNomeMacchinario() + macchinario.getDataAcquisto().replace("/", "") + "\n");
    }*/

/*    public void setNuovoMacchinario(String idMacchinario) {
        uscita1.setText("IDMacchinario: " + idMacchinario);
    }

    public String getIDMacchinario() {
        return null;
    }

    public void setDataManutenzione(ManutenzioneMacchinario m) {
        uscita1.setText("IDMacchinario: " + id.getIDMacchinario() + "  " + "Data Acquisto: " + m.getDataAcquisto());
        uscita2.setText("  DataManutenzione: " + m.getDataManutenzione() + "\n");
        uscita3.setText("  Stato: " + m.getStato() + "\n");
    }*/

}
