package it.unipv.sfw.esame.progettoC23.jdbc.bean;


public class Iscrizione {
    protected String CF;
    protected String nome;
    protected String cognome;
    protected String datadiNascita;
    protected String codicebadge;

    public Iscrizione(String CF, String nome, String cognome, String datadiNascita) {
        this.CF = CF;
        this.nome = nome;
        this.cognome = cognome;
        this.datadiNascita = datadiNascita;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String cF) {
        CF = cF;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDatadiNascita() {
        return datadiNascita;
    }

    public void setDatadiNascita(String datadiNascita) {
        this.datadiNascita = datadiNascita;
    }

    @Override
    public String toString() {
        return "Iscritto: (" + CF + ", " + nome + ", " + cognome + ", " + datadiNascita + ")" + "\n";
    }


}
