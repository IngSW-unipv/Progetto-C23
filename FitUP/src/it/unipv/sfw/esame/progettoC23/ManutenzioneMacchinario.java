package it.unipv.sfw.esame.progettoC23;

import it.unipv.sfw.esame.progettoC23.jdbc.bean.GestioneMacchinario;


public class ManutenzioneMacchinario {
    private String dataAcquisto;
    private String dataManutenzione;
    private String IDMacchinario;
    public StatoAttuale stato;

    public ManutenzioneMacchinario(String IDMacchinario, String dataAcquisto) {
        this.IDMacchinario = IDMacchinario;
        this.dataAcquisto = dataAcquisto;
        this.dataManutenzione = null;
    }

    public String getIDMacchinario() {
        return IDMacchinario;
    }


    public String getDataAcquisto() {
        return dataAcquisto;
    }

    public String setDataAcquisto(GestioneMacchinario GM) {
        return dataAcquisto;
    }


    public String getDataManutenzione() {
        return dataManutenzione;
    }

    public StatoAttuale getStato() {
        return stato;
    }

    public String setDataManutenzione(StatoAttuale stato) {
        this.stato = stato;

        switch (stato) {
            case FUNZIONANTE:
                String arr[];
                int mese, anno;
                if (dataManutenzione == null)
                    arr = dataAcquisto.split("/");
                else
                    arr = dataManutenzione.split("/");

                mese = Integer.parseInt(arr[1]);
                anno = Integer.parseInt(arr[2]);
                mese += 06;
                if (mese > 12) {
                    mese -= 12;
                    anno++;
                }

                dataManutenzione = arr[0] + "/" + mese + "/" + anno;
                break;

            case GUASTO:
                System.out.println("Macchinario guasto, chiamare l'assistenza");
                dataManutenzione = "Da definire";
        }
        return dataManutenzione;
    }
}
