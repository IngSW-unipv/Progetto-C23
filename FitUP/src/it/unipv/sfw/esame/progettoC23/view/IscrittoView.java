package it.unipv.sfw.esame.progettoC23.view;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class IscrittoView extends JFrame {

    private JButton vediRinnovo, vediBadge, aggiungiIscritto;
    private JLabel uscita1, uscita2;
    private JTextField cf, nome, cognome, datadinascita, rinnovo;
    public static final int altezza = 300;
    public static final int lunghezza = 200;
    public static final int altezzab = 150;
    public static final int lunghezzab = 100;
    private Calendar primaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);


    public IscrittoView() {

        setLayout(new BorderLayout());
        setSize(altezza, lunghezza);
        setTitle("Iscriviti alla FitUP!");
        JPanel sp = new JPanel();
        sp.setBackground(new Color(255, 0, 0));
        add(sp, BorderLayout.SOUTH);
        JPanel cp = new JPanel();
        cp.setBackground(new Color(255, 0, 0));
        add(cp, BorderLayout.CENTER);
        JPanel np = new JPanel();
        np.setBackground(new Color(255, 0, 0));
        add(np, BorderLayout.NORTH);

        //Container c=getContentPane();
        //c.add(p);

        uscita1 = new JLabel();
        cp.add(uscita1);

        uscita2 = new JLabel();
        cp.add(uscita2);

        cf = new JTextField();
        np.add(cf);
        cf.setColumns(20);

        nome = new JTextField();
        np.add(nome);
        nome.setColumns(20);

        cognome = new JTextField();
        np.add(cognome);
        cognome.setColumns(20);

        datadinascita = new JTextField();
        np.add(datadinascita);
        datadinascita.setColumns(20);

        rinnovo = new JTextField();
        np.add(rinnovo);
        rinnovo.setColumns(20);

        vediRinnovo = new JButton("RINNOVO");
        vediRinnovo.setPreferredSize(new Dimension(altezzab, lunghezzab));
        sp.add(vediRinnovo);

        vediBadge = new JButton("BADGE");
        vediBadge.setPreferredSize(new Dimension(altezzab, lunghezzab));
        sp.add(vediBadge);

        aggiungiIscritto = new JButton("ISCRIVI");
        aggiungiIscritto.setPreferredSize(new Dimension(altezzab, lunghezzab));
        sp.add(aggiungiIscritto);


    }

    public JButton getVediRinnovo() {

        return vediRinnovo;
    }

    public JButton getVediBadge() {

        return vediBadge;
    }

    public JButton getAggiungiIscritto() {

        return aggiungiIscritto;
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
        uscita2.setText("Questo è il codice badge: " + codice + "FitUp");

    }

    public void setRinnovo(String rinn) {

        switch (rinn) {
            case "MENSILE":
                primaIscrizione.add(Calendar.MONTH, +1);
                uscita2.setText("Questa è la data del rinnovo: " + primaIscrizione.getTime());
                break;
            case "SEMESTRALE":
                primaIscrizione.add(Calendar.MONTH, +6);
                uscita2.setText("Questa è la data del rinnovo: " + primaIscrizione.getTime());
                break;
            case "ANNUALE":
                primaIscrizione.add(Calendar.YEAR, +1);
                uscita2.setText("Questa è la data del rinnovo: " + primaIscrizione.getTime());
                break;

        }


    }


}
