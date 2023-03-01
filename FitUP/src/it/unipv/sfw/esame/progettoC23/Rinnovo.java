package it.unipv.sfw.esame.progettoC23;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;


public class Rinnovo {

    private Calendar primaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
    private Calendar dataRinnovo;
    private TipoAbbonamento abbonamento;

    public Rinnovo(String codiceBadge) {
    }

    public void setDataRinnovo(TipoAbbonamento abbonamento) {
        this.abbonamento = abbonamento;

        switch (abbonamento) {
            case MENSILE:
                primaIscrizione.add(Calendar.MONTH, +1);
                break;
            case SEMESTRALE:
                primaIscrizione.add(Calendar.MONTH, +6);
                break;
            case ANNUALE:
                primaIscrizione.add(Calendar.YEAR, +1);
                break;

        }
    }

    public Calendar getDataRinnovo() {
        return primaIscrizione;
    }


}
