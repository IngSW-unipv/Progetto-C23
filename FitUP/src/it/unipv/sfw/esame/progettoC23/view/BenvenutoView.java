package it.unipv.sfw.esame.progettoC23.view;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.List;

public class BenvenutoView extends JFrame {

	
	private JButton VediRinnovo;
	private JButton VediBadge;
	private JButton AggiungiIscritto;
	private JLabel uscita1;
	private JLabel uscita2;
	private JLabel inscf;
	private JLabel insnome;
	private JLabel inscognome;
	private JLabel insdata;
	private JLabel insrinnovo;
	private JTextField cf;
	private JTextField nome;
	private JTextField cognome;
	private JTextField datadinascita;
	private JTextField rinnovo;
	private JLabel l;
	private JLabel l1;
	public JComboBox Elenco;
	public static final int altezzab = 100;
	public static final int lunghezzab = 100;
	public static final int lunghezzad = 200;
	public static final int altezzad = 20;
	
	public BenvenutoView() {
		
		setLayout(new BorderLayout());
		setSize(500,500);
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

        String s[] = {"Elenco di Crossfit", "Elenco di Yoga", "Elenco di Zumba", "Elenco di Pilates"};
        
        inscf= new JLabel("Inserire codice fiscale:      ");
        cp.add(inscf);

        cf = new JTextField();
        cp.add(cf);
        cf.setColumns(30);
        
        insnome= new JLabel("Inserire nome:                        ");
        cp.add(insnome);

        nome = new JTextField();
        cp.add(nome);
        nome.setColumns(30);
        
        
        inscognome= new JLabel("Inserire cognome:                  ");
        cp.add(inscognome);

        cognome = new JTextField();
        cp.add(cognome);
        cognome.setColumns(30);
        
        insdata= new JLabel("Inserire data di nascita:          ");
        cp.add(insdata);

        datadinascita = new JTextField();
        cp.add(datadinascita);
        datadinascita.setColumns(30);
        
        insrinnovo= new JLabel("Inserire tipo di abbonamento:");
        cp.add(insrinnovo);

        rinnovo = new JTextField();
        cp.add(rinnovo);
        rinnovo.setColumns(30);
        
        l = new JLabel("Seleziona il corso a cui ti vuoi iscrivere:");
        l.setForeground(Color.black);
        cp.add(l);
        
        Elenco = new JComboBox(s);
        Elenco.setPreferredSize(new Dimension(lunghezzad, altezzad));
        cp.add(Elenco, BorderLayout.CENTER);
        
        l1 = new JLabel();
        l1.setForeground(Color.black);
        cp.add(l1);

        VediRinnovo = new JButton("RINNOVO");
        VediRinnovo.setPreferredSize(new Dimension(altezzab, lunghezzab));
        VediRinnovo.setBackground(new Color(255,255,255));
        sp.add(VediRinnovo);

        VediBadge = new JButton("BADGE");
        VediBadge.setPreferredSize(new Dimension(altezzab, lunghezzab));
        VediBadge.setBackground(new Color(255,255,255));
        sp.add(VediBadge);

        AggiungiIscritto = new JButton("ISCRIVI");
        AggiungiIscritto.setPreferredSize(new Dimension(altezzab, lunghezzab));
        AggiungiIscritto.setBackground(new Color(255,255,255));
        sp.add(AggiungiIscritto);
        
        uscita1 = new JLabel();
        cp.add(uscita1);

        uscita2 = new JLabel();
        cp.add(uscita2);
    }

    public JComboBox getElenco() {

        return Elenco;
    }

    public void StampaLista(List<String> list) {

        l.setText("L'elenco agli iscritti a questo corso è: ");
        l1.setText("\n" + list);

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


    public void setBadge(String codice) {

        uscita2.setText("Questo è il codice badge: " + codice);

    }

    public void setRinnovo(Calendar rinn) {

        uscita1.setText("Questa è la data del rinnovo: " + rinn.getTime());

    }


}
