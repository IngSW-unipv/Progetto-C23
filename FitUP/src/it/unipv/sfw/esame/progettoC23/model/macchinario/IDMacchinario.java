package it.unipv.sfw.esame.progettoC23.model.macchinario;

public class IDMacchinario {
    private String IDMacchinario;
    private String dataAcquisto;

    public IDMacchinario() {
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
