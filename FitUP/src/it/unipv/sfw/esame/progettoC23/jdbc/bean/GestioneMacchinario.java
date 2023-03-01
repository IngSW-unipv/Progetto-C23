package it.unipv.sfw.esame.progettoC23.jdbc.bean;

import it.unipv.sfw.esame.progettoC23.Macchinario;


public class GestioneMacchinario {
    private String dataAcquisto;
    private String nomeMacchinario;
    private String IDMacchinario;


    public GestioneMacchinario(String nomeMacchinario, String iDMacchinario, String dataAcquisto) {
        this.nomeMacchinario = nomeMacchinario;
        this.dataAcquisto = dataAcquisto;
        this.IDMacchinario = iDMacchinario;
    }

    public String getDataAcquisto() {
        return dataAcquisto;
    }

    public String setDataAcquisto(Macchinario M) {
        return dataAcquisto;
    }


    public String getNomeMacchinario() {
        return nomeMacchinario;
    }


    public void setNomeMacchinario(String nomeMacchinario) {
        this.nomeMacchinario = nomeMacchinario;
    }

    public String getIDMacchinario() {
        return IDMacchinario;
    }

    public void setIDMacchinario(Macchinario M) {
        IDMacchinario = M.getNomeMacchinario() + M.getDataAcquisto().replace("/", "");
    }

    @Override
    public String toString() {
        //DataManutenzione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
        return "Macchinario: (" + nomeMacchinario + ", " + IDMacchinario + ", " + dataAcquisto + ")" + "\n";
    }

}