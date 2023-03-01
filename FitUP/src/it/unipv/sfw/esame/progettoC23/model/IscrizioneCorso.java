package it.unipv.sfw.esame.progettoC23.model;

import java.util.ArrayList;
import java.util.List;

public class IscrizioneCorso {
    private static volatile IscrizioneCorso INSTANCE = null;
    private String CF;
    private String CorsoScelto;
    private static List<String> ElencoCrossfit = new ArrayList<String>(30);
    private static List<String> ElencoYoga = new ArrayList<String>(30);
    private static List<String> ElencoZumba = new ArrayList<String>(30);
    private static List<String> ElencoPilates = new ArrayList<String>(30);

    private IscrizioneCorso() {
        ElencoCrossfit = new ArrayList<String>(30);
        ElencoYoga = new ArrayList<String>(30);
        ElencoZumba = new ArrayList<String>(30);
        ElencoPilates = new ArrayList<String>(30);
    }

    public static IscrizioneCorso getInstance() {
        if (INSTANCE == null) {
            synchronized (IscrizioneCorso.class) {
                if (INSTANCE == null) {
                    INSTANCE = new IscrizioneCorso();
                }
            }
        }
        return INSTANCE;
    }

    public void riempiElenco(String CF, String CorsoScelto) {

        this.CF = CF;
        this.CorsoScelto = CorsoScelto;

        switch (CorsoScelto) {

            case "CROSSFIT":

                ElencoCrossfit.add(CF);

                if (ElencoCrossfit.size() >= 30) {

                    throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
                }

                System.out.println(CF);
                // System.out.println(ElencoCrossfit);

                break;

            case "YOGA":

                ElencoYoga.add(CF);

                if (ElencoYoga.size() >= 30) {

                    throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
                }

                System.out.println(CF);

                break;

            case "ZUMBA":

                ElencoZumba.add(CF);

                if (ElencoZumba.size() >= 30) {

                    throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
                }

                System.out.println(CF);
                // System.out.println(ElencoZumba);

                break;

            case "PILATES":

                ElencoPilates.add(CF);

                if (ElencoPilates.size() >= 30) {

                    throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
                }

                System.out.println(CF);

                break;

        }
    }


    public List<String> stampaCrossfit() {

        return ElencoCrossfit;
    }

    public List<String> stampaYoga() {

        return ElencoYoga;
    }

    public List<String> stampaZumba() {

        return ElencoZumba;
    }

    public List<String> stampaPilates() {

        return ElencoPilates;
    }


}