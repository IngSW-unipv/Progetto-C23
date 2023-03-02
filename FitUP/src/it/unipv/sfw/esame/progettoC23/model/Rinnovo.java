package it.unipv.sfw.esame.progettoC23.model;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;


public class Rinnovo {

    private Calendar primaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
    private Calendar dataRinnovo;
    private String abbonamento;

    public Rinnovo() {
    	
    }

    public void setDataRinnovo(String abbonamento) {

        switch (abbonamento) {
            case "MENSILE":
                primaIscrizione.add(Calendar.MONTH, +1);
                break;
            case "SEMESTRALE":
                primaIscrizione.add(Calendar.MONTH, +6);
                break;
            case "ANNUALE":
                primaIscrizione.add(Calendar.YEAR, +1);
                break;

        }


    }

    public Calendar getDataRinnovo() {

        return primaIscrizione;
    }


}
