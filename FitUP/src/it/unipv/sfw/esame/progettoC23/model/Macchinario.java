package it.unipv.sfw.esame.progettoC23.model;

public class Macchinario {

    private String nomeMacchinario;
    private String dataAcquisto;

    public Macchinario(String nomeMacchinario, String DataAcquisto) {
        this.nomeMacchinario = nomeMacchinario;
        this.dataAcquisto = DataAcquisto;
    }


    public String getDataAcquisto() {
        return dataAcquisto;
    }


    public String getNomeMacchinario() {
        return nomeMacchinario;
    }

    @Override
    public String toString() {
        return "Macchinario: (" + nomeMacchinario + ", " + dataAcquisto + ")" + "\n";
    }

}
