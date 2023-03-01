package it.unipv.sfw.esame.progettoC23;

import java.util.ArrayList;
import java.util.List;

public class IscrizioneCorso {

    private String codiceBadge;
    private TipoCorso corsoScelto;
    private static List<String> elencoCrossfit = new ArrayList<>(30);
    private static List<String> elencoYoga = new ArrayList<>(30);
    private static List<String> elencoZumba = new ArrayList<>(30);
    private static List<String> elencoPilates = new ArrayList<>(30);

    public IscrizioneCorso() {

    }

    public void riempiElenco(String codiceBadge, TipoCorso corsoScelto) {

        this.codiceBadge = codiceBadge;
        this.corsoScelto = corsoScelto;

        switch (corsoScelto) {

            case CROSSFIT:

                elencoCrossfit.add(codiceBadge);

                if (elencoCrossfit.size() >= 30) {

                    throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
                }

                System.out.println(codiceBadge);
                // System.out.println(ElencoCrossfit);

                break;

            case YOGA:

                elencoYoga.add(codiceBadge);

                if (elencoYoga.size() >= 30) {

                    throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
                }

                System.out.println(codiceBadge);

                break;

            case ZUMBA:

                elencoZumba.add(codiceBadge);

                if (elencoZumba.size() >= 30) {

                    throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
                }

                System.out.println(codiceBadge);
                // System.out.println(ElencoZumba);

                break;

            case PILATES:

                elencoPilates.add(codiceBadge);

                if (elencoPilates.size() >= 30) {

                    throw new ArrayIndexOutOfBoundsException("Raggiunto il numero massimo di iscritti a questo corso.");
                }

                System.out.println(codiceBadge);

                break;

        }
    }

    public void svuotaElenco(String codiceBadge, TipoCorso corsoScelto) {

        this.codiceBadge = codiceBadge;
        this.corsoScelto = corsoScelto;

        switch (corsoScelto) {

            case CROSSFIT:

                elencoCrossfit.remove(codiceBadge);
                System.out.println(elencoCrossfit);
                break;

            case YOGA:

                elencoYoga.remove(codiceBadge);
                System.out.println(elencoYoga);
                break;

            case ZUMBA:

                elencoZumba.remove(codiceBadge);
                System.out.println(elencoZumba);
                break;

            case PILATES:

                elencoPilates.remove(codiceBadge);
                System.out.println(elencoPilates);
                break;

        }
    }

    public static List<String> stampaCrossfit() {
        return elencoCrossfit;
    }

    public static List<String> stampaYoga() {
        return elencoYoga;
    }

    public static List<String> stampaZumba() {
        return elencoZumba;
    }

    public static List<String> stampaPilates() {
        return elencoPilates;
    }
}