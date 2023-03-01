package it.unipv.sfw.esame.progettoC23.model;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;


public class Rinnovo {

    private Calendar PrimaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
    private Calendar DataRinnovo;
    private String Abbonamento;

    public Rinnovo() {
    }

    public void setDataRinnovo(String Abbonamento) {

        switch (Abbonamento) {
            case "MENSILE":
                PrimaIscrizione.add(Calendar.MONTH, +1);
                break;
            case "SEMESTRALE":
                PrimaIscrizione.add(Calendar.MONTH, +6);
                break;
            case "ANNUALE":
                PrimaIscrizione.add(Calendar.YEAR, +1);
                break;

        }


    }

    public Calendar getDataRinnovo() {

        return PrimaIscrizione;
    }


}
