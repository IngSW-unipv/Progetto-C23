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
	private JTextField cf;
	private JTextField nome;
	private JTextField cognome;
	private JTextField datadinascita;
	private JTextField rinnovo;
	private JLabel l;
	private JLabel l1;
	public JComboBox Elenco;
	public static final int altezzab = 150;
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
		JPanel wp= new JPanel();
		wp.setBackground(new Color(255,0,0));
		add(wp, BorderLayout.WEST);
		
		
		
		


    

 


        l = new JLabel("Seleziona il corso a cui ti vuoi iscrivere:");
        l.setForeground(Color.black);
        cp.add(l);


        l1 = new JLabel();
        l1.setForeground(Color.black);
        cp.add(l1);

        String s[] = {"Elenco di Crossfit", "Elenco di Yoga", "Elenco di Zumba", "Elenco di Pilates"};

        Elenco = new JComboBox(s);
        Elenco.setPreferredSize(new Dimension(lunghezzad, altezzad));
        cp.add(Elenco, BorderLayout.CENTER);

        uscita1 = new JLabel();
        sp.add(uscita1);

        uscita2 = new JLabel();
        sp.add(uscita2);

        cf = new JTextField("INSERIRE CF");
        np.add(cf);
        cf.setColumns(20);
        cf.setOpaque(true);

        nome = new JTextField("INSERIRE NOME");
        np.add(nome);
        nome.setColumns(20);

        cognome = new JTextField("INSERIRE COGNOME");
        np.add(cognome);
        cognome.setColumns(20);

        datadinascita = new JTextField("INSERIRE DATA DI NASCITA");
        np.add(datadinascita);
        datadinascita.setColumns(20);

        rinnovo = new JTextField("INSERIRE TIPO DI ABBONAMENTO");
        np.add(rinnovo);
        rinnovo.setColumns(20);

        VediRinnovo = new JButton("RINNOVO");
        VediRinnovo.setPreferredSize(new Dimension(altezzab, lunghezzab));
        wp.add(VediRinnovo);

        VediBadge = new JButton("BADGE");
        VediBadge.setPreferredSize(new Dimension(altezzab, lunghezzab));
        wp.add(VediBadge);

        AggiungiIscritto = new JButton("ISCRIVI");
        AggiungiIscritto.setPreferredSize(new Dimension(altezzab, lunghezzab));
        wp.add(AggiungiIscritto);
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
