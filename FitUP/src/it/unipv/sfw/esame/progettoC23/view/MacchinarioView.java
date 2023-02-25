package it.unipv.sfw.esame.progettoC23.view;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Date;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.font.*;

import it.unipv.sfw.esame.progettoC23.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.Macchinario;
import it.unipv.sfw.esame.progettoC23.ManutenzioneMacchinario;
import it.unipv.sfw.esame.progettoC23.StatoAttuale;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;

public class MacchinarioView extends JFrame {
	private JButton NuovoMacchinario;
	private JButton Cerca;
	private JLabel uscita1;
	private JLabel uscita2;
	private JLabel uscita3;
	private JTextField NomeMacchinario;
	private JTextField DataAcquisto;
	public static final int altezza = 400;
	public static final int lunghezza = 600;
	//public static final int altezzab = 200;
	//public static final int lunghezzab = 100;
	
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
		
		ImageIcon img = new ImageIcon("Logo/Logo FitUP.png");
		setIconImage(img.getImage());
		
		
		uscita1 = new JLabel();
		sp.add(uscita1);
		
		uscita2 = new JLabel();
		sp.add(uscita2);
		
		uscita3 = new JLabel();
		sp.add(uscita3);
		
      JPanel centerpanel = new JPanel(new BorderLayout());
		
		/*try {
			BufferedImage img2 = ImageIO.read(new File("Logo/Logo FitUP.png"));
			Image dimg = img2.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
			ImageIcon imageIcon = new ImageIcon(dimg);
			JLabel picLabel = new JLabel(imageIcon);
			centerpanel.add(picLabel,BorderLayout.NORTH);
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		
		// c.anchor = GridBagConstraints.CENTER;
		JLabel NomeM = new JLabel("Nome Macchinario: ");
		NomeM.setFont( new Font("Arial", Font.BOLD, 16));
		np.add(NomeM);
		JTextField NomeMacchinario = new JTextField();
		NomeMacchinario.setColumns(30);
	    //add(NomeMacchinario, BorderLayout.CENTER);
		np.add(NomeMacchinario);
		
		//c.anchor = GridBagConstraints.CENTER;
		JLabel DataA = new JLabel ("       Data Acquisto:");
		DataA.setFont( new Font("Arial", Font.BOLD, 16));
		//add(DataA, BorderLayout.CENTER);
		cp.add(DataA);
		DataAcquisto = new JTextField();
		DataAcquisto.setColumns(30);
		//add( DataAcquisto, BorderLayout.CENTER);
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
	
	/* private StatoAttuale getStato() {
		return null;
	} */
	
	public void setIDMacchinario (Macchinario M) {
		uscita1.setText("IDMacchinario: " + M.getNomeMacchinario() + M.DataAcquisto.replace("/","") + "\n");
	}
	
	public void setDataManutenzione (ManutenzioneMacchinario M) {
		//uscita1.setText("IDMacchinario: " + IDMacchinario.getNomeMacchinario() + "\n");
		uscita1.setText("IDMacchinario: " + IDMacchinario.getIDMacchinario() + "\n");
		uscita2.setText("  DataManutenzione: " + ManutenzioneMacchinario.getDataManutenzione() + "\n");
		uscita3.setText("  Stato: " + ManutenzioneMacchinario.getStato() + "\n");
	}

	public void setIDMacchinario(IDMacchinario idMacchinario) {
		// TODO Auto-generated method stub
		
	}

	
}
