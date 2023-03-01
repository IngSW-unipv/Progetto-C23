package it.unipv.sfw.esame.progettoC23;

public class Corso {

    private TipoCorso nomeCorso;
    private static final int MAX_ISCRITTI = 30;
    private int n_Iscritti;
    private Persona istruttore;

    public Corso(TipoCorso NomeCorso, Persona Istruttore) {

        this.nomeCorso = NomeCorso;
        this.n_Iscritti = 0;
        this.istruttore = Istruttore;
    }


}
