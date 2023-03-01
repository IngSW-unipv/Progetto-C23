package it.unipv.sfw.esame.progettoC23.view;

import it.unipv.sfw.esame.progettoC23.IDMacchinario;
import it.unipv.sfw.esame.progettoC23.Macchinario;
import it.unipv.sfw.esame.progettoC23.ManutenzioneMacchinario;

import javax.swing.*;
import java.awt.*;

public class MacchinarioView extends JFrame {

    private JButton nuovoMacchinario, cerca;
    public JLabel uscita1, uscita2, uscita3;
    private JTextField nomeMacchinario, dataAcquisto;
    private IDMacchinario id;
    public static final int altezza = 400;
    public static final int lunghezza = 700;


    public MacchinarioView(Macchinario m) {
        this.setLayout(new BorderLayout());
        setSize(lunghezza, altezza);
        setTitle("Macchinari");
        id = new IDMacchinario();

        JPanel sp = new JPanel();
        sp.setBackground(new Color(255, 0, 0));
        add(sp, BorderLayout.SOUTH);
        JPanel cp = new JPanel();
        cp.setBackground(new Color(255, 0, 0));
        add(cp, BorderLayout.CENTER);
        JPanel np = new JPanel();
        np.setBackground(new Color(255, 0, 0));
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
        NomeM.setFont(new Font("Arial", Font.BOLD, 16));
        np.add(NomeM);
        JTextField nomeMacchinario = new JTextField();
        nomeMacchinario.setColumns(30);
        np.add(nomeMacchinario);


        JLabel dataA = new JLabel("       Data Acquisto:");
        dataA.setFont(new Font("Arial", Font.BOLD, 16));
        cp.add(dataA);
        dataAcquisto = new JTextField();
        dataAcquisto.setColumns(30);
        cp.add(dataAcquisto);


        nuovoMacchinario = new JButton("Aggiungi Macchinario");
        sp.add(nuovoMacchinario);

        cerca = new JButton("Cerca Macchinario");
        sp.add(cerca);


    }

    public JButton getNuovoMacchinario() {
        return nuovoMacchinario;
    }


    public JButton getCerca() {
        return cerca;
    }

    public String getNomeMacchinario() {
        return nomeMacchinario.getText();
    }

    public String getDataAcquisto() {
        return dataAcquisto.getText();
    }

/*    public void setNuovoMacchinario(GestioneMacchinario macchinario) {
        uscita1.setText("IDMacchinario: " + macchinario.getNomeMacchinario() + macchinario.getDataAcquisto().replace("/", "") + "\n");
    }*/

    public void setNuovoMacchinario(String idMacchinario) {
        uscita1.setText("IDMacchinario: " + idMacchinario);
    }

    public String getIDMacchinario() {
        return null;
    }

    public void setDataManutenzione(ManutenzioneMacchinario m) {
        uscita1.setText("IDMacchinario: " + id.getIDMacchinario() + "  " + "Data Acquisto: " + m.getDataAcquisto());
        uscita2.setText("  DataManutenzione: " + m.getDataManutenzione() + "\n");
        uscita3.setText("  Stato: " + m.getStato() + "\n");
    }

}
