package it.unipv.sfw.esame.progettoC23.model;


public class IDMacchinario {
    private String IDMacchinario;
    private String dataAcquisto;

    public IDMacchinario() {
    }

    public void setDataAcquisto(Macchinario m) {
    }

    public String getDataAcquisto(Macchinario m) {
        return m.getDataAcquisto();
    }

    public void setIDMacchinario(Macchinario m) {
        IDMacchinario = m.getNomeMacchinario() + m.getDataAcquisto().replace("/", "");
    }

    public String getIDMacchinario() {
        return IDMacchinario;
    }

}
