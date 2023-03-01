package it.unipv.sfw.esame.progettoC23;

public class Persona {
    private String nome, cognome, CF;
    private String dataNascita;

    public Persona(String CF, String nome, String cognome, String dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.CF = CF;
        this.dataNascita = dataNascita;
    }

    public String getCF() {
        return CF;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    @Override
    public String toString() {
        return "Persona: (" + CF + ", " + nome + ", " + cognome + ", " + dataNascita + ")" + "\n";
    }


}
